package androidx.camera.view;

import C.S;
import C.s0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: i, reason: collision with root package name */
    private static final PreviewView.d f38534i = PreviewView.d.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    private Size f38535a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f38536b;

    /* renamed from: c, reason: collision with root package name */
    private int f38537c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f38538d;

    /* renamed from: e, reason: collision with root package name */
    private int f38539e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38540f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38541g;

    /* renamed from: h, reason: collision with root package name */
    private PreviewView.d f38542h = f38534i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38543a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f38543a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38543a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38543a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38543a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38543a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38543a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    g() {
    }

    private Size b() {
        return G.r.c(this.f38537c) ? new Size(this.f38536b.height(), this.f38536b.width()) : new Size(this.f38536b.width(), this.f38536b.height());
    }

    private boolean e() {
        return (this.f38536b == null || this.f38535a == null || !(!this.f38541g || this.f38539e != -1)) ? false : true;
    }

    final Matrix a(Size size, int i11, Rect rect) {
        Matrix matrix = null;
        if (!e()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (e()) {
            matrix = new Matrix(this.f38538d);
            matrix.postConcat(d(size, i11));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    final PreviewView.d c() {
        return this.f38542h;
    }

    final Matrix d(Size size, int i11) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        x2.i.f(null, e());
        if (G.r.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size b11 = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, b11.getWidth(), b11.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.d dVar = this.f38542h;
            switch (a.f38543a[dVar.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    S.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i11 == 1) {
                float width = size.getWidth() / 2.0f;
                float f7 = width + width;
                rectF = new RectF(f7 - rectF3.right, rectF3.top, f7 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix a11 = G.r.a(new RectF(this.f38536b), rectF, this.f38537c, false);
        if (this.f38540f && this.f38541g) {
            if (G.r.c(this.f38537c)) {
                a11.preScale(1.0f, -1.0f, this.f38536b.centerX(), this.f38536b.centerY());
                return a11;
            }
            a11.preScale(-1.0f, 1.0f, this.f38536b.centerX(), this.f38536b.centerY());
        }
        return a11;
    }

    final void f(int i11, int i12) {
        if (this.f38541g) {
            this.f38537c = i11;
            this.f38539e = i12;
        }
    }

    final void g(PreviewView.d dVar) {
        this.f38542h = dVar;
    }

    final void h(@NonNull s0.d dVar, Size size, boolean z11) {
        S.a("PreviewTransform", "Transformation info set: " + dVar + " " + size + " " + z11);
        this.f38536b = dVar.a();
        this.f38537c = dVar.b();
        this.f38539e = dVar.d();
        this.f38535a = size;
        this.f38540f = z11;
        this.f38541g = dVar.e();
        this.f38538d = dVar.c();
    }

    final void i(Size size, int i11, @NonNull View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            S.k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (e()) {
            boolean z11 = false;
            if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                x2.i.f(null, e());
                RectF rectF = new RectF(0.0f, 0.0f, this.f38535a.getWidth(), this.f38535a.getHeight());
                textureView.setTransform(G.r.a(rectF, rectF, !this.f38541g ? this.f38537c : -G.c.f(this.f38539e), false));
            } else {
                Display display = view.getDisplay();
                boolean z12 = (!this.f38541g || display == null || display.getRotation() == this.f38539e) ? false : true;
                boolean z13 = this.f38541g;
                if (!z13) {
                    if ((!z13 ? this.f38537c : -G.c.f(this.f38539e)) != 0) {
                        z11 = true;
                    }
                }
                if (z12 || z11) {
                    S.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            x2.i.f(null, e());
            Matrix d11 = d(size, i11);
            RectF rectF2 = new RectF(0.0f, 0.0f, this.f38535a.getWidth(), this.f38535a.getHeight());
            d11.mapRect(rectF2);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectF2.width() / this.f38535a.getWidth());
            view.setScaleY(rectF2.height() / this.f38535a.getHeight());
            view.setTranslationX(rectF2.left - view.getLeft());
            view.setTranslationY(rectF2.top - view.getTop());
        }
    }
}
