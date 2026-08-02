package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "width", "height", "lottieSize", "(Landroidx/compose/ui/Modifier;II)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LottieAnimationSizeNodeKt {
    public static final androidx.compose.ui.Modifier lottieSize(androidx.compose.ui.Modifier modifier, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return modifier.then(new com.airbnb.lottie.compose.LottieAnimationSizeElement(i, i2));
    }
}
