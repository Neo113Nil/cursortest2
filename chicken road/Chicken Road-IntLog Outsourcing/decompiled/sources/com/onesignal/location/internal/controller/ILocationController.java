package com.onesignal.location.internal.controller;

import android.location.Location;
import com.onesignal.common.events.IEventNotifier;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface ILocationController extends IEventNotifier<ILocationUpdatedHandler> {
    Location getLastLocation();

    Object start(InterfaceC1218d interfaceC1218d);

    Object stop(InterfaceC1218d interfaceC1218d);
}
