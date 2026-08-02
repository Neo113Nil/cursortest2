package L30;

import H30.x;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static List a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        ArrayList arrayList = new ArrayList();
        if (host != null) {
            if (kotlin.text.h.e0(host, "www.", false)) {
                host = host.substring(4);
                Intrinsics.checkNotNullExpressionValue(host, "substring(...)");
            }
            arrayList.add(host);
            arrayList.add("." + host);
            List<String> E11 = C7714v.E(kotlin.text.h.m(host, new String[]{"."}, 0, 6));
            if (E11.size() <= 1) {
                E11 = null;
            }
            if (E11 != null) {
                String str = "";
                for (String str2 : E11) {
                    str = str.length() == 0 ? str2 : G.g.c(str, ".", str2);
                    String X9 = kotlin.text.h.X(host, str, "", false);
                    if (X9.length() <= 0) {
                        X9 = null;
                    }
                    if (X9 != null) {
                        arrayList.add(X9);
                    }
                }
            }
        }
        return (arrayList.isEmpty() || arrayList.size() <= 2) ? arrayList : C7714v.E(arrayList);
    }

    @NotNull
    public static List b(@NotNull Uri uri) {
        List m11;
        List list;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String b11 = x.b(uri);
        if (b11 != null && (m11 = kotlin.text.h.m(b11, new String[]{"/"}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : m11) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            int z11 = C7714v.z(arrayList, 9);
            if (z11 == 0) {
                list = C7714v.a0("/");
            } else {
                ArrayList arrayList2 = new ArrayList(z11 + 1);
                arrayList2.add("/");
                Iterator it = arrayList.iterator();
                String str = "/";
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    str = Intrinsics.d(str, "/") ? str2 : G.g.c(str, "/", str2);
                    arrayList2.add(str);
                }
                list = arrayList2;
            }
            if (list != null) {
                return list;
            }
        }
        return K.f71697a;
    }
}
