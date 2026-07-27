package sg.bigo.ads.e;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f12749a;
    public long b;
    public int c;
    public long d = 0;
    public long e = 0;
    public boolean f = false;
    public int g = -1;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final i k = new i(this);
    public final /* synthetic */ m l;

    public l(m mVar) {
        this.l = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0 != 4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r7 = 2000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r1 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l lVar) {
        sg.bigo.ads.U0.i iVar;
        long j;
        sg.bigo.ads.U0.i iVar2;
        int i;
        sg.bigo.ads.U0.i iVar3;
        sg.bigo.ads.U0.i iVar4;
        if (lVar.j) {
            return;
        }
        sg.bigo.ads.P.j jVar = lVar.l.k;
        sg.bigo.ads.P.c cVar = jVar.f12482a;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        if (bVar.k == 2) {
            if ((cVar instanceof InterfaceC5087a) && (iVar4 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).B0) != null) {
                j = iVar4.b;
            }
            j = 0;
        } else {
            if ((cVar instanceof InterfaceC5087a) && (iVar = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).B0) != null) {
                j = iVar.d;
            }
            j = 0;
        }
        lVar.f12749a = j;
        int i2 = 0;
        if (bVar.k == 2) {
            if ((cVar instanceof InterfaceC5087a) && (iVar3 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).B0) != null) {
                i = iVar3.f12573a;
            }
            i = 0;
        } else {
            if ((cVar instanceof InterfaceC5087a) && (iVar2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).B0) != null) {
                i = iVar2.c;
            }
            i = 0;
        }
        lVar.c = i;
        int i3 = jVar.b.b;
        int i4 = bVar.k;
        if (i3 != 12 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
            }
            i2 = 1000;
        }
        lVar.b = i2;
        AbstractC5446j.a(2, null, lVar.k, 0L);
        lVar.j = true;
    }

    public final float a(Rect rect) {
        m mVar = this.l;
        if (mVar.l == null || sg.bigo.ads.P.a.a(((sg.bigo.ads.U0.b) mVar.k.f12482a).l)) {
            return 0.0f;
        }
        float height = this.l.l.getHeight() * 1.0f * this.l.l.getWidth();
        float height2 = rect.height() * 1.0f * rect.width();
        if (height <= 0.0f) {
            return 0.0f;
        }
        return height2 / height;
    }

    public final void a(View view, boolean z) {
        this.l.l = view;
        if (view == null) {
            return;
        }
        if (z) {
            AbstractC5446j.a(2, new j(this));
        } else {
            view.addOnAttachStateChangeListener(new k(this, view));
        }
    }
}
