package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0007HÂ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\b\u0010%\u001a\u00020\u000eH\u0002J\u0013\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u001aH\u0016J\t\u0010+\u001a\u00020\u0016HÖ\u0001J\b\u0010,\u001a\u00020\u001eH\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020 H\u0016J\u0010\u0010/\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020\u000eH\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/discover/mpos/sdk/data/TearingRecoveryLog;", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "builder", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails$Builder;", "(Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails$Builder;)V", "()V", "tearingLogTransactionDetails", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", "(Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;)V", "additionalData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getAdditionalData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "getAid", "()Ljava/lang/String;", "cardFeatureDescriptor", "getCardFeatureDescriptor", "cardFeatureVersionNumber", "getCardFeatureVersionNumber", "parameterP1", "", "getParameterP1", "()I", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "checkDescriptor", "", "new", "Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "clear", "", "component1", "copy", "debugTag", "equals", "other", "", "fillPdolData", "transactionPdolData", "hashCode", "isEmpty", "isTearingRecoveryLogValidForRetrieval", "newData", "saveTransactionDetails", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class TearingRecoveryLog implements com.discover.mpos.sdk.data.TearingRecoveryStorage {

    /* renamed from: a, reason: collision with root package name */
    com.discover.mpos.sdk.data.TearingLogTransactionDetails f3209a;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/processing/pdol/Pdol;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.data.c$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.processing.pdol.Pdol, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol) {
            byte[] bArr;
            com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol2 = pdol;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdol2, "");
            com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails = com.discover.mpos.sdk.data.TearingRecoveryLog.this.f3209a;
            java.lang.String str = pdol2.f3272a.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.discover.mpos.sdk.transaction.processing.pdol.Pdol a2 = tearingLogTransactionDetails.d.a(str);
            pdol2.b = (a2 == null || (bArr = a2.b) == null) ? null : java.util.Arrays.copyOf(bArr, bArr.length);
            return kotlin.Unit.INSTANCE;
        }

        a() {
            super(1);
        }
    }

    private TearingRecoveryLog(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingLogTransactionDetails, "");
        this.f3209a = tearingLogTransactionDetails;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private TearingRecoveryLog(com.discover.mpos.sdk.data.TearingLogTransactionDetails.a aVar) {
        this(aVar.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
    }

    public TearingRecoveryLog() {
        this(new com.discover.mpos.sdk.data.TearingLogTransactionDetails.a(new com.discover.mpos.sdk.transaction.processing.pdol.PdolData((byte[]) null), 0));
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final int a() {
        return this.f3209a.f;
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolData b() {
        return this.f3209a.d;
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c() {
        return this.f3209a.e;
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean d() {
        com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails = this.f3209a;
        if (!tearingLogTransactionDetails.d.f3273a.isEmpty()) {
            return false;
        }
        java.lang.String str = tearingLogTransactionDetails.f3207a;
        return (str == null || str.length() == 0) && tearingLogTransactionDetails.b.getContent() == null && tearingLogTransactionDetails.c.getContent() == null;
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolData, "");
        pdolData.a(new com.discover.mpos.sdk.data.TearingRecoveryLog.a());
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails = this.f3209a;
        tearingLogTransactionDetails.b.clear();
        tearingLogTransactionDetails.c.clear();
        tearingLogTransactionDetails.d.clear();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = tearingLogTransactionDetails.e;
        if (tlv != null) {
            tlv.clear();
        }
        tearingLogTransactionDetails.f3207a = null;
        tearingLogTransactionDetails.f = 0;
    }

    public final java.lang.String toString() {
        return this.f3209a.toString();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingLogTransactionDetails, "");
        new java.lang.Object[]{tearingLogTransactionDetails.f3207a};
        new java.lang.Object[]{tearingLogTransactionDetails.b.getContent()};
        new java.lang.Object[]{tearingLogTransactionDetails.c.getContent()};
        new java.lang.Object[]{tearingLogTransactionDetails.d};
        new java.lang.Object[]{java.lang.Integer.valueOf(tearingLogTransactionDetails.f)};
        this.f3209a = new com.discover.mpos.sdk.data.TearingLogTransactionDetails.a(tearingLogTransactionDetails).a();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean a(com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData tearingRecoveryLogMatchingData) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        byte[] content;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingRecoveryLogMatchingData, "");
        new java.lang.Object[]{tearingRecoveryLogMatchingData.f3211a};
        new java.lang.Object[]{this.f3209a.f3207a};
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor = tearingRecoveryLogMatchingData.b;
        new java.lang.Object[]{cardFeatureDescriptor != null ? cardFeatureDescriptor.getE() : null};
        new java.lang.Object[]{this.f3209a.b.getContent()};
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = tearingRecoveryLogMatchingData.c;
        new java.lang.Object[]{tlv2 != null ? tlv2.getE() : null};
        new java.lang.Object[]{this.f3209a.c.getE()};
        if (kotlin.jvm.internal.Intrinsics.areEqual(tearingRecoveryLogMatchingData.f3211a, this.f3209a.f3207a) && this.f3209a.b.getContent() != null && tearingRecoveryLogMatchingData.b != null) {
            byte[] content2 = this.f3209a.b.getContent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(content2);
            if (java.util.Arrays.equals(content2, tearingRecoveryLogMatchingData.b.getE()) && (tlv = tearingRecoveryLogMatchingData.c) != null && (content = tlv.getContent()) != null) {
                byte[] content3 = this.f3209a.c.getContent();
                if (content3 == null) {
                    content3 = new byte[0];
                }
                if (java.util.Arrays.equals(content, content3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails = this.f3209a;
        if (tearingLogTransactionDetails != null) {
            return tearingLogTransactionDetails.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.data.TearingRecoveryLog) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3209a, ((com.discover.mpos.sdk.data.TearingRecoveryLog) other).f3209a);
        }
        return true;
    }
}
