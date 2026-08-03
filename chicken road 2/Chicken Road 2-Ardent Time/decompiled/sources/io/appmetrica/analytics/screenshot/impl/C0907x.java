package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907x implements io.appmetrica.analytics.screenshot.impl.U {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7592a;

    public C0907x(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f7592a = clientContext;
    }

    public final void a(java.lang.String str) {
        this.f7592a.getInternalClientModuleFacade().reportEvent(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(i1.AbstractC0203v.F(new h1.C0172d("type", str))).withCategory(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category.SYSTEM).build());
    }
}
