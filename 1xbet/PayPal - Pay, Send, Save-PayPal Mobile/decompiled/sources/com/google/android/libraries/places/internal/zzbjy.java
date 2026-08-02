package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbjy {
    static final com.google.common.base.Joiner zza = com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
    private static final com.google.android.libraries.places.internal.zzbjy zzb = new com.google.android.libraries.places.internal.zzbjy(com.google.android.libraries.places.internal.zzbjh.zza, false, new com.google.android.libraries.places.internal.zzbjy(new com.google.android.libraries.places.internal.zzbjg(), true, new com.google.android.libraries.places.internal.zzbjy()));
    private final java.util.Map zzc;
    private final byte[] zzd;

    private zzbjy() {
        this.zzc = new java.util.LinkedHashMap(0);
        this.zzd = new byte[0];
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzbjw zzc(java.lang.String str) {
        com.google.android.libraries.places.internal.zzbjx zzbjxVar = (com.google.android.libraries.places.internal.zzbjx) this.zzc.get(str);
        if (zzbjxVar != null) {
            return zzbjxVar.zza;
        }
        return null;
    }

    private zzbjy(com.google.android.libraries.places.internal.zzbjw zzbjwVar, boolean z, com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        java.lang.String zza2 = zzbjwVar.zza();
        com.google.common.base.Preconditions.checkArgument(!zza2.contains(","), "Comma is currently not allowed in message encoding");
        int size = zzbjyVar.zzc.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(zzbjyVar.zzc.containsKey(zzbjwVar.zza()) ? size : size + 1);
        for (com.google.android.libraries.places.internal.zzbjx zzbjxVar : zzbjyVar.zzc.values()) {
            java.lang.String zza3 = zzbjxVar.zza.zza();
            if (!zza3.equals(zza2)) {
                linkedHashMap.put(zza3, new com.google.android.libraries.places.internal.zzbjx(zzbjxVar.zza, zzbjxVar.zzb));
            }
        }
        linkedHashMap.put(zza2, new com.google.android.libraries.places.internal.zzbjx(zzbjwVar, z));
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        this.zzc = unmodifiableMap;
        com.google.common.base.Joiner joiner = zza;
        java.util.HashSet hashSet = new java.util.HashSet(unmodifiableMap.size());
        for (java.util.Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((com.google.android.libraries.places.internal.zzbjx) entry.getValue()).zzb) {
                hashSet.add((java.lang.String) entry.getKey());
            }
        }
        this.zzd = joiner.join(java.util.Collections.unmodifiableSet(hashSet)).getBytes(java.nio.charset.Charset.forName("US-ASCII"));
    }

    final byte[] zzb() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzbjy zza() {
        return zzb;
    }
}
