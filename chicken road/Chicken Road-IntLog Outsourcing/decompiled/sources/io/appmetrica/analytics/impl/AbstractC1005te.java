package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005te {

    /* renamed from: a, reason: collision with root package name */
    public final int f9309a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f9310b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f9311c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f9309a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f9310b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f9311c;
        }
        throw new C1.b();
    }

    public final Boolean a(int i2) {
        if (i2 == this.f9310b) {
            return Boolean.FALSE;
        }
        if (i2 == this.f9311c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
