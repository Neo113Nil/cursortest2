package com.onesignal;

import a.AbstractC0169a;
import android.content.Context;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.debug.IDebugManager;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.user.IUserManager;
import f4.InterfaceC0428e;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OneSignal {
    public static final OneSignal INSTANCE = new OneSignal();
    private static final InterfaceC0428e oneSignal$delegate = AbstractC0169a.A(OneSignal$oneSignal$2.INSTANCE);

    private OneSignal() {
    }

    public static final void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        INSTANCE.getOneSignal().addUserJwtInvalidatedListener(listener);
    }

    public static final boolean getConsentGiven() {
        return INSTANCE.getOneSignal().getConsentGiven();
    }

    public static /* synthetic */ void getConsentGiven$annotations() {
    }

    public static final Object getConsentGivenSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getConsentGiven(interfaceC1218d);
    }

    public static final boolean getConsentRequired() {
        return INSTANCE.getOneSignal().getConsentRequired();
    }

    public static /* synthetic */ void getConsentRequired$annotations() {
    }

    public static final Object getConsentRequiredSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getConsentRequired(interfaceC1218d);
    }

    public static final IDebugManager getDebug() {
        return INSTANCE.getOneSignal().getDebug();
    }

    public static /* synthetic */ void getDebug$annotations() {
    }

    public static final boolean getDisableGMSMissingPrompt() {
        return INSTANCE.getOneSignal().getDisableGMSMissingPrompt();
    }

    public static /* synthetic */ void getDisableGMSMissingPrompt$annotations() {
    }

    public static final Object getDisableGMSMissingPromptSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getDisableGMSMissingPrompt(interfaceC1218d);
    }

    public static final IInAppMessagesManager getInAppMessages() {
        return INSTANCE.getOneSignal().getInAppMessages();
    }

    public static /* synthetic */ void getInAppMessages$annotations() {
    }

    public static final Object getInAppMessagesSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getInAppMessages(interfaceC1218d);
    }

    public static final ILocationManager getLocation() {
        return INSTANCE.getOneSignal().getLocation();
    }

    public static /* synthetic */ void getLocation$annotations() {
    }

    public static final Object getLocationSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getLocation(interfaceC1218d);
    }

    public static final INotificationsManager getNotifications() {
        return INSTANCE.getOneSignal().getNotifications();
    }

    public static /* synthetic */ void getNotifications$annotations() {
    }

    public static final Object getNotificationsSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getNotifications(interfaceC1218d);
    }

    private final IOneSignal getOneSignal() {
        return (IOneSignal) oneSignal$delegate.getValue();
    }

    public static final String getSdkVersion() {
        return INSTANCE.getOneSignal().getSdkVersion();
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final ISessionManager getSession() {
        return INSTANCE.getOneSignal().getSession();
    }

    public static /* synthetic */ void getSession$annotations() {
    }

    public static final Object getSessionSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getSession(interfaceC1218d);
    }

    public static final IUserManager getUser() {
        return INSTANCE.getOneSignal().getUser();
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static final Object getUserSuspend(InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().getUser(interfaceC1218d);
    }

    public static final void initWithContext(Context context, String appId) {
        i.e(context, "context");
        i.e(appId, "appId");
        INSTANCE.getOneSignal().initWithContext(context, appId);
    }

    public static final Object initWithContextSuspend(Context context, String str, InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().initWithContextSuspend(context, str, interfaceC1218d);
    }

    public static /* synthetic */ Object initWithContextSuspend$default(Context context, String str, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return initWithContextSuspend(context, str, interfaceC1218d);
    }

    public static final boolean isInitialized() {
        return INSTANCE.getOneSignal().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final void login(String externalId) {
        i.e(externalId, "externalId");
        INSTANCE.getOneSignal().login(externalId);
    }

    public static /* synthetic */ void login$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        login(str, str2);
    }

    public static final Object loginSuspend(String str, String str2, InterfaceC1218d interfaceC1218d) {
        Object loginSuspend = INSTANCE.getOneSignal().loginSuspend(str, str2, interfaceC1218d);
        return loginSuspend == EnumC1260a.f11058a ? loginSuspend : v.f5689a;
    }

    public static /* synthetic */ Object loginSuspend$default(String str, String str2, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return loginSuspend(str, str2, interfaceC1218d);
    }

    public static final void logout() {
        INSTANCE.getOneSignal().logout();
    }

    public static final Object logoutSuspend(InterfaceC1218d interfaceC1218d) {
        Object logoutSuspend = INSTANCE.getOneSignal().logoutSuspend(interfaceC1218d);
        return logoutSuspend == EnumC1260a.f11058a ? logoutSuspend : v.f5689a;
    }

    public static final void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        INSTANCE.getOneSignal().removeUserJwtInvalidatedListener(listener);
    }

    public static final void setConsentGiven(boolean z) {
        INSTANCE.getOneSignal().setConsentGiven(z);
    }

    public static final Object setConsentGivenSuspend(boolean z, InterfaceC1218d interfaceC1218d) {
        Object consentGiven = INSTANCE.getOneSignal().setConsentGiven(z, interfaceC1218d);
        return consentGiven == EnumC1260a.f11058a ? consentGiven : v.f5689a;
    }

    public static final void setConsentRequired(boolean z) {
        INSTANCE.getOneSignal().setConsentRequired(z);
    }

    public static final Object setConsentRequiredSuspend(boolean z, InterfaceC1218d interfaceC1218d) {
        Object consentRequired = INSTANCE.getOneSignal().setConsentRequired(z, interfaceC1218d);
        return consentRequired == EnumC1260a.f11058a ? consentRequired : v.f5689a;
    }

    public static final void setDisableGMSMissingPrompt(boolean z) {
        INSTANCE.getOneSignal().setDisableGMSMissingPrompt(z);
    }

    public static final Object setDisableGMSMissingPromptSuspend(boolean z, InterfaceC1218d interfaceC1218d) {
        Object disableGMSMissingPrompt = INSTANCE.getOneSignal().setDisableGMSMissingPrompt(z, interfaceC1218d);
        return disableGMSMissingPrompt == EnumC1260a.f11058a ? disableGMSMissingPrompt : v.f5689a;
    }

    public static final void updateUserJwt(String externalId, String token) {
        i.e(externalId, "externalId");
        i.e(token, "token");
        INSTANCE.getOneSignal().updateUserJwt(externalId, token);
    }

    public static final Object updateUserJwtSuspend(String str, String str2, InterfaceC1218d interfaceC1218d) {
        Object updateUserJwtSuspend = INSTANCE.getOneSignal().updateUserJwtSuspend(str, str2, interfaceC1218d);
        return updateUserJwtSuspend == EnumC1260a.f11058a ? updateUserJwtSuspend : v.f5689a;
    }

    public final /* synthetic */ <T> T getService() {
        getServices();
        i.i();
        throw null;
    }

    public final /* synthetic */ <T> T getServiceOrNull() {
        getServices();
        i.i();
        throw null;
    }

    public final IServiceProvider getServices() {
        IOneSignal oneSignal = getOneSignal();
        i.c(oneSignal, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (IServiceProvider) oneSignal;
    }

    public static final Object initWithContext(Context context, InterfaceC1218d interfaceC1218d) {
        return INSTANCE.getOneSignal().initWithContext(context, interfaceC1218d);
    }

    public static final void login(String externalId, String str) {
        i.e(externalId, "externalId");
        INSTANCE.getOneSignal().login(externalId, str);
    }
}
