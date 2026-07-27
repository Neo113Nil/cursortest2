package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.user.internal.backend.IIdentityBackendService;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import e5.g;
import f4.v;
import g4.AbstractC0476u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class IdentityBackendService implements IIdentityBackendService {
    private final IHttpClient _httpClient;

    public IdentityBackendService(IHttpClient _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d) {
        IdentityBackendService$deleteAlias$1 identityBackendService$deleteAlias$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof IdentityBackendService$deleteAlias$1) {
            identityBackendService$deleteAlias$1 = (IdentityBackendService$deleteAlias$1) interfaceC1218d;
            int i3 = identityBackendService$deleteAlias$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                identityBackendService$deleteAlias$1.label = i3 - Integer.MIN_VALUE;
                Object obj = identityBackendService$deleteAlias$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = identityBackendService$deleteAlias$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str5, 15, null);
                    identityBackendService$deleteAlias$1.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, optionalHeaders, identityBackendService$deleteAlias$1);
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
        identityBackendService$deleteAlias$1 = new IdentityBackendService$deleteAlias$1(this, interfaceC1218d);
        Object obj2 = identityBackendService$deleteAlias$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = identityBackendService$deleteAlias$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, InterfaceC1218d interfaceC1218d) {
        IdentityBackendService$setAlias$1 identityBackendService$setAlias$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof IdentityBackendService$setAlias$1) {
            identityBackendService$setAlias$1 = (IdentityBackendService$setAlias$1) interfaceC1218d;
            int i3 = identityBackendService$setAlias$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                identityBackendService$setAlias$1.label = i3 - Integer.MIN_VALUE;
                Object obj = identityBackendService$setAlias$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = identityBackendService$setAlias$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put(IdentityModelStoreKt.IDENTITY_NAME_SPACE, JSONObjectExtensionsKt.putMap(new JSONObject(), map));
                    i.b(put);
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, null, str4, 15, null);
                    identityBackendService$setAlias$1.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, optionalHeaders, identityBackendService$setAlias$1);
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
                i.b(payload);
                JSONObject jSONObject = new JSONObject(payload).getJSONObject(IdentityModelStoreKt.IDENTITY_NAME_SPACE);
                i.d(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = JSONObjectExtensionsKt.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0476u.W(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        identityBackendService$setAlias$1 = new IdentityBackendService$setAlias$1(this, interfaceC1218d);
        Object obj2 = identityBackendService$setAlias$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = identityBackendService$setAlias$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
