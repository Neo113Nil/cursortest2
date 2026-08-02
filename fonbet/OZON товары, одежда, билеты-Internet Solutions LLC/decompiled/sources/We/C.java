package We;

import I0.C3173b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final String f33537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f33539c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f33540d;

    /* renamed from: g, reason: collision with root package name */
    public static final a f33536g = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f33534e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f33535f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class a {
        @NotNull
        public static C a(@NotNull String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = C.f33534e.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C3173b.a('\"', "No subtype found for: \"", toMediaType).toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = group.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (group2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = group2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C.f33535f.matcher(toMediaType);
            int end = matcher.end();
            while (end < toMediaType.length()) {
                matcher2.region(end, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = toMediaType.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(B3.D.c(sb2, toMediaType, '\"').toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (kotlin.text.h.e0(group4, "'", false) && kotlin.text.h.A(group4, "'", false) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C(toMediaType, lowerCase, lowerCase2, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public static C b(@NotNull String toMediaTypeOrNull) {
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public C(String str, String str2, String str3, String[] strArr) {
        this.f33537a = str;
        this.f33538b = str2;
        this.f33539c = str3;
        this.f33540d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset c(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", AppMeasurementSdk.ConditionalUserProperty.NAME);
        String[] strArr = this.f33540d;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        kotlin.ranges.e m11 = kotlin.ranges.h.m(new IntRange(0, strArr.length - 1, 1), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c < 0 ? f71842a >= f71843b : f71842a <= f71843b) {
            while (!kotlin.text.h.D(strArr[f71842a], "charset", true)) {
                if (f71842a != f71843b) {
                    f71842a += f71844c;
                }
            }
            str = strArr[f71842a + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    @NotNull
    public final String d() {
        return this.f33539c;
    }

    @NotNull
    public final String e() {
        return this.f33538b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C) && Intrinsics.d(((C) obj).f33537a, this.f33537a);
    }

    public final int hashCode() {
        return this.f33537a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f33537a;
    }
}
