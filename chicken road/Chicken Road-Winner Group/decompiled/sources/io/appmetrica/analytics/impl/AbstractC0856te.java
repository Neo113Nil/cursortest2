package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0856te {

    /* renamed from: a, reason: collision with root package name */
    public final int f8359a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f8360b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f8361c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f8359a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f8360b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f8361c;
        }
        throw new T0.b();
    }

    public final Boolean a(int i3) {
        if (i3 == this.f8360b) {
            return Boolean.FALSE;
        }
        if (i3 == this.f8361c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
