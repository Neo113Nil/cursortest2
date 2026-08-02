package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzccs {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final java.lang.String zze;

    zzccs(java.lang.String str) {
        this.zze = str;
    }

    public static com.google.android.libraries.places.internal.zzccs zza(java.lang.String str) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzccs zzccsVar = HTTP_1_0;
        if (str.equals(zzccsVar.zze)) {
            return zzccsVar;
        }
        com.google.android.libraries.places.internal.zzccs zzccsVar2 = HTTP_1_1;
        if (str.equals(zzccsVar2.zze)) {
            return zzccsVar2;
        }
        com.google.android.libraries.places.internal.zzccs zzccsVar3 = HTTP_2;
        if (str.equals(zzccsVar3.zze)) {
            return zzccsVar3;
        }
        com.google.android.libraries.places.internal.zzccs zzccsVar4 = SPDY_3;
        if (str.equals(zzccsVar4.zze)) {
            return zzccsVar4;
        }
        throw new java.io.IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.zze;
    }
}
