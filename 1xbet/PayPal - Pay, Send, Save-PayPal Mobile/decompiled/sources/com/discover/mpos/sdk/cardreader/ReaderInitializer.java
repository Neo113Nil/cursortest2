package com.discover.mpos.sdk.cardreader;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/ReaderInitializer;", "", "card", "Lcom/discover/mpos/sdk/card/Card;", "getCard", "()Lcom/discover/mpos/sdk/card/Card;", "connectorHub", "Lcom/discover/mpos/sdk/card/connectors/ConnectorHub;", "getConnectorHub", "()Lcom/discover/mpos/sdk/card/connectors/ConnectorHub;", "connectors", "", "Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "getConnectors", "()Ljava/util/Map;", "entryPoint", "Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;", "getEntryPoint", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;", "kernels", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "getKernels", "unpredictableNumberGenerator", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "getUnpredictableNumberGenerator", "()Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ReaderInitializer {
    com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint a();

    com.discover.mpos.sdk.card.Card b();

    java.util.Map<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> c();

    com.discover.mpos.sdk.card.connectors.ConnectorHub d();

    java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> e();

    com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator f();
}
