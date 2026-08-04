package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzebg implements zzebh {
    public static /* synthetic */ zzebm zzc(String str, String str2, String str3, zzebi zzebiVar, String str4, WebView webView, String str5, String str6, zzebj zzebjVar) {
        zzfju zzfjuVarZza = zzfju.zza("Google", str2);
        zzfjt zzfjtVarZzp = zzp("javascript");
        zzfjm zzfjmVarZzn = zzn(zzebiVar.toString());
        zzfjt zzfjtVar = zzfjt.NONE;
        if (zzfjtVarZzp == zzfjtVar) {
            int i7 = J.f3546b;
            j.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfjmVarZzn == null) {
            String strValueOf = String.valueOf(zzebiVar);
            int i8 = J.f3546b;
            j.g("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfjt zzfjtVarZzp2 = zzp(str4);
        if (zzfjmVarZzn != zzfjm.VIDEO || zzfjtVarZzp2 != zzfjtVar) {
            zzfjj zzfjjVarZzb = zzfjj.zzb(zzfjuVarZza, webView, str5, "");
            return new zzebm(zzfjh.zza(zzfji.zza(zzfjmVarZzn, zzo(zzebjVar.toString()), zzfjtVarZzp, zzfjtVarZzp2, true), zzfjjVarZzb), zzfjjVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i9 = J.f3546b;
        j.g("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzebm zzd(String str, String str2, String str3, String str4, zzebi zzebiVar, WebView webView, String str5, String str6, zzebj zzebjVar) {
        zzfju zzfjuVarZza = zzfju.zza(str, str2);
        zzfjt zzfjtVarZzp = zzp("javascript");
        zzfjt zzfjtVarZzp2 = zzp(str4);
        zzfjm zzfjmVarZzn = zzn(zzebiVar.toString());
        zzfjt zzfjtVar = zzfjt.NONE;
        if (zzfjtVarZzp == zzfjtVar) {
            int i7 = J.f3546b;
            j.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfjmVarZzn == null) {
            String strValueOf = String.valueOf(zzebiVar);
            int i8 = J.f3546b;
            j.g("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfjmVarZzn != zzfjm.VIDEO || zzfjtVarZzp2 != zzfjtVar) {
            zzfjj zzfjjVarZzc = zzfjj.zzc(zzfjuVarZza, webView, str5, "");
            return new zzebm(zzfjh.zza(zzfji.zza(zzfjmVarZzn, zzo(zzebjVar.toString()), zzfjtVarZzp, zzfjtVarZzp2, true), zzfjjVarZzc), zzfjjVarZzc);
        }
        String strValueOf2 = String.valueOf(str4);
        int i9 = J.f3546b;
        j.g("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfjm zzn(String str) {
        byte b7;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (str.equals(RRWebVideoEvent.EVENT_TAG)) {
                b7 = 2;
            } else {
                b7 = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            return zzfjm.HTML_DISPLAY;
        }
        if (b7 == 1) {
            return zzfjm.NATIVE_DISPLAY;
        }
        if (b7 != 2) {
            return null;
        }
        return zzfjm.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfjp zzo(String str) {
        byte b7;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b7 = 2;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (str.equals("beginToRender")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            return zzfjp.BEGIN_TO_RENDER;
        }
        if (b7 != 1) {
            return b7 != 2 ? zzfjp.UNSPECIFIED : zzfjp.ONE_PIXEL;
        }
        return zzfjp.DEFINED_BY_JAVASCRIPT;
    }

    private static zzfjt zzp(String str) {
        if (SentryStackFrame.JsonKeys.NATIVE.equals(str)) {
            return zzfjt.NATIVE;
        }
        return "javascript".equals(str) ? zzfjt.JAVASCRIPT : zzfjt.NONE;
    }

    private static final Object zzq(zzebf zzebfVar) {
        try {
            return zzebfVar.zza();
        } catch (RuntimeException e7) {
            o.f1952C.f1961g.zzv(e7, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e7) {
            o.f1952C.f1961g.zzv(e7, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final zzebm zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzebj zzebjVar, final zzebi zzebiVar, final String str5) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() || !zzfjf.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzebm) zzq(new zzebf(str7, str, str6, zzebiVar, str4, webView, str5, str8, zzebjVar) { // from class: com.google.android.gms.internal.ads.zzeav
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzebi zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzebj zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzebiVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzebjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzebf
            public final Object zza() {
                return zzebg.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final zzebm zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzebj zzebjVar, final zzebi zzebiVar, final String str6) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() || !zzfjf.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzebm) zzq(new zzebf(str5, str, str8, str4, zzebiVar, webView, str6, str7, zzebjVar) { // from class: com.google.android.gms.internal.ads.zzeay
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzebi zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzebj zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzebiVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzebjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzebf
            public final Object zza() {
                return zzebg.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final zzfjs zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z4) {
        final boolean z7 = true;
        return (zzfjs) zzq(new zzebf(webView, z7) { // from class: com.google.android.gms.internal.ads.zzebd
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzebf
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                return zzfjs.zzb(zzfju.zza("Google", versionInfoParcel2.f10835b + "." + versionInfoParcel2.f10836c), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final String zzf(Context context) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue()) {
            return (String) zzq(new zzebf() { // from class: com.google.android.gms.internal.ads.zzebb
                @Override // com.google.android.gms.internal.ads.zzebf
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzg(final zzfjh zzfjhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeau
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() && zzfjf.zzb()) {
                    zzfjhVar.zzb(view, zzfjo.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzh(final zzfjs zzfjsVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // java.lang.Runnable
            public final void run() {
                zzfjsVar.zzf(view, zzfjo.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzi(final zzfjh zzfjhVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() && zzfjf.zzb()) {
                    zzfjhVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzj(final zzfjh zzfjhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaw
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() && zzfjf.zzb()) {
                    zzfjhVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzk(final zzfjh zzfjhVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() && zzfjf.zzb()) {
            Objects.requireNonNull(zzfjhVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeax
                @Override // java.lang.Runnable
                public final void run() {
                    zzfjhVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final boolean zzl(final Context context) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzebf() { // from class: com.google.android.gms.internal.ads.zzeaz
                @Override // com.google.android.gms.internal.ads.zzebf
                public final Object zza() {
                    if (zzfjf.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfjf.zza(context);
                    return Boolean.valueOf(zzfjf.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i7 = J.f3546b;
        j.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzm(final zzfjs zzfjsVar, final zzces zzcesVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // java.lang.Runnable
            public final void run() {
                zzfjsVar.zzg(zzcesVar);
            }
        });
    }
}
