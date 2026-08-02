package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public interface zzbmo {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r7.size() == r3.zzd.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void zza(com.google.android.libraries.places.internal.zzblu zzbluVar, long j, java.util.List list, java.util.List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (list.size() == zzbluVar.zzc.size()) {
                z = true;
                com.google.common.base.Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", zzbluVar.zzc.size());
                if (list2 != null) {
                }
                z2 = false;
                com.google.common.base.Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", zzbluVar.zzd.size());
            }
        }
        z = false;
        com.google.common.base.Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", zzbluVar.zzc.size());
        if (list2 != null) {
        }
        z2 = false;
        com.google.common.base.Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", zzbluVar.zzd.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r7.size() == r3.zzd.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void zzb(com.google.android.libraries.places.internal.zzblv zzblvVar, long j, java.util.List list, java.util.List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (list.size() == zzblvVar.zzc.size()) {
                z = true;
                com.google.common.base.Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", zzblvVar.zzc.size());
                if (list2 != null) {
                }
                z2 = false;
                com.google.common.base.Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", zzblvVar.zzd.size());
            }
        }
        z = false;
        com.google.common.base.Preconditions.checkArgument(z, "Incorrect number of required labels provided. Expected: %s", zzblvVar.zzc.size());
        if (list2 != null) {
        }
        z2 = false;
        com.google.common.base.Preconditions.checkArgument(z2, "Incorrect number of optional labels provided. Expected: %s", zzblvVar.zzd.size());
    }
}
