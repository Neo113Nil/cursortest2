package androidx.emoji2.text;

import Z1.a;
import Z1.b;
import android.content.Context;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k0.C2023c;
import v1.k;
import v1.r;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // Z1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // Z1.b
    public final Object b(Context context) {
        r rVar = new r(new C2023c(context));
        rVar.f20372b = 1;
        if (k.f20344k == null) {
            synchronized (k.f20343j) {
                try {
                    if (k.f20344k == null) {
                        k.f20344k = new k(rVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        a c5 = a.c(context);
        c5.getClass();
        synchronized (a.f6336e) {
            try {
                obj = c5.f6337a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c5.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        L g5 = ((InterfaceC0491u) obj).g();
        g5.a(new E2.a(this, g5));
    }
}
