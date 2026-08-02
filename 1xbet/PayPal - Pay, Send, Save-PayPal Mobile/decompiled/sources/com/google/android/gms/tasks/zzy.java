package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zzy implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.tasks.Task) it.next()).getResult());
        }
        return arrayList;
    }

    zzy(java.util.Collection collection) {
        this.zza = collection;
    }
}
