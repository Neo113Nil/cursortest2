package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0080\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0015R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b0\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b9\u0010\u0015"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecRule;", "", "", "name", "", "passPercentage", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "returnValue", "id", "salt", "", "Lcom/statsig/androidsdk/evaluator/SpecCondition;", "conditions", "idType", "groupName", "configDelegate", "", "isExperimentGroup", "<init>", "(Ljava/lang/String;DLcom/statsig/androidsdk/evaluator/ReturnableValue;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/lang/Boolean;", "component2", "()D", "component3", "()Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;DLcom/statsig/androidsdk/evaluator/ReturnableValue;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/statsig/androidsdk/evaluator/SpecRule;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getConditions", "Ljava/lang/String;", "getConfigDelegate", "getGroupName", "getId", "getIdType", "Ljava/lang/Boolean;", "getName", "D", "getPassPercentage", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "getReturnValue", "getSalt"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpecRule {

    @com.google.gson.annotations.SerializedName("conditions")
    public java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> conditions;

    @com.google.gson.annotations.SerializedName("configDelegate")
    public java.lang.String configDelegate;

    @com.google.gson.annotations.SerializedName("groupName")
    public java.lang.String groupName;

    @com.google.gson.annotations.SerializedName("id")
    public java.lang.String id;

    @com.google.gson.annotations.SerializedName("idType")
    public java.lang.String idType;

    @com.google.gson.annotations.SerializedName("isExperimentGroup")
    public java.lang.Boolean isExperimentGroup;

    @com.google.gson.annotations.SerializedName("name")
    public java.lang.String name;

    @com.google.gson.annotations.SerializedName("passPercentage")
    public double passPercentage;

    @com.google.gson.annotations.SerializedName("returnValue")
    public com.statsig.androidsdk.evaluator.ReturnableValue returnValue;

    @com.google.gson.annotations.SerializedName("salt")
    public java.lang.String salt;

    public SpecRule(java.lang.String str, double d, com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, java.lang.String str2, java.lang.String str3, java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> list, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnableValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.passPercentage = d;
        this.returnValue = returnableValue;
        this.id = str2;
        this.salt = str3;
        this.conditions = list;
        this.idType = str4;
        this.groupName = str5;
        this.configDelegate = str6;
        this.isExperimentGroup = bool;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final double getPassPercentage() {
        return this.passPercentage;
    }

    public final com.statsig.androidsdk.evaluator.ReturnableValue getReturnValue() {
        return this.returnValue;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getSalt() {
        return this.salt;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> getConditions() {
        return this.conditions;
    }

    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.lang.String getConfigDelegate() {
        return this.configDelegate;
    }

    public final java.lang.Boolean isExperimentGroup() {
        return this.isExperimentGroup;
    }

    public /* synthetic */ SpecRule() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        double d = this.passPercentage;
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = this.returnValue;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.salt;
        java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> list = this.conditions;
        java.lang.String str4 = this.idType;
        java.lang.String str5 = this.groupName;
        java.lang.String str6 = this.configDelegate;
        java.lang.Boolean bool = this.isExperimentGroup;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecRule(name=");
        sb.append(str);
        sb.append(", passPercentage=");
        sb.append(d);
        sb.append(", returnValue=");
        sb.append(returnableValue);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", salt=");
        sb.append(str3);
        sb.append(", conditions=");
        sb.append(list);
        sb.append(", idType=");
        sb.append(str4);
        sb.append(", groupName=");
        sb.append(str5);
        sb.append(", configDelegate=");
        sb.append(str6);
        sb.append(", isExperimentGroup=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = java.lang.Double.hashCode(this.passPercentage);
        int hashCode3 = this.returnValue.hashCode();
        int hashCode4 = this.id.hashCode();
        java.lang.String str = this.salt;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.conditions.hashCode();
        int hashCode7 = this.idType.hashCode();
        int hashCode8 = this.groupName.hashCode();
        java.lang.String str2 = this.configDelegate;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.Boolean bool = this.isExperimentGroup;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.SpecRule)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.SpecRule specRule = (com.statsig.androidsdk.evaluator.SpecRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, specRule.name) && java.lang.Double.compare(this.passPercentage, specRule.passPercentage) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.returnValue, specRule.returnValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, specRule.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.salt, specRule.salt) && kotlin.jvm.internal.Intrinsics.areEqual(this.conditions, specRule.conditions) && kotlin.jvm.internal.Intrinsics.areEqual(this.idType, specRule.idType) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupName, specRule.groupName) && kotlin.jvm.internal.Intrinsics.areEqual(this.configDelegate, specRule.configDelegate) && kotlin.jvm.internal.Intrinsics.areEqual(this.isExperimentGroup, specRule.isExperimentGroup);
    }

    public final com.statsig.androidsdk.evaluator.SpecRule copy(java.lang.String name2, double passPercentage, com.statsig.androidsdk.evaluator.ReturnableValue returnValue, java.lang.String id, java.lang.String salt, java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> conditions, java.lang.String idType, java.lang.String groupName, java.lang.String configDelegate, java.lang.Boolean isExperimentGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupName, "");
        return new com.statsig.androidsdk.evaluator.SpecRule(name2, passPercentage, returnValue, id, salt, conditions, idType, groupName, configDelegate, isExperimentGroup);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getConfigDelegate() {
        return this.configDelegate;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.SpecCondition> component6() {
        return this.conditions;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSalt() {
        return this.salt;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final com.statsig.androidsdk.evaluator.ReturnableValue getReturnValue() {
        return this.returnValue;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPassPercentage() {
        return this.passPercentage;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Boolean getIsExperimentGroup() {
        return this.isExperimentGroup;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
