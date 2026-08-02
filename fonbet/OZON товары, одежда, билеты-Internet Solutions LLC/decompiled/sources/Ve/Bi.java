package Ve;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Bi {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4443me f28707a;

    /* renamed from: b, reason: collision with root package name */
    public final Ur f28708b;

    /* renamed from: c, reason: collision with root package name */
    public final Pe f28709c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f28710d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f28711e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28712f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28713g;

    public Bi(InterfaceC4443me action, Ur view, Pe actionType, Map map, Integer num, String str, String str2, int i11) {
        view = (i11 & 2) != 0 ? Ur.NONE : view;
        map = (i11 & 8) != 0 ? null : map;
        num = (i11 & 16) != 0 ? null : num;
        str = (i11 & 32) != 0 ? null : str;
        str2 = (i11 & 64) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f28707a = action;
        this.f28708b = view;
        this.f28709c = actionType;
        this.f28710d = map;
        this.f28711e = num;
        this.f28712f = str;
        this.f28713g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bi)) {
            return false;
        }
        Bi bi = (Bi) obj;
        return Intrinsics.d(this.f28707a, bi.f28707a) && this.f28708b == bi.f28708b && this.f28709c == bi.f28709c && Intrinsics.d(this.f28710d, bi.f28710d) && Intrinsics.d(this.f28711e, bi.f28711e) && Intrinsics.d(this.f28712f, bi.f28712f) && Intrinsics.d(this.f28713g, bi.f28713g);
    }

    public final int hashCode() {
        int hashCode = (this.f28709c.hashCode() + ((this.f28708b.hashCode() + (this.f28707a.hashCode() * 31)) * 31)) * 31;
        Map map = this.f28710d;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f28711e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f28712f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28713g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricEvent(action=");
        sb2.append(this.f28707a);
        sb2.append(", view=");
        sb2.append(this.f28708b);
        sb2.append(", actionType=");
        sb2.append(this.f28709c);
        sb2.append(", actionParams=");
        sb2.append(this.f28710d);
        sb2.append(", httpCode=");
        sb2.append(this.f28711e);
        sb2.append(", errorCode=");
        sb2.append(this.f28712f);
        sb2.append(", parsingError=");
        return C.o0.c(sb2, this.f28713g, ")");
    }
}
