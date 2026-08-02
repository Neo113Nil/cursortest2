package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzoh implements androidx.lifecycle.ViewModelProvider.Factory {
    private final com.google.android.libraries.places.internal.zznx zza;
    private final com.google.android.libraries.places.internal.zzom zzb;
    private final com.google.android.libraries.places.internal.zzpu zzc;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final androidx.view.ViewModel create(java.lang.Class cls) {
        com.google.common.base.Preconditions.checkArgument(cls == com.google.android.libraries.places.internal.zzoi.class, "This factory can only be used to instantiate its enclosing class.");
        return new com.google.android.libraries.places.internal.zzoi(this.zza, this.zzb, this.zzc, null);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final androidx.view.ViewModel create(java.lang.Class cls, androidx.view.viewmodel.CreationExtras creationExtras) {
        return create(cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final androidx.view.ViewModel create(kotlin.reflect.KClass kClass, androidx.view.viewmodel.CreationExtras creationExtras) {
        return create(kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass));
    }

    public zzoh(com.google.android.libraries.places.internal.zznx zznxVar, com.google.android.libraries.places.internal.zzom zzomVar, com.google.android.libraries.places.internal.zzpu zzpuVar) {
        this.zza = zznxVar;
        this.zzb = zzomVar;
        this.zzc = zzpuVar;
    }
}
