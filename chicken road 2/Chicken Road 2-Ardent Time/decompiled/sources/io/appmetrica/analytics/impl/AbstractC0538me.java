package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0538me {

    /* renamed from: a, reason: collision with root package name */
    public final int f6421a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f6422b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f6423c = 1;

    public final int a(java.lang.Boolean bool) {
        if (bool == null) {
            return this.f6421a;
        }
        if (bool.equals(java.lang.Boolean.FALSE)) {
            return this.f6422b;
        }
        if (bool.equals(java.lang.Boolean.TRUE)) {
            return this.f6423c;
        }
        throw new E1.A();
    }

    public final java.lang.Boolean a(int i2) {
        if (i2 == this.f6422b) {
            return java.lang.Boolean.FALSE;
        }
        if (i2 == this.f6423c) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }
}
