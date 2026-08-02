package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014"}, d2 = {"Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "", "", "isEnabled", "isCheckoutEnabled", "isActivated", "", "eopStatus", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getEopStatus", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KeyInSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("eopStatus")
    private final java.lang.String eopStatus;

    @com.izettle.android.serialization.annotations.JsonSerialize("activated")
    private final java.lang.Boolean isActivated;

    @com.izettle.android.serialization.annotations.JsonSerialize("checkoutEnabled")
    private final java.lang.Boolean isCheckoutEnabled;

    @com.izettle.android.serialization.annotations.JsonSerialize("enabled")
    private final java.lang.Boolean isEnabled;

    public KeyInSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("enabled") java.lang.Boolean bool, @com.izettle.android.serialization.annotations.JsonDeserialize("checkoutEnabled") java.lang.Boolean bool2, @com.izettle.android.serialization.annotations.JsonDeserialize("activated") java.lang.Boolean bool3, @com.izettle.android.serialization.annotations.JsonDeserialize("eopStatus") java.lang.String str) {
        this.isEnabled = bool;
        this.isCheckoutEnabled = bool2;
        this.isActivated = bool3;
        this.eopStatus = str;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final java.lang.Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: isCheckoutEnabled, reason: from getter */
    public final java.lang.Boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: isActivated, reason: from getter */
    public final java.lang.Boolean getIsActivated() {
        return this.isActivated;
    }

    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.KeyInSettingsDto)) {
            return false;
        }
        com.izettle.android.auth.dto.KeyInSettingsDto keyInSettingsDto = (com.izettle.android.auth.dto.KeyInSettingsDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(keyInSettingsDto.isEnabled, this.isEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(keyInSettingsDto.isCheckoutEnabled, this.isCheckoutEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(keyInSettingsDto.isActivated, this.isActivated) && kotlin.jvm.internal.Intrinsics.areEqual(keyInSettingsDto.eopStatus, this.eopStatus);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.isEnabled, this.isCheckoutEnabled, this.isActivated, this.eopStatus);
    }
}
