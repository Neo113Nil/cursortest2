package io.appmetrica.analytics.screenshot.impl;

import d2.C0274d;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9078a;

    public C1042x(ClientContext clientContext) {
        this.f9078a = clientContext;
    }

    public final void a(String str) {
        this.f9078a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(e2.s.k0(new C0274d("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
