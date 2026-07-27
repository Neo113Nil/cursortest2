package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: LazyGridScrolling.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3", f = "LazyGridScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {128, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", ToolBar.FORWARD}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"})
/* loaded from: classes.dex */
final class LazyGridScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ int $slotsPerLine;
    final /* synthetic */ LazyGridState $this_doSmoothScrollToItem;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridScrollingKt$doSmoothScrollToItem$3(LazyGridState lazyGridState, int i, int i2, int i3, Continuation<? super LazyGridScrollingKt$doSmoothScrollToItem$3> continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyGridState;
        this.$index = i;
        this.$slotsPerLine = i2;
        this.$scrollOffset = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyGridScrollingKt$doSmoothScrollToItem$3 lazyGridScrollingKt$doSmoothScrollToItem$3 = new LazyGridScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$slotsPerLine, this.$scrollOffset, continuation);
        lazyGridScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyGridScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyGridScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: ItemFoundInScroll -> 0x01ba, TryCatch #2 {ItemFoundInScroll -> 0x01ba, blocks: (B:17:0x01af, B:19:0x00a8, B:21:0x00ac, B:23:0x00b8, B:26:0x00d3, B:29:0x00e5, B:32:0x0108, B:35:0x0148, B:38:0x0151), top: B:16:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0233 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01a6 -> B:16:0x01af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final ScrollScope scrollScope;
        AnimationState copy$default;
        final float m3959getYimpl;
        final Ref.FloatRef floatRef;
        Float boxFloat;
        boolean z;
        float f;
        float f2;
        LazyGridItemInfo doSmoothScrollToItem$getTargetItem;
        float f3;
        float f4;
        int i;
        Ref.IntRef intRef;
        final Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        ScrollScope scrollScope2;
        int calculateLineAverageMainAxisSize;
        final float f5;
        AnimationState animationState;
        Float boxFloat2;
        boolean z2;
        final ScrollScope scrollScope3;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        LazyGridScrollingKt$doSmoothScrollToItem$3 lazyGridScrollingKt$doSmoothScrollToItem$3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        float f6 = 0.0f;
        boolean z3 = true;
        try {
        } catch (ItemFoundInScroll e) {
            e = e;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope4 = (ScrollScope) this.L$0;
            Density density$foundation_release = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f = LazyGridScrollingKt.TargetDistance;
            float mo315toPx0680j_4 = density$foundation_release.mo315toPx0680j_4(f);
            Density density$foundation_release2 = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f2 = LazyGridScrollingKt.BoundDistance;
            float mo315toPx0680j_42 = density$foundation_release2.mo315toPx0680j_4(f2);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = true;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            doSmoothScrollToItem$getTargetItem = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
            if (doSmoothScrollToItem$getTargetItem != null) {
                throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem, (AnimationState) objectRef2.element);
            }
            int i3 = this.$index > this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 1;
            f3 = mo315toPx0680j_4;
            f4 = mo315toPx0680j_42;
            i = i3;
            intRef = intRef2;
            booleanRef = booleanRef2;
            objectRef = objectRef2;
            scrollScope2 = scrollScope4;
            if (booleanRef.element) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        float f7 = this.F$1;
        float f8 = this.F$0;
        Ref.IntRef intRef3 = (Ref.IntRef) this.L$3;
        Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$2;
        booleanRef = (Ref.BooleanRef) this.L$1;
        ScrollScope scrollScope5 = (ScrollScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        f4 = f7;
        f3 = f8;
        intRef = intRef3;
        scrollScope2 = scrollScope5;
        objectRef = objectRef3;
        try {
            intRef.element++;
            f6 = 0.0f;
            z3 = true;
            if (booleanRef.element && this.$this_doSmoothScrollToItem.getLayoutInfo().getTotalItemsCount() > 0) {
                try {
                    calculateLineAverageMainAxisSize = LazyGridScrollingKt.calculateLineAverageMainAxisSize(this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo(), z3);
                    boolean z4 = this.$index >= this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex() ? z3 : false;
                    int firstVisibleItemIndex = this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex();
                    int i4 = this.$slotsPerLine;
                    float firstVisibleItemScrollOffset = ((calculateLineAverageMainAxisSize * ((firstVisibleItemIndex + ((i4 - 1) * (!z4 ? -1 : z3))) / i4)) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                    if (Math.abs(firstVisibleItemScrollOffset) >= f3) {
                        if (i != 0) {
                            f5 = f3;
                            objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                            animationState = (AnimationState) objectRef.element;
                            boxFloat2 = Boxing.boxFloat(f5);
                            z2 = ((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f6 ? false : z3;
                            boolean z5 = i == 0 ? z3 : false;
                            final int i5 = this.$index;
                            final LazyGridState lazyGridState = this.$this_doSmoothScrollToItem;
                            final int i6 = this.$scrollOffset;
                            scrollScope3 = scrollScope2;
                            Ref.BooleanRef booleanRef3 = booleanRef;
                            final Ref.ObjectRef objectRef4 = objectRef;
                            final boolean z6 = z5;
                            final Ref.IntRef intRef4 = intRef;
                            final float f9 = f4;
                            float f10 = f3;
                            float f11 = f4;
                            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    invoke2(animationScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
                                    LazyGridItemInfo doSmoothScrollToItem$getTargetItem2;
                                    float coerceAtLeast;
                                    LazyGridItemInfo doSmoothScrollToItem$getTargetItem3;
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    doSmoothScrollToItem$getTargetItem2 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState, i5);
                                    if (doSmoothScrollToItem$getTargetItem2 == null) {
                                        if (f5 > 0.0f) {
                                            coerceAtLeast = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), f5);
                                        } else {
                                            coerceAtLeast = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), f5);
                                        }
                                        float f12 = coerceAtLeast - floatRef2.element;
                                        float scrollBy = scrollScope3.scrollBy(f12);
                                        doSmoothScrollToItem$getTargetItem3 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState, i5);
                                        if (doSmoothScrollToItem$getTargetItem3 == null && !LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z6, lazyGridState, i5, i6)) {
                                            if (f12 != scrollBy) {
                                                animateTo.cancelAnimation();
                                                booleanRef.element = false;
                                                return;
                                            }
                                            floatRef2.element += f12;
                                            if (z6) {
                                                if (animateTo.getValue().floatValue() > f9) {
                                                    animateTo.cancelAnimation();
                                                }
                                            } else if (animateTo.getValue().floatValue() < (-f9)) {
                                                animateTo.cancelAnimation();
                                            }
                                            if (z6) {
                                                if (intRef4.element >= 2 && i5 - ((LazyGridItemInfo) CollectionsKt.last((List) lazyGridState.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 200) {
                                                    lazyGridState.snapToItemIndexInternal$foundation_release(i5 - 200, 0);
                                                }
                                            } else if (intRef4.element >= 2) {
                                                int index = ((LazyGridItemInfo) CollectionsKt.first((List) lazyGridState.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                                int i7 = i5;
                                                if (index - i7 > 100) {
                                                    lazyGridState.snapToItemIndexInternal$foundation_release(i7 + 200, 0);
                                                }
                                            }
                                        }
                                        doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                    }
                                    if (!LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z6, lazyGridState, i5, i6)) {
                                        if (doSmoothScrollToItem$getTargetItem2 != null) {
                                            throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, objectRef4.element);
                                        }
                                    } else {
                                        lazyGridState.snapToItemIndexInternal$foundation_release(i5, i6);
                                        booleanRef.element = false;
                                        animateTo.cancelAnimation();
                                    }
                                }
                            };
                            lazyGridScrollingKt$doSmoothScrollToItem$3 = this;
                            this.L$0 = scrollScope3;
                            this.L$1 = booleanRef3;
                            this.L$2 = objectRef4;
                            this.L$3 = intRef4;
                            this.F$0 = f10;
                            this.F$1 = f11;
                            this.I$0 = i;
                            this.label = 1;
                            if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyGridScrollingKt$doSmoothScrollToItem$3, 2, null) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            f3 = f10;
                            f4 = f11;
                            intRef = intRef4;
                            booleanRef = booleanRef3;
                            objectRef = objectRef4;
                            scrollScope2 = scrollScope3;
                            intRef.element++;
                            f6 = 0.0f;
                            z3 = true;
                            if (booleanRef.element) {
                                calculateLineAverageMainAxisSize = LazyGridScrollingKt.calculateLineAverageMainAxisSize(this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo(), z3);
                                if (this.$index >= this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) {
                                }
                                int firstVisibleItemIndex2 = this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex();
                                int i42 = this.$slotsPerLine;
                                float firstVisibleItemScrollOffset2 = ((calculateLineAverageMainAxisSize * ((firstVisibleItemIndex2 + ((i42 - 1) * (!z4 ? -1 : z3))) / i42)) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                                if (Math.abs(firstVisibleItemScrollOffset2) >= f3) {
                                }
                            }
                        } else {
                            firstVisibleItemScrollOffset2 = -f3;
                        }
                    }
                    f5 = firstVisibleItemScrollOffset2;
                    objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                    animationState = (AnimationState) objectRef.element;
                    boxFloat2 = Boxing.boxFloat(f5);
                    if (((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f6) {
                    }
                    if (i == 0) {
                    }
                    final int i52 = this.$index;
                    final LazyGridState lazyGridState2 = this.$this_doSmoothScrollToItem;
                    final int i62 = this.$scrollOffset;
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
                            LazyGridItemInfo doSmoothScrollToItem$getTargetItem2;
                            float coerceAtLeast;
                            LazyGridItemInfo doSmoothScrollToItem$getTargetItem3;
                            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                            doSmoothScrollToItem$getTargetItem2 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState2, i52);
                            if (doSmoothScrollToItem$getTargetItem2 == null) {
                                if (f5 > 0.0f) {
                                    coerceAtLeast = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), f5);
                                } else {
                                    coerceAtLeast = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), f5);
                                }
                                float f12 = coerceAtLeast - floatRef22.element;
                                float scrollBy = scrollScope3.scrollBy(f12);
                                doSmoothScrollToItem$getTargetItem3 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState2, i52);
                                if (doSmoothScrollToItem$getTargetItem3 == null && !LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z6, lazyGridState2, i52, i62)) {
                                    if (f12 != scrollBy) {
                                        animateTo.cancelAnimation();
                                        booleanRef.element = false;
                                        return;
                                    }
                                    floatRef22.element += f12;
                                    if (z6) {
                                        if (animateTo.getValue().floatValue() > f9) {
                                            animateTo.cancelAnimation();
                                        }
                                    } else if (animateTo.getValue().floatValue() < (-f9)) {
                                        animateTo.cancelAnimation();
                                    }
                                    if (z6) {
                                        if (intRef4.element >= 2 && i52 - ((LazyGridItemInfo) CollectionsKt.last((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 200) {
                                            lazyGridState2.snapToItemIndexInternal$foundation_release(i52 - 200, 0);
                                        }
                                    } else if (intRef4.element >= 2) {
                                        int index = ((LazyGridItemInfo) CollectionsKt.first((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                        int i7 = i52;
                                        if (index - i7 > 100) {
                                            lazyGridState2.snapToItemIndexInternal$foundation_release(i7 + 200, 0);
                                        }
                                    }
                                }
                                doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                            }
                            if (!LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z6, lazyGridState2, i52, i62)) {
                                if (doSmoothScrollToItem$getTargetItem2 != null) {
                                    throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, objectRef4.element);
                                }
                            } else {
                                lazyGridState2.snapToItemIndexInternal$foundation_release(i52, i62);
                                booleanRef.element = false;
                                animateTo.cancelAnimation();
                            }
                        }
                    };
                    lazyGridScrollingKt$doSmoothScrollToItem$3 = this;
                    this.L$0 = scrollScope3;
                    this.L$1 = booleanRef3;
                    this.L$2 = objectRef4;
                    this.L$3 = intRef4;
                    this.F$0 = f10;
                    this.F$1 = f11;
                    this.I$0 = i;
                    this.label = 1;
                    if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyGridScrollingKt$doSmoothScrollToItem$3, 2, null) != coroutine_suspended) {
                    }
                } catch (ItemFoundInScroll e2) {
                    e = e2;
                    scrollScope = scrollScope3;
                    copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    m3959getYimpl = IntOffset.m3959getYimpl(e.getItem().getOffset()) + this.$scrollOffset;
                    floatRef = new Ref.FloatRef();
                    boxFloat = Boxing.boxFloat(m3959getYimpl);
                    z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
                            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                            float f12 = m3959getYimpl;
                            float f13 = 0.0f;
                            if (f12 > 0.0f) {
                                f13 = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), m3959getYimpl);
                            } else if (f12 < 0.0f) {
                                f13 = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), m3959getYimpl);
                            }
                            float f14 = f13 - floatRef.element;
                            if (f14 != scrollScope.scrollBy(f14) || f13 != animateTo.getValue().floatValue()) {
                                animateTo.cancelAnimation();
                            }
                            floatRef.element += f14;
                        }
                    }, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
                    return Unit.INSTANCE;
                }
                scrollScope3 = scrollScope2;
                Ref.BooleanRef booleanRef32 = booleanRef;
                final Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef42 = objectRef;
                final boolean z62 = z5;
                final Ref.IntRef intRef42 = intRef;
                final float f92 = f4;
                float f102 = f3;
                float f112 = f4;
            }
        } catch (ItemFoundInScroll e3) {
            e = e3;
            scrollScope = scrollScope2;
            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            m3959getYimpl = IntOffset.m3959getYimpl(e.getItem().getOffset()) + this.$scrollOffset;
            floatRef = new Ref.FloatRef();
            boxFloat = Boxing.boxFloat(m3959getYimpl);
            if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    float f12 = m3959getYimpl;
                    float f13 = 0.0f;
                    if (f12 > 0.0f) {
                        f13 = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), m3959getYimpl);
                    } else if (f12 < 0.0f) {
                        f13 = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), m3959getYimpl);
                    }
                    float f14 = f13 - floatRef.element;
                    if (f14 != scrollScope.scrollBy(f14) || f13 != animateTo.getValue().floatValue()) {
                        animateTo.cancelAnimation();
                    }
                    floatRef.element += f14;
                }
            }, this, 2, null) == coroutine_suspended) {
            }
            this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyGridState lazyGridState, int i, int i2) {
        if (z) {
            if (lazyGridState.getFirstVisibleItemIndex() <= i && (lazyGridState.getFirstVisibleItemIndex() != i || lazyGridState.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyGridState.getFirstVisibleItemIndex() >= i && (lazyGridState.getFirstVisibleItemIndex() != i || lazyGridState.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
