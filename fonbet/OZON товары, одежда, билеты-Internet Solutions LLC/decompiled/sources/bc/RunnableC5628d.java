package bc;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import bc.AbstractC5634j;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Future;

/* renamed from: bc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class RunnableC5628d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5625a f55862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5629e f55863b;

    /* renamed from: bc.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Drawable f55864a;

        a(Drawable drawable) {
            this.f55864a = drawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashMap hashMap;
            Drawable drawable;
            RunnableC5628d runnableC5628d = RunnableC5628d.this;
            hashMap = runnableC5628d.f55863b.f55871f;
            C5625a c5625a = runnableC5628d.f55862a;
            if (((Future) hashMap.remove(c5625a)) == null || (drawable = this.f55864a) == null || c5625a.getCallback() == null) {
                return;
            }
            c5625a.f(drawable);
        }
    }

    RunnableC5628d(C5629e c5629e, C5625a c5625a) {
        this.f55863b = c5629e;
        this.f55862a = c5625a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Rect bounds;
        String scheme;
        HashMap hashMap;
        HashMap hashMap2;
        C5629e c5629e = this.f55863b;
        C5625a c5625a = this.f55862a;
        String a11 = c5625a.a();
        Drawable drawable = null;
        try {
            scheme = Uri.parse(a11).getScheme();
        } catch (Throwable th2) {
            c5629e.getClass();
            Log.e("MARKWON-IMAGE", "Error loading image: " + a11, th2);
        }
        if (scheme == null || scheme.length() == 0) {
            throw new IllegalStateException("No scheme is found: " + a11);
        }
        hashMap = c5629e.f55867b;
        AbstractC5641q abstractC5641q = (AbstractC5641q) hashMap.get(scheme);
        if (abstractC5641q == null) {
            throw new IllegalStateException("No scheme-handler is found: " + a11);
        }
        AbstractC5634j.a a12 = abstractC5641q.a(a11);
        try {
            hashMap2 = c5629e.f55868c;
            AbstractC5640p abstractC5640p = (AbstractC5640p) hashMap2.get(a12.b());
            if (abstractC5640p == null) {
                abstractC5640p = c5629e.f55869d;
            }
            if (abstractC5640p == null) {
                throw new IllegalStateException("No media-decoder is found: " + a11);
            }
            drawable = abstractC5640p.a(a12.c());
            try {
                a12.c().close();
            } catch (IOException e11) {
                Log.e("MARKWON-IMAGE", "Error closing inputStream", e11);
            }
            if (drawable != null && ((bounds = drawable.getBounds()) == null || bounds.isEmpty())) {
                drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            }
            handler = c5629e.f55870e;
            handler.postAtTime(new a(drawable), c5625a, SystemClock.uptimeMillis());
        } finally {
        }
    }
}
