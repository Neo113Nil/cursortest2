package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzccq implements java.lang.reflect.InvocationHandler {
    private final java.util.List zza;
    private boolean zzb;
    private java.lang.String zzc;

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        java.lang.String name2 = method.getName();
        java.lang.Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = com.google.android.libraries.places.internal.zzccu.zza;
        }
        if (name2.equals("supports") && java.lang.Boolean.TYPE == returnType) {
            return java.lang.Boolean.TRUE;
        }
        if (name2.equals("unsupported") && java.lang.Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        if (name2.equals("protocols") && objArr.length == 0) {
            return this.zza;
        }
        if ((name2.equals("selectProtocol") || name2.equals("select")) && returnType == java.lang.String.class && objArr.length == 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.util.List) {
                java.util.List list = (java.util.List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.zza.contains(list.get(i))) {
                        java.lang.String str = (java.lang.String) list.get(i);
                        this.zzc = str;
                        return str;
                    }
                }
                java.lang.String str2 = (java.lang.String) this.zza.get(0);
                this.zzc = str2;
                return str2;
            }
        }
        if ((!name2.equals("protocolSelected") && !name2.equals(com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag)) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.zzc = (java.lang.String) objArr[0];
        return null;
    }

    final /* synthetic */ java.lang.String zzb() {
        return this.zzc;
    }

    final /* synthetic */ boolean zza() {
        return this.zzb;
    }

    public zzccq(java.util.List list) {
        this.zza = list;
    }
}
