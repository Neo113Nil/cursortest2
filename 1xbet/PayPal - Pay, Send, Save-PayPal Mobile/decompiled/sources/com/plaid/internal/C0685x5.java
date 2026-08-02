package com.plaid.internal;

/* renamed from: com.plaid.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0685x5 implements dagger.internal.Factory<kotlinx.serialization.json.Json> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0623q5 f6624a;

    public C0685x5(com.plaid.internal.C0623q5 c0623q5) {
        this.f6624a = c0623q5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(kotlinx.serialization.json.JsonKt.Json$default(null, com.plaid.internal.C0631r5.f6557a, 1, null));
    }
}
