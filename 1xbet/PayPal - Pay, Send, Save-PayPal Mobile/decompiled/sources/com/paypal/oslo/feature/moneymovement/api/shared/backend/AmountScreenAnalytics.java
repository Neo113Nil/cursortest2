package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountScreenAnalytics;", "", "", "screenName", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "entryPoint", "", "properties", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExperimentInfo;", "experimentInfo", "", "enableDetailedLogging", "logAmountChanges", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExperimentInfo;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExperimentInfo;", "component6", "()Z", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExperimentInfo;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountScreenAnalytics;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScreenName", "getFlowType", "getEntryPoint", "Ljava/util/Map;", "getProperties", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExperimentInfo;", "getExperimentInfo", "Z", "getEnableDetailedLogging", "getLogAmountChanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountScreenAnalytics {
    public static final int $stable = 8;
    private final boolean enableDetailedLogging;
    private final java.lang.String entryPoint;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo;
    private final java.lang.String flowType;
    private final boolean logAmountChanges;
    private final java.util.Map<java.lang.String, java.lang.String> properties;
    private final java.lang.String screenName;

    public AmountScreenAnalytics(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.screenName = str;
        this.flowType = str2;
        this.entryPoint = str3;
        this.properties = map;
        this.experimentInfo = experimentInfo;
        this.enableDetailedLogging = z;
        this.logAmountChanges = z2;
    }

    public final java.lang.String getScreenName() {
        return this.screenName;
    }

    public final java.lang.String getFlowType() {
        return this.flowType;
    }

    public final java.lang.String getEntryPoint() {
        return this.entryPoint;
    }

    public /* synthetic */ AmountScreenAnalytics(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 16) != 0 ? null : experimentInfo, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getProperties() {
        return this.properties;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo getExperimentInfo() {
        return this.experimentInfo;
    }

    public final boolean getEnableDetailedLogging() {
        return this.enableDetailedLogging;
    }

    public final boolean getLogAmountChanges() {
        return this.logAmountChanges;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.screenName;
        java.lang.String str2 = this.flowType;
        java.lang.String str3 = this.entryPoint;
        java.util.Map<java.lang.String, java.lang.String> map = this.properties;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo = this.experimentInfo;
        boolean z = this.enableDetailedLogging;
        boolean z2 = this.logAmountChanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountScreenAnalytics(screenName=");
        sb.append(str);
        sb.append(", flowType=");
        sb.append(str2);
        sb.append(", entryPoint=");
        sb.append(str3);
        sb.append(", properties=");
        sb.append(map);
        sb.append(", experimentInfo=");
        sb.append(experimentInfo);
        sb.append(", enableDetailedLogging=");
        sb.append(z);
        sb.append(", logAmountChanges=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.screenName.hashCode();
        int hashCode2 = this.flowType.hashCode();
        int hashCode3 = this.entryPoint.hashCode();
        int hashCode4 = this.properties.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo = this.experimentInfo;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (experimentInfo == null ? 0 : experimentInfo.hashCode())) * 31) + java.lang.Boolean.hashCode(this.enableDetailedLogging)) * 31) + java.lang.Boolean.hashCode(this.logAmountChanges);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics amountScreenAnalytics = (com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenName, amountScreenAnalytics.screenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowType, amountScreenAnalytics.flowType) && kotlin.jvm.internal.Intrinsics.areEqual(this.entryPoint, amountScreenAnalytics.entryPoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.properties, amountScreenAnalytics.properties) && kotlin.jvm.internal.Intrinsics.areEqual(this.experimentInfo, amountScreenAnalytics.experimentInfo) && this.enableDetailedLogging == amountScreenAnalytics.enableDetailedLogging && this.logAmountChanges == amountScreenAnalytics.logAmountChanges;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics copy(java.lang.String screenName, java.lang.String flowType, java.lang.String entryPoint, java.util.Map<java.lang.String, java.lang.String> properties, com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo, boolean enableDetailedLogging, boolean logAmountChanges) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(properties, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics(screenName, flowType, entryPoint, properties, experimentInfo, enableDetailedLogging, logAmountChanges);
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLogAmountChanges() {
        return this.logAmountChanges;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableDetailedLogging() {
        return this.enableDetailedLogging;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo getExperimentInfo() {
        return this.experimentInfo;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component4() {
        return this.properties;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFlowType() {
        return this.flowType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getScreenName() {
        return this.screenName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenAnalytics amountScreenAnalytics, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amountScreenAnalytics.screenName;
        }
        if ((i & 2) != 0) {
            str2 = amountScreenAnalytics.flowType;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = amountScreenAnalytics.entryPoint;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            map = amountScreenAnalytics.properties;
        }
        java.util.Map map2 = map;
        if ((i & 16) != 0) {
            experimentInfo = amountScreenAnalytics.experimentInfo;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ExperimentInfo experimentInfo2 = experimentInfo;
        if ((i & 32) != 0) {
            z = amountScreenAnalytics.enableDetailedLogging;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = amountScreenAnalytics.logAmountChanges;
        }
        return amountScreenAnalytics.copy(str, str4, str5, map2, experimentInfo2, z3, z2);
    }
}
