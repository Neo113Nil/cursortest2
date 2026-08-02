package com.datadog.android.sessionreplay.recorder;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "screenBounds", "", "screenOrientation", "", "screenDensity", "", "themeColor", "<init>", "(Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IFLjava/lang/String;)V", "component1", "()Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "component2", "()I", "component3", "()F", "component4", "()Ljava/lang/String;", "copy", "(Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IFLjava/lang/String;)Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "getScreenBounds", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScreenDensity", com.visa.cbp.getEncExpo.warmup, "getScreenOrientation", "Ljava/lang/String;", "getThemeColor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SystemInformation {
    private final com.datadog.android.sessionreplay.utils.GlobalBounds screenBounds;
    private final float screenDensity;
    private final int screenOrientation;
    private final java.lang.String themeColor;

    public SystemInformation(com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds, int i, float f, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalBounds, "");
        this.screenBounds = globalBounds;
        this.screenOrientation = i;
        this.screenDensity = f;
        this.themeColor = str;
    }

    public /* synthetic */ SystemInformation(com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds, int i, float f, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(globalBounds, (i2 & 2) != 0 ? 0 : i, f, (i2 & 8) != 0 ? null : str);
    }

    public final com.datadog.android.sessionreplay.utils.GlobalBounds getScreenBounds() {
        return this.screenBounds;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final float getScreenDensity() {
        return this.screenDensity;
    }

    public final java.lang.String getThemeColor() {
        return this.themeColor;
    }

    public final java.lang.String toString() {
        com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds = this.screenBounds;
        int i = this.screenOrientation;
        float f = this.screenDensity;
        java.lang.String str = this.themeColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemInformation(screenBounds=");
        sb.append(globalBounds);
        sb.append(", screenOrientation=");
        sb.append(i);
        sb.append(", screenDensity=");
        sb.append(f);
        sb.append(", themeColor=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.screenBounds.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.screenOrientation);
        int hashCode3 = java.lang.Float.hashCode(this.screenDensity);
        java.lang.String str = this.themeColor;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.recorder.SystemInformation)) {
            return false;
        }
        com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation = (com.datadog.android.sessionreplay.recorder.SystemInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenBounds, systemInformation.screenBounds) && this.screenOrientation == systemInformation.screenOrientation && java.lang.Float.compare(this.screenDensity, systemInformation.screenDensity) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.themeColor, systemInformation.themeColor);
    }

    public final com.datadog.android.sessionreplay.recorder.SystemInformation copy(com.datadog.android.sessionreplay.utils.GlobalBounds screenBounds, int screenOrientation, float screenDensity, java.lang.String themeColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenBounds, "");
        return new com.datadog.android.sessionreplay.recorder.SystemInformation(screenBounds, screenOrientation, screenDensity, themeColor);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getThemeColor() {
        return this.themeColor;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScreenDensity() {
        return this.screenDensity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.sessionreplay.utils.GlobalBounds getScreenBounds() {
        return this.screenBounds;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.recorder.SystemInformation copy$default(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds, int i, float f, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            globalBounds = systemInformation.screenBounds;
        }
        if ((i2 & 2) != 0) {
            i = systemInformation.screenOrientation;
        }
        if ((i2 & 4) != 0) {
            f = systemInformation.screenDensity;
        }
        if ((i2 & 8) != 0) {
            str = systemInformation.themeColor;
        }
        return systemInformation.copy(globalBounds, i, f, str);
    }
}
