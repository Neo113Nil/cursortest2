package com.paypal.oslo.feature.moneymovement.ui.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a@\u0010\u0010\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "condition", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ShowIf", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ifTrue", "ifFalse", "ShowIfElse", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function1;", "ShowIfNotNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConditionalComposableKt {
    public static final void ShowIf(boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (z) {
            composer.startReplaceGroup(-1373992718);
            function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1373968693);
            composer.endReplaceGroup();
        }
    }

    public static final void ShowIfElse(boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        if (z) {
            composer.startReplaceGroup(-221991941);
            function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-221962150);
            function22.invoke(composer, java.lang.Integer.valueOf((i >> 6) & 14));
            composer.endReplaceGroup();
        }
    }

    public static final <T> void ShowIfNotNull(T t, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        if (t == null) {
            composer.startReplaceGroup(-1165929056);
        } else {
            composer.startReplaceGroup(-1165929055);
            function3.invoke(t, composer, java.lang.Integer.valueOf(i & 120));
        }
        composer.endReplaceGroup();
    }
}
