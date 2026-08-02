package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/android/entities/CashRegisterSettingsImpl;", "Lcom/zettle/android/entities/CashRegisterSettings;", "Lcom/zettle/android/entities/TssOptInOut;", "tss", "<init>", "(Lcom/zettle/android/entities/TssOptInOut;)V", "component1", "()Lcom/zettle/android/entities/TssOptInOut;", "copy", "(Lcom/zettle/android/entities/TssOptInOut;)Lcom/zettle/android/entities/CashRegisterSettingsImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/android/entities/TssOptInOut;", "getTss"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class CashRegisterSettingsImpl implements com.zettle.android.entities.CashRegisterSettings {
    private final com.zettle.android.entities.TssOptInOut tss;

    public CashRegisterSettingsImpl(com.zettle.android.entities.TssOptInOut tssOptInOut) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tssOptInOut, "");
        this.tss = tssOptInOut;
    }

    @Override // com.zettle.android.entities.CashRegisterSettings
    public final com.zettle.android.entities.TssOptInOut getTss() {
        return this.tss;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.TssOptInOut tssOptInOut = this.tss;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashRegisterSettingsImpl(tss=");
        sb.append(tssOptInOut);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.tss.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.android.entities.CashRegisterSettingsImpl) && this.tss == ((com.zettle.android.entities.CashRegisterSettingsImpl) other).tss;
    }

    public final com.zettle.android.entities.CashRegisterSettingsImpl copy(com.zettle.android.entities.TssOptInOut tss) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tss, "");
        return new com.zettle.android.entities.CashRegisterSettingsImpl(tss);
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.TssOptInOut getTss() {
        return this.tss;
    }

    public static /* synthetic */ com.zettle.android.entities.CashRegisterSettingsImpl copy$default(com.zettle.android.entities.CashRegisterSettingsImpl cashRegisterSettingsImpl, com.zettle.android.entities.TssOptInOut tssOptInOut, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tssOptInOut = cashRegisterSettingsImpl.tss;
        }
        return cashRegisterSettingsImpl.copy(tssOptInOut);
    }
}
