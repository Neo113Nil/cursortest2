package com.onesignal.notifications.internal.registration.impl;

import D4.AbstractC0024y;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import e5.g;
import java.io.IOException;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public abstract class PushRegistratorAbstractGoogle implements IPushRegistrator, IPushRegistratorCallback {
    public static final Companion Companion = new Companion(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final GooglePlayServicesUpgradePrompt _upgradePrompt;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public PushRegistratorAbstractGoogle(IDeviceService _deviceService, ConfigModelStore _configModelStore, GooglePlayServicesUpgradePrompt _upgradePrompt) {
        i.e(_deviceService, "_deviceService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i2, InterfaceC1218d interfaceC1218d) {
        PushRegistratorAbstractGoogle$attemptRegistration$1 pushRegistratorAbstractGoogle$attemptRegistration$1;
        int i3;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        String rootCauseMessage;
        if (interfaceC1218d instanceof PushRegistratorAbstractGoogle$attemptRegistration$1) {
            pushRegistratorAbstractGoogle$attemptRegistration$1 = (PushRegistratorAbstractGoogle$attemptRegistration$1) interfaceC1218d;
            int i6 = pushRegistratorAbstractGoogle$attemptRegistration$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pushRegistratorAbstractGoogle$attemptRegistration$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pushRegistratorAbstractGoogle$attemptRegistration$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = pushRegistratorAbstractGoogle$attemptRegistration$1.label;
                if (i3 != 0) {
                    g.y(obj);
                    try {
                        pushRegistratorAbstractGoogle$attemptRegistration$1.L$0 = this;
                        pushRegistratorAbstractGoogle$attemptRegistration$1.I$0 = i2;
                        pushRegistratorAbstractGoogle$attemptRegistration$1.label = 1;
                        obj = getToken(str, pushRegistratorAbstractGoogle$attemptRegistration$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        pushRegistratorAbstractGoogle = this;
                    } catch (IOException e3) {
                        e = e3;
                        pushRegistratorAbstractGoogle = this;
                        SubscriptionStatus pushStatusFromThrowable = pushRegistratorAbstractGoogle.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i2 < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        pushRegistratorAbstractGoogle = this;
                        Logging.warn("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = pushRegistratorAbstractGoogle$attemptRegistration$1.I$0;
                    pushRegistratorAbstractGoogle = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$attemptRegistration$1.L$0;
                    try {
                        g.y(obj);
                    } catch (IOException e6) {
                        e = e6;
                        SubscriptionStatus pushStatusFromThrowable2 = pushRegistratorAbstractGoogle.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            Logging.warn("Error Getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", new Exception(e));
                            return new IPushRegistrator.RegisterResult(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i2 < 4) {
                            Logging.info("Retry count of 5 exceed! Could not get a " + pushRegistratorAbstractGoogle.getProviderName() + " Token.", exc2);
                        } else {
                            Logging.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i2, exc2);
                            if (i2 == 2) {
                                return new IPushRegistrator.RegisterResult(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        Logging.warn("Unknown error getting " + pushRegistratorAbstractGoogle.getProviderName() + " Token", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                Logging.info$default("Device registered, push token = " + str2, null, 2, null);
                return new IPushRegistrator.RegisterResult(str2, SubscriptionStatus.SUBSCRIBED);
            }
        }
        pushRegistratorAbstractGoogle$attemptRegistration$1 = new PushRegistratorAbstractGoogle$attemptRegistration$1(this, interfaceC1218d);
        Object obj2 = pushRegistratorAbstractGoogle$attemptRegistration$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = pushRegistratorAbstractGoogle$attemptRegistration$1.label;
        if (i3 != 0) {
        }
        String str22 = (String) obj2;
        Logging.info$default("Device registered, push token = " + str22, null, 2, null);
        return new IPushRegistrator.RegisterResult(str22, SubscriptionStatus.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, String str, InterfaceC1218d interfaceC1218d) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, InterfaceC1218d interfaceC1218d) {
        PushRegistratorAbstractGoogle$internalRegisterForPush$1 pushRegistratorAbstractGoogle$internalRegisterForPush$1;
        int i2;
        try {
            if (interfaceC1218d instanceof PushRegistratorAbstractGoogle$internalRegisterForPush$1) {
                pushRegistratorAbstractGoogle$internalRegisterForPush$1 = (PushRegistratorAbstractGoogle$internalRegisterForPush$1) interfaceC1218d;
                int i3 = pushRegistratorAbstractGoogle$internalRegisterForPush$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pushRegistratorAbstractGoogle$internalRegisterForPush$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = pushRegistratorAbstractGoogle$internalRegisterForPush$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = pushRegistratorAbstractGoogle$internalRegisterForPush$1.label;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            g.y(obj);
                        }
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        Logging.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    g.y(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.L$0 = this;
                            pushRegistratorAbstractGoogle$internalRegisterForPush$1.label = 1;
                            obj = registerInBackground(str, pushRegistratorAbstractGoogle$internalRegisterForPush$1);
                            return obj == enumC1260a ? enumC1260a : (IPushRegistrator.RegisterResult) obj;
                        }
                        GooglePlayServicesUpgradePrompt googlePlayServicesUpgradePrompt = this._upgradePrompt;
                        pushRegistratorAbstractGoogle$internalRegisterForPush$1.L$0 = this;
                        pushRegistratorAbstractGoogle$internalRegisterForPush$1.label = 2;
                        if (googlePlayServicesUpgradePrompt.showUpdateGPSDialog(pushRegistratorAbstractGoogle$internalRegisterForPush$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        Logging.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        Logging.warn("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i2 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        pushRegistratorAbstractGoogle$internalRegisterForPush$1 = new PushRegistratorAbstractGoogle$internalRegisterForPush$1(this, interfaceC1218d);
        Object obj2 = pushRegistratorAbstractGoogle$internalRegisterForPush$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pushRegistratorAbstractGoogle$internalRegisterForPush$1.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            i.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final SubscriptionStatus pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? i.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : i.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : SubscriptionStatus.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : SubscriptionStatus.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, InterfaceC1218d interfaceC1218d) {
        if (!pushRegistratorAbstractGoogle._configModelStore.getModel().isInitializedWithRemote()) {
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
        }
        if (!pushRegistratorAbstractGoogle._deviceService.getHasFCMLibrary()) {
            Logging.warn$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!pushRegistratorAbstractGoogle.isValidProjectNumber(pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber())) {
            Logging.warn$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = pushRegistratorAbstractGoogle._configModelStore.getModel().getGoogleProjectNumber();
        i.b(googleProjectNumber);
        return pushRegistratorAbstractGoogle.internalRegisterForPush(googleProjectNumber, interfaceC1218d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:11:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, InterfaceC1218d interfaceC1218d) {
        PushRegistratorAbstractGoogle$registerInBackground$1 pushRegistratorAbstractGoogle$registerInBackground$1;
        int i2;
        int i3;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle;
        int i6;
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle2;
        String str2;
        IPushRegistrator.RegisterResult registerResult;
        if (interfaceC1218d instanceof PushRegistratorAbstractGoogle$registerInBackground$1) {
            pushRegistratorAbstractGoogle$registerInBackground$1 = (PushRegistratorAbstractGoogle$registerInBackground$1) interfaceC1218d;
            int i7 = pushRegistratorAbstractGoogle$registerInBackground$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                pushRegistratorAbstractGoogle$registerInBackground$1.label = i7 - Integer.MIN_VALUE;
                Object obj = pushRegistratorAbstractGoogle$registerInBackground$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = pushRegistratorAbstractGoogle$registerInBackground$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    i3 = 0;
                    pushRegistratorAbstractGoogle = this;
                    if (i3 < 5) {
                    }
                } else if (i2 == 1) {
                    i6 = pushRegistratorAbstractGoogle$registerInBackground$1.I$0;
                    str2 = (String) pushRegistratorAbstractGoogle$registerInBackground$1.L$1;
                    pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$registerInBackground$1.L$0;
                    g.y(obj);
                    registerResult = (IPushRegistrator.RegisterResult) obj;
                    if (registerResult == null) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i6 = pushRegistratorAbstractGoogle$registerInBackground$1.I$0;
                    str2 = (String) pushRegistratorAbstractGoogle$registerInBackground$1.L$1;
                    pushRegistratorAbstractGoogle2 = (PushRegistratorAbstractGoogle) pushRegistratorAbstractGoogle$registerInBackground$1.L$0;
                    g.y(obj);
                    i3 = i6 + 1;
                    str = str2;
                    pushRegistratorAbstractGoogle = pushRegistratorAbstractGoogle2;
                    if (i3 < 5) {
                        pushRegistratorAbstractGoogle$registerInBackground$1.L$0 = pushRegistratorAbstractGoogle;
                        pushRegistratorAbstractGoogle$registerInBackground$1.L$1 = str;
                        pushRegistratorAbstractGoogle$registerInBackground$1.I$0 = i3;
                        pushRegistratorAbstractGoogle$registerInBackground$1.label = 1;
                        Object attemptRegistration = pushRegistratorAbstractGoogle.attemptRegistration(str, i3, pushRegistratorAbstractGoogle$registerInBackground$1);
                        if (attemptRegistration == enumC1260a) {
                            return enumC1260a;
                        }
                        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle3 = pushRegistratorAbstractGoogle;
                        str2 = str;
                        i6 = i3;
                        obj = attemptRegistration;
                        pushRegistratorAbstractGoogle2 = pushRegistratorAbstractGoogle3;
                        registerResult = (IPushRegistrator.RegisterResult) obj;
                        if (registerResult == null) {
                            return registerResult;
                        }
                        pushRegistratorAbstractGoogle$registerInBackground$1.L$0 = pushRegistratorAbstractGoogle2;
                        pushRegistratorAbstractGoogle$registerInBackground$1.L$1 = str2;
                        pushRegistratorAbstractGoogle$registerInBackground$1.I$0 = i6;
                        pushRegistratorAbstractGoogle$registerInBackground$1.label = 2;
                        if (AbstractC0024y.d((i6 + 1) * 10000, pushRegistratorAbstractGoogle$registerInBackground$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        i3 = i6 + 1;
                        str = str2;
                        pushRegistratorAbstractGoogle = pushRegistratorAbstractGoogle2;
                        if (i3 < 5) {
                            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.FIREBASE_FCM_INIT_ERROR);
                        }
                    }
                }
            }
        }
        pushRegistratorAbstractGoogle$registerInBackground$1 = new PushRegistratorAbstractGoogle$registerInBackground$1(this, interfaceC1218d);
        Object obj2 = pushRegistratorAbstractGoogle$registerInBackground$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pushRegistratorAbstractGoogle$registerInBackground$1.label;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, InterfaceC1218d interfaceC1218d) {
        return fireCallback$suspendImpl(this, str, interfaceC1218d);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, InterfaceC1218d interfaceC1218d);

    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    public Object registerForPush(InterfaceC1218d interfaceC1218d) {
        return registerForPush$suspendImpl(this, interfaceC1218d);
    }
}
