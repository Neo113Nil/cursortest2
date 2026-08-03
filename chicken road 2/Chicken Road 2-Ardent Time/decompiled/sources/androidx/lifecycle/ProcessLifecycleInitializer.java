package androidx.lifecycle;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements R.b {
    @Override // R.b
    public final java.util.List a() {
        return i1.C0199r.f3325a;
    }

    @Override // R.b
    public final java.lang.Object create(android.content.Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        R.a c2 = R.a.c(context);
        kotlin.jvm.internal.i.d(c2, "getInstance(context)");
        if (!c2.f1649b.contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            throw new java.lang.IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!androidx.lifecycle.h.f2385a.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.g());
        }
        androidx.lifecycle.r rVar = androidx.lifecycle.r.f2402i;
        rVar.getClass();
        rVar.f2407e = new android.os.Handler();
        rVar.f2408f.d(androidx.lifecycle.d.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new androidx.lifecycle.q(rVar));
        return rVar;
    }
}
