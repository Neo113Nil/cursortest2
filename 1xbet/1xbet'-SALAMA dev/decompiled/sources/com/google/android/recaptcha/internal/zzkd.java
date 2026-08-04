package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzkd {
    static final zzkd zza = new zzkd(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzkd() {
        this.zzd = new HashMap();
    }

    public final zzkq zza(zzlx zzlxVar, int i7) {
        return (zzkq) this.zzd.get(new zzkc(zzlxVar, i7));
    }

    public zzkd(boolean z4) {
        this.zzd = Collections.emptyMap();
    }
}
