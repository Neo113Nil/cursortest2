package H4;

import W5.AbstractC0486a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f3331b = new m(Collections.emptyList());

    public static m y(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new m(arrayList);
    }

    @Override // H4.e
    public final String c() {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        while (true) {
            List list = this.f3312a;
            if (i7 >= list.size()) {
                return sb.toString();
            }
            if (i7 > 0) {
                sb.append("/");
            }
            sb.append((String) list.get(i7));
            i7++;
        }
    }

    @Override // H4.e
    public final e f(List list) {
        return new m(list);
    }
}
