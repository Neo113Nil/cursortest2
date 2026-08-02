package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzlc {
    private final com.google.gson.Gson zza = new com.google.gson.GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public final java.lang.Object zza(java.lang.String str, java.lang.Class cls) throws com.google.android.libraries.places.internal.zzgk {
        try {
            return this.zza.fromJson(str, cls);
        } catch (com.google.gson.JsonSyntaxException unused) {
            java.lang.String name2 = cls.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 55);
            sb.append("Could not convert JSON string to ");
            sb.append(name2);
            sb.append(" due to syntax errors.");
            throw new com.google.android.libraries.places.internal.zzgk(sb.toString());
        }
    }
}
