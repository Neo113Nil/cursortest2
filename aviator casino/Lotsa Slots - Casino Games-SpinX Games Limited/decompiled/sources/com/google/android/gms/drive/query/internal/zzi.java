package com.google.android.gms.drive.query.internal;

/* loaded from: classes3.dex */
final class zzi {
    static com.google.android.gms.drive.metadata.MetadataField<?> zza(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        java.util.Set<com.google.android.gms.drive.metadata.MetadataField<?>> zzbg = metadataBundle.zzbg();
        if (zzbg.size() == 1) {
            return zzbg.iterator().next();
        }
        throw new java.lang.IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
