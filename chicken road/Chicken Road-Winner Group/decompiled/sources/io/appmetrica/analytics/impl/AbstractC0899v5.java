package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0899v5 implements InterfaceC0576ij {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f8487a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f8488b;

    /* renamed from: c, reason: collision with root package name */
    public S5 f8489c;

    public AbstractC0899v5(BaseRequestConfig.RequestConfigLoader<Object, S5> requestConfigLoader, C0605jm c0605jm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f8488b = requestConfigLoader;
        C0878ua.k().v().a(this);
        a(new S5(c0605jm, C0878ua.k().v(), C0878ua.k().s(), argumentsMerger));
    }

    public final synchronized void a(S5 s5) {
        this.f8489c = s5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f8489c.componentArguments;
    }

    public final synchronized C0605jm c() {
        return this.f8489c.f6552a;
    }

    public final void d() {
        synchronized (this) {
            this.f8487a = null;
        }
    }

    public final synchronized void e() {
        this.f8487a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f8489c.componentArguments).compareWithOtherArguments(obj)) {
            a(new S5(c(), C0878ua.f8414H.v(), C0878ua.f8414H.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f8489c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0605jm c0605jm) {
        a(new S5(c0605jm, C0878ua.f8414H.v(), C0878ua.f8414H.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f8487a == null) {
                this.f8487a = this.f8488b.load(this.f8489c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8487a;
    }
}
