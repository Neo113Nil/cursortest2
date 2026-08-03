package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
/* loaded from: classes.dex */
public final class J6 implements io.appmetrica.analytics.impl.I6 {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.Jg f4487a;

    public J6(io.appmetrica.analytics.impl.Jg jg) {
        this.f4487a = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public java.io.File a(android.content.Context context, java.lang.String str) {
        return new java.io.File(context.getNoBackupFilesDir(), this.f4487a.a(str));
    }
}
