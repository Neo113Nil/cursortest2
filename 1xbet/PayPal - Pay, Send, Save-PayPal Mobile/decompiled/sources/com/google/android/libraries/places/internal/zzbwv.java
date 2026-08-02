package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwv {
    private java.util.List zza;
    private int zzb = 0;
    private final boolean zzc;

    zzbwv(java.util.List list, boolean z) {
        this.zzc = z;
        zzg(list);
    }

    private static final java.util.List zzj(java.util.List list, java.util.List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        for (int i = 0; i < java.lang.Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((com.google.android.libraries.places.internal.zzbwu) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((com.google.android.libraries.places.internal.zzbwu) list2.get(i));
            }
        }
        return arrayList;
    }

    public final boolean zza() {
        return this.zzb < this.zza.size();
    }

    public final boolean zzb() {
        if (!zza()) {
            return false;
        }
        this.zzb++;
        return zza();
    }

    public final java.net.SocketAddress zzd() {
        if (zza()) {
            return ((com.google.android.libraries.places.internal.zzbwu) this.zza.get(this.zzb)).zzc();
        }
        throw new java.lang.IllegalStateException("Index is past the end of the address group list");
    }

    public final com.google.android.libraries.places.internal.zzbio zze() {
        if (zza()) {
            return ((com.google.android.libraries.places.internal.zzbwu) this.zza.get(this.zzb)).zzb();
        }
        throw new java.lang.IllegalStateException("Index is off the end of the address group list");
    }

    public final java.util.List zzf() {
        if (zza()) {
            return java.util.Collections.singletonList(((com.google.android.libraries.places.internal.zzbwu) this.zza.get(this.zzb)).zza());
        }
        throw new java.lang.IllegalStateException("Index is past the end of the address group list");
    }

    public final void zzg(java.util.List list) {
        java.util.List list2;
        com.google.common.base.Preconditions.checkNotNull(list, "newGroups");
        if (this.zzc) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                com.google.android.libraries.places.internal.zzbka zzbkaVar = (com.google.android.libraries.places.internal.zzbka) list.get(i);
                for (int i2 = 0; i2 < zzbkaVar.zza().size(); i2++) {
                    java.net.SocketAddress socketAddress = (java.net.SocketAddress) zzbkaVar.zza().get(i2);
                    if ((socketAddress instanceof java.net.InetSocketAddress) && (((java.net.InetSocketAddress) socketAddress).getAddress() instanceof java.net.Inet4Address)) {
                        if (bool == null) {
                            bool = java.lang.Boolean.FALSE;
                        }
                        arrayList.add(new com.google.android.libraries.places.internal.zzbwu(zzbkaVar.zzb(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = java.lang.Boolean.TRUE;
                        }
                        arrayList2.add(new com.google.android.libraries.places.internal.zzbwu(zzbkaVar.zzb(), socketAddress));
                    }
                }
            }
            list2 = (bool == null || !bool.booleanValue()) ? zzj(arrayList, arrayList2) : zzj(arrayList2, arrayList);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.google.android.libraries.places.internal.zzbka zzbkaVar2 = (com.google.android.libraries.places.internal.zzbka) list.get(i3);
                for (int i4 = 0; i4 < zzbkaVar2.zza().size(); i4++) {
                    arrayList3.add(new com.google.android.libraries.places.internal.zzbwu(zzbkaVar2.zzb(), (java.net.SocketAddress) zzbkaVar2.zza().get(i4)));
                }
            }
            list2 = arrayList3;
        }
        this.zza = list2;
        this.zzb = 0;
    }

    public final boolean zzh(java.net.SocketAddress socketAddress) {
        com.google.common.base.Preconditions.checkNotNull(socketAddress, "needle");
        for (int i = 0; i < this.zza.size(); i++) {
            if (((com.google.android.libraries.places.internal.zzbwu) this.zza.get(i)).zzc().equals(socketAddress)) {
                this.zzb = i;
                return true;
            }
        }
        return false;
    }

    public final int zzi() {
        return this.zza.size();
    }

    public final void zzc() {
        this.zzb = 0;
    }
}
