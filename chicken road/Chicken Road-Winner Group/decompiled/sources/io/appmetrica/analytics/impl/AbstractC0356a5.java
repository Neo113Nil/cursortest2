package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0356a5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6950b = "[ComponentMigrationToV113]";

    public AbstractC0356a5(C0459e5 c0459e5) {
        this.f6949a = c0459e5;
    }

    public final C0459e5 a() {
        return this.f6949a;
    }

    public final String b() {
        return this.f6950b;
    }

    public abstract boolean b(int i3);

    public abstract void c();

    public final void a(int i3) {
        if (b(i3)) {
            c();
        }
    }
}
