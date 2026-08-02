package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;
import androidx.emoji2.text.q;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.C10190e;
import v2.C10195j;

/* loaded from: classes.dex */
public final class q extends j.c {

    /* renamed from: d, reason: collision with root package name */
    private static final a f42734d = new a();

    /* loaded from: classes8.dex */
    public static class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static class b implements j.h {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f42735a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final C10190e f42736b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        private final a f42737c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        private final Object f42738d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f42739e;

        /* renamed from: f, reason: collision with root package name */
        private ThreadPoolExecutor f42740f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f42741g;

        /* renamed from: h, reason: collision with root package name */
        j.i f42742h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f42743i;

        b(@NonNull Context context, @NonNull C10190e c10190e, @NonNull a aVar) {
            x2.i.e(context, "Context cannot be null");
            this.f42735a = context.getApplicationContext();
            this.f42736b = c10190e;
            this.f42737c = aVar;
        }

        private void b() {
            synchronized (this.f42738d) {
                try {
                    this.f42742h = null;
                    ContentObserver contentObserver = this.f42743i;
                    if (contentObserver != null) {
                        a aVar = this.f42737c;
                        Context context = this.f42735a;
                        aVar.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.f42743i = null;
                    }
                    Handler handler = this.f42739e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f42739e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f42741g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f42740f = null;
                    this.f42741g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private C10195j.b d() {
            try {
                a aVar = this.f42737c;
                Context context = this.f42735a;
                C10190e c10190e = this.f42736b;
                aVar.getClass();
                C10195j.a a11 = C10195j.a(context, c10190e);
                if (a11.b() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + a11.b() + ")");
                }
                C10195j.b[] a12 = a11.a();
                if (a12 == null || a12.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return a12[0];
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("provider not found", e11);
            }
        }

        @Override // androidx.emoji2.text.j.h
        public final void a(@NonNull j.i iVar) {
            synchronized (this.f42738d) {
                this.f42742h = iVar;
            }
            synchronized (this.f42738d) {
                try {
                    if (this.f42742h == null) {
                        return;
                    }
                    if (this.f42740f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f42741g = threadPoolExecutor;
                        this.f42740f = threadPoolExecutor;
                    }
                    this.f42740f.execute(new Runnable() { // from class: androidx.emoji2.text.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            q.b.this.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        final void c() {
            synchronized (this.f42738d) {
                try {
                    if (this.f42742h == null) {
                        return;
                    }
                    try {
                        C10195j.b d11 = d();
                        int a11 = d11.a();
                        if (a11 == 2) {
                            synchronized (this.f42738d) {
                            }
                        }
                        if (a11 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + a11 + ")");
                        }
                        a aVar = this.f42737c;
                        Context context = this.f42735a;
                        aVar.getClass();
                        Typeface a12 = androidx.core.graphics.g.a(context, new C10195j.b[]{d11}, 0);
                        MappedByteBuffer e11 = androidx.core.graphics.m.e(this.f42735a, d11.c());
                        if (e11 == null || a12 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        u a13 = u.a(a12, e11);
                        synchronized (this.f42738d) {
                            try {
                                j.i iVar = this.f42742h;
                                if (iVar != null) {
                                    iVar.b(a13);
                                }
                            } finally {
                            }
                        }
                        b();
                    } catch (Throwable th2) {
                        synchronized (this.f42738d) {
                            try {
                                j.i iVar2 = this.f42742h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void e(@NonNull ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this.f42738d) {
                this.f42740f = threadPoolExecutor;
            }
        }
    }

    public q(@NonNull Context context, @NonNull C10190e c10190e) {
        super(new b(context, c10190e, f42734d));
    }
}
