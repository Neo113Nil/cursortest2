package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NullLocationController implements ILocationController {
    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        return null;
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Object start(InterfaceC1218d interfaceC1218d) {
        return Boolean.FALSE;
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Object stop(InterfaceC1218d interfaceC1218d) {
        return v.f5689a;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler handler) {
        i.e(handler, "handler");
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler handler) {
        i.e(handler, "handler");
    }
}
