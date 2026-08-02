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

/* loaded from: classes.dex */
public final class zzebg implements zzebh {
    public static /* synthetic */ zzebm zzc(String str, String str2, String str3, zzebi zzebiVar, String str4, WebView webView, String str5, String str6, zzebj zzebjVar) {
        zzfju zza = zzfju.zza("Google", str2);
        zzfjt zzp = zzp("javascript");
        zzfjm zzn = zzn(zzebiVar.toString());
        zzfjt zzfjtVar = zzfjt.NONE;
        if (zzp == zzfjtVar) {
            int i7 = J.f3546b;
            j.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            String valueOf = String.valueOf(zzebiVar);
            int i8 = J.f3546b;
            j.g("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        zzfjt zzp2 = zzp(str4);
        if (zzn != zzfjm.VIDEO || zzp2 != zzfjtVar) {
            zzfjj zzb = zzfjj.zzb(zza, webView, str5, "");
            return new zzebm(zzfjh.zza(zzfji.zza(zzn, zzo(zzebjVar.toString()), zzp, zzp2, true), zzb), zzb);
        }
        String valueOf2 = String.valueOf(str4);
        int i9 = J.f3546b;
        j.g("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    public static /* synthetic */ zzebm zzd(String str, String str2, String str3, String str4, zzebi zzebiVar, WebView webView, String str5, String str6, zzebj zzebjVar) {
        zzfju zza = zzfju.zza(str, str2);
        zzfjt zzp = zzp("javascript");
        zzfjt zzp2 = zzp(str4);
        zzfjm zzn = zzn(zzebiVar.toString());
        zzfjt zzfjtVar = zzfjt.NONE;
        if (zzp == zzfjtVar) {
            int i7 = J.f3546b;
            j.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            String valueOf = String.valueOf(zzebiVar);
            int i8 = J.f3546b;
            j.g("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        if (zzn != zzfjm.VIDEO || zzp2 != zzfjtVar) {
            zzfjj zzc = zzfjj.zzc(zza, webView, str5, "");
            return new zzebm(zzfjh.zza(zzfji.zza(zzn, zzo(zzebjVar.toString()), zzp, zzp2, true), zzc), zzc);
        }
        String valueOf2 = String.valueOf(str4);
        int i9 = J.f3546b;
        j.g("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    private static zzfjm zzn(String str) {
        char c3;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c3 = 0;
            }
            c3 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c3 = 1;
            }
            c3 = 65535;
        } else {
            if (str.equals(RRWebVideoEvent.EVENT_TAG)) {
                c3 = 2;
            }
            c3 = 65535;
        }
        if (c3 == 0) {
            return zzfjm.HTML_DISPLAY;
        }
        if (c3 == 1) {
            return zzfjm.NATIVE_DISPLAY;
        }
        if (c3 != 2) {
            return null;
        }
        return zzfjm.VIDEO;
    }

    private static zzfjp zzo(String str) {
        char c3;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c3 = 0;
            }
            c3 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c3 = 2;
            }
            c3 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c3 = 1;
            }
            c3 = 65535;
        }
        return c3 != 0 ? c3 != 1 ? c3 != 2 ? zzfjp.UNSPECIFIED : zzfjp.ONE_PIXEL : zzfjp.DEFINED_BY_JAVASCRIPT : zzfjp.BEGIN_TO_RENDER;
    }

    private static zzfjt zzp(String str) {
        return SentryStackFrame.JsonKeys.NATIVE.equals(str) ? zzfjt.NATIVE : "javascript".equals(str) ? zzfjt.JAVASCRIPT : zzfjt.NONE;
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
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
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
                    zzfjh.this.zzb(view, zzfjo.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzh(final zzfjs zzfjsVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // java.lang.Runnable
            public final void run() {
                zzfjs.this.zzf(view, zzfjo.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebh
    public final void zzi(final zzfjh zzfjhVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfk)).booleanValue() && zzfjf.zzb()) {
                    zzfjh.this.zzc();
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
                    zzfjh.this.zzd(view);
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
                    zzfjh.this.zze();
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
                zzfjs.this.zzg(zzcesVar);
            }
        });
    }
}
