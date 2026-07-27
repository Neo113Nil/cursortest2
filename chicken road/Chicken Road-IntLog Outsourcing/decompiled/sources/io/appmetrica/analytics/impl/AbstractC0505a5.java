package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505a5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7830b = "[ComponentMigrationToV113]";

    public AbstractC0505a5(C0608e5 c0608e5) {
        this.f7829a = c0608e5;
    }

    public final C0608e5 a() {
        return this.f7829a;
    }

    public final String b() {
        return this.f7830b;
    }

    public abstract boolean b(int i2);

    public abstract void c();

    public final void a(int i2) {
        if (b(i2)) {
            c();
        }
    }
}
