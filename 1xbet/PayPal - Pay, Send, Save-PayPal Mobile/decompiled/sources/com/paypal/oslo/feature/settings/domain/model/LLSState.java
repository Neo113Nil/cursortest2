package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/LLSState;", "", "", "isEnabled", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "error", "<init>", "(ZLcom/paypal/oslo/feature/settings/domain/error/SettingsError;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "copy", "(ZLcom/paypal/oslo/feature/settings/domain/error/SettingsError;)Lcom/paypal/oslo/feature/settings/domain/model/LLSState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LLSState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.domain.error.SettingsError error;
    private final boolean isEnabled;

    public LLSState(boolean z, com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError) {
        this.isEnabled = z;
        this.error = settingsError;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final com.paypal.oslo.feature.settings.domain.error.SettingsError getError() {
        return this.error;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError = this.error;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LLSState(isEnabled=");
        sb.append(z);
        sb.append(", error=");
        sb.append(settingsError);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
        com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError = this.error;
        return (hashCode * 31) + (settingsError == null ? 0 : settingsError.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.LLSState)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.LLSState lLSState = (com.paypal.oslo.feature.settings.domain.model.LLSState) other;
        return this.isEnabled == lLSState.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.error, lLSState.error);
    }

    public final com.paypal.oslo.feature.settings.domain.model.LLSState copy(boolean isEnabled, com.paypal.oslo.feature.settings.domain.error.SettingsError error) {
        return new com.paypal.oslo.feature.settings.domain.model.LLSState(isEnabled, error);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.error.SettingsError getError() {
        return this.error;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.LLSState copy$default(com.paypal.oslo.feature.settings.domain.model.LLSState lLSState, boolean z, com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = lLSState.isEnabled;
        }
        if ((i & 2) != 0) {
            settingsError = lLSState.error;
        }
        return lLSState.copy(z, settingsError);
    }
}
