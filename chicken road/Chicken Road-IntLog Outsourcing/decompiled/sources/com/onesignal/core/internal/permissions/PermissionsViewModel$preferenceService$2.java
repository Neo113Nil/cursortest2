package com.onesignal.core.internal.permissions;

import com.onesignal.OneSignal;
import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class PermissionsViewModel$preferenceService$2 extends j implements InterfaceC1430a {
    public static final PermissionsViewModel$preferenceService$2 INSTANCE = new PermissionsViewModel$preferenceService$2();

    public PermissionsViewModel$preferenceService$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final IPreferencesService invoke() {
        return (IPreferencesService) OneSignal.INSTANCE.getServices().getService(IPreferencesService.class);
    }
}
