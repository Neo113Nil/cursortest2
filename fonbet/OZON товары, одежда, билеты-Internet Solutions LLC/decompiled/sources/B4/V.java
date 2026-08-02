package B4;

import android.os.Bundle;
import j3.C7274p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import u3.InterfaceC9928b;

/* loaded from: classes8.dex */
public final /* synthetic */ class V implements O7.e, r.a {
    public /* synthetic */ V() {
    }

    public static Object a(Bundle bundle, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(bundle, str);
        Intrinsics.checkNotNullParameter(str2, str3);
        return bundle.get(str4);
    }

    public static String b(float f7, String str, StringBuilder sb2) {
        sb2.append(f7);
        sb2.append(str);
        return sb2.toString();
    }

    public static String c(StringBuilder sb2, Map map, String str, Map map2, String str2) {
        sb2.append(map);
        sb2.append(str);
        sb2.append(map2);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String d(StringBuilder sb2, boolean z11, char c11) {
        sb2.append(z11);
        sb2.append(c11);
        return sb2.toString();
    }

    public static ArrayList e(int i11, HashMap hashMap, ArrayList arrayList, int i12, String str) {
        hashMap.put(Integer.valueOf(i11), arrayList);
        ArrayList arrayList2 = new ArrayList(i12);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void f(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        C7274p c7274p = (C7274p) obj;
        return c7274p.f69180a + ": " + c7274p.f69181b;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    public /* synthetic */ V(InterfaceC9928b.a aVar, j3.s sVar) {
    }
}
