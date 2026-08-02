package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class b extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public b(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        c cVar = this.a.a;
        if (cVar != null) {
            cVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
