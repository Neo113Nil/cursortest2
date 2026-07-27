package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfvo {
    private final zzfwa zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfvp zzg;

    private zzfvo(zzfwa zzfwaVar, WebView webView, String str, List list, String str2, String str3, zzfvp zzfvpVar) {
        this.zza = zzfwaVar;
        this.zzb = webView;
        this.zzg = zzfvpVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfvo zza(zzfwa zzfwaVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfxk.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfvo(zzfwaVar, webView, null, null, str, str2, zzfvp.HTML);
    }

    public static zzfvo zzb(zzfwa zzfwaVar, WebView webView, String str, String str2) {
        zzfxk.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfvo(zzfwaVar, webView, null, null, str, "", zzfvp.JAVASCRIPT);
    }

    public final zzfwa zzc() {
        return this.zza;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return Collections.unmodifiableMap(this.zzd);
    }

    public final WebView zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zze;
    }

    public final zzfvp zzi() {
        return this.zzg;
    }
}
