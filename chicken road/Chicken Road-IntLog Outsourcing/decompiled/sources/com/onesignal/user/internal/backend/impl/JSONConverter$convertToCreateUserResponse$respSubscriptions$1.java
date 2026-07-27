package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class JSONConverter$convertToCreateUserResponse$respSubscriptions$1 extends j implements InterfaceC1441l {
    public static final JSONConverter$convertToCreateUserResponse$respSubscriptions$1 INSTANCE = new JSONConverter$convertToCreateUserResponse$respSubscriptions$1();

    public JSONConverter$convertToCreateUserResponse$respSubscriptions$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final SubscriptionObject invoke(JSONObject it) {
        i.e(it, "it");
        SubscriptionObjectType.Companion companion = SubscriptionObjectType.Companion;
        String string = it.getString(WebViewManager.EVENT_TYPE_KEY);
        i.d(string, "getString(...)");
        SubscriptionObjectType fromString = companion.fromString(string);
        if (fromString != null) {
            return new SubscriptionObject(it.getString(OutcomeConstants.OUTCOME_ID), fromString, JSONObjectExtensionsKt.safeString(it, "token"), JSONObjectExtensionsKt.safeBool(it, "enabled"), JSONObjectExtensionsKt.safeInt(it, "notification_types"), JSONObjectExtensionsKt.safeString(it, OtelConfigRemoteOneSignal.OTEL_PATH), JSONObjectExtensionsKt.safeString(it, "device_model"), JSONObjectExtensionsKt.safeString(it, "device_os"), JSONObjectExtensionsKt.safeBool(it, "rooted"), JSONObjectExtensionsKt.safeInt(it, "net_type"), JSONObjectExtensionsKt.safeString(it, "carrier"), JSONObjectExtensionsKt.safeString(it, "app_version"));
        }
        return null;
    }
}
