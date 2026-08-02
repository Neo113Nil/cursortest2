package com.datadog.android.rum.internal.domain.display;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "Lcom/datadog/android/rum/internal/domain/InfoData;", "", "screenBrightness", "<init>", "(Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "copy", "(Ljava/lang/Number;)Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getScreenBrightness"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DisplayInfo implements com.datadog.android.rum.internal.domain.InfoData {
    private final java.lang.Number screenBrightness;

    public DisplayInfo(java.lang.Number number) {
        this.screenBrightness = number;
    }

    public /* synthetic */ DisplayInfo(java.lang.Number number, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : number);
    }

    public final java.lang.Number getScreenBrightness() {
        return this.screenBrightness;
    }

    public final java.lang.String toString() {
        java.lang.Number number = this.screenBrightness;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayInfo(screenBrightness=");
        sb.append(number);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Number number = this.screenBrightness;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.rum.internal.domain.display.DisplayInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenBrightness, ((com.datadog.android.rum.internal.domain.display.DisplayInfo) other).screenBrightness);
    }

    public final com.datadog.android.rum.internal.domain.display.DisplayInfo copy(java.lang.Number screenBrightness) {
        return new com.datadog.android.rum.internal.domain.display.DisplayInfo(screenBrightness);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Number getScreenBrightness() {
        return this.screenBrightness;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.display.DisplayInfo copy$default(com.datadog.android.rum.internal.domain.display.DisplayInfo displayInfo, java.lang.Number number, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            number = displayInfo.screenBrightness;
        }
        return displayInfo.copy(number);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisplayInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
