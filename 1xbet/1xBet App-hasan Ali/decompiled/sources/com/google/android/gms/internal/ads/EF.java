package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class EF extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GF f8493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EF(GF gf, Looper looper) {
        super(looper);
        this.f8493a = gf;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        FF ff;
        GF gf = this.f8493a;
        int i = message.what;
        if (i == 1) {
            ff = (FF) message.obj;
            try {
                gf.f9181k.queueInputBuffer(ff.f8944a, 0, ff.f8945b, ff.f8947d, ff.f8948e);
            } catch (RuntimeException e3) {
                AbstractC1400ot.n(gf.f9184n, e3);
            }
        } else if (i != 2) {
            ff = null;
            if (i == 3) {
                gf.f9185o.f();
            } else if (i != 4) {
                AbstractC1400ot.n(gf.f9184n, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    gf.f9181k.setParameters((Bundle) message.obj);
                } catch (RuntimeException e5) {
                    AbstractC1400ot.n(gf.f9184n, e5);
                }
            }
        } else {
            ff = (FF) message.obj;
            int i5 = ff.f8944a;
            MediaCodec.CryptoInfo cryptoInfo = ff.f8946c;
            long j5 = ff.f8947d;
            int i6 = ff.f8948e;
            try {
                synchronized (GF.f9180r) {
                    gf.f9181k.queueSecureInputBuffer(i5, 0, cryptoInfo, j5, i6);
                }
            } catch (RuntimeException e6) {
                AbstractC1400ot.n(gf.f9184n, e6);
            }
        }
        if (ff != null) {
            ArrayDeque arrayDeque = GF.f9179q;
            synchronized (arrayDeque) {
                arrayDeque.add(ff);
            }
        }
    }
}
