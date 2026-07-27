package com.onesignal.core.internal.http.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.http.impl.HttpClient", f = "HttpClient.kt", l = {89, 92}, m = "makeRequest")
/* loaded from: classes.dex */
public final class HttpClient$makeRequest$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$makeRequest$1(HttpClient httpClient, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = httpClient;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object makeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        makeRequest = this.this$0.makeRequest(null, null, null, 0, null, this);
        return makeRequest;
    }
}
