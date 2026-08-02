package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzqe implements androidx.lifecycle.ViewModelProvider.Factory {
    final /* synthetic */ android.app.Application zza;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final androidx.view.ViewModel create(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new com.google.android.libraries.places.internal.zzqr(this.zza);
    }

    zzqe(android.app.Application application) {
        this.zza = application;
    }
}
