package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/zettle/android/entities/ReceiptSettingsImpl;", "Lcom/zettle/android/entities/ReceiptSettings;", "", "showLegalDisclaimer", "isEmailSuggestionsDisabled", "isPhoneSuggestionsDisabled", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/zettle/android/entities/ReceiptSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowLegalDisclaimer"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class ReceiptSettingsImpl implements com.zettle.android.entities.ReceiptSettings {
    private final boolean isEmailSuggestionsDisabled;
    private final boolean isPhoneSuggestionsDisabled;
    private final boolean showLegalDisclaimer;

    public ReceiptSettingsImpl(boolean z, boolean z2, boolean z3) {
        this.showLegalDisclaimer = z;
        this.isEmailSuggestionsDisabled = z2;
        this.isPhoneSuggestionsDisabled = z3;
    }

    @Override // com.zettle.android.entities.ReceiptSettings
    public final boolean getShowLegalDisclaimer() {
        return this.showLegalDisclaimer;
    }

    @Override // com.zettle.android.entities.ReceiptSettings
    public final boolean isEmailSuggestionsDisabled() {
        return this.isEmailSuggestionsDisabled;
    }

    @Override // com.zettle.android.entities.ReceiptSettings
    public final boolean isPhoneSuggestionsDisabled() {
        return this.isPhoneSuggestionsDisabled;
    }

    public final java.lang.String toString() {
        boolean z = this.showLegalDisclaimer;
        boolean z2 = this.isEmailSuggestionsDisabled;
        boolean z3 = this.isPhoneSuggestionsDisabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiptSettingsImpl(showLegalDisclaimer=");
        sb.append(z);
        sb.append(", isEmailSuggestionsDisabled=");
        sb.append(z2);
        sb.append(", isPhoneSuggestionsDisabled=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.showLegalDisclaimer) * 31) + java.lang.Boolean.hashCode(this.isEmailSuggestionsDisabled)) * 31) + java.lang.Boolean.hashCode(this.isPhoneSuggestionsDisabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.ReceiptSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.ReceiptSettingsImpl receiptSettingsImpl = (com.zettle.android.entities.ReceiptSettingsImpl) other;
        return this.showLegalDisclaimer == receiptSettingsImpl.showLegalDisclaimer && this.isEmailSuggestionsDisabled == receiptSettingsImpl.isEmailSuggestionsDisabled && this.isPhoneSuggestionsDisabled == receiptSettingsImpl.isPhoneSuggestionsDisabled;
    }

    public final com.zettle.android.entities.ReceiptSettingsImpl copy(boolean showLegalDisclaimer, boolean isEmailSuggestionsDisabled, boolean isPhoneSuggestionsDisabled) {
        return new com.zettle.android.entities.ReceiptSettingsImpl(showLegalDisclaimer, isEmailSuggestionsDisabled, isPhoneSuggestionsDisabled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPhoneSuggestionsDisabled() {
        return this.isPhoneSuggestionsDisabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEmailSuggestionsDisabled() {
        return this.isEmailSuggestionsDisabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLegalDisclaimer() {
        return this.showLegalDisclaimer;
    }

    public static /* synthetic */ com.zettle.android.entities.ReceiptSettingsImpl copy$default(com.zettle.android.entities.ReceiptSettingsImpl receiptSettingsImpl, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = receiptSettingsImpl.showLegalDisclaimer;
        }
        if ((i & 2) != 0) {
            z2 = receiptSettingsImpl.isEmailSuggestionsDisabled;
        }
        if ((i & 4) != 0) {
            z3 = receiptSettingsImpl.isPhoneSuggestionsDisabled;
        }
        return receiptSettingsImpl.copy(z, z2, z3);
    }
}
