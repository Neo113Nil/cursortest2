package K4;

import G4.C0282o;
import U5.c0;
import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.C0884t;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC0315b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0865j f3983s = AbstractC0867k.f12212b;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final P2 f3984r;

    /* JADX WARN: Illegal instructions before constructor call */
    public G(r rVar, L4.f fVar, P2 p5, v vVar) {
        H2.r rVarD = Y4.D.f7693e;
        if (rVarD == null) {
            synchronized (Y4.D.class) {
                try {
                    rVarD = Y4.D.f7693e;
                    if (rVarD == null) {
                        C0282o c0282oC = H2.r.c();
                        c0282oC.f3012d = c0.f6471c;
                        c0282oC.f3013e = H2.r.b("google.firestore.v1.Firestore", "Listen");
                        c0282oC.f3009a = true;
                        Y4.G gZ = Y4.G.z();
                        C0884t c0884t = p016b6.c.f10155a;
                        c0282oC.f3010b = new p016b6.b(gZ);
                        c0282oC.f3011c = new p016b6.b(Y4.H.v());
                        rVarD = c0282oC.d();
                        Y4.D.f7693e = rVarD;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(rVar, rVarD, fVar, L4.e.f4351b, L4.e.f4350a, vVar);
        this.f3984r = p5;
    }

    @Override // K4.AbstractC0315b
    public final void e(AbstractC0847a abstractC0847a) {
        f((Y4.H) abstractC0847a);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20191. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // K4.AbstractC0315b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void f(Y4.H r34) {
        /*
            Method dump skipped, instruction units count: 2019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.G.f(Y4.H):void");
    }
}
