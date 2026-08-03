package M1;

/* loaded from: classes.dex */
public final class a implements I1.p {

    /* renamed from: a, reason: collision with root package name */
    public static final M1.a f1019a = new M1.a();

    @Override // I1.p
    public final I1.y a(N1.g gVar) {
        M1.i iVar = gVar.f1150a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f1064l) {
                    throw new java.lang.IllegalStateException("released");
                }
                if (iVar.f1063k) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                if (iVar.f1062j) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        M1.f fVar = iVar.f1059g;
        kotlin.jvm.internal.i.b(fVar);
        I1.s client = iVar.f1053a;
        kotlin.jvm.internal.i.e(client, "client");
        try {
            M1.e eVar = new M1.e(iVar, fVar, fVar.a(gVar.f1155f, gVar.f1156g, gVar.f1157h, client.f801f, !kotlin.jvm.internal.i.a(gVar.f1154e.f835b, "GET")).j(client, gVar));
            iVar.f1061i = eVar;
            iVar.f1066n = eVar;
            synchronized (iVar) {
                iVar.f1062j = true;
                iVar.f1063k = true;
            }
            if (iVar.f1065m) {
                throw new java.io.IOException("Canceled");
            }
            return N1.g.a(gVar, 0, eVar, null, 61).b(gVar.f1154e);
        } catch (M1.m e2) {
            fVar.c(e2.f1092b);
            throw e2;
        } catch (java.io.IOException e3) {
            fVar.c(e3);
            throw new M1.m(e3);
        }
    }
}
