package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "", "candidateAid", "", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardVersionNumber", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Ljava/lang/String;Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "getCandidateAid", "()Ljava/lang/String;", "getCardFeatureDescriptor", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "getCardVersionNumber", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class TearingRecoveryLogMatchingData {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f3211a;
    final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor b;
    final com.discover.mpos.sdk.core.emv.tlv.Tlv c;

    public TearingRecoveryLogMatchingData(java.lang.String str, com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        this.f3211a = str;
        this.b = cardFeatureDescriptor;
        this.c = tlv;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TearingRecoveryLogMatchingData(candidateAid=");
        sb.append(this.f3211a);
        sb.append(", cardFeatureDescriptor=");
        sb.append(this.b);
        sb.append(", cardVersionNumber=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.f3211a;
        int hashCode = str != null ? str.hashCode() : 0;
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor = this.b;
        int hashCode2 = cardFeatureDescriptor != null ? cardFeatureDescriptor.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (tlv != null ? tlv.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData)) {
            return false;
        }
        com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData tearingRecoveryLogMatchingData = (com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3211a, tearingRecoveryLogMatchingData.f3211a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, tearingRecoveryLogMatchingData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, tearingRecoveryLogMatchingData.c);
    }
}
