package R3;

import android.support.v4.media.session.t;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements J3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6041a = new i();

    @Override // J3.m
    public final Class a() {
        return g.class;
    }

    @Override // J3.m
    public final Class b() {
        return g.class;
    }

    @Override // J3.m
    public final Object c(t tVar) throws GeneralSecurityException {
        if (((J3.k) tVar.f8077c) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentHashMap) tVar.f8076b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new h();
    }
}
