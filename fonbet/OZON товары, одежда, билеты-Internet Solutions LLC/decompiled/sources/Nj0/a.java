package Nj0;

import E0.C2942q;
import Mj0.i;
import V.e;
import We.B;
import We.C;
import We.G;
import We.K;
import We.L;
import We.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes7.dex */
public final class a implements B {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f19602b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f19603a;

    public a(@NotNull i trackerLogger) {
        Intrinsics.checkNotNullParameter(trackerLogger, "trackerLogger");
        this.f19603a = trackerLogger;
    }

    private static void a(StringBuilder sb2, String str, String str2) {
        sb2.append(e.a("-H \"", str, ": ", str2, "\" "));
    }

    private final void b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("\n\n");
        sb2.append("URL: " + str);
        sb2.append("\n────────────────────────────────────────────\n");
        sb2.append(str2);
        this.f19603a.log(C2942q.c(sb2, "  \n──────────────────────────────────────────── \n ", "toString(...)"));
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            G request = chain.request();
            StringBuilder sb2 = new StringBuilder("");
            sb2.append("curl ");
            sb2.append("-X ");
            String upperCase = request.h().toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase + " ");
            z e11 = request.e();
            e11.getClass();
            Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
            Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
            Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
            TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                treeSet.add(e11.e(i11));
            }
            Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiableSet(result)");
            for (String str : unmodifiableSet) {
                a(sb2, str, request.e().c(str));
            }
            K a11 = request.a();
            if (a11 != null) {
                C9681g c9681g = new C9681g();
                a11.writeTo(c9681g);
                C contentType = a11.getContentType();
                if (contentType != null) {
                    a(sb2, "Content-Type", contentType.toString());
                    Charset charset = f19602b;
                    Charset c11 = contentType.c(charset);
                    if (c11 != null) {
                        charset = c11;
                    }
                    Intrinsics.f(charset);
                    sb2.append(" -d '" + c9681g.t0(charset) + "'");
                }
            }
            sb2.append(" \"" + request.j() + "\"");
            sb2.append(" -L");
            String a12 = request.j().toString();
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            b(a12, sb3);
        } catch (Exception unused) {
        }
        return chain.proceed(chain.request());
    }
}
