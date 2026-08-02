package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "transactionLog", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "formFactorIdentifier", "proprietaryDataElements", "", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Ljava/util/List;)V", "getFormFactorIdentifier", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "setFormFactorIdentifier", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "getProprietaryDataElements", "()Ljava/util/List;", "getTransactionLog", "setTransactionLog", "clear", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class FciIssuerDataSelect implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.core.emv.tlv.Tlv f2935a;
    public com.discover.mpos.sdk.core.emv.tlv.Tlv b;
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> c;

    public FciIssuerDataSelect(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.f2935a = tlv;
        this.b = tlv2;
        this.c = list;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect");
        }
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect = (com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f2935a, fciIssuerDataSelect.f2935a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fciIssuerDataSelect.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, fciIssuerDataSelect.c);
    }

    public final int hashCode() {
        return (((this.f2935a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.f2935a.clear();
        this.b.clear();
        java.util.Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).clear();
        }
    }
}
