package androidx.compose.material.ripple;

/* compiled from: RippleContainer.android.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014J\n\u0010\u0019\u001a\u00020\u000f*\u00020\u001aJ\n\u0010\u001b\u001a\u00020\f*\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MaxRippleHosts", "", "nextHostIndex", "rippleHostMap", "Landroidx/compose/material/ripple/RippleHostMap;", "rippleHosts", "", "Landroidx/compose/material/ripple/RippleHostView;", "unusedRippleHosts", "onLayout", "", "changed", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "t", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "disposeRippleIfNeeded", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "getRippleHostView", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleContainer extends android.view.ViewGroup {
    private final int MaxRippleHosts;
    private int nextHostIndex;
    private final androidx.compose.material.ripple.RippleHostMap rippleHostMap;
    private final java.util.List<androidx.compose.material.ripple.RippleHostView> rippleHosts;
    private final java.util.List<androidx.compose.material.ripple.RippleHostView> unusedRippleHosts;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.MaxRippleHosts = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.rippleHosts = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new androidx.compose.material.ripple.RippleHostMap();
        setClipChildren(false);
        androidx.compose.material.ripple.RippleHostView rippleHostView = new androidx.compose.material.ripple.RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, true);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public final androidx.compose.material.ripple.RippleHostView getRippleHostView(androidx.compose.material.ripple.AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        androidx.compose.material.ripple.RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        androidx.compose.material.ripple.RippleHostView rippleHostView2 = (androidx.compose.material.ripple.RippleHostView) kotlin.collections.CollectionsKt.removeFirstOrNull(this.unusedRippleHosts);
        if (rippleHostView2 == null) {
            if (this.nextHostIndex > kotlin.collections.CollectionsKt.getLastIndex(this.rippleHosts)) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
                rippleHostView2 = new androidx.compose.material.ripple.RippleHostView(context);
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                androidx.compose.material.ripple.AndroidRippleIndicationInstance androidRippleIndicationInstance2 = this.rippleHostMap.get(rippleHostView2);
                if (androidRippleIndicationInstance2 != null) {
                    androidRippleIndicationInstance2.resetHostView();
                    this.rippleHostMap.remove(androidRippleIndicationInstance2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(androidRippleIndicationInstance, rippleHostView2);
        return rippleHostView2;
    }

    public final void disposeRippleIfNeeded(androidx.compose.material.ripple.AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.resetHostView();
        androidx.compose.material.ripple.RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(androidRippleIndicationInstance);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }
}
