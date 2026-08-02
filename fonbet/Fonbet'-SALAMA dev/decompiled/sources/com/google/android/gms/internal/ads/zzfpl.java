package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class zzfpl extends zzfoz {
    private zzftz<Integer> zza;
    private zzftz<Integer> zzb;
    private zzfpk zzc;
    private HttpURLConnection zzd;

    public zzfpl(zzftz<Integer> zzftzVar, zzftz<Integer> zzftzVar2, zzfpk zzfpkVar) {
        this.zza = zzftzVar;
        this.zzb = zzftzVar2;
        this.zzc = zzfpkVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfpa.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() {
        zzfpa.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfpk zzfpkVar = this.zzc;
        zzfpkVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfpkVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfpk zzfpkVar, final int i7, final int i8) {
        this.zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpd
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        };
        this.zzb = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpe
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i8);
                return valueOf;
            }
        };
        this.zzc = zzfpkVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i7, final int i8) {
        this.zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpf
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        };
        this.zzb = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpg
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i8);
                return valueOf;
            }
        };
        this.zzc = new zzfpk() { // from class: com.google.android.gms.internal.ads.zzfph
            @Override // com.google.android.gms.internal.ads.zzfpk
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i7) {
        this.zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpi
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        };
        this.zzc = new zzfpk() { // from class: com.google.android.gms.internal.ads.zzfpj
            @Override // com.google.android.gms.internal.ads.zzfpk
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfpl() {
        this(new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpb
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return zzfpl.zzf();
            }
        }, new zzftz() { // from class: com.google.android.gms.internal.ads.zzfpc
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return zzfpl.zzg();
            }
        }, null);
    }
}
