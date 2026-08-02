package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.PendingIntentCompat;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes4.dex */
public final class m extends zau {
    public final Context a;
    public final /* synthetic */ C0855e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0855e c0855e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = c0855e;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = C0856f.a;
        C0855e c0855e = this.b;
        Context context = this.a;
        int c = c0855e.c(context, i);
        AtomicBoolean atomicBoolean = j.a;
        if (c == 1 || c == 2 || c == 3 || c == 9) {
            Intent a = c0855e.a(context, c, "n");
            c0855e.g(context, c, a == null ? null : PendingIntentCompat.getActivity(context, 0, a, 134217728, false));
        }
    }
}
