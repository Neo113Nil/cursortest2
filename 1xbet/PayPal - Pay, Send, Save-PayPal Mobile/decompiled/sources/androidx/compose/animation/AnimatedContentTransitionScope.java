package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001$J\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001f\u001a\u00020\u0016*\u00020\u001a8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010#\u001a\u00020 8'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u0001%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition$Companion;", "getKeepUntilTransitionsFinished", "(Landroidx/compose/animation/ExitTransition$Companion;)Landroidx/compose/animation/ExitTransition;", "getKeepUntilTransitionsFinished$annotations", "(Landroidx/compose/animation/ExitTransition$Companion;)V", "KeepUntilTransitionsFinished", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "contentAlignment", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends androidx.compose.animation.core.Transition.Segment<S> {
    static /* synthetic */ void getKeepUntilTransitionsFinished$annotations(androidx.compose.animation.ExitTransition.Companion companion) {
    }

    androidx.compose.ui.Alignment getContentAlignment();

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    androidx.compose.animation.EnterTransition mo1098slideIntoContainermOhB8PU(int towards, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> initialOffset);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    androidx.compose.animation.ExitTransition mo1099slideOutOfContainermOhB8PU(int towards, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> targetOffset);

    androidx.compose.animation.ContentTransform using(androidx.compose.animation.ContentTransform contentTransform, androidx.compose.animation.SizeTransform sizeTransform);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class SlideDirection {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion INSTANCE = new androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion(null);
        private static final int Left = m1101constructorimpl(0);
        private static final int Right = m1101constructorimpl(1);
        private static final int Up = m1101constructorimpl(2);
        private static final int Down = m1101constructorimpl(3);
        private static final int Start = m1101constructorimpl(4);
        private static final int End = m1101constructorimpl(5);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1101constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1103equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "Left", com.visa.cbp.getEncExpo.warmup, "getLeft-DKzdypw", "()I", "Right", "getRight-DKzdypw", "Up", "getUp-DKzdypw", "Down", "getDown-DKzdypw", "Start", "getStart-DKzdypw", "End", "getEnd-DKzdypw"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m1109getLeftDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m1110getRightDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Right;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m1112getUpDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Up;
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m1107getDownDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Down;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m1111getStartDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Start;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m1108getEndDKzdypw() {
                return androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.End;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ SlideDirection(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final java.lang.String toString() {
            return m1105toStringimpl(this.getHighSpeedVideoFpsRangesFor);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m1105toStringimpl(int i) {
            return m1103equalsimpl0(i, Left) ? "Left" : m1103equalsimpl0(i, Right) ? "Right" : m1103equalsimpl0(i, Up) ? "Up" : m1103equalsimpl0(i, Down) ? "Down" : m1103equalsimpl0(i, Start) ? "Start" : m1103equalsimpl0(i, End) ? "End" : "Invalid";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int hashCode() {
            return m1104hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object other) {
            return m1102equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1104hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1102equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection) && i == ((androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection) obj).getGetHighSpeedVideoFpsRangesFor();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection m1100boximpl(int i) {
            return new androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.animation.EnterTransition m1096slideIntoContainermOhB8PU$default(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope, int i, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 3, null);
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final java.lang.Integer getHighSpeedVideoFpsRanges(int i3) {
                    return java.lang.Integer.valueOf(i3);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoFpsRanges(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo1098slideIntoContainermOhB8PU(i, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.animation.ExitTransition m1097slideOutOfContainermOhB8PU$default(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope, int i, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 3, null);
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final java.lang.Integer getHighSpeedVideoFpsRanges(int i3) {
                    return java.lang.Integer.valueOf(i3);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoFpsRanges(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo1099slideOutOfContainermOhB8PU(i, finiteAnimationSpec, function1);
    }

    default androidx.compose.animation.ExitTransition getKeepUntilTransitionsFinished(androidx.compose.animation.ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation();
    }
}
