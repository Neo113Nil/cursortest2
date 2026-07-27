package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class bc implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc f3500a;

    public bc(dc dcVar) {
        this.f3500a = dcVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        dc dcVar = this.f3500a;
        synchronized (dcVar) {
            dcVar.f3586d = true;
            dcVar.notifyAll();
        }
        return true;
    }
}
