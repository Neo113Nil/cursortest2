package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1048v5 implements InterfaceC0725ij {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f9441a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f9442b;

    /* renamed from: c, reason: collision with root package name */
    public S5 f9443c;

    public AbstractC1048v5(BaseRequestConfig.RequestConfigLoader<Object, S5> requestConfigLoader, C0754jm c0754jm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f9442b = requestConfigLoader;
        C1027ua.k().v().a(this);
        a(new S5(c0754jm, C1027ua.k().v(), C1027ua.k().s(), argumentsMerger));
    }

    public final synchronized void a(S5 s5) {
        this.f9443c = s5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f9443c.componentArguments;
    }

    public final synchronized C0754jm c() {
        return this.f9443c.f7418a;
    }

    public final void d() {
        synchronized (this) {
            this.f9441a = null;
        }
    }

    public final synchronized void e() {
        this.f9441a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f9443c.componentArguments).compareWithOtherArguments(obj)) {
            a(new S5(c(), C1027ua.f9366H.v(), C1027ua.f9366H.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f9443c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0754jm c0754jm) {
        a(new S5(c0754jm, C1027ua.f9366H.v(), C1027ua.f9366H.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f9441a == null) {
                this.f9441a = this.f9442b.load(this.f9443c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9441a;
    }
}
