package com.goldenboot.saga.zone;

import android.graphics.BlurMaskFilter;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\b*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00022\u00020\u0002¨\u0006\f"}, d2 = {"", "radius", "Landroid/graphics/BlurMaskFilter;", "Landroidx/compose/ui/graphics/shadow/BlurFilter;", "evictLayout", "(F)Landroid/graphics/BlurMaskFilter;", "Lcom/goldenboot/saga/zone/ScopedProcess;", "blur", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Lcom/goldenboot/saga/zone/ScopedProcess;Landroid/graphics/BlurMaskFilter;)V", "BlurFilter", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageWorkflow {
    public static final BlurMaskFilter evictLayout(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void growPayload(ScopedProcess scopedProcess, BlurMaskFilter blurMaskFilter) {
        scopedProcess.handleFooter().setMaskFilter(blurMaskFilter);
    }
}
