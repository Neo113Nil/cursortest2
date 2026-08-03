package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605p3 implements io.appmetrica.analytics.impl.InterfaceC0840y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0840y5, s1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, java.lang.String> invoke(android.content.ContentValues contentValues) {
        java.lang.String asString = contentValues.getAsString("clids");
        java.util.HashMap c2 = io.appmetrica.analytics.impl.AbstractC0380gb.c(asString);
        if (io.appmetrica.analytics.impl.Fm.a(c2)) {
            return c2;
        }
        io.appmetrica.analytics.impl.AbstractC0362fj.a("Passed clids (" + asString + ") are invalid.", new java.lang.Object[0]);
        return null;
    }
}
