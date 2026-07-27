package com.onesignal.notifications.internal.registration.impl;

import B0.f;
import D4.AbstractC0024y;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class PushRegistratorHMS implements IPushRegistrator, IPushRegistratorCallback {
    public static final Companion Companion = new Companion(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final IApplicationService _applicationService;
    private final IDeviceService _deviceService;
    private WaiterWithValue<String> waiter;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public PushRegistratorHMS(IDeviceService _deviceService, IApplicationService _applicationService) {
        i.e(_deviceService, "_deviceService");
        i.e(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHMSTokenTask(Context context, InterfaceC1218d interfaceC1218d) {
        PushRegistratorHMS$getHMSTokenTask$1 pushRegistratorHMS$getHMSTokenTask$1;
        int i2;
        s sVar;
        if (interfaceC1218d instanceof PushRegistratorHMS$getHMSTokenTask$1) {
            pushRegistratorHMS$getHMSTokenTask$1 = (PushRegistratorHMS$getHMSTokenTask$1) interfaceC1218d;
            int i3 = pushRegistratorHMS$getHMSTokenTask$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pushRegistratorHMS$getHMSTokenTask$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pushRegistratorHMS$getHMSTokenTask$1.result;
                f.u();
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = pushRegistratorHMS$getHMSTokenTask$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new WaiterWithValue<>();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    s sVar2 = new s();
                    String token = hmsInstanceId.getToken(string, "HCM");
                    sVar2.f10741a = token;
                    if (!TextUtils.isEmpty(token)) {
                        Logging.info$default("Device registered for HMS, push token = " + ((String) sVar2.f10741a), null, 2, null);
                        return new IPushRegistrator.RegisterResult((String) sVar2.f10741a, SubscriptionStatus.SUBSCRIBED);
                    }
                    PushRegistratorHMS$getHMSTokenTask$2 pushRegistratorHMS$getHMSTokenTask$2 = new PushRegistratorHMS$getHMSTokenTask$2(sVar2, this, null);
                    pushRegistratorHMS$getHMSTokenTask$1.L$0 = sVar2;
                    pushRegistratorHMS$getHMSTokenTask$1.label = 1;
                    if (AbstractC0024y.x(30000L, pushRegistratorHMS$getHMSTokenTask$2, pushRegistratorHMS$getHMSTokenTask$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) pushRegistratorHMS$getHMSTokenTask$1.L$0;
                    g.y(obj);
                }
                if (sVar.f10741a != null) {
                    Logging.warn$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                    return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.HMS_TOKEN_TIMEOUT);
                }
                Logging.debug$default("HMS registered with ID:" + ((String) sVar.f10741a), null, 2, null);
                return new IPushRegistrator.RegisterResult((String) sVar.f10741a, SubscriptionStatus.SUBSCRIBED);
            }
        }
        pushRegistratorHMS$getHMSTokenTask$1 = new PushRegistratorHMS$getHMSTokenTask$1(this, interfaceC1218d);
        Object obj2 = pushRegistratorHMS$getHMSTokenTask$1.result;
        f.u();
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pushRegistratorHMS$getHMSTokenTask$1.label;
        if (i2 != 0) {
        }
        if (sVar.f10741a != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, InterfaceC1218d interfaceC1218d) {
        WaiterWithValue<String> waiterWithValue = this.waiter;
        if (waiterWithValue != null) {
            waiterWithValue.wake(str);
        }
        return v.f5689a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r5 = com.onesignal.user.internal.subscriptions.SubscriptionStatus.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r5 = new com.onesignal.notifications.internal.registration.IPushRegistrator.RegisterResult(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r5 = com.onesignal.user.internal.subscriptions.SubscriptionStatus.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC1218d interfaceC1218d) {
        PushRegistratorHMS$registerForPush$1 pushRegistratorHMS$registerForPush$1;
        int i2;
        if (interfaceC1218d instanceof PushRegistratorHMS$registerForPush$1) {
            pushRegistratorHMS$registerForPush$1 = (PushRegistratorHMS$registerForPush$1) interfaceC1218d;
            int i3 = pushRegistratorHMS$registerForPush$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pushRegistratorHMS$registerForPush$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pushRegistratorHMS$registerForPush$1.result;
                f.u();
                Object obj2 = EnumC1260a.f11058a;
                i2 = pushRegistratorHMS$registerForPush$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Context appContext = this._applicationService.getAppContext();
                    pushRegistratorHMS$registerForPush$1.label = 1;
                    obj = getHMSTokenTask(appContext, pushRegistratorHMS$registerForPush$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                IPushRegistrator.RegisterResult registerResult = (IPushRegistrator.RegisterResult) obj;
                i.b(registerResult);
                return registerResult;
            }
        }
        pushRegistratorHMS$registerForPush$1 = new PushRegistratorHMS$registerForPush$1(this, interfaceC1218d);
        Object obj3 = pushRegistratorHMS$registerForPush$1.result;
        f.u();
        Object obj22 = EnumC1260a.f11058a;
        i2 = pushRegistratorHMS$registerForPush$1.label;
        if (i2 != 0) {
        }
        IPushRegistrator.RegisterResult registerResult2 = (IPushRegistrator.RegisterResult) obj3;
        i.b(registerResult2);
        return registerResult2;
    }
}
