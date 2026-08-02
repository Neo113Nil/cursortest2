package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/animation/AnimatedContentScope;", "LocalNavAnimatedContentScope", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalNavAnimatedContentScope", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalNavAnimatedContentScopeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.animation.AnimatedContentScope> LocalNavAnimatedContentScope = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.ui.LocalNavAnimatedContentScopeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.navigation3.ui.LocalNavAnimatedContentScopeKt.m9240$r8$lambda$ChhslgqQekWhqJpOqRxNzxALVA();
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.animation.AnimatedContentScope> getLocalNavAnimatedContentScope() {
        return LocalNavAnimatedContentScope;
    }

    /* renamed from: $r8$lambda$ChhslgqQekWhqJpOqRxNzx-ALVA, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.AnimatedContentScope m9240$r8$lambda$ChhslgqQekWhqJpOqRxNzxALVA() {
        throw new java.lang.IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay that is not in a OverlayScene.");
    }
}
