package com.discover.mpos.sdk.card.apdu.g.application;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "content", "Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "(Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;)V", "getContent", "()Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "clear", "", "getTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "tag", "", "getTlv$mpos_sdk_card_reader_offlineRegularRelease", "searchInFciProprietaryTemplate", "fciProprietaryTemplate", "searchInMap", "fciIssuerData", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.g.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectApplicationResponseContent implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> f2967a;

    public SelectApplicationResponseContent(com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate) {
        this.f2967a = fciTemplate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectApplicationResponseContent(content=");
        sb.append(this.f2967a);
        sb.append(')');
        return sb.toString();
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.lang.String str) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate = this.f2967a;
        java.lang.Object obj = null;
        if (fciTemplate == null) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(fciTemplate.f2936a.getTag(), str)) {
            return fciTemplate.f2936a;
        }
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect = fciTemplate.b;
        if (proprietaryTemplateDataSelect == null) {
            return null;
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv5 = proprietaryTemplateDataSelect.e;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, tlv5 != null ? tlv5.getTag() : null)) {
            return proprietaryTemplateDataSelect.e;
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv6 = proprietaryTemplateDataSelect.d;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, tlv6 != null ? tlv6.getTag() : null)) {
            return proprietaryTemplateDataSelect.d;
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv7 = proprietaryTemplateDataSelect.c;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, tlv7 != null ? tlv7.getTag() : null)) {
            return proprietaryTemplateDataSelect.c;
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv8 = proprietaryTemplateDataSelect.b;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, tlv8 != null ? tlv8.getTag() : null)) {
            return proprietaryTemplateDataSelect.b;
        }
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication = proprietaryTemplateDataSelect.f2938a;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, (cardApplication == null || (tlv4 = cardApplication.f2932a) == null) ? null : tlv4.getTag())) {
            com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication2 = proprietaryTemplateDataSelect.f2938a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cardApplication2);
            return cardApplication2.f2932a;
        }
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication3 = proprietaryTemplateDataSelect.f2938a;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, (cardApplication3 == null || (tlv3 = cardApplication3.b) == null) ? null : tlv3.getTag())) {
            com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication4 = proprietaryTemplateDataSelect.f2938a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cardApplication4);
            return cardApplication4.b;
        }
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect = proprietaryTemplateDataSelect.f;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, (fciIssuerDataSelect == null || (tlv2 = fciIssuerDataSelect.f2935a) == null) ? null : tlv2.getTag())) {
            com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect2 = proprietaryTemplateDataSelect.f;
            if (fciIssuerDataSelect2 != null) {
                return fciIssuerDataSelect2.f2935a;
            }
            return null;
        }
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect3 = proprietaryTemplateDataSelect.f;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, (fciIssuerDataSelect3 == null || (tlv = fciIssuerDataSelect3.b) == null) ? null : tlv.getTag())) {
            com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect4 = proprietaryTemplateDataSelect.f;
            if (fciIssuerDataSelect4 != null) {
                return fciIssuerDataSelect4.b;
            }
            return null;
        }
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect5 = proprietaryTemplateDataSelect.f;
        if (fciIssuerDataSelect5 == null) {
            return null;
        }
        java.util.Iterator<T> it = fciIssuerDataSelect5.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) next).getTag(), str)) {
                obj = next;
                break;
            }
        }
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate = this.f2967a;
        if (fciTemplate != null) {
            fciTemplate.f2936a.clear();
            com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect = fciTemplate.b;
            if (proprietaryTemplateDataSelect != null) {
                proprietaryTemplateDataSelect.clear();
            }
        }
    }
}
