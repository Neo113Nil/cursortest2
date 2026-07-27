package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.JSONUtils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationOpenedProcessorHMS implements INotificationOpenedProcessorHMS {
    private final INotificationLifecycleService _lifecycleService;

    public NotificationOpenedProcessorHMS(INotificationLifecycleService _lifecycleService) {
        i.e(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!NotificationFormatHelper.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        i.b(intent);
        Bundle extras = intent.getExtras();
        JSONUtils jSONUtils = JSONUtils.INSTANCE;
        i.b(extras);
        JSONObject bundleAsJSONObject = jSONUtils.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1 notificationOpenedProcessorHMS$handleProcessJsonOpenData$1;
        Object obj;
        int i2;
        NotificationOpenedProcessorHMS notificationOpenedProcessorHMS;
        if (interfaceC1218d instanceof NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1) {
            notificationOpenedProcessorHMS$handleProcessJsonOpenData$1 = (NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1) interfaceC1218d;
            int i3 = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label = i3 - Integer.MIN_VALUE;
                obj = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0 = this;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1 = activity;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2 = jSONObject;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label = 1;
                    obj = iNotificationLifecycleService.canOpenNotification(activity, jSONObject, notificationOpenedProcessorHMS$handleProcessJsonOpenData$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationOpenedProcessorHMS = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2;
                    activity = (Activity) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1;
                    notificationOpenedProcessorHMS = (NotificationOpenedProcessorHMS) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0;
                    g.y(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return vVar;
                }
                INotificationLifecycleService iNotificationLifecycleService2 = notificationOpenedProcessorHMS._lifecycleService;
                JSONArray wrapInJsonArray = JSONUtils.INSTANCE.wrapInJsonArray(jSONObject);
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label = 2;
                return iNotificationLifecycleService2.notificationOpened(activity, wrapInJsonArray, notificationOpenedProcessorHMS$handleProcessJsonOpenData$1) == enumC1260a ? enumC1260a : vVar;
            }
        }
        notificationOpenedProcessorHMS$handleProcessJsonOpenData$1 = new NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1(this, interfaceC1218d);
        obj = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) NotificationHelper.INSTANCE.getCustomJSONObject(jSONObject).remove(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
            if (str == null) {
                return;
            }
            jSONObject.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, str);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, InterfaceC1218d interfaceC1218d) {
        v vVar = v.f5689a;
        if (intent == null) {
            return vVar;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return vVar;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, interfaceC1218d);
        return handleProcessJsonOpenData == EnumC1260a.f11058a ? handleProcessJsonOpenData : vVar;
    }
}
