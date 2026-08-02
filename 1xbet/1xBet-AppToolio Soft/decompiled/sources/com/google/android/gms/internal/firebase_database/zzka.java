package com.google.android.gms.internal.firebase_database;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
final class zzka {
    private zzjr zzty;
    private zzjm zzua;
    private DataInputStream zztx = null;
    private zzjw zztb = null;
    private byte[] zztz = new byte[112];
    private volatile boolean zzub = false;

    zzka(zzjr zzjrVar) {
        this.zzty = null;
        this.zzty = zzjrVar;
    }

    private final int read(byte[] bArr, int i, int i2) throws IOException {
        this.zztx.readFully(bArr, i, i2);
        return i2;
    }

    private final void zzc(zzjx zzjxVar) {
        this.zzub = true;
        this.zzty.zzb(zzjxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        if (r3 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
    
        if (r5.length > 125) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fb, code lost:
    
        r14.zzty.zzd(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0109, code lost:
    
        throw new com.google.android.gms.internal.firebase_database.zzjx("PING frame too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0111, code lost:
    
        throw new com.google.android.gms.internal.firebase_database.zzjx("PING must not fragment across frames");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void run() {
        int read;
        boolean z;
        this.zztb = this.zzty.zzgj();
        while (!this.zzub) {
            try {
                read = read(this.zztz, 0, 1) + 0;
                z = (this.zztz[0] & 128) != 0;
            } catch (zzjx e) {
                zzc(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                zzc(new zzjx("IO Error", e2));
            }
            if ((this.zztz[0] & 112) != 0) {
                throw new zzjx("Invalid frame received");
            }
            byte b = (byte) (this.zztz[0] & 15);
            int read2 = read + read(this.zztz, read, 1);
            byte b2 = this.zztz[1];
            long j = 0;
            if (b2 < 126) {
                j = b2;
            } else if (b2 == 126) {
                read(this.zztz, read2, 2);
                j = ((this.zztz[2] & 255) << 8) | (this.zztz[3] & 255);
            } else if (b2 == Byte.MAX_VALUE) {
                int read3 = read2 + read(this.zztz, read2, 8);
                byte[] bArr = this.zztz;
                int i = read3 - 8;
                j = (bArr[i] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + (bArr[i + 7] & 255);
            }
            int i2 = (int) j;
            byte[] bArr2 = new byte[i2];
            read(bArr2, 0, i2);
            if (b == 8) {
                this.zzty.zzgk();
            } else if (b == 10) {
                continue;
            } else {
                if (b != 1 && b != 2 && b != 9 && b != 0) {
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unsupported opcode: ");
                    sb.append((int) b);
                    throw new zzjx(sb.toString());
                }
                if (this.zzua != null && b != 0) {
                    throw new zzjx("Failed to continue outstanding frame");
                }
                if (this.zzua == null && b == 0) {
                    throw new zzjx("Received continuing frame, but there's nothing to continue");
                }
                if (this.zzua == null) {
                    this.zzua = b == 2 ? new zzjl() : new zzjn();
                }
                if (!this.zzua.zzb(bArr2)) {
                    throw new zzjx("Failed to decode frame");
                }
                if (z) {
                    zzjz zzgh = this.zzua.zzgh();
                    this.zzua = null;
                    if (zzgh == null) {
                        throw new zzjx("Failed to decode whole message");
                    }
                    this.zztb.zza(zzgh);
                } else {
                    continue;
                }
            }
        }
    }

    final void zza(DataInputStream dataInputStream) {
        this.zztx = dataInputStream;
    }

    final void zzgp() {
        this.zzub = true;
    }
}
