package com.paypal.oslo.feature.cryptocurrency.domain.model.preferences;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;", "status", "", "rate", "", "previouslyEnrolled", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;", "getStatus", "Ljava/lang/String;", "getRate", "Z", "getPreviouslyEnrolled", "Status"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AssetPreference {
    public static final int $stable = 0;
    private final boolean previouslyEnrolled;
    private final java.lang.String rate;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status;

    public AssetPreference(com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.status = status;
        this.rate = str;
        this.previouslyEnrolled = z;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status getStatus() {
        return this.status;
    }

    public final java.lang.String getRate() {
        return this.rate;
    }

    public final boolean getPreviouslyEnrolled() {
        return this.previouslyEnrolled;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/preferences/AssetPreference$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OPT_IN", "OPT_OUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Status {
        public static final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status OPT_IN;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status OPT_OUT;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status[] getHighSpeedVideoFpsRanges;

        private Status(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status = new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status("OPT_IN", 0);
            OPT_IN = status;
            com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status("OPT_OUT", 1);
            OPT_OUT = status2;
            com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status[] statusArr = {status, status2};
            getHighSpeedVideoFpsRanges = statusArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(statusArr);
        }

        public static com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status[] values() {
            return (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status = this.status;
        java.lang.String str = this.rate;
        boolean z = this.previouslyEnrolled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPreference(status=");
        sb.append(status);
        sb.append(", rate=");
        sb.append(str);
        sb.append(", previouslyEnrolled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.status.hashCode() * 31) + this.rate.hashCode()) * 31) + java.lang.Boolean.hashCode(this.previouslyEnrolled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference) other;
        return this.status == assetPreference.status && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, assetPreference.rate) && this.previouslyEnrolled == assetPreference.previouslyEnrolled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference copy(com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status, java.lang.String rate, boolean previouslyEnrolled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference(status, rate, previouslyEnrolled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPreviouslyEnrolled() {
        return this.previouslyEnrolled;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRate() {
        return this.rate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference, com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status status, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = assetPreference.status;
        }
        if ((i & 2) != 0) {
            str = assetPreference.rate;
        }
        if ((i & 4) != 0) {
            z = assetPreference.previouslyEnrolled;
        }
        return assetPreference.copy(status, str, z);
    }
}
