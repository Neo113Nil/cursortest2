package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbka {
    public static final com.google.android.libraries.places.internal.zzbin zza = com.google.android.libraries.places.internal.zzbin.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final com.google.android.libraries.places.internal.zzbin zzb = com.google.android.libraries.places.internal.zzbin.zza("io.grpc.EquivalentAddressGroup.LOCALITY");
    private final java.util.List zzc;
    private final com.google.android.libraries.places.internal.zzbio zzd;
    private final int zze;

    public zzbka(java.util.List list, com.google.android.libraries.places.internal.zzbio zzbioVar) {
        com.google.common.base.Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.zzc = unmodifiableList;
        this.zzd = (com.google.android.libraries.places.internal.zzbio) com.google.common.base.Preconditions.checkNotNull(zzbioVar, "attrs");
        this.zze = unmodifiableList.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbka)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbka zzbkaVar = (com.google.android.libraries.places.internal.zzbka) obj;
        java.util.List list = this.zzc;
        int size = list.size();
        java.util.List list2 = zzbkaVar.zzc;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((java.net.SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.zzd.equals(zzbkaVar.zzd);
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzbio zzbioVar = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzbioVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 2 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("[");
        sb.append(valueOf);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public final com.google.android.libraries.places.internal.zzbio zzb() {
        return this.zzd;
    }

    public final java.util.List zza() {
        return this.zzc;
    }

    public final int hashCode() {
        return this.zze;
    }
}
