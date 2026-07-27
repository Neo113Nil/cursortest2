package com.onesignal.notifications.internal.registration.impl;

import D4.InterfaceC0022w;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2", f = "GooglePlayServicesUpgradePrompt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ GooglePlayServicesUpgradePrompt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2(GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = googlePlayServicesUpgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt, DialogInterface dialogInterface, int i2) {
        ConfigModelStore configModelStore;
        configModelStore = googlePlayServicesUpgradePrompt._configModelStore;
        configModelStore.getModel().setUserRejectedGMSUpdate(true);
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iApplicationService = this.this$0._applicationService;
        final Activity current = iApplicationService.getCurrent();
        v vVar = v.f5689a;
        if (current == null) {
            return vVar;
        }
        AndroidUtils androidUtils = AndroidUtils.INSTANCE;
        String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
        String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
        String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
        String resourceString4 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close");
        AlertDialog.Builder message = new AlertDialog.Builder(current).setMessage(resourceString);
        final GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt = this.this$0;
        AlertDialog.Builder positiveButton = message.setPositiveButton(resourceString2, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                GooglePlayServicesUpgradePrompt.access$openPlayStoreToApp(GooglePlayServicesUpgradePrompt.this, current);
            }
        });
        final GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt2 = this.this$0;
        positiveButton.setNegativeButton(resourceString3, new DialogInterface.OnClickListener() { // from class: com.onesignal.notifications.internal.registration.impl.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                GooglePlayServicesUpgradePrompt$showUpdateGPSDialog$2.invokeSuspend$lambda$1(GooglePlayServicesUpgradePrompt.this, dialogInterface, i2);
            }
        }).setNeutralButton(resourceString4, (DialogInterface.OnClickListener) null).create().show();
        return vVar;
    }
}
