package N9;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Set f18807a;

    /* renamed from: b, reason: collision with root package name */
    private EnumMap f18808b;

    /* renamed from: c, reason: collision with root package name */
    private String f18809c;

    /* renamed from: d, reason: collision with root package name */
    private int f18810d;

    public h(Set set, EnumMap enumMap, String str, int i11) {
        this.f18807a = set;
        this.f18808b = enumMap;
        this.f18809c = str;
        this.f18810d = i11;
    }

    public final f a(HashMap hashMap) {
        EnumMap enumMap = new EnumMap(h9.e.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = this.f18808b;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = this.f18807a;
        if (set != null) {
            enumMap.put((EnumMap) h9.e.POSSIBLE_FORMATS, (h9.e) set);
        }
        String str = this.f18809c;
        if (str != null) {
            enumMap.put((EnumMap) h9.e.CHARACTER_SET, (h9.e) str);
        }
        h9.k kVar = new h9.k();
        kVar.e(enumMap);
        int i11 = this.f18810d;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? new f(kVar) : new j(kVar) : new i(kVar) : new f(kVar);
    }
}
