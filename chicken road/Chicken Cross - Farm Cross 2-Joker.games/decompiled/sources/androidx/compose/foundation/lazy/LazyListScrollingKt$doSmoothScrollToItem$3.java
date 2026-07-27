package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
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

/* compiled from: LazyListScrolling.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {114, 205}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", ToolBar.FORWARD}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"})
/* loaded from: classes.dex */
final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListScrollingKt$doSmoothScrollToItem$3(LazyListState lazyListState, int i, int i2, Continuation<? super LazyListScrollingKt$doSmoothScrollToItem$3> continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, continuation);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyListScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: ItemFoundInScroll -> 0x01c3, TryCatch #2 {ItemFoundInScroll -> 0x01c3, blocks: (B:17:0x01b8, B:19:0x00a8, B:21:0x00ac, B:23:0x00b8, B:25:0x00cb, B:27:0x00da, B:30:0x0108, B:33:0x0148, B:36:0x0151), top: B:16:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb A[Catch: ItemFoundInScroll -> 0x01c3, LOOP:0: B:24:0x00c9->B:25:0x00cb, LOOP_END, TryCatch #2 {ItemFoundInScroll -> 0x01c3, blocks: (B:17:0x01b8, B:19:0x00a8, B:21:0x00ac, B:23:0x00b8, B:25:0x00cb, B:27:0x00da, B:30:0x0108, B:33:0x0148, B:36:0x0151), top: B:16:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r7v23, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01af -> B:16:0x01b8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final ScrollScope scrollScope;
        AnimationState copy$default;
        final float offset;
        final Ref.FloatRef floatRef;
        Float boxFloat;
        boolean z;
        float f;
        float f2;
        LazyListItemInfo doSmoothScrollToItem$getTargetItem;
        float f3;
        float f4;
        int i;
        Ref.IntRef intRef;
        final Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        ScrollScope scrollScope2;
        final float f5;
        AnimationState animationState;
        Float boxFloat2;
        boolean z2;
        final ScrollScope scrollScope3;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3;
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
            f = LazyListScrollingKt.TargetDistance;
            float mo315toPx0680j_4 = density$foundation_release.mo315toPx0680j_4(f);
            Density density$foundation_release2 = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f2 = LazyListScrollingKt.BoundDistance;
            float mo315toPx0680j_42 = density$foundation_release2.mo315toPx0680j_4(f2);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = true;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            doSmoothScrollToItem$getTargetItem = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
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
                    List<LazyListItemInfo> visibleItemsInfo = this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        i4 += visibleItemsInfo.get(i5).getSize();
                    }
                    float firstVisibleItemIndex = (((this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) * (i4 / visibleItemsInfo.size())) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                    if (Math.abs(firstVisibleItemIndex) >= f3) {
                        if (i != 0) {
                            f5 = f3;
                            objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                            animationState = (AnimationState) objectRef.element;
                            boxFloat2 = Boxing.boxFloat(f5);
                            z2 = ((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f6 ? false : z3;
                            boolean z4 = i == 0 ? z3 : false;
                            final int i6 = this.$index;
                            final LazyListState lazyListState = this.$this_doSmoothScrollToItem;
                            final int i7 = this.$scrollOffset;
                            scrollScope3 = scrollScope2;
                            Ref.BooleanRef booleanRef3 = booleanRef;
                            final Ref.ObjectRef objectRef4 = objectRef;
                            final boolean z5 = z4;
                            final Ref.IntRef intRef4 = intRef;
                            final float f9 = f4;
                            float f10 = f3;
                            float f11 = f4;
                            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.2
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
                                    LazyListItemInfo doSmoothScrollToItem$getTargetItem2;
                                    float coerceAtLeast;
                                    LazyListItemInfo doSmoothScrollToItem$getTargetItem3;
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    doSmoothScrollToItem$getTargetItem2 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState, i6);
                                    if (doSmoothScrollToItem$getTargetItem2 == null) {
                                        if (f5 > 0.0f) {
                                            coerceAtLeast = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), f5);
                                        } else {
                                            coerceAtLeast = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), f5);
                                        }
                                        float f12 = coerceAtLeast - floatRef2.element;
                                        float scrollBy = scrollScope3.scrollBy(f12);
                                        doSmoothScrollToItem$getTargetItem3 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState, i6);
                                        if (doSmoothScrollToItem$getTargetItem3 == null && !LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyListState, i6, i7)) {
                                            if (f12 != scrollBy) {
                                                animateTo.cancelAnimation();
                                                booleanRef.element = false;
                                                return;
                                            }
                                            floatRef2.element += f12;
                                            if (z5) {
                                                if (animateTo.getValue().floatValue() > f9) {
                                                    animateTo.cancelAnimation();
                                                }
                                            } else if (animateTo.getValue().floatValue() < (-f9)) {
                                                animateTo.cancelAnimation();
                                            }
                                            if (z5) {
                                                if (intRef4.element >= 2 && i6 - ((LazyListItemInfo) CollectionsKt.last((List) lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 100) {
                                                    lazyListState.snapToItemIndexInternal$foundation_release(i6 - 100, 0);
                                                }
                                            } else if (intRef4.element >= 2) {
                                                int index = ((LazyListItemInfo) CollectionsKt.first((List) lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                                int i8 = i6;
                                                if (index - i8 > 100) {
                                                    lazyListState.snapToItemIndexInternal$foundation_release(i8 + 100, 0);
                                                }
                                            }
                                        }
                                        doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                    }
                                    if (!LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyListState, i6, i7)) {
                                        if (doSmoothScrollToItem$getTargetItem2 != null) {
                                            throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, objectRef4.element);
                                        }
                                    } else {
                                        lazyListState.snapToItemIndexInternal$foundation_release(i6, i7);
                                        booleanRef.element = false;
                                        animateTo.cancelAnimation();
                                    }
                                }
                            };
                            lazyListScrollingKt$doSmoothScrollToItem$3 = this;
                            this.L$0 = scrollScope3;
                            this.L$1 = booleanRef3;
                            this.L$2 = objectRef4;
                            this.L$3 = intRef4;
                            this.F$0 = f10;
                            this.F$1 = f11;
                            this.I$0 = i;
                            this.label = 1;
                            if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyListScrollingKt$doSmoothScrollToItem$3, 2, null) != coroutine_suspended) {
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
                                List<LazyListItemInfo> visibleItemsInfo2 = this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo();
                                int size2 = visibleItemsInfo2.size();
                                int i42 = 0;
                                while (i5 < size2) {
                                }
                                float firstVisibleItemIndex2 = (((this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) * (i42 / visibleItemsInfo2.size())) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                                if (Math.abs(firstVisibleItemIndex2) >= f3) {
                                }
                            }
                        } else {
                            firstVisibleItemIndex2 = -f3;
                        }
                    }
                    f5 = firstVisibleItemIndex2;
                    objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                    animationState = (AnimationState) objectRef.element;
                    boxFloat2 = Boxing.boxFloat(f5);
                    if (((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f6) {
                    }
                    if (i == 0) {
                    }
                    final int i62 = this.$index;
                    final LazyListState lazyListState2 = this.$this_doSmoothScrollToItem;
                    final int i72 = this.$scrollOffset;
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.2
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
                            LazyListItemInfo doSmoothScrollToItem$getTargetItem2;
                            float coerceAtLeast;
                            LazyListItemInfo doSmoothScrollToItem$getTargetItem3;
                            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                            doSmoothScrollToItem$getTargetItem2 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState2, i62);
                            if (doSmoothScrollToItem$getTargetItem2 == null) {
                                if (f5 > 0.0f) {
                                    coerceAtLeast = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), f5);
                                } else {
                                    coerceAtLeast = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), f5);
                                }
                                float f12 = coerceAtLeast - floatRef22.element;
                                float scrollBy = scrollScope3.scrollBy(f12);
                                doSmoothScrollToItem$getTargetItem3 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState2, i62);
                                if (doSmoothScrollToItem$getTargetItem3 == null && !LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyListState2, i62, i72)) {
                                    if (f12 != scrollBy) {
                                        animateTo.cancelAnimation();
                                        booleanRef.element = false;
                                        return;
                                    }
                                    floatRef22.element += f12;
                                    if (z5) {
                                        if (animateTo.getValue().floatValue() > f9) {
                                            animateTo.cancelAnimation();
                                        }
                                    } else if (animateTo.getValue().floatValue() < (-f9)) {
                                        animateTo.cancelAnimation();
                                    }
                                    if (z5) {
                                        if (intRef4.element >= 2 && i62 - ((LazyListItemInfo) CollectionsKt.last((List) lazyListState2.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 100) {
                                            lazyListState2.snapToItemIndexInternal$foundation_release(i62 - 100, 0);
                                        }
                                    } else if (intRef4.element >= 2) {
                                        int index = ((LazyListItemInfo) CollectionsKt.first((List) lazyListState2.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                        int i8 = i62;
                                        if (index - i8 > 100) {
                                            lazyListState2.snapToItemIndexInternal$foundation_release(i8 + 100, 0);
                                        }
                                    }
                                }
                                doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                            }
                            if (!LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyListState2, i62, i72)) {
                                if (doSmoothScrollToItem$getTargetItem2 != null) {
                                    throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, objectRef4.element);
                                }
                            } else {
                                lazyListState2.snapToItemIndexInternal$foundation_release(i62, i72);
                                booleanRef.element = false;
                                animateTo.cancelAnimation();
                            }
                        }
                    };
                    lazyListScrollingKt$doSmoothScrollToItem$3 = this;
                    this.L$0 = scrollScope3;
                    this.L$1 = booleanRef3;
                    this.L$2 = objectRef4;
                    this.L$3 = intRef4;
                    this.F$0 = f10;
                    this.F$1 = f11;
                    this.I$0 = i;
                    this.label = 1;
                    if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyListScrollingKt$doSmoothScrollToItem$3, 2, null) != coroutine_suspended) {
                    }
                } catch (ItemFoundInScroll e2) {
                    e = e2;
                    scrollScope = scrollScope3;
                    copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    offset = e.getItem().getOffset() + this.$scrollOffset;
                    floatRef = new Ref.FloatRef();
                    boxFloat = Boxing.boxFloat(offset);
                    z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.4
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
                            float f12 = offset;
                            float f13 = 0.0f;
                            if (f12 > 0.0f) {
                                f13 = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), offset);
                            } else if (f12 < 0.0f) {
                                f13 = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), offset);
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
                final boolean z52 = z4;
                final Ref.IntRef intRef42 = intRef;
                final float f92 = f4;
                float f102 = f3;
                float f112 = f4;
            }
        } catch (ItemFoundInScroll e3) {
            e = e3;
            scrollScope = scrollScope2;
            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            offset = e.getItem().getOffset() + this.$scrollOffset;
            floatRef = new Ref.FloatRef();
            boxFloat = Boxing.boxFloat(offset);
            if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.4
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
                    float f12 = offset;
                    float f13 = 0.0f;
                    if (f12 > 0.0f) {
                        f13 = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), offset);
                    } else if (f12 < 0.0f) {
                        f13 = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), offset);
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
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyListState lazyListState, int i, int i2) {
        if (z) {
            if (lazyListState.getFirstVisibleItemIndex() <= i && (lazyListState.getFirstVisibleItemIndex() != i || lazyListState.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyListState.getFirstVisibleItemIndex() >= i && (lazyListState.getFirstVisibleItemIndex() != i || lazyListState.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
