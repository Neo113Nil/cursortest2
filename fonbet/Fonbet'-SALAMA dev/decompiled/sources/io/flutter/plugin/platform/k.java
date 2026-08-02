package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import q5.C1557a;

/* loaded from: classes2.dex */
public final class k extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f14151a;

    /* renamed from: b, reason: collision with root package name */
    public int f14152b;

    /* renamed from: c, reason: collision with root package name */
    public int f14153c;

    /* renamed from: d, reason: collision with root package name */
    public int f14154d;

    /* renamed from: e, reason: collision with root package name */
    public C1557a f14155e;

    /* renamed from: f, reason: collision with root package name */
    public i f14156f;

    /* renamed from: x, reason: collision with root package name */
    public j f14157x;

    public k(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar = this.f14156f;
        if (iVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = iVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f14156f.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f14157x;
    }

    public int getRenderTargetHeight() {
        i iVar = this.f14156f;
        if (iVar != null) {
            return iVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        i iVar = this.f14156f;
        if (iVar != null) {
            return iVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14155e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i7 = this.f14153c;
            this.f14151a = i7;
            int i8 = this.f14154d;
            this.f14152b = i8;
            matrix.postTranslate(i7, i8);
        } else if (action != 2) {
            matrix.postTranslate(this.f14153c, this.f14154d);
        } else {
            matrix.postTranslate(this.f14151a, this.f14152b);
            this.f14151a = this.f14153c;
            this.f14152b = this.f14154d;
        }
        this.f14155e.d(motionEvent, matrix);
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

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f14153c = layoutParams.leftMargin;
        this.f14154d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        j jVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (jVar = this.f14157x) != null) {
            this.f14157x = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(jVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f14157x == null) {
            j jVar2 = new j(this, onFocusChangeListener);
            this.f14157x = jVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(jVar2);
        }
    }

    public void setTouchProcessor(C1557a c1557a) {
        this.f14155e = c1557a;
    }
}
