package L00;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class k extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f16131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar) {
        super(0);
        this.f16131b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String substring;
        String str = this.f16131b.c().get("server-timing");
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Iterator it = kotlin.text.h.m(str, new String[]{","}, 0, 6).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List m11 = kotlin.text.h.m((String) it.next(), new String[]{";"}, 0, 6);
                Object Q11 = C7714v.Q(0, m11);
                if (!Intrinsics.d((String) Q11, "RequestID")) {
                    Q11 = null;
                }
                if (((String) Q11) != null) {
                    String str2 = (String) C7714v.Q(1, m11);
                    if (str2 != null) {
                        int J11 = kotlin.text.h.J(str2, "=", 0, false, 6);
                        if (J11 == -1) {
                            substring = null;
                        } else {
                            substring = str2.substring(J11 + 1, str2.length());
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        }
                        if (substring != null) {
                            return kotlin.text.h.B0(substring, '\"');
                        }
                    }
                }
            }
        }
        return null;
    }
}
