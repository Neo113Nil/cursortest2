package com.goldenboot.saga.zone;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CursorMaintainer {
    public static final AnchorEdge evictLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(FeedbackMemento.evictLayout);
            AnchorEdge anchorEdge = tag instanceof AnchorEdge ? (AnchorEdge) tag : null;
            if (anchorEdge != null) {
                return anchorEdge;
            }
            Object evictLayout = RippleWork.evictLayout(view);
            view = evictLayout instanceof View ? (View) evictLayout : null;
        }
        return null;
    }

    public static final void growPayload(View view, AnchorEdge anchorEdge) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(FeedbackMemento.evictLayout, anchorEdge);
    }
}
