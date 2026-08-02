package androidx.appcompat.widget;

import android.R;
import android.content.res.TypedArray;
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
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import d6.C0977k;
import h.AbstractC1174a;
import i0.C1235b;
import i0.C1238e;
import i0.C1241h;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n3.AbstractC1464a;
import w1.C1726n0;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0671x {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8753d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8754a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f8755b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8756c;

    public /* synthetic */ C0671x() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0977k) ((A1.x0) this.f8756c).f613b).getClass();
        if (keyListener instanceof C1238e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C1238e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.f8754a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f8755b;
                C1726n0 F7 = C1726n0.F(absSeekBar.getContext(), attributeSet, f8753d, i7);
                Drawable v6 = F7.v(0);
                if (v6 != null) {
                    if (v6 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) v6;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i8 = 0; i8 < numberOfFrames; i8++) {
                            Drawable e7 = e(animationDrawable.getFrame(i8), true);
                            e7.setLevel(10000);
                            animationDrawable2.addFrame(e7, animationDrawable.getDuration(i8));
                        }
                        animationDrawable2.setLevel(10000);
                        v6 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(v6);
                }
                Drawable v7 = F7.v(1);
                if (v7 != null) {
                    absSeekBar.setProgressDrawable(e(v7, false));
                }
                F7.H();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f8755b).getContext().obtainStyledAttributes(attributeSet, AbstractC1174a.j, i7, 0);
                try {
                    boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C1235b c(InputConnection inputConnection, EditorInfo editorInfo) {
        A1.x0 x0Var = (A1.x0) this.f8756c;
        if (inputConnection == null) {
            x0Var.getClass();
            inputConnection = null;
        } else {
            C0977k c0977k = (C0977k) x0Var.f613b;
            c0977k.getClass();
            if (!(inputConnection instanceof C1235b)) {
                inputConnection = new C1235b((EditText) c0977k.f12441b, inputConnection, editorInfo);
            }
        }
        return (C1235b) inputConnection;
    }

    public void d(boolean z4) {
        C1241h c1241h = (C1241h) ((C0977k) ((A1.x0) this.f8756c).f613b).f12442c;
        if (c1241h.f13827c != z4) {
            if (c1241h.f13826b != null) {
                g0.j a2 = g0.j.a();
                W0 w02 = c1241h.f13826b;
                a2.getClass();
                AbstractC1464a.i(w02, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f13023a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f13024b.remove(w02);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1241h.f13827c = z4;
            if (z4) {
                C1241h.a(c1241h.f13825a, g0.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z4) {
        if (drawable instanceof J.g) {
            ((J.h) ((J.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = e(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    layerDrawable2.setLayerGravity(i8, layerDrawable.getLayerGravity(i8));
                    layerDrawable2.setLayerWidth(i8, layerDrawable.getLayerWidth(i8));
                    layerDrawable2.setLayerHeight(i8, layerDrawable.getLayerHeight(i8));
                    layerDrawable2.setLayerInsetLeft(i8, layerDrawable.getLayerInsetLeft(i8));
                    layerDrawable2.setLayerInsetRight(i8, layerDrawable.getLayerInsetRight(i8));
                    layerDrawable2.setLayerInsetTop(i8, layerDrawable.getLayerInsetTop(i8));
                    layerDrawable2.setLayerInsetBottom(i8, layerDrawable.getLayerInsetBottom(i8));
                    layerDrawable2.setLayerInsetStart(i8, layerDrawable.getLayerInsetStart(i8));
                    layerDrawable2.setLayerInsetEnd(i8, layerDrawable.getLayerInsetEnd(i8));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f8756c) == null) {
                    this.f8756c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0671x(AbsSeekBar absSeekBar) {
        this.f8755b = absSeekBar;
    }

    public C0671x(EditText editText) {
        this.f8755b = editText;
        this.f8756c = new A1.x0(editText);
    }
}
