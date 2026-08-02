package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00120\b\u0002\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b`\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0012\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b-\u0010\u001dRB\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b`\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100RJ\u00101\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b`\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010.\u001a\u0004\b2\u00100\"\u0004\b3\u00104"}, d2 = {"Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "", "", "booleanValue", "jsonValue", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "returnableValue", "", "ruleID", "groupName", "Ljava/util/ArrayList;", "", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "secondaryExposures", "", "explicitParameters", "configDelegate", "isExperimentGroup", "isActive", "isUnrecognized", "", "configVersion", "<init>", "(ZLjava/lang/Object;Lcom/statsig/androidsdk/evaluator/ReturnableValue;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/Integer;)V", "Z", "getBooleanValue", "()Z", "Ljava/lang/String;", "getConfigDelegate", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getConfigVersion", "()Ljava/lang/Integer;", "setConfigVersion", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getExplicitParameters", "()Ljava/util/List;", "getGroupName", "Ljava/lang/Object;", "getJsonValue", "()Ljava/lang/Object;", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "getReturnableValue", "()Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "getRuleID", "Ljava/util/ArrayList;", "getSecondaryExposures", "()Ljava/util/ArrayList;", "undelegatedSecondaryExposures", "getUndelegatedSecondaryExposures", "setUndelegatedSecondaryExposures", "(Ljava/util/ArrayList;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigEvaluation {
    private final boolean booleanValue;
    private final java.lang.String configDelegate;
    private java.lang.Integer configVersion;
    private final java.util.List<java.lang.String> explicitParameters;
    private final java.lang.String groupName;
    private final boolean isActive;
    private final boolean isExperimentGroup;
    private final boolean isUnrecognized;
    private final java.lang.Object jsonValue;
    private final com.statsig.androidsdk.evaluator.ReturnableValue returnableValue;
    private final java.lang.String ruleID;
    private final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> secondaryExposures;
    private java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> undelegatedSecondaryExposures;

    public ConfigEvaluation(boolean z, java.lang.Object obj, com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, java.lang.String str, java.lang.String str2, java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList, java.util.List<java.lang.String> list, java.lang.String str3, boolean z2, boolean z3, boolean z4, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        this.booleanValue = z;
        this.jsonValue = obj;
        this.returnableValue = returnableValue;
        this.ruleID = str;
        this.groupName = str2;
        this.secondaryExposures = arrayList;
        this.explicitParameters = list;
        this.configDelegate = str3;
        this.isExperimentGroup = z2;
        this.isActive = z3;
        this.isUnrecognized = z4;
        this.configVersion = num;
        this.undelegatedSecondaryExposures = arrayList;
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final java.lang.Object getJsonValue() {
        return this.jsonValue;
    }

    public final com.statsig.androidsdk.evaluator.ReturnableValue getReturnableValue() {
        return this.returnableValue;
    }

    public /* synthetic */ ConfigEvaluation(boolean z, java.lang.Object obj, com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.List list, java.lang.String str3, boolean z2, boolean z3, boolean z4, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : returnableValue, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? new java.util.ArrayList() : arrayList, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) == 0 ? z4 : false, (i & 2048) == 0 ? num : null);
    }

    public final java.lang.String getRuleID() {
        return this.ruleID;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final java.util.List<java.lang.String> getExplicitParameters() {
        return this.explicitParameters;
    }

    public final java.lang.String getConfigDelegate() {
        return this.configDelegate;
    }

    /* renamed from: isExperimentGroup, reason: from getter */
    public final boolean getIsExperimentGroup() {
        return this.isExperimentGroup;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isUnrecognized, reason: from getter */
    public final boolean getIsUnrecognized() {
        return this.isUnrecognized;
    }

    public final java.lang.Integer getConfigVersion() {
        return this.configVersion;
    }

    public final void setConfigVersion(java.lang.Integer num) {
        this.configVersion = num;
    }

    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final void setUndelegatedSecondaryExposures(java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        this.undelegatedSecondaryExposures = arrayList;
    }

    public ConfigEvaluation() {
        this(false, null, null, null, null, null, null, null, false, false, false, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
