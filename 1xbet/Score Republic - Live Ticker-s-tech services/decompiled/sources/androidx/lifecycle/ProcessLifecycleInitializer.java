package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.C0270h1;
import p000.C0411kw;
import p000.ix0;
import p000.jx0;
import p000.ph0;
import p000.qd0;
import p000.sh0;
import p000.td0;
import p000.th0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements td0 {
    @Override // p000.td0
    /* JADX INFO: renamed from: a */
    public final List mo413a() {
        return C0411kw.f4584j;
    }

    @Override // p000.td0
    /* JADX INFO: renamed from: b */
    public final Object mo414b(Context context) {
        context.getClass();
        qd0 qd0VarM4070r = qd0.m4070r(context);
        qd0VarM4070r.getClass();
        if (!((HashSet) qd0VarM4070r.f6472l).contains(ProcessLifecycleInitializer.class)) {
            C0270h1.m2191g("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!th0.f7447a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new sh0());
        }
        jx0 jx0Var = jx0.f4104q;
        jx0Var.getClass();
        jx0Var.f4109n = new Handler();
        jx0Var.f4110o.m440d(ph0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ix0(jx0Var));
        return jx0Var;
    }
}
