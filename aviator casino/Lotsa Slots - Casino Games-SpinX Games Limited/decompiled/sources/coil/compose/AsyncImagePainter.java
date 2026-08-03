package coil.compose;

/* compiled from: AsyncImagePainter.kt */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0002noB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010[\u001a\u000203*\u00020\\H\u0014J\u0010\u0010]\u001a\u00020D2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0012\u0010^\u001a\u00020D2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010_\u001a\u000203H\u0016J\b\u0010`\u001a\u000203H\u0016J\b\u0010a\u001a\u000203H\u0016J\b\u0010b\u001a\u000203H\u0002J\u0010\u0010c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010d\u001a\u0002032\u0006\u0010e\u001a\u00020&H\u0002J\u001a\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020&2\u0006\u0010i\u001a\u00020&H\u0002J\f\u0010j\u001a\u00020&*\u00020kH\u0002J\f\u0010l\u001a\u00020\u0001*\u00020mH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020&@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b(\u0010)R\"\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u0001@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b+\u0010\u0013R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00102\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000203\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001a\u00106\u001a\u000207X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u00020=X\u0080\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020DX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010I\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u0015\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010)R+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\u0015\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\u0015\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006p"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "request", "Lcoil/request/ImageRequest;", "imageLoader", "Lcoil/ImageLoader;", "<init>", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;)V", "rememberScope", "Lkotlinx/coroutines/CoroutineScope;", "drawSize", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "painter", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter$delegate", "Landroidx/compose/runtime/MutableState;", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "alpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter$delegate", "value", "Lcoil/compose/AsyncImagePainter$State;", "_state", "set_state", "(Lcoil/compose/AsyncImagePainter$State;)V", "_painter", "set_painter", "transform", "Lkotlin/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "setTransform$coil_compose_base_release", "(Lkotlin/jvm/functions/Function1;)V", "onState", "", "getOnState$coil_compose_base_release", "setOnState$coil_compose_base_release", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale$coil_compose_base_release", "(Landroidx/compose/ui/layout/ContentScale;)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "setFilterQuality-vDHp3xo$coil_compose_base_release", "(I)V", "I", "isPreview", "", "isPreview$coil_compose_base_release", "()Z", "setPreview$coil_compose_base_release", "(Z)V", "state", "getState", "()Lcoil/compose/AsyncImagePainter$State;", "setState", "state$delegate", "getRequest", "()Lcoil/request/ImageRequest;", "setRequest$coil_compose_base_release", "(Lcoil/request/ImageRequest;)V", "request$delegate", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader$coil_compose_base_release", "(Lcoil/ImageLoader;)V", "imageLoader$delegate", "intrinsicSize", "getIntrinsicSize-NH-jbRc", "()J", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "applyAlpha", "applyColorFilter", "onRemembered", "onForgotten", "onAbandoned", "clear", "updateRequest", "updateState", "input", "maybeNewCrossfadePainter", "Lcoil/compose/CrossfadePainter;", "previous", "current", "toState", "Lcoil/request/ImageResult;", "toPainter", "Landroid/graphics/drawable/Drawable;", "State", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsyncImagePainter extends androidx.compose.ui.graphics.painter.Painter implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.compose.AsyncImagePainter.Companion INSTANCE = new coil.compose.AsyncImagePainter.Companion(null);
    private static final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, coil.compose.AsyncImagePainter.State> DefaultTransform = new kotlin.jvm.functions.Function1() { // from class: coil.compose.AsyncImagePainter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            coil.compose.AsyncImagePainter.State DefaultTransform$lambda$5;
            DefaultTransform$lambda$5 = coil.compose.AsyncImagePainter.DefaultTransform$lambda$5((coil.compose.AsyncImagePainter.State) obj);
            return DefaultTransform$lambda$5;
        }
    };
    private androidx.compose.ui.graphics.painter.Painter _painter;

    /* renamed from: imageLoader$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState imageLoader;
    private boolean isPreview;
    private kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> onState;
    private kotlinx.coroutines.CoroutineScope rememberScope;

    /* renamed from: request$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState request;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.compose.ui.geometry.Size> drawSize = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc()));

    /* renamed from: painter$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState painter = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: alpha$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState alpha = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: colorFilter$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState colorFilter = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private coil.compose.AsyncImagePainter.State _state = coil.compose.AsyncImagePainter.State.Empty.INSTANCE;
    private kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, ? extends coil.compose.AsyncImagePainter.State> transform = DefaultTransform;
    private androidx.compose.ui.layout.ContentScale contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
    private int filterQuality = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I();

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState state = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(coil.compose.AsyncImagePainter.State.Empty.INSTANCE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.compose.AsyncImagePainter.State DefaultTransform$lambda$5(coil.compose.AsyncImagePainter.State state) {
        return state;
    }

    public AsyncImagePainter(coil.request.ImageRequest imageRequest, coil.ImageLoader imageLoader) {
        this.request = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageRequest, null, 2, null);
        this.imageLoader = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageLoader, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return (androidx.compose.ui.graphics.painter.Painter) this.painter.getValue();
    }

    private final void setPainter(androidx.compose.ui.graphics.painter.Painter painter) {
        this.painter.setValue(painter);
    }

    private final float getAlpha() {
        return this.alpha.getFloatValue();
    }

    private final void setAlpha(float f) {
        this.alpha.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return (androidx.compose.ui.graphics.ColorFilter) this.colorFilter.getValue();
    }

    private final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    private final void set_state(coil.compose.AsyncImagePainter.State state) {
        this._state = state;
        setState(state);
    }

    private final void set_painter(androidx.compose.ui.graphics.painter.Painter painter) {
        this._painter = painter;
        setPainter(painter);
    }

    public final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, coil.compose.AsyncImagePainter.State> getTransform$coil_compose_base_release() {
        return this.transform;
    }

    public final void setTransform$coil_compose_base_release(kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, ? extends coil.compose.AsyncImagePainter.State> function1) {
        this.transform = function1;
    }

    public final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, kotlin.Unit> getOnState$coil_compose_base_release() {
        return this.onState;
    }

    public final void setOnState$coil_compose_base_release(kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> function1) {
        this.onState = function1;
    }

    /* renamed from: getContentScale$coil_compose_base_release, reason: from getter */
    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale$coil_compose_base_release(androidx.compose.ui.layout.ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* renamed from: getFilterQuality-f-v9h1I$coil_compose_base_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    /* renamed from: setFilterQuality-vDHp3xo$coil_compose_base_release, reason: not valid java name */
    public final void m4947setFilterQualityvDHp3xo$coil_compose_base_release(int i) {
        this.filterQuality = i;
    }

    /* renamed from: isPreview$coil_compose_base_release, reason: from getter */
    public final boolean getIsPreview() {
        return this.isPreview;
    }

    public final void setPreview$coil_compose_base_release(boolean z) {
        this.isPreview = z;
    }

    private final void setState(coil.compose.AsyncImagePainter.State state) {
        this.state.setValue(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final coil.compose.AsyncImagePainter.State getState() {
        return (coil.compose.AsyncImagePainter.State) this.state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final coil.request.ImageRequest getRequest() {
        return (coil.request.ImageRequest) this.request.getValue();
    }

    public final void setRequest$coil_compose_base_release(coil.request.ImageRequest imageRequest) {
        this.request.setValue(imageRequest);
    }

    public final coil.ImageLoader getImageLoader() {
        return (coil.ImageLoader) this.imageLoader.getValue();
    }

    public final void setImageLoader$coil_compose_base_release(coil.ImageLoader imageLoader) {
        this.imageLoader.setValue(imageLoader);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        androidx.compose.ui.graphics.painter.Painter painter = getPainter();
        return painter != null ? painter.getIntrinsicSize() : androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        this.drawSize.setValue(androidx.compose.ui.geometry.Size.m1928boximpl(drawScope.mo2592getSizeNHjbRc()));
        androidx.compose.ui.graphics.painter.Painter painter = getPainter();
        if (painter != null) {
            painter.m2751drawx_KDEd0(drawScope, drawScope.mo2592getSizeNHjbRc(), getAlpha(), getColorFilter());
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        setAlpha(alpha);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        setColorFilter(colorFilter);
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        android.os.Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.rememberScope == null) {
                kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()));
                this.rememberScope = CoroutineScope;
                java.lang.Object obj = this._painter;
                androidx.compose.runtime.RememberObserver rememberObserver = obj instanceof androidx.compose.runtime.RememberObserver ? (androidx.compose.runtime.RememberObserver) obj : null;
                if (rememberObserver != null) {
                    rememberObserver.onRemembered();
                }
                if (!this.isPreview) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new coil.compose.AsyncImagePainter$onRemembered$1$1(this, null), 3, null);
                } else {
                    android.graphics.drawable.Drawable placeholder = coil.request.ImageRequest.newBuilder$default(getRequest(), null, 1, null).defaults(getImageLoader().getDefaults()).build().getPlaceholder();
                    updateState(new coil.compose.AsyncImagePainter.State.Loading(placeholder != null ? toPainter(placeholder) : null));
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        clear();
        java.lang.Object obj = this._painter;
        androidx.compose.runtime.RememberObserver rememberObserver = obj instanceof androidx.compose.runtime.RememberObserver ? (androidx.compose.runtime.RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        clear();
        java.lang.Object obj = this._painter;
        androidx.compose.runtime.RememberObserver rememberObserver = obj instanceof androidx.compose.runtime.RememberObserver ? (androidx.compose.runtime.RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    private final void clear() {
        kotlinx.coroutines.CoroutineScope coroutineScope = this.rememberScope;
        if (coroutineScope != null) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.rememberScope = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final coil.request.ImageRequest updateRequest(coil.request.ImageRequest request) {
        coil.request.ImageRequest.Builder target = coil.request.ImageRequest.newBuilder$default(request, null, 1, null).target(new coil.target.Target() { // from class: coil.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(android.graphics.drawable.Drawable error) {
            }

            @Override // coil.target.Target
            public void onSuccess(android.graphics.drawable.Drawable result) {
            }

            @Override // coil.target.Target
            public void onStart(android.graphics.drawable.Drawable placeholder) {
                coil.compose.AsyncImagePainter.this.updateState(new coil.compose.AsyncImagePainter.State.Loading(placeholder != null ? coil.compose.AsyncImagePainter.this.toPainter(placeholder) : null));
            }
        });
        if (request.getDefined().getSizeResolver() == null) {
            target.size(new coil.size.SizeResolver() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // coil.size.SizeResolver
                public final java.lang.Object size(kotlin.coroutines.Continuation<? super coil.size.Size> continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    mutableStateFlow = coil.compose.AsyncImagePainter.this.drawSize;
                    final kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                    return kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<coil.size.Size>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "emit", n = {}, s = {})
                            /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object L$0;
                                int label;
                                /* synthetic */ java.lang.Object result;

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                coil.size.Size m4955toSizeOrNulluvyYCjk;
                                if (continuation instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        java.lang.Object obj2 = anonymousClass1.result;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                            m4955toSizeOrNulluvyYCjk = coil.compose.AsyncImagePainterKt.m4955toSizeOrNulluvyYCjk(((androidx.compose.ui.geometry.Size) obj).getPackedValue());
                                            if (m4955toSizeOrNulluvyYCjk != null) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(m4955toSizeOrNulluvyYCjk, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.result;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super coil.size.Size> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2(flowCollector), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    }, continuation);
                }
            });
        }
        if (request.getDefined().getScale() == null) {
            target.scale(coil.compose.UtilsKt.toScale(this.contentScale));
        }
        if (request.getDefined().getPrecision() != coil.size.Precision.EXACT) {
            target.precision(coil.size.Precision.INEXACT);
        }
        return target.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(coil.compose.AsyncImagePainter.State input) {
        coil.compose.AsyncImagePainter.State state = this._state;
        coil.compose.AsyncImagePainter.State invoke = this.transform.invoke(input);
        set_state(invoke);
        coil.compose.CrossfadePainter maybeNewCrossfadePainter = maybeNewCrossfadePainter(state, invoke);
        set_painter(maybeNewCrossfadePainter != null ? maybeNewCrossfadePainter : invoke.getPainter());
        if (this.rememberScope != null && state.getPainter() != invoke.getPainter()) {
            java.lang.Object painter = state.getPainter();
            androidx.compose.runtime.RememberObserver rememberObserver = painter instanceof androidx.compose.runtime.RememberObserver ? (androidx.compose.runtime.RememberObserver) painter : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            java.lang.Object painter2 = invoke.getPainter();
            androidx.compose.runtime.RememberObserver rememberObserver2 = painter2 instanceof androidx.compose.runtime.RememberObserver ? (androidx.compose.runtime.RememberObserver) painter2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> function1 = this.onState;
        if (function1 != null) {
            function1.invoke(invoke);
        }
    }

    private final coil.compose.CrossfadePainter maybeNewCrossfadePainter(coil.compose.AsyncImagePainter.State previous, coil.compose.AsyncImagePainter.State current) {
        coil.request.ErrorResult result;
        coil.compose.AsyncImagePainterKt$fakeTransitionTarget$1 asyncImagePainterKt$fakeTransitionTarget$1;
        if (!(current instanceof coil.compose.AsyncImagePainter.State.Success)) {
            if (current instanceof coil.compose.AsyncImagePainter.State.Error) {
                result = ((coil.compose.AsyncImagePainter.State.Error) current).getResult();
            }
            return null;
        }
        result = ((coil.compose.AsyncImagePainter.State.Success) current).getResult();
        coil.transition.Transition.Factory transitionFactory = result.getRequest().getTransitionFactory();
        asyncImagePainterKt$fakeTransitionTarget$1 = coil.compose.AsyncImagePainterKt.fakeTransitionTarget;
        coil.transition.Transition create = transitionFactory.create(asyncImagePainterKt$fakeTransitionTarget$1, result);
        if (create instanceof coil.transition.CrossfadeTransition) {
            coil.transition.CrossfadeTransition crossfadeTransition = (coil.transition.CrossfadeTransition) create;
            return new coil.compose.CrossfadePainter(previous instanceof coil.compose.AsyncImagePainter.State.Loading ? previous.getPainter() : null, current.getPainter(), this.contentScale, crossfadeTransition.getDurationMillis(), ((result instanceof coil.request.SuccessResult) && ((coil.request.SuccessResult) result).getIsPlaceholderCached()) ? false : true, crossfadeTransition.getPreferExactIntrinsicSize());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final coil.compose.AsyncImagePainter.State toState(coil.request.ImageResult imageResult) {
        if (imageResult instanceof coil.request.SuccessResult) {
            coil.request.SuccessResult successResult = (coil.request.SuccessResult) imageResult;
            return new coil.compose.AsyncImagePainter.State.Success(toPainter(successResult.getDrawable()), successResult);
        }
        if (!(imageResult instanceof coil.request.ErrorResult)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        coil.request.ErrorResult errorResult = (coil.request.ErrorResult) imageResult;
        android.graphics.drawable.Drawable drawable = errorResult.getDrawable();
        return new coil.compose.AsyncImagePainter.State.Error(drawable != null ? toPainter(drawable) : null, errorResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.graphics.painter.Painter toPainter(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof android.graphics.drawable.BitmapDrawable ? androidx.compose.ui.graphics.painter.BitmapPainterKt.m2748BitmapPainterQZhYCtY$default(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null) : new com.google.accompanist.drawablepainter.DrawablePainter(drawable.mutate());
    }

    /* compiled from: AsyncImagePainter.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcoil/compose/AsyncImagePainter$State;", "", "<init>", "()V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "Empty", "Loading", com.inmobi.unification.sdk.InitializationStatus.SUCCESS, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, "Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State$Success;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract androidx.compose.ui.graphics.painter.Painter getPainter();

        private State() {
        }

        /* compiled from: AsyncImagePainter.kt */
        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State;", "<init>", "()V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "equals", "", "other", "", "hashCode", "", "toString", "", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty extends coil.compose.AsyncImagePainter.State {
            public static final int $stable = 0;
            public static final coil.compose.AsyncImagePainter.State.Empty INSTANCE = new coil.compose.AsyncImagePainter.State.Empty();

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof coil.compose.AsyncImagePainter.State.Empty)) {
                    return false;
                }
                return true;
            }

            @Override // coil.compose.AsyncImagePainter.State
            public androidx.compose.ui.graphics.painter.Painter getPainter() {
                return null;
            }

            public int hashCode() {
                return -1515560141;
            }

            public java.lang.String toString() {
                return "Empty";
            }

            private Empty() {
                super(null);
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends coil.compose.AsyncImagePainter.State {
            public static final int $stable = 8;
            private final androidx.compose.ui.graphics.painter.Painter painter;

            public static /* synthetic */ coil.compose.AsyncImagePainter.State.Loading copy$default(coil.compose.AsyncImagePainter.State.Loading loading, androidx.compose.ui.graphics.painter.Painter painter, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = loading.painter;
                }
                return loading.copy(painter);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final coil.compose.AsyncImagePainter.State.Loading copy(androidx.compose.ui.graphics.painter.Painter painter) {
                return new coil.compose.AsyncImagePainter.State.Loading(painter);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof coil.compose.AsyncImagePainter.State.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.painter, ((coil.compose.AsyncImagePainter.State.Loading) other).painter);
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public java.lang.String toString() {
                return "Loading(painter=" + this.painter + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public Loading(androidx.compose.ui.graphics.painter.Painter painter) {
                super(null);
                this.painter = painter;
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "result", "Lcoil/request/SuccessResult;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/SuccessResult;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getResult", "()Lcoil/request/SuccessResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends coil.compose.AsyncImagePainter.State {
            public static final int $stable = 8;
            private final androidx.compose.ui.graphics.painter.Painter painter;
            private final coil.request.SuccessResult result;

            public static /* synthetic */ coil.compose.AsyncImagePainter.State.Success copy$default(coil.compose.AsyncImagePainter.State.Success success, androidx.compose.ui.graphics.painter.Painter painter, coil.request.SuccessResult successResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = success.painter;
                }
                if ((i & 2) != 0) {
                    successResult = success.result;
                }
                return success.copy(painter, successResult);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            /* renamed from: component2, reason: from getter */
            public final coil.request.SuccessResult getResult() {
                return this.result;
            }

            public final coil.compose.AsyncImagePainter.State.Success copy(androidx.compose.ui.graphics.painter.Painter painter, coil.request.SuccessResult result) {
                return new coil.compose.AsyncImagePainter.State.Success(painter, result);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof coil.compose.AsyncImagePainter.State.Success)) {
                    return false;
                }
                coil.compose.AsyncImagePainter.State.Success success = (coil.compose.AsyncImagePainter.State.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.painter, success.painter) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, success.result);
            }

            public int hashCode() {
                return (this.painter.hashCode() * 31) + this.result.hashCode();
            }

            public java.lang.String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final coil.request.SuccessResult getResult() {
                return this.result;
            }

            public Success(androidx.compose.ui.graphics.painter.Painter painter, coil.request.SuccessResult successResult) {
                super(null);
                this.painter = painter;
                this.result = successResult;
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "result", "Lcoil/request/ErrorResult;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/ErrorResult;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getResult", "()Lcoil/request/ErrorResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends coil.compose.AsyncImagePainter.State {
            public static final int $stable = 8;
            private final androidx.compose.ui.graphics.painter.Painter painter;
            private final coil.request.ErrorResult result;

            public static /* synthetic */ coil.compose.AsyncImagePainter.State.Error copy$default(coil.compose.AsyncImagePainter.State.Error error, androidx.compose.ui.graphics.painter.Painter painter, coil.request.ErrorResult errorResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = error.painter;
                }
                if ((i & 2) != 0) {
                    errorResult = error.result;
                }
                return error.copy(painter, errorResult);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            /* renamed from: component2, reason: from getter */
            public final coil.request.ErrorResult getResult() {
                return this.result;
            }

            public final coil.compose.AsyncImagePainter.State.Error copy(androidx.compose.ui.graphics.painter.Painter painter, coil.request.ErrorResult result) {
                return new coil.compose.AsyncImagePainter.State.Error(painter, result);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof coil.compose.AsyncImagePainter.State.Error)) {
                    return false;
                }
                coil.compose.AsyncImagePainter.State.Error error = (coil.compose.AsyncImagePainter.State.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.painter, error.painter) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, error.result);
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.result.hashCode();
            }

            public java.lang.String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final coil.request.ErrorResult getResult() {
                return this.result;
            }

            public Error(androidx.compose.ui.graphics.painter.Painter painter, coil.request.ErrorResult errorResult) {
                super(null);
                this.painter = painter;
                this.result = errorResult;
            }
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil/compose/AsyncImagePainter$Companion;", "", "<init>", "()V", "DefaultTransform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "getDefaultTransform", "()Lkotlin/jvm/functions/Function1;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, coil.compose.AsyncImagePainter.State> getDefaultTransform() {
            return coil.compose.AsyncImagePainter.DefaultTransform;
        }
    }
}
