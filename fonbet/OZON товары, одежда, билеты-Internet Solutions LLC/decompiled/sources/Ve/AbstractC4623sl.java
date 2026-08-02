package Ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: Ve.sl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4623sl {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32063a;

    static {
        String lineSeparator = System.lineSeparator();
        if (lineSeparator == null) {
            lineSeparator = "\n";
        }
        f32063a = lineSeparator;
    }

    public static ArrayList a(String str) {
        List i11 = new Regex(f32063a).i(str);
        ArrayList arrayList = new ArrayList(C7714v.z(i11, 10));
        Iterator it = i11.iterator();
        while (it.hasNext()) {
            String str2 = "│ " + ((String) it.next());
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(str2);
        }
        return arrayList;
    }
}
