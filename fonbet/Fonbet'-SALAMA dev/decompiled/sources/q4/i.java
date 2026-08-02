package q4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15862a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public List f15863b;

    public final String a(String str) {
        StringBuilder d7 = t.e.d(str, "<value>: ");
        d7.append(this.f15863b);
        d7.append("\n");
        String sb = d7.toString();
        HashMap hashMap = this.f15862a;
        if (hashMap.isEmpty()) {
            return e1.k.f(sb, str, "<empty>");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder d8 = t.e.d(sb, str);
            d8.append(entry.getKey());
            d8.append(":\n");
            d8.append(((i) entry.getValue()).a(str + "\t"));
            d8.append("\n");
            sb = d8.toString();
        }
        return sb;
    }
}
