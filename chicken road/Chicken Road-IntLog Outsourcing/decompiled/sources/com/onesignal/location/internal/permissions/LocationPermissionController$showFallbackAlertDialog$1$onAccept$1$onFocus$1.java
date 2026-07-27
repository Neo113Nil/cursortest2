package com.onesignal.location.internal.permissions;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class LocationPermissionController$showFallbackAlertDialog$1$onAccept$1$onFocus$1 extends j implements InterfaceC1441l {
    final /* synthetic */ boolean $hasPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionController$showFallbackAlertDialog$1$onAccept$1$onFocus$1(boolean z) {
        super(1);
        this.$hasPermission = z;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationPermissionChangedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ILocationPermissionChangedHandler it) {
        i.e(it, "it");
        it.onLocationPermissionChanged(this.$hasPermission);
    }
}
