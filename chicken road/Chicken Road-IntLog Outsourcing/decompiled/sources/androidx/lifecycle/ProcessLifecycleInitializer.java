package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import e0.C0409a;
import g4.C0471p;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements e0.b {
    @Override // e0.b
    public final List a() {
        return C0471p.f5750a;
    }

    @Override // e0.b
    public final Object create(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        C0409a c2 = C0409a.c(context);
        kotlin.jvm.internal.i.d(c2, "getInstance(context)");
        if (!c2.f5521b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0248s.f4587a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        F f3 = F.f4520i;
        f3.getClass();
        f3.f4525e = new Handler();
        f3.f4526f.e(EnumC0243m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new E(f3));
        return f3;
    }
}
