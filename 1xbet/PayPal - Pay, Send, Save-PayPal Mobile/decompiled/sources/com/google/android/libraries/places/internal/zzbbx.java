package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbbx<MessageType extends com.google.android.libraries.places.internal.zzbby<MessageType, BuilderType>, BuilderType extends com.google.android.libraries.places.internal.zzbbx<MessageType, BuilderType>> implements com.google.android.libraries.places.internal.zzbew {
    private static void zza(java.util.List list, int i) {
        int size = list.size() - i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        java.lang.String obj = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new java.lang.NullPointerException(obj);
            }
            list.remove(size2);
        }
    }

    protected static void zzv(java.lang.Iterable iterable, java.util.List list) {
        if (!(iterable instanceof com.google.android.libraries.places.internal.zzbej)) {
            if (iterable instanceof com.google.android.libraries.places.internal.zzbfg) {
                list.addAll((java.util.Collection) iterable);
                return;
            }
            if (iterable instanceof java.util.Collection) {
                int size = ((java.util.Collection) iterable).size();
                if (list instanceof java.util.ArrayList) {
                    ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof com.google.android.libraries.places.internal.zzbfi) {
                    ((com.google.android.libraries.places.internal.zzbfi) list).zze(list.size() + size);
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
                for (java.lang.Object obj : iterable) {
                    if (obj == null) {
                        zza(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            java.util.List list2 = (java.util.List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                java.lang.Object obj2 = list2.get(i);
                if (obj2 == null) {
                    zza(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List zza = ((com.google.android.libraries.places.internal.zzbej) iterable).zza();
        com.google.android.libraries.places.internal.zzbej zzbejVar = (com.google.android.libraries.places.internal.zzbej) list;
        int size4 = list.size();
        for (java.lang.Object obj3 : zza) {
            if (obj3 == null) {
                int size5 = zzbejVar.size() - size4;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size5).length() + 26);
                sb.append("Element at index ");
                sb.append(size5);
                sb.append(" is null.");
                java.lang.String obj4 = sb.toString();
                int size6 = zzbejVar.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new java.lang.NullPointerException(obj4);
                    }
                    zzbejVar.remove(size6);
                }
            } else if (obj3 instanceof com.google.android.libraries.places.internal.zzbcl) {
                zzbejVar.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                try {
                    com.google.android.libraries.places.internal.zzbcl.zzk(bArr, 0, bArr.length, false);
                    zzbejVar.zzb();
                } catch (com.google.android.libraries.places.internal.zzbed e) {
                    throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            } else {
                zzbejVar.add((java.lang.String) obj3);
            }
        }
    }

    @Override // 
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.libraries.places.internal.zzbbx clone();

    protected abstract com.google.android.libraries.places.internal.zzbbx zzu(com.google.android.libraries.places.internal.zzbby zzbbyVar);

    @Override // com.google.android.libraries.places.internal.zzbew
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbew zzw(com.google.android.libraries.places.internal.zzbex zzbexVar) {
        if (zzbN().getClass().isInstance(zzbexVar)) {
            return zzu((com.google.android.libraries.places.internal.zzbby) zzbexVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.libraries.places.internal.zzbew
    public /* bridge */ /* synthetic */ com.google.android.libraries.places.internal.zzbew zzx(com.google.android.libraries.places.internal.zzbco zzbcoVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        throw null;
    }
}
