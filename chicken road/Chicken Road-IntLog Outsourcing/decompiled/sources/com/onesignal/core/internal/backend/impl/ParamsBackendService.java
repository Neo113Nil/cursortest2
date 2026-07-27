package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.backend.FCMParamsObject;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.InfluenceParamsObject;
import com.onesignal.core.internal.backend.ParamsObject;
import com.onesignal.core.internal.backend.RemoteLoggingParamsObject;
import com.onesignal.core.internal.http.CacheKeys;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ParamsBackendService implements IParamsBackendService {
    private final IHttpClient _http;

    public ParamsBackendService(IHttpClient _http) {
        i.e(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfluenceParamsObject processOutcomeJson(JSONObject jSONObject) {
        s sVar = new s();
        s sVar2 = new s();
        s sVar3 = new s();
        s sVar4 = new s();
        s sVar5 = new s();
        s sVar6 = new s();
        s sVar7 = new s();
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "direct", new ParamsBackendService$processOutcomeJson$1(sVar5));
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, OutcomeConstants.INDIRECT, new ParamsBackendService$processOutcomeJson$2(sVar6, sVar, sVar2, sVar3, sVar4));
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "unattributed", new ParamsBackendService$processOutcomeJson$3(sVar7));
        return new InfluenceParamsObject((Integer) sVar.f10741a, (Integer) sVar2.f10741a, (Integer) sVar3.f10741a, (Integer) sVar4.f10741a, (Boolean) sVar5.f10741a, (Boolean) sVar6.f10741a, (Boolean) sVar7.f10741a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.onesignal.core.internal.backend.IParamsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, InterfaceC1218d interfaceC1218d) {
        ParamsBackendService$fetchParams$1 paramsBackendService$fetchParams$1;
        int i2;
        ParamsBackendService paramsBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof ParamsBackendService$fetchParams$1) {
            paramsBackendService$fetchParams$1 = (ParamsBackendService$fetchParams$1) interfaceC1218d;
            int i3 = paramsBackendService$fetchParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                paramsBackendService$fetchParams$1.label = i3 - Integer.MIN_VALUE;
                Object obj = paramsBackendService$fetchParams$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = paramsBackendService$fetchParams$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.log(LogLevel.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/android_params.js");
                    String sb2 = sb.toString();
                    if (str2 != null && !IDManager.INSTANCE.isLocalId(str2)) {
                        sb2 = sb2 + "?player_id=" + str2;
                    }
                    IHttpClient iHttpClient = this._http;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(CacheKeys.REMOTE_PARAMS, null, null, null, null, 30, null);
                    paramsBackendService$fetchParams$1.L$0 = this;
                    paramsBackendService$fetchParams$1.label = 1;
                    obj = iHttpClient.get(sb2, optionalHeaders, paramsBackendService$fetchParams$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    paramsBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paramsBackendService = (ParamsBackendService) paramsBackendService$fetchParams$1.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                try {
                    JSONObject jSONObject = new JSONObject(payload == null ? "" : payload);
                    s sVar = new s();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, "outcomes", new ParamsBackendService$fetchParams$2(sVar, paramsBackendService));
                    s sVar2 = new s();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, "fcm", new ParamsBackendService$fetchParams$3(sVar2));
                    s sVar3 = new s();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, "logging_config", new ParamsBackendService$fetchParams$4(sVar3));
                    String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "android_sender_id");
                    Boolean safeBool = JSONObjectExtensionsKt.safeBool(jSONObject, "enterp");
                    Boolean safeBool2 = JSONObjectExtensionsKt.safeBool(jSONObject, "jwt_required");
                    JSONArray optJSONArray = jSONObject.optJSONArray("chnl_lst");
                    Boolean safeBool3 = JSONObjectExtensionsKt.safeBool(jSONObject, "fba");
                    Boolean safeBool4 = JSONObjectExtensionsKt.safeBool(jSONObject, "restore_ttl_filter");
                    Boolean safeBool5 = JSONObjectExtensionsKt.safeBool(jSONObject, "clear_group_on_summary_click");
                    Boolean safeBool6 = JSONObjectExtensionsKt.safeBool(jSONObject, "receive_receipts_enable");
                    Boolean safeBool7 = JSONObjectExtensionsKt.safeBool(jSONObject, "disable_gms_missing_prompt");
                    Boolean safeBool8 = JSONObjectExtensionsKt.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
                    Boolean safeBool9 = JSONObjectExtensionsKt.safeBool(jSONObject, "location_shared");
                    Boolean safeBool10 = JSONObjectExtensionsKt.safeBool(jSONObject, "requires_user_privacy_consent");
                    Long safeLong = JSONObjectExtensionsKt.safeLong(jSONObject, "oprepo_execution_interval");
                    InfluenceParamsObject influenceParamsObject = (InfluenceParamsObject) sVar.f10741a;
                    InfluenceParamsObject influenceParamsObject2 = influenceParamsObject == null ? new InfluenceParamsObject(null, null, null, null, null, null, null, 127, null) : influenceParamsObject;
                    FCMParamsObject fCMParamsObject = (FCMParamsObject) sVar2.f10741a;
                    FCMParamsObject fCMParamsObject2 = fCMParamsObject == null ? new FCMParamsObject(null, null, null, 7, null) : fCMParamsObject;
                    RemoteLoggingParamsObject remoteLoggingParamsObject = (RemoteLoggingParamsObject) sVar3.f10741a;
                    if (remoteLoggingParamsObject == null) {
                        remoteLoggingParamsObject = new RemoteLoggingParamsObject(null, false, 3, null);
                    }
                    return new ParamsObject(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, influenceParamsObject2, fCMParamsObject2, remoteLoggingParamsObject);
                } catch (JSONException e3) {
                    Logging.warn("ParamsBackendService.fetchParams: malformed (non-JSON) response payload, will retry. status=" + httpResponse.getStatusCode(), e3);
                    throw new BackendException(httpResponse.getStatusCode(), payload, httpResponse.getRetryAfterSeconds());
                }
            }
        }
        paramsBackendService$fetchParams$1 = new ParamsBackendService$fetchParams$1(this, interfaceC1218d);
        Object obj2 = paramsBackendService$fetchParams$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = paramsBackendService$fetchParams$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
