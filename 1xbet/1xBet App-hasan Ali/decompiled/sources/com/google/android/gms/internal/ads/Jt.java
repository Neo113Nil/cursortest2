package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class Jt extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Jt(Looper looper, int i, boolean z3) {
        super(looper);
        this.f10078a = i;
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f10078a) {
            case 0:
                a(message);
                break;
            default:
                super.dispatchMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Jt(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.f10078a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jt(Looper looper, int i) {
        super(looper);
        this.f10078a = i;
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
