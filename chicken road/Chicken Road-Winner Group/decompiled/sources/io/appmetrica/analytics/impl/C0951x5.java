package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951x5 implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final String f8608a;

    public C0951x5(String str) {
        this.f8608a = str;
    }

    public final C0951x5 a(String str) {
        return new C0951x5(str);
    }

    public final String b() {
        return this.f8608a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0951x5) && kotlin.jvm.internal.j.a(this.f8608a, ((C0951x5) obj).f8608a);
    }

    public final int hashCode() {
        return this.f8608a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f8608a + ')';
    }

    public static C0951x5 a(C0951x5 c0951x5, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c0951x5.f8608a;
        }
        c0951x5.getClass();
        return new C0951x5(str);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        return this.f8608a;
    }
}
