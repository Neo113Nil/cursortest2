package s0;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6534a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6535b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f6536c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6537d;

    /* renamed from: e, reason: collision with root package name */
    public final SurfaceHolderCallback2C0832B f6538e;

    public j(d dVar, boolean z2) {
        super(dVar, null);
        this.f6534a = false;
        this.f6535b = false;
        this.f6537d = false;
        SurfaceHolderCallback2C0832B surfaceHolderCallback2C0832B = new SurfaceHolderCallback2C0832B(new i(this), this, this.f6536c);
        this.f6538e = surfaceHolderCallback2C0832B;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f6537d = V.a.o(getContext());
        getHolder().addCallback(surfaceHolderCallback2C0832B);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f6536c;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f6536c = iVar;
        C0831A c0831a = this.f6538e.f6498e;
        switch (c0831a.f6492a) {
            case 0:
                c0831a.f6493b.f6495b = iVar;
                break;
            default:
                SurfaceHolderCallback2C0832B surfaceHolderCallback2C0832B = c0831a.f6493b;
                io.flutter.embedding.engine.renderer.i iVar3 = surfaceHolderCallback2C0832B.f6495b;
                if (iVar3 != null) {
                    iVar3.c(surfaceHolderCallback2C0832B.f6497d);
                }
                surfaceHolderCallback2C0832B.f6495b = iVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f6536c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f6535b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f6536c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f6536c;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
        }
        C0831A c0831a = this.f6538e.f6498e;
        switch (c0831a.f6492a) {
            case 0:
                c0831a.f6493b.f6495b = null;
                break;
            default:
                SurfaceHolderCallback2C0832B surfaceHolderCallback2C0832B = c0831a.f6493b;
                surfaceHolderCallback2C0832B.f6494a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.i iVar2 = surfaceHolderCallback2C0832B.f6495b;
                if (iVar2 != null) {
                    iVar2.c(surfaceHolderCallback2C0832B.f6497d);
                }
                surfaceHolderCallback2C0832B.f6495b = null;
                break;
        }
        this.f6536c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f6536c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        C0831A c0831a = this.f6538e.f6498e;
        switch (c0831a.f6492a) {
            case 0:
                break;
            default:
                SurfaceHolderCallback2C0832B surfaceHolderCallback2C0832B = c0831a.f6493b;
                io.flutter.embedding.engine.renderer.i iVar = surfaceHolderCallback2C0832B.f6495b;
                if (iVar != null) {
                    iVar.a(surfaceHolderCallback2C0832B.f6497d);
                    break;
                }
                break;
        }
        if (this.f6534a) {
            e();
        }
        this.f6535b = false;
    }

    public final void e() {
        if (this.f6536c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.i iVar = this.f6536c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f6535b;
        if (!z2) {
            iVar.e();
        }
        iVar.f5785b = surface;
        FlutterJNI flutterJNI = iVar.f5784a;
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

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f6536c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f6537d) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }
}
