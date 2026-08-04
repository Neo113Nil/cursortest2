package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzfjj {
    private final zzfju zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfjk zzg;

    private zzfjj(zzfju zzfjuVar, WebView webView, String str, List list, String str2, String str3, zzfjk zzfjkVar) {
        this.zza = zzfjuVar;
        this.zzb = webView;
        this.zzg = zzfjkVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfjj zzb(zzfju zzfjuVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzflc.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfjj(zzfjuVar, webView, null, null, str, str2, zzfjk.HTML);
    }

    public static zzfjj zzc(zzfju zzfjuVar, WebView webView, String str, String str2) {
        zzflc.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfjj(zzfjuVar, webView, null, null, str, "", zzfjk.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfjk zzd() {
        return this.zzg;
    }

    public final zzfju zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
