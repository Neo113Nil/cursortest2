package F;

import a.AbstractC0018a;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f100a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f101b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f102c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f103d;

    /* renamed from: e, reason: collision with root package name */
    public final S f104e;

    public C0014o(AbstractActivityC0005f abstractActivityC0005f, boolean z2) {
        super(abstractActivityC0005f, null);
        this.f100a = false;
        this.f101b = false;
        this.f103d = false;
        S s2 = new S(new SurfaceHolderCallbackC0013n(this), this, this.f102c);
        this.f104e = s2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f103d = AbstractC0018a.o(getContext());
        getHolder().addCallback(s2);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f102c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f102c = hVar;
        Q q2 = this.f104e.f62e;
        switch (q2.f56a) {
            case 0:
                q2.f57b.f59b = hVar;
                break;
            default:
                S s2 = q2.f57b;
                io.flutter.embedding.engine.renderer.h hVar3 = s2.f59b;
                if (hVar3 != null) {
                    hVar3.c(s2.f61d);
                }
                s2.f59b = hVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f102c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f101b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f102c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f102c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
        }
        Q q2 = this.f104e.f62e;
        switch (q2.f56a) {
            case 0:
                q2.f57b.f59b = null;
                break;
            default:
                S s2 = q2.f57b;
                s2.f58a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.h hVar2 = s2.f59b;
                if (hVar2 != null) {
                    hVar2.c(s2.f61d);
                }
                s2.f59b = null;
                break;
        }
        this.f102c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f102c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        Q q2 = this.f104e.f62e;
        switch (q2.f56a) {
            case 0:
                break;
            default:
                S s2 = q2.f57b;
                io.flutter.embedding.engine.renderer.h hVar = s2.f59b;
                if (hVar != null) {
                    hVar.a(s2.f61d);
                    break;
                }
                break;
        }
        if (this.f100a) {
            e();
        }
        this.f101b = false;
    }

    public final void e() {
        if (this.f102c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f102c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f101b;
        FlutterJNI flutterJNI = hVar.f593a;
        if (!z2) {
            hVar.e();
        }
        hVar.f594b = surface;
        if (z2) {
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
        int i2 = iArr[0];
        region.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f102c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f103d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
