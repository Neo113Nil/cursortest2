package androidx.compose.animation;

/* compiled from: AnimatedContent.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002UVB%\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0004\b>\u0010?JK\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJK\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020=*\u00020=2\b\u0010S\u001a\u0004\u0018\u00010TH\u0096\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR1\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\u00020/*\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u00020/*\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W²\u0006\u0010\u0010X\u001a\u00020/\"\u0004\b\u0000\u0010\u0001X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/AnimatedContentTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation_release", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetState", "getTargetState", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "isLeft-gWo6LJ4", "(I)Z", "isRight", "isRight-gWo6LJ4", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifier", "animation_release", "shouldAnimateSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements androidx.compose.animation.AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;
    private androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animatedSize;
    private androidx.compose.ui.Alignment contentAlignment;
    private androidx.compose.ui.unit.LayoutDirection layoutDirection;

    /* renamed from: measuredSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState measuredSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()), null, 2, null);
    private final java.util.Map<S, androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize>> targetSizeMap = new java.util.LinkedHashMap();
    private final androidx.compose.animation.core.Transition<S> transition;

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public /* synthetic */ androidx.compose.animation.ExitTransition getKeepUntilTransitionsFinished(androidx.compose.animation.ExitTransition.Companion companion) {
        androidx.compose.animation.ExitTransition keepUntilTransitionsFinished$animation_release;
        keepUntilTransitionsFinished$animation_release = companion.getKeepUntilTransitionsFinished$animation_release();
        return keepUntilTransitionsFinished$animation_release;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(java.lang.Object obj, java.lang.Object obj2) {
        return androidx.compose.animation.core.Transition.Segment.CC.$default$isTransitioningTo(this, obj, obj2);
    }

    public AnimatedContentTransitionScopeImpl(androidx.compose.animation.core.Transition<S> transition, androidx.compose.ui.Alignment alignment, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    public final androidx.compose.animation.core.Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public androidx.compose.ui.Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public void setContentAlignment(androidx.compose.ui.Alignment alignment) {
        this.contentAlignment = alignment;
    }

    /* renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$animation_release(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public androidx.compose.animation.ContentTransform using(androidx.compose.animation.ContentTransform contentTransform, androidx.compose.animation.SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public androidx.compose.animation.EnterTransition mo40slideIntoContainermOhB8PU(int towards, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> initialOffset) {
        return m61isLeftgWo6LJ4(towards) ? androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m60getCurrentSizeYbymL2g;
                long m60getCurrentSizeYbymL2g2;
                long m59calculateOffsetemnUabE;
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = initialOffset;
                m60getCurrentSizeYbymL2g = this.m60getCurrentSizeYbymL2g();
                int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(m60getCurrentSizeYbymL2g);
                androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(i, i);
                m60getCurrentSizeYbymL2g2 = this.m60getCurrentSizeYbymL2g();
                m59calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m59calculateOffsetemnUabE(IntSize, m60getCurrentSizeYbymL2g2);
                return function1.invoke(java.lang.Integer.valueOf(m4652getWidthimpl - androidx.compose.ui.unit.IntOffset.m4610getXimpl(m59calculateOffsetemnUabE)));
            }
        }) : m62isRightgWo6LJ4(towards) ? androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m60getCurrentSizeYbymL2g;
                long m59calculateOffsetemnUabE;
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = initialOffset;
                androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(i, i);
                m60getCurrentSizeYbymL2g = this.m60getCurrentSizeYbymL2g();
                m59calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m59calculateOffsetemnUabE(IntSize, m60getCurrentSizeYbymL2g);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4610getXimpl(m59calculateOffsetemnUabE)) - i));
            }
        }) : androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(towards, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m56getUpDKzdypw()) ? androidx.compose.animation.EnterExitTransitionKt.slideInVertically(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m60getCurrentSizeYbymL2g;
                long m60getCurrentSizeYbymL2g2;
                long m59calculateOffsetemnUabE;
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = initialOffset;
                m60getCurrentSizeYbymL2g = this.m60getCurrentSizeYbymL2g();
                int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(m60getCurrentSizeYbymL2g);
                androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(i, i);
                m60getCurrentSizeYbymL2g2 = this.m60getCurrentSizeYbymL2g();
                m59calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m59calculateOffsetemnUabE(IntSize, m60getCurrentSizeYbymL2g2);
                return function1.invoke(java.lang.Integer.valueOf(m4651getHeightimpl - androidx.compose.ui.unit.IntOffset.m4611getYimpl(m59calculateOffsetemnUabE)));
            }
        }) : androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(towards, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m51getDownDKzdypw()) ? androidx.compose.animation.EnterExitTransitionKt.slideInVertically(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m60getCurrentSizeYbymL2g;
                long m59calculateOffsetemnUabE;
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = initialOffset;
                androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(i, i);
                m60getCurrentSizeYbymL2g = this.m60getCurrentSizeYbymL2g();
                m59calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m59calculateOffsetemnUabE(IntSize, m60getCurrentSizeYbymL2g);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4611getYimpl(m59calculateOffsetemnUabE)) - i));
            }
        }) : androidx.compose.animation.EnterTransition.INSTANCE.getNone();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m61isLeftgWo6LJ4(int i) {
        return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m53getLeftDKzdypw()) || (androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m55getStartDKzdypw()) && this.layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) || (androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m52getEndDKzdypw()) && this.layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl);
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m62isRightgWo6LJ4(int i) {
        return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m54getRightDKzdypw()) || (androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m55getStartDKzdypw()) && this.layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl) || (androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(i, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m52getEndDKzdypw()) && this.layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m59calculateOffsetemnUabE(long fullSize, long currentSize) {
        return getContentAlignment().mo1748alignKFBX0sM(fullSize, currentSize, androidx.compose.ui.unit.LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public androidx.compose.animation.ExitTransition mo41slideOutOfContainermOhB8PU(int towards, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> targetOffset) {
        return m61isLeftgWo6LJ4(towards) ? androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
            final /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m59calculateOffsetemnUabE;
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((androidx.compose.ui.unit.IntSize) state.getValue()).getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = targetOffset;
                m59calculateOffsetemnUabE = this.this$0.m59calculateOffsetemnUabE(androidx.compose.ui.unit.IntSizeKt.IntSize(i, i), packedValue);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4610getXimpl(m59calculateOffsetemnUabE)) - i));
            }
        }) : m62isRightgWo6LJ4(towards) ? androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
            final /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m59calculateOffsetemnUabE;
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((androidx.compose.ui.unit.IntSize) state.getValue()).getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = targetOffset;
                m59calculateOffsetemnUabE = this.this$0.m59calculateOffsetemnUabE(androidx.compose.ui.unit.IntSizeKt.IntSize(i, i), packedValue);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4610getXimpl(m59calculateOffsetemnUabE)) + androidx.compose.ui.unit.IntSize.m4652getWidthimpl(packedValue)));
            }
        }) : androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(towards, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m56getUpDKzdypw()) ? androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            final /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m59calculateOffsetemnUabE;
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((androidx.compose.ui.unit.IntSize) state.getValue()).getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = targetOffset;
                m59calculateOffsetemnUabE = this.this$0.m59calculateOffsetemnUabE(androidx.compose.ui.unit.IntSizeKt.IntSize(i, i), packedValue);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4611getYimpl(m59calculateOffsetemnUabE)) - i));
            }
        }) : androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.m47equalsimpl0(towards, androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.INSTANCE.m51getDownDKzdypw()) ? androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(animationSpec, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Integer invoke(int i) {
                long m59calculateOffsetemnUabE;
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long packedValue = state != null ? ((androidx.compose.ui.unit.IntSize) state.getValue()).getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = targetOffset;
                m59calculateOffsetemnUabE = this.this$0.m59calculateOffsetemnUabE(androidx.compose.ui.unit.IntSizeKt.IntSize(i, i), packedValue);
                return function1.invoke(java.lang.Integer.valueOf((-androidx.compose.ui.unit.IntOffset.m4611getYimpl(m59calculateOffsetemnUabE)) + androidx.compose.ui.unit.IntSize.m4651getHeightimpl(packedValue)));
            }
        }) : androidx.compose.animation.ExitTransition.INSTANCE.getNone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m63getMeasuredSizeYbymL2g$animation_release() {
        return ((androidx.compose.ui.unit.IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m64setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize.setValue(androidx.compose.ui.unit.IntSize.m4644boximpl(j));
    }

    public final java.util.Map<S, androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final void setAnimatedSize$animation_release(androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> state) {
        this.animatedSize = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m60getCurrentSizeYbymL2g() {
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> state = this.animatedSize;
        return state != null ? state.getValue().getPackedValue() : m63getMeasuredSizeYbymL2g$animation_release();
    }

    public final androidx.compose.ui.Modifier createSizeAnimationModifier$animation_release(androidx.compose.animation.ContentTransform contentTransform, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier.Companion companion;
        composer.startReplaceableGroup(93755870);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createSizeAnimationModifier)539@27214L40,540@27283L52,550@27752L48,551@27813L205:AnimatedContent.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(this);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(createDeferredAnimation);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.animation.SizeTransform sizeTransform = (androidx.compose.animation.SizeTransform) rememberUpdatedState.getValue();
                rememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.ui.Modifier.INSTANCE) : androidx.compose.ui.Modifier.INSTANCE).then(new androidx.compose.animation.AnimatedContentTransitionScopeImpl.SizeModifier(createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            companion = (androidx.compose.ui.Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return companion;
    }

    private static final boolean createSizeAnimationModifier$lambda$2(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    /* compiled from: AnimatedContent.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChildData implements androidx.compose.ui.layout.ParentDataModifier {
        public static final int $stable = 0;
        private boolean isTarget;

        public static /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData copy$default(androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData childData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = childData.isTarget;
            }
            return childData.copy(z);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean all(kotlin.jvm.functions.Function1 function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean any(kotlin.jvm.functions.Function1 function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$any(this, function1);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        public final androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData copy(boolean isTarget) {
            return new androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData(isTarget);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) && this.isTarget == ((androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) other).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ java.lang.Object foldIn(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
            return androidx.compose.ui.Modifier.Element.CC.$default$foldIn(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ java.lang.Object foldOut(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
            return androidx.compose.ui.Modifier.Element.CC.$default$foldOut(this, obj, function2);
        }

        public int hashCode() {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.isTarget);
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
            return this;
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.Modifier.CC.$default$then(this, modifier);
        }

        public java.lang.String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedContent.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B3\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class SizeModifier extends androidx.compose.animation.LayoutModifierWithPassThroughIntrinsics {
        private final androidx.compose.animation.core.Transition<S>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> sizeAnimation;
        private final androidx.compose.runtime.State<androidx.compose.animation.SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(androidx.compose.animation.core.Transition<S>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation, androidx.compose.runtime.State<? extends androidx.compose.animation.SizeTransform> state) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        public final androidx.compose.animation.core.Transition<S>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final androidx.compose.runtime.State<androidx.compose.animation.SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public androidx.compose.ui.layout.MeasureResult mo65measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
            final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
            androidx.compose.animation.core.Transition<S>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation = this.sizeAnimation;
            final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = androidx.compose.animation.AnimatedContentTransitionScopeImpl.this;
            kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> function1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.animation.core.Transition.Segment<S> segment) {
                    androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> mo114createAnimationSpecTemP2vQ;
                    androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getInitialState());
                    long packedValue = state != null ? state.getValue().getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                    androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> state2 = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getTargetState());
                    long packedValue2 = state2 != null ? state2.getValue().getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                    androidx.compose.animation.SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (mo114createAnimationSpecTemP2vQ = value.mo114createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : mo114createAnimationSpecTemP2vQ;
                }
            };
            final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = androidx.compose.animation.AnimatedContentTransitionScopeImpl.this;
            androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animate = deferredAnimation.animate(function1, new kotlin.jvm.functions.Function1<S, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(java.lang.Object obj) {
                    return androidx.compose.ui.unit.IntSize.m4644boximpl(m66invokeYEO4UFw(obj));
                }

                /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m66invokeYEO4UFw(S s) {
                    androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> state = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release().get(s);
                    return state != null ? state.getValue().getPackedValue() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                }
            });
            androidx.compose.animation.AnimatedContentTransitionScopeImpl.this.setAnimatedSize$animation_release(animate);
            final long mo1748alignKFBX0sM = androidx.compose.animation.AnimatedContentTransitionScopeImpl.this.getContentAlignment().mo1748alignKFBX0sM(androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight()), animate.getValue().getPackedValue(), androidx.compose.ui.unit.LayoutDirection.Ltr);
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(animate.getValue().getPackedValue()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(animate.getValue().getPackedValue()), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$1
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
                    androidx.compose.ui.layout.Placeable.PlacementScope.m3456place70tqf50$default(placementScope, androidx.compose.ui.layout.Placeable.this, mo1748alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }
}
