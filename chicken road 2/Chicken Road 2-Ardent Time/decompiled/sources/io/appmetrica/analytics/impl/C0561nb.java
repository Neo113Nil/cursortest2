package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561nb implements io.appmetrica.analytics.coreapi.internal.backport.Function, io.appmetrica.analytics.coreapi.internal.backport.Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0457jb apply(java.io.File file) {
        java.lang.String a2 = io.appmetrica.analytics.impl.Ja.a(file);
        if (!android.text.TextUtils.isEmpty(a2)) {
            try {
                return new io.appmetrica.analytics.impl.C0457jb(a2);
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(java.io.File file) {
        try {
            file.delete();
        } catch (java.lang.Throwable unused) {
        }
    }
}
