package An;

import i10.l;
import io.sentry.W2;
import io.sentry.util.l;
import java.util.List;
import l10.InterfaceC7851b;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: An.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2439a implements l.a {
    public static String a(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static void b(long j11, Integer num, int i11, InterfaceC7851b interfaceC7851b) {
        interfaceC7851b.e(new l.a.b(j11, num, i11));
    }

    public static void c(String str, String str2, String str3, StringBuilder sb2, AtomAction atomAction) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(atomAction);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return W2.empty();
    }
}
