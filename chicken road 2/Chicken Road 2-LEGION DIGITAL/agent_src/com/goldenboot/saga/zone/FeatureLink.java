package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class FeatureLink {
    public static boolean clipOrigin(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof BadgeMaterializer) {
            return ((BadgeMaterializer) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void detachStream(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof BundleVersion) {
            ((BundleVersion) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof BadgeMaterializer) {
            ((BadgeMaterializer) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean evictLayout(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void flushSample(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof BadgeMaterializer) {
            ((BadgeMaterializer) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean growPayload(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void injectMetric(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof BadgeMaterializer) {
            ((BadgeMaterializer) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void releaseHeader(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof BadgeMaterializer) {
            ((BadgeMaterializer) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }
}
