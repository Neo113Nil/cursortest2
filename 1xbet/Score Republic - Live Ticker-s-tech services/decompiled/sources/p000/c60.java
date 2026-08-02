package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0030a;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 implements oa0, x41, hi1 {

    /* JADX INFO: renamed from: j */
    public final c50 f1150j;

    /* JADX INFO: renamed from: k */
    public final gi1 f1151k;

    /* JADX INFO: renamed from: l */
    public final RunnableC0944za f1152l;

    /* JADX INFO: renamed from: m */
    public C0030a f1153m = null;

    /* JADX INFO: renamed from: n */
    public m81 f1154n = null;

    public c60(c50 c50Var, gi1 gi1Var, RunnableC0944za runnableC0944za) {
        this.f1150j = c50Var;
        this.f1151k = gi1Var;
        this.f1152l = runnableC0944za;
    }

    @Override // p000.x41
    /* JADX INFO: renamed from: a */
    public final C0086c5 mo859a() {
        m890f();
        return (C0086c5) this.f1154n.f5011m;
    }

    @Override // p000.oa0
    /* JADX INFO: renamed from: b */
    public final yq0 mo860b() {
        Application application;
        c50 c50Var = this.f1150j;
        Context applicationContext = c50Var.m856D().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        yq0 yq0Var = new yq0(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) yq0Var.f7192j;
        if (application != null) {
            linkedHashMap.put(o31.f5610r, application);
        }
        linkedHashMap.put(xe1.f8936b, c50Var);
        linkedHashMap.put(xe1.f8937c, this);
        Bundle bundle = c50Var.f1132o;
        if (bundle != null) {
            linkedHashMap.put(xe1.f8938d, bundle);
        }
        return yq0Var;
    }

    @Override // p000.hi1
    /* JADX INFO: renamed from: c */
    public final gi1 mo861c() {
        m890f();
        return this.f1151k;
    }

    @Override // p000.yh0
    /* JADX INFO: renamed from: d */
    public final C0030a mo862d() {
        m890f();
        return this.f1153m;
    }

    /* JADX INFO: renamed from: e */
    public final void m889e(ph0 ph0Var) {
        this.f1153m.m440d(ph0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m890f() {
        if (this.f1153m == null) {
            this.f1153m = new C0030a(this);
            m81 m81Var = new m81((x41) this);
            this.f1154n = m81Var;
            m81Var.m3357f();
            this.f1152l.run();
        }
    }
}
