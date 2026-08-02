package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbi extends com.google.android.play.core.splitinstall.internal.zzbj {
    zzbi(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Class cls) {
        super(obj, field, java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0).getClass());
    }

    private final java.lang.Class zzf() {
        return zzd().getType().getComponentType();
    }

    public final void zza(java.util.Collection collection) {
        java.lang.Object[] objArr = (java.lang.Object[]) zzc();
        int length = objArr == null ? 0 : objArr.length;
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) zzf(), collection.size() + length);
        if (objArr != null) {
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        zze(objArr2);
    }

    public final void zzb(java.util.Collection collection) {
        java.lang.Object[] objArr = (java.lang.Object[]) zzc();
        int i = 0;
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) zzf(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            java.lang.System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        zze(objArr2);
    }
}
