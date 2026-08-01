package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzemf implements zzemg {
    static /* synthetic */ zzeml zzl(String str, String str2, String str3, zzemh zzemhVar, String str4, WebView webView, String str5, String str6, zzemi zzemiVar) {
        zzfwa zza = zzfwa.zza("Google", str2);
        zzfvz zzn = zzn("javascript");
        zzfvr zzp = zzp(zzemhVar.toString());
        zzfvz zzfvzVar = zzfvz.NONE;
        if (zzn == zzfvzVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzemhVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        zzfvz zzn2 = zzn(str4);
        if (zzp != zzfvr.VIDEO || zzn2 != zzfvzVar) {
            zzfvo zza2 = zzfvo.zza(zza, webView, str5, "");
            return new zzeml(zzfvm.zze(zzfvn.zza(zzp, zzo(zzemiVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    static /* synthetic */ zzeml zzm(String str, String str2, String str3, String str4, zzemh zzemhVar, WebView webView, String str5, String str6, zzemi zzemiVar) {
        zzfwa zza = zzfwa.zza(str, str2);
        zzfvz zzn = zzn("javascript");
        zzfvz zzn2 = zzn(str4);
        zzfvr zzp = zzp(zzemhVar.toString());
        zzfvz zzfvzVar = zzfvz.NONE;
        if (zzn == zzfvzVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzemhVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        if (zzp != zzfvr.VIDEO || zzn2 != zzfvzVar) {
            zzfvo zzb = zzfvo.zzb(zza, webView, str5, "");
            return new zzeml(zzfvm.zze(zzfvn.zza(zzp, zzo(zzemiVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    private static zzfvz zzn(String str) {
        return "native".equals(str) ? zzfvz.NATIVE : "javascript".equals(str) ? zzfvz.JAVASCRIPT : zzfvz.NONE;
    }

    private static zzfvu zzo(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfvu.UNSPECIFIED : zzfvu.ONE_PIXEL : zzfvu.DEFINED_BY_JAVASCRIPT : zzfvu.BEGIN_TO_RENDER;
    }

    private static zzfvr zzp(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzfvr.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzfvr.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzfvr.VIDEO;
    }

    private static final Object zzq(zzeme zzemeVar) {
        try {
            return zzemeVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeme() { // from class: com.google.android.gms.internal.ads.zzemd
                @Override // com.google.android.gms.internal.ads.zzeme
                public final /* synthetic */ Object zza() {
                    if (zzfvk.zzb()) {
                        return true;
                    }
                    zzfvk.zza(context);
                    return Boolean.valueOf(zzfvk.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue()) {
            return (String) zzq(zzelu.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzeml zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzemi zzemiVar, final zzemh zzemhVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() || !zzfvk.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzeml) zzq(new zzeme(str7, str, str6, zzemhVar, str4, webView, str5, str8, zzemiVar) { // from class: com.google.android.gms.internal.ads.zzelv
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzemh zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzemi zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzemhVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzemiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeme
            public final /* synthetic */ Object zza() {
                return zzemf.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzeml zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzemi zzemiVar, final zzemh zzemhVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() || !zzfvk.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzeml) zzq(new zzeme(str5, str, str8, str4, zzemhVar, webView, str6, str7, zzemiVar) { // from class: com.google.android.gms.internal.ads.zzelw
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzemh zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzemi zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzemhVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzemiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeme
            public final /* synthetic */ Object zza() {
                return zzemf.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zze(final zzfvm zzfvmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() && zzfvk.zzb()) {
            Objects.requireNonNull(zzfvmVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfvm.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zzf(final zzfvm zzfvmVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() && zzfvk.zzb()) {
                    zzfvm.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zzg(final zzfvm zzfvmVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() && zzfvk.zzb()) {
                    zzfvm.this.zzd(view, zzfvt.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zzh(final zzfvm zzfvmVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgq)).booleanValue() && zzfvk.zzb()) {
                    zzfvm.this.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzfvy zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfvy) zzq(new zzeme(webView, z2) { // from class: com.google.android.gms.internal.ads.zzema
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeme
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzfvy.zza(zzfwa.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zzj(final zzfvy zzfvyVar, final zzfvx zzfvxVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvy.this.zzb(zzfvxVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zzk(final zzfvy zzfvyVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvy.this.zzd(view, zzfvt.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
