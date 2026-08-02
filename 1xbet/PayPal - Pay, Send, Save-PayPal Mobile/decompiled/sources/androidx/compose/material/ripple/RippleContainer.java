package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001d"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", util.h.xy.cb.b.f1091, "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroidx/compose/material/ripple/RippleHostKey;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "(Landroidx/compose/material/ripple/RippleHostKey;)Landroidx/compose/material/ripple/RippleHostView;", "disposeRippleIfNeeded", "(Landroidx/compose/material/ripple/RippleHostKey;)V", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/compose/material/ripple/RippleHostMap;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material/ripple/RippleHostMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleContainer extends android.view.ViewGroup {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.material.ripple.RippleHostView> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.material.ripple.RippleHostMap getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.material.ripple.RippleHostView> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public RippleContainer(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = arrayList2;
        this.getHighSpeedVideoSizes = new androidx.compose.material.ripple.RippleHostMap();
        setClipChildren(false);
        androidx.compose.material.ripple.RippleHostView rippleHostView = new androidx.compose.material.ripple.RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public final androidx.compose.material.ripple.RippleHostView getRippleHostView(androidx.compose.material.ripple.RippleHostKey rippleHostKey) {
        androidx.compose.material.ripple.RippleHostView Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(rippleHostKey);
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        androidx.compose.material.ripple.RippleHostView rippleHostView = (androidx.compose.material.ripple.RippleHostView) kotlin.collections.CollectionsKt.removeFirstOrNull(this.getHighSpeedVideoFpsRangesFor);
        if (rippleHostView == null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI > kotlin.collections.CollectionsKt.getLastIndex(this.Camera2StreamConfigurationMap)) {
                rippleHostView = new androidx.compose.material.ripple.RippleHostView(getContext());
                addView(rippleHostView);
                this.Camera2StreamConfigurationMap.add(rippleHostView);
            } else {
                rippleHostView = this.Camera2StreamConfigurationMap.get(this.getHighResolutionOutputSizeshNQ4ISI);
                androidx.compose.material.ripple.RippleHostKey highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(rippleHostView);
                if (highSpeedVideoFpsRangesFor != null) {
                    highSpeedVideoFpsRangesFor.onResetRippleHostView();
                    this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
                    rippleHostView.disposeRipple();
                }
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i < this.getHighSpeedVideoFpsRanges - 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
            }
        }
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(rippleHostKey, rippleHostView);
        return rippleHostView;
    }

    public final void disposeRippleIfNeeded(androidx.compose.material.ripple.RippleHostKey rippleHostKey) {
        rippleHostKey.onResetRippleHostView();
        androidx.compose.material.ripple.RippleHostView Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(rippleHostKey);
        if (Camera2StreamConfigurationMap != null) {
            Camera2StreamConfigurationMap.disposeRipple();
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(rippleHostKey);
            this.getHighSpeedVideoFpsRangesFor.add(Camera2StreamConfigurationMap);
        }
    }
}
