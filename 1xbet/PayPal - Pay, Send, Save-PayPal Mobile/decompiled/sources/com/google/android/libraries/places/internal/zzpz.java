package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpz extends androidx.core.view.AccessibilityDelegateCompat {
    final /* synthetic */ android.view.View zza;

    zzpz(android.view.View view) {
        this.zza = view;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.zza.performClick();
        return true;
    }
}
