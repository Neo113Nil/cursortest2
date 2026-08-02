package com.discover.mpos.sdk.card;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u0016\u001a\u00020\tH&J\b\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0011H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006&"}, d2 = {"Lcom/discover/mpos/sdk/card/Card;", "", "connector", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "getConnector", "()Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "setConnector", "(Lcom/discover/mpos/sdk/card/connectors/CardConnector;)V", "activateProtocol", "", "onCardPresentedCallback", "Lcom/discover/mpos/sdk/card/OnCardPresentedCallback;", "dataGetProcessingOptionsCommand", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "p1", "", "commandData", "", "dataReadRecord", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponse;", "recordNumber", "referenceControlParameter", "deactivateProtocol", "getDataCommand", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "getProcessingOptions", "filledPdol", "putDataCommand", "Lcom/discover/mpos/sdk/card/apdu/putdata/PutDataResponse;", "readRecord", "resumeGetProcessingOptions", "selectApplication", "Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponse;", "appId", "", "selectPPSE", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "ddf", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface Card {
    com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse a(int i, byte[] bArr);

    com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse a(byte[] bArr);

    com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse a(int i, int i2);

    com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponse a(java.lang.String str);

    com.discover.mpos.sdk.card.connectors.CardConnector a();

    void a(com.discover.mpos.sdk.card.OnCardPresentedCallback onCardPresentedCallback);

    void a(com.discover.mpos.sdk.card.connectors.CardConnector cardConnector);

    com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse b(int i, byte[] bArr);

    com.discover.mpos.sdk.card.apdu.putdata.PutDataResponse b(byte[] bArr);

    com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse b(int i, int i2);

    com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse b(java.lang.String str);

    void b();

    com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse c();
}
