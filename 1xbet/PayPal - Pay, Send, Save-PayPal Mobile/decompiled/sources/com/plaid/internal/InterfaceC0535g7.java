package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u0006\u0010\u000bJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0006\u0010\u0010"}, d2 = {"Lcom/plaid/internal/g7;", "", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;", "request", "Lcom/plaid/internal/i4;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishResponse;", "a", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;", "Lretrofit2/Call;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartResponse;", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;)Lretrofit2/Call;", "", "id", "vfp", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveFinishResponse;", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.plaid.internal.g7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC0535g7 {
    @retrofit2.http.Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @retrofit2.http.POST("/link/sna/twilio/finish")
    java.lang.Object a(@retrofit2.http.Body com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishResponse, ? extends java.lang.Object>> continuation);

    @retrofit2.http.Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @retrofit2.http.POST("link/sna/prove/start")
    retrofit2.Call<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse> a(@retrofit2.http.Body com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest request);

    @retrofit2.http.Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @retrofit2.http.GET("link/sna/prove/finish")
    retrofit2.Call<com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse> a(@retrofit2.http.Query("id") java.lang.String id, @retrofit2.http.Query("vfp") java.lang.String vfp);
}
