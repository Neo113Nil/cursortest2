package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 j2\u00020\u0001:\u0001jB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\rB\u0095\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f0\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u00022\u000e\b\u0002\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0000¢\u0006\u0004\b%\u0010\"J\u001d\u0010&\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J9\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J=\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000¢\u0006\u0004\b2\u0010/J\u001d\u00104\u001a\u0002032\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u000203¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u0004\u0018\u0001032\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J%\u00108\u001a\u0004\u0018\u0001032\u0006\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u000103H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b:\u0010\u001eJ\u001d\u0010<\u001a\u00020;2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010;2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0016¢\u0006\u0004\bD\u0010CJ\u001d\u0010F\u001a\u00020E2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020E¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u0004\u0018\u00010E2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u0004\u0018\u00010E2\u0006\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0002¢\u0006\u0004\bL\u0010\u001eJ\u000f\u0010M\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bM\u0010NJ!\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f0\u0014H\u0000¢\u0006\u0004\bO\u0010PJ!\u0010Q\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\bU\u0010RJ\u0019\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\bV\u0010WJ<\u0010\\\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[\u0018\u00010Z\"\u0006\b\u0000\u0010X\u0018\u0001\"\u0006\b\u0001\u0010Y\u0018\u0001*\u0006\u0012\u0002\b\u00030ZH\u0082\b¢\u0006\u0004\b\\\u0010]JR\u0010`\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\"\u0006\b\u0000\u0010^\u0018\u0001\"\u0006\b\u0001\u0010_\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fH\u0082\b¢\u0006\u0004\b`\u0010aJ:\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010[\"\u0006\b\u0000\u0010X\u0018\u0001\"\u0006\b\u0001\u0010Y\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030[H\u0082\b¢\u0006\u0004\bb\u0010cR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010dR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010dR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010fR\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010gR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010hR&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010i"}, d2 = {"Lcom/statsig/androidsdk/DynamicConfig;", "Lcom/statsig/androidsdk/BaseConfig;", "", "configName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "Lcom/statsig/androidsdk/EvaluationDetails;", "evalDetails", "<init>", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", "Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "evaluation", "details", "(Ljava/lang/String;Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;Lcom/statsig/androidsdk/EvaluationDetails;)V", "name", "", "", "jsonValue", "rule", "groupName", "", "secondaryExposures", "", "isUserInExperiment", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "rulePassed", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;ZZZLjava/lang/String;Ljava/lang/Boolean;)V", "getAllocatedExperimentName$android_sdk_release", "()Ljava/lang/String;", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getArrayIfPresent", "(Ljava/lang/String;)[Ljava/lang/Object;", "getArrayWithOptionalDefault$android_sdk_release", "getBoolean", "(Ljava/lang/String;Z)Z", "getBooleanIfPresent", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "getDictionaryIfPresent", "(Ljava/lang/String;)Ljava/util/Map;", "getDictionaryWithOptionalDefault$android_sdk_release", "", "getDouble", "(Ljava/lang/String;D)D", "getDoubleIfPresent", "(Ljava/lang/String;)Ljava/lang/Double;", "getDoubleWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;", "getGroupName", "", "getInt", "(Ljava/lang/String;I)I", "getIntIfPresent", "(Ljava/lang/String;)Ljava/lang/Integer;", "getIntWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "getIsExperimentActive", "()Z", "getIsUserInExperiment", "", "getLong", "(Ljava/lang/String;J)J", "getLongIfPresent", "(Ljava/lang/String;)Ljava/lang/Long;", "getLongWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "getRuleID", "getRulePassed", "()Ljava/lang/Boolean;", "getSecondaryExposures$android_sdk_release", "()[Ljava/util/Map;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getStringIfPresent", "(Ljava/lang/String;)Ljava/lang/String;", "getStringWithOptionalDefault$android_sdk_release", "getValue", "()Ljava/util/Map;", "A", "B", "", "Lkotlin/Pair;", "asListOfPairs", "(Ljava/util/List;)Ljava/util/List;", "K", "V", "asMapOf", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "asPairOf", "(Lkotlin/Pair;)Lkotlin/Pair;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Z", "Ljava/util/Map;", "Ljava/lang/Boolean;", "[Ljava/util/Map;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicConfig extends com.statsig.androidsdk.BaseConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.DynamicConfig.Companion INSTANCE = new com.statsig.androidsdk.DynamicConfig.Companion(null);
    private final java.lang.String allocatedExperimentName;
    private final com.statsig.androidsdk.EvaluationDetails details;
    private final java.lang.String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final java.util.Map<java.lang.String, java.lang.Object> jsonValue;
    private final java.lang.String name;
    private final java.lang.String rule;
    private final java.lang.Boolean rulePassed;
    private final java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures;

    public /* synthetic */ DynamicConfig(java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map[] mapArr, boolean z, boolean z2, boolean z3, java.lang.String str4, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, evaluationDetails, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? new java.util.Map[0] : mapArr, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicConfig(java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String>[] mapArr, boolean z, boolean z2, boolean z3, java.lang.String str4, java.lang.Boolean bool) {
        super(str, evaluationDetails);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapArr, "");
        this.name = str;
        this.details = evaluationDetails;
        this.jsonValue = map;
        this.rule = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.isUserInExperiment = z;
        this.isExperimentActive = z2;
        this.isDeviceBased = z3;
        this.allocatedExperimentName = str4;
        this.rulePassed = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DynamicConfig(java.lang.String str, com.statsig.androidsdk.APIDynamicConfig aPIDynamicConfig, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        this(str, evaluationDetails, r4, r5, r6, r0 == null ? new java.util.Map[0] : r0, aPIDynamicConfig.isUserInExperiment(), aPIDynamicConfig.isExperimentActive(), aPIDynamicConfig.isDeviceBased(), aPIDynamicConfig.getAllocatedExperimentName(), aPIDynamicConfig.getRulePassed());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aPIDynamicConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        java.util.Map<java.lang.String, java.lang.Object> value = aPIDynamicConfig.getValue();
        java.lang.String ruleID = aPIDynamicConfig.getRuleID();
        java.lang.String groupName = aPIDynamicConfig.getGroupName();
        java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures = aPIDynamicConfig.getSecondaryExposures();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DynamicConfig(java.lang.String str, com.statsig.androidsdk.evaluator.ConfigEvaluation configEvaluation, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        this(str, evaluationDetails, (r0 == null || (r0 = r0.getMapValue()) == null) ? kotlin.collections.MapsKt.emptyMap() : r0, configEvaluation.getRuleID(), configEvaluation.getGroupName(), (java.util.Map[]) configEvaluation.getSecondaryExposures().toArray(new java.util.Map[0]), configEvaluation.getIsExperimentGroup(), configEvaluation.getIsActive(), false, null, null, 1536, null);
        java.util.Map<java.lang.String, java.lang.Object> mapValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configEvaluation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = configEvaluation.getReturnableValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/statsig/androidsdk/DynamicConfig$Companion;", "", "<init>", "()V", "", "name", "Lcom/statsig/androidsdk/DynamicConfig;", "getError", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.statsig.androidsdk.DynamicConfig getError(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.statsig.androidsdk.DynamicConfig(name2, new com.statsig.androidsdk.EvaluationDetails(com.statsig.androidsdk.EvaluationReason.Error, 0L, 0L, 2, null), null, null, null, null, false, false, false, null, null, 2044, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getString(java.lang.String key, java.lang.String r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!(this.jsonValue.get(key) instanceof java.lang.String)) {
            return r4;
        }
        java.lang.Object obj = this.jsonValue.get(key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (java.lang.String) obj;
    }

    public final java.lang.String getStringIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getStringWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.String getStringWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return dynamicConfig.getStringWithOptionalDefault$android_sdk_release(str, str2);
    }

    public final /* synthetic */ java.lang.String getStringWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.String r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getString(key, r3);
    }

    public final boolean getBoolean(java.lang.String key, boolean r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!(this.jsonValue.get(key) instanceof java.lang.Boolean)) {
            return r4;
        }
        java.lang.Object obj = this.jsonValue.get(key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final java.lang.Boolean getBooleanIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getBooleanWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Boolean getBooleanWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return dynamicConfig.getBooleanWithOptionalDefault$android_sdk_release(str, bool);
    }

    public final /* synthetic */ java.lang.Boolean getBooleanWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Boolean r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!(this.jsonValue.get(key) instanceof java.lang.Boolean)) {
            return r4;
        }
        java.lang.Object obj = this.jsonValue.get(key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (java.lang.Boolean) obj;
    }

    public final double getDouble(java.lang.String key, double r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).doubleValue() : r3;
    }

    public final java.lang.Double getDoubleIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getDoubleWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Double getDoubleWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.Double d, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        return dynamicConfig.getDoubleWithOptionalDefault$android_sdk_release(str, d);
    }

    public final /* synthetic */ java.lang.Double getDoubleWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Double r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue()) : r3;
    }

    public final int getInt(java.lang.String key, int r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : r3;
    }

    public final java.lang.Integer getIntIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getIntWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Integer getIntWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return dynamicConfig.getIntWithOptionalDefault$android_sdk_release(str, num);
    }

    public final /* synthetic */ java.lang.Integer getIntWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Integer r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()) : r3;
    }

    public final long getLong(java.lang.String key, long r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).longValue() : r3;
    }

    public final java.lang.Long getLongIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getLongWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Long getLongWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return dynamicConfig.getLongWithOptionalDefault$android_sdk_release(str, l);
    }

    public final /* synthetic */ java.lang.Long getLongWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Long r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Number ? java.lang.Long.valueOf(((java.lang.Number) obj).longValue()) : r3;
    }

    public final java.lang.Object[] getArray(java.lang.String key, java.lang.Object[] r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        return obj instanceof java.lang.Object[] ? (java.lang.Object[]) obj : obj instanceof java.util.ArrayList ? ((java.util.Collection) obj).toArray(new java.lang.Object[0]) : r3;
    }

    public final java.lang.Object[] getArrayIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getArrayWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Object[] getArrayWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.lang.Object[] objArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            objArr = null;
        }
        return dynamicConfig.getArrayWithOptionalDefault$android_sdk_release(str, objArr);
    }

    public final /* synthetic */ java.lang.Object[] getArrayWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Object[] r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getArray(key, r3);
    }

    private final /* synthetic */ <A, B> java.util.List<kotlin.Pair<A, B>> asListOfPairs(java.util.List<?> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            kotlin.Pair pair = null;
            if (obj instanceof kotlin.Pair) {
                kotlin.Pair pair2 = (kotlin.Pair) obj;
                java.lang.Object first = pair2.getFirst();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "A");
                if (first instanceof java.lang.Object) {
                    java.lang.Object second = pair2.getSecond();
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "B");
                    if (second instanceof java.lang.Object) {
                        java.lang.Object first2 = pair2.getFirst();
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "A");
                        java.lang.Object second2 = pair2.getSecond();
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "B");
                        pair = kotlin.TuplesKt.to(first2, second2);
                    }
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    private final /* synthetic */ <A, B> kotlin.Pair<A, B> asPairOf(kotlin.Pair<?, ?> pair) {
        java.lang.Object first = pair.getFirst();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "A");
        if (!(first instanceof java.lang.Object)) {
            return null;
        }
        java.lang.Object second = pair.getSecond();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "B");
        if (!(second instanceof java.lang.Object)) {
            return null;
        }
        java.lang.Object first2 = pair.getFirst();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "A");
        java.lang.Object second2 = pair.getSecond();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "B");
        return kotlin.TuplesKt.to(first2, second2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <K, V> java.util.Map<K, V> asMapOf(java.util.Map<?, ?> map, java.util.Map<K, ? extends V> map2) {
        if (map.keySet().isEmpty() || map.values().isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.Object first = kotlin.collections.CollectionsKt.first(map.keySet());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "K");
        if (first instanceof java.lang.Object) {
            java.lang.Object first2 = kotlin.collections.CollectionsKt.first(map.values());
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "V");
            if (first2 instanceof java.lang.Object) {
                java.util.List list = kotlin.collections.MapsKt.toList(map);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    kotlin.Pair pair = null;
                    if (obj instanceof kotlin.Pair) {
                        kotlin.Pair pair2 = (kotlin.Pair) obj;
                        java.lang.Object first3 = pair2.getFirst();
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "K");
                        if (first3 instanceof java.lang.Object) {
                            java.lang.Object second = pair2.getSecond();
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "V");
                            if (second instanceof java.lang.Object) {
                                java.lang.Object first4 = pair2.getFirst();
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "K");
                                java.lang.Object second2 = pair2.getSecond();
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "V");
                                pair = kotlin.TuplesKt.to(first4, second2);
                            }
                        }
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                java.util.ArrayList<kotlin.Pair> arrayList2 = arrayList;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (kotlin.Pair pair3 : arrayList2) {
                    kotlin.Pair pair4 = new kotlin.Pair(pair3.getFirst(), pair3.getSecond());
                    linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
                }
                return linkedHashMap;
            }
        }
        return map2;
    }

    static /* synthetic */ java.util.Map asMapOf$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        kotlin.Pair pair;
        if ((i & 1) != 0) {
            map2 = null;
        }
        if (map.keySet().isEmpty() || map.values().isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.Object first = kotlin.collections.CollectionsKt.first(map.keySet());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "K");
        if (first instanceof java.lang.Object) {
            java.lang.Object first2 = kotlin.collections.CollectionsKt.first(map.values());
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "V");
            if (first2 instanceof java.lang.Object) {
                java.util.List list = kotlin.collections.MapsKt.toList(map);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof kotlin.Pair) {
                        kotlin.Pair pair2 = (kotlin.Pair) obj2;
                        java.lang.Object first3 = pair2.getFirst();
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "K");
                        if (first3 instanceof java.lang.Object) {
                            java.lang.Object second = pair2.getSecond();
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "V");
                            if (second instanceof java.lang.Object) {
                                java.lang.Object first4 = pair2.getFirst();
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "K");
                                java.lang.Object second2 = pair2.getSecond();
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "V");
                                pair = kotlin.TuplesKt.to(first4, second2);
                            }
                        }
                        pair = null;
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                java.util.ArrayList<kotlin.Pair> arrayList2 = arrayList;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (kotlin.Pair pair3 : arrayList2) {
                    kotlin.Pair pair4 = new kotlin.Pair(pair3.getFirst(), pair3.getSecond());
                    linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
                }
                return linkedHashMap;
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<java.lang.String, java.lang.Object> getDictionary(java.lang.String key, java.util.Map<java.lang.String, ? extends java.lang.Object> r5) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.util.Map)) {
            return r5;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.keySet().isEmpty() || map.values().isEmpty()) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = null;
        if ((kotlin.collections.CollectionsKt.first(map.keySet()) instanceof java.lang.String) && (kotlin.collections.CollectionsKt.first(map.values()) instanceof java.lang.Object)) {
            java.util.List list = kotlin.collections.MapsKt.toList(map);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof kotlin.Pair) {
                    kotlin.Pair pair2 = (kotlin.Pair) obj2;
                    if ((pair2.getFirst() instanceof java.lang.String) && (pair2.getSecond() instanceof java.lang.Object)) {
                        java.lang.Object first = pair2.getFirst();
                        if (first == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str = (java.lang.String) first;
                        java.lang.Object second = pair2.getSecond();
                        if (second == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        }
                        pair = kotlin.TuplesKt.to(str, second);
                        if (pair == null) {
                            arrayList.add(pair);
                        }
                    }
                }
                pair = null;
                if (pair == null) {
                }
            }
            java.util.ArrayList<kotlin.Pair> arrayList2 = arrayList;
            linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (kotlin.Pair pair3 : arrayList2) {
                kotlin.Pair pair4 = new kotlin.Pair(pair3.getFirst(), pair3.getSecond());
                linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
            }
        }
        return linkedHashMap;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDictionaryIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getDictionaryWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.util.Map getDictionaryWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.DynamicConfig dynamicConfig, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return dynamicConfig.getDictionaryWithOptionalDefault$android_sdk_release(str, map);
    }

    public final /* synthetic */ java.util.Map getDictionaryWithOptionalDefault$android_sdk_release(java.lang.String key, java.util.Map r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getDictionary(key, r3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.statsig.androidsdk.DynamicConfig getConfig(java.lang.String key) {
        java.util.LinkedHashMap emptyMap;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (map.keySet().isEmpty() || map.values().isEmpty()) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            } else if ((kotlin.collections.CollectionsKt.first(map.keySet()) instanceof java.lang.String) && (kotlin.collections.CollectionsKt.first(map.values()) instanceof java.lang.Object)) {
                java.util.List list = kotlin.collections.MapsKt.toList(map);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof kotlin.Pair) {
                        kotlin.Pair pair2 = (kotlin.Pair) obj2;
                        if ((pair2.getFirst() instanceof java.lang.String) && (pair2.getSecond() instanceof java.lang.Object)) {
                            java.lang.Object first = pair2.getFirst();
                            if (first == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            java.lang.String str = (java.lang.String) first;
                            java.lang.Object second = pair2.getSecond();
                            if (second == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            pair = kotlin.TuplesKt.to(str, second);
                            if (pair == null) {
                                arrayList.add(pair);
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
                java.util.ArrayList<kotlin.Pair> arrayList2 = arrayList;
                emptyMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (kotlin.Pair pair3 : arrayList2) {
                    kotlin.Pair pair4 = new kotlin.Pair(pair3.getFirst(), pair3.getSecond());
                    emptyMap.put(pair4.getFirst(), pair4.getSecond());
                }
            } else {
                emptyMap = null;
            }
            if (emptyMap != null) {
                return new com.statsig.androidsdk.DynamicConfig(key, this.details, emptyMap, this.rule, this.groupName, null, false, false, false, null, null, 2016, null);
            }
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getValue() {
        return this.jsonValue;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    /* renamed from: getRuleID, reason: from getter */
    public final java.lang.String getRule() {
        return this.rule;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.lang.Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] getSecondaryExposures$android_sdk_release() {
        return this.secondaryExposures;
    }

    /* renamed from: getAllocatedExperimentName$android_sdk_release, reason: from getter */
    public final java.lang.String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }
}
