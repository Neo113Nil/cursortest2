package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u000b"}, d2 = {"Lcom/zettle/android/entities/KeyInSettingsImpl;", "Lcom/zettle/android/entities/KeyInSettings;", "", "isEnabled", "isCheckoutEnabled", "isActivated", "", "eopStatus", "<init>", "(ZZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(ZZZLjava/lang/String;)Lcom/zettle/android/entities/KeyInSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEopStatus", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class KeyInSettingsImpl implements com.zettle.android.entities.KeyInSettings {
    private final java.lang.String eopStatus;
    private final boolean isActivated;
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    public KeyInSettingsImpl(boolean z, boolean z2, boolean z3, java.lang.String str) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.isActivated = z3;
        this.eopStatus = str;
    }

    @Override // com.zettle.android.entities.KeyInSettings
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.zettle.android.entities.KeyInSettings
    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    @Override // com.zettle.android.entities.KeyInSettings
    public final boolean isActivated() {
        return this.isActivated;
    }

    @Override // com.zettle.android.entities.KeyInSettings
    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        boolean z3 = this.isActivated;
        java.lang.String str = this.eopStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyInSettingsImpl(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(", isActivated=");
        sb.append(z3);
        sb.append(", eopStatus=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
        int hashCode2 = java.lang.Boolean.hashCode(this.isCheckoutEnabled);
        int hashCode3 = java.lang.Boolean.hashCode(this.isActivated);
        java.lang.String str = this.eopStatus;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.KeyInSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.KeyInSettingsImpl keyInSettingsImpl = (com.zettle.android.entities.KeyInSettingsImpl) other;
        return this.isEnabled == keyInSettingsImpl.isEnabled && this.isCheckoutEnabled == keyInSettingsImpl.isCheckoutEnabled && this.isActivated == keyInSettingsImpl.isActivated && kotlin.jvm.internal.Intrinsics.areEqual(this.eopStatus, keyInSettingsImpl.eopStatus);
    }

    public final com.zettle.android.entities.KeyInSettingsImpl copy(boolean isEnabled, boolean isCheckoutEnabled, boolean isActivated, java.lang.String eopStatus) {
        return new com.zettle.android.entities.KeyInSettingsImpl(isEnabled, isCheckoutEnabled, isActivated, eopStatus);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsActivated() {
        return this.isActivated;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.android.entities.KeyInSettingsImpl copy$default(com.zettle.android.entities.KeyInSettingsImpl keyInSettingsImpl, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = keyInSettingsImpl.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = keyInSettingsImpl.isCheckoutEnabled;
        }
        if ((i & 4) != 0) {
            z3 = keyInSettingsImpl.isActivated;
        }
        if ((i & 8) != 0) {
            str = keyInSettingsImpl.eopStatus;
        }
        return keyInSettingsImpl.copy(z, z2, z3, str);
    }
}
