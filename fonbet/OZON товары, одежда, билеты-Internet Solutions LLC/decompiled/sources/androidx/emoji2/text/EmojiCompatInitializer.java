package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.j;
import androidx.emoji2.text.q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements R4.a<Boolean> {

    static class a extends j.c {
    }

    static class b implements j.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f42684a;

        b(Context context) {
            this.f42684a = context.getApplicationContext();
        }

        public static void b(b bVar, j.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            bVar.getClass();
            try {
                q a11 = new d().a(bVar.f42684a);
                if (a11 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                j.h hVar = a11.f42704a;
                ((q.b) hVar).e(threadPoolExecutor);
                hVar.a(new m(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }

        @Override // androidx.emoji2.text.j.h
        public final void a(@NonNull final j.i iVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.l
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.b(EmojiCompatInitializer.b.this, iVar, threadPoolExecutor);
                }
            });
        }
    }

    static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (j.j()) {
                j.c().k();
            }
        }
    }

    @Override // R4.a
    @NonNull
    public final List<Class<? extends R4.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // R4.a
    @NonNull
    public final Boolean create(@NonNull Context context) {
        a aVar = new a(new b(context));
        aVar.f42705b = 1;
        j.i(aVar);
        AbstractC5434v lifecycle = ((J) androidx.startup.a.c(context).d(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
