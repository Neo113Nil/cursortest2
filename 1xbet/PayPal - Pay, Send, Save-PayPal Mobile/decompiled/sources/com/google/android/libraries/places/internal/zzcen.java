package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcen {
    final java.util.Collection zza;
    final int zzb;

    public zzcen(com.google.android.libraries.places.internal.zzbka zzbkaVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbkaVar, "eag");
        if (zzbkaVar.zza().size() < 10) {
            this.zza = zzbkaVar.zza();
        } else {
            this.zza = new java.util.HashSet(zzbkaVar.zza());
        }
        java.util.Iterator it = zzbkaVar.zza().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((java.net.SocketAddress) it.next()).hashCode();
        }
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzcen)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzcen zzcenVar = (com.google.android.libraries.places.internal.zzcen) obj;
        if (zzcenVar.zzb == this.zzb) {
            java.util.Collection collection = zzcenVar.zza;
            int size = collection.size();
            java.util.Collection<?> collection2 = this.zza;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    public final int hashCode() {
        return this.zzb;
    }
}
