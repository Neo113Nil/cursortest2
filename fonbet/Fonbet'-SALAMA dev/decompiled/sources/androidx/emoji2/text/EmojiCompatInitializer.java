package androidx.emoji2.text;

import L0.a;
import L0.b;
import android.content.Context;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import g0.j;
import g0.k;
import g0.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import w1.C1719l1;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // L0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // L0.b
    public final Object b(Context context) {
        Object obj;
        C1719l1 c1719l1 = new C1719l1();
        c1719l1.f17771a = context.getApplicationContext();
        q qVar = new q(c1719l1);
        qVar.f13019a = 1;
        if (j.j == null) {
            synchronized (j.f13022i) {
                try {
                    if (j.j == null) {
                        j.j = new j(qVar);
                    }
                } finally {
                }
            }
        }
        a c3 = a.c(context);
        c3.getClass();
        synchronized (a.f4190e) {
            try {
                obj = c3.f4191a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0741o lifecycle = ((InterfaceC0745t) obj).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
