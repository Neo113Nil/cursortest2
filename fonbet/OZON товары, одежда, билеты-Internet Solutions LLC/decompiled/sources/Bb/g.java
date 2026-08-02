package Bb;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wb.C10468a;

/* loaded from: classes9.dex */
public final class g {
    @NotNull
    public static final ArrayList a(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<C10468a> I02 = C7714v.I0(new f(), list);
        ArrayList arrayList = new ArrayList(C7714v.z(I02, 10));
        for (C10468a c10468a : I02) {
            Intrinsics.checkNotNullParameter(c10468a, "<this>");
            arrayList.add(new Za.a(c10468a.a(), c10468a.b()));
        }
        return arrayList;
    }
}
