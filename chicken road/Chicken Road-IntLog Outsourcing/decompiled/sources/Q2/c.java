package Q2;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public interface c {
    static a a(V2.e eVar, String str, V2.e eVar2, Boolean bool) {
        if (eVar != null) {
            String str2 = eVar.f3237b;
            if (!str2.isEmpty() && str != null) {
                if (eVar2 != null) {
                    String str3 = eVar2.f3237b;
                    if (!str3.isEmpty()) {
                        return str2.equals(str3) ? d(eVar2, bool) : str2.compareTo(str3) > 0 ? new a(new Object[]{eVar2, bool, eVar, str}) : new a(new Object[]{eVar, str, eVar2, bool});
                    }
                }
                return d(eVar, str);
            }
        }
        return d(eVar2, bool);
    }

    static a d(V2.e eVar, Object obj) {
        return (eVar == null || eVar.f3237b.isEmpty() || obj == null) ? a.f2475d : new a(new Object[]{eVar, obj});
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    int size();
}
