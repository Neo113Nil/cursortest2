package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgbk extends zzgay {
    private zzgvc<Integer> zza;
    private zzgvc<Integer> zzb;
    private zzgba zzc;
    private HttpURLConnection zzd;

    zzgbk() {
        this(zzgbj.zza, zzgbb.zza, null);
    }

    zzgbk(zzgvc<Integer> zzgvcVar, zzgvc<Integer> zzgvcVar2, zzgba zzgbaVar) {
        this.zza = zzgvcVar;
        this.zzb = zzgvcVar2;
        this.zzc = zzgbaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzgaz.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i = zzgat.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbc
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzgba() { // from class: com.google.android.gms.internal.ads.zzgbd
            @Override // com.google.android.gms.internal.ads.zzgba
            public final /* synthetic */ URLConnection zza() {
                URLConnection zzy;
                zzy = zzgbk.zzy(url);
                return zzy;
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbe
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbf
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzgba() { // from class: com.google.android.gms.internal.ads.zzgbg
            @Override // com.google.android.gms.internal.ads.zzgba
            public final /* synthetic */ URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzgba zzgbaVar, final int i, final int i2) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbh
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbi
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzgbaVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzgaz.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzgba zzgbaVar = this.zzc;
        zzgbaVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzgbaVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
