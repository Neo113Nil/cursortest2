package com.onesignal.core.internal.http.impl;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONObject;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequest$2", f = "HttpClient.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpClient$makeRequest$2 extends h implements InterfaceC1445p {
    final /* synthetic */ OptionalHeaders $headers;
    final /* synthetic */ JSONObject $jsonBody;
    final /* synthetic */ String $method;
    final /* synthetic */ int $timeout;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$makeRequest$2(HttpClient httpClient, String str, String str2, JSONObject jSONObject, int i2, OptionalHeaders optionalHeaders, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = httpClient;
        this.$url = str;
        this.$method = str2;
        this.$jsonBody = jSONObject;
        this.$timeout = i2;
        this.$headers = optionalHeaders;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new HttpClient$makeRequest$2(this.this$0, this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((HttpClient$makeRequest$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            HttpClient httpClient = this.this$0;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i3 = this.$timeout;
            OptionalHeaders optionalHeaders = this.$headers;
            this.label = 1;
            obj = httpClient.makeRequestIODispatcher(str, str2, jSONObject, i3, optionalHeaders, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return obj;
    }
}
