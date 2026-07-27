package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes.dex */
public final class Kj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f7041a;

    public Kj(ModuleEvent moduleEvent) {
        this.f7041a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f7041a);
    }
}
