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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p155w1.C1017n0;

/* JADX INFO: renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0650x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8753d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8754a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f8755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8756c;

    public /* synthetic */ C0650x() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((p028d6.k) ((A1.x0) this.f8756c).f613b).getClass();
        if (keyListener instanceof p059i0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p059i0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.f8754a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f8755b;
                C1017n0 c1017n0F = C1017n0.F(absSeekBar.getContext(), attributeSet, f8753d, i7);
                Drawable drawableV = c1017n0F.v(0);
                if (drawableV != null) {
                    if (drawableV instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableV;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i8 = 0; i8 < numberOfFrames; i8++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i8), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i8));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableV = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableV);
                }
                Drawable drawableV2 = c1017n0F.v(1);
                if (drawableV2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableV2, false));
                }
                c1017n0F.H();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f8755b).getContext().obtainStyledAttributes(attributeSet, p051h.a.j, i7, 0);
                try {
                    boolean z4 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z4 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public p059i0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        A1.x0 x0Var = (A1.x0) this.f8756c;
        if (inputConnection == null) {
            x0Var.getClass();
            inputConnection = null;
        } else {
            p028d6.k kVar = (p028d6.k) x0Var.f613b;
            kVar.getClass();
            if (!(inputConnection instanceof p059i0.b)) {
                inputConnection = new p059i0.b((EditText) kVar.f12447b, inputConnection, editorInfo);
            }
        }
        return (p059i0.b) inputConnection;
    }

    public void d(boolean z4) {
        p059i0.h hVar = (p059i0.h) ((p028d6.k) ((A1.x0) this.f8756c).f613b).f12448c;
        if (hVar.f13833c != z4) {
            if (hVar.f13832b != null) {
                p046g0.j jVarA = p046g0.j.a();
                W0 w7 = hVar.f13832b;
                jVarA.getClass();
                p097n3.a.i(w7, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f13029a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f13030b.remove(w7);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            hVar.f13833c = z4;
            if (z4) {
                p059i0.h.a(hVar.f13831a, p046g0.j.a().b());
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

    public C0650x(AbsSeekBar absSeekBar) {
        this.f8755b = absSeekBar;
    }

    public C0650x(EditText editText) {
        this.f8755b = editText;
        this.f8756c = new A1.x0(editText);
    }
}
