package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4783b;

    public Oj(java.lang.String str, java.lang.String str2) {
        this.f4782a = str;
        this.f4783b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportEvent(this.f4782a, this.f4783b);
    }
}
