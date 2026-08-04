package p153v5;

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

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f17211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17216f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p121q5.a f17217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f17218y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f17219z;

    public a(Activity activity, float f7, p121q5.a aVar) {
        super(activity, null);
        this.f17212b = f7;
        this.f17217x = aVar;
        this.f17218y = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f17211a.getFinalMatrix());
        float f7 = this.f17212b;
        matrix.preScale(1.0f / f7, 1.0f / f7);
        matrix.postTranslate(-this.f17213c, -this.f17214d);
        return matrix;
    }

    public final void a() {
        j jVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (jVar = this.f17219z) == null) {
            return;
        }
        this.f17219z = null;
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
        Iterator<Path> it = this.f17211a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f17213c, -this.f17214d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f17211a.getFinalOpacity() * 255.0f);
        Paint paint = this.f17218y;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f17211a.getFinalOpacity() * 255.0f));
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
        p121q5.a aVar = this.f17217x;
        if (aVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i7 = this.f17213c;
            this.f17215e = i7;
            int i8 = this.f17214d;
            this.f17216f = i8;
            matrix.postTranslate(i7, i8);
        } else if (action != 2) {
            matrix.postTranslate(this.f17213c, this.f17214d);
        } else {
            matrix.postTranslate(this.f17215e, this.f17216f);
            this.f17215e = this.f17213c;
            this.f17216f = this.f17214d;
        }
        aVar.d(motionEvent, matrix);
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
        if (viewTreeObserver.isAlive() && this.f17219z == null) {
            j jVar = new j(onFocusChangeListener, this);
            this.f17219z = jVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(jVar);
        }
    }
}
