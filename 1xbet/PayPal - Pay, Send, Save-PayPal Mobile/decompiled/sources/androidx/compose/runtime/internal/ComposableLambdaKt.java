package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"", "bits", "slot", "bitsForSlot", "(II)I", "sameBits", "(I)I", "differentBits", "Landroidx/compose/runtime/RecomposeScope;", "other", "", "replacableWith", "(Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/runtime/RecomposeScope;)Z", "Landroidx/compose/runtime/Composer;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambda", "(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambdaInstance", "(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "rememberComposableLambda", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "SLOTS_PER_INT", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableLambdaKt {
    public static final int SLOTS_PER_INT = 10;
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int sameBits(int i) {
        return bitsForSlot(1, i);
    }

    public static final int differentBits(int i) {
        return bitsForSlot(2, i);
    }

    public static final boolean replacableWith(androidx.compose.runtime.RecomposeScope recomposeScope, androidx.compose.runtime.RecomposeScope recomposeScope2) {
        if (recomposeScope == null) {
            return true;
        }
        if (!(recomposeScope instanceof androidx.compose.runtime.RecomposeScopeImpl) || !(recomposeScope2 instanceof androidx.compose.runtime.RecomposeScopeImpl)) {
            return false;
        }
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) recomposeScope;
        return !recomposeScopeImpl.getValid() || kotlin.jvm.internal.Intrinsics.areEqual(recomposeScope, recomposeScope2) || kotlin.jvm.internal.Intrinsics.areEqual(recomposeScopeImpl.getAnchor(), ((androidx.compose.runtime.RecomposeScopeImpl) recomposeScope2).getAnchor());
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance(int i, boolean z, java.lang.Object obj) {
        return new androidx.compose.runtime.internal.ComposableLambdaImpl(i, z, obj);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda(int i, boolean z, java.lang.Object obj, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.internal.ComposableLambdaImpl(i, z, obj);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl = (androidx.compose.runtime.internal.ComposableLambdaImpl) rememberedValue;
        composableLambdaImpl.update(obj);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return composableLambdaImpl;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final androidx.compose.runtime.internal.ComposableLambda composableLambda(androidx.compose.runtime.Composer composer, int i, boolean z, java.lang.Object obj) {
        androidx.compose.runtime.internal.ComposableLambdaImpl composableLambdaImpl;
        composer.startMovableGroup(java.lang.Integer.rotateLeft(i, 1), getHighSpeedVideoSizes);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            composableLambdaImpl = new androidx.compose.runtime.internal.ComposableLambdaImpl(i, z, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rememberedValue, "");
            composableLambdaImpl = (androidx.compose.runtime.internal.ComposableLambdaImpl) rememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endMovableGroup();
        return composableLambdaImpl;
    }
}
