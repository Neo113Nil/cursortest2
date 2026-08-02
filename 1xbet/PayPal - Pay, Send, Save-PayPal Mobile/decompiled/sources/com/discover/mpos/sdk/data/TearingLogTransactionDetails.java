package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001 B;\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "cardFeatureVersionNumber", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "additionalGpoRequestData", "p1", "", "(Ljava/lang/String;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;I)V", "getAdditionalGpoRequestData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureDescriptor", "getCardFeatureVersionNumber", "getP1", "()I", "setP1", "(I)V", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "clear", "", "copyOfPdolData", "", "tag", "getAid", "isEmpty", "", "toString", "Builder", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TearingLogTransactionDetails {

    /* renamed from: a, reason: collision with root package name */
    java.lang.String f3207a;
    final com.discover.mpos.sdk.core.emv.tlv.Tlv b;
    final com.discover.mpos.sdk.core.emv.tlv.Tlv c;
    final com.discover.mpos.sdk.transaction.processing.pdol.PdolData d;
    final com.discover.mpos.sdk.core.emv.tlv.Tlv e;
    int f;

    private TearingLogTransactionDetails(java.lang.String str, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, int i) {
        this.f3207a = str;
        this.b = tlv;
        this.c = tlv2;
        this.d = pdolData;
        this.e = tlv3;
        this.f = i;
    }

    public /* synthetic */ TearingLogTransactionDetails(java.lang.String str, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, int i, byte b) {
        this(str, tlv, tlv2, pdolData, tlv3, i);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.d.toString();
        int i = this.f;
        java.lang.String str = this.f3207a;
        java.lang.String hexString = this.b.toHexString();
        java.lang.String hexString2 = this.c.toHexString();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.e;
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOf(obj, java.lang.Integer.valueOf(i), str, hexString, hexString2, tlv != null ? tlv.toHexString() : null), null, null, null, 0, null, null, 63, null);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails$Builder;", "", "tearingLogTransactionDetails", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", "(Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;)V", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "p1", "", "(Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;I)V", "additionalGpoRequestData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "cardFeatureDescriptor", "cardFeatureVersionNumber", "build", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.data.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f3208a;
        public com.discover.mpos.sdk.core.emv.tlv.Tlv b;
        public com.discover.mpos.sdk.core.emv.tlv.Tlv c;
        public com.discover.mpos.sdk.core.emv.tlv.Tlv d;
        private final com.discover.mpos.sdk.transaction.processing.pdol.PdolData e;
        private final int f;

        public a(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolData, "");
            this.e = pdolData;
            this.f = i;
            this.b = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag(), null, 0, 0, 14, null);
            this.c = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_VERSION_NUMBER.getTag(), null, 0, 0, 14, null);
        }

        public final com.discover.mpos.sdk.data.TearingLogTransactionDetails a() {
            return new com.discover.mpos.sdk.data.TearingLogTransactionDetails(this.f3208a, this.b, this.c, this.e, this.d, this.f, (byte) 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails) {
            this(new com.discover.mpos.sdk.transaction.processing.pdol.PdolData(tearingLogTransactionDetails.d), tearingLogTransactionDetails.f);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingLogTransactionDetails, "");
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.b;
            byte[] content = tearingLogTransactionDetails.b.getContent();
            tlv.setContent(content != null ? java.util.Arrays.copyOf(content, content.length) : null);
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = this.c;
            byte[] content2 = tearingLogTransactionDetails.c.getContent();
            tlv2.setContent(content2 != null ? java.util.Arrays.copyOf(content2, content2.length) : null);
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = tearingLogTransactionDetails.e;
            this.d = tlv3 != null ? tlv3.copy() : null;
            this.f3208a = tearingLogTransactionDetails.f3207a;
        }
    }
}
