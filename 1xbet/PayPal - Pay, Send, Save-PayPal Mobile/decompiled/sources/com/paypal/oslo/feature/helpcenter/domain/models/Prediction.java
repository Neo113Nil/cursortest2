package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/Prediction;", "", "", "intent", "intentCode", "", "score", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/helpcenter/domain/models/Prediction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent", "getIntentCode", "Ljava/lang/Integer;", "getScore"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Prediction {
    public static final int $stable = 0;
    private final java.lang.String intent;
    private final java.lang.String intentCode;
    private final java.lang.Integer score;

    public Prediction(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        this.intent = str;
        this.intentCode = str2;
        this.score = num;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final java.lang.String getIntentCode() {
        return this.intentCode;
    }

    public final java.lang.Integer getScore() {
        return this.score;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.intent;
        java.lang.String str2 = this.intentCode;
        java.lang.Integer num = this.score;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Prediction(intent=");
        sb.append(str);
        sb.append(", intentCode=");
        sb.append(str2);
        sb.append(", score=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.intent;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.intentCode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.score;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.Prediction)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.Prediction prediction = (com.paypal.oslo.feature.helpcenter.domain.models.Prediction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, prediction.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentCode, prediction.intentCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.score, prediction.score);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.Prediction copy(java.lang.String intent, java.lang.String intentCode, java.lang.Integer score) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.Prediction(intent, intentCode, score);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getScore() {
        return this.score;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIntentCode() {
        return this.intentCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.Prediction copy$default(com.paypal.oslo.feature.helpcenter.domain.models.Prediction prediction, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = prediction.intent;
        }
        if ((i & 2) != 0) {
            str2 = prediction.intentCode;
        }
        if ((i & 4) != 0) {
            num = prediction.score;
        }
        return prediction.copy(str, str2, num);
    }
}
