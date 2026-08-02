package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "Lcom/datadog/android/rum/internal/domain/InfoData;", "", "textSize", "", "isScreenReaderEnabled", "isColorInversionEnabled", "isClosedCaptioningEnabled", "isReducedAnimationsEnabled", "isScreenPinningEnabled", "isRtlEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getTextSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccessibilityInfo implements com.datadog.android.rum.internal.domain.InfoData {
    private final java.lang.Boolean isClosedCaptioningEnabled;
    private final java.lang.Boolean isColorInversionEnabled;
    private final java.lang.Boolean isReducedAnimationsEnabled;
    private final java.lang.Boolean isRtlEnabled;
    private final java.lang.Boolean isScreenPinningEnabled;
    private final java.lang.Boolean isScreenReaderEnabled;
    private final java.lang.String textSize;

    public AccessibilityInfo(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6) {
        this.textSize = str;
        this.isScreenReaderEnabled = bool;
        this.isColorInversionEnabled = bool2;
        this.isClosedCaptioningEnabled = bool3;
        this.isReducedAnimationsEnabled = bool4;
        this.isScreenPinningEnabled = bool5;
        this.isRtlEnabled = bool6;
    }

    public /* synthetic */ AccessibilityInfo(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6);
    }

    public final java.lang.String getTextSize() {
        return this.textSize;
    }

    public final java.lang.Boolean isScreenReaderEnabled() {
        return this.isScreenReaderEnabled;
    }

    public final java.lang.Boolean isColorInversionEnabled() {
        return this.isColorInversionEnabled;
    }

    public final java.lang.Boolean isClosedCaptioningEnabled() {
        return this.isClosedCaptioningEnabled;
    }

    public final java.lang.Boolean isReducedAnimationsEnabled() {
        return this.isReducedAnimationsEnabled;
    }

    public final java.lang.Boolean isScreenPinningEnabled() {
        return this.isScreenPinningEnabled;
    }

    public final java.lang.Boolean isRtlEnabled() {
        return this.isRtlEnabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.textSize;
        java.lang.Boolean bool = this.isScreenReaderEnabled;
        java.lang.Boolean bool2 = this.isColorInversionEnabled;
        java.lang.Boolean bool3 = this.isClosedCaptioningEnabled;
        java.lang.Boolean bool4 = this.isReducedAnimationsEnabled;
        java.lang.Boolean bool5 = this.isScreenPinningEnabled;
        java.lang.Boolean bool6 = this.isRtlEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityInfo(textSize=");
        sb.append(str);
        sb.append(", isScreenReaderEnabled=");
        sb.append(bool);
        sb.append(", isColorInversionEnabled=");
        sb.append(bool2);
        sb.append(", isClosedCaptioningEnabled=");
        sb.append(bool3);
        sb.append(", isReducedAnimationsEnabled=");
        sb.append(bool4);
        sb.append(", isScreenPinningEnabled=");
        sb.append(bool5);
        sb.append(", isRtlEnabled=");
        sb.append(bool6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.textSize;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.isScreenReaderEnabled;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.isColorInversionEnabled;
        int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.Boolean bool3 = this.isClosedCaptioningEnabled;
        int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
        java.lang.Boolean bool4 = this.isReducedAnimationsEnabled;
        int hashCode5 = bool4 == null ? 0 : bool4.hashCode();
        java.lang.Boolean bool5 = this.isScreenPinningEnabled;
        int hashCode6 = bool5 == null ? 0 : bool5.hashCode();
        java.lang.Boolean bool6 = this.isRtlEnabled;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo = (com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.textSize, accessibilityInfo.textSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.isScreenReaderEnabled, accessibilityInfo.isScreenReaderEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isColorInversionEnabled, accessibilityInfo.isColorInversionEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isClosedCaptioningEnabled, accessibilityInfo.isClosedCaptioningEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isReducedAnimationsEnabled, accessibilityInfo.isReducedAnimationsEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isScreenPinningEnabled, accessibilityInfo.isScreenPinningEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.isRtlEnabled, accessibilityInfo.isRtlEnabled);
    }

    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo copy(java.lang.String textSize, java.lang.Boolean isScreenReaderEnabled, java.lang.Boolean isColorInversionEnabled, java.lang.Boolean isClosedCaptioningEnabled, java.lang.Boolean isReducedAnimationsEnabled, java.lang.Boolean isScreenPinningEnabled, java.lang.Boolean isRtlEnabled) {
        return new com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo(textSize, isScreenReaderEnabled, isColorInversionEnabled, isClosedCaptioningEnabled, isReducedAnimationsEnabled, isScreenPinningEnabled, isRtlEnabled);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Boolean getIsRtlEnabled() {
        return this.isRtlEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Boolean getIsScreenPinningEnabled() {
        return this.isScreenPinningEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Boolean getIsReducedAnimationsEnabled() {
        return this.isReducedAnimationsEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getIsClosedCaptioningEnabled() {
        return this.isClosedCaptioningEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsColorInversionEnabled() {
        return this.isColorInversionEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsScreenReaderEnabled() {
        return this.isScreenReaderEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTextSize() {
        return this.textSize;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo copy$default(com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = accessibilityInfo.textSize;
        }
        if ((i & 2) != 0) {
            bool = accessibilityInfo.isScreenReaderEnabled;
        }
        java.lang.Boolean bool7 = bool;
        if ((i & 4) != 0) {
            bool2 = accessibilityInfo.isColorInversionEnabled;
        }
        java.lang.Boolean bool8 = bool2;
        if ((i & 8) != 0) {
            bool3 = accessibilityInfo.isClosedCaptioningEnabled;
        }
        java.lang.Boolean bool9 = bool3;
        if ((i & 16) != 0) {
            bool4 = accessibilityInfo.isReducedAnimationsEnabled;
        }
        java.lang.Boolean bool10 = bool4;
        if ((i & 32) != 0) {
            bool5 = accessibilityInfo.isScreenPinningEnabled;
        }
        java.lang.Boolean bool11 = bool5;
        if ((i & 64) != 0) {
            bool6 = accessibilityInfo.isRtlEnabled;
        }
        return accessibilityInfo.copy(str, bool7, bool8, bool9, bool10, bool11, bool6);
    }

    public AccessibilityInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
