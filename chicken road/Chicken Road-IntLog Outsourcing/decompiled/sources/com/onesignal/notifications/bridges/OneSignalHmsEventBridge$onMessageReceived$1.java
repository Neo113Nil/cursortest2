package com.onesignal.notifications.bridges;

import B0.f;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONException;
import org.json.JSONObject;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onMessageReceived$1", f = "OneSignalHmsEventBridge.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalHmsEventBridge$onMessageReceived$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Context $context;
    final /* synthetic */ RemoteMessage $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalHmsEventBridge$onMessageReceived$1(Context context, RemoteMessage remoteMessage, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$context = context;
        this.$message = remoteMessage;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OneSignalHmsEventBridge$onMessageReceived$1(this.$context, this.$message, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        f.u();
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Context context = this.$context;
            this.label = 1;
            obj = OneSignal.initWithContext(context, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        v vVar = v.f5689a;
        if (!booleanValue) {
            return vVar;
        }
        OneSignal oneSignal = OneSignal.INSTANCE;
        ITime iTime = (ITime) oneSignal.getServices().getService(ITime.class);
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) oneSignal.getServices().getService(INotificationBundleProcessor.class);
        String data = this.$message.getData();
        try {
            JSONObject jSONObject = new JSONObject(this.$message.getData());
            if (this.$message.getTtl() == 0) {
                jSONObject.put("hms.ttl", 259200);
            } else {
                jSONObject.put("hms.ttl", this.$message.getTtl());
            }
            if (this.$message.getSentTime() == 0) {
                jSONObject.put("hms.sent_time", iTime.getCurrentTimeMillis());
            } else {
                jSONObject.put("hms.sent_time", this.$message.getSentTime());
            }
            data = jSONObject.toString();
        } catch (JSONException unused) {
            Logging.warn$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
        }
        if (data == null) {
            return vVar;
        }
        Bundle jsonStringToBundle = JSONUtils.INSTANCE.jsonStringToBundle(data);
        if (jsonStringToBundle == null) {
            return vVar;
        }
        iNotificationBundleProcessor.processBundleFromReceiver(this.$context, jsonStringToBundle);
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OneSignalHmsEventBridge$onMessageReceived$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
