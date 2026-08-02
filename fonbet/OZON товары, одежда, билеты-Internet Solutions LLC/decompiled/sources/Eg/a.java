package Eg;

import java.util.IdentityHashMap;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class a {
    private static final void a(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("\t");
        }
    }

    public static final void b(@NotNull Throwable th2, @NotNull StringBuilder out) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        c(th2, out, 0, "", stackTrace, 0, new IdentityHashMap());
    }

    private static final void c(Throwable th2, StringBuilder out, int i11, String str, StackTraceElement[] stackTraceElementArr, int i12, IdentityHashMap identityHashMap) {
        String fileName;
        int i13 = 1;
        if (identityHashMap.containsKey(th2)) {
            a(1, out);
            Appendable append = out.append("[CIRCULAR REFERENCE: ").append(th2.toString()).append("]");
            Intrinsics.checkNotNullExpressionValue(append, "out.appendIndent(1)\n    …s.toString()).append(\"]\")");
            Intrinsics.checkNotNullExpressionValue(append.append('\n'), "append('\\n')");
            return;
        }
        Intrinsics.checkNotNullParameter(identityHashMap, "<this>");
        identityHashMap.put(th2, Unit.f71690a);
        a(i11, out);
        Appendable append2 = out.append((CharSequence) str).append(th2.toString());
        Intrinsics.checkNotNullExpressionValue(append2, "out.appendIndent(indent)…).append(this.toString())");
        Intrinsics.checkNotNullExpressionValue(append2.append('\n'), "append('\\n')");
        if (th2 instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            while (i13 < length) {
                if (Intrinsics.d(stackTraceElement, stackTraceElementArr[i13])) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        i13 = 0;
        int length2 = i13 > 0 ? i13 : stackTraceElementArr.length - i12;
        for (int i14 = 0; i14 < length2; i14++) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i14];
            Intrinsics.checkNotNullParameter(stackTraceElement2, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            Intrinsics.checkNotNullParameter("at ", "prefix");
            a(i11 + 1, out);
            out.append("at ");
            if (stackTraceElement2.isNativeMethod()) {
                fileName = "Native Method";
            } else {
                fileName = stackTraceElement2.getFileName();
                if (fileName == null) {
                    fileName = "Unknown Source";
                }
            }
            out.append((CharSequence) stackTraceElement2.getClassName()).append(".").append(stackTraceElement2.getMethodName()).append("(").append(fileName);
            if (stackTraceElement2.getLineNumber() >= 0) {
                out.append(ProductContainerDTO.RATIO_DELIMITER).append(String.valueOf(stackTraceElement2.getLineNumber()));
            }
            Appendable append3 = out.append(")");
            Intrinsics.checkNotNullExpressionValue(append3, "out.append(\")\")");
            Intrinsics.checkNotNullExpressionValue(append3.append('\n'), "append('\\n')");
        }
        if (i13 > 0) {
            a(i11 + 1, out);
            Appendable append4 = out.append("... ").append(String.valueOf(i13)).append(" calls repeat");
            Intrinsics.checkNotNullExpressionValue(append4, "out.appendIndent(indent …).append(\" calls repeat\")");
            Intrinsics.checkNotNullExpressionValue(append4.append('\n'), "append('\\n')");
        } else if (i12 != 0) {
            a(i11 + 1, out);
            Appendable append5 = out.append("... ").append(String.valueOf(i12)).append(" more");
            Intrinsics.checkNotNullExpressionValue(append5, "out.appendIndent(indent …String()).append(\" more\")");
            Intrinsics.checkNotNullExpressionValue(append5.append('\n'), "append('\\n')");
        }
        Throwable[] suppressed = th2.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "suppressed");
        for (Throwable supp : suppressed) {
            StackTraceElement[] suppTrace = supp.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(supp, "supp");
            Intrinsics.checkNotNullExpressionValue(suppTrace, "suppTrace");
            c(supp, out, i11 + 1, "Suppressed: ", suppTrace, d(stackTraceElementArr, suppTrace), identityHashMap);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            StackTraceElement[] causeTrace = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(causeTrace, "causeTrace");
            c(cause, out, i11, "Caused by: ", causeTrace, d(stackTraceElementArr, causeTrace), identityHashMap);
        }
    }

    private static final int d(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int I11 = C7705l.I(stackTraceElementArr);
        for (int I12 = C7705l.I(stackTraceElementArr2); I11 >= 0 && I12 >= 0 && Intrinsics.d(stackTraceElementArr[I11], stackTraceElementArr2[I12]); I12--) {
            I11--;
        }
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        return (stackTraceElementArr.length - 1) - I11;
    }
}
