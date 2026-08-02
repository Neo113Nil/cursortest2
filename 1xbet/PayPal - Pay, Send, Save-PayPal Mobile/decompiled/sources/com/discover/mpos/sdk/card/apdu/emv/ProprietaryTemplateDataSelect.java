package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006/"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "cardApplication", "Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;", "pdolData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "languagePreferences", "issuerCodeTableIndex", "applicationPreferredName", "fciIssuerData", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "(Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;)V", "getApplicationPreferredName", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "setApplicationPreferredName", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "getCardApplication", "()Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;", "setCardApplication", "(Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;)V", "getFciIssuerData", "()Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "setFciIssuerData", "(Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;)V", "getIssuerCodeTableIndex", "setIssuerCodeTableIndex", "getLanguagePreferences", "setLanguagePreferences", "getPdolData", "setPdolData", "clear", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.h, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ProprietaryTemplateDataSelect implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.emv.CardApplication f2938a;
    public com.discover.mpos.sdk.core.emv.tlv.Tlv b;
    public com.discover.mpos.sdk.core.emv.tlv.Tlv c;
    public com.discover.mpos.sdk.core.emv.tlv.Tlv d;
    public com.discover.mpos.sdk.core.emv.tlv.Tlv e;
    public com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect f;

    public ProprietaryTemplateDataSelect(com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv4, com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect) {
        this.f2938a = cardApplication;
        this.b = tlv;
        this.c = tlv2;
        this.d = tlv3;
        this.e = tlv4;
        this.f = fciIssuerDataSelect;
    }

    private /* synthetic */ ProprietaryTemplateDataSelect() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect");
        }
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect = (com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f2938a, proprietaryTemplateDataSelect.f2938a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, proprietaryTemplateDataSelect.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, proprietaryTemplateDataSelect.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, proprietaryTemplateDataSelect.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, proprietaryTemplateDataSelect.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, proprietaryTemplateDataSelect.f);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication = this.f2938a;
        int hashCode = cardApplication != null ? cardApplication.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.b;
        int hashCode2 = tlv != null ? tlv.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = this.c;
        int hashCode3 = tlv2 != null ? tlv2.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = this.d;
        int hashCode4 = tlv3 != null ? tlv3.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv4 = this.e;
        int hashCode5 = tlv4 != null ? tlv4.hashCode() : 0;
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect = this.f;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fciIssuerDataSelect != null ? fciIssuerDataSelect.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication = this.f2938a;
        if (cardApplication != null) {
            cardApplication.clear();
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.b;
        if (tlv != null) {
            tlv.clear();
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = this.c;
        if (tlv2 != null) {
            tlv2.clear();
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = this.d;
        if (tlv3 != null) {
            tlv3.clear();
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv4 = this.e;
        if (tlv4 != null) {
            tlv4.clear();
        }
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect = this.f;
        if (fciIssuerDataSelect != null) {
            fciIssuerDataSelect.clear();
        }
    }
}
