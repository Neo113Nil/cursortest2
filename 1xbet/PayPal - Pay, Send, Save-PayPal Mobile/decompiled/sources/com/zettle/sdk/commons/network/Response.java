package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/commons/network/Response;", "", "T", "Lcom/zettle/sdk/commons/network/Response$Parser;", "parser", "payload", "(Lcom/zettle/sdk/commons/network/Response$Parser;)Ljava/lang/Object;", "", "getHasPayload", "()Z", "hasPayload", "", "getStatus", "()I", "status", "Parser"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Response {

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/Response$Parser;", "T", "", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Parser<T> {
        T parse(org.json.JSONObject json);
    }

    boolean getHasPayload();

    int getStatus();

    <T> T payload(com.zettle.sdk.commons.network.Response.Parser<T> parser);
}
