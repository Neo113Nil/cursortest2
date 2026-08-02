package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0002¢\u0006\u0002\u0010\u0011\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u008a\u0084\u0002"}, d2 = {"rememberComposeBitmapDescriptor", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "measureSpec", "", "renderComposableToBitmapDescriptor", "parent", "Landroid/view/ViewGroup;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "maps-compose_release", "currentContent"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberComposeBitmapDescriptorKt {
    private static final int measureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);

    public static final com.google.android.gms.maps.model.BitmapDescriptor rememberComposeBitmapDescriptor(java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1871105836, i, -1, "com.google.maps.android.compose.rememberComposeBitmapDescriptor (RememberComposeBitmapDescriptor.kt:21)");
        }
        java.lang.Object consume = composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) consume;
        androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(composer, 0);
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, composer, (i >> 3) & 14);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(4);
        spreadBuilder.add(viewGroup);
        spreadBuilder.add(rememberCompositionContext);
        spreadBuilder.add(rememberComposeBitmapDescriptor$lambda$0(rememberUpdatedState));
        spreadBuilder.addSpread(objArr);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = renderComposableToBitmapDescriptor(viewGroup, rememberCompositionContext, rememberComposeBitmapDescriptor$lambda$0(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = (com.google.android.gms.maps.model.BitmapDescriptor) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bitmapDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.android.gms.maps.model.BitmapDescriptor renderComposableToBitmapDescriptor(android.view.ViewGroup viewGroup, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        composeView.setParentCompositionContext(compositionContext);
        composeView.setContent(function2);
        androidx.compose.ui.platform.ComposeView composeView2 = composeView;
        viewGroup.addView(composeView2);
        int i = measureSpec;
        composeView.measure(i, i);
        if (composeView.getMeasuredWidth() == 0 || composeView.getMeasuredHeight() == 0) {
            throw new java.lang.IllegalStateException("The ComposeView was measured to have a width or height of zero. Make sure that the content has a non-zero size.");
        }
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        composeView.draw(new android.graphics.Canvas(createBitmap));
        viewGroup.removeView(composeView2);
        com.google.android.gms.maps.model.BitmapDescriptor fromBitmap = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(createBitmap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromBitmap, "");
        return fromBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> rememberComposeBitmapDescriptor$lambda$0(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> state) {
        return (kotlin.jvm.functions.Function2) state.getValue();
    }
}
