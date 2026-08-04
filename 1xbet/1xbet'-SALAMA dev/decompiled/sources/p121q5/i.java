package p121q5;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.m;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends SurfaceView implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f15910d;

    public i(c cVar, boolean z4) {
        super(cVar, null);
        this.f15907a = false;
        this.f15908b = false;
        h hVar = new h(this);
        this.f15910d = new d(this, 1);
        if (z4) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(hVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(k kVar) {
        k kVar2 = this.f15909c;
        if (kVar2 != null) {
            kVar2.g();
            this.f15909c.f14112a.removeIsDisplayingFlutterUiListener(this.f15910d);
        }
        this.f15909c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15909c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            k kVar = this.f15909c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
        }
        setAlpha(0.0f);
        this.f15909c.f14112a.removeIsDisplayingFlutterUiListener(this.f15910d);
        this.f15909c = null;
    }

    public final void c() {
        if (this.f15909c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        k kVar = this.f15909c;
        Surface surface = getHolder().getSurface();
        boolean z4 = this.f15908b;
        if (!z4) {
            kVar.g();
        }
        kVar.f14114c = surface;
        FlutterJNI flutterJNI = kVar.f14112a;
        if (z4) {
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
        int i7 = iArr[0];
        region.op(i7, iArr[1], (getRight() + i7) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public k getAttachedRenderer() {
        return this.f15909c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f15909c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f15908b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        k kVar = this.f15909c;
        if (kVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = kVar.f14112a;
        d dVar = this.f15910d;
        flutterJNI.addIsDisplayingFlutterUiListener(dVar);
        if (kVar.f14115d) {
            dVar.b();
        }
        if (this.f15907a) {
            c();
        }
        this.f15908b = false;
    }
}
