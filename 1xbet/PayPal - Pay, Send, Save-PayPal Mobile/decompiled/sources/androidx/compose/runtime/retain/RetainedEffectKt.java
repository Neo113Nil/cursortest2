package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a(\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\n\u001a:\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\f\u001aD\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u000e\u001a>\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u000f\"\u0004\u0018\u00010\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/retain/RetainedEffectScope;", "Landroidx/compose/runtime/retain/RetainedEffectResult;", "Lkotlin/ExtensionFunctionType;", "effect", "", "RetainedEffect", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/retain/RetainedEffectScope;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetainedEffectKt {
    private static final androidx.compose.runtime.retain.RetainedEffectScope getHighSpeedVideoFpsRangesFor = new androidx.compose.runtime.retain.RetainedEffectScope();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "RetainedEffect must provide one or more 'key' parameters that define the identity of the RetainedEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    public static final void RetainedEffect(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(829391227, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:87)");
        }
        throw new java.lang.IllegalStateException("RetainedEffect must provide one or more 'key' parameters that define the identity of the RetainedEffect and determine when its previous effect should be disposed and a new effect started for the new key.".toString());
    }

    public static final void RetainedEffect(java.lang.Object obj, final kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(45580315, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:138)");
        }
        java.lang.Object[] objArr = {obj};
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.RetainedEffectKt.$r8$lambda$JdoCXZSZdH0BeFQu6HSFsrNlUB8(kotlin.jvm.functions.Function1.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainedEffectImpl".hashCode(), java.util.Arrays.copyOf(objArr, 1), (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(java.lang.Object obj, java.lang.Object obj2, final kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-593547589, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:190)");
        }
        java.lang.Object[] objArr = {obj, obj2};
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(function1)) || (i & 384) == 256;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.RetainedEffectKt.$r8$lambda$PHuGca6QqvgWQfn5FmRPgFG8Bw4(kotlin.jvm.functions.Function1.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainedEffectImpl".hashCode(), java.util.Arrays.copyOf(objArr, 2), (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, final kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(130977115, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:243)");
        }
        java.lang.Object[] objArr = {obj, obj2, obj3};
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(function1)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.RetainedEffectKt.$r8$lambda$X0tVzh811_5O716hMBVVEgjvF8k(kotlin.jvm.functions.Function1.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainedEffectImpl".hashCode(), java.util.Arrays.copyOf(objArr, 3), (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(java.lang.Object[] objArr, final kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(712993160, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:293)");
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainedEffectKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.RetainedEffectKt.$r8$lambda$AlzYydFrcRIUfH5vXX3VHGNy2es(kotlin.jvm.functions.Function1.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainedEffectImpl".hashCode(), java.util.Arrays.copyOf(copyOf, copyOf.length), (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static /* synthetic */ androidx.compose.runtime.retain.RetainedEffectImpl $r8$lambda$AlzYydFrcRIUfH5vXX3VHGNy2es(kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.runtime.retain.RetainedEffectImpl(function1);
    }

    public static /* synthetic */ androidx.compose.runtime.retain.RetainedEffectImpl $r8$lambda$JdoCXZSZdH0BeFQu6HSFsrNlUB8(kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.runtime.retain.RetainedEffectImpl(function1);
    }

    public static /* synthetic */ androidx.compose.runtime.retain.RetainedEffectImpl $r8$lambda$PHuGca6QqvgWQfn5FmRPgFG8Bw4(kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.runtime.retain.RetainedEffectImpl(function1);
    }

    public static /* synthetic */ androidx.compose.runtime.retain.RetainedEffectImpl $r8$lambda$X0tVzh811_5O716hMBVVEgjvF8k(kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.runtime.retain.RetainedEffectImpl(function1);
    }
}
