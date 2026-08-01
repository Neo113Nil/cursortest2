package sg.bigo.ads.C;

import android.graphics.Bitmap;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class w extends sg.bigo.ads.e.m {
    public boolean S;
    public boolean T;
    public Integer U;
    public Integer V;

    public w(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.S = false;
        this.T = false;
    }

    public final void a(InterfaceC5087a interfaceC5087a) {
        if (this.S && !this.T && interfaceC5087a != null && ((sg.bigo.ads.U0.k) interfaceC5087a).p()) {
            this.T = true;
            AbstractC5446j.a(1, new u(this, interfaceC5087a));
        }
    }

    public final void a(Bitmap bitmap, int i) {
        if (!this.S || this.T || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.T = true;
        AbstractC5446j.a(1, null, new v(this, i, bitmap), 0L);
    }

    public void a(boolean z) {
        this.S = z;
    }
}
