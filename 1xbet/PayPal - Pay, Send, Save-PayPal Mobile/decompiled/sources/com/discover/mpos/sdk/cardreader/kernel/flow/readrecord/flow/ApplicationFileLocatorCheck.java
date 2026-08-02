package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/ApplicationFileLocatorCheck;", "Lcom/discover/mpos/sdk/cardreader/kernel/DefaultTagValidationStepEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordData;", "()V", "debugTag", "", "handleValidationFailure", "", "tlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "handleValidationSucceed", "retrieveTag", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ApplicationFileLocatorCheck extends com.discover.mpos.sdk.cardreader.kernel.DefaultTagValidationStepEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> {
    public ApplicationFileLocatorCheck() {
        super(null, null, 3);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final void a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.p();
        transactionEx.k().a(transactionEx, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.CARD_READ_OK_REMOVE_CARD, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.CARD_READ_SUCCESSFULLY, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        transactionEx.s();
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final void b(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        java.util.ArrayList emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData q = transactionEx.q();
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser applicationFileLocatorParser = q.c;
        byte[] content = tlv.getContent();
        if (content != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(content.length / applicationFileLocatorParser.f3167a);
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.collections.ArraysKt.getIndices(content), applicationFileLocatorParser.f3167a);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 < 0 ? first >= last : first <= last) {
                while (true) {
                    int unsignedInt = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(content[first]);
                    int i = applicationFileLocatorParser.g;
                    int unsignedInt2 = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(content[first]);
                    int i2 = applicationFileLocatorParser.d;
                    arrayList.add(new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter((unsignedInt2 & i2) | applicationFileLocatorParser.c, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(content[applicationFileLocatorParser.b + first]), com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(content[applicationFileLocatorParser.e + first]), unsignedInt >> i, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(content[applicationFileLocatorParser.f + first])));
                    if (first == last) {
                        break;
                    } else {
                        first += step2;
                    }
                }
            }
            emptyList = arrayList;
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyList, "");
        q.b = emptyList;
        super.b(tlv, transactionEx);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = transactionEx.q().f3172a;
        return tlv == null ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_FILE_LOCATOR_AFL.getTag(), null, 0, 0, 14, null) : tlv;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final java.lang.String b() {
        return "ApplicationFileLocatorCheck";
    }
}
