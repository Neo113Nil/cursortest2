package p120q4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15868a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f15869b;

    public final String a(String str) {
        StringBuilder sbD = e.d(str, "<value>: ");
        sbD.append(this.f15869b);
        sbD.append("\n");
        String string = sbD.toString();
        HashMap map = this.f15868a;
        if (map.isEmpty()) {
            return k.f(string, str, "<empty>");
        }
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbD2 = e.d(string, str);
            sbD2.append(entry.getKey());
            sbD2.append(":\n");
            sbD2.append(((i) entry.getValue()).a(str + "\t"));
            sbD2.append("\n");
            string = sbD2.toString();
        }
        return string;
    }
}
