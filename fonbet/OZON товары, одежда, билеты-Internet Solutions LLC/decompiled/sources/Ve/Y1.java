package Ve;

import Lm0.a;
import Sc.C4001c;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kg.C7676a;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes10.dex */
public final class Y1 extends a.C0333a {

    /* renamed from: d, reason: collision with root package name */
    public static final List f30425d = C7714v.b0("authCode", "clientId", "dynatraceApplicationId", "client_id");

    /* renamed from: c, reason: collision with root package name */
    public final Object f30426c = kotlin.collections.U.j(new Pair(2, "VERBOSE"), new Pair(3, "DEBUG"), new Pair(4, "INFO"), new Pair(5, "WARN"), new Pair(6, "ERROR"), new Pair(7, "ASSERT"));

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    @Override // Lm0.a.C0333a, Lm0.a.c
    public final void log(int i11, String str, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str2 = AbstractC4623sl.f32063a;
        Intrinsics.checkNotNullParameter(message, "message");
        ArrayList arrayList = new ArrayList();
        arrayList.add("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        if (str != null) {
            String concat = "│ ".concat(str);
            Intrinsics.checkNotNullExpressionValue(concat, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(concat);
            String a11 = C7676a.e("HH:mm:ss.SSS │ dd.MM.YYYY").a(ig.g.u1(ig.p.f()));
            Intrinsics.checkNotNullExpressionValue(a11, "run {\n        val localD…ime.format(pattern)\n    }");
            String str3 = "│ " + a11;
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(str3);
            arrayList.add("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
        }
        byte[] bytes = message.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        if (length <= 4000) {
            arrayList.addAll(AbstractC4623sl.a(message));
        } else {
            for (int i12 = 0; i12 < length; i12 += 4000) {
                int i13 = length - i12;
                if (i13 > 4000) {
                    i13 = 4000;
                }
                arrayList.addAll(AbstractC4623sl.a(new String(bytes, i12, i13, Charsets.UTF_8)));
            }
        }
        if (th2 != null) {
            arrayList.add("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null && (localizedMessage = th2.getMessage()) == null) {
                localizedMessage = "";
            }
            String concat2 = "│ ".concat(localizedMessage);
            Intrinsics.checkNotNullExpressionValue(concat2, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(concat2);
            arrayList.addAll(AbstractC4623sl.a(C4001c.b(th2)));
        }
        arrayList.add("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        for (String str4 : C7714v.U0(arrayList)) {
            for (String str5 : f30425d) {
                str4 = new Regex(B0.A0.b("\"?", str5, "\"?.*?[&,]")).replace(str4, "\"" + str5 + "\":\"***\"");
            }
            ?? r13 = this.f30426c;
            if (!Intrinsics.d(r13.get(Integer.valueOf(i11)), r13.get(3))) {
                Log.println(i11, "SPaySdk", str4);
            }
        }
    }
}
