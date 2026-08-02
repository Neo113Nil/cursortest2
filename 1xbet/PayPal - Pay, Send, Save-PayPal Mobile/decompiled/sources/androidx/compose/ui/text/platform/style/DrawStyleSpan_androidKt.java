package androidx.compose.ui.text.platform.style;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/StrokeJoin;", "Landroid/graphics/Paint$Join;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "toAndroidJoin", "Landroidx/compose/ui/graphics/StrokeCap;", "Landroid/graphics/Paint$Cap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidCap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final android.graphics.Paint.Join m8306toAndroidJoinWw9F2mQ(int i) {
        return androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8()) ? android.graphics.Paint.Join.MITER : androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6352getRoundLxFBmk8()) ? android.graphics.Paint.Join.ROUND : androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(i, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8()) ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final android.graphics.Paint.Cap m8305toAndroidCapBeK7IIE(int i) {
        return androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) ? android.graphics.Paint.Cap.BUTT : androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw()) ? android.graphics.Paint.Cap.ROUND : androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw()) ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.BUTT;
    }
}
