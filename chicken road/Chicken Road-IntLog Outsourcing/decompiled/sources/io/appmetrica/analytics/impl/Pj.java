package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7287b;

    public Pj(String str, String str2) {
        this.f7286a = str;
        this.f7287b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.putAppEnvironmentValue(this.f7286a, this.f7287b);
    }
}
