package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 k2\u00020\u0001:\u0001kB+\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000fBÛ\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u0016\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010!J<\u0010%\u001a\u00028\u0000\"\u0006\b\u0000\u0010\"\u0018\u00012\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0082\b¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00042\u000e\b\u0002\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0004\b-\u0010*J\u001d\u0010.\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J%\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b5\u00106J9\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\u00042\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b7\u00108J#\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J=\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\u00042\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b;\u00108J\u001d\u0010=\u001a\u00020<2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u0004\u0018\u00010<2\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bE\u0010(J\u001d\u0010G\u001a\u00020F2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020F¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u0004\u0018\u00010F2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010F2\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010FH\u0000¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0019¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0019¢\u0006\u0004\bO\u0010NJ\u001d\u0010Q\u001a\u00020P2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u0004\u0018\u00010P2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u0004\u0018\u00010P2\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010PH\u0000¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010(J\u0015\u0010X\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\bX\u0010YJ!\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u0016H\u0000¢\u0006\u0004\bZ\u0010[J!\u0010\\\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b^\u0010YJ%\u0010_\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b_\u0010]J!\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u0016H\u0000¢\u0006\u0004\b`\u0010[J\u0017\u0010b\u001a\u00020a2\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\bb\u0010cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010eR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010fR\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010gR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010dR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010hR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010hR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010hR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010iR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010dR&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010jR&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00110\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010j"}, d2 = {"Lcom/statsig/androidsdk/Layer;", "Lcom/statsig/androidsdk/BaseConfig;", "Lcom/statsig/androidsdk/StatsigClient;", "client", "", "layerName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "Lcom/statsig/androidsdk/EvaluationDetails;", "evalDetails", "<init>", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", "Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "evaluation", "details", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;Lcom/statsig/androidsdk/EvaluationDetails;)V", "name", "", "", "jsonValue", "rule", "groupName", "", "secondaryExposures", "undelegatedSecondaryExposures", "", "isUserInExperiment", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "", "explicitParameters", "parameterRuleIDs", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "T", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "getAllocatedExperimentName", "()Ljava/lang/String;", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getArrayIfPresent", "(Ljava/lang/String;)[Ljava/lang/Object;", "getArrayWithOptionalDefault$android_sdk_release", "getBoolean", "(Ljava/lang/String;Z)Z", "getBooleanIfPresent", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "getDictionaryIfPresent", "(Ljava/lang/String;)Ljava/util/Map;", "getDictionaryWithOptionalDefault$android_sdk_release", "", "getDouble", "(Ljava/lang/String;D)D", "getDoubleIfPresent", "(Ljava/lang/String;)Ljava/lang/Double;", "getDoubleWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;", "getExplicitParameters$android_sdk_release", "()Ljava/util/Set;", "getGroupName", "", "getInt", "(Ljava/lang/String;I)I", "getIntIfPresent", "(Ljava/lang/String;)Ljava/lang/Integer;", "getIntWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "getIsExperimentActive", "()Z", "getIsUserInExperiment", "", "getLong", "(Ljava/lang/String;J)J", "getLongIfPresent", "(Ljava/lang/String;)Ljava/lang/Long;", "getLongWithOptionalDefault$android_sdk_release", "(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "getRuleID", "getRuleIDForParameter", "(Ljava/lang/String;)Ljava/lang/String;", "getSecondaryExposures$android_sdk_release", "()[Ljava/util/Map;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getStringIfPresent", "getStringWithOptionalDefault$android_sdk_release", "getUndelegatedSecondaryExposures$android_sdk_release", "", "logParameterExposure", "(Ljava/lang/String;)V", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigClient;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/util/Set;", "Z", "Ljava/util/Map;", "[Ljava/util/Map;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Layer extends com.statsig.androidsdk.BaseConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.Layer.Companion INSTANCE = new com.statsig.androidsdk.Layer.Companion(null);
    private final java.lang.String allocatedExperimentName;
    private final com.statsig.androidsdk.StatsigClient client;
    private final com.statsig.androidsdk.EvaluationDetails details;
    private final java.util.Set<java.lang.String> explicitParameters;
    private final java.lang.String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final java.util.Map<java.lang.String, java.lang.Object> jsonValue;
    private final java.lang.String name;
    private final java.util.Map<java.lang.String, java.lang.String> parameterRuleIDs;
    private final java.lang.String rule;
    private final java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures;
    private final java.util.Map<java.lang.String, java.lang.String>[] undelegatedSecondaryExposures;

    public /* synthetic */ Layer(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map[] mapArr, java.util.Map[] mapArr2, boolean z, boolean z2, boolean z3, java.lang.String str4, java.util.Set set, java.util.Map map2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(statsigClient, str, evaluationDetails, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new java.util.Map[0] : mapArr, (i & 128) != 0 ? new java.util.Map[0] : mapArr2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : set, (i & 8192) != 0 ? null : map2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Layer(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String>[] mapArr, java.util.Map<java.lang.String, java.lang.String>[] mapArr2, boolean z, boolean z2, boolean z3, java.lang.String str4, java.util.Set<java.lang.String> set, java.util.Map<java.lang.String, java.lang.String> map2) {
        super(str, evaluationDetails);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapArr2, "");
        this.client = statsigClient;
        this.name = str;
        this.details = evaluationDetails;
        this.jsonValue = map;
        this.rule = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isUserInExperiment = z;
        this.isExperimentActive = z2;
        this.isDeviceBased = z3;
        this.allocatedExperimentName = str4;
        this.explicitParameters = set;
        this.parameterRuleIDs = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Layer(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.APIDynamicConfig aPIDynamicConfig, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        this(statsigClient, str, evaluationDetails, r5, r6, r7, r8, r9, r10, r11, r12, r13, r0 != null ? kotlin.collections.ArraysKt.toSet(r0) : null, aPIDynamicConfig.getParameterRuleIDs());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aPIDynamicConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        java.util.Map<java.lang.String, java.lang.Object> value = aPIDynamicConfig.getValue();
        java.lang.String ruleID = aPIDynamicConfig.getRuleID();
        java.lang.String groupName = aPIDynamicConfig.getGroupName();
        java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures = aPIDynamicConfig.getSecondaryExposures();
        java.util.Map<java.lang.String, java.lang.String>[] mapArr = secondaryExposures == null ? new java.util.Map[0] : secondaryExposures;
        java.util.Map<java.lang.String, java.lang.String>[] undelegatedSecondaryExposures = aPIDynamicConfig.getUndelegatedSecondaryExposures();
        java.util.Map<java.lang.String, java.lang.String>[] mapArr2 = undelegatedSecondaryExposures == null ? new java.util.Map[0] : undelegatedSecondaryExposures;
        boolean isUserInExperiment = aPIDynamicConfig.isUserInExperiment();
        boolean isExperimentActive = aPIDynamicConfig.isExperimentActive();
        boolean isDeviceBased = aPIDynamicConfig.isDeviceBased();
        java.lang.String allocatedExperimentName = aPIDynamicConfig.getAllocatedExperimentName();
        java.lang.String[] explicitParameters = aPIDynamicConfig.getExplicitParameters();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Layer(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.evaluator.ConfigEvaluation configEvaluation, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        this(statsigClient, str, evaluationDetails, r5, r6, r7, r8, r9, r10, r11, false, r13, r0 != null ? kotlin.collections.CollectionsKt.toSet(r0) : null, null, 8192, null);
        java.util.Map<java.lang.String, java.lang.Object> mapValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configEvaluation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = configEvaluation.getReturnableValue();
        java.util.Map<java.lang.String, java.lang.Object> emptyMap = (returnableValue == null || (mapValue = returnableValue.getMapValue()) == null) ? kotlin.collections.MapsKt.emptyMap() : mapValue;
        java.lang.String ruleID = configEvaluation.getRuleID();
        java.lang.String groupName = configEvaluation.getGroupName();
        java.util.Map[] mapArr = (java.util.Map[]) configEvaluation.getSecondaryExposures().toArray(new java.util.Map[0]);
        java.util.Map[] mapArr2 = (java.util.Map[]) configEvaluation.getUndelegatedSecondaryExposures().toArray(new java.util.Map[0]);
        boolean isActive = configEvaluation.getIsActive();
        boolean isExperimentGroup = configEvaluation.getIsExperimentGroup();
        java.lang.String configDelegate = configEvaluation.getConfigDelegate();
        java.util.List<java.lang.String> explicitParameters = configEvaluation.getExplicitParameters();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/statsig/androidsdk/Layer$Companion;", "", "<init>", "()V", "", "name", "Lcom/statsig/androidsdk/Layer;", "getError", "(Ljava/lang/String;)Lcom/statsig/androidsdk/Layer;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.statsig.androidsdk.Layer getError(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.statsig.androidsdk.Layer(null, name2, new com.statsig.androidsdk.EvaluationDetails(com.statsig.androidsdk.EvaluationReason.Error, 0L, 0L, 2, null), null, null, null, null, null, false, false, false, null, null, null, 16376, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getString(java.lang.String key, java.lang.String r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.String)) {
            obj = null;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            logParameterExposure(key);
        }
        return str == null ? r4 : str;
    }

    public final java.lang.String getStringIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getStringWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.String getStringWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return layer.getStringWithOptionalDefault$android_sdk_release(str, str2);
    }

    public final /* synthetic */ java.lang.String getStringWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.String r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.String)) {
            obj = null;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            logParameterExposure(key);
        }
        return str == null ? r4 : str;
    }

    public final boolean getBoolean(java.lang.String key, boolean r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(r4);
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Boolean)) {
            obj = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool != null) {
            logParameterExposure(key);
        }
        if (bool != null) {
            valueOf = bool;
        }
        return valueOf.booleanValue();
    }

    public final java.lang.Boolean getBooleanIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getBooleanWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Boolean getBooleanWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return layer.getBooleanWithOptionalDefault$android_sdk_release(str, bool);
    }

    public final /* synthetic */ java.lang.Boolean getBooleanWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Boolean r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Boolean)) {
            obj = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool != null) {
            logParameterExposure(key);
        }
        return bool == null ? r4 : bool;
    }

    public final double getDouble(java.lang.String key, double r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Double.valueOf(r3);
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        java.lang.Object obj2 = (java.lang.Number) obj;
        if (obj2 != null) {
            logParameterExposure(key);
        }
        if (obj2 != null) {
            valueOf = obj2;
        }
        return ((java.lang.Number) valueOf).doubleValue();
    }

    public final java.lang.Double getDoubleIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getDoubleWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Double getDoubleWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.Double d, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        return layer.getDoubleWithOptionalDefault$android_sdk_release(str, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
    public final /* synthetic */ java.lang.Double getDoubleWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Double r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        ?? r0 = (java.lang.Number) obj;
        if (r0 != 0) {
            logParameterExposure(key);
        }
        if (r0 != 0) {
            r5 = r0;
        }
        java.lang.Double d = r5;
        if (d != null) {
            return java.lang.Double.valueOf(d.doubleValue());
        }
        return null;
    }

    public final int getInt(java.lang.String key, int r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Integer.valueOf(r4);
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        java.lang.Object obj2 = (java.lang.Number) obj;
        if (obj2 != null) {
            logParameterExposure(key);
        }
        if (obj2 != null) {
            valueOf = obj2;
        }
        return ((java.lang.Number) valueOf).intValue();
    }

    public final java.lang.Integer getIntIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getIntWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Integer getIntWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return layer.getIntWithOptionalDefault$android_sdk_release(str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
    public final /* synthetic */ java.lang.Integer getIntWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Integer r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        ?? r0 = (java.lang.Number) obj;
        if (r0 != 0) {
            logParameterExposure(key);
        }
        if (r0 != 0) {
            r5 = r0;
        }
        java.lang.Integer num = r5;
        if (num != null) {
            return java.lang.Integer.valueOf(num.intValue());
        }
        return null;
    }

    public final long getLong(java.lang.String key, long r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Long.valueOf(r3);
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        java.lang.Object obj2 = (java.lang.Number) obj;
        if (obj2 != null) {
            logParameterExposure(key);
        }
        if (obj2 != null) {
            valueOf = obj2;
        }
        return ((java.lang.Number) valueOf).longValue();
    }

    public final java.lang.Long getLongIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getLongWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Long getLongWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return layer.getLongWithOptionalDefault$android_sdk_release(str, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
    public final /* synthetic */ java.lang.Long getLongWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Long r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.lang.Number)) {
            obj = null;
        }
        ?? r0 = (java.lang.Number) obj;
        if (r0 != 0) {
            logParameterExposure(key);
        }
        if (r0 != 0) {
            r5 = r0;
        }
        java.lang.Long l = r5;
        if (l != null) {
            return java.lang.Long.valueOf(l.longValue());
        }
        return null;
    }

    public final java.lang.Object[] getArray(java.lang.String key, java.lang.Object[] r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        java.lang.Object[] objArr = obj instanceof java.lang.Object[] ? (java.lang.Object[]) obj : null;
        if (objArr == null) {
            java.lang.Object obj2 = this.jsonValue.get(key);
            java.util.ArrayList arrayList = obj2 instanceof java.util.ArrayList ? (java.util.ArrayList) obj2 : null;
            objArr = arrayList != null ? arrayList.toArray(new java.lang.Object[0]) : null;
        }
        if (objArr != null) {
            logParameterExposure(key);
        }
        return objArr == null ? r5 : objArr;
    }

    public final java.lang.Object[] getArrayIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getArrayWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.lang.Object[] getArrayWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.lang.Object[] objArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            objArr = null;
        }
        return layer.getArrayWithOptionalDefault$android_sdk_release(str, objArr);
    }

    public final /* synthetic */ java.lang.Object[] getArrayWithOptionalDefault$android_sdk_release(java.lang.String key, java.lang.Object[] r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getArray(key, r3);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDictionary(java.lang.String key, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.util.Map)) {
            obj = null;
        }
        java.util.Map<java.lang.String, java.lang.Object> map = (java.util.Map) obj;
        if (map != null) {
            logParameterExposure(key);
        }
        return map == null ? r4 : map;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDictionaryIfPresent(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getDictionaryWithOptionalDefault$android_sdk_release$default(this, key, null, 2, null);
    }

    public static /* synthetic */ java.util.Map getDictionaryWithOptionalDefault$android_sdk_release$default(com.statsig.androidsdk.Layer layer, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return layer.getDictionaryWithOptionalDefault$android_sdk_release(str, map);
    }

    public final /* synthetic */ java.util.Map getDictionaryWithOptionalDefault$android_sdk_release(java.lang.String key, java.util.Map r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.util.Map)) {
            obj = null;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            logParameterExposure(key);
        }
        return map == null ? r4 : map;
    }

    public final com.statsig.androidsdk.DynamicConfig getConfig(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.jsonValue.get(key);
        if (!(obj instanceof java.util.Map)) {
            obj = null;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            logParameterExposure(key);
        }
        java.util.Map map2 = map == null ? null : map;
        if (map2 != null) {
            return new com.statsig.androidsdk.DynamicConfig(key, this.details, map2, this.rule, this.groupName, null, false, false, false, null, null, 2016, null);
        }
        return null;
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

    public final java.lang.String getRuleIDForParameter(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Map<java.lang.String, java.lang.String> map = this.parameterRuleIDs;
        java.lang.String str = map != null ? map.get(key) : null;
        return str == null ? this.rule : str;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.lang.String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] getSecondaryExposures$android_sdk_release() {
        return this.secondaryExposures;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] getUndelegatedSecondaryExposures$android_sdk_release() {
        return this.undelegatedSecondaryExposures;
    }

    public final java.util.Set<java.lang.String> getExplicitParameters$android_sdk_release() {
        return this.explicitParameters;
    }

    private final void logParameterExposure(java.lang.String key) {
        com.statsig.androidsdk.StatsigClient statsigClient = this.client;
        if (statsigClient != null) {
            com.statsig.androidsdk.StatsigClient.logLayerParameterExposure$android_sdk_release$default(statsigClient, this, key, false, 4, null);
        }
    }

    private final /* synthetic */ <T> T get(java.lang.String key, T r4, java.util.Map<java.lang.String, ? extends java.lang.Object> jsonValue) {
        T t = (T) jsonValue.get(key);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        if (t != null) {
            logParameterExposure(key);
        }
        return t == null ? r4 : t;
    }
}
