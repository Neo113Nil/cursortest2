package Ud;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H {
    @NotNull
    public static final String a(@NotNull Sd.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String b11 = fVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        if (!C.f27587a.contains(b11)) {
            int i11 = 0;
            while (true) {
                if (i11 < b11.length()) {
                    char charAt = b11.charAt(i11);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i11++;
                } else if (b11.length() != 0 && Character.isJavaIdentifierStart(b11.codePointAt(0))) {
                    String b12 = fVar.b();
                    Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
                    return b12;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String b13 = fVar.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        sb2.append("`" + b13);
        sb2.append('`');
        return sb2.toString();
    }

    @NotNull
    public static final String b(@NotNull List<Sd.f> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Sd.f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(a(fVar));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String c(@NotNull String lowerRendered, @NotNull String lowerPrefix, @NotNull String upperRendered, @NotNull String upperPrefix, @NotNull String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (!kotlin.text.h.e0(lowerRendered, lowerPrefix, false) || !kotlin.text.h.e0(upperRendered, upperPrefix, false)) {
            return null;
        }
        String substring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String e11 = U7.d.e(foldedPrefix, substring);
        if (Intrinsics.d(substring, substring2)) {
            return e11;
        }
        if (!d(substring, substring2)) {
            return null;
        }
        return e11 + '!';
    }

    public static final boolean d(@NotNull String lower, @NotNull String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.d(lower, kotlin.text.h.X(upper, "?", "", false))) {
            return true;
        }
        if (kotlin.text.h.A(upper, "?", false)) {
            if (Intrinsics.d(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(lower);
        sb2.append(")?");
        return Intrinsics.d(sb2.toString(), upper);
    }
}
