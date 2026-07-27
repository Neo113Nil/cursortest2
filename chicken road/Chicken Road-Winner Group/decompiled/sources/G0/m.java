package G0;

import android.webkit.WebView;
import androidx.lifecycle.r;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.ah;
import com.startapp.sdk.internal.di;
import com.startapp.sdk.internal.eh;
import com.startapp.sdk.internal.o7;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.yk;
import io.appmetrica.analytics.impl.C0453e;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.impl.C0663m2;
import io.appmetrica.analytics.impl.C0817s1;
import io.appmetrica.analytics.impl.C0920w0;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l.C1099s;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f428b;

    public /* synthetic */ m(int i3, Object obj) {
        this.f427a = i3;
        this.f428b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f427a) {
            case 0:
                n nVar = (n) this.f428b;
                nVar.getClass();
                ((H0.i) nVar.f432d).f(new F1.b(4, nVar));
                return;
            case 1:
                K1.h hVar = (K1.h) this.f428b;
                ExecutorService executorService = hVar.f939a;
                ConcurrentLinkedQueue concurrentLinkedQueue = hVar.f940b;
                AtomicBoolean atomicBoolean = hVar.f941c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new m(1, hVar));
                        }
                    }
                }
                return;
            case 2:
                ((N1.d) ((N1.b) this.f428b).f995c).f.prefetchDefaultFontManager();
                return;
            case 3:
                r this$0 = (r) this.f428b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                int i3 = this$0.f2326b;
                androidx.lifecycle.m mVar = this$0.f;
                if (i3 == 0) {
                    this$0.f2327c = true;
                    mVar.e(androidx.lifecycle.e.ON_PAUSE);
                }
                if (this$0.f2325a == 0 && this$0.f2327c) {
                    mVar.e(androidx.lifecycle.e.ON_STOP);
                    this$0.f2328d = true;
                    return;
                }
                return;
            case 4:
                ((c.k) this.f428b).invalidateOptionsMenu();
                return;
            case 5:
                c.j jVar = (c.j) this.f428b;
                Runnable runnable2 = jVar.f2499b;
                if (runnable2 != null) {
                    runnable2.run();
                    jVar.f2499b = null;
                    return;
                }
                return;
            case 6:
                ((BannerBase) this.f428b).scheduleReloadTask();
                return;
            case 7:
                com.startapp.sdk.ads.video.c.a((com.startapp.sdk.ads.video.c) this.f428b);
                return;
            case 8:
                ((com.startapp.sdk.adsbase.c) this.f428b).d();
                return;
            case 9:
                com.startapp.sdk.adsbase.d.a((com.startapp.sdk.adsbase.d) this.f428b);
                return;
            case 10:
                ((a8) this.f428b).c();
                return;
            case 11:
                ah.a((eh) this.f428b);
                return;
            case 12:
                ((di) this.f428b).a();
                return;
            case 13:
                o7.a((o7) this.f428b);
                return;
            case 14:
                ((HttpURLConnection) this.f428b).disconnect();
                return;
            case 15:
                o8.a((AtomicReference) this.f428b, null);
                return;
            case 16:
                ((vk) this.f428b).e();
                return;
            case 17:
                ((x1) this.f428b).a();
                return;
            case 18:
                yk.b((WebView) this.f428b);
                return;
            case C0644l9.f7759C /* 19 */:
                ((C0453e) this.f428b).a();
                return;
            case C0644l9.f7760D /* 20 */:
                C0663m2.a((C0663m2) this.f428b);
                return;
            case C0644l9.f7761E /* 21 */:
                ((C0817s1) this.f428b).e();
                return;
            case 22:
                ((C0920w0) this.f428b).o();
                return;
            case 23:
                ((io.flutter.plugin.platform.r) this.f428b).e(false);
                return;
            default:
                ((C1099s) this.f428b).getClass();
                return;
        }
    }
}
