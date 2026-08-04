package androidx.emoji2.text;

import L0.a;
import L0.b;
import android.content.Context;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p046g0.j;
import p046g0.k;
import p046g0.q;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // L0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // L0.b
    public final Object b(Context context) {
        Object objB;
        C1010l1 c1010l1 = new C1010l1();
        c1010l1.f17777a = context.getApplicationContext();
        q qVar = new q(c1010l1);
        qVar.f13025a = 1;
        if (j.j == null) {
            synchronized (j.f13028i) {
                try {
                    if (j.j == null) {
                        j.j = new j(qVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f4190e) {
            try {
                objB = aVarC.f4191a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC0720o lifecycle = ((InterfaceC0724t) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
