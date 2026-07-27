package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* compiled from: LimitExecutor.java */
/* loaded from: classes6.dex */
public class e0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f9419a;
    private Runnable b;

    /* compiled from: LimitExecutor.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f9420a;

        a(Runnable runnable) {
            this.f9420a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9420a.run();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.f9419a == null) {
            this.f9419a = a(runnable);
            c0.a().execute(this.f9419a);
        } else if (this.b == null) {
            this.b = a(runnable);
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.f9419a = runnable;
        this.b = null;
        if (runnable != null) {
            c0.a().execute(this.f9419a);
        }
    }
}
