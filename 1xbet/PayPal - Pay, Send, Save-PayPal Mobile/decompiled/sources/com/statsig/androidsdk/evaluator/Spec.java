package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b0\b\u0080\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0018J¬\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010%R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u0018R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b<\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b\u0006\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b=\u0010\u0018R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b?\u0010\u0018R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b@\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\bA\u0010\u0018R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010\u001f"}, d2 = {"Lcom/statsig/androidsdk/evaluator/Spec;", "", "", "name", "type", "", "isActive", "salt", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "defaultValue", "enabled", "", "Lcom/statsig/androidsdk/evaluator/SpecRule;", "rules", "idType", "entity", "explicitParameters", "hasSharedParams", "targetAppIDs", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/statsig/androidsdk/evaluator/ReturnableValue;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/util/List;", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "()Ljava/lang/Integer;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/statsig/androidsdk/evaluator/ReturnableValue;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)Lcom/statsig/androidsdk/evaluator/Spec;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "getDefaultValue", "Z", "getEnabled", "Ljava/lang/String;", "getEntity", "Ljava/util/List;", "getExplicitParameters", "Ljava/lang/Boolean;", "getHasSharedParams", "getIdType", "getName", "getRules", "getSalt", "getTargetAppIDs", "getType", "Ljava/lang/Integer;", "getVersion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Spec {

    @com.google.gson.annotations.SerializedName("defaultValue")
    public com.statsig.androidsdk.evaluator.ReturnableValue defaultValue;

    @com.google.gson.annotations.SerializedName("enabled")
    public boolean enabled;

    @com.google.gson.annotations.SerializedName("entity")
    public java.lang.String entity;

    @com.google.gson.annotations.SerializedName("explicitParameters")
    public java.util.List<java.lang.String> explicitParameters;

    @com.google.gson.annotations.SerializedName("hasSharedParams")
    public java.lang.Boolean hasSharedParams;

    @com.google.gson.annotations.SerializedName("idType")
    public java.lang.String idType;

    @com.google.gson.annotations.SerializedName("isActive")
    public boolean isActive;

    @com.google.gson.annotations.SerializedName("name")
    public java.lang.String name;

    @com.google.gson.annotations.SerializedName("rules")
    public java.util.List<com.statsig.androidsdk.evaluator.SpecRule> rules;

    @com.google.gson.annotations.SerializedName("salt")
    public java.lang.String salt;

    @com.google.gson.annotations.SerializedName("targetAppIDs")
    public java.util.List<java.lang.String> targetAppIDs;

    @com.google.gson.annotations.SerializedName("type")
    public java.lang.String type;

    @com.google.gson.annotations.SerializedName("version")
    public java.lang.Integer version;

    public Spec(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, boolean z2, java.util.List<com.statsig.androidsdk.evaluator.SpecRule> list, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.util.List<java.lang.String> list3, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnableValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.type = str2;
        this.isActive = z;
        this.salt = str3;
        this.defaultValue = returnableValue;
        this.enabled = z2;
        this.rules = list;
        this.idType = str4;
        this.entity = str5;
        this.explicitParameters = list2;
        this.hasSharedParams = bool;
        this.targetAppIDs = list3;
        this.version = num;
    }

    public /* synthetic */ Spec(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, boolean z2, java.util.List list, java.lang.String str4, java.lang.String str5, java.util.List list2, java.lang.Boolean bool, java.util.List list3, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, returnableValue, z2, list, str4, str5, list2, bool, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : num);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final java.lang.String getSalt() {
        return this.salt;
    }

    public final com.statsig.androidsdk.evaluator.ReturnableValue getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.SpecRule> getRules() {
        return this.rules;
    }

    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.lang.String getEntity() {
        return this.entity;
    }

    public final java.util.List<java.lang.String> getExplicitParameters() {
        return this.explicitParameters;
    }

    public final java.lang.Boolean getHasSharedParams() {
        return this.hasSharedParams;
    }

    public final java.util.List<java.lang.String> getTargetAppIDs() {
        return this.targetAppIDs;
    }

    public final java.lang.Integer getVersion() {
        return this.version;
    }

    public /* synthetic */ Spec() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.type;
        boolean z = this.isActive;
        java.lang.String str3 = this.salt;
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = this.defaultValue;
        boolean z2 = this.enabled;
        java.util.List<com.statsig.androidsdk.evaluator.SpecRule> list = this.rules;
        java.lang.String str4 = this.idType;
        java.lang.String str5 = this.entity;
        java.util.List<java.lang.String> list2 = this.explicitParameters;
        java.lang.Boolean bool = this.hasSharedParams;
        java.util.List<java.lang.String> list3 = this.targetAppIDs;
        java.lang.Integer num = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Spec(name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", salt=");
        sb.append(str3);
        sb.append(", defaultValue=");
        sb.append(returnableValue);
        sb.append(", enabled=");
        sb.append(z2);
        sb.append(", rules=");
        sb.append(list);
        sb.append(", idType=");
        sb.append(str4);
        sb.append(", entity=");
        sb.append(str5);
        sb.append(", explicitParameters=");
        sb.append(list2);
        sb.append(", hasSharedParams=");
        sb.append(bool);
        sb.append(", targetAppIDs=");
        sb.append(list3);
        sb.append(", version=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isActive);
        int hashCode4 = this.salt.hashCode();
        int hashCode5 = this.defaultValue.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.enabled);
        int hashCode7 = this.rules.hashCode();
        int hashCode8 = this.idType.hashCode();
        int hashCode9 = this.entity.hashCode();
        java.util.List<java.lang.String> list = this.explicitParameters;
        int hashCode10 = list == null ? 0 : list.hashCode();
        java.lang.Boolean bool = this.hasSharedParams;
        int hashCode11 = bool == null ? 0 : bool.hashCode();
        java.util.List<java.lang.String> list2 = this.targetAppIDs;
        int hashCode12 = list2 == null ? 0 : list2.hashCode();
        java.lang.Integer num = this.version;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.Spec)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.Spec spec = (com.statsig.androidsdk.evaluator.Spec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, spec.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, spec.type) && this.isActive == spec.isActive && kotlin.jvm.internal.Intrinsics.areEqual(this.salt, spec.salt) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultValue, spec.defaultValue) && this.enabled == spec.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.rules, spec.rules) && kotlin.jvm.internal.Intrinsics.areEqual(this.idType, spec.idType) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, spec.entity) && kotlin.jvm.internal.Intrinsics.areEqual(this.explicitParameters, spec.explicitParameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasSharedParams, spec.hasSharedParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAppIDs, spec.targetAppIDs) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, spec.version);
    }

    public final com.statsig.androidsdk.evaluator.Spec copy(java.lang.String name2, java.lang.String type, boolean isActive, java.lang.String salt, com.statsig.androidsdk.evaluator.ReturnableValue defaultValue, boolean enabled, java.util.List<com.statsig.androidsdk.evaluator.SpecRule> rules, java.lang.String idType, java.lang.String entity, java.util.List<java.lang.String> explicitParameters, java.lang.Boolean hasSharedParams, java.util.List<java.lang.String> targetAppIDs, java.lang.Integer version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        return new com.statsig.androidsdk.evaluator.Spec(name2, type, isActive, salt, defaultValue, enabled, rules, idType, entity, explicitParameters, hasSharedParams, targetAppIDs, version);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getEntity() {
        return this.entity;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.util.List<com.statsig.androidsdk.evaluator.SpecRule> component7() {
        return this.rules;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final com.statsig.androidsdk.evaluator.ReturnableValue getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSalt() {
        return this.salt;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    public final java.util.List<java.lang.String> component12() {
        return this.targetAppIDs;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.Boolean getHasSharedParams() {
        return this.hasSharedParams;
    }

    public final java.util.List<java.lang.String> component10() {
        return this.explicitParameters;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
