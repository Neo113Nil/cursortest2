package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003!\"#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2#\u0010\t\u001a\u001f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\t\u0010\fJ>\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2#\u0010\r\u001a\u001f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\fJD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2)\u0010\u0010\u001a%\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/navigation3/ui/NavDisplay;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "", "", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "popTransitionSpec", "Lkotlin/Function2;", "", "predictivePopTransitionSpec", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "Landroidx/navigation3/ui/NavDisplay$TransitionKey;", "TRANSITION_SPEC", "Landroidx/navigation3/ui/NavDisplay$TransitionKey;", "getTRANSITION_SPEC$navigation3_ui", "()Landroidx/navigation3/ui/NavDisplay$TransitionKey;", "Landroidx/navigation3/ui/NavDisplay$PopTransitionKey;", "POP_TRANSITION_SPEC", "Landroidx/navigation3/ui/NavDisplay$PopTransitionKey;", "getPOP_TRANSITION_SPEC$navigation3_ui", "()Landroidx/navigation3/ui/NavDisplay$PopTransitionKey;", "Landroidx/navigation3/ui/NavDisplay$PredictivePopTransitionKey;", "PREDICTIVE_POP_TRANSITION_SPEC", "Landroidx/navigation3/ui/NavDisplay$PredictivePopTransitionKey;", "getPREDICTIVE_POP_TRANSITION_SPEC$navigation3_ui", "()Landroidx/navigation3/ui/NavDisplay$PredictivePopTransitionKey;", "TransitionKey", "PopTransitionKey", "PredictivePopTransitionKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavDisplay {
    public static final int $stable = 0;
    public static final androidx.navigation3.ui.NavDisplay INSTANCE = new androidx.navigation3.ui.NavDisplay();
    private static final androidx.navigation3.ui.NavDisplay.TransitionKey TRANSITION_SPEC = androidx.navigation3.ui.NavDisplay.TransitionKey.INSTANCE;
    private static final androidx.navigation3.ui.NavDisplay.PopTransitionKey POP_TRANSITION_SPEC = androidx.navigation3.ui.NavDisplay.PopTransitionKey.INSTANCE;
    private static final androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey PREDICTIVE_POP_TRANSITION_SPEC = androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey.INSTANCE;

    private NavDisplay() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002#\u0012\u001f\u0012\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00060\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation3/ui/NavDisplay$TransitionKey;", "Landroidx/navigation3/runtime/NavMetadataKey;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransitionKey implements androidx.navigation3.runtime.NavMetadataKey<kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, ? extends androidx.compose.animation.ContentTransform>> {
        public static final int $stable = 0;
        public static final androidx.navigation3.ui.NavDisplay.TransitionKey INSTANCE = new androidx.navigation3.ui.NavDisplay.TransitionKey();

        private TransitionKey() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002#\u0012\u001f\u0012\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00060\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation3/ui/NavDisplay$PopTransitionKey;", "Landroidx/navigation3/runtime/NavMetadataKey;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PopTransitionKey implements androidx.navigation3.runtime.NavMetadataKey<kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, ? extends androidx.compose.animation.ContentTransform>> {
        public static final int $stable = 0;
        public static final androidx.navigation3.ui.NavDisplay.PopTransitionKey INSTANCE = new androidx.navigation3.ui.NavDisplay.PopTransitionKey();

        private PopTransitionKey() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002+\u0012'\u0012%\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00070\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation3/ui/NavDisplay$PredictivePopTransitionKey;", "Landroidx/navigation3/runtime/NavMetadataKey;", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PredictivePopTransitionKey implements androidx.navigation3.runtime.NavMetadataKey<kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, ? super java.lang.Integer, ? extends androidx.compose.animation.ContentTransform>> {
        public static final int $stable = 0;
        public static final androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey INSTANCE = new androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey();

        private PredictivePopTransitionKey() {
        }
    }

    public final java.util.Map<java.lang.String, java.lang.Object> transitionSpec(kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, androidx.compose.animation.ContentTransform> transitionSpec) {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(TRANSITION_SPEC.toString(), transitionSpec));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> popTransitionSpec(kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, androidx.compose.animation.ContentTransform> popTransitionSpec) {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(POP_TRANSITION_SPEC.toString(), popTransitionSpec));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> predictivePopTransitionSpec(kotlin.jvm.functions.Function2<? super androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<?>>, ? super java.lang.Integer, androidx.compose.animation.ContentTransform> predictivePopTransitionSpec) {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(PREDICTIVE_POP_TRANSITION_SPEC.toString(), predictivePopTransitionSpec));
    }

    public final androidx.navigation3.ui.NavDisplay.TransitionKey getTRANSITION_SPEC$navigation3_ui() {
        return TRANSITION_SPEC;
    }

    public final androidx.navigation3.ui.NavDisplay.PopTransitionKey getPOP_TRANSITION_SPEC$navigation3_ui() {
        return POP_TRANSITION_SPEC;
    }

    public final androidx.navigation3.ui.NavDisplay.PredictivePopTransitionKey getPREDICTIVE_POP_TRANSITION_SPEC$navigation3_ui() {
        return PREDICTIVE_POP_TRANSITION_SPEC;
    }
}
