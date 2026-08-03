package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548mo implements io.appmetrica.analytics.impl.Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final java.lang.String a(android.content.Context context) {
        io.appmetrica.analytics.internal.IdentifiersResult q2 = new io.appmetrica.analytics.impl.Ve(io.appmetrica.analytics.impl.C0244b4.l().c(context).a(context)).q();
        if (android.text.TextUtils.isEmpty(q2.id)) {
            return null;
        }
        return q2.id;
    }
}
