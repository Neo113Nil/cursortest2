package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0003\u0010\r"}, d2 = {"Lcom/izettle/android/auth/dto/CustomersSettingsDto;", "", "", "isEnabled", "<init>", "(Ljava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomersSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("enabled")
    private final java.lang.Boolean isEnabled;

    public CustomersSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("enabled") java.lang.Boolean bool) {
        this.isEnabled = bool;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final java.lang.Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof com.izettle.android.auth.dto.CustomersSettingsDto) && kotlin.jvm.internal.Intrinsics.areEqual(((com.izettle.android.auth.dto.CustomersSettingsDto) other).isEnabled, this.isEnabled);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.isEnabled);
    }
}
