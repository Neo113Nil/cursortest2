package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C0838l;

/* loaded from: classes4.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ C0838l a;
    public final /* synthetic */ C0838l.b b;

    public /* synthetic */ T(C0838l c0838l, C0838l.b bVar) {
        this.a = c0838l;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0838l c0838l = this.a;
        C0838l.b bVar = this.b;
        Object obj = c0838l.b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e) {
            bVar.onNotifyListenerFailed();
            throw e;
        }
    }
}
