package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import e5.g;
import f4.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OutcomeEventsBackendService implements IOutcomeEventsBackendService {
    private final IHttpClient _http;

    public OutcomeEventsBackendService(IHttpClient _http) {
        i.e(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, OutcomeEvent outcomeEvent, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsBackendService$sendOutcomeEvent$1 outcomeEventsBackendService$sendOutcomeEvent$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof OutcomeEventsBackendService$sendOutcomeEvent$1) {
            outcomeEventsBackendService$sendOutcomeEvent$1 = (OutcomeEventsBackendService$sendOutcomeEvent$1) interfaceC1218d;
            int i3 = outcomeEventsBackendService$sendOutcomeEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsBackendService$sendOutcomeEvent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsBackendService$sendOutcomeEvent$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsBackendService$sendOutcomeEvent$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put(CommonUrlParts.APP_ID, str).put(IdentityConstants.ONESIGNAL_ID, str2).put("subscription", new JSONObject().put(OutcomeConstants.OUTCOME_ID, str3).put(WebViewManager.EVENT_TYPE_KEY, str4));
                    if (bool != null) {
                        put.put("direct", bool.booleanValue());
                    }
                    if (outcomeEvent.getNotificationIds() != null && outcomeEvent.getNotificationIds().length() > 0) {
                        put.put("notification_ids", outcomeEvent.getNotificationIds());
                    }
                    put.put(OutcomeConstants.OUTCOME_ID, outcomeEvent.getName());
                    if (outcomeEvent.getWeight() > 0.0f) {
                        put.put("weight", new Float(outcomeEvent.getWeight()));
                    }
                    if (outcomeEvent.getTimestamp() > 0) {
                        put.put("timestamp", outcomeEvent.getTimestamp());
                    }
                    if (outcomeEvent.getSessionTime() > 0) {
                        put.put("session_time", outcomeEvent.getSessionTime());
                    }
                    IHttpClient iHttpClient = this._http;
                    outcomeEventsBackendService$sendOutcomeEvent$1.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(iHttpClient, "outcomes/measure", put, null, outcomeEventsBackendService$sendOutcomeEvent$1, 4, null);
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
                return v.f5689a;
            }
        }
        outcomeEventsBackendService$sendOutcomeEvent$1 = new OutcomeEventsBackendService$sendOutcomeEvent$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsBackendService$sendOutcomeEvent$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsBackendService$sendOutcomeEvent$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
