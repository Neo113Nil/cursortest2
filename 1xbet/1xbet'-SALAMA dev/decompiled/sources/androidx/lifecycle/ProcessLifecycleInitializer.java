package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements L0.b {
    @Override // L0.b
    public final List a() {
        return p050g6.p.f13308a;
    }

    @Override // L0.b
    public final Object b(Context context) {
        t6.h.e(context, "context");
        L0.a aVarC = L0.a.c(context);
        t6.h.d(aVarC, "getInstance(context)");
        if (!aVarC.f4192b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0722q.f9632a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            t6.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0721p());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f9594z;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f9599e = new Handler();
        processLifecycleOwner.f9600f.e(EnumC0718m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        t6.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
