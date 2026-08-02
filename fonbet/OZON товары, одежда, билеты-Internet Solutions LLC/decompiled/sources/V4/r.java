package V4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes8.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f28058a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f28059b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f28060c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28061d = 0;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f28058a = true;
        f28059b = true;
        f28060c = i11 >= 28;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static ImageView a(ViewGroup viewGroup, View view, View view2) {
        boolean z11;
        boolean z12;
        int i11;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        y.g(view, matrix);
        y.h(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (f28058a) {
            z11 = !view.isAttachedToWindow();
            z12 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z11 = false;
            z12 = false;
        }
        Bitmap bitmap = null;
        boolean z13 = f28059b;
        if (z13 && z11) {
            if (z12) {
                viewGroup2 = (ViewGroup) view.getParent();
                i11 = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        i11 = 0;
        viewGroup2 = null;
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
            int round7 = Math.round(round5 * min);
            int round8 = Math.round(round6 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f28060c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round7, round8);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z13 && z11) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i11);
        }
        if (bitmap != null) {
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
