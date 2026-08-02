package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzasp {
    static /* synthetic */ void zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, java.lang.Class cls, boolean z) {
        java.lang.Class cls2;
        boolean z2;
        try {
            cls2 = ((com.google.android.libraries.places.internal.zzbmk) (z ? zzbmlVar.zzf() : zzbmlVar.zzg())).zzc();
            z2 = false;
        } catch (java.lang.ClassCastException unused) {
            cls2 = java.lang.Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        java.lang.String str = true != z ? "response" : "request";
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzh;
        java.lang.String zzb = zzbmlVar.zzb();
        java.lang.String name2 = cls2.getName();
        java.lang.String str2 = true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
        java.lang.String obj = cls.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 52 + java.lang.String.valueOf(zzb).length() + 2 + java.lang.String.valueOf(name2).length() + str2.length() + 24 + obj.length());
        sb.append("AsyncClientInterceptor: The ");
        sb.append(str);
        sb.append(" message type of method ");
        sb.append(zzb);
        sb.append(" (");
        sb.append(name2);
        sb.append(str2);
        sb.append(") must be a subclass of ");
        sb.append(obj);
        throw new com.google.android.libraries.places.internal.zzbnq(zzbnpVar.zze(sb.toString()), null);
    }

    public static com.google.android.libraries.places.internal.zzbiy zza(final com.google.android.libraries.places.internal.zzcez zzcezVar) {
        return new com.google.android.libraries.places.internal.zzaso(new com.google.android.libraries.places.internal.zzcez() { // from class: com.google.android.libraries.places.internal.zzasn
            @Override // com.google.android.libraries.places.internal.zzcez
            public final /* synthetic */ java.lang.Object zzb() {
                return com.google.common.collect.ImmutableList.of(((com.google.android.libraries.places.internal.zzff) com.google.android.libraries.places.internal.zzcez.this).zzb());
            }
        }, 2, com.google.android.libraries.places.internal.zzbex.class, com.google.android.libraries.places.internal.zzbex.class);
    }
}
