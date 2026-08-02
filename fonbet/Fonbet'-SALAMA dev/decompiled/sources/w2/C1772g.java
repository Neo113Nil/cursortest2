package w2;

import A1.r;
import android.os.Handler;
import android.os.Message;
import v2.t;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f17978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f17979b;

    public C1772g(h hVar, R1.k kVar) {
        this.f17979b = hVar;
        Handler m7 = t.m(this);
        this.f17978a = m7;
        kVar.r(this, m7);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = t.f17153a;
        long j = ((i7 & 4294967295L) << 32) | (4294967295L & i8);
        h hVar = this.f17979b;
        if (this == hVar.f17985C1) {
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
