package X4;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements T4.r {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3526a = new b();

    @Override // T4.r
    public final T4.z a(Y4.i iVar) {
        Y4.g gVar;
        r rVar = iVar.f3712a;
        rVar.getClass();
        synchronized (rVar) {
            try {
                if (!rVar.f3601m) {
                    throw new IllegalStateException("released");
                }
                if (rVar.f3600l) {
                    throw new IllegalStateException("Check failed.");
                }
                if (rVar.f3599k) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j jVar = rVar.f3595g;
        kotlin.jvm.internal.i.b(jVar);
        s b6 = jVar.b();
        T4.u client = rVar.f3589a;
        b6.getClass();
        kotlin.jvm.internal.i.e(client, "client");
        a5.t tVar = b6.f3615l;
        if (tVar != null) {
            gVar = new a5.u(client, b6, iVar, tVar);
        } else {
            Socket socket = b6.f3609f;
            int i2 = iVar.f3718g;
            socket.setSoTimeout(i2);
            B4.i iVar2 = b6.f3612i;
            j5.y d6 = ((j5.q) iVar2.f312c).f10518a.d();
            long j2 = i2;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            d6.g(j2, timeUnit);
            ((j5.p) iVar2.f313d).f10515a.d().g(iVar.f3719h, timeUnit);
            gVar = new Z4.g(client, b6, iVar2);
        }
        i iVar3 = new i(rVar, jVar, gVar);
        rVar.f3598j = iVar3;
        rVar.f3603o = iVar3;
        synchronized (rVar) {
            rVar.f3599k = true;
            rVar.f3600l = true;
        }
        if (rVar.f3602n) {
            throw new IOException("Canceled");
        }
        return Y4.i.a(iVar, 0, iVar3, null, 61).b(iVar.f3716e);
    }
}
