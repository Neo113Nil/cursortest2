package R3;

import android.support.v4.media.session.t;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements J3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f6055a = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6056b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f6057c = new p();

    @Override // J3.m
    public final Class a() {
        return J3.j.class;
    }

    @Override // J3.m
    public final Class b() {
        return J3.j.class;
    }

    @Override // J3.m
    public final Object c(t tVar) throws GeneralSecurityException {
        Iterator it = ((ConcurrentHashMap) tVar.f8076b).values().iterator();
        while (it.hasNext()) {
            for (J3.k kVar : (List) it.next()) {
                J3.b bVar = kVar.f3853h;
                if (bVar instanceof n) {
                    n nVar = (n) bVar;
                    byte[] bArr = kVar.f3848c;
                    X3.a aVarA = X3.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(nVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new o(tVar);
    }
}
