package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneInputState;", "", "", "raw", "formatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneInputState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRaw", "getFormatted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneInputState {
    public static final int $stable = 0;
    private final java.lang.String formatted;
    private final java.lang.String raw;

    public PhoneInputState(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.raw = str;
        this.formatted = str2;
    }

    public /* synthetic */ PhoneInputState(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final java.lang.String getRaw() {
        return this.raw;
    }

    public final java.lang.String getFormatted() {
        return this.formatted;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.raw;
        java.lang.String str2 = this.formatted;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneInputState(raw=");
        sb.append(str);
        sb.append(", formatted=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.raw.hashCode() * 31) + this.formatted.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState phoneInputState = (com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.raw, phoneInputState.raw) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatted, phoneInputState.formatted);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState copy(java.lang.String raw, java.lang.String formatted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raw, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatted, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState(raw, formatted);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormatted() {
        return this.formatted;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRaw() {
        return this.raw;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneInputState phoneInputState, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneInputState.raw;
        }
        if ((i & 2) != 0) {
            str2 = phoneInputState.formatted;
        }
        return phoneInputState.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
