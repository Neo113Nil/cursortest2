package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ,2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u0004\u0018\u0001H\u001d\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0019\u0010\u001e\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u001f¢\u0006\u0002\b!H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\u00020\b*\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\u00020\b*\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "reverseLayout", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", com.ironsource.X3.i.W, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "addNextInterval", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "layout", "T", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "hasMoreContent", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", "isForward", "isForward-4vf7U8o", "(I)Z", "isOppositeToOrientation", "isOppositeToOrientation-4vf7U8o", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements androidx.compose.ui.modifier.ModifierLocalProvider<androidx.compose.ui.layout.BeyondBoundsLayout>, androidx.compose.ui.layout.BeyondBoundsLayout {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final boolean reverseLayout;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState state;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(kotlin.jvm.functions.Function1 function1) {
        return androidx.compose.ui.Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(kotlin.jvm.functions.Function1 function1) {
        return androidx.compose.ui.Modifier.Element.CC.$default$any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ java.lang.Object foldIn(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
        return androidx.compose.ui.Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ java.lang.Object foldOut(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
        return androidx.compose.ui.Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.Modifier.CC.$default$then(this, modifier);
    }

    public LazyLayoutBeyondBoundsModifierLocal(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.foundation.gestures.Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.ui.layout.BeyondBoundsLayout> getKey() {
        return androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public androidx.compose.ui.layout.BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo728layouto7g1Pn8(final int direction, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int firstPlacedIndex;
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return block.invoke(emptyBeyondBoundsScope);
        }
        if (m726isForward4vf7U8o(direction)) {
            firstPlacedIndex = this.state.getLastPlacedIndex();
        } else {
            firstPlacedIndex = this.state.getFirstPlacedIndex();
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = (T) this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
        T t = null;
        while (t == null && m725hasMoreContentFR3nfPY((androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction)) {
            T t2 = (T) m724addNextIntervalFR3nfPY((androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction);
            this.beyondBoundsInfo.removeInterval((androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = t2;
            this.state.remeasure();
            t = block.invoke(new androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m725hasMoreContentFR3nfPY;
                    m725hasMoreContentFR3nfPY = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.this.m725hasMoreContentFR3nfPY(objectRef.element, direction);
                    return m725hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        this.state.remeasure();
        return t;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m726isForward4vf7U8o(int i) {
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3388getBeforehoxUOeE())) {
            return false;
        }
        if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3387getAfterhoxUOeE())) {
            if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3386getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3389getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3390getLefthoxUOeE())) {
                int i2 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i2 == 1) {
                    return this.reverseLayout;
                }
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            } else {
                if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3391getRighthoxUOeE())) {
                    androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new kotlin.KotlinNothingValueException();
                }
                int i3 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.reverseLayout;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval m724addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (m726isForward4vf7U8o(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m725hasMoreContentFR3nfPY(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (m727isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        if (m726isForward4vf7U8o(i)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m727isOppositeToOrientation4vf7U8o(int i) {
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3386getAbovehoxUOeE()) || androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3389getBelowhoxUOeE())) {
            if (this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
                return true;
            }
        } else if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3390getLefthoxUOeE()) || androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3391getRighthoxUOeE())) {
            if (this.orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                return true;
            }
        } else if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3388getBeforehoxUOeE()) && !androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3382equalsimpl0(i, androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3387getAfterhoxUOeE())) {
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new kotlin.KotlinNothingValueException();
        }
        return false;
    }
}
