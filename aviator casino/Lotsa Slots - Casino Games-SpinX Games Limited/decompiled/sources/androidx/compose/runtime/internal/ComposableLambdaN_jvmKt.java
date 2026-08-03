package androidx.compose.runtime.internal;

/* compiled from: ComposableLambdaN.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"composableLambdaN", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composer", "Landroidx/compose/runtime/Composer;", com.ironsource.X3.i.W, "", "tracked", "", "arity", "block", "", "composableLambdaNInstance", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambdaN composableLambdaN(androidx.compose.runtime.Composer composer, int i, boolean z, int i2, java.lang.Object obj) {
        androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl;
        composer.startReplaceableGroup(i);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            composableLambdaNImpl = new androidx.compose.runtime.internal.ComposableLambdaNImpl(i, z, i2);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (androidx.compose.runtime.internal.ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambdaN composableLambdaNInstance(int i, boolean z, int i2, java.lang.Object obj) {
        androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl = new androidx.compose.runtime.internal.ComposableLambdaNImpl(i, z, i2);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }
}
