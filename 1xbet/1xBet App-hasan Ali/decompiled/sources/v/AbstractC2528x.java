package v;

import A0.C0022e0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import o4.AbstractC2234l;
import y.C2650f;
import y.C2654j;
import z.AbstractC2701c;

/* renamed from: v.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2528x {
    public static final void a(b0.p pVar, i4.c cVar, C0315s c0315s, int i) {
        c0315s.Z(-932836462);
        if ((((c0315s.f(pVar) ? 4 : 2) | i | (c0315s.h(cVar) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC2701c.b(c0315s, androidx.compose.ui.draw.a.a(pVar, cVar));
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 14, pVar, cVar);
        }
    }

    public static final InterfaceC0289e0 b(C2654j c2654j, C0315s c0315s, int i) {
        Object M5 = c0315s.M();
        P.Z z3 = C0302l.f4480a;
        if (M5 == z3) {
            M5 = AbstractC0329z.t(Boolean.FALSE);
            c0315s.i0(M5);
        }
        InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
        boolean z5 = (((i & 14) ^ 6) > 4 && c0315s.f(c2654j)) || (i & 6) == 4;
        Object M6 = c0315s.M();
        if (z5 || M6 == z3) {
            M6 = new C2650f(c2654j, interfaceC0289e0, null);
            c0315s.i0(M6);
        }
        AbstractC0329z.e(c0315s, (i4.e) M6, c2654j);
        return interfaceC0289e0;
    }

    public static final double c(int i, int i5, int i6, int i7, F2.g gVar) {
        double d5 = i6 / i;
        double d6 = i7 / i5;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return Math.max(d5, d6);
        }
        if (ordinal == 1) {
            return Math.min(d5, d6);
        }
        throw new D2.e();
    }

    public static y4.q d(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        Matcher matcher = y4.q.f21370d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        kotlin.jvm.internal.l.e("typeSubtype.group(1)", group);
        Locale locale = Locale.US;
        kotlin.jvm.internal.l.e("US", locale);
        String lowerCase = group.toLowerCase(locale);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
        String group2 = matcher.group(2);
        kotlin.jvm.internal.l.e("typeSubtype.group(2)", group2);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", group2.toLowerCase(locale));
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = y4.q.f21371e.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring);
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(L1.a.p(sb, str, '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (AbstractC2234l.x0(group4, "'", false) && AbstractC2234l.r0(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", group4);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new y4.q(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }
}
