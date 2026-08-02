package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/zettle/android/entities/CustomersSettingsImpl;", "Lcom/zettle/android/entities/CustomersSettings;", "", "isEnabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/zettle/android/entities/CustomersSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class CustomersSettingsImpl implements com.zettle.android.entities.CustomersSettings {
    private final boolean isEnabled;

    public CustomersSettingsImpl(boolean z) {
        this.isEnabled = z;
    }

    @Override // com.zettle.android.entities.CustomersSettings
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomersSettingsImpl(isEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.isEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.android.entities.CustomersSettingsImpl) && this.isEnabled == ((com.zettle.android.entities.CustomersSettingsImpl) other).isEnabled;
    }

    public final com.zettle.android.entities.CustomersSettingsImpl copy(boolean isEnabled) {
        return new com.zettle.android.entities.CustomersSettingsImpl(isEnabled);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.android.entities.CustomersSettingsImpl copy$default(com.zettle.android.entities.CustomersSettingsImpl customersSettingsImpl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = customersSettingsImpl.isEnabled;
        }
        return customersSettingsImpl.copy(z);
    }
}
