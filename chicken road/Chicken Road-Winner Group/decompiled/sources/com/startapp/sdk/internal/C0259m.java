package com.startapp.sdk.internal;

import java.util.Iterator;

/* renamed from: com.startapp.sdk.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4022a;

    public C0259m(p pVar) {
        this.f4022a = pVar;
    }

    public final void a(w2 w2Var) {
        synchronized (this.f4022a.f4179a) {
            try {
                Iterator it = this.f4022a.f4179a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() == w2Var) {
                        it.remove();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
