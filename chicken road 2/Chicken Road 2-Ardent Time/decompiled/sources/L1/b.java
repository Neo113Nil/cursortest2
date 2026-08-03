package L1;

/* loaded from: classes.dex */
public final class b extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(java.lang.String str, java.lang.Object obj, int i2) {
        super(str, true);
        this.f989e = i2;
        this.f990f = obj;
    }

    @Override // L1.a
    public final long a() {
        switch (this.f989e) {
            case 0:
                ((P1.m) this.f990f).invoke();
                return -1L;
            case 1:
                M1.l lVar = (M1.l) this.f990f;
                long nanoTime = java.lang.System.nanoTime();
                java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) lVar.f1090d).iterator();
                int i2 = 0;
                long j2 = Long.MIN_VALUE;
                M1.k kVar = null;
                int i3 = 0;
                while (it.hasNext()) {
                    M1.k connection = (M1.k) it.next();
                    kotlin.jvm.internal.i.d(connection, "connection");
                    synchronized (connection) {
                        if (lVar.c(connection, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j3 = nanoTime - connection.f1084q;
                            if (j3 > j2) {
                                kVar = connection;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = lVar.f1087a;
                if (j2 < j4 && i2 <= 5) {
                    if (i2 > 0) {
                        return j4 - j2;
                    }
                    if (i3 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                kotlin.jvm.internal.i.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f1083p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f1084q + j2 != nanoTime) {
                        return 0L;
                    }
                    kVar.f1077j = true;
                    ((java.util.concurrent.ConcurrentLinkedQueue) lVar.f1090d).remove(kVar);
                    java.net.Socket socket = kVar.f1071d;
                    kotlin.jvm.internal.i.b(socket);
                    J1.b.e(socket);
                    if (!((java.util.concurrent.ConcurrentLinkedQueue) lVar.f1090d).isEmpty()) {
                        return 0L;
                    }
                    ((L1.c) lVar.f1088b).a();
                    return 0L;
                }
            default:
                P1.r rVar = (P1.r) this.f990f;
                rVar.getClass();
                try {
                    rVar.f1533w.l(2, 0, false);
                    return -1L;
                } catch (java.io.IOException e2) {
                    rVar.b(e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(M1.l lVar, java.lang.String str) {
        super(str, true);
        this.f989e = 1;
        this.f990f = lVar;
    }
}
