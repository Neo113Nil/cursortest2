package I1;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f623a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f624b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f625c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f626d;

    /* renamed from: e, reason: collision with root package name */
    public final I f627e;

    public j(AbstractActivityC0027d abstractActivityC0027d, boolean z3) {
        super(abstractActivityC0027d, null);
        this.f623a = false;
        this.f624b = false;
        this.f626d = false;
        I i3 = new I(new SurfaceHolderCallbackC0032i(this), this, this.f625c);
        this.f627e = i3;
        if (z3) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f626d = F2.b.z(getContext());
        getHolder().addCallback(i3);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f625c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f624b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f625c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f625c;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
        }
        this.f627e.f587e.d();
        this.f625c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c() {
        if (this.f625c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f627e.f587e.g();
        if (this.f623a) {
            e();
        }
        this.f624b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f625c;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f625c = jVar;
        this.f627e.f587e.r(jVar);
        c();
    }

    public final void e() {
        if (this.f625c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.j jVar = this.f625c;
        Surface surface = getHolder().getSurface();
        boolean z3 = this.f624b;
        if (!z3) {
            jVar.j();
        }
        jVar.f9167c = surface;
        FlutterJNI flutterJNI = jVar.f9165a;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f625c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f626d) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }
}
