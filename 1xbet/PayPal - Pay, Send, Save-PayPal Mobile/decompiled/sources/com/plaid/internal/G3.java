package com.plaid.internal;

/* loaded from: classes16.dex */
public final class G3 implements dagger.internal.Factory<com.plaid.internal.F3> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0612p3 f5793a;

    public G3(com.plaid.internal.C0612p3 c0612p3) {
        this.f5793a = c0612p3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.F3((android.content.res.Resources) this.f5793a.get());
    }
}
