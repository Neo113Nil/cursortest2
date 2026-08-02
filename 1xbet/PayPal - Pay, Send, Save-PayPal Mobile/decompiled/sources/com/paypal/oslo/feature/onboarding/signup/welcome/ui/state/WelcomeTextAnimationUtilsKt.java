package com.paypal.oslo.feature.onboarding.signup.welcome.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "opacity", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "onMeasured", "welcomeTextModifier", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeTextAnimationUtilsKt {
    public static final androidx.compose.ui.Modifier welcomeTextModifier(androidx.compose.ui.Modifier modifier, float f, final androidx.compose.ui.unit.Density density, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(androidx.compose.ui.draw.AlphaKt.alpha(modifier, f), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextAnimationUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeTextAnimationUtilsKt.$r8$lambda$BQFcbZdTkuvysj_TRCjQogd07t0(androidx.compose.ui.unit.Density.this, function1, (androidx.compose.ui.unit.IntSize) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BQFcbZdTkuvysj_TRCjQogd07t0(androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.unit.IntSize intSize) {
        float mo1415toDpu2uoSUM = density.mo1415toDpu2uoSUM((int) (intSize.m8776unboximpl() >> 32));
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(mo1415toDpu2uoSUM));
        }
        return kotlin.Unit.INSTANCE;
    }
}
