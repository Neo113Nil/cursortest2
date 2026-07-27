package com.onesignal.core.internal.permissions;

import com.onesignal.OneSignal;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class PermissionsViewModel$requestPermissionService$2 extends j implements InterfaceC1430a {
    public static final PermissionsViewModel$requestPermissionService$2 INSTANCE = new PermissionsViewModel$requestPermissionService$2();

    public PermissionsViewModel$requestPermissionService$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final RequestPermissionService invoke() {
        return (RequestPermissionService) OneSignal.INSTANCE.getServices().getService(RequestPermissionService.class);
    }
}
