package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class y extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7674a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    public final java.lang.Object a(android.view.MotionEvent motionEvent, com.moloco.sdk.internal.services.s sVar, java.lang.String str, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, com.moloco.sdk.internal.w wVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object a2;
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(kotlin.collections.ArraysKt.first(iArr), kotlin.collections.ArraysKt.last(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + kotlin.collections.ArraysKt.first(iArr)), (int) (motionEvent.getY() + kotlin.collections.ArraysKt.last(iArr)));
            if (str != null) {
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.moloco.sdk.internal.w.a.a(wVar, str, java.lang.System.currentTimeMillis(), null, 4, null));
            }
            if (str2 != null && (a2 = sVar.a(str2, aVar, hVar, mutableSharedFlow, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return a2;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
