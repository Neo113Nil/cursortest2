package S5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import l6.AbstractC7878a;
import m6.AbstractC8090c;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: r, reason: collision with root package name */
    public static final T5.h<n> f25840r = T5.h.c(n.f25837c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");

    /* renamed from: a, reason: collision with root package name */
    private final i f25841a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f25842b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f25843c;

    /* renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.n f25844d;

    /* renamed from: e, reason: collision with root package name */
    private final W5.d f25845e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25846f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25847g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.m<Bitmap> f25848h;

    /* renamed from: i, reason: collision with root package name */
    private a f25849i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25850j;

    /* renamed from: k, reason: collision with root package name */
    private a f25851k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f25852l;

    /* renamed from: m, reason: collision with root package name */
    private T5.m<Bitmap> f25853m;

    /* renamed from: n, reason: collision with root package name */
    private a f25854n;

    /* renamed from: o, reason: collision with root package name */
    private int f25855o;

    /* renamed from: p, reason: collision with root package name */
    private int f25856p;

    /* renamed from: q, reason: collision with root package name */
    private int f25857q;

    static class a extends AbstractC8090c<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f25858a;

        /* renamed from: b, reason: collision with root package name */
        final int f25859b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25860c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f25861d;

        a(Handler handler, int i11, long j11) {
            this.f25858a = handler;
            this.f25859b = i11;
            this.f25860c = j11;
        }

        final Bitmap a() {
            return this.f25861d;
        }

        @Override // m6.h
        public final void onLoadCleared(Drawable drawable) {
            this.f25861d = null;
        }

        @Override // m6.h
        public final void onResourceReady(Object obj, n6.c cVar) {
            this.f25861d = (Bitmap) obj;
            Handler handler = this.f25858a;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f25860c);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            o oVar = o.this;
            if (i11 == 1) {
                oVar.l((a) message.obj);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            oVar.f25844d.clear((a) message.obj);
            return false;
        }
    }

    private static class d implements T5.f {

        /* renamed from: b, reason: collision with root package name */
        private final o6.d f25863b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25864c;

        d(o6.d dVar, int i11) {
            this.f25863b = dVar;
            this.f25864c = i11;
        }

        @Override // T5.f
        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f25863b.equals(dVar.f25863b) && this.f25864c == dVar.f25864c;
        }

        @Override // T5.f
        public final int hashCode() {
            return (this.f25863b.hashCode() * 31) + this.f25864c;
        }

        @Override // T5.f
        public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f25864c).array());
            this.f25863b.updateDiskCacheKey(messageDigest);
        }
    }

    public o(com.bumptech.glide.c cVar, i iVar, int i11, int i12, b6.j jVar, Bitmap bitmap) {
        W5.d c11 = cVar.c();
        com.bumptech.glide.n n11 = com.bumptech.glide.c.n(cVar.e());
        com.bumptech.glide.m<Bitmap> apply = com.bumptech.glide.c.n(cVar.e()).asBitmap().apply((AbstractC7878a<?>) l6.i.diskCacheStrategyOf(V5.k.f28204a).useAnimationPool(true).skipMemoryCache(true).override(i11, i12));
        this.f25843c = new ArrayList();
        this.f25846f = false;
        this.f25847g = false;
        this.f25844d = n11;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f25845e = c11;
        this.f25842b = handler;
        this.f25848h = apply;
        this.f25841a = iVar;
        m(jVar, bitmap);
    }

    private void k() {
        if (!this.f25846f || this.f25847g) {
            return;
        }
        a aVar = this.f25854n;
        if (aVar != null) {
            this.f25854n = null;
            l(aVar);
            return;
        }
        this.f25847g = true;
        i iVar = this.f25841a;
        long uptimeMillis = SystemClock.uptimeMillis() + iVar.k();
        iVar.c();
        int h11 = iVar.h();
        this.f25851k = new a(this.f25842b, h11, uptimeMillis);
        this.f25848h.apply((AbstractC7878a<?>) l6.i.signatureOf(new d(new o6.d(iVar), h11)).skipMemoryCache(iVar.g().b())).load(iVar).into((com.bumptech.glide.m<Bitmap>) this.f25851k);
    }

    final void a() {
        this.f25843c.clear();
        Bitmap bitmap = this.f25852l;
        if (bitmap != null) {
            this.f25845e.c(bitmap);
            this.f25852l = null;
        }
        this.f25846f = false;
        a aVar = this.f25849i;
        com.bumptech.glide.n nVar = this.f25844d;
        if (aVar != null) {
            nVar.clear(aVar);
            this.f25849i = null;
        }
        a aVar2 = this.f25851k;
        if (aVar2 != null) {
            nVar.clear(aVar2);
            this.f25851k = null;
        }
        a aVar3 = this.f25854n;
        if (aVar3 != null) {
            nVar.clear(aVar3);
            this.f25854n = null;
        }
        this.f25841a.d();
        this.f25850j = true;
    }

    final ByteBuffer b() {
        return this.f25841a.i().asReadOnlyBuffer();
    }

    final Bitmap c() {
        a aVar = this.f25849i;
        return aVar != null ? aVar.a() : this.f25852l;
    }

    final int d() {
        a aVar = this.f25849i;
        if (aVar != null) {
            return aVar.f25859b;
        }
        return -1;
    }

    final Bitmap e() {
        return this.f25852l;
    }

    final int f() {
        return this.f25841a.j();
    }

    final int g() {
        return this.f25857q;
    }

    final int h() {
        return this.f25841a.l();
    }

    final int i() {
        return this.f25841a.f() + this.f25855o;
    }

    final int j() {
        return this.f25856p;
    }

    final void l(a aVar) {
        this.f25847g = false;
        boolean z11 = this.f25850j;
        Handler handler = this.f25842b;
        if (z11) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f25846f) {
            this.f25854n = aVar;
            return;
        }
        if (aVar.a() != null) {
            Bitmap bitmap = this.f25852l;
            if (bitmap != null) {
                this.f25845e.c(bitmap);
                this.f25852l = null;
            }
            a aVar2 = this.f25849i;
            this.f25849i = aVar;
            ArrayList arrayList = this.f25843c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                try {
                    b bVar = (b) arrayList.get(size);
                    if (bVar != null) {
                        bVar.a();
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e11.printStackTrace();
                }
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        k();
    }

    final void m(T5.m<Bitmap> mVar, Bitmap bitmap) {
        p6.k.c(mVar, "Argument must not be null");
        this.f25853m = mVar;
        p6.k.c(bitmap, "Argument must not be null");
        this.f25852l = bitmap;
        this.f25848h = this.f25848h.apply((AbstractC7878a<?>) new l6.i().transform(mVar));
        this.f25855o = p6.l.c(bitmap);
        this.f25856p = bitmap.getWidth();
        this.f25857q = bitmap.getHeight();
    }

    final void n(k kVar) {
        if (this.f25850j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.f25843c;
        if (arrayList.contains(kVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(kVar);
        if (!isEmpty || this.f25846f) {
            return;
        }
        this.f25846f = true;
        this.f25850j = false;
        k();
    }

    final void o(k kVar) {
        ArrayList arrayList = this.f25843c;
        arrayList.remove(kVar);
        if (arrayList.isEmpty()) {
            this.f25846f = false;
        }
    }
}
