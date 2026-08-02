package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/AppBarOverflowState;", "rememberAppBarOverflowState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/AppBarOverflowState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppBarDslKt {
    public static final androidx.compose.material3.AppBarOverflowState rememberAppBarOverflowState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(209837519, i, -1, "androidx.compose.material3.rememberAppBarOverflowState (AppBarDsl.kt:264)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.AppBarOverflowStateImpl, ?> saver = androidx.compose.material3.AppBarOverflowStateImpl.INSTANCE.getSaver();
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.AppBarDslKt.$r8$lambda$NQt8V4hAujj8vHXRh8D9EyNeeAY();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.AppBarOverflowStateImpl appBarOverflowStateImpl = (androidx.compose.material3.AppBarOverflowStateImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return appBarOverflowStateImpl;
    }

    public static /* synthetic */ androidx.compose.material3.AppBarOverflowStateImpl $r8$lambda$NQt8V4hAujj8vHXRh8D9EyNeeAY() {
        return new androidx.compose.material3.AppBarOverflowStateImpl();
    }
}
