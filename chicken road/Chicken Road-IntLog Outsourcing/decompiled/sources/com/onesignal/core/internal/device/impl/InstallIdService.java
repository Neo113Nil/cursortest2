package com.onesignal.core.internal.device.impl;

import a.AbstractC0169a;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import f4.InterfaceC0428e;
import java.util.UUID;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InstallIdService implements IInstallIdService {
    private final IPreferencesService _prefs;
    private final InterfaceC0428e currentId$delegate;

    public InstallIdService(IPreferencesService _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = AbstractC0169a.A(new InstallIdService$currentId$2(this));
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        i.d(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // com.onesignal.core.internal.device.IInstallIdService
    public Object getId(InterfaceC1218d interfaceC1218d) {
        return getCurrentId();
    }
}
