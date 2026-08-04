package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes.dex */
public final class j extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f11358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f11358b = cVar;
        this.f11357a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            p150v0.a.j(i7, "Don't know how to handle this message: ", "GoogleApiAvailability");
            return;
        }
        int i8 = d.f11216a;
        c cVar = this.f11358b;
        Context context = this.f11357a;
        int iD = cVar.d(context, i8);
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            cVar.i(context, iD, cVar.b(context, iD, 0, "n"));
        }
    }
}
