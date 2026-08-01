package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020&H\u0002J!\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J7\u00103\u001a\u00020&2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u0002002\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u00102J/\u0010>\u001a\u0002052\u0006\u0010?\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\b\u0010B\u001a\u00020&H\u0002J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u0010F\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u0010F\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010HJ%\u0010K\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u0010F\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010HJ%\u0010M\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u0010F\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010HJ\u001d\u0010O\u001a\u00020\u00142\u0006\u0010P\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\b\u0010S\u001a\u00020\u0014H\u0002J \u0010T\u001a\u00020\u0014*\u00020U2\u0006\u0010V\u001a\u00020\t2\n\u0010W\u001a\u00060Xj\u0002`YH\u0002J \u0010Z\u001a\u00020\u0014*\u00020U2\u0006\u0010[\u001a\u00020\t2\n\u0010W\u001a\u00060Xj\u0002`YH\u0002J\n\u0010\\\u001a\u00020&*\u00020UJ \u0010]\u001a\u00020\u0014*\u00020U2\u0006\u0010^\u001a\u00020\t2\n\u0010W\u001a\u00060Xj\u0002`YH\u0002J \u0010_\u001a\u00020\u0014*\u00020U2\u0006\u0010`\u001a\u00020\t2\n\u0010W\u001a\u00060Xj\u0002`YH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u000e\u0010!\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "value", "isEnabled", "setEnabled", "isEnabledState", "Landroidx/compose/runtime/MutableState;", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "redrawSignal", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "consumePostFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "consumePostFling-sF-c-tU", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePostScroll", "initialDragDelta", "Landroidx/compose/ui/geometry/Offset;", "overscrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePreFling", "consumePreFling-QWom1Mo", "consumePreScroll", "scrollDelta", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "invalidateOverscroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverscroll", "drawRight", "right", "drawTop", ViewHierarchyConstants.DIMENSION_TOP_KEY, "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private boolean isEnabled;
    private final MutableState<Boolean> isEnabledState;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final Function1<IntSize, Unit> onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private final MutableState<Unit> redrawSignal;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfig) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffect create = EdgeEffectCompat.INSTANCE.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffect = create4;
        List<EdgeEffect> listOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            listOf.get(i).setColor(ColorKt.m1683toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m1470getZeroNHjbRc();
        this.isEnabledState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        Function1<IntSize, Unit> function1 = new Function1<IntSize, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m169invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m169invokeozmzZPI(long j) {
                long j2;
                EdgeEffect edgeEffect;
                EdgeEffect edgeEffect2;
                EdgeEffect edgeEffect3;
                EdgeEffect edgeEffect4;
                EdgeEffect edgeEffect5;
                EdgeEffect edgeEffect6;
                EdgeEffect edgeEffect7;
                EdgeEffect edgeEffect8;
                long m4010toSizeozmzZPI = IntSizeKt.m4010toSizeozmzZPI(j);
                j2 = AndroidEdgeEffectOverscrollEffect.this.containerSize;
                boolean m1457equalsimpl0 = Size.m1457equalsimpl0(m4010toSizeozmzZPI, j2);
                AndroidEdgeEffectOverscrollEffect.this.containerSize = IntSizeKt.m4010toSizeozmzZPI(j);
                if (!m1457equalsimpl0) {
                    edgeEffect = AndroidEdgeEffectOverscrollEffect.this.topEffect;
                    edgeEffect.setSize(IntSize.m4000getWidthimpl(j), IntSize.m3999getHeightimpl(j));
                    edgeEffect2 = AndroidEdgeEffectOverscrollEffect.this.bottomEffect;
                    edgeEffect2.setSize(IntSize.m4000getWidthimpl(j), IntSize.m3999getHeightimpl(j));
                    edgeEffect3 = AndroidEdgeEffectOverscrollEffect.this.leftEffect;
                    edgeEffect3.setSize(IntSize.m3999getHeightimpl(j), IntSize.m4000getWidthimpl(j));
                    edgeEffect4 = AndroidEdgeEffectOverscrollEffect.this.rightEffect;
                    edgeEffect4.setSize(IntSize.m3999getHeightimpl(j), IntSize.m4000getWidthimpl(j));
                    edgeEffect5 = AndroidEdgeEffectOverscrollEffect.this.topEffectNegation;
                    edgeEffect5.setSize(IntSize.m4000getWidthimpl(j), IntSize.m3999getHeightimpl(j));
                    edgeEffect6 = AndroidEdgeEffectOverscrollEffect.this.bottomEffectNegation;
                    edgeEffect6.setSize(IntSize.m4000getWidthimpl(j), IntSize.m3999getHeightimpl(j));
                    edgeEffect7 = AndroidEdgeEffectOverscrollEffect.this.leftEffectNegation;
                    edgeEffect7.setSize(IntSize.m3999getHeightimpl(j), IntSize.m4000getWidthimpl(j));
                    edgeEffect8 = AndroidEdgeEffectOverscrollEffect.this.rightEffectNegation;
                    edgeEffect8.setSize(IntSize.m3999getHeightimpl(j), IntSize.m4000getWidthimpl(j));
                }
                if (m1457equalsimpl0) {
                    return;
                }
                AndroidEdgeEffectOverscrollEffect.this.invalidateOverscroll();
                AndroidEdgeEffectOverscrollEffect.this.animateToRelease();
            }
        };
        this.onNewSize = function1;
        Modifier.Companion companion = Modifier.INSTANCE;
        modifier = AndroidOverscrollKt.StretchOverscrollNonClippingLayer;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(companion.then(modifier), function1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(AndroidEdgeEffectOverscrollEffect.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePreScroll-A0NYTsA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo168consumePreScrollA0NYTsA(long scrollDelta, Offset pointerPosition, int source) {
        float m163pullTop0a9Yr6o;
        long Offset;
        float m161pullLeft0a9Yr6o;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        long packedValue = pointerPosition != null ? pointerPosition.getPackedValue() : SizeKt.m1471getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (Offset.m1393getYimpl(scrollDelta) != 0.0f) {
            if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
                m163pullTop0a9Yr6o = m163pullTop0a9Yr6o(scrollDelta, packedValue);
                if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            } else if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) != 0.0f) {
                m163pullTop0a9Yr6o = m160pullBottom0a9Yr6o(scrollDelta, packedValue);
                if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    this.bottomEffect.onRelease();
                }
            }
            if (Offset.m1392getXimpl(scrollDelta) != 0.0f) {
                if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) != 0.0f) {
                    m161pullLeft0a9Yr6o = m161pullLeft0a9Yr6o(scrollDelta, packedValue);
                    if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
                        this.leftEffect.onRelease();
                    }
                } else if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) != 0.0f) {
                    m161pullLeft0a9Yr6o = m162pullRight0a9Yr6o(scrollDelta, packedValue);
                    if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f) {
                        this.rightEffect.onRelease();
                    }
                }
                f = m161pullLeft0a9Yr6o;
            }
            Offset = OffsetKt.Offset(f, m163pullTop0a9Yr6o);
            if (!Offset.m1389equalsimpl0(Offset, Offset.INSTANCE.m1408getZeroF1C5BW0())) {
                invalidateOverscroll();
            }
            return Offset;
        }
        m163pullTop0a9Yr6o = 0.0f;
        if (Offset.m1392getXimpl(scrollDelta) != 0.0f) {
        }
        Offset = OffsetKt.Offset(f, m163pullTop0a9Yr6o);
        if (!Offset.m1389equalsimpl0(Offset, Offset.INSTANCE.m1408getZeroF1C5BW0())) {
        }
        return Offset;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePostScroll-l7mfB5k, reason: not valid java name */
    public void mo166consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, Offset pointerPosition, int source) {
        boolean z;
        if (NestedScrollSource.m2890equalsimpl0(source, NestedScrollSource.INSTANCE.m2895getDragWNlRxjI())) {
            long packedValue = pointerPosition != null ? pointerPosition.getPackedValue() : SizeKt.m1471getCenteruvyYCjk(this.containerSize);
            if (Offset.m1392getXimpl(overscrollDelta) > 0.0f) {
                m161pullLeft0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1392getXimpl(overscrollDelta) < 0.0f) {
                m162pullRight0a9Yr6o(overscrollDelta, packedValue);
            }
            if (Offset.m1393getYimpl(overscrollDelta) > 0.0f) {
                m163pullTop0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1393getYimpl(overscrollDelta) < 0.0f) {
                m160pullBottom0a9Yr6o(overscrollDelta, packedValue);
            }
            z = !Offset.m1389equalsimpl0(overscrollDelta, Offset.INSTANCE.m1408getZeroF1C5BW0());
        } else {
            z = false;
        }
        if (m164releaseOppositeOverscrollk4lQ0M(initialDragDelta) || z) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePreFling-QWom1Mo, reason: not valid java name */
    public Object mo167consumePreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        float f;
        float f2 = 0.0f;
        if (Velocity.m4065getXimpl(j) > 0.0f && EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) != 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m4065getXimpl(j)));
            f = Velocity.m4065getXimpl(j);
        } else if (Velocity.m4065getXimpl(j) >= 0.0f || EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f) {
            f = 0.0f;
        } else {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m4065getXimpl(j)));
            f = Velocity.m4065getXimpl(j);
        }
        if (Velocity.m4066getYimpl(j) > 0.0f && EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m4066getYimpl(j)));
            f2 = Velocity.m4066getYimpl(j);
        } else if (Velocity.m4066getYimpl(j) < 0.0f && EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) != 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m4066getYimpl(j)));
            f2 = Velocity.m4066getYimpl(j);
        }
        long Velocity = VelocityKt.Velocity(f, f2);
        if (!Velocity.m4064equalsimpl0(Velocity, Velocity.INSTANCE.m4076getZero9UxMQ8M())) {
            invalidateOverscroll();
        }
        return Velocity.m4056boximpl(Velocity);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePostFling-sF-c-tU, reason: not valid java name */
    public Object mo165consumePostFlingsFctU(long j, Continuation<? super Unit> continuation) {
        this.scrollCycleInProgress = false;
        if (Velocity.m4065getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m4065getXimpl(j)));
        } else if (Velocity.m4065getXimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m4065getXimpl(j)));
        }
        if (Velocity.m4066getYimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m4066getYimpl(j)));
        } else if (Velocity.m4066getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m4066getYimpl(j)));
        }
        if (!Velocity.m4064equalsimpl0(j, Velocity.INSTANCE.m4076getZero9UxMQ8M())) {
            invalidateOverscroll();
        }
        animateToRelease();
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isEnabled() {
        return this.isEnabledState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public void setEnabled(boolean z) {
        boolean z2 = this.isEnabled != z;
        this.isEnabledState.setValue(Boolean.valueOf(z));
        this.isEnabled = z;
        if (z2) {
            this.scrollCycleInProgress = false;
            animateToRelease();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long m1471getCenteruvyYCjk = SizeKt.m1471getCenteruvyYCjk(this.containerSize);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m161pullLeft0a9Yr6o(Offset.INSTANCE.m1408getZeroF1C5BW0(), m1471getCenteruvyYCjk);
            z = true;
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) != 0.0f) {
            m162pullRight0a9Yr6o(Offset.INSTANCE.m1408getZeroF1C5BW0(), m1471getCenteruvyYCjk);
            z = true;
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) != 0.0f) {
            m163pullTop0a9Yr6o(Offset.INSTANCE.m1408getZeroF1C5BW0(), m1471getCenteruvyYCjk);
            z = true;
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m160pullBottom0a9Yr6o(Offset.INSTANCE.m1408getZeroF1C5BW0(), m1471getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1458getHeightimpl(this.containerSize), drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().mo401calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int roundToInt = MathKt.roundToInt(Size.m1461getWidthimpl(this.containerSize));
        float mo402calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo402calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo315toPx0680j_4(mo402calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1461getWidthimpl(this.containerSize), (-Size.m1458getHeightimpl(this.containerSize)) + drawScope.mo315toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m164releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean z;
        if (this.leftEffect.isFinished() || Offset.m1392getXimpl(delta) >= 0.0f) {
            z = false;
        } else {
            this.leftEffect.onRelease();
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1392getXimpl(delta) > 0.0f) {
            this.rightEffect.onRelease();
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1393getYimpl(delta) < 0.0f) {
            this.topEffect.onRelease();
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1393getYimpl(delta) <= 0.0f) {
            return z;
        }
        this.bottomEffect.onRelease();
        return z || this.bottomEffect.isFinished();
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m163pullTop0a9Yr6o(long scroll, long displacement) {
        float m1392getXimpl = Offset.m1392getXimpl(displacement) / Size.m1461getWidthimpl(this.containerSize);
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m1393getYimpl(scroll) / Size.m1458getHeightimpl(this.containerSize), m1392getXimpl) * Size.m1458getHeightimpl(this.containerSize);
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m160pullBottom0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m1393getYimpl(scroll) / Size.m1458getHeightimpl(this.containerSize)), 1 - (Offset.m1392getXimpl(displacement) / Size.m1461getWidthimpl(this.containerSize)))) * Size.m1458getHeightimpl(this.containerSize);
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m161pullLeft0a9Yr6o(long scroll, long displacement) {
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m1392getXimpl(scroll) / Size.m1461getWidthimpl(this.containerSize), 1 - (Offset.m1393getYimpl(displacement) / Size.m1458getHeightimpl(this.containerSize))) * Size.m1461getWidthimpl(this.containerSize);
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m162pullRight0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m1392getXimpl(scroll) / Size.m1461getWidthimpl(this.containerSize)), Offset.m1393getYimpl(displacement) / Size.m1458getHeightimpl(this.containerSize))) * Size.m1461getWidthimpl(this.containerSize);
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z2 = drawBottom(drawScope, this.bottomEffect, nativeCanvas) || z;
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverscroll();
        }
    }
}
