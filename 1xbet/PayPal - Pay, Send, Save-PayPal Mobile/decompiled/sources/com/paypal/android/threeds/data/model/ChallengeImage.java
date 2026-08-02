package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeImage;", "", "", "medium", com.adjust.sdk.Constants.HIGH, "extraHigh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/ChallengeImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMedium", "getHigh", "getExtraHigh"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChallengeImage {
    public static final int $stable = 0;
    public java.lang.String extraHigh;
    public java.lang.String high;
    public java.lang.String medium;

    public ChallengeImage(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.medium = str;
        this.high = str2;
        this.extraHigh = str3;
    }

    public final java.lang.String getMedium() {
        return this.medium;
    }

    public final java.lang.String getHigh() {
        return this.high;
    }

    public final java.lang.String getExtraHigh() {
        return this.extraHigh;
    }

    public /* synthetic */ ChallengeImage() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.medium;
        java.lang.String str2 = this.high;
        java.lang.String str3 = this.extraHigh;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeImage(medium=");
        sb.append(str);
        sb.append(", high=");
        sb.append(str2);
        sb.append(", extraHigh=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.medium.hashCode() * 31) + this.high.hashCode()) * 31) + this.extraHigh.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.ChallengeImage)) {
            return false;
        }
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage = (com.paypal.android.threeds.data.model.ChallengeImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.medium, challengeImage.medium) && kotlin.jvm.internal.Intrinsics.areEqual(this.high, challengeImage.high) && kotlin.jvm.internal.Intrinsics.areEqual(this.extraHigh, challengeImage.extraHigh);
    }

    public final com.paypal.android.threeds.data.model.ChallengeImage copy(java.lang.String medium, java.lang.String high, java.lang.String extraHigh) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(medium, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(high, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraHigh, "");
        return new com.paypal.android.threeds.data.model.ChallengeImage(medium, high, extraHigh);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExtraHigh() {
        return this.extraHigh;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHigh() {
        return this.high;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMedium() {
        return this.medium;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.ChallengeImage copy$default(com.paypal.android.threeds.data.model.ChallengeImage challengeImage, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = challengeImage.medium;
        }
        if ((i & 2) != 0) {
            str2 = challengeImage.high;
        }
        if ((i & 4) != 0) {
            str3 = challengeImage.extraHigh;
        }
        return challengeImage.copy(str, str2, str3);
    }
}
