package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I implements io.appmetrica.analytics.coreapi.internal.data.Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.J f4400a;

    public I(io.appmetrica.analytics.impl.J j2) {
        this.f4400a = j2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(this.f4400a.f4466a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        a(((java.lang.Boolean) obj).booleanValue());
    }

    public final void a(boolean z2) {
        this.f4400a.f4466a.e(z2);
    }
}
