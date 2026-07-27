package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.backend.FCMParamsObject;
import f4.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ParamsBackendService$fetchParams$3 extends j implements InterfaceC1441l {
    final /* synthetic */ s $fcmParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamsBackendService$fetchParams$3(s sVar) {
        super(1);
        this.$fcmParams = sVar;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return v.f5689a;
    }

    public final void invoke(JSONObject it) {
        i.e(it, "it");
        s sVar = this.$fcmParams;
        String safeString = JSONObjectExtensionsKt.safeString(it, "api_key");
        sVar.f10741a = new FCMParamsObject(JSONObjectExtensionsKt.safeString(it, "project_id"), JSONObjectExtensionsKt.safeString(it, CommonUrlParts.APP_ID), safeString);
    }
}
