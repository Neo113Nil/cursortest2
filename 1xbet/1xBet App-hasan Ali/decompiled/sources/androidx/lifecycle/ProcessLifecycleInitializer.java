package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Z1.b {
    @Override // Z1.b
    public final List a() {
        return X3.v.f6090k;
    }

    @Override // Z1.b
    public final Object b(Context context) {
        kotlin.jvm.internal.l.f("context", context);
        Z1.a c5 = Z1.a.c(context);
        kotlin.jvm.internal.l.e("getInstance(...)", c5);
        if (!c5.f6338b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f7064a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0488q());
        }
        F f = F.f7003s;
        f.getClass();
        f.f7008o = new Handler();
        f.f7009p.p(EnumC0486o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new E(f));
        return f;
    }
}
