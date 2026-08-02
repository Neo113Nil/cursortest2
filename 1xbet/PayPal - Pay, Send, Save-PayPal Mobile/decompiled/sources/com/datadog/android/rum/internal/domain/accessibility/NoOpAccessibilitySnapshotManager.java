package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/NoOpAccessibilitySnapshotManager;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "getIfChanged", "()Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpAccessibilitySnapshotManager implements com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager {
    @Override // com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager
    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getIfChanged() {
        return null;
    }
}
