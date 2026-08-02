package S7;

import com.google.crypto.tink.internal.C5892k;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.L;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final q f26001a;

    private h(q qVar) {
        this.f26001a = qVar;
    }

    public static h a(q qVar) throws GeneralSecurityException {
        return new h(qVar);
    }

    public final q b() throws GeneralSecurityException {
        q qVar = this.f26001a;
        if (qVar != null) {
            return qVar;
        }
        try {
            return t.a((qVar instanceof C5892k ? ((C5892k) qVar).b().c() : ((G) com.google.crypto.tink.internal.u.a().k(qVar)).c()).f());
        } catch (GeneralSecurityException e11) {
            throw new L("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + qVar, e11);
        }
    }
}
