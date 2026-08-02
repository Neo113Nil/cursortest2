package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/ApduCommand;", "Response", "", "createResponse", "()Ljava/lang/Object;", "executeOn", "connector", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "(Lcom/discover/mpos/sdk/card/connectors/CardConnector;)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.base.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ApduCommand<Response> {
    Response a();

    Response a(com.discover.mpos.sdk.card.connectors.CardConnector cardConnector);
}
