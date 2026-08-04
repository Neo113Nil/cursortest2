package Q3;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1009l0 f5828a = new C1009l0(8);

    public static void a(android.support.v4.media.session.t tVar) {
        J3.f fVar;
        ArrayList arrayList = new ArrayList();
        T3.a aVar = T3.a.f6342b;
        Iterator it = ((ConcurrentHashMap) tVar.f8076b).values().iterator();
        while (it.hasNext()) {
            for (J3.k kVar : (List) it.next()) {
                int iOrdinal = kVar.f3849d.ordinal();
                if (iOrdinal == 1) {
                    fVar = J3.f.f3838c;
                } else if (iOrdinal == 2) {
                    fVar = J3.f.f3839d;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    fVar = J3.f.f3840e;
                }
                String strSubstring = kVar.f3852g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new T3.b(fVar, kVar.f3851f, strSubstring, kVar.f3850e.name()));
            }
        }
        J3.k kVar2 = (J3.k) tVar.f8077c;
        Integer numValueOf = kVar2 != null ? Integer.valueOf(kVar2.f3851f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((T3.b) it2.next()).f6345b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
