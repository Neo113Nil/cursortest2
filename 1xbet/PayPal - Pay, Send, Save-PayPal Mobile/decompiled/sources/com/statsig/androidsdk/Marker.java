package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\b\u0086\b\u0018\u00002\u00020\u0001:\u0001wB÷\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u0010)J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u0010)J\u0012\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010$J\u0080\u0002\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bE\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u00103R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010KR$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010L\u001a\u0004\bM\u0010$\"\u0004\bN\u0010OR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010P\u001a\u0004\bQ\u0010/\"\u0004\bR\u0010SR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010-\"\u0004\bV\u0010WR$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010X\u001a\u0004\bY\u0010)\"\u0004\bZ\u0010[R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010H\u001a\u0004\b\\\u0010'\"\u0004\b]\u0010KR$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\b\u001e\u0010)\"\u0004\b^\u0010[R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010X\u001a\u0004\b\u0016\u0010)\"\u0004\b_\u0010[R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\b\u0015\u0010)\"\u0004\b`\u0010[R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010a\u001a\u0004\bb\u0010\"R$\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010L\u001a\u0004\bc\u0010$\"\u0004\bd\u0010OR$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010L\u001a\u0004\be\u0010$\"\u0004\bf\u0010OR$\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010L\u001a\u0004\bg\u0010$\"\u0004\bh\u0010OR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010H\u001a\u0004\bi\u0010'\"\u0004\bj\u0010KR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010k\u001a\u0004\bl\u00108\"\u0004\bm\u0010nR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010X\u001a\u0004\bo\u0010)\"\u0004\bp\u0010[R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010H\u001a\u0004\bq\u0010'\"\u0004\br\u0010KR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010s\u001a\u0004\bt\u00106R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\bu\u0010$\"\u0004\bv\u0010O"}, d2 = {"Lcom/statsig/androidsdk/Marker;", "", "Lcom/statsig/androidsdk/KeyType;", "key", "Lcom/statsig/androidsdk/ActionType;", "action", "", "timestamp", "Lcom/statsig/androidsdk/StepType;", "step", "", "statusCode", "", "success", "", "url", "idListCount", "reason", "sdkRegion", "markerID", "attempt", "isRetry", "isDelta", "configName", "Lcom/statsig/androidsdk/EvaluationDetails;", "evaluationDetails", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "error", "hasNetwork", "timeoutMS", "isBlocking", "<init>", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Lcom/statsig/androidsdk/KeyType;", "component10", "()Ljava/lang/String;", "component11", "component12", "()Ljava/lang/Integer;", "component13", "()Ljava/lang/Boolean;", "component14", "component15", "component16", "()Lcom/statsig/androidsdk/EvaluationDetails;", "component17", "()Lcom/statsig/androidsdk/Marker$ErrorMessage;", "component18", "component19", "component2", "()Lcom/statsig/androidsdk/ActionType;", "component20", "component3", "()Ljava/lang/Double;", "component4", "()Lcom/statsig/androidsdk/StepType;", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/statsig/androidsdk/Marker;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/statsig/androidsdk/ActionType;", "getAction", "Ljava/lang/Integer;", "getAttempt", "setAttempt", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getConfigName", "setConfigName", "(Ljava/lang/String;)V", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "getError", "setError", "(Lcom/statsig/androidsdk/Marker$ErrorMessage;)V", "Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "setEvaluationDetails", "(Lcom/statsig/androidsdk/EvaluationDetails;)V", "Ljava/lang/Boolean;", "getHasNetwork", "setHasNetwork", "(Ljava/lang/Boolean;)V", "getIdListCount", "setIdListCount", "setBlocking", "setDelta", "setRetry", "Lcom/statsig/androidsdk/KeyType;", "getKey", "getMarkerID", "setMarkerID", "getReason", "setReason", "getSdkRegion", "setSdkRegion", "getStatusCode", "setStatusCode", "Lcom/statsig/androidsdk/StepType;", "getStep", "setStep", "(Lcom/statsig/androidsdk/StepType;)V", "getSuccess", "setSuccess", "getTimeoutMS", "setTimeoutMS", "Ljava/lang/Double;", "getTimestamp", "getUrl", "setUrl", com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsTestTag.ERROR_MESSAGE}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Marker {

    @com.google.gson.annotations.SerializedName("action")
    private final com.statsig.androidsdk.ActionType action;

    @com.google.gson.annotations.SerializedName("attempt")
    private java.lang.Integer attempt;

    @com.google.gson.annotations.SerializedName("configName")
    private java.lang.String configName;

    @com.google.gson.annotations.SerializedName("error")
    private com.statsig.androidsdk.Marker.ErrorMessage error;

    @com.google.gson.annotations.SerializedName("evaluationDetails")
    private com.statsig.androidsdk.EvaluationDetails evaluationDetails;

    @com.google.gson.annotations.SerializedName("hasNetwork")
    private java.lang.Boolean hasNetwork;

    @com.google.gson.annotations.SerializedName("idListCount")
    private java.lang.Integer idListCount;

    @com.google.gson.annotations.SerializedName("isBlocking")
    private java.lang.Boolean isBlocking;

    @com.google.gson.annotations.SerializedName("isDelta")
    private java.lang.Boolean isDelta;

    @com.google.gson.annotations.SerializedName("isRetry")
    private java.lang.Boolean isRetry;

    @com.google.gson.annotations.SerializedName("key")
    private final com.statsig.androidsdk.KeyType key;

    @com.google.gson.annotations.SerializedName("markerID")
    private java.lang.String markerID;

    @com.google.gson.annotations.SerializedName("reason")
    private java.lang.String reason;

    @com.google.gson.annotations.SerializedName("sdkRegion")
    private java.lang.String sdkRegion;

    @com.google.gson.annotations.SerializedName("statusCode")
    private java.lang.Integer statusCode;

    @com.google.gson.annotations.SerializedName("step")
    private com.statsig.androidsdk.StepType step;

    @com.google.gson.annotations.SerializedName("success")
    private java.lang.Boolean success;

    @com.google.gson.annotations.SerializedName("timeoutMS")
    private java.lang.Integer timeoutMS;

    @com.google.gson.annotations.SerializedName("timestamp")
    private final java.lang.Double timestamp;

    @com.google.gson.annotations.SerializedName("url")
    private java.lang.String url;

    public Marker(com.statsig.androidsdk.KeyType keyType, com.statsig.androidsdk.ActionType actionType, java.lang.Double d, com.statsig.androidsdk.StepType stepType, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num3, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str5, com.statsig.androidsdk.EvaluationDetails evaluationDetails, com.statsig.androidsdk.Marker.ErrorMessage errorMessage, java.lang.Boolean bool4, java.lang.Integer num4, java.lang.Boolean bool5) {
        this.key = keyType;
        this.action = actionType;
        this.timestamp = d;
        this.step = stepType;
        this.statusCode = num;
        this.success = bool;
        this.url = str;
        this.idListCount = num2;
        this.reason = str2;
        this.sdkRegion = str3;
        this.markerID = str4;
        this.attempt = num3;
        this.isRetry = bool2;
        this.isDelta = bool3;
        this.configName = str5;
        this.evaluationDetails = evaluationDetails;
        this.error = errorMessage;
        this.hasNetwork = bool4;
        this.timeoutMS = num4;
        this.isBlocking = bool5;
    }

    public /* synthetic */ Marker(com.statsig.androidsdk.KeyType keyType, com.statsig.androidsdk.ActionType actionType, java.lang.Double d, com.statsig.androidsdk.StepType stepType, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num3, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str5, com.statsig.androidsdk.EvaluationDetails evaluationDetails, com.statsig.androidsdk.Marker.ErrorMessage errorMessage, java.lang.Boolean bool4, java.lang.Integer num4, java.lang.Boolean bool5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : keyType, (i & 2) != 0 ? null : actionType, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : stepType, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : evaluationDetails, (i & 65536) != 0 ? null : errorMessage, (i & 131072) != 0 ? null : bool4, (i & 262144) != 0 ? null : num4, (i & 524288) != 0 ? null : bool5);
    }

    public final com.statsig.androidsdk.KeyType getKey() {
        return this.key;
    }

    public final com.statsig.androidsdk.ActionType getAction() {
        return this.action;
    }

    public final java.lang.Double getTimestamp() {
        return this.timestamp;
    }

    public final com.statsig.androidsdk.StepType getStep() {
        return this.step;
    }

    public final void setStep(com.statsig.androidsdk.StepType stepType) {
        this.step = stepType;
    }

    public final java.lang.Integer getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(java.lang.Integer num) {
        this.statusCode = num;
    }

    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public final void setSuccess(java.lang.Boolean bool) {
        this.success = bool;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final void setUrl(java.lang.String str) {
        this.url = str;
    }

    public final java.lang.Integer getIdListCount() {
        return this.idListCount;
    }

    public final void setIdListCount(java.lang.Integer num) {
        this.idListCount = num;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final void setReason(java.lang.String str) {
        this.reason = str;
    }

    public final java.lang.String getSdkRegion() {
        return this.sdkRegion;
    }

    public final void setSdkRegion(java.lang.String str) {
        this.sdkRegion = str;
    }

    public final java.lang.String getMarkerID() {
        return this.markerID;
    }

    public final void setMarkerID(java.lang.String str) {
        this.markerID = str;
    }

    public final java.lang.Integer getAttempt() {
        return this.attempt;
    }

    public final void setAttempt(java.lang.Integer num) {
        this.attempt = num;
    }

    public final java.lang.Boolean isRetry() {
        return this.isRetry;
    }

    public final void setRetry(java.lang.Boolean bool) {
        this.isRetry = bool;
    }

    public final java.lang.Boolean isDelta() {
        return this.isDelta;
    }

    public final void setDelta(java.lang.Boolean bool) {
        this.isDelta = bool;
    }

    public final java.lang.String getConfigName() {
        return this.configName;
    }

    public final void setConfigName(java.lang.String str) {
        this.configName = str;
    }

    public final com.statsig.androidsdk.EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final void setEvaluationDetails(com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        this.evaluationDetails = evaluationDetails;
    }

    public final com.statsig.androidsdk.Marker.ErrorMessage getError() {
        return this.error;
    }

    public final void setError(com.statsig.androidsdk.Marker.ErrorMessage errorMessage) {
        this.error = errorMessage;
    }

    public final java.lang.Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    public final void setHasNetwork(java.lang.Boolean bool) {
        this.hasNetwork = bool;
    }

    public final java.lang.Integer getTimeoutMS() {
        return this.timeoutMS;
    }

    public final void setTimeoutMS(java.lang.Integer num) {
        this.timeoutMS = num;
    }

    public final java.lang.Boolean isBlocking() {
        return this.isBlocking;
    }

    public final void setBlocking(java.lang.Boolean bool) {
        this.isBlocking = bool;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/statsig/androidsdk/Marker$ErrorMessage;", "", "", "message", "name", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/statsig/androidsdk/Marker$ErrorMessage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getMessage", "getName"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorMessage {

        @com.google.gson.annotations.SerializedName("code")
        private final java.lang.String code;

        @com.google.gson.annotations.SerializedName("message")
        private final java.lang.String message;

        @com.google.gson.annotations.SerializedName("name")
        private final java.lang.String name;

        public ErrorMessage(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.message = str;
            this.name = str2;
            this.code = str3;
        }

        public /* synthetic */ ErrorMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorMessage(message=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", code=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.code;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.Marker.ErrorMessage)) {
                return false;
            }
            com.statsig.androidsdk.Marker.ErrorMessage errorMessage = (com.statsig.androidsdk.Marker.ErrorMessage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, errorMessage.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, errorMessage.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, errorMessage.code);
        }

        public final com.statsig.androidsdk.Marker.ErrorMessage copy(java.lang.String message, java.lang.String name2, java.lang.String code) {
            return new com.statsig.androidsdk.Marker.ErrorMessage(message, name2, code);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.statsig.androidsdk.Marker.ErrorMessage copy$default(com.statsig.androidsdk.Marker.ErrorMessage errorMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = errorMessage.message;
            }
            if ((i & 2) != 0) {
                str2 = errorMessage.name;
            }
            if ((i & 4) != 0) {
                str3 = errorMessage.code;
            }
            return errorMessage.copy(str, str2, str3);
        }

        public ErrorMessage() {
            this(null, null, null, 7, null);
        }
    }

    public final java.lang.String toString() {
        com.statsig.androidsdk.KeyType keyType = this.key;
        com.statsig.androidsdk.ActionType actionType = this.action;
        java.lang.Double d = this.timestamp;
        com.statsig.androidsdk.StepType stepType = this.step;
        java.lang.Integer num = this.statusCode;
        java.lang.Boolean bool = this.success;
        java.lang.String str = this.url;
        java.lang.Integer num2 = this.idListCount;
        java.lang.String str2 = this.reason;
        java.lang.String str3 = this.sdkRegion;
        java.lang.String str4 = this.markerID;
        java.lang.Integer num3 = this.attempt;
        java.lang.Boolean bool2 = this.isRetry;
        java.lang.Boolean bool3 = this.isDelta;
        java.lang.String str5 = this.configName;
        com.statsig.androidsdk.EvaluationDetails evaluationDetails = this.evaluationDetails;
        com.statsig.androidsdk.Marker.ErrorMessage errorMessage = this.error;
        java.lang.Boolean bool4 = this.hasNetwork;
        java.lang.Integer num4 = this.timeoutMS;
        java.lang.Boolean bool5 = this.isBlocking;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Marker(key=");
        sb.append(keyType);
        sb.append(", action=");
        sb.append(actionType);
        sb.append(", timestamp=");
        sb.append(d);
        sb.append(", step=");
        sb.append(stepType);
        sb.append(", statusCode=");
        sb.append(num);
        sb.append(", success=");
        sb.append(bool);
        sb.append(", url=");
        sb.append(str);
        sb.append(", idListCount=");
        sb.append(num2);
        sb.append(", reason=");
        sb.append(str2);
        sb.append(", sdkRegion=");
        sb.append(str3);
        sb.append(", markerID=");
        sb.append(str4);
        sb.append(", attempt=");
        sb.append(num3);
        sb.append(", isRetry=");
        sb.append(bool2);
        sb.append(", isDelta=");
        sb.append(bool3);
        sb.append(", configName=");
        sb.append(str5);
        sb.append(", evaluationDetails=");
        sb.append(evaluationDetails);
        sb.append(", error=");
        sb.append(errorMessage);
        sb.append(", hasNetwork=");
        sb.append(bool4);
        sb.append(", timeoutMS=");
        sb.append(num4);
        sb.append(", isBlocking=");
        sb.append(bool5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.statsig.androidsdk.KeyType keyType = this.key;
        int hashCode = keyType == null ? 0 : keyType.hashCode();
        com.statsig.androidsdk.ActionType actionType = this.action;
        int hashCode2 = actionType == null ? 0 : actionType.hashCode();
        java.lang.Double d = this.timestamp;
        int hashCode3 = d == null ? 0 : d.hashCode();
        com.statsig.androidsdk.StepType stepType = this.step;
        int hashCode4 = stepType == null ? 0 : stepType.hashCode();
        java.lang.Integer num = this.statusCode;
        int hashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Boolean bool = this.success;
        int hashCode6 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.url;
        int hashCode7 = str == null ? 0 : str.hashCode();
        java.lang.Integer num2 = this.idListCount;
        int hashCode8 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str2 = this.reason;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.sdkRegion;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.markerID;
        int hashCode11 = str4 == null ? 0 : str4.hashCode();
        java.lang.Integer num3 = this.attempt;
        int hashCode12 = num3 == null ? 0 : num3.hashCode();
        java.lang.Boolean bool2 = this.isRetry;
        int hashCode13 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.Boolean bool3 = this.isDelta;
        int hashCode14 = bool3 == null ? 0 : bool3.hashCode();
        java.lang.String str5 = this.configName;
        int hashCode15 = str5 == null ? 0 : str5.hashCode();
        com.statsig.androidsdk.EvaluationDetails evaluationDetails = this.evaluationDetails;
        int hashCode16 = evaluationDetails == null ? 0 : evaluationDetails.hashCode();
        com.statsig.androidsdk.Marker.ErrorMessage errorMessage = this.error;
        int hashCode17 = errorMessage == null ? 0 : errorMessage.hashCode();
        java.lang.Boolean bool4 = this.hasNetwork;
        int hashCode18 = bool4 == null ? 0 : bool4.hashCode();
        java.lang.Integer num4 = this.timeoutMS;
        int hashCode19 = num4 == null ? 0 : num4.hashCode();
        java.lang.Boolean bool5 = this.isBlocking;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.Marker)) {
            return false;
        }
        com.statsig.androidsdk.Marker marker = (com.statsig.androidsdk.Marker) other;
        return this.key == marker.key && this.action == marker.action && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.timestamp, (java.lang.Object) marker.timestamp) && this.step == marker.step && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, marker.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.success, marker.success) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, marker.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.idListCount, marker.idListCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, marker.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkRegion, marker.sdkRegion) && kotlin.jvm.internal.Intrinsics.areEqual(this.markerID, marker.markerID) && kotlin.jvm.internal.Intrinsics.areEqual(this.attempt, marker.attempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.isRetry, marker.isRetry) && kotlin.jvm.internal.Intrinsics.areEqual(this.isDelta, marker.isDelta) && kotlin.jvm.internal.Intrinsics.areEqual(this.configName, marker.configName) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluationDetails, marker.evaluationDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, marker.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasNetwork, marker.hasNetwork) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeoutMS, marker.timeoutMS) && kotlin.jvm.internal.Intrinsics.areEqual(this.isBlocking, marker.isBlocking);
    }

    public final com.statsig.androidsdk.Marker copy(com.statsig.androidsdk.KeyType key, com.statsig.androidsdk.ActionType action, java.lang.Double timestamp, com.statsig.androidsdk.StepType step, java.lang.Integer statusCode, java.lang.Boolean success, java.lang.String url, java.lang.Integer idListCount, java.lang.String reason, java.lang.String sdkRegion, java.lang.String markerID, java.lang.Integer attempt, java.lang.Boolean isRetry, java.lang.Boolean isDelta, java.lang.String configName, com.statsig.androidsdk.EvaluationDetails evaluationDetails, com.statsig.androidsdk.Marker.ErrorMessage error, java.lang.Boolean hasNetwork, java.lang.Integer timeoutMS, java.lang.Boolean isBlocking) {
        return new com.statsig.androidsdk.Marker(key, action, timestamp, step, statusCode, success, url, idListCount, reason, sdkRegion, markerID, attempt, isRetry, isDelta, configName, evaluationDetails, error, hasNetwork, timeoutMS, isBlocking);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Integer getIdListCount() {
        return this.idListCount;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component4, reason: from getter */
    public final com.statsig.androidsdk.StepType getStep() {
        return this.step;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.Boolean getIsBlocking() {
        return this.isBlocking;
    }

    /* renamed from: component2, reason: from getter */
    public final com.statsig.androidsdk.ActionType getAction() {
        return this.action;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.Integer getTimeoutMS() {
        return this.timeoutMS;
    }

    /* renamed from: component18, reason: from getter */
    public final java.lang.Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    /* renamed from: component17, reason: from getter */
    public final com.statsig.androidsdk.Marker.ErrorMessage getError() {
        return this.error;
    }

    /* renamed from: component16, reason: from getter */
    public final com.statsig.androidsdk.EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getConfigName() {
        return this.configName;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.Boolean getIsDelta() {
        return this.isDelta;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.Boolean getIsRetry() {
        return this.isRetry;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Integer getAttempt() {
        return this.attempt;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMarkerID() {
        return this.markerID;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getSdkRegion() {
        return this.sdkRegion;
    }

    /* renamed from: component1, reason: from getter */
    public final com.statsig.androidsdk.KeyType getKey() {
        return this.key;
    }

    public Marker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }
}
