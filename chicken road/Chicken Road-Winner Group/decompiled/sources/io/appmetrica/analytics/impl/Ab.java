package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public final class Ab implements Oa {

    /* renamed from: a, reason: collision with root package name */
    public final Oa f5692a;

    public Ab(Oa oa) {
        this.f5692a = oa;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, String str2) {
        this.f5692a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        this.f5692a.b();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z3) {
        return this.f5692a.getBoolean(str, z3);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i3) {
        return this.f5692a.getInt(str, i3);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j3) {
        return this.f5692a.getLong(str, j3);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        return this.f5692a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        this.f5692a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j3) {
        this.f5692a.a(str, j3);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(int i3, String str) {
        this.f5692a.a(i3, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z3) {
        this.f5692a.a(str, z3);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f) {
        this.f5692a.a(str, f);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        return this.f5692a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        return this.f5692a.a();
    }
}
