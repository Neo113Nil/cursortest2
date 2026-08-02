package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* loaded from: classes4.dex */
public final class b implements AccessibilityViewCommand {
    public final /* synthetic */ SwipeDismissBehavior a;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.a(view)) {
            return false;
        }
        boolean z = ViewCompat.getLayoutDirection(view) == 1;
        int i = swipeDismissBehavior.d;
        ViewCompat.offsetLeftAndRight(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}
