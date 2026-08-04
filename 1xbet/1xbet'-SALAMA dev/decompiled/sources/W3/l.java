package W3;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p151v2.n f6721a;

    public l(p151v2.n nVar) {
        this.f6721a = nVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        p151v2.n nVar = this.f6721a;
        try {
            i iVar = i.f6719c;
            Mac mac = (Mac) iVar.f6720a.R((String) nVar.f17144c);
            mac.init((SecretKeySpec) nVar.f17145d);
            return mac;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
