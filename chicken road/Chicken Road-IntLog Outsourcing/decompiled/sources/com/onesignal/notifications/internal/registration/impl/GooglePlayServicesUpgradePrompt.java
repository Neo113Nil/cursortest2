package com.onesignal.notifications.internal.registration.impl;

import D4.AbstractC0024y;
import D4.E;
import I4.o;
import K4.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l1.f;
import l1.g;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class GooglePlayServicesUpgradePrompt {
    public static final Companion Companion = new Companion(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public GooglePlayServicesUpgradePrompt(IApplicationService _applicationService, IDeviceService _deviceService, ConfigModelStore _configModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_deviceService, "_deviceService");
        i.e(_configModelStore, "_configModelStore");
        this._applicationService = _applicationService;
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            i.c(packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager), "null cannot be cast to non-null type kotlin.String");
            return !((String) r0).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            f fVar = f.f11010d;
            PendingIntent pendingIntent = null;
            Intent a6 = fVar.a(activity, null, fVar.b(this._applicationService.getAppContext(), g.f11011a));
            if (a6 != null) {
                pendingIntent = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, a6, 201326592);
            }
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e3) {
            e3.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(InterfaceC1218d interfaceC1218d) {
        boolean isAndroidDeviceType = this._deviceService.isAndroidDeviceType();
        v vVar = v.f5689a;
        if (!isAndroidDeviceType) {
            return vVar;
        }
        if (isGooglePlayStoreInstalled() && !this._configModelStore.getModel().getDisableGMSMissingPrompt() && !this._configModelStore.getModel().getUserRejectedGMSUpdate()) {
            d dVar = E.f459a;
            Object w3 = AbstractC0024y.w(o.f1316a, new GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2(this, null), interfaceC1218d);
            if (w3 == EnumC1260a.f11058a) {
                return w3;
            }
        }
        return vVar;
    }
}
