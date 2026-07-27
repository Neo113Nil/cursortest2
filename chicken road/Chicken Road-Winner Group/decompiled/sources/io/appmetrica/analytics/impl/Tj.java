package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Tj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6677b;

    public Tj(String str, String str2) {
        this.f6676a = str;
        this.f6677b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f6676a, this.f6677b);
    }
}
