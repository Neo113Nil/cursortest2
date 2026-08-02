package org.betup.ui.fragment.home.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import io.sentry.Session;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeNavigationAdapter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00128\b\u0002\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010,\u001a\u0004\u0018\u00010'2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020'H\u0002J\u0010\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020'H\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u000204H\u0014J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u0012\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010+H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018RJ\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u000e\u0010%\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/TrapezoidSvgImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyle", "", "containerOnActionDown", "Lkotlin/Function0;", "", "containerOnActionUp", "containerOnClick", "onLayoutParamsInitialized", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "bottomWidth", "topWidth", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getContainerOnActionDown", "()Lkotlin/jvm/functions/Function0;", "setContainerOnActionDown", "(Lkotlin/jvm/functions/Function0;)V", "getContainerOnActionUp", "setContainerOnActionUp", "getContainerOnClick", "setContainerOnClick", "getOnLayoutParamsInitialized", "()Lkotlin/jvm/functions/Function2;", "setOnLayoutParamsInitialized", "(Lkotlin/jvm/functions/Function2;)V", "value", "getTopWidth", "()I", "getBottomWidth", "alphaThreshold", "bitmap", "Landroid/graphics/Bitmap;", "clickableRegion", "Landroid/graphics/Region;", "clickListener", "Landroid/view/View$OnClickListener;", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "buildClickableRegion", "bmp", "updateTrapezoidWidths", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setOnClickListener", CmcdData.STREAM_TYPE_LIVE, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrapezoidSvgImageView extends AppCompatImageView {
    public static final int $stable = 8;
    private final int alphaThreshold;
    private Bitmap bitmap;
    private int bottomWidth;
    private View.OnClickListener clickListener;
    private Region clickableRegion;
    private Function0<Unit> containerOnActionDown;
    private Function0<Unit> containerOnActionUp;
    private Function0<Unit> containerOnClick;
    private Function2<? super Integer, ? super Integer, Unit> onLayoutParamsInitialized;
    private int topWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context) {
        this(context, null, 0, null, null, null, null, 126, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, null, null, 124, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, null, null, 120, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i, Function0<Unit> containerOnActionDown) {
        this(context, attributeSet, i, containerOnActionDown, null, null, null, 112, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerOnActionDown, "containerOnActionDown");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i, Function0<Unit> containerOnActionDown, Function0<Unit> containerOnActionUp) {
        this(context, attributeSet, i, containerOnActionDown, containerOnActionUp, null, null, 96, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerOnActionDown, "containerOnActionDown");
        Intrinsics.checkNotNullParameter(containerOnActionUp, "containerOnActionUp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i, Function0<Unit> containerOnActionDown, Function0<Unit> containerOnActionUp, Function0<Unit> containerOnClick) {
        this(context, attributeSet, i, containerOnActionDown, containerOnActionUp, containerOnClick, null, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerOnActionDown, "containerOnActionDown");
        Intrinsics.checkNotNullParameter(containerOnActionUp, "containerOnActionUp");
        Intrinsics.checkNotNullParameter(containerOnClick, "containerOnClick");
    }

    public /* synthetic */ TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i, Function0 function0, Function0 function02, Function0 function03, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new Function0() { // from class: org.betup.ui.fragment.home.adapter.TrapezoidSvgImageView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0, (i2 & 16) != 0 ? new Function0() { // from class: org.betup.ui.fragment.home.adapter.TrapezoidSvgImageView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02, (i2 & 32) != 0 ? new Function0() { // from class: org.betup.ui.fragment.home.adapter.TrapezoidSvgImageView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03, (i2 & 64) != 0 ? new Function2() { // from class: org.betup.ui.fragment.home.adapter.TrapezoidSvgImageView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit _init_$lambda$3;
                _init_$lambda$3 = TrapezoidSvgImageView._init_$lambda$3(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return _init_$lambda$3;
            }
        } : function2);
    }

    public final Function0<Unit> getContainerOnActionDown() {
        return this.containerOnActionDown;
    }

    public final void setContainerOnActionDown(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.containerOnActionDown = function0;
    }

    public final Function0<Unit> getContainerOnActionUp() {
        return this.containerOnActionUp;
    }

    public final void setContainerOnActionUp(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.containerOnActionUp = function0;
    }

    public final Function0<Unit> getContainerOnClick() {
        return this.containerOnClick;
    }

    public final void setContainerOnClick(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.containerOnClick = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(int i, int i2) {
        return Unit.INSTANCE;
    }

    public final Function2<Integer, Integer, Unit> getOnLayoutParamsInitialized() {
        return this.onLayoutParamsInitialized;
    }

    public final void setOnLayoutParamsInitialized(Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onLayoutParamsInitialized = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrapezoidSvgImageView(Context context, AttributeSet attributeSet, int i, Function0<Unit> containerOnActionDown, Function0<Unit> containerOnActionUp, Function0<Unit> containerOnClick, Function2<? super Integer, ? super Integer, Unit> onLayoutParamsInitialized) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerOnActionDown, "containerOnActionDown");
        Intrinsics.checkNotNullParameter(containerOnActionUp, "containerOnActionUp");
        Intrinsics.checkNotNullParameter(containerOnClick, "containerOnClick");
        Intrinsics.checkNotNullParameter(onLayoutParamsInitialized, "onLayoutParamsInitialized");
        this.containerOnActionDown = containerOnActionDown;
        this.containerOnActionUp = containerOnActionUp;
        this.containerOnClick = containerOnClick;
        this.onLayoutParamsInitialized = onLayoutParamsInitialized;
        this.alphaThreshold = 15;
    }

    public final int getTopWidth() {
        return this.topWidth;
    }

    public final int getBottomWidth() {
        return this.bottomWidth;
    }

    private final Bitmap getBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private final void buildClickableRegion(Bitmap bmp) {
        Region region = new Region();
        Rect rect = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
        Path path = new Path();
        int height = bmp.getHeight();
        for (int i = 0; i < height; i++) {
            int width = bmp.getWidth();
            int i2 = -1;
            for (int i3 = 0; i3 < width; i3++) {
                if (((bmp.getPixel(i3, i) >> 24) & 255) > this.alphaThreshold) {
                    if (i2 == -1) {
                        i2 = i3;
                    }
                } else if (i2 != -1) {
                    path.addRect(i2, i, i3, i + 1, Path.Direction.CW);
                    i2 = -1;
                }
            }
            if (i2 != -1) {
                path.addRect(i2, i, bmp.getWidth(), i + 1, Path.Direction.CW);
            }
        }
        region.setPath(path, new Region(rect));
        this.clickableRegion = region;
        updateTrapezoidWidths(bmp);
    }

    private static final Pair<Integer, Integer> updateTrapezoidWidths$findInnerWidth(Bitmap bitmap, int i) {
        int width = bitmap.getWidth() - 1;
        int i2 = 0;
        while (i2 < bitmap.getWidth() && ((bitmap.getPixel(i2, i) >> 24) & 255) < 255) {
            i2++;
        }
        while (width >= 0 && ((bitmap.getPixel(width, i) >> 24) & 255) < 255) {
            width--;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(width));
    }

    private final void updateTrapezoidWidths(Bitmap bmp) {
        int i = 0;
        loop0: while (i < bmp.getHeight()) {
            Iterable until = RangesKt.until(0, bmp.getWidth());
            if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    if (((bmp.getPixel(((IntIterator) it).nextInt(), i) >> 24) & 255) > this.alphaThreshold) {
                        break loop0;
                    }
                }
            }
            i++;
        }
        Pair<Integer, Integer> updateTrapezoidWidths$findInnerWidth = updateTrapezoidWidths$findInnerWidth(bmp, i);
        int intValue = updateTrapezoidWidths$findInnerWidth.component1().intValue();
        int intValue2 = updateTrapezoidWidths$findInnerWidth.component2().intValue();
        this.topWidth = intValue2 >= intValue ? (intValue2 - intValue) + 1 : 0;
        int height = bmp.getHeight() - 1;
        loop2: while (height >= 0) {
            Iterable until2 = RangesKt.until(0, bmp.getWidth());
            if (!(until2 instanceof Collection) || !((Collection) until2).isEmpty()) {
                Iterator it2 = until2.iterator();
                while (it2.hasNext()) {
                    if (((bmp.getPixel(((IntIterator) it2).nextInt(), height) >> 24) & 255) > this.alphaThreshold) {
                        break loop2;
                    }
                }
            }
            height--;
        }
        Pair<Integer, Integer> updateTrapezoidWidths$findInnerWidth2 = updateTrapezoidWidths$findInnerWidth(bmp, height);
        int intValue3 = updateTrapezoidWidths$findInnerWidth2.component1().intValue();
        int intValue4 = updateTrapezoidWidths$findInnerWidth2.component2().intValue();
        int i2 = intValue4 >= intValue3 ? (intValue4 - intValue3) + 1 : 0;
        this.bottomWidth = i2;
        this.onLayoutParamsInitialized.invoke(Integer.valueOf(i2), Integer.valueOf(this.topWidth));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.bitmap == null) {
            Bitmap bitmapFromDrawable = getBitmapFromDrawable(getDrawable());
            this.bitmap = bitmapFromDrawable;
            if (bitmapFromDrawable != null) {
                buildClickableRegion(bitmapFromDrawable);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Region region;
        Region region2;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            Bitmap bitmap = this.bitmap;
            if (bitmap == null) {
                return false;
            }
            Matrix imageMatrix = getImageMatrix();
            Matrix matrix = new Matrix();
            if (imageMatrix.invert(matrix)) {
                float[] fArr = {event.getX(), event.getY()};
                matrix.mapPoints(fArr);
                int i = (int) fArr[0];
                int i2 = (int) fArr[1];
                if (i >= 0 && i < bitmap.getWidth() && i2 >= 0 && i2 < bitmap.getHeight() && (region = this.clickableRegion) != null && region.contains(i, i2)) {
                    this.containerOnActionDown.invoke();
                    return true;
                }
            }
        } else if (action == 1) {
            this.containerOnActionUp.invoke();
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 == null) {
                return false;
            }
            Matrix imageMatrix2 = getImageMatrix();
            Matrix matrix2 = new Matrix();
            if (imageMatrix2.invert(matrix2)) {
                float[] fArr2 = {event.getX(), event.getY()};
                matrix2.mapPoints(fArr2);
                int i3 = (int) fArr2[0];
                int i4 = (int) fArr2[1];
                if (i3 >= 0 && i3 < bitmap2.getWidth() && i4 >= 0 && i4 < bitmap2.getHeight() && (region2 = this.clickableRegion) != null && region2.contains(i3, i4)) {
                    View.OnClickListener onClickListener = this.clickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.containerOnClick.invoke();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        this.clickListener = l;
    }
}
