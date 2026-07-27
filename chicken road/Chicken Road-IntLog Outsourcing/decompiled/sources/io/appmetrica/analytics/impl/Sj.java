package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7474a;

    public Sj(String str) {
        this.f7474a = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f7474a);
    }
}
