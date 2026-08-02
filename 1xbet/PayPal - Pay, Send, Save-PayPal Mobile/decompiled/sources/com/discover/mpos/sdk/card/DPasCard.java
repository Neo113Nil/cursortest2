package com.discover.mpos.sdk.card;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006,"}, d2 = {"Lcom/discover/mpos/sdk/card/DPasCard;", "Lcom/discover/mpos/sdk/card/Card;", "apduFactory", "Lcom/discover/mpos/sdk/card/apdu/ApduFactory;", "(Lcom/discover/mpos/sdk/card/apdu/ApduFactory;)V", "cardConnector", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "connector", "getConnector", "()Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "setConnector", "(Lcom/discover/mpos/sdk/card/connectors/CardConnector;)V", "activateProtocol", "", "onCardPresentedCallback", "Lcom/discover/mpos/sdk/card/OnCardPresentedCallback;", "dataGetProcessingOptionsCommand", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "p1", "", "commandData", "", "dataReadRecord", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponse;", "recordNumber", "referenceControlParameter", "deactivateProtocol", "debugTag", "", "getDataCommand", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "getProcessingOptions", "filledPdol", "putDataCommand", "Lcom/discover/mpos/sdk/card/apdu/putdata/PutDataResponse;", "readRecord", "resumeGetProcessingOptions", "selectApplication", "Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponse;", "appId", "selectPPSE", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "ddf", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DPasCard implements com.discover.mpos.sdk.card.Card {

    /* renamed from: a, reason: collision with root package name */
    private com.discover.mpos.sdk.card.connectors.CardConnector f2975a;
    private final com.discover.mpos.sdk.card.apdu.ApduFactory b;

    private DPasCard(com.discover.mpos.sdk.card.apdu.ApduFactory apduFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduFactory, "");
        this.b = apduFactory;
    }

    public /* synthetic */ DPasCard() {
        this(new com.discover.mpos.sdk.card.apdu.ApduFactory());
    }

    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.connectors.CardConnector a() {
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return cardConnector;
    }

    @Override // com.discover.mpos.sdk.card.Card
    public final void a(com.discover.mpos.sdk.card.connectors.CardConnector cardConnector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnector, "");
        this.f2975a = cardConnector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponse a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new java.lang.Object[]{str};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationCommand selectApplicationCommand = new com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationCommand(com.discover.mpos.sdk.card.apdu.ApduFactory.a(new com.discover.mpos.sdk.card.apdu.base.HexStringCommandData(str)), new com.discover.mpos.sdk.card.apdu.processors.selectapplication.SelectApplicationProcessor(new com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor(new com.discover.mpos.sdk.card.apdu.processors.selectapplication.FciProprietaryTemplateSelectApplication(new com.discover.mpos.sdk.card.apdu.processors.selectapplication.IssuerDiscretionaryDataSelectApplication()))), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator());
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponse) selectApplicationCommand.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new java.lang.Object[]{str};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSECommand selectPPSECommand = new com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSECommand(com.discover.mpos.sdk.card.apdu.ApduFactory.a(new com.discover.mpos.sdk.card.apdu.base.StringCommandData(str)), new com.discover.mpos.sdk.card.apdu.processors.selectppse.SelectPpseApduProcessor(new com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor(new com.discover.mpos.sdk.card.apdu.processors.selectppse.ProprietaryTemplateDataPpseProcessor(new com.discover.mpos.sdk.card.apdu.processors.selectppse.IssuerDataProcessorPpse()))), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator());
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse) selectPPSECommand.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsCommand a2 = com.discover.mpos.sdk.card.apdu.ApduFactory.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.GET_PROCESSING_OPTIONS, 0, 3), bArr);
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse) a2.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse a(int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{java.lang.Integer.valueOf(i), bArr};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsCommand a2 = com.discover.mpos.sdk.card.apdu.ApduFactory.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.RESUME_GET_PROCESSING_OPTIONS, i, 2), bArr);
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse) a2.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse b(int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{java.lang.Integer.valueOf(i), bArr};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsCommand a2 = com.discover.mpos.sdk.card.apdu.ApduFactory.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.a(com.discover.mpos.sdk.card.apdu.emv.Apdu.DATA_GET_PROCESSING_OPTIONS, i, 2), bArr);
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse) a2.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse a(int i, int i2) {
        new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
        com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordCommand readRecordCommand = new com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordCommand(new com.discover.mpos.sdk.card.apdu.base.ApduRequest(com.discover.mpos.sdk.card.apdu.emv.Apdu.READ_RECORD.a(i, i2), null, 0, 2, null), new com.discover.mpos.sdk.card.apdu.processors.readrecord.ReadRecordProcessor(), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator());
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse) readRecordCommand.a(cardConnector);
    }

    @Override // com.discover.mpos.sdk.card.Card
    public final void a(com.discover.mpos.sdk.card.OnCardPresentedCallback onCardPresentedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCardPresentedCallback, "");
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cardConnector.setEnabled(true);
        cardConnector.setOnConnectionEstablishedCallback(new com.discover.mpos.sdk.card.DPasCard.a(cardConnector, this, onCardPresentedCallback));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/discover/mpos/sdk/card/DPasCard$activateProtocol$1$1", "Lcom/discover/mpos/sdk/card/connectors/CardConnector$OnConnectionEstablishedCallback;", "onConnectionSet", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.card.b$a */
    public static final class a implements com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.card.connectors.CardConnector f2976a;
        final /* synthetic */ com.discover.mpos.sdk.card.DPasCard b;
        final /* synthetic */ com.discover.mpos.sdk.card.OnCardPresentedCallback c;

        a(com.discover.mpos.sdk.card.connectors.CardConnector cardConnector, com.discover.mpos.sdk.card.DPasCard dPasCard, com.discover.mpos.sdk.card.OnCardPresentedCallback onCardPresentedCallback) {
            this.f2976a = cardConnector;
            this.b = dPasCard;
            this.c = onCardPresentedCallback;
        }

        @Override // com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback
        public final void onConnectionSet() {
            this.f2976a.setOnConnectionEstablishedCallback(null);
            this.c.a();
        }
    }

    @Override // com.discover.mpos.sdk.card.Card
    public final void b() {
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cardConnector.setEnabled(false);
        cardConnector.setOnConnectionEstablishedCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.putdata.PutDataResponse b(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return (com.discover.mpos.sdk.card.apdu.putdata.PutDataResponse) new com.discover.mpos.sdk.card.apdu.putdata.PutDataCommand(new com.discover.mpos.sdk.card.apdu.base.ApduRequest(com.discover.mpos.sdk.card.apdu.emv.Apdu.PUT_DATA.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 63), new com.discover.mpos.sdk.card.apdu.base.ByteCommandData(bArr), null, 4, null), new com.discover.mpos.sdk.card.apdu.processors.putdata.PutDataProcessor(), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator()).a(a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse b(int i, int i2) {
        new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
        com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordCommand readRecordCommand = new com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordCommand(new com.discover.mpos.sdk.card.apdu.base.ApduRequest(com.discover.mpos.sdk.card.apdu.emv.Apdu.READ_RECORD.a(i, i2), null, 0, 2, null), new com.discover.mpos.sdk.card.apdu.processors.readrecord.ReadRecordProcessor(), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator());
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse) readRecordCommand.a(cardConnector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.card.Card
    public final com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse c() {
        com.discover.mpos.sdk.card.apdu.getdata.GetDataCommand getDataCommand = new com.discover.mpos.sdk.card.apdu.getdata.GetDataCommand(new com.discover.mpos.sdk.card.apdu.base.ApduRequest(com.discover.mpos.sdk.card.apdu.emv.Apdu.GET_DATA.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 61), null, 0, 2, null), new com.discover.mpos.sdk.card.apdu.processors.getdata.GetDataProcessor(), new com.discover.mpos.sdk.card.apdu.validator.StatusWordValidator());
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = this.f2975a;
        if (cardConnector == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return (com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse) getDataCommand.a(cardConnector);
    }
}
