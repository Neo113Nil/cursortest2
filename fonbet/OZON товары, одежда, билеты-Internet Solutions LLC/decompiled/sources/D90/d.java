package D90;

import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6197a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int compareToIgnoreCase;
        String str = (String) obj;
        String other = (String) obj2;
        Intrinsics.f(str);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = this.f6197a;
        boolean t2 = kotlin.text.h.t(lowerCase, str2, false);
        Intrinsics.f(other);
        String lowerCase2 = other.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        boolean t11 = kotlin.text.h.t(lowerCase2, str2, false);
        if (t2 && !t11) {
            compareToIgnoreCase = -1;
        } else if (t2 || !t11) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            compareToIgnoreCase = str.compareToIgnoreCase(other);
        } else {
            compareToIgnoreCase = 1;
        }
        return Integer.valueOf(compareToIgnoreCase);
    }
}
