package com.plaid.internal;

/* renamed from: com.plaid.internal.c7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0473c7<T> extends androidx.view.MutableLiveData<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f6010a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final void a(com.plaid.internal.C0473c7 c0473c7, androidx.view.Observer observer, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0473c7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        if (c0473c7.f6010a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.view.LiveData
    public final void observe(androidx.view.LifecycleOwner lifecycleOwner, final androidx.view.Observer<? super T> observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        if (hasActiveObservers()) {
            throw new com.plaid.internal.B2("Only one observer supported");
        }
        super.observe(lifecycleOwner, new androidx.view.Observer() { // from class: com.plaid.internal.c7$$ExternalSyntheticLambda0
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                com.plaid.internal.C0473c7.a(com.plaid.internal.C0473c7.this, observer, obj);
            }
        });
    }

    @Override // androidx.view.MutableLiveData, androidx.view.LiveData
    public final void setValue(T t) {
        this.f6010a.set(true);
        super.setValue(t);
    }
}
