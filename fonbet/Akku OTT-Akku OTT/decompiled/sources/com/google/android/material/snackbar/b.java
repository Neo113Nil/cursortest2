package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class b {
    public static b b;

    @NonNull
    public final Object a = new Object();

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            C0127b c0127b = (C0127b) message.obj;
            synchronized (bVar.a) {
                try {
                    if (c0127b == null || c0127b == null) {
                        c0127b.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    public static class C0127b {
    }

    public b() {
        new Handler(Looper.getMainLooper(), new a());
    }

    public static b a() {
        if (b == null) {
            b = new b();
        }
        return b;
    }
}
