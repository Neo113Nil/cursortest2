package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public final class Ab implements Oa {

    /* renamed from: a, reason: collision with root package name */
    public final Oa f6523a;

    public Ab(Oa oa) {
        this.f6523a = oa;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, String str2) {
        this.f6523a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        this.f6523a.b();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z) {
        return this.f6523a.getBoolean(str, z);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i2) {
        return this.f6523a.getInt(str, i2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j2) {
        return this.f6523a.getLong(str, j2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        return this.f6523a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        this.f6523a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j2) {
        this.f6523a.a(str, j2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(int i2, String str) {
        this.f6523a.a(i2, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z) {
        this.f6523a.a(str, z);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f3) {
        this.f6523a.a(str, f3);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        return this.f6523a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        return this.f6523a.a();
    }
}
