package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.common.DateUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.customEvents.ICustomEventBackendService;
import e5.g;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CustomEventBackendService implements ICustomEventBackendService {
    private final IHttpClient httpClient;

    public CustomEventBackendService(IHttpClient httpClient) {
        i.e(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.onesignal.user.internal.customEvents.ICustomEventBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j2, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, InterfaceC1218d interfaceC1218d) {
        CustomEventBackendService$sendCustomEvent$1 customEventBackendService$sendCustomEvent$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof CustomEventBackendService$sendCustomEvent$1) {
            customEventBackendService$sendCustomEvent$1 = (CustomEventBackendService$sendCustomEvent$1) interfaceC1218d;
            int i3 = customEventBackendService$sendCustomEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                customEventBackendService$sendCustomEvent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = customEventBackendService$sendCustomEvent$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = customEventBackendService$sendCustomEvent$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put(IdentityConstants.ONESIGNAL_ID, str2);
                    if (str3 != null) {
                        jSONObject.put(IdentityConstants.EXTERNAL_ID, str3);
                    }
                    SimpleDateFormat iso8601Format = DateUtils.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    jSONObject.put("timestamp", iso8601Format.format(new Long(j2)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", customEventMetadata.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str6, 15, null);
                    customEventBackendService$sendCustomEvent$1.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, optionalHeaders, customEventBackendService$sendCustomEvent$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        customEventBackendService$sendCustomEvent$1 = new CustomEventBackendService$sendCustomEvent$1(this, interfaceC1218d);
        Object obj2 = customEventBackendService$sendCustomEvent$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = customEventBackendService$sendCustomEvent$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
