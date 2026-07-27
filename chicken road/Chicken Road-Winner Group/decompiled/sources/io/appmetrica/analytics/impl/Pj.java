package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6430b;

    public Pj(String str, String str2) {
        this.f6429a = str;
        this.f6430b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.putAppEnvironmentValue(this.f6429a, this.f6430b);
    }
}
