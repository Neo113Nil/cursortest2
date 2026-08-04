package p156w2;

import A1.r;
import R1.k;
import android.os.Handler;
import android.os.Message;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f17984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f17985b;

    public g(h hVar, k kVar) {
        this.f17985b = hVar;
        Handler handlerM = t.m(this);
        this.f17984a = handlerM;
        kVar.r(this, handlerM);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = t.f17159a;
        long j = ((((long) i7) & 4294967295L) << 32) | (4294967295L & ((long) i8));
        h hVar = this.f17985b;
        if (this == hVar.f17991C1) {
            if (j == Long.MAX_VALUE) {
                hVar.f5964O0 = true;
            } else {
                try {
                    hVar.p0(j);
                    hVar.x0();
                    hVar.f5968Q0.f1689e++;
                    hVar.w0();
                    hVar.Z(j);
                } catch (r e7) {
                    hVar.f5966P0 = e7;
                }
            }
        }
        return true;
    }
}
