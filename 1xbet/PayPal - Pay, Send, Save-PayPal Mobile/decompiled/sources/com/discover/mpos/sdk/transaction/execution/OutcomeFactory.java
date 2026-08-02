package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0006\u0010\u001f\u001a\u00020\u001aJ\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\"\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0002J\u0006\u0010.\u001a\u00020\u001aJ\u0006\u0010/\u001a\u000200R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n¨\u00061"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/OutcomeFactory;", "", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "(Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;)V", "config", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "ffi", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getFfi", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "getTransaction", "()Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "tsi", "getTsi", "tsiAndTvrFfi", "", "getTsiAndTvrFfi", "()Ljava/util/List;", "tvr", "getTvr", "approvedOutcome", "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "commonDataRecord", "Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "dataFromICC", "dataFromTerminal", "declineOutcome", "discretionaryData", "", "emvDataPreProcessing", "emvDataTerminalConfig", "endApplication", "status", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEndStatus;", "messageIdentifier", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest$MessageIdentifier;", "isDataRecordPresent", "", "generateOutcomeUiRequest", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "messageId", "onlineOutcome", "writeDataStorage", "Lcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OutcomeFactory {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.transaction.processing.ProcessingData f3232a;
    private final com.discover.mpos.sdk.transaction.TransactionData b;
    private final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration c;
    private final com.discover.mpos.sdk.transaction.internal.InternalTransaction d;

    public OutcomeFactory(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        this.d = internalTransaction;
        this.f3232a = internalTransaction.j();
        this.b = internalTransaction.getTransactionData();
        this.c = internalTransaction.getConfig();
    }

    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a() {
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect;
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        com.discover.mpos.sdk.core.emv.tlv.Tlv[] tlvArr = new com.discover.mpos.sdk.core.emv.tlv.Tlv[3];
        tlvArr[0] = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_STATUS_INFORMATION.getTag(), this.f3232a.i());
        tlvArr[1] = f();
        java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.FORM_FACTOR_IDENTIFIER.getTag();
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = this.f3232a.j;
        tlvArr[2] = new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, (selectApplicationResponseContent == null || (fciTemplate = selectApplicationResponseContent.f2967a) == null || (proprietaryTemplateDataSelect = fciTemplate.b) == null || (fciIssuerDataSelect = proprietaryTemplateDataSelect.f) == null || (tlv = fciIssuerDataSelect.b) == null) ? null : tlv.getContent(), 0, 0, 12, null);
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) tlvArr);
    }

    private final com.discover.mpos.sdk.core.emv.tlv.Tlv f() {
        return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_VERIFICATION_RESULTS.getTag(), this.f3232a.h());
    }

    final com.discover.mpos.sdk.transaction.outcome.UiRequest a(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier messageIdentifier) {
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = this.f3232a;
        com.discover.mpos.sdk.core.data.Amount amount = (com.discover.mpos.sdk.core.data.Amount) processingData.t.a(processingData, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[14]);
        com.discover.mpos.sdk.transaction.outcome.UiRequest.Status status = com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.CARD_READ_SUCCESSFULLY;
        com.discover.mpos.sdk.transaction.outcome.UiRequest.ValueQualifier valueQualifier = com.discover.mpos.sdk.transaction.outcome.UiRequest.ValueQualifier.BALANCE;
        if (amount == null) {
            valueQualifier = null;
        }
        return new com.discover.mpos.sdk.transaction.outcome.UiRequest(messageIdentifier, status, null, null, valueQualifier, amount, java.lang.Integer.valueOf(this.b.getCurrency().getNumericCode()), 12, null);
    }

    final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder b() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_CAPABILITIES.getTag(), this.c.getTerminalConfiguration().getCapabilities()));
        com.discover.mpos.sdk.transaction.TransactionData transactionData = this.b;
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append2 = append.append(new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_NUMERIC.getTag(), transactionData.getEmvAmountAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null)).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_NUMERIC.getTag(), transactionData.getEmvCashbackAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null)).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_DATE.getTag(), com.discover.mpos.sdk.core.extensions.DateExtKt.getFormattedDate(transactionData.getTransactionDate()))).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_TYPE.getTag(), transactionData.getType().getEmvValue())));
        com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration = this.c.getTerminalConfiguration();
        return append2.append(new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_COUNTRY_CODE.getTag(), terminalConfiguration.getCountryCode())).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TYPE.getTag(), terminalConfiguration.getTerminalType().getEmvValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder c() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
        java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_IDENTIFIER_AID_TERMINAL.getTag();
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = this.f3232a;
        return byteArrayBuilder.append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, (java.lang.String) processingData.s.a(processingData, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[9]))).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.UNPREDICTABLE_NUMBER.getTag(), this.f3232a.b(), 0, 0, 12, null)).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_VERSION_NUMBER_TERMINAL.getTag(), this.c.getTerminalConfiguration().getApplicationVersionNumber()));
    }

    final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder d() {
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = this.f3232a;
        if (processingData.q == null) {
            processingData.q = this.f3232a.k();
        }
        return new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_CRYPTOGRAM.getTag(), processingData.q, 0, 0, 12, null)).append(processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_CRYPTOGRAM.getTag())).append(processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_INTERCHANGE_PROFILE.getTag())).append(processingData.b(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIMARY_ACCOUNT_NUMBER_PAN_SEQUENCE_NUMBER.getTag())).append(processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_TRANSACTION_COUNTER_ATC.getTag())).append(processingData.b(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_USAGE_CONTROL.getTag())).append(processingData.d(com.discover.mpos.sdk.core.emv.tlv.Tag.CARDHOLDER_NAME.getTag())).append(processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.CRYPTOGRAM_INFORMATION_DATA.getTag())).append(processingData.d(com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag())).append(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag(), (byte[]) processingData.u.a(processingData, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[15]), 0, 0, 12, null)).append(processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_APPLICATION_DATA.getTag())).append(f()).append(processingData.b(com.discover.mpos.sdk.core.emv.tlv.Tag.TRACK_1_DISCRETIONARY_DATA.getTag())).append(processingData.b(com.discover.mpos.sdk.core.emv.tlv.Tag.TRACK_2_EQUIVALENT_DATA.getTag())).append(processingData.b(com.discover.mpos.sdk.core.emv.tlv.Tag.PAYMENT_ACCOUNT_REFERENCE.getTag()));
    }

    public final com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome e() {
        com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration;
        java.lang.String str;
        com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combination$mpos_sdk_card_reader_offlineRegularRelease = this.d.getConfig().getCombination$mpos_sdk_card_reader_offlineRegularRelease(this.d.getTransactionData().getType(), this.d.j().h.c);
        if (combination$mpos_sdk_card_reader_offlineRegularRelease != null) {
            com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = this.d.j().h.c;
            if (candidate == null || (str = candidate.getAdfName()) == null) {
                str = "";
            }
            combinationConfiguration = combination$mpos_sdk_card_reader_offlineRegularRelease.copy((r18 & 1) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.applicationIdentifier : str, (r18 & 2) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.kernelId : null, (r18 & 4) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.entryPointConfigurationData : null, (r18 & 8) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.deferredAuthorizationSupported : false, (r18 & 16) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.dataStorageSupported : false, (r18 & 32) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.extendedLoggingSupported : false, (r18 & 64) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.tearingRecoverySupported : false, (r18 & 128) != 0 ? combination$mpos_sdk_card_reader_offlineRegularRelease.dataContainerReadList : null);
        } else {
            combinationConfiguration = null;
        }
        return new com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome(new com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate(combinationConfiguration, this.d.getTransactionData(), this.d.j()));
    }
}
