package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J$\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010%Jâ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u0010\u0016R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b5\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b\f\u0010%R\u001a\u0010\u000e\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b\u000e\u0010%R\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b\r\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b7\u0010\u0016R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b:\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010\u001bR.\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\"R.\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b?\u0010\"R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b@\u0010\u001d"}, d2 = {"Lcom/statsig/androidsdk/APIDynamicConfig;", "", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "ruleID", "groupName", "", "secondaryExposures", "undelegatedSecondaryExposures", "", "isDeviceBased", "isUserInExperiment", "isExperimentActive", "allocatedExperimentName", "explicitParameters", "rulePassed", "parameterRuleIDs", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "()[Ljava/lang/String;", "component12", "()Ljava/lang/Boolean;", "component13", "()Ljava/util/Map;", "component2", "component3", "component4", "component5", "()[Ljava/util/Map;", "component6", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/statsig/androidsdk/APIDynamicConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAllocatedExperimentName", "[Ljava/lang/String;", "getExplicitParameters", "getGroupName", "Z", "getName", "Ljava/util/Map;", "getParameterRuleIDs", "getRuleID", "Ljava/lang/Boolean;", "getRulePassed", "[Ljava/util/Map;", "getSecondaryExposures", "getUndelegatedSecondaryExposures", "getValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class APIDynamicConfig {

    @com.google.gson.annotations.SerializedName("allocated_experiment_name")
    public java.lang.String allocatedExperimentName;

    @com.google.gson.annotations.SerializedName("explicit_parameters")
    public java.lang.String[] explicitParameters;

    @com.google.gson.annotations.SerializedName("group_name")
    public java.lang.String groupName;

    @com.google.gson.annotations.SerializedName("is_device_based")
    public boolean isDeviceBased;

    @com.google.gson.annotations.SerializedName("is_experiment_active")
    public boolean isExperimentActive;

    @com.google.gson.annotations.SerializedName("is_user_in_experiment")
    public boolean isUserInExperiment;

    @com.google.gson.annotations.SerializedName("name")
    public java.lang.String name;

    @com.google.gson.annotations.SerializedName("parameter_rule_ids")
    public java.util.Map<java.lang.String, java.lang.String> parameterRuleIDs;

    @com.google.gson.annotations.SerializedName("rule_id")
    public java.lang.String ruleID;

    @com.google.gson.annotations.SerializedName("passed")
    public java.lang.Boolean rulePassed;

    @com.google.gson.annotations.SerializedName("secondary_exposures")
    public java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures;

    @com.google.gson.annotations.SerializedName("undelegated_secondary_exposures")
    public java.util.Map<java.lang.String, java.lang.String>[] undelegatedSecondaryExposures;

    @com.google.gson.annotations.SerializedName(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)
    public java.util.Map<java.lang.String, java.lang.Object> value;

    public APIDynamicConfig(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String>[] mapArr, java.util.Map<java.lang.String, java.lang.String>[] mapArr2, boolean z, boolean z2, boolean z3, java.lang.String str4, java.lang.String[] strArr, java.lang.Boolean bool, java.util.Map<java.lang.String, java.lang.String> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.value = map;
        this.ruleID = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isDeviceBased = z;
        this.isUserInExperiment = z2;
        this.isExperimentActive = z3;
        this.allocatedExperimentName = str4;
        this.explicitParameters = strArr;
        this.rulePassed = bool;
        this.parameterRuleIDs = map2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getValue() {
        return this.value;
    }

    public /* synthetic */ APIDynamicConfig(java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map[] mapArr, java.util.Map[] mapArr2, boolean z, boolean z2, boolean z3, java.lang.String str4, java.lang.String[] strArr, java.lang.Boolean bool, java.util.Map map2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new java.util.Map[0] : mapArr, (i & 32) != 0 ? new java.util.Map[0] : mapArr2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? new java.lang.String[0] : strArr, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : map2);
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

    public final java.util.Map<java.lang.String, java.lang.String>[] getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final boolean isDeviceBased() {
        return this.isDeviceBased;
    }

    public final boolean isUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    public final java.lang.String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final java.lang.String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    public final java.lang.Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getParameterRuleIDs() {
        return this.parameterRuleIDs;
    }

    public /* synthetic */ APIDynamicConfig() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.util.Map<java.lang.String, java.lang.Object> map = this.value;
        java.lang.String str2 = this.ruleID;
        java.lang.String str3 = this.groupName;
        java.lang.String arrays = java.util.Arrays.toString(this.secondaryExposures);
        java.lang.String arrays2 = java.util.Arrays.toString(this.undelegatedSecondaryExposures);
        boolean z = this.isDeviceBased;
        boolean z2 = this.isUserInExperiment;
        boolean z3 = this.isExperimentActive;
        java.lang.String str4 = this.allocatedExperimentName;
        java.lang.String arrays3 = java.util.Arrays.toString(this.explicitParameters);
        java.lang.Boolean bool = this.rulePassed;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.parameterRuleIDs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("APIDynamicConfig(name=");
        sb.append(str);
        sb.append(", value=");
        sb.append(map);
        sb.append(", ruleID=");
        sb.append(str2);
        sb.append(", groupName=");
        sb.append(str3);
        sb.append(", secondaryExposures=");
        sb.append(arrays);
        sb.append(", undelegatedSecondaryExposures=");
        sb.append(arrays2);
        sb.append(", isDeviceBased=");
        sb.append(z);
        sb.append(", isUserInExperiment=");
        sb.append(z2);
        sb.append(", isExperimentActive=");
        sb.append(z3);
        sb.append(", allocatedExperimentName=");
        sb.append(str4);
        sb.append(", explicitParameters=");
        sb.append(arrays3);
        sb.append(", rulePassed=");
        sb.append(bool);
        sb.append(", parameterRuleIDs=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.value.hashCode();
        int hashCode3 = this.ruleID.hashCode();
        java.lang.String str = this.groupName;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.util.Map<java.lang.String, java.lang.String>[] mapArr = this.secondaryExposures;
        int hashCode5 = mapArr == null ? 0 : java.util.Arrays.hashCode(mapArr);
        java.util.Map<java.lang.String, java.lang.String>[] mapArr2 = this.undelegatedSecondaryExposures;
        int hashCode6 = mapArr2 == null ? 0 : java.util.Arrays.hashCode(mapArr2);
        int hashCode7 = java.lang.Boolean.hashCode(this.isDeviceBased);
        int hashCode8 = java.lang.Boolean.hashCode(this.isUserInExperiment);
        int hashCode9 = java.lang.Boolean.hashCode(this.isExperimentActive);
        java.lang.String str2 = this.allocatedExperimentName;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String[] strArr = this.explicitParameters;
        int hashCode11 = strArr == null ? 0 : java.util.Arrays.hashCode(strArr);
        java.lang.Boolean bool = this.rulePassed;
        int hashCode12 = bool == null ? 0 : bool.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.parameterRuleIDs;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.APIDynamicConfig)) {
            return false;
        }
        com.statsig.androidsdk.APIDynamicConfig aPIDynamicConfig = (com.statsig.androidsdk.APIDynamicConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, aPIDynamicConfig.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, aPIDynamicConfig.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleID, aPIDynamicConfig.ruleID) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupName, aPIDynamicConfig.groupName) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryExposures, aPIDynamicConfig.secondaryExposures) && kotlin.jvm.internal.Intrinsics.areEqual(this.undelegatedSecondaryExposures, aPIDynamicConfig.undelegatedSecondaryExposures) && this.isDeviceBased == aPIDynamicConfig.isDeviceBased && this.isUserInExperiment == aPIDynamicConfig.isUserInExperiment && this.isExperimentActive == aPIDynamicConfig.isExperimentActive && kotlin.jvm.internal.Intrinsics.areEqual(this.allocatedExperimentName, aPIDynamicConfig.allocatedExperimentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.explicitParameters, aPIDynamicConfig.explicitParameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.rulePassed, aPIDynamicConfig.rulePassed) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameterRuleIDs, aPIDynamicConfig.parameterRuleIDs);
    }

    public final com.statsig.androidsdk.APIDynamicConfig copy(java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> value, java.lang.String ruleID, java.lang.String groupName, java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures, java.util.Map<java.lang.String, java.lang.String>[] undelegatedSecondaryExposures, boolean isDeviceBased, boolean isUserInExperiment, boolean isExperimentActive, java.lang.String allocatedExperimentName, java.lang.String[] explicitParameters, java.lang.Boolean rulePassed, java.util.Map<java.lang.String, java.lang.String> parameterRuleIDs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
        return new com.statsig.androidsdk.APIDynamicConfig(name2, value, ruleID, groupName, secondaryExposures, undelegatedSecondaryExposures, isDeviceBased, isUserInExperiment, isExperimentActive, allocatedExperimentName, explicitParameters, rulePassed, parameterRuleIDs);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsDeviceBased() {
        return this.isDeviceBased;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] component6() {
        return this.undelegatedSecondaryExposures;
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

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
        return this.value;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component13() {
        return this.parameterRuleIDs;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Boolean getRulePassed() {
        return this.rulePassed;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
