package io.flutter.plugin.platform;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public final class p implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f9279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f9281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f9283e;

    public p(q qVar, SurfaceView surfaceView, float f, Rect rect, int i3) {
        this.f9283e = qVar;
        this.f9279a = surfaceView;
        this.f9280b = f;
        this.f9281c = rect;
        this.f9282d = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        SurfaceView surfaceView = this.f9279a;
        surfaceControl = surfaceView.getSurfaceControl();
        q qVar = this.f9283e;
        if (surfaceControl != null) {
            isValid = surfaceControl.isValid();
            if (isValid) {
                qVar.getClass();
                SurfaceControl.Transaction g3 = io.flutter.plugin.editing.b.g();
                qVar.f9294l.add(g3);
                alpha = g3.setAlpha(surfaceControl, this.f9280b);
                alpha.setCrop(surfaceControl, this.f9281c);
                qVar.f9288e.scheduleFrame();
                qVar.f9298p.remove(Integer.valueOf(this.f9282d));
                surfaceView.getHolder().removeCallback(this);
            }
        }
        surfaceView.getId();
        qVar.f9288e.scheduleFrame();
        qVar.f9298p.remove(Integer.valueOf(this.f9282d));
        surfaceView.getHolder().removeCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9283e.f9298p.remove(Integer.valueOf(this.f9282d));
        this.f9279a.getHolder().removeCallback(this);
    }
}
