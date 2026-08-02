package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0004\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/izettle/android/auth/dto/ReceiptSettingsDto;", "", "", "showLegalDisclaimer", "isEmailSuggestionsDisabled", "isPhoneSuggestionsDisabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getShowLegalDisclaimer"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReceiptSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("disablePhoneNumberSuggestions")
    private final java.lang.Boolean isEmailSuggestionsDisabled;

    @com.izettle.android.serialization.annotations.JsonSerialize("disablePhoneNumberSuggestions")
    private final java.lang.Boolean isPhoneSuggestionsDisabled;

    @com.izettle.android.serialization.annotations.JsonSerialize("showLegalDisclaimer")
    private final java.lang.Boolean showLegalDisclaimer;

    public ReceiptSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("showLegalDisclaimer") java.lang.Boolean bool, @com.izettle.android.serialization.annotations.JsonDeserialize("disablePhoneNumberSuggestions") java.lang.Boolean bool2, @com.izettle.android.serialization.annotations.JsonDeserialize("disablePhoneNumberSuggestions") java.lang.Boolean bool3) {
        this.showLegalDisclaimer = bool;
        this.isEmailSuggestionsDisabled = bool2;
        this.isPhoneSuggestionsDisabled = bool3;
    }

    public final java.lang.Boolean getShowLegalDisclaimer() {
        return this.showLegalDisclaimer;
    }

    /* renamed from: isEmailSuggestionsDisabled, reason: from getter */
    public final java.lang.Boolean getIsEmailSuggestionsDisabled() {
        return this.isEmailSuggestionsDisabled;
    }

    /* renamed from: isPhoneSuggestionsDisabled, reason: from getter */
    public final java.lang.Boolean getIsPhoneSuggestionsDisabled() {
        return this.isPhoneSuggestionsDisabled;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.ReceiptSettingsDto)) {
            return false;
        }
        com.izettle.android.auth.dto.ReceiptSettingsDto receiptSettingsDto = (com.izettle.android.auth.dto.ReceiptSettingsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(receiptSettingsDto.showLegalDisclaimer, this.showLegalDisclaimer) && kotlin.jvm.internal.Intrinsics.areEqual(receiptSettingsDto.isEmailSuggestionsDisabled, this.isEmailSuggestionsDisabled) && kotlin.jvm.internal.Intrinsics.areEqual(receiptSettingsDto.isPhoneSuggestionsDisabled, this.isPhoneSuggestionsDisabled);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.showLegalDisclaimer, this.isEmailSuggestionsDisabled, this.isPhoneSuggestionsDisabled);
    }
}
