package H5;

import B4.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f10622c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f10623a;

    /* renamed from: b, reason: collision with root package name */
    private f f10624b;

    public e(String... strArr) {
        this.f10623a = Arrays.asList(strArr);
    }

    public final e a(String str) {
        e eVar = new e(this);
        eVar.f10623a.add(str);
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i11, String str) {
        List<String> list = this.f10623a;
        if (i11 < list.size()) {
            boolean z11 = i11 == list.size() - 1;
            String str2 = list.get(i11);
            if (!str2.equals("**")) {
                boolean z12 = str2.equals(str) || str2.equals("*");
                if ((z11 || (i11 == list.size() - 2 && list.get(list.size() - 1).equals("**"))) && z12) {
                    return true;
                }
            } else {
                if (z11 || !list.get(i11 + 1).equals(str)) {
                    if (!z11) {
                        int i12 = i11 + 1;
                        if (i12 >= list.size() - 1) {
                            return list.get(i12).equals(str);
                        }
                    }
                    return true;
                }
                if (i11 == list.size() - 2 || (i11 == list.size() - 3 && list.get(list.size() - 1).equals("**"))) {
                }
            }
        }
        return false;
    }

    public final f c() {
        return this.f10624b;
    }

    public final int d(int i11, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f10623a;
        if (list.get(i11).equals("**")) {
            return (i11 != list.size() - 1 && list.get(i11 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean e(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f10623a;
        if (i11 >= list.size()) {
            return false;
        }
        return list.get(i11).equals(str) || list.get(i11).equals("**") || list.get(i11).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f10623a.equals(eVar.f10623a)) {
                return false;
            }
            f fVar = this.f10624b;
            f fVar2 = eVar.f10624b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f10623a;
        return i11 < list.size() - 1 || list.get(i11).equals("**");
    }

    public final e g(f fVar) {
        e eVar = new e(this);
        eVar.f10624b = fVar;
        return eVar;
    }

    public final int hashCode() {
        int hashCode = this.f10623a.hashCode() * 31;
        f fVar = this.f10624b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f10623a);
        sb2.append(",resolved=");
        return V.d(sb2, this.f10624b != null, '}');
    }

    private e(e eVar) {
        this.f10623a = new ArrayList(eVar.f10623a);
        this.f10624b = eVar.f10624b;
    }
}
