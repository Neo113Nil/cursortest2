package v5;

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
import io.flutter.plugin.platform.j;
import java.util.Iterator;
import q5.C1557a;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1667a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f17205a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17206b;

    /* renamed from: c, reason: collision with root package name */
    public int f17207c;

    /* renamed from: d, reason: collision with root package name */
    public int f17208d;

    /* renamed from: e, reason: collision with root package name */
    public int f17209e;

    /* renamed from: f, reason: collision with root package name */
    public int f17210f;

    /* renamed from: x, reason: collision with root package name */
    public final C1557a f17211x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f17212y;

    /* renamed from: z, reason: collision with root package name */
    public j f17213z;

    public C1667a(Activity activity, float f7, C1557a c1557a) {
        super(activity, null);
        this.f17206b = f7;
        this.f17211x = c1557a;
        this.f17212y = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f17205a.getFinalMatrix());
        float f7 = this.f17206b;
        matrix.preScale(1.0f / f7, 1.0f / f7);
        matrix.postTranslate(-this.f17207c, -this.f17208d);
        return matrix;
    }

    public final void a() {
        j jVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (jVar = this.f17213z) == null) {
            return;
        }
        this.f17213z = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(jVar);
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
        Iterator<Path> it = this.f17205a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f17207c, -this.f17208d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f17205a.getFinalOpacity() * 255.0f);
        Paint paint = this.f17212y;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f17205a.getFinalOpacity() * 255.0f));
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
        C1557a c1557a = this.f17211x;
        if (c1557a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i7 = this.f17207c;
            this.f17209e = i7;
            int i8 = this.f17208d;
            this.f17210f = i8;
            matrix.postTranslate(i7, i8);
        } else if (action != 2) {
            matrix.postTranslate(this.f17207c, this.f17208d);
        } else {
            matrix.postTranslate(this.f17209e, this.f17210f);
            this.f17209e = this.f17207c;
            this.f17210f = this.f17208d;
        }
        c1557a.d(motionEvent, matrix);
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
        if (viewTreeObserver.isAlive() && this.f17213z == null) {
            j jVar = new j(onFocusChangeListener, this);
            this.f17213z = jVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(jVar);
        }
    }
}
