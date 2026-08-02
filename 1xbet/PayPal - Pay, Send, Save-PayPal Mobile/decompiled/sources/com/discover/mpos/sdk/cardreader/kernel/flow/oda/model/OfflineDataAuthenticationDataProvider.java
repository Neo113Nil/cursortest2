package com.discover.mpos.sdk.cardreader.kernel.flow.oda.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OfflineDataAuthenticationDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OfflineDataAuthenticationData;", "()V", "ridLength", "", "startPosition", "findTag", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "readRecordData", "", "tag", "Lcom/discover/mpos/sdk/core/emv/tlv/Tag;", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.c.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OfflineDataAuthenticationDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3134a = 10;
    private final int b;

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx) {
        java.lang.String str;
        byte[] content;
        java.lang.String hexString;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = j.h.c;
        if (candidate != null) {
            java.lang.String aid = candidate.getAid();
            int i = this.b;
            int min = java.lang.Integer.min(candidate.getAid().length(), this.f3134a);
            if (aid == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String substring = aid.substring(i, min);
            if (substring != null) {
                str = substring;
                com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.CERTIFICATION_AUTHORITY_PUBLIC_KEY_INDEX_CARD);
                com.discover.mpos.sdk.transaction.processing.ProcessingData j2 = transactionEx.j();
                com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_CERTIFICATE);
                com.discover.mpos.sdk.core.emv.tlv.Tlv a4 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_EXPONENT);
                com.discover.mpos.sdk.core.emv.tlv.Tlv a5 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_REMAINDER);
                com.discover.mpos.sdk.core.emv.tlv.Tlv a6 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.INTEGRATED_CIRCUIT_CARD_ICC_PUBLIC_KEY_CERTIFICATE);
                com.discover.mpos.sdk.core.emv.tlv.Tlv a7 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.INTEGRATED_CIRCUIT_CARD_ICC_PUBLIC_KEY_EXPONENT);
                content = a2.getContent();
                if (content != null && (hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content)) != null) {
                    str2 = hexString;
                }
                return new com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData(j2, a3, a4, a5, a6, a7, a2, str, transactionEx.a(str, str2));
            }
        }
        str = "";
        com.discover.mpos.sdk.core.emv.tlv.Tlv a22 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.CERTIFICATION_AUTHORITY_PUBLIC_KEY_INDEX_CARD);
        com.discover.mpos.sdk.transaction.processing.ProcessingData j22 = transactionEx.j();
        com.discover.mpos.sdk.core.emv.tlv.Tlv a32 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_CERTIFICATE);
        com.discover.mpos.sdk.core.emv.tlv.Tlv a42 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_EXPONENT);
        com.discover.mpos.sdk.core.emv.tlv.Tlv a52 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_PUBLIC_KEY_REMAINDER);
        com.discover.mpos.sdk.core.emv.tlv.Tlv a62 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.INTEGRATED_CIRCUIT_CARD_ICC_PUBLIC_KEY_CERTIFICATE);
        com.discover.mpos.sdk.core.emv.tlv.Tlv a72 = a(j.d(), com.discover.mpos.sdk.core.emv.tlv.Tag.INTEGRATED_CIRCUIT_CARD_ICC_PUBLIC_KEY_EXPONENT);
        content = a22.getContent();
        if (content != null) {
            str2 = hexString;
        }
        return new com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData(j22, a32, a42, a52, a62, a72, a22, str, transactionEx.a(str, str2));
    }

    private static com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list, com.discover.mpos.sdk.core.emv.tlv.Tag tag) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), tag.getTag())) {
                break;
            }
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
        return tlv == null ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag.getTag(), null, 0, 0, 14, null) : tlv;
    }
}
