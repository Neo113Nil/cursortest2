package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzci {
    private final androidx.collection.SimpleArrayMap zza;

    zzci(androidx.collection.SimpleArrayMap simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    @javax.annotation.Nullable
    public final java.lang.String zza(@javax.annotation.Nullable android.net.Uri uri, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.String str2, java.lang.String str3) {
        androidx.collection.SimpleArrayMap simpleArrayMap;
        if (uri != null) {
            simpleArrayMap = (androidx.collection.SimpleArrayMap) this.zza.get(uri.toString());
        } else {
            simpleArrayMap = null;
        }
        if (simpleArrayMap == null) {
            return null;
        }
        return (java.lang.String) simpleArrayMap.get("".concat(str3));
    }
}
