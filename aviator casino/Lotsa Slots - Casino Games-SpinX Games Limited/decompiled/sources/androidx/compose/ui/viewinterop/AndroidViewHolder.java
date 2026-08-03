package androidx.compose.ui.viewinterop;

/* compiled from: AndroidViewHolder.android.kt */
@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0010\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u009a\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0012\u0010\\\u001a\u00020\u001a2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010_\u001a\u00020`H\u0016J\u000e\u0010a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`bJ\n\u0010c\u001a\u0004\u0018\u00010dH\u0016J\b\u0010e\u001a\u00020\nH\u0016J\u001e\u0010f\u001a\u0004\u0018\u00010g2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u0006\u0010j\u001a\u000206J\b\u0010k\u001a\u00020\u001aH\u0016J \u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n2\u0006\u0010n\u001a\u00020\n2\u0006\u0010o\u001a\u00020\nH\u0002J\b\u0010p\u001a\u000206H\u0014J\b\u0010q\u001a\u000206H\u0016J\u0018\u0010r\u001a\u0002062\u0006\u0010s\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u000eH\u0016J\b\u0010u\u001a\u000206H\u0014J0\u0010v\u001a\u0002062\u0006\u0010w\u001a\u00020\u001a2\u0006\u0010x\u001a\u00020\n2\u0006\u0010y\u001a\u00020\n2\u0006\u0010z\u001a\u00020\n2\u0006\u0010{\u001a\u00020\nH\u0014J\u0018\u0010|\u001a\u0002062\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\nH\u0014J-\u0010\u007f\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u000e2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u001aH\u0016J%\u0010\u0084\u0001\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u000e2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016J5\u0010\u0085\u0001\u001a\u0002062\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0087\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020+2\u0007\u0010\u0088\u0001\u001a\u00020\nH\u0016J>\u0010\u0089\u0001\u001a\u0002062\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\nH\u0016JG\u0010\u0089\u0001\u001a\u0002062\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020+H\u0016J+\u0010\u008e\u0001\u001a\u0002062\u0006\u0010s\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u008f\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\nH\u0016J\t\u0010\u0090\u0001\u001a\u000206H\u0016J\t\u0010\u0091\u0001\u001a\u000206H\u0016J+\u0010\u0092\u0001\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u008f\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\nH\u0016J\u001a\u0010\u0093\u0001\u001a\u0002062\u0006\u0010t\u001a\u00020\u000e2\u0007\u0010\u0088\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u0094\u0001\u001a\u0002062\u0007\u0010\u0095\u0001\u001a\u00020\nH\u0014J\u0007\u0010\u0096\u0001\u001a\u000206J\u0012\u0010\u0097\u0001\u001a\u0002062\u0007\u0010\u0098\u0001\u001a\u00020\u001aH\u0016J\t\u0010\u0099\u0001\u001a\u00020\u001aH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0012\u001a\u0004\u0018\u00010$@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010-\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000206\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010;\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u000206\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R(\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u000206\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010C\u001a\b\u0012\u0004\u0012\u0002060B2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002060B@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR0\u0010H\u001a\b\u0012\u0004\u0012\u0002060B2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002060B@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\u0014\u0010K\u001a\b\u0012\u0004\u0012\u0002060BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u0002060BX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010N\u001a\u0004\u0018\u00010M2\b\u0010\u0012\u001a\u0004\u0018\u00010M@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR0\u0010W\u001a\b\u0012\u0004\u0012\u0002060B2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002060B@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010E\"\u0004\bY\u0010GR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "compositeKeyHash", "", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "isDrawing", "isValidOwnerScope", "()Z", "lastHeightMeasureSpec", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "onDensityChanged", "Lkotlin/Function1;", "", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "<set-?>", "Lkotlin/Function0;", "release", "getRelease", "()Lkotlin/jvm/functions/Function0;", "setRelease", "(Lkotlin/jvm/functions/Function0;)V", "reset", "getReset", "setReset", "runInvalidate", "runUpdate", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "update", "getUpdate", "setUpdate", "getView", "()Landroid/view/View;", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getAccessibilityClassName", "", "getInteropView", "Landroidx/compose/ui/viewinterop/InteropView;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getNestedScrollAxes", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "invalidateOrDefer", "isNestedScrollingEnabled", "obtainMeasureSpec", "min", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "preferred", "onAttachedToWindow", "onDeactivate", "onDescendantInvalidated", "child", "target", "onDetachedFromWindow", "onLayout", "changed", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "t", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "axes", "onRelease", "onReuse", "onStartNestedScroll", "onStopNestedScroll", "onWindowVisibilityChanged", "visibility", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "shouldDelayChildPressedState", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AndroidViewHolder extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent3, androidx.compose.runtime.ComposeNodeLifecycleCallback, androidx.compose.ui.node.OwnerScope {
    private final int compositeKeyHash;
    private androidx.compose.ui.unit.Density density;
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    private final int[] location;
    private androidx.compose.ui.Modifier modifier;
    private final androidx.core.view.NestedScrollingParentHelper nestedScrollingParentHelper;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> onDensityChanged;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> onModifierChanged;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onRequestDisallowInterceptTouchEvent;
    private final androidx.compose.ui.node.Owner owner;
    private kotlin.jvm.functions.Function0<kotlin.Unit> release;
    private kotlin.jvm.functions.Function0<kotlin.Unit> reset;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> runInvalidate;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> runUpdate;
    private androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner;
    private kotlin.jvm.functions.Function0<kotlin.Unit> update;
    private final android.view.View view;
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.viewinterop.AndroidViewHolder, kotlin.Unit> OnCommitAffectingUpdate = androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final android.view.View getView() {
        return this.view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(android.content.Context context, androidx.compose.runtime.CompositionContext compositionContext, int i, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, android.view.View view, androidx.compose.ui.node.Owner owner) {
        super(context);
        androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1 androidViewHolder_androidKt$NoOpScrollConnection$1;
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            androidx.compose.ui.platform.WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.reset = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.release = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.modifier = androidx.compose.ui.Modifier.INSTANCE;
        this.density = androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z;
                androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver;
                kotlin.jvm.functions.Function1 function1;
                z = androidx.compose.ui.viewinterop.AndroidViewHolder.this.hasUpdateBlock;
                if (z && androidx.compose.ui.viewinterop.AndroidViewHolder.this.isAttachedToWindow()) {
                    snapshotObserver = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getSnapshotObserver();
                    androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                    function1 = androidx.compose.ui.viewinterop.AndroidViewHolder.OnCommitAffectingUpdate;
                    snapshotObserver.observeReads$ui_release(androidViewHolder, function1, androidx.compose.ui.viewinterop.AndroidViewHolder.this.getUpdate());
                }
            }
        };
        this.runInvalidate = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new androidx.core.view.NestedScrollingParentHelper(this);
        java.lang.Object[] objArr = 0 == true ? 1 : 0;
        final androidx.compose.ui.node.LayoutNode layoutNode = new androidx.compose.ui.node.LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidViewHolder_androidKt$NoOpScrollConnection$1 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.NoOpScrollConnection;
        final androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(companion, androidViewHolder_androidKt$NoOpScrollConnection$1, this.dispatcher), true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }
        }), this), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                invoke2(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNode;
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = this;
                androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    androidx.compose.ui.node.Owner owner2 = layoutNode2.getOwner();
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.layoutAccordingTo(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode);
            }
        });
        layoutNode.setCompositeKeyHash(this.compositeKeyHash);
        layoutNode.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier) {
                invoke2(modifier);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.Modifier modifier) {
                androidx.compose.ui.node.LayoutNode.this.setModifier(modifier.then(onGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Density density) {
                invoke2(density);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.unit.Density density) {
                androidx.compose.ui.node.LayoutNode.this.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.Owner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.Owner owner2) {
                invoke2(owner2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.Owner owner2) {
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode);
                }
                android.view.ViewParent parent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getView().getParent();
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.Owner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.Owner owner2) {
                invoke2(owner2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.Owner owner2) {
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder.this);
                }
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildCount() == 0) {
                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) != 0) {
                    androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j));
                }
                if (androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) != 0) {
                    androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j));
                }
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
                int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
                android.view.ViewGroup.LayoutParams layoutParams = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m4426getMinWidthimpl, m4424getMaxWidthimpl, layoutParams.width);
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
                int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
                android.view.ViewGroup.LayoutParams layoutParams2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m4425getMinHeightimpl, m4423getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                int measuredWidth = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredHeight();
                final androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder3 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                final androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNode;
                return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, measuredWidth, measuredHeight, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.layoutAccordingTo(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            private final int intrinsicWidth(int height) {
                int obtainMeasureSpec;
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                android.view.ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            private final int intrinsicHeight(int width) {
                int obtainMeasureSpec;
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                android.view.ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final android.view.View getView() {
        return this.view;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getUpdate() {
        return this.update;
    }

    protected final void setUpdate(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getReset() {
        return this.reset;
    }

    protected final void setReset(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.reset = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRelease() {
        return this.release;
    }

    protected final void setRelease(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.release = function0;
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier, kotlin.Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity(androidx.compose.ui.unit.Density density) {
        if (density != this.density) {
            this.density = density;
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, kotlin.Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            androidx.lifecycle.ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final androidx.savedstate.SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.node.OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
        }
        return this.owner.getSnapshotObserver();
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(widthMeasureSpec), android.view.View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            android.view.View view = this.view;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.runInvalidate;
            view.postOnAnimation(new java.lang.Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.jvm.functions.Function0.this.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (android.os.Build.VERSION.SDK_INT >= 23 || visibility != 0) {
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.location[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        if (preferred >= 0 || min == max) {
            return android.view.View.MeasureSpec.makeMeasureSpec(kotlin.ranges.RangesKt.coerceIn(preferred, min, max), 1073741824);
        }
        if (preferred == -2 && max != Integer.MAX_VALUE) {
            return android.view.View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        if (preferred == -1 && max != Integer.MAX_VALUE) {
            return android.view.View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int axes, int type) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View target, int type) {
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            composeOffset2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(composeOffset, composeOffset2);
            composeOffset3 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            composeOffset4 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            long Offset2 = androidx.compose.ui.geometry.OffsetKt.Offset(composeOffset3, composeOffset4);
            nestedScrollSource = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toNestedScrollSource(type);
            long m3157dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m3157dispatchPostScrollDzOQY0M(Offset, Offset2, nestedScrollSource);
            consumed[0] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1871getXimpl(m3157dispatchPostScrollDzOQY0M));
            consumed[1] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1872getYimpl(m3157dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            composeOffset2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dyConsumed);
            long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(composeOffset, composeOffset2);
            composeOffset3 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            composeOffset4 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed);
            long Offset2 = androidx.compose.ui.geometry.OffsetKt.Offset(composeOffset3, composeOffset4);
            nestedScrollSource = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toNestedScrollSource(type);
            nestedScrollDispatcher.m3157dispatchPostScrollDzOQY0M(Offset, Offset2, nestedScrollSource);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View target, int dx, int dy, int[] consumed, int type) {
        float composeOffset;
        float composeOffset2;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dx);
            composeOffset2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeOffset(dy);
            long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(composeOffset, composeOffset2);
            nestedScrollSource = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toNestedScrollSource(type);
            long m3159dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m3159dispatchPreScrollOzD1aCk(Offset, nestedScrollSource);
            consumed[0] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1871getXimpl(m3159dispatchPreScrollOzD1aCk));
            consumed[1] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(androidx.compose.ui.geometry.Offset.m1872getYimpl(m3159dispatchPreScrollOzD1aCk));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeVelocity(velocityX);
        composeVelocity2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeVelocity(velocityY);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1(consumed, this, androidx.compose.ui.unit.VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeVelocity(velocityX);
        composeVelocity2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.toComposeVelocity(velocityY);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1(this, androidx.compose.ui.unit.VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }
}
