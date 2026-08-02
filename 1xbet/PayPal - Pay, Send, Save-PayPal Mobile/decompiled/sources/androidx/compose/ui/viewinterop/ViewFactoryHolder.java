package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001e\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010#\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010+\u001a\u0004\u0018\u00010-8\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b\u001e\u0010.RB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00152\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00158\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106RB\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00152\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00158\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00152\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/0\u00158\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/content/Context;", "p0", "Landroidx/compose/runtime/CompositionContext;", "p1", "p2", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "p3", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "p4", "", "p5", "Landroidx/compose/ui/node/Owner;", "p6", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/SaveableStateRegistry;ILandroidx/compose/ui/node/Owner;)V", "context", "Lkotlin/Function1;", "factory", "parentContext", "saveStateRegistry", "compositeKeyHash", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/saveable/SaveableStateRegistry;ILandroidx/compose/ui/node/Owner;)V", "getHighSpeedVideoSizes", "Landroid/view/View;", "Camera2StreamConfigurationMap", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getViewRoot", "()Landroid/view/View;", "viewRoot", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "updateBlock", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "resetBlock", "getResetBlock", "setResetBlock", "releaseBlock", "getReleaseBlock", "setReleaseBlock"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewFactoryHolder<T extends android.view.View> extends androidx.compose.ui.viewinterop.AndroidViewHolder implements androidx.compose.ui.platform.ViewRootForInspector {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.runtime.saveable.SaveableStateRegistry.Entry getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher dispatcher;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.saveable.SaveableStateRegistry getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> releaseBlock;
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> resetBlock;
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> updateBlock;

    private ViewFactoryHolder(android.content.Context context, androidx.compose.runtime.CompositionContext compositionContext, T t, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, int i, androidx.compose.ui.node.Owner owner) {
        super(context, compositionContext, i, nestedScrollDispatcher, t, owner);
        this.Camera2StreamConfigurationMap = t;
        this.dispatcher = nestedScrollDispatcher;
        this.getHighSpeedVideoFpsRangesFor = saveableStateRegistry;
        this.getHighSpeedVideoSizes = i;
        setClipChildren(false);
        java.lang.String valueOf = java.lang.String.valueOf(i);
        this.getHighResolutionOutputSizeshNQ4ISI = valueOf;
        java.lang.Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = consumeRestored instanceof android.util.SparseArray ? (android.util.SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        if (saveableStateRegistry != null) {
            androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider = saveableStateRegistry.registerProvider(valueOf, new kotlin.jvm.functions.Function0<java.lang.Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                final /* synthetic */ androidx.compose.ui.viewinterop.ViewFactoryHolder<T> Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    android.view.View view;
                    android.util.SparseArray<android.os.Parcelable> sparseArray2 = new android.util.SparseArray<>();
                    view = ((androidx.compose.ui.viewinterop.ViewFactoryHolder) this.Camera2StreamConfigurationMap).Camera2StreamConfigurationMap;
                    view.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.Camera2StreamConfigurationMap = this;
                }
            });
            androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry = this.getHighSpeedVideoFpsRanges;
            if (entry != null) {
                entry.unregister();
            }
            this.getHighSpeedVideoFpsRanges = registerProvider;
        }
        this.updateBlock = androidx.compose.ui.viewinterop.AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = androidx.compose.ui.viewinterop.AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = androidx.compose.ui.viewinterop.AndroidView_androidKt.getNoOpUpdate();
    }

    /* synthetic */ ViewFactoryHolder(android.content.Context context, androidx.compose.runtime.CompositionContext compositionContext, android.view.View view, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, int i, androidx.compose.ui.node.Owner owner, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : compositionContext, view, (i2 & 8) != 0 ? new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i, owner);
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public /* synthetic */ ViewFactoryHolder(android.content.Context context, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, int i, androidx.compose.ui.node.Owner owner, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i2 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i, owner);
    }

    public ViewFactoryHolder(android.content.Context context, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> function1, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, int i, androidx.compose.ui.node.Owner owner) {
        this(context, compositionContext, function1.invoke(context), null, saveableStateRegistry, i, owner, 8, null);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final android.view.View getViewRoot() {
        return this;
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setUpdateBlock(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new kotlin.jvm.functions.Function0<kotlin.Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ androidx.compose.ui.viewinterop.ViewFactoryHolder<T> getHighSpeedVideoFpsRangesFor;

            public final void getHighSpeedVideoSizes() {
                android.view.View view;
                view = ((androidx.compose.ui.viewinterop.ViewFactoryHolder) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor.getUpdateBlock().invoke(view);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getResetBlock() {
        return this.resetBlock;
    }

    public final void setResetBlock(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.resetBlock = function1;
        setReset(new kotlin.jvm.functions.Function0<kotlin.Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ androidx.compose.ui.viewinterop.ViewFactoryHolder<T> getHighResolutionOutputSizeshNQ4ISI;

            public final void Camera2StreamConfigurationMap() {
                android.view.View view;
                view = ((androidx.compose.ui.viewinterop.ViewFactoryHolder) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI.getResetBlock().invoke(view);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final void setReleaseBlock(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new kotlin.jvm.functions.Function0<kotlin.Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ androidx.compose.ui.viewinterop.ViewFactoryHolder<T> getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes() {
                android.view.View view;
                view = ((androidx.compose.ui.viewinterop.ViewFactoryHolder) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges.getReleaseBlock().invoke(view);
                androidx.compose.ui.viewinterop.ViewFactoryHolder.access$unregisterSaveStateProvider(this.getHighSpeedVideoFpsRanges);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    public static final /* synthetic */ void access$unregisterSaveStateProvider(androidx.compose.ui.viewinterop.ViewFactoryHolder viewFactoryHolder) {
        androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry = viewFactoryHolder.getHighSpeedVideoFpsRanges;
        if (entry != null) {
            entry.unregister();
        }
        viewFactoryHolder.getHighSpeedVideoFpsRanges = null;
    }
}
