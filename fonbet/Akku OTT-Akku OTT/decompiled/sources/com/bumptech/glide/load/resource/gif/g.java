package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g {
    public final com.bumptech.glide.gifdecoder.e a;
    public final Handler b;
    public final ArrayList c;
    public final m d;
    public final com.bumptech.glide.load.engine.bitmap_recycle.d e;
    public boolean f;
    public boolean g;
    public l<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public com.bumptech.glide.load.m<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    @VisibleForTesting
    public static class a extends com.bumptech.glide.request.target.a<Bitmap> {
        public final Handler d;
        public final int e;
        public final long f;
        public Bitmap i;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // com.bumptech.glide.request.target.b
        public final void a(@NonNull Object obj) {
            this.i = (Bitmap) obj;
            Handler handler = this.d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
        }

        @Override // com.bumptech.glide.request.target.b
        public final void i() {
            this.i = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            g gVar = g.this;
            if (i == 1) {
                gVar.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            gVar.d.e((a) message.obj);
            return false;
        }
    }

    public g(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.e eVar, int i, int i2, com.bumptech.glide.load.resource.c cVar, Bitmap bitmap) {
        com.bumptech.glide.load.engine.bitmap_recycle.d dVar = bVar.a;
        com.bumptech.glide.f fVar = bVar.c;
        Context baseContext = fVar.getBaseContext();
        com.bumptech.glide.util.l.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m b2 = com.bumptech.glide.b.a(baseContext).e.b(baseContext);
        Context baseContext2 = fVar.getBaseContext();
        com.bumptech.glide.util.l.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m b3 = com.bumptech.glide.b.a(baseContext2).e.b(baseContext2);
        b3.getClass();
        l<Bitmap> a2 = new l(b3.a, b3, b3.b).a(m.m).a(((com.bumptech.glide.request.i) ((com.bumptech.glide.request.i) new com.bumptech.glide.request.i().d(com.bumptech.glide.load.engine.l.a).p()).l()).g(i, i2));
        this.c = new ArrayList();
        this.d = b2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = dVar;
        this.b = handler;
        this.h = a2;
        this.a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        com.bumptech.glide.gifdecoder.e eVar = this.a;
        int i2 = eVar.l.c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = eVar.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((com.bumptech.glide.gifdecoder.b) r2.e.get(i)).i);
        eVar.b();
        this.k = new a(this.b, eVar.k, uptimeMillis);
        this.h.a((com.bumptech.glide.request.i) new com.bumptech.glide.request.i().k(new com.bumptech.glide.signature.b(Double.valueOf(Math.random())))).v(eVar).u(this.k, null, com.bumptech.glide.util.e.a);
    }

    @VisibleForTesting
    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.i != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(com.bumptech.glide.load.m<Bitmap> mVar, Bitmap bitmap) {
        com.bumptech.glide.util.l.c(mVar, "Argument must not be null");
        this.m = mVar;
        com.bumptech.glide.util.l.c(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new com.bumptech.glide.request.i().m(mVar));
        this.o = com.bumptech.glide.util.m.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
