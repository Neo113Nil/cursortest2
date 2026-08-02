package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ$\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJd\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000fR.\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/statsig/androidsdk/APIFeatureGate;", "", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "ruleID", "groupName", "", "", "secondaryExposures", "idType", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()[Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;Ljava/lang/String;)Lcom/statsig/androidsdk/APIFeatureGate;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGroupName", "getIdType", "getName", "getRuleID", "[Ljava/util/Map;", "getSecondaryExposures", "Z", "getValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class APIFeatureGate {

    @com.google.gson.annotations.SerializedName("group_name")
    public java.lang.String groupName;

    @com.google.gson.annotations.SerializedName(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.analytics.CIPW9StepAnalytics.MODULE_ID_TYPE)
    public java.lang.String idType;

    @com.google.gson.annotations.SerializedName("name")
    public java.lang.String name;

    @com.google.gson.annotations.SerializedName("rule_id")
    public java.lang.String ruleID;

    @com.google.gson.annotations.SerializedName("secondary_exposures")
    public java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures;

    @com.google.gson.annotations.SerializedName(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)
    public boolean value;

    public APIFeatureGate(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String>[] mapArr, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.value = z;
        this.ruleID = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.idType = str4;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    public /* synthetic */ APIFeatureGate(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.util.Map[] mapArr, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new java.util.Map[0] : mapArr, (i & 32) == 0 ? str4 : null);
    }

    public final java.lang.String getRuleID() {
        return this.ruleID;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final java.lang.String getIdType() {
        return this.idType;
    }

    public /* synthetic */ APIFeatureGate() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        boolean z = this.value;
        java.lang.String str2 = this.ruleID;
        java.lang.String str3 = this.groupName;
        java.lang.String arrays = java.util.Arrays.toString(this.secondaryExposures);
        java.lang.String str4 = this.idType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("APIFeatureGate(name=");
        sb.append(str);
        sb.append(", value=");
        sb.append(z);
        sb.append(", ruleID=");
        sb.append(str2);
        sb.append(", groupName=");
        sb.append(str3);
        sb.append(", secondaryExposures=");
        sb.append(arrays);
        sb.append(", idType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.value);
        int hashCode3 = this.ruleID.hashCode();
        java.lang.String str = this.groupName;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.util.Map<java.lang.String, java.lang.String>[] mapArr = this.secondaryExposures;
        int hashCode5 = mapArr == null ? 0 : java.util.Arrays.hashCode(mapArr);
        java.lang.String str2 = this.idType;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.APIFeatureGate)) {
            return false;
        }
        com.statsig.androidsdk.APIFeatureGate aPIFeatureGate = (com.statsig.androidsdk.APIFeatureGate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, aPIFeatureGate.name) && this.value == aPIFeatureGate.value && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleID, aPIFeatureGate.ruleID) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupName, aPIFeatureGate.groupName) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryExposures, aPIFeatureGate.secondaryExposures) && kotlin.jvm.internal.Intrinsics.areEqual(this.idType, aPIFeatureGate.idType);
    }

    public final com.statsig.androidsdk.APIFeatureGate copy(java.lang.String name2, boolean value, java.lang.String ruleID, java.lang.String groupName, java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures, java.lang.String idType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
        return new com.statsig.androidsdk.APIFeatureGate(name2, value, ruleID, groupName, secondaryExposures, idType);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] component5() {
        return this.secondaryExposures;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRuleID() {
        return this.ruleID;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.statsig.androidsdk.APIFeatureGate copy$default(com.statsig.androidsdk.APIFeatureGate aPIFeatureGate, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.util.Map[] mapArr, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aPIFeatureGate.name;
        }
        if ((i & 2) != 0) {
            z = aPIFeatureGate.value;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = aPIFeatureGate.ruleID;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = aPIFeatureGate.groupName;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            mapArr = aPIFeatureGate.secondaryExposures;
        }
        java.util.Map[] mapArr2 = mapArr;
        if ((i & 32) != 0) {
            str4 = aPIFeatureGate.idType;
        }
        return aPIFeatureGate.copy(str, z2, str5, str6, mapArr2, str4);
    }
}
