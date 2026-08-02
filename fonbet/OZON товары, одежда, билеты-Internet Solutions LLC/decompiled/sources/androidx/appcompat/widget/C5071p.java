package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C5071p {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f37962c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final AbsSeekBar f37963a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f37964b;

    C5071p(AbsSeekBar absSeekBar) {
        this.f37963a = absSeekBar;
    }

    final Bitmap a() {
        return this.f37964b;
    }

    void b(AttributeSet attributeSet, int i11) {
        AbsSeekBar absSeekBar = this.f37963a;
        b0 v11 = b0.v(absSeekBar.getContext(), attributeSet, f37962c, i11, 0);
        Drawable h11 = v11.h(0);
        if (h11 != null) {
            if (h11 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h11;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i12 = 0; i12 < numberOfFrames; i12++) {
                    Drawable c11 = c(animationDrawable.getFrame(i12), true);
                    c11.setLevel(10000);
                    animationDrawable2.addFrame(c11, animationDrawable.getDuration(i12));
                }
                animationDrawable2.setLevel(10000);
                h11 = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(h11);
        }
        Drawable h12 = v11.h(1);
        if (h12 != null) {
            absSeekBar.setProgressDrawable(c(h12, false));
        }
        v11.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Drawable c(Drawable drawable, boolean z11) {
        if (drawable instanceof androidx.core.graphics.drawable.f) {
            androidx.core.graphics.drawable.f fVar = (androidx.core.graphics.drawable.f) drawable;
            Drawable b11 = fVar.b();
            if (b11 != null) {
                fVar.a(c(b11, z11));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    int id2 = layerDrawable.getId(i11);
                    drawableArr[i11] = c(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    layerDrawable2.setId(i12, layerDrawable.getId(i12));
                    layerDrawable2.setLayerGravity(i12, layerDrawable.getLayerGravity(i12));
                    layerDrawable2.setLayerWidth(i12, layerDrawable.getLayerWidth(i12));
                    layerDrawable2.setLayerHeight(i12, layerDrawable.getLayerHeight(i12));
                    layerDrawable2.setLayerInsetLeft(i12, layerDrawable.getLayerInsetLeft(i12));
                    layerDrawable2.setLayerInsetRight(i12, layerDrawable.getLayerInsetRight(i12));
                    layerDrawable2.setLayerInsetTop(i12, layerDrawable.getLayerInsetTop(i12));
                    layerDrawable2.setLayerInsetBottom(i12, layerDrawable.getLayerInsetBottom(i12));
                    layerDrawable2.setLayerInsetStart(i12, layerDrawable.getLayerInsetStart(i12));
                    layerDrawable2.setLayerInsetEnd(i12, layerDrawable.getLayerInsetEnd(i12));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f37964b == null) {
                    this.f37964b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
