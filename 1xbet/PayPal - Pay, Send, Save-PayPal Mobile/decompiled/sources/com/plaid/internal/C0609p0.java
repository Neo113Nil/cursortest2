package com.plaid.internal;

/* renamed from: com.plaid.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0609p0 implements com.plaid.internal.X4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f6525a;
    public final com.plaid.internal.C0609p0 b = this;
    public final dagger.internal.Factory c;
    public final javax.inject.Provider<com.plaid.internal.H5> d;
    public final javax.inject.Provider<kotlinx.serialization.json.Json> e;
    public final javax.inject.Provider<com.plaid.internal.C0690y1> f;
    public final javax.inject.Provider<com.plaid.internal.AbstractC0502d1> g;
    public final javax.inject.Provider<com.plaid.internal.W4> h;
    public final javax.inject.Provider<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> i;
    public final javax.inject.Provider<com.plaid.internal.A2> j;
    public final javax.inject.Provider<com.plaid.internal.I5> k;
    public final javax.inject.Provider<com.plaid.internal.E5> l;
    public final javax.inject.Provider<com.plaid.internal.C0587m5> m;
    public final javax.inject.Provider<com.plaid.internal.C0471c5> n;

    /* renamed from: o, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.N5> f6526o;
    public final javax.inject.Provider<com.plaid.internal.C0457b1> p;

    public C0609p0(com.plaid.internal.C0623q5 c0623q5, android.app.Application application) {
        this.f6525a = application;
        dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0676w5(c0623q5));
        dagger.internal.Factory create = dagger.internal.InstanceFactory.create(application);
        this.c = create;
        javax.inject.Provider<com.plaid.internal.H5> provider = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C5(c0623q5, create));
        this.d = provider;
        javax.inject.Provider<kotlinx.serialization.json.Json> provider2 = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0685x5(c0623q5));
        this.e = provider2;
        this.f = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0699z1(provider, provider2));
        javax.inject.Provider<com.plaid.internal.AbstractC0502d1> provider3 = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0667v5(c0623q5, create));
        this.g = provider3;
        this.h = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0703z5(c0623q5, provider));
        this.i = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0649t5(c0623q5, create));
        this.j = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0694y5(c0623q5));
        javax.inject.Provider<com.plaid.internal.I5> provider4 = dagger.internal.DoubleCheck.provider(new com.plaid.internal.D5(c0623q5, create));
        this.k = provider4;
        javax.inject.Provider<com.plaid.internal.E5> provider5 = dagger.internal.DoubleCheck.provider(new com.plaid.internal.B5(c0623q5, provider4));
        this.l = provider5;
        javax.inject.Provider<com.plaid.internal.C0587m5> provider6 = dagger.internal.DoubleCheck.provider(new com.plaid.internal.A5(c0623q5, create));
        this.m = provider6;
        this.n = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0640s5(c0623q5, create, provider5, provider6));
        this.f6526o = dagger.internal.DoubleCheck.provider(new com.plaid.internal.O5(create));
        this.p = dagger.internal.DoubleCheck.provider(new com.plaid.internal.C0658u5(c0623q5, provider3));
    }
}
