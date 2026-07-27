package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class tb extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb f4384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(wb wbVar, Looper looper) {
        super(looper);
        this.f4384a = wbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        ub[] ubVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        wb wbVar = this.f4384a;
        while (true) {
            synchronized (wbVar.f4603b) {
                try {
                    size = wbVar.f4605d.size();
                    if (size <= 0) {
                        return;
                    }
                    ubVarArr = new ub[size];
                    wbVar.f4605d.toArray(ubVarArr);
                    wbVar.f4605d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i3 = 0; i3 < size; i3++) {
                ub ubVar = ubVarArr[i3];
                for (int i4 = 0; i4 < ubVar.f4462b.size(); i4++) {
                    BroadcastReceiver broadcastReceiver = ((vb) ubVar.f4462b.get(i4)).f4517b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(wbVar.f4602a, ubVar.f4461a);
                    }
                }
            }
        }
    }
}
