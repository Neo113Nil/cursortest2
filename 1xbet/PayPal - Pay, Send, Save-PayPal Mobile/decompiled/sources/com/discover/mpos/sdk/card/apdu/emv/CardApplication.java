package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "applicationLabel", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "applicationPriority", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "getApplicationLabel", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getApplicationPriority", "clear", "", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CardApplication implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv f2932a;
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv b;

    public CardApplication(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        this.f2932a = tlv;
        this.b = tlv2;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.card.apdu.emv.CardApplication");
        }
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication = (com.discover.mpos.sdk.card.apdu.emv.CardApplication) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f2932a, cardApplication.f2932a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cardApplication.b);
    }

    public final int hashCode() {
        return (this.f2932a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardApplication(applicationLabel=");
        sb.append(this.f2932a);
        sb.append(", applicationPriority=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.f2932a.clear();
        this.b.clear();
    }
}
