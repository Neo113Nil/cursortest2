package com.datadog.android.rum.internal.domain.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/accessibility/NoOpAccessibilityReader;", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;", "<init>", "()V", "", "cleanup", "getState", "()Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilityInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpAccessibilityReader implements com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo> {
    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo getState() {
        return new com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo(null, null, null, null, null, null, null, 127, null);
    }
}
