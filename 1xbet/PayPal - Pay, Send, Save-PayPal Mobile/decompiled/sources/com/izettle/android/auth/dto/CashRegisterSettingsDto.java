package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "", "Lcom/zettle/android/entities/TssOptInOut;", "tss", "<init>", "(Lcom/zettle/android/entities/TssOptInOut;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/zettle/android/entities/TssOptInOut;", "getTss", "()Lcom/zettle/android/entities/TssOptInOut;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CashRegisterSettingsDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("tss")
    private final com.zettle.android.entities.TssOptInOut tss;

    public CashRegisterSettingsDto(@com.izettle.android.serialization.annotations.JsonDeserialize("tss") com.zettle.android.entities.TssOptInOut tssOptInOut) {
        this.tss = tssOptInOut;
    }

    public final com.zettle.android.entities.TssOptInOut getTss() {
        return this.tss;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof com.izettle.android.auth.dto.CashRegisterSettingsDto) && ((com.izettle.android.auth.dto.CashRegisterSettingsDto) other).tss == this.tss;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.tss);
    }
}
