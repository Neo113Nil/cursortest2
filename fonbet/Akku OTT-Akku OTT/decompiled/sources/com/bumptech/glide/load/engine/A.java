package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public final class A {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((x) message.obj).recycle();
            return true;
        }
    }

    public final synchronized void a(x<?> xVar, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                xVar.recycle();
                this.a = false;
            }
            this.b.obtainMessage(1, xVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
