package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class T4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f4998a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4999b = "[ComponentMigrationToV113]";

    public T4(io.appmetrica.analytics.impl.X4 x4) {
        this.f4998a = x4;
    }

    public final io.appmetrica.analytics.impl.X4 a() {
        return this.f4998a;
    }

    public final java.lang.String b() {
        return this.f4999b;
    }

    public abstract boolean b(int i2);

    public abstract void c();

    public final void a(int i2) {
        if (b(i2)) {
            c();
        }
    }
}
