package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class GmsLocationController$setLocationAndFire$1 extends j implements InterfaceC1441l {
    final /* synthetic */ Location $location;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsLocationController$setLocationAndFire$1(Location location) {
        super(1);
        this.$location = location;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationUpdatedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ILocationUpdatedHandler it) {
        i.e(it, "it");
        it.onLocationChanged(this.$location);
    }
}
