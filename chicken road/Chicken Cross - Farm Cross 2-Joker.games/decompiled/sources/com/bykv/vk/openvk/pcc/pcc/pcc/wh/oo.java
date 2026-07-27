package com.bykv.vk.openvk.pcc.pcc.pcc.wh;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf;

/* loaded from: classes5.dex */
public class oo extends TextureView implements TextureView.SurfaceTextureListener, sf {
    private pcc pcc;
    private sf.pcc sf;

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public oo(Context context) {
        this(context, null);
    }

    public oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public void pcc(pcc pccVar) {
        this.pcc = pccVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public void pcc(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.pcc(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.pcc(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.sf(surfaceTexture);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(sf.pcc pccVar) {
        this.sf = pccVar;
    }
}
