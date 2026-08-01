package sg.bigo.ads.r1;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.n.J0;
import sg.bigo.ads.n.K0;
import sg.bigo.ads.n.S0;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final long f13276a = SystemClock.elapsedRealtime();
    public final /* synthetic */ n b;

    public k(n nVar) {
        this.b = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        sg.bigo.ads.U0.k kVar;
        Pair pair;
        S0 s0;
        ViewGroup viewGroup;
        AbstractC5446j.a(this.b.z);
        this.b.a(13, 0, SystemClock.elapsedRealtime() - this.f13276a);
        this.b.H = SystemClock.elapsedRealtime();
        this.b.r.a(new Surface(surfaceTexture));
        n nVar = this.b;
        InterfaceC5087a interfaceC5087a = nVar.d;
        if (interfaceC5087a != null && ((sg.bigo.ads.U0.k) interfaceC5087a).W0) {
            g gVar = nVar.r;
            String str = nVar.o;
            gVar.getClass();
            if (I.a((CharSequence) str)) {
                AbstractC5496a.a("MediaPlayerWrapper", "invalidate file path, set data source failed");
            } else {
                gVar.c = str;
                AbstractC5446j.a(1, new d(gVar, str));
            }
            n nVar2 = this.b;
            if (nVar2.x > 0) {
                AbstractC5446j.a(nVar2.y);
                if (nVar2.y == null) {
                    nVar2.y = new l(nVar2);
                }
                AbstractC5446j.a(2, null, nVar2.y, nVar2.x);
                return;
            }
            return;
        }
        if (interfaceC5087a == null || (pair = (kVar = (sg.bigo.ads.U0.k) interfaceC5087a).V0) == null || !kVar.e1) {
            if (nVar.q == null) {
                nVar.q = AbstractC4944a.a(nVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
            }
            View view = nVar.q;
            if (view != null) {
                X.a(view, nVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
                nVar.q.setVisibility(0);
                return;
            }
            return;
        }
        nVar.a((Bitmap) pair.first);
        b bVar = this.b.N;
        if (bVar != null) {
            Bitmap bitmap = (Bitmap) pair.first;
            K0 k0 = (K0) bVar;
            if (!k0.f13140a.d.t && bitmap != null && (viewGroup = (s0 = k0.f13140a).u) != null) {
                s0.F = bitmap;
                viewGroup.post(new J0(k0));
            }
        }
        this.b.k();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC5496a.b("VideoPlayView", "onSurfaceTextureDestroyed");
        this.b.a(false);
        g gVar = this.b.r;
        gVar.getClass();
        try {
            if (!g.m.get()) {
                gVar.f13273a.reset();
            }
            AbstractC5446j.a(gVar.h);
        } catch (IllegalStateException e) {
            f fVar = gVar.d;
            if (fVar != null) {
                n nVar = (n) fVar;
                nVar.a(11, gVar.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a("MediaPlayerWrapper", "reset IllegalStateException");
        }
        gVar.g = false;
        gVar.f = false;
        n nVar2 = this.b;
        if (!nVar2.v) {
            nVar2.i = false;
            int i = nVar2.s;
            if (i > 0) {
                nVar2.t = i;
            }
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
