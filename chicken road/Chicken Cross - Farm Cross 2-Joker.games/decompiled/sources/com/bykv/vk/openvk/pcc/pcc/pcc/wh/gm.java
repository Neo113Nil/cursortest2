package com.bykv.vk.openvk.pcc.pcc.pcc.wh;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class gm extends vj implements SurfaceHolder.Callback, sf {
    private static final ArrayList<wh> gm = new ArrayList<>();
    private sf.pcc oo;
    private WeakReference<pcc> pcc;
    private wh sf;

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public View getView() {
        return this;
    }

    public gm(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        wh whVar = new wh(this);
        this.sf = whVar;
        gm.add(whVar);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public void pcc(pcc pccVar) {
        this.pcc = new WeakReference<>(pccVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<wh> it = gm.iterator();
        while (it.hasNext()) {
            wh next = it.next();
            if (next != null && next.pcc() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.sf);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf
    public void pcc(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<pcc> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().pcc(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<pcc> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().pcc(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<pcc> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().sf(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(sf.pcc pccVar) {
        this.oo = pccVar;
    }
}
