package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r"}, d2 = {"Lcom/statsig/androidsdk/BaseConfig;", "", "", "name", "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "<init>", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;)V", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getName", "()Ljava/lang/String;", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BaseConfig {
    private final com.statsig.androidsdk.EvaluationDetails details;
    private final java.lang.String name;

    public BaseConfig(java.lang.String str, com.statsig.androidsdk.EvaluationDetails evaluationDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationDetails, "");
        this.name = str;
        this.details = evaluationDetails;
    }

    public java.lang.String getName() {
        return this.name;
    }

    /* renamed from: getEvaluationDetails, reason: from getter */
    public com.statsig.androidsdk.EvaluationDetails getDetails() {
        return this.details;
    }
}
