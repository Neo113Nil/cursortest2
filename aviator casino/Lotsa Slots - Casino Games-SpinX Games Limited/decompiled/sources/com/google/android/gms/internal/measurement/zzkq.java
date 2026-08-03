package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzkq<MessageType extends com.google.android.gms.internal.measurement.zzkr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkq<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zznk {
    private static void zza(java.util.List list, int i) {
        int size = list.size() - i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        java.lang.String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new java.lang.NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    protected static void zzaU(java.lang.Iterable iterable, java.util.List list) {
        byte[] bArr = com.google.android.gms.internal.measurement.zzmo.zzb;
        iterable.getClass();
        if (iterable instanceof com.google.android.gms.internal.measurement.zzmw) {
            java.util.List zza = ((com.google.android.gms.internal.measurement.zzmw) iterable).zza();
            com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
            int size = list.size();
            for (java.lang.Object obj : zza) {
                if (obj == null) {
                    int size2 = zzmwVar.size() - size;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    java.lang.String sb2 = sb.toString();
                    int size3 = zzmwVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new java.lang.NullPointerException(sb2);
                        }
                        zzmwVar.remove(size3);
                    }
                } else if (obj instanceof com.google.android.gms.internal.measurement.zzlg) {
                    zzmwVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    com.google.android.gms.internal.measurement.zzlg.zzh(bArr2, 0, bArr2.length);
                    zzmwVar.zzb();
                } else {
                    zzmwVar.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.measurement.zzns) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size4 = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof com.google.android.gms.internal.measurement.zznu) {
                ((com.google.android.gms.internal.measurement.zznu) list).zze(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            java.lang.Object obj3 = list2.get(i);
            if (obj3 == null) {
                zza(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract com.google.android.gms.internal.measurement.zzkq zzaR();

    public com.google.android.gms.internal.measurement.zzkq zzaS(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzmq {
        throw null;
    }

    public com.google.android.gms.internal.measurement.zzkq zzaT(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlq zzlqVar) throws com.google.android.gms.internal.measurement.zzmq {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznk zzaV(byte[] bArr, com.google.android.gms.internal.measurement.zzlq zzlqVar) throws com.google.android.gms.internal.measurement.zzmq {
        return zzaT(bArr, 0, bArr.length, zzlqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznk zzaW(byte[] bArr) throws com.google.android.gms.internal.measurement.zzmq {
        return zzaS(bArr, 0, bArr.length);
    }
}
