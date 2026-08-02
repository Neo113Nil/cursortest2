package Ya;

import B0.C2454a;
import Ja.d;
import Ja.i;
import We.C;
import We.G;
import We.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes.dex */
public interface b {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [Ka.b] */
        /* JADX WARN: Type inference failed for: r5v2, types: [Ka.b] */
        public static i a(@NotNull G receiver, boolean z11) {
            HashMap hashMap;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            String a11 = receiver.j().toString();
            d.a aVar = d.Companion;
            String name = receiver.h();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            String upperCase = name.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            hashMap = d.methodMap;
            d dVar = (d) hashMap.get(upperCase);
            if (dVar == null) {
                return null;
            }
            K a12 = receiver.a();
            C contentType = a12 != null ? a12.getContentType() : null;
            Map i11 = receiver.e().i();
            if (contentType != null) {
                String c11 = contentType.toString();
                Intrinsics.checkNotNullParameter(c11, "<this>");
                List m11 = h.m(c11, new String[]{", "}, 0, 6);
                ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
                Iterator it = m11.iterator();
                while (it.hasNext()) {
                    C2454a.g((String) it.next(), arrayList);
                }
                i11 = U.n(i11, new Pair("Content-Type", arrayList));
            }
            Map map = i11;
            int i12 = C0645b.f34881a[dVar.ordinal()];
            if ((i12 == 1 || i12 == 2 || i12 == 3) && a12 != null) {
                C contentType2 = a12.getContentType();
                r0 = contentType2 != null ? contentType2.toString() : null;
                C9681g c9681g = new C9681g();
                a12.writeTo(c9681g);
                r0 = new Ka.b(r0, c9681g.g0());
            }
            return new i(dVar, a11, map, r0, null, z11);
        }
    }

    /* renamed from: Ya.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0645b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34881a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34881a = iArr;
        }
    }

    i toKnetRequest(@NotNull G g10, boolean z11);
}
