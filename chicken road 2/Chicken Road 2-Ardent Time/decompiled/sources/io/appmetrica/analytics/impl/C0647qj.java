package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647qj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f6697c;

    public C0647qj(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        this.f6695a = str;
        this.f6696b = str2;
        this.f6697c = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportError(this.f6695a, this.f6696b, this.f6697c);
    }
}
