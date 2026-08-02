package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r"}, d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse;", "", "", "values", "Lcom/statsig/androidsdk/EvaluationDetails;", "evaluationDetails", "<init>", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;)V", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getInitializeResponseJSON", "()Ljava/lang/String;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalInitializeResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.ExternalInitializeResponse.Companion INSTANCE = new com.statsig.androidsdk.ExternalInitializeResponse.Companion(null);
    private final com.statsig.androidsdk.EvaluationDetails evaluationDetails;
    private final java.lang.String values;

    public ExternalInitializeResponse(java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        this.values = str;
        this.evaluationDetails = evaluationDetails;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse$Companion;", "", "<init>", "()V", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getUninitialized", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.statsig.androidsdk.ExternalInitializeResponse getUninitialized() {
            return new com.statsig.androidsdk.ExternalInitializeResponse(null, new com.statsig.androidsdk.EvaluationDetails(com.statsig.androidsdk.EvaluationReason.Uninitialized, 0L, 0L, 2, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getInitializeResponseJSON, reason: from getter */
    public final java.lang.String getValues() {
        return this.values;
    }

    public final com.statsig.androidsdk.EvaluationDetails getEvaluationDetails() {
        return com.statsig.androidsdk.EvaluationDetails.copy$default(this.evaluationDetails, null, 0L, 0L, 7, null);
    }
}
