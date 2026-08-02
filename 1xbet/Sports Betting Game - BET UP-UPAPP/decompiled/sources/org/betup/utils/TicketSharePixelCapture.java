package org.betup.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TicketSharePixelCapture.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0012JN\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lorg/betup/utils/TicketSharePixelCapture;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "captureToBitmap", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pixelCopyWindow", "Landroid/view/Window;", "expandLeftPx", "", "expandTopPx", "expandRightPx", "expandBottomPx", "onResult", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "captureWindowRegion", "window", "bounds", "Landroidx/compose/ui/geometry/Rect;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TicketSharePixelCapture {
    public static final int $stable = 0;
    public static final TicketSharePixelCapture INSTANCE = new TicketSharePixelCapture();

    private TicketSharePixelCapture() {
    }

    public final void captureToBitmap(FragmentActivity activity, LayoutCoordinates layoutCoordinates, Window pixelCopyWindow, int expandLeftPx, int expandTopPx, int expandRightPx, int expandBottomPx, Function1<? super Bitmap, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!layoutCoordinates.isAttached()) {
            onResult.invoke(null);
            return;
        }
        Window window = pixelCopyWindow == null ? activity.getWindow() : pixelCopyWindow;
        Intrinsics.checkNotNull(window);
        captureWindowRegion(window, LayoutCoordinatesKt.boundsInWindow(layoutCoordinates), expandLeftPx, expandTopPx, expandRightPx, expandBottomPx, onResult);
    }

    private final void captureWindowRegion(Window window, Rect bounds, int expandLeftPx, int expandTopPx, int expandRightPx, int expandBottomPx, final Function1<? super Bitmap, Unit> onResult) {
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        if (width <= 0 || height <= 0) {
            onResult.invoke(null);
            return;
        }
        int roundToInt = MathKt.roundToInt(bounds.getLeft()) - expandLeftPx;
        int roundToInt2 = MathKt.roundToInt(bounds.getTop()) - expandTopPx;
        int roundToInt3 = MathKt.roundToInt(bounds.getRight()) + expandRightPx;
        int roundToInt4 = MathKt.roundToInt(bounds.getBottom()) + expandBottomPx;
        int coerceIn = RangesKt.coerceIn(roundToInt, 0, width - 1);
        int coerceIn2 = RangesKt.coerceIn(roundToInt2, 0, height - 1);
        int coerceIn3 = RangesKt.coerceIn(roundToInt3, coerceIn + 1, width);
        int coerceIn4 = RangesKt.coerceIn(roundToInt4, coerceIn2 + 1, height);
        int i = coerceIn3 - coerceIn;
        int i2 = coerceIn4 - coerceIn2;
        if (i <= 0 || i2 <= 0) {
            onResult.invoke(null);
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        PixelCopy.request(window, new android.graphics.Rect(coerceIn, coerceIn2, coerceIn3, coerceIn4), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.betup.utils.TicketSharePixelCapture$$ExternalSyntheticLambda0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                TicketSharePixelCapture.captureWindowRegion$lambda$0(createBitmap, onResult, i3);
            }
        }, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureWindowRegion$lambda$0(Bitmap bitmap, Function1 function1, int i) {
        if (i != 0) {
            bitmap.recycle();
            function1.invoke(null);
        } else {
            function1.invoke(bitmap);
        }
    }
}
