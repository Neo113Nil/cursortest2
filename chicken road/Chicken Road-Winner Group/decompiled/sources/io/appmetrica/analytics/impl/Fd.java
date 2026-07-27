package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Fd extends AbstractC0418cf implements InterfaceC0992yl {
    public Fd(Oa oa, String str) {
        super(oa, str);
    }

    public final String c(String str, String str2) {
        return this.f7110a.getString(f(str), str2);
    }

    public final InterfaceC0992yl d(String str, String str2) {
        return (InterfaceC0992yl) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f7110a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC0992yl g(String str) {
        return (InterfaceC0992yl) d(f(str));
    }

    public Fd(Oa oa) {
        this(oa, null);
    }

    public final InterfaceC0992yl d(String str, int i3) {
        return (InterfaceC0992yl) b(f(str), i3);
    }

    public final int c(String str, int i3) {
        return this.f7110a.getInt(f(str), i3);
    }

    public final InterfaceC0992yl d(String str, long j3) {
        return (InterfaceC0992yl) b(f(str), j3);
    }

    public final InterfaceC0992yl d(String str, boolean z3) {
        return (InterfaceC0992yl) b(f(str), z3);
    }

    public final long c(String str, long j3) {
        return this.f7110a.getLong(f(str), j3);
    }

    public final boolean c(String str, boolean z3) {
        return this.f7110a.getBoolean(f(str), z3);
    }
}
