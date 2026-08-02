package com.facebook.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends Handler {
    public final /* synthetic */ y a;

    public x(y yVar) {
        this.a = yVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(message, "message");
                y yVar = this.a;
                Intrinsics.checkNotNullParameter(message, "message");
                if (message.what == yVar.i) {
                    Bundle data = message.getData();
                    if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                        yVar.a(null);
                    } else {
                        yVar.a(data);
                    }
                    try {
                        yVar.a.unbindService(yVar);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }
}
