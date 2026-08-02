package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.l;

/* loaded from: classes.dex */
public final class zzci {
    private final l zza;

    public zzci(l lVar) {
        this.zza = lVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        l lVar = (l) this.zza.getOrDefault(uri.toString(), null);
        if (lVar == null) {
            return null;
        }
        return (String) lVar.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
