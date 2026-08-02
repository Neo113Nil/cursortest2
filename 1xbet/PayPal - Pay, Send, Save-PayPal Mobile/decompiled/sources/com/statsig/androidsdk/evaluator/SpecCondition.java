package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ`\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b'\u0010\r"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecCondition;", "", "", "type", "targetValue", "operator", "field", "", "additionalValues", "idType", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/statsig/androidsdk/evaluator/SpecCondition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAdditionalValues", "Ljava/lang/String;", "getField", "getIdType", "getOperator", "Ljava/lang/Object;", "getTargetValue", "getType"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpecCondition {

    @com.google.gson.annotations.SerializedName("additionalValues")
    public java.util.Map<java.lang.String, java.lang.Object> additionalValues;

    @com.google.gson.annotations.SerializedName("field")
    public java.lang.String field;

    @com.google.gson.annotations.SerializedName("idType")
    public java.lang.String idType;

    @com.google.gson.annotations.SerializedName("operator")
    public java.lang.String operator;

    @com.google.gson.annotations.SerializedName("targetValue")
    public java.lang.Object targetValue;

    @com.google.gson.annotations.SerializedName("type")
    public java.lang.String type;

    public SpecCondition(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.targetValue = obj;
        this.operator = str2;
        this.field = str3;
        this.additionalValues = map;
        this.idType = str4;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.Object getTargetValue() {
        return this.targetValue;
    }

    public final java.lang.String getOperator() {
        return this.operator;
    }

    public final java.lang.String getField() {
        return this.field;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalValues() {
        return this.additionalValues;
    }

    public final java.lang.String getIdType() {
        return this.idType;
    }

    public /* synthetic */ SpecCondition() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.Object obj = this.targetValue;
        java.lang.String str2 = this.operator;
        java.lang.String str3 = this.field;
        java.util.Map<java.lang.String, java.lang.Object> map = this.additionalValues;
        java.lang.String str4 = this.idType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecCondition(type=");
        sb.append(str);
        sb.append(", targetValue=");
        sb.append(obj);
        sb.append(", operator=");
        sb.append(str2);
        sb.append(", field=");
        sb.append(str3);
        sb.append(", additionalValues=");
        sb.append(map);
        sb.append(", idType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.Object obj = this.targetValue;
        int hashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.String str = this.operator;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.field;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.additionalValues;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.idType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.SpecCondition)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.SpecCondition specCondition = (com.statsig.androidsdk.evaluator.SpecCondition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, specCondition.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetValue, specCondition.targetValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.operator, specCondition.operator) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, specCondition.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalValues, specCondition.additionalValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.idType, specCondition.idType);
    }

    public final com.statsig.androidsdk.evaluator.SpecCondition copy(java.lang.String type, java.lang.Object targetValue, java.lang.String operator, java.lang.String field, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalValues, java.lang.String idType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idType, "");
        return new com.statsig.androidsdk.evaluator.SpecCondition(type, targetValue, operator, field, additionalValues, idType);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIdType() {
        return this.idType;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component5() {
        return this.additionalValues;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getField() {
        return this.field;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOperator() {
        return this.operator;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getTargetValue() {
        return this.targetValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.statsig.androidsdk.evaluator.SpecCondition copy$default(com.statsig.androidsdk.evaluator.SpecCondition specCondition, java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, java.util.Map map, java.lang.String str4, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = specCondition.type;
        }
        if ((i & 2) != 0) {
            obj = specCondition.targetValue;
        }
        java.lang.Object obj3 = obj;
        if ((i & 4) != 0) {
            str2 = specCondition.operator;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = specCondition.field;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            map = specCondition.additionalValues;
        }
        java.util.Map map2 = map;
        if ((i & 32) != 0) {
            str4 = specCondition.idType;
        }
        return specCondition.copy(str, obj3, str5, str6, map2, str4);
    }
}
