package sg.bigo.ads.q0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import sg.bigo.ads.U.o;

/* renamed from: sg.bigo.ads.q0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC5438b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final String f13250a;

    public HandlerC5438b(String str, Looper looper) {
        super(looper);
        this.f13250a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final String toString() {
        return o.a(new StringBuilder("HandlerEx ("), this.f13250a, ") {}");
    }
}
