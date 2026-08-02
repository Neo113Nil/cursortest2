package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zzz implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zza);
        return com.google.android.gms.tasks.Tasks.forResult(arrayList);
    }

    zzz(java.util.Collection collection) {
        this.zza = collection;
    }
}
