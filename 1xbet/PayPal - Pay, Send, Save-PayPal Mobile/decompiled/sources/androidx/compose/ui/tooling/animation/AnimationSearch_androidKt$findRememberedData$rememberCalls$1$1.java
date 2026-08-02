package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 implements kotlin.jvm.functions.Function1<androidx.compose.ui.tooling.data.Group, java.lang.Boolean> {
    public static final androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 INSTANCE = new androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Boolean invoke(androidx.compose.ui.tooling.data.Group group) {
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(group.getName(), "remember"));
    }
}
