package com.onesignal.location.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.location.internal.LocationManager", f = "LocationManager.kt", l = {196}, m = "startGetLocation")
/* loaded from: classes.dex */
public final class LocationManager$startGetLocation$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$startGetLocation$1(LocationManager locationManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = locationManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object startGetLocation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startGetLocation = this.this$0.startGetLocation(this);
        return startGetLocation;
    }
}
