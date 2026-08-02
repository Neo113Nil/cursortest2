package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: com.google.android.gms.internal.ads.fE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0974fE implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1109iE f13463k;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
        Surface surface = new Surface(surfaceTexture);
        C1109iE c1109iE = this.f13463k;
        c1109iE.z1(surface);
        c1109iE.f13897Q = surface;
        c1109iE.x1(i, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1109iE c1109iE = this.f13463k;
        c1109iE.z1(null);
        c1109iE.x1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
        this.f13463k.x1(i, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i5, int i6) {
        this.f13463k.x1(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f13463k.x1(0, 0);
    }
}
