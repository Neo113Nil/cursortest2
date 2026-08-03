package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633q5 implements io.appmetrica.analytics.impl.Rc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6676a;

    public C0633q5(java.lang.String str) {
        this.f6676a = str;
    }

    public final io.appmetrica.analytics.impl.C0633q5 a(java.lang.String str) {
        return new io.appmetrica.analytics.impl.C0633q5(str);
    }

    public final java.lang.String b() {
        return this.f6676a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io.appmetrica.analytics.impl.C0633q5) && kotlin.jvm.internal.i.a(this.f6676a, ((io.appmetrica.analytics.impl.C0633q5) obj).f6676a);
    }

    public final int hashCode() {
        return this.f6676a.hashCode();
    }

    public final java.lang.String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f6676a + ')';
    }

    public static io.appmetrica.analytics.impl.C0633q5 a(io.appmetrica.analytics.impl.C0633q5 c0633q5, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c0633q5.f6676a;
        }
        c0633q5.getClass();
        return new io.appmetrica.analytics.impl.C0633q5(str);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final java.lang.String a() {
        return this.f6676a;
    }
}
