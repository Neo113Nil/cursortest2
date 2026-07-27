package O1;

import I1.C0024a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f1067a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1068b;

    /* renamed from: c, reason: collision with root package name */
    public int f1069c;

    /* renamed from: d, reason: collision with root package name */
    public int f1070d;

    /* renamed from: e, reason: collision with root package name */
    public final C0024a f1071e;
    public final Paint f;

    /* renamed from: g, reason: collision with root package name */
    public a f1072g;

    public b(Activity activity, float f, C0024a c0024a) {
        super(activity, null);
        this.f1068b = f;
        this.f1071e = c0024a;
        this.f = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f1067a.getFinalMatrix());
        float f = this.f1068b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.f1069c, -this.f1070d);
        return matrix;
    }

    public final void a() {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (aVar = this.f1072g) == null) {
            return;
        }
        this.f1072g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f1067a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f1069c, -this.f1070d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f1067a.getFinalOpacity() * 255.0f);
        Paint paint = this.f;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f1067a.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0024a c0024a = this.f1071e;
        if (c0024a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        c0024a.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f1072g == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.f1072g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
