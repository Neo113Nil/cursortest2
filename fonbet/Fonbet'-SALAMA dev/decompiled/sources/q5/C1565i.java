package q5;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: q5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1565i extends SurfaceView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15901a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15902b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f15903c;

    /* renamed from: d, reason: collision with root package name */
    public final C1560d f15904d;

    public C1565i(AbstractActivityC1559c abstractActivityC1559c, boolean z4) {
        super(abstractActivityC1559c, null);
        this.f15901a = false;
        this.f15902b = false;
        SurfaceHolderCallbackC1564h surfaceHolderCallbackC1564h = new SurfaceHolderCallbackC1564h(this);
        this.f15904d = new C1560d(this, 1);
        if (z4) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(surfaceHolderCallbackC1564h);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        io.flutter.embedding.engine.renderer.k kVar2 = this.f15903c;
        if (kVar2 != null) {
            kVar2.g();
            this.f15903c.f14106a.removeIsDisplayingFlutterUiListener(this.f15904d);
        }
        this.f15903c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15903c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.k kVar = this.f15903c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
        }
        setAlpha(0.0f);
        this.f15903c.f14106a.removeIsDisplayingFlutterUiListener(this.f15904d);
        this.f15903c = null;
    }

    public final void c() {
        if (this.f15903c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.k kVar = this.f15903c;
        Surface surface = getHolder().getSurface();
        boolean z4 = this.f15902b;
        if (!z4) {
            kVar.g();
        }
        kVar.f14108c = surface;
        FlutterJNI flutterJNI = kVar.f14106a;
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
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f15903c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f15903c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f15902b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        io.flutter.embedding.engine.renderer.k kVar = this.f15903c;
        if (kVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = kVar.f14106a;
        C1560d c1560d = this.f15904d;
        flutterJNI.addIsDisplayingFlutterUiListener(c1560d);
        if (kVar.f14109d) {
            c1560d.b();
        }
        if (this.f15901a) {
            c();
        }
        this.f15902b = false;
    }
}
