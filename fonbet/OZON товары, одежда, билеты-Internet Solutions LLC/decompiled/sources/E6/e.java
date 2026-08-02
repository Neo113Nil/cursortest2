package E6;

import E6.h;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.recyclerview.widget.m;
import com.github.chrisbanes.photoview.PhotoView;

/* loaded from: classes8.dex */
public final class e implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: h, reason: collision with root package name */
    private PhotoView f7555h;

    /* renamed from: i, reason: collision with root package name */
    private GestureDetector f7556i;

    /* renamed from: j, reason: collision with root package name */
    private E6.b f7557j;

    /* renamed from: p, reason: collision with root package name */
    private View.OnClickListener f7563p;

    /* renamed from: q, reason: collision with root package name */
    private View.OnLongClickListener f7564q;

    /* renamed from: r, reason: collision with root package name */
    private E6.d f7565r;

    /* renamed from: s, reason: collision with root package name */
    private d f7566s;

    /* renamed from: x, reason: collision with root package name */
    private a f7571x;

    /* renamed from: a, reason: collision with root package name */
    private AccelerateDecelerateInterpolator f7548a = new AccelerateDecelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private int f7549b = m.e.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: c, reason: collision with root package name */
    private float f7550c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f7551d = 1.75f;

    /* renamed from: e, reason: collision with root package name */
    private float f7552e = 3.0f;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7553f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7554g = false;

    /* renamed from: k, reason: collision with root package name */
    private final Matrix f7558k = new Matrix();

    /* renamed from: l, reason: collision with root package name */
    private final Matrix f7559l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private final Matrix f7560m = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    private final RectF f7561n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    private final float[] f7562o = new float[9];

    /* renamed from: t, reason: collision with root package name */
    private int f7567t = 2;

    /* renamed from: u, reason: collision with root package name */
    private int f7568u = 2;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7569v = true;

    /* renamed from: w, reason: collision with root package name */
    private ImageView.ScaleType f7570w = ImageView.ScaleType.FIT_CENTER;

    final class a implements E6.c {
        a() {
        }

        public final void a(float f7, float f11, float f12) {
            e eVar = e.this;
            if (eVar.z() < eVar.f7552e || f7 < 1.0f) {
                if (eVar.f7565r != null) {
                    eVar.f7565r.b(f7, f11, f12);
                }
                eVar.f7560m.postScale(f7, f7, f11, f12);
                eVar.r();
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7573a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f7573a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7573a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7573a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7573a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final float f7574a;

        /* renamed from: b, reason: collision with root package name */
        private final float f7575b;

        /* renamed from: c, reason: collision with root package name */
        private final long f7576c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private final float f7577d;

        /* renamed from: e, reason: collision with root package name */
        private final float f7578e;

        public c(float f7, float f11, float f12, float f13) {
            this.f7574a = f12;
            this.f7575b = f13;
            this.f7577d = f7;
            this.f7578e = f11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            float interpolation = eVar.f7548a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f7576c) * 1.0f) / eVar.f7549b));
            float f7 = this.f7578e;
            float f11 = this.f7577d;
            eVar.f7571x.a(C3143a.d(f7, f11, interpolation, f11) / eVar.z(), this.f7574a, this.f7575b);
            if (interpolation < 1.0f) {
                eVar.f7555h.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final OverScroller f7580a;

        /* renamed from: b, reason: collision with root package name */
        private int f7581b;

        /* renamed from: c, reason: collision with root package name */
        private int f7582c;

        public d(Context context) {
            this.f7580a = new OverScroller(context);
        }

        public final void a() {
            this.f7580a.forceFinished(true);
        }

        public final void b(int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            RectF t2 = e.this.t();
            if (t2 == null) {
                return;
            }
            int round = Math.round(-t2.left);
            float f7 = i11;
            if (f7 < t2.width()) {
                i16 = Math.round(t2.width() - f7);
                i15 = 0;
            } else {
                i15 = round;
                i16 = i15;
            }
            int round2 = Math.round(-t2.top);
            float f11 = i12;
            if (f11 < t2.height()) {
                i18 = Math.round(t2.height() - f11);
                i17 = 0;
            } else {
                i17 = round2;
                i18 = i17;
            }
            this.f7581b = round;
            this.f7582c = round2;
            if (round == i16 && round2 == i18) {
                return;
            }
            this.f7580a.fling(round, round2, i13, i14, i15, i16, i17, i18, 0, 0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f7580a;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                e eVar = e.this;
                eVar.f7560m.postTranslate(this.f7581b - currX, this.f7582c - currY);
                eVar.r();
                this.f7581b = currX;
                this.f7582c = currY;
                eVar.f7555h.postOnAnimation(this);
            }
        }
    }

    public e(PhotoView photoView) {
        a aVar = new a();
        this.f7571x = aVar;
        this.f7555h = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.f7557j = new E6.b(photoView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new f(this));
        this.f7556i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new g(this));
    }

    private void N(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.f7555h;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f7558k;
        matrix.reset();
        float f7 = intrinsicWidth;
        float f11 = width / f7;
        float f12 = intrinsicHeight;
        float f13 = height / f12;
        ImageView.ScaleType scaleType = this.f7570w;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f7) / 2.0f, (height - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f11, f13);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f7 * max)) / 2.0f, (height - (f12 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f11, f13));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f7 * min)) / 2.0f, (height - (f12 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f7, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f7);
            }
            int i11 = b.f7573a[this.f7570w.ordinal()];
            if (i11 == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i11 == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i11 == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i11 == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f7560m;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        r();
        this.f7555h.setImageMatrix(u());
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (s()) {
            this.f7555h.setImageMatrix(u());
        }
    }

    private boolean s() {
        RectF rectF;
        float f7;
        float f11;
        float f12;
        float f13;
        float f14;
        Matrix u11 = u();
        float f15 = 0.0f;
        if (this.f7555h.getDrawable() != null) {
            rectF = this.f7561n;
            rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            u11.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float height = rectF.height();
        float width = rectF.width();
        PhotoView photoView = this.f7555h;
        float height2 = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (height <= height2) {
            int i11 = b.f7573a[this.f7570w.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f13 = (height2 - height) / 2.0f;
                    f14 = rectF.top;
                } else {
                    f13 = height2 - height;
                    f14 = rectF.top;
                }
                f7 = f13 - f14;
            } else {
                f7 = -rectF.top;
            }
            this.f7568u = 2;
        } else {
            float f16 = rectF.top;
            if (f16 > 0.0f) {
                this.f7568u = 0;
                f7 = -f16;
            } else {
                float f17 = rectF.bottom;
                if (f17 < height2) {
                    this.f7568u = 1;
                    f7 = height2 - f17;
                } else {
                    this.f7568u = -1;
                    f7 = 0.0f;
                }
            }
        }
        float width2 = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (width <= width2) {
            int i12 = b.f7573a[this.f7570w.ordinal()];
            if (i12 != 2) {
                if (i12 != 3) {
                    f11 = (width2 - width) / 2.0f;
                    f12 = rectF.left;
                } else {
                    f11 = width2 - width;
                    f12 = rectF.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectF.left;
            }
            this.f7567t = 2;
        } else {
            float f18 = rectF.left;
            if (f18 > 0.0f) {
                this.f7567t = 0;
                f15 = -f18;
            } else {
                float f19 = rectF.right;
                if (f19 < width2) {
                    f15 = width2 - f19;
                    this.f7567t = 1;
                } else {
                    this.f7567t = -1;
                }
            }
        }
        this.f7560m.postTranslate(f15, f7);
        return true;
    }

    private Matrix u() {
        Matrix matrix = this.f7559l;
        matrix.set(this.f7558k);
        matrix.postConcat(this.f7560m);
        return matrix;
    }

    public final ImageView.ScaleType A() {
        return this.f7570w;
    }

    public final void B(Matrix matrix) {
        matrix.set(this.f7560m);
    }

    public final boolean C(Matrix matrix) {
        if (this.f7555h.getDrawable() == null) {
            return false;
        }
        this.f7560m.set(matrix);
        r();
        return true;
    }

    public final void D(float f7) {
        h.a(this.f7550c, this.f7551d, f7);
        this.f7552e = f7;
    }

    public final void E(float f7) {
        h.a(this.f7550c, f7, this.f7552e);
        this.f7551d = f7;
    }

    public final void F() {
        h.a(1.0f, this.f7551d, this.f7552e);
        this.f7550c = 1.0f;
    }

    public final void G(View.OnClickListener onClickListener) {
        this.f7563p = onClickListener;
    }

    public final void H(View.OnLongClickListener onLongClickListener) {
        this.f7564q = onLongClickListener;
    }

    public final void I(E6.d dVar) {
        this.f7565r = dVar;
    }

    public final void J(float f7) {
        PhotoView photoView = this.f7555h;
        K(f7, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    public final void K(float f7, float f11, float f12, boolean z11) {
        if (f7 < this.f7550c || f7 > this.f7552e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z11) {
            this.f7555h.post(new c(z(), f7, f11, f12));
        } else {
            this.f7560m.setScale(f7, f7, f11, f12);
            r();
        }
    }

    public final void L(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return;
        }
        if (h.a.f7586a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != this.f7570w) {
            this.f7570w = scaleType;
            M();
        }
    }

    public final void M() {
        if (this.f7569v) {
            N(this.f7555h.getDrawable());
            return;
        }
        Matrix matrix = this.f7560m;
        matrix.reset();
        matrix.postRotate(0.0f);
        r();
        this.f7555h.setImageMatrix(u());
        s();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        N(this.f7555h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        E6.b bVar;
        GestureDetector gestureDetector;
        RectF t2;
        boolean z12 = false;
        if (!this.f7569v || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            d dVar = this.f7566s;
            if (dVar != null) {
                dVar.a();
                this.f7566s = null;
            }
        } else if (action == 1 || action == 3) {
            if (z() < this.f7550c) {
                RectF t11 = t();
                if (t11 != null) {
                    view.post(new c(z(), this.f7550c, t11.centerX(), t11.centerY()));
                    z11 = true;
                }
            } else if (z() > this.f7552e && (t2 = t()) != null) {
                view.post(new c(z(), this.f7552e, t2.centerX(), t2.centerY()));
                z11 = true;
            }
            bVar = this.f7557j;
            if (bVar != null) {
                boolean c11 = bVar.c();
                boolean b11 = bVar.b();
                bVar.d(motionEvent);
                boolean z13 = (c11 || bVar.c()) ? false : true;
                boolean z14 = (b11 || bVar.b()) ? false : true;
                if (z13 && z14) {
                    z12 = true;
                }
                this.f7554g = z12;
                z11 = true;
            }
            gestureDetector = this.f7556i;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z11;
        }
        z11 = false;
        bVar = this.f7557j;
        if (bVar != null) {
        }
        gestureDetector = this.f7556i;
        if (gestureDetector == null) {
        }
        return z11;
    }

    public final RectF t() {
        s();
        Matrix u11 = u();
        if (this.f7555h.getDrawable() == null) {
            return null;
        }
        RectF rectF = this.f7561n;
        rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
        u11.mapRect(rectF);
        return rectF;
    }

    public final Matrix v() {
        return this.f7559l;
    }

    public final float w() {
        return this.f7552e;
    }

    public final float x() {
        return this.f7551d;
    }

    public final float y() {
        return this.f7550c;
    }

    public final float z() {
        Matrix matrix = this.f7560m;
        float[] fArr = this.f7562o;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }
}
