package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/DefaultAccessibilitySnapshotManager;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "accessibilityReader", "<init>", "(Lcom/datadog/android/rum/internal/domain/InfoProvider;)V", "getIfChanged", "()Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAccessibilitySnapshotManager implements com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getHighSpeedVideoSizes;
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> getHighResolutionOutputSizeshNQ4ISI;

    public DefaultAccessibilitySnapshotManager(com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> infoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = infoProvider;
    }

    @Override // com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager
    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getIfChanged() {
        synchronized (this) {
            com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo state = this.getHighResolutionOutputSizeshNQ4ISI.getState();
            com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo = null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(state, this.getHighSpeedVideoSizes)) {
                return null;
            }
            com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo2 = this.getHighSpeedVideoSizes;
            java.lang.String textSize = state.getTextSize();
            java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual(textSize, accessibilityInfo2 != null ? accessibilityInfo2.getTextSize() : null) ? textSize : null;
            java.lang.Boolean isScreenReaderEnabled = state.isScreenReaderEnabled();
            java.lang.Boolean bool = !kotlin.jvm.internal.Intrinsics.areEqual(isScreenReaderEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isScreenReaderEnabled() : null) ? isScreenReaderEnabled : null;
            java.lang.Boolean isColorInversionEnabled = state.isColorInversionEnabled();
            java.lang.Boolean bool2 = !kotlin.jvm.internal.Intrinsics.areEqual(isColorInversionEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isColorInversionEnabled() : null) ? isColorInversionEnabled : null;
            java.lang.Boolean isClosedCaptioningEnabled = state.isClosedCaptioningEnabled();
            java.lang.Boolean bool3 = !kotlin.jvm.internal.Intrinsics.areEqual(isClosedCaptioningEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isClosedCaptioningEnabled() : null) ? isClosedCaptioningEnabled : null;
            java.lang.Boolean isReducedAnimationsEnabled = state.isReducedAnimationsEnabled();
            java.lang.Boolean bool4 = !kotlin.jvm.internal.Intrinsics.areEqual(isReducedAnimationsEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isReducedAnimationsEnabled() : null) ? isReducedAnimationsEnabled : null;
            java.lang.Boolean isScreenPinningEnabled = state.isScreenPinningEnabled();
            java.lang.Boolean bool5 = !kotlin.jvm.internal.Intrinsics.areEqual(isScreenPinningEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isScreenPinningEnabled() : null) ? isScreenPinningEnabled : null;
            java.lang.Boolean isRtlEnabled = state.isRtlEnabled();
            com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo accessibilityInfo3 = new com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo(str, bool, bool2, bool3, bool4, bool5, !kotlin.jvm.internal.Intrinsics.areEqual(isRtlEnabled, accessibilityInfo2 != null ? accessibilityInfo2.isRtlEnabled() : null) ? isRtlEnabled : null);
            this.getHighSpeedVideoSizes = state;
            java.util.Set of = kotlin.collections.SetsKt.setOf(accessibilityInfo3.getTextSize(), accessibilityInfo3.isScreenReaderEnabled(), accessibilityInfo3.isRtlEnabled(), accessibilityInfo3.isScreenPinningEnabled(), accessibilityInfo3.isColorInversionEnabled(), accessibilityInfo3.isClosedCaptioningEnabled(), accessibilityInfo3.isReducedAnimationsEnabled());
            if (!(of instanceof java.util.Collection) || !of.isEmpty()) {
                java.util.Iterator it = of.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() != null) {
                        accessibilityInfo = accessibilityInfo3;
                        break;
                    }
                }
            }
            return accessibilityInfo;
        }
    }
}
