package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "content", "Landroidx/constraintlayout/compose/MotionScene;", androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.NAME, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MotionSceneKt {
    public static final androidx.constraintlayout.compose.MotionScene MotionScene(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1620042625, i, -1, "androidx.constraintlayout.compose.MotionScene (MotionScene.kt:48)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.constraintlayout.compose.JSONMotionScene(str);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.constraintlayout.compose.JSONMotionScene jSONMotionScene = (androidx.constraintlayout.compose.JSONMotionScene) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return jSONMotionScene;
    }
}
