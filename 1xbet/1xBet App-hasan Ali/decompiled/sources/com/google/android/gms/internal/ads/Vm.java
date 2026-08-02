package com.google.android.gms.internal.ads;

import android.os.Message;

/* loaded from: classes.dex */
public final class Vm {

    /* renamed from: a, reason: collision with root package name */
    public Message f11938a;

    public final void a() {
        Message message = this.f11938a;
        message.getClass();
        message.sendToTarget();
        this.f11938a = null;
        C1439pn.d(this);
    }
}
