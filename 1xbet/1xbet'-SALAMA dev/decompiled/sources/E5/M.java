package E5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f2301c;

    public static M a(ArrayList arrayList) {
        M m7 = new M();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        m7.f2299a = str;
        m7.f2300b = (List) arrayList.get(1);
        m7.f2301c = (Map) arrayList.get(2);
        return m7;
    }
}
