package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzip extends com.google.android.gms.internal.ads.zzhh {
    private final byte[] zza;
    private final java.net.DatagramPacket zzb;
    private android.net.Uri zzc;
    private java.net.DatagramSocket zzd;
    private java.net.MulticastSocket zze;
    private java.net.InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzip() {
        throw null;
    }

    public zzip(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.zza = bArr;
        this.zzb = new java.net.DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzio {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                java.net.DatagramSocket datagramSocket = this.zzd;
                datagramSocket.getClass();
                java.net.DatagramSocket datagramSocket2 = datagramSocket;
                java.net.DatagramPacket datagramPacket = this.zzb;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.zzh = length;
                zzh(length);
            } catch (java.net.SocketTimeoutException e) {
                throw new com.google.android.gms.internal.ads.zzio(e, 2002);
            } catch (java.io.IOException e2) {
                throw new com.google.android.gms.internal.ads.zzio(e2, 2001);
            }
        }
        int length2 = this.zzb.getLength();
        int i3 = this.zzh;
        int min = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.zza, length2 - i3, bArr, i, min);
        this.zzh -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzio {
        android.net.Uri uri = zzhtVar.zza;
        this.zzc = uri;
        java.lang.String host = uri.getHost();
        host.getClass();
        int port = this.zzc.getPort();
        zzf(zzhtVar);
        try {
            this.zzf = java.net.InetAddress.getByName(host);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzg(zzhtVar);
            return -1L;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzio(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new com.google.android.gms.internal.ads.zzio(e2, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        this.zzc = null;
        java.net.MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                java.net.InetAddress inetAddress = this.zzf;
                inetAddress.getClass();
                java.net.InetAddress inetAddress2 = inetAddress;
                multicastSocket.leaveGroup(inetAddress);
            } catch (java.io.IOException unused) {
            }
            this.zze = null;
        }
        java.net.DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzi();
        }
    }
}
