package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.C0030a;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0066bl;
import p000.C0181eo;
import p000.C0595pv;
import p000.InterfaceC0738tq;
import p000.RunnableC0393ke;
import p000.h40;
import p000.qd0;
import p000.td0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements td0 {
    @Override // p000.td0
    /* JADX INFO: renamed from: a */
    public final List mo413a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.td0
    /* JADX INFO: renamed from: b */
    public final Object mo414b(Context context) {
        Object objM4079p;
        h40 h40Var = new h40(new C0181eo(context));
        h40Var.f3044b = 1;
        if (C0595pv.f6261k == null) {
            synchronized (C0595pv.f6260j) {
                try {
                    if (C0595pv.f6261k == null) {
                        C0595pv.f6261k = new C0595pv(h40Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        qd0 qd0VarM4070r = qd0.m4070r(context);
        qd0VarM4070r.getClass();
        synchronized (qd0.f6469o) {
            try {
                objM4079p = ((HashMap) qd0VarM4070r.f6471k).get(ProcessLifecycleInitializer.class);
                if (objM4079p == null) {
                    objM4079p = qd0VarM4070r.m4079p(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final C0030a c0030aMo862d = ((yh0) objM4079p).mo862d();
        c0030aMo862d.m437a(new InterfaceC0738tq(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC0738tq
            /* JADX INFO: renamed from: a */
            public final void mo415a(yh0 yh0Var) {
                AbstractC0066bl.m716a(Looper.getMainLooper()).postDelayed(new RunnableC0393ke(1), 500L);
                c0030aMo862d.m442f(this);
            }
        });
        return Boolean.TRUE;
    }
}
