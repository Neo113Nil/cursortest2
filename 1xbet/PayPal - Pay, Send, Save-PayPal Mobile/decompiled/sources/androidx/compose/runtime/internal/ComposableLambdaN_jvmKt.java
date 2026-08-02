package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/Composer;", "composer", "", "key", "", "tracked", "arity", "", "block", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composableLambdaN", "(Landroidx/compose/runtime/Composer;IZILjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambdaN;", "rememberComposableLambdaN", "(IZILjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambdaN;", "composableLambdaNInstance", "(IZILjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambdaN;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
            kotlin.jvm.internal.Intrinsics.checkNotNull(rememberedValue, "");
            composableLambdaNImpl = (androidx.compose.runtime.internal.ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambdaN rememberComposableLambdaN(int i, boolean z, int i2, java.lang.Object obj, androidx.compose.runtime.Composer composer, int i3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-293456346, i3, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:170)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.internal.ComposableLambdaNImpl(i, z, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl = (androidx.compose.runtime.internal.ComposableLambdaNImpl) rememberedValue;
        composableLambdaNImpl.update(obj);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return composableLambdaNImpl;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambdaN composableLambdaNInstance(int i, boolean z, int i2, java.lang.Object obj) {
        androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl = new androidx.compose.runtime.internal.ComposableLambdaNImpl(i, z, i2);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }
}
