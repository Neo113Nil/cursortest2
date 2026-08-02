package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0004\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u0003\u0010\u000e"}, d2 = {"Lcom/izettle/android/auth/dto/InvoiceSettingsDto;", "", "", "isEnabled", "isCheckoutEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvoiceSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("checkoutEnabled")
    private final java.lang.Boolean isCheckoutEnabled;

    @com.izettle.android.serialization.annotations.JsonSerialize("enabled")
    private final java.lang.Boolean isEnabled;

    public InvoiceSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("enabled") java.lang.Boolean bool, @com.izettle.android.serialization.annotations.JsonDeserialize("checkoutEnabled") java.lang.Boolean bool2) {
        this.isEnabled = bool;
        this.isCheckoutEnabled = bool2;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final java.lang.Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: isCheckoutEnabled, reason: from getter */
    public final java.lang.Boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.InvoiceSettingsDto)) {
            return false;
        }
        com.izettle.android.auth.dto.InvoiceSettingsDto invoiceSettingsDto = (com.izettle.android.auth.dto.InvoiceSettingsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(invoiceSettingsDto.isEnabled, this.isEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(invoiceSettingsDto.isCheckoutEnabled, this.isCheckoutEnabled);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.isEnabled, this.isCheckoutEnabled);
    }
}
