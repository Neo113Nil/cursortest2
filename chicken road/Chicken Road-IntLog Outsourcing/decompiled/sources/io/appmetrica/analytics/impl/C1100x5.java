package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100x5 implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final String f9567a;

    public C1100x5(String str) {
        this.f9567a = str;
    }

    public final C1100x5 a(String str) {
        return new C1100x5(str);
    }

    public final String b() {
        return this.f9567a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1100x5) && kotlin.jvm.internal.i.a(this.f9567a, ((C1100x5) obj).f9567a);
    }

    public final int hashCode() {
        return this.f9567a.hashCode();
    }

    public final String toString() {
        return B0.o.l(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.f9567a, ')');
    }

    public static C1100x5 a(C1100x5 c1100x5, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c1100x5.f9567a;
        }
        c1100x5.getClass();
        return new C1100x5(str);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        return this.f9567a;
    }
}
