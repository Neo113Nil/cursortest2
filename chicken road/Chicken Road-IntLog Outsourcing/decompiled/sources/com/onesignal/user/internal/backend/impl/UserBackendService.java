package com.onesignal.user.internal.backend.impl;

import b2.AbstractC0279e;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import e5.g;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class UserBackendService implements IUserBackendService {
    private final IHttpClient _httpClient;

    public UserBackendService(IHttpClient _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, String str2, InterfaceC1218d interfaceC1218d) {
        UserBackendService$createUser$1 userBackendService$createUser$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof UserBackendService$createUser$1) {
            userBackendService$createUser$1 = (UserBackendService$createUser$1) interfaceC1218d;
            int i3 = userBackendService$createUser$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userBackendService$createUser$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userBackendService$createUser$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = userBackendService$createUser$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put(IdentityModelStoreKt.IDENTITY_NAME_SPACE, JSONObjectExtensionsKt.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", JSONConverter.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", JSONObjectExtensionsKt.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    IHttpClient iHttpClient = this._httpClient;
                    String f3 = AbstractC0279e.f("apps/", str, "/users");
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str2, 15, null);
                    userBackendService$createUser$1.label = 1;
                    obj = iHttpClient.post(f3, jSONObject, optionalHeaders, userBackendService$createUser$1);
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
                JSONConverter jSONConverter = JSONConverter.INSTANCE;
                String payload = httpResponse.getPayload();
                i.b(payload);
                return jSONConverter.convertToCreateUserResponse(new JSONObject(payload));
            }
        }
        userBackendService$createUser$1 = new UserBackendService$createUser$1(this, interfaceC1218d);
        Object obj2 = userBackendService$createUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = userBackendService$createUser$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, InterfaceC1218d interfaceC1218d) {
        UserBackendService$getUser$1 userBackendService$getUser$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof UserBackendService$getUser$1) {
            userBackendService$getUser$1 = (UserBackendService$getUser$1) interfaceC1218d;
            int i3 = userBackendService$getUser$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userBackendService$getUser$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userBackendService$getUser$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = userBackendService$getUser$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    userBackendService$getUser$1.label = 1;
                    obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, optionalHeaders, userBackendService$getUser$1);
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
                return JSONConverter.INSTANCE.convertToCreateUserResponse(new JSONObject(httpResponse.getPayload()));
            }
        }
        userBackendService$getUser$1 = new UserBackendService$getUser$1(this, interfaceC1218d);
        Object obj2 = userBackendService$getUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = userBackendService$getUser$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, InterfaceC1218d interfaceC1218d) {
        UserBackendService$updateUser$1 userBackendService$updateUser$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof UserBackendService$updateUser$1) {
            userBackendService$updateUser$1 = (UserBackendService$updateUser$1) interfaceC1218d;
            int i3 = userBackendService$updateUser$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userBackendService$updateUser$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userBackendService$updateUser$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = userBackendService$updateUser$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z);
                    if (propertiesObject.getHasAtLeastOnePropertySet()) {
                        put.put("properties", JSONConverter.INSTANCE.convertToJSON(propertiesObject));
                    }
                    if (propertiesDeltasObject.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", JSONConverter.INSTANCE.convertToJSON(propertiesDeltasObject));
                    }
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    userBackendService$updateUser$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3, put, optionalHeaders, userBackendService$updateUser$1);
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
                String payload = httpResponse.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new RywData(safeString, safeLong);
                }
                return null;
            }
        }
        userBackendService$updateUser$1 = new UserBackendService$updateUser$1(this, interfaceC1218d);
        Object obj2 = userBackendService$updateUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = userBackendService$updateUser$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
