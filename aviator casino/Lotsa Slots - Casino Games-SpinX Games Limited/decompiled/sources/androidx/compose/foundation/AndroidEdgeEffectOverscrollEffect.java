package androidx.compose.foundation;

/* compiled from: AndroidOverscroll.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00105\u001a\u00020+H\u0002J?\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u0002080;\u0012\u0006\u0012\u0004\u0018\u00010<0:H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J6\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0)H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\b\u0010F\u001a\u00020+H\u0002J\"\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\"\u0010M\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010LJ\"\u0010O\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010LJ\"\u0010Q\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010LJ\u001a\u0010S\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\b\u0010V\u001a\u00020\u001eH\u0002J \u0010W\u001a\u00020\u001e*\u00020X2\u0006\u0010Y\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J \u0010]\u001a\u00020\u001e*\u00020X2\u0006\u0010^\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J\n\u0010_\u001a\u00020+*\u00020XJ \u0010`\u001a\u00020\u001e*\u00020X2\u0006\u0010a\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J \u0010b\u001a\u00020\u001e*\u00020X2\u0006\u0010c\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "consumeCount", "", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "<set-?>", "invalidateCount", "getInvalidateCount", "()I", "setInvalidateCount", "(I)V", "invalidateCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "invalidateOverscroll", "pullBottom", "", com.helpshift.proactive.InAppViewConstants.SCROLL, "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverscroll", "drawRight", "right", "drawTop", "top", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements androidx.compose.foundation.OverscrollEffect {
    public static final int $stable = 0;
    private final java.util.List<android.widget.EdgeEffect> allEffects;
    private final android.widget.EdgeEffect bottomEffect;
    private final android.widget.EdgeEffect bottomEffectNegation;
    private int consumeCount;
    private long containerSize;
    private final androidx.compose.ui.Modifier effectModifier;

    /* renamed from: invalidateCount$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState invalidateCount;
    private boolean invalidationEnabled;
    private final android.widget.EdgeEffect leftEffect;
    private final android.widget.EdgeEffect leftEffectNegation;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit> onNewSize;
    private final androidx.compose.foundation.OverscrollConfiguration overscrollConfig;
    private androidx.compose.ui.input.pointer.PointerId pointerId;
    private androidx.compose.ui.geometry.Offset pointerPosition;
    private final android.widget.EdgeEffect rightEffect;
    private final android.widget.EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final android.widget.EdgeEffect topEffect;
    private final android.widget.EdgeEffect topEffectNegation;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(android.content.Context context, androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration) {
        androidx.compose.ui.Modifier modifier;
        this.overscrollConfig = overscrollConfiguration;
        android.widget.EdgeEffect create = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.topEffect = create;
        android.widget.EdgeEffect create2 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffect = create2;
        android.widget.EdgeEffect create3 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffect = create3;
        android.widget.EdgeEffect create4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffect = create4;
        java.util.List<android.widget.EdgeEffect> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.widget.EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffectNegation = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffectNegation = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffectNegation = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            listOf.get(i).setColor(androidx.compose.ui.graphics.ColorKt.m2167toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        this.consumeCount = -1;
        this.invalidateCount = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.invalidationEnabled = true;
        this.containerSize = androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntSize intSize) {
                m194invokeozmzZPI(intSize.getPackedValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m194invokeozmzZPI(long j) {
                long j2;
                android.widget.EdgeEffect edgeEffect;
                android.widget.EdgeEffect edgeEffect2;
                android.widget.EdgeEffect edgeEffect3;
                android.widget.EdgeEffect edgeEffect4;
                android.widget.EdgeEffect edgeEffect5;
                android.widget.EdgeEffect edgeEffect6;
                android.widget.EdgeEffect edgeEffect7;
                android.widget.EdgeEffect edgeEffect8;
                long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(j);
                j2 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.containerSize;
                boolean z = !androidx.compose.ui.geometry.Size.m1936equalsimpl0(m4662toSizeozmzZPI, j2);
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.containerSize = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(j);
                if (z) {
                    edgeEffect = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.topEffect;
                    edgeEffect.setSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
                    edgeEffect2 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.bottomEffect;
                    edgeEffect2.setSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
                    edgeEffect3 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.leftEffect;
                    edgeEffect3.setSize(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j));
                    edgeEffect4 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.rightEffect;
                    edgeEffect4.setSize(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j));
                    edgeEffect5 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.topEffectNegation;
                    edgeEffect5.setSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
                    edgeEffect6 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.bottomEffectNegation;
                    edgeEffect6.setSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
                    edgeEffect7 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.leftEffectNegation;
                    edgeEffect7.setSize(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j));
                    edgeEffect8 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.rightEffectNegation;
                    edgeEffect8.setSize(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j));
                }
                if (z) {
                    androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.invalidateOverscroll();
                    androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this.animateToRelease();
                }
            }
        };
        this.onNewSize = function1;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        modifier = androidx.compose.foundation.AndroidOverscroll_androidKt.StretchOverscrollNonClippingLayer;
        this.effectModifier = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), kotlin.Unit.INSTANCE, new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), function1).then(new androidx.compose.foundation.DrawOverscrollModifier(this, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    private final int getInvalidateCount() {
        return this.invalidateCount.getIntValue();
    }

    private final void setInvalidateCount(int i) {
        this.invalidateCount.setIntValue(i);
    }

    /* renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo193applyToScrollRhakbz0(long delta, int source, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> performScroll) {
        float m190pullTop0a9Yr6o;
        long Offset;
        boolean z;
        boolean z2;
        float m188pullLeft0a9Yr6o;
        if (androidx.compose.ui.geometry.Size.m1942isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(delta)).getPackedValue();
        }
        boolean z3 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        androidx.compose.ui.geometry.Offset offset = this.pointerPosition;
        long packedValue = offset != null ? offset.getPackedValue() : androidx.compose.ui.geometry.SizeKt.m1950getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(delta) != 0.0f) {
            if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
                m190pullTop0a9Yr6o = m190pullTop0a9Yr6o(delta, packedValue);
                if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            } else if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) != 0.0f) {
                m190pullTop0a9Yr6o = m187pullBottom0a9Yr6o(delta, packedValue);
                if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    this.bottomEffect.onRelease();
                }
            }
            if (androidx.compose.ui.geometry.Offset.m1871getXimpl(delta) != 0.0f) {
                if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) != 0.0f) {
                    m188pullLeft0a9Yr6o = m188pullLeft0a9Yr6o(delta, packedValue);
                    if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
                        this.leftEffect.onRelease();
                    }
                } else if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) != 0.0f) {
                    m188pullLeft0a9Yr6o = m189pullRight0a9Yr6o(delta, packedValue);
                    if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f) {
                        this.rightEffect.onRelease();
                    }
                }
                f = m188pullLeft0a9Yr6o;
            }
            Offset = androidx.compose.ui.geometry.OffsetKt.Offset(f, m190pullTop0a9Yr6o);
            if (!androidx.compose.ui.geometry.Offset.m1868equalsimpl0(Offset, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0())) {
                invalidateOverscroll();
            }
            long m1875minusMKHz9U = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(delta, Offset);
            long packedValue2 = performScroll.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(m1875minusMKHz9U)).getPackedValue();
            long m1875minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(m1875minusMKHz9U, packedValue2);
            boolean z4 = false;
            if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3168getDragWNlRxjI())) {
                if (androidx.compose.ui.geometry.Offset.m1871getXimpl(m1875minusMKHz9U2) > 0.5f) {
                    m188pullLeft0a9Yr6o(m1875minusMKHz9U2, packedValue);
                } else if (androidx.compose.ui.geometry.Offset.m1871getXimpl(m1875minusMKHz9U2) < -0.5f) {
                    m189pullRight0a9Yr6o(m1875minusMKHz9U2, packedValue);
                } else {
                    z = false;
                    if (androidx.compose.ui.geometry.Offset.m1872getYimpl(m1875minusMKHz9U2) <= 0.5f) {
                        m190pullTop0a9Yr6o(m1875minusMKHz9U2, packedValue);
                    } else if (androidx.compose.ui.geometry.Offset.m1872getYimpl(m1875minusMKHz9U2) < -0.5f) {
                        m187pullBottom0a9Yr6o(m1875minusMKHz9U2, packedValue);
                    } else {
                        z2 = false;
                        if (!z && !z2) {
                            z3 = false;
                        }
                        z4 = z3;
                    }
                    z2 = true;
                    if (!z) {
                        z3 = false;
                    }
                    z4 = z3;
                }
                z = true;
                if (androidx.compose.ui.geometry.Offset.m1872getYimpl(m1875minusMKHz9U2) <= 0.5f) {
                }
                z2 = true;
                if (!z) {
                }
                z4 = z3;
            }
            if (!m191releaseOppositeOverscrollk4lQ0M(delta) || z4) {
                invalidateOverscroll();
            }
            return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(Offset, packedValue2);
        }
        m190pullTop0a9Yr6o = 0.0f;
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(delta) != 0.0f) {
        }
        Offset = androidx.compose.ui.geometry.OffsetKt.Offset(f, m190pullTop0a9Yr6o);
        if (!androidx.compose.ui.geometry.Offset.m1868equalsimpl0(Offset, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0())) {
        }
        long m1875minusMKHz9U3 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(delta, Offset);
        long packedValue22 = performScroll.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(m1875minusMKHz9U3)).getPackedValue();
        long m1875minusMKHz9U22 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(m1875minusMKHz9U3, packedValue22);
        boolean z42 = false;
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3168getDragWNlRxjI())) {
        }
        if (!m191releaseOppositeOverscrollk4lQ0M(delta)) {
        }
        invalidateOverscroll();
        return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(Offset, packedValue22);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo192applyToFlingBMRW4eQ(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        float f;
        float f2;
        long m4720minusAH228Gc;
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long m4720minusAH228Gc2;
        if (continuation instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            if ((androidEdgeEffectOverscrollEffect$applyToFling$1.label & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m4720minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                    androidEdgeEffectOverscrollEffect = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    m4720minusAH228Gc2 = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(m4720minusAH228Gc, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue());
                    androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                    if (androidx.compose.ui.unit.Velocity.m4717getXimpl(m4720minusAH228Gc2) <= 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.leftEffect, kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4717getXimpl(m4720minusAH228Gc2)));
                    } else if (androidx.compose.ui.unit.Velocity.m4717getXimpl(m4720minusAH228Gc2) < 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.rightEffect, -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4717getXimpl(m4720minusAH228Gc2)));
                    }
                    if (androidx.compose.ui.unit.Velocity.m4718getYimpl(m4720minusAH228Gc2) <= 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.topEffect, kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4718getYimpl(m4720minusAH228Gc2)));
                    } else if (androidx.compose.ui.unit.Velocity.m4718getYimpl(m4720minusAH228Gc2) < 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.bottomEffect, -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4718getYimpl(m4720minusAH228Gc2)));
                    }
                    if (!androidx.compose.ui.unit.Velocity.m4716equalsimpl0(m4720minusAH228Gc2, androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M())) {
                        androidEdgeEffectOverscrollEffect.invalidateOverscroll();
                    }
                    androidEdgeEffectOverscrollEffect.animateToRelease();
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (androidx.compose.ui.geometry.Size.m1942isEmptyimpl(this.containerSize)) {
                    androidx.compose.ui.unit.Velocity m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                    if (function2.invoke(m4708boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (androidx.compose.ui.unit.Velocity.m4717getXimpl(j) > 0.0f && androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) != 0.0f) {
                    androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4717getXimpl(j)));
                    f = androidx.compose.ui.unit.Velocity.m4717getXimpl(j);
                } else if (androidx.compose.ui.unit.Velocity.m4717getXimpl(j) >= 0.0f || androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f) {
                    f = 0.0f;
                } else {
                    androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4717getXimpl(j)));
                    f = androidx.compose.ui.unit.Velocity.m4717getXimpl(j);
                }
                if (androidx.compose.ui.unit.Velocity.m4718getYimpl(j) > 0.0f && androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
                    androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4718getYimpl(j)));
                    f2 = androidx.compose.ui.unit.Velocity.m4718getYimpl(j);
                } else if (androidx.compose.ui.unit.Velocity.m4718getYimpl(j) >= 0.0f || androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    f2 = 0.0f;
                } else {
                    androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m4718getYimpl(j)));
                    f2 = androidx.compose.ui.unit.Velocity.m4718getYimpl(j);
                }
                long Velocity = androidx.compose.ui.unit.VelocityKt.Velocity(f, f2);
                if (!androidx.compose.ui.unit.Velocity.m4716equalsimpl0(Velocity, androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M())) {
                    invalidateOverscroll();
                }
                m4720minusAH228Gc = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j, Velocity);
                androidx.compose.ui.unit.Velocity m4708boximpl2 = androidx.compose.ui.unit.Velocity.m4708boximpl(m4720minusAH228Gc);
                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m4720minusAH228Gc;
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                obj = function2.invoke(m4708boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidEdgeEffectOverscrollEffect = this;
                m4720minusAH228Gc2 = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(m4720minusAH228Gc, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue());
                androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                if (androidx.compose.ui.unit.Velocity.m4717getXimpl(m4720minusAH228Gc2) <= 0.0f) {
                }
                if (androidx.compose.ui.unit.Velocity.m4718getYimpl(m4720minusAH228Gc2) <= 0.0f) {
                }
                if (!androidx.compose.ui.unit.Velocity.m4716equalsimpl0(m4720minusAH228Gc2, androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M())) {
                }
                androidEdgeEffectOverscrollEffect.animateToRelease();
                return kotlin.Unit.INSTANCE;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
        java.lang.Object obj2 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        java.util.List<android.widget.EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long m1950getCenteruvyYCjk = androidx.compose.ui.geometry.SizeKt.m1950getCenteruvyYCjk(this.containerSize);
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m188pullLeft0a9Yr6o(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), m1950getCenteruvyYCjk);
            z = true;
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) != 0.0f) {
            m189pullRight0a9Yr6o(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), m1950getCenteruvyYCjk);
            z = true;
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
            m190pullTop0a9Yr6o(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), m1950getCenteruvyYCjk);
            z = true;
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m187pullBottom0a9Yr6o(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), m1950getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public androidx.compose.ui.Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void drawOverscroll(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        boolean z;
        if (androidx.compose.ui.geometry.Size.m1942isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.consumeCount = getInvalidateCount();
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffectNegation, androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffectNegation, androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffectNegation, androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z2 = drawBottom(drawScope, this.bottomEffect, nativeCanvas) || z;
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffectNegation, androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawLeft(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize), drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().mo519calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        int roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize));
        float mo520calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo520calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo315toPx0680j_4(mo520calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawBottom(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize), (-androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize)) + drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled && this.consumeCount == getInvalidateCount()) {
            setInvalidateCount(getInvalidateCount() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        java.util.List<android.widget.EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            android.widget.EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m191releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean z;
        if (this.leftEffect.isFinished() || androidx.compose.ui.geometry.Offset.m1871getXimpl(delta) >= 0.0f) {
            z = false;
        } else {
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, androidx.compose.ui.geometry.Offset.m1871getXimpl(delta));
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && androidx.compose.ui.geometry.Offset.m1871getXimpl(delta) > 0.0f) {
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, androidx.compose.ui.geometry.Offset.m1871getXimpl(delta));
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && androidx.compose.ui.geometry.Offset.m1872getYimpl(delta) < 0.0f) {
            androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, androidx.compose.ui.geometry.Offset.m1872getYimpl(delta));
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || androidx.compose.ui.geometry.Offset.m1872getYimpl(delta) <= 0.0f) {
            return z;
        }
        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, androidx.compose.ui.geometry.Offset.m1872getYimpl(delta));
        return z || this.bottomEffect.isFinished();
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m190pullTop0a9Yr6o(long scroll, long displacement) {
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f ? androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, androidx.compose.ui.geometry.Offset.m1872getYimpl(scroll) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize), androidx.compose.ui.geometry.Offset.m1871getXimpl(displacement) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize)) * androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize) : androidx.compose.ui.geometry.Offset.m1872getYimpl(scroll);
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m187pullBottom0a9Yr6o(long scroll, long displacement) {
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f ? (-androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(androidx.compose.ui.geometry.Offset.m1872getYimpl(scroll) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize)), 1 - (androidx.compose.ui.geometry.Offset.m1871getXimpl(displacement) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize)))) * androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize) : androidx.compose.ui.geometry.Offset.m1872getYimpl(scroll);
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m188pullLeft0a9Yr6o(long scroll, long displacement) {
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f ? androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, androidx.compose.ui.geometry.Offset.m1871getXimpl(scroll) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize), 1 - (androidx.compose.ui.geometry.Offset.m1872getYimpl(displacement) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize))) * androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize) : androidx.compose.ui.geometry.Offset.m1871getXimpl(scroll);
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m189pullRight0a9Yr6o(long scroll, long displacement) {
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f ? (-androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(androidx.compose.ui.geometry.Offset.m1871getXimpl(scroll) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize)), androidx.compose.ui.geometry.Offset.m1872getYimpl(displacement) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(this.containerSize))) * androidx.compose.ui.geometry.Size.m1940getWidthimpl(this.containerSize) : androidx.compose.ui.geometry.Offset.m1871getXimpl(scroll);
    }
}
