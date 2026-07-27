package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements W.b {
    @Override // W.b
    public final List a() {
        return e2.o.f4877a;
    }

    @Override // W.b
    public final Object create(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        W.a c3 = W.a.c(context);
        kotlin.jvm.internal.j.d(c3, "getInstance(context)");
        if (!c3.f1619b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!i.f2308a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new h());
        }
        r rVar = r.f2324i;
        rVar.getClass();
        rVar.f2329e = new Handler();
        rVar.f.e(e.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q(rVar));
        return rVar;
    }
}
