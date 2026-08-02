package Ya;

import Ja.h;
import Ja.j;
import Sc.o;
import Wa.e;
import We.F;
import We.G;
import We.L;
import We.z;
import com.vk.knet.cornet.b;
import ef.C6358h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;
import sf.M;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: Ya.a$a, reason: collision with other inner class name */
    public static final class C0644a {
        private static z a(j jVar) {
            z.a aVar = new z.a();
            for (Map.Entry<String, List<String>> entry : jVar.j().entrySet()) {
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    try {
                        aVar.d(entry.getKey(), (String) it.next());
                    } catch (Exception e11) {
                        e.b(b.a.CLIENT_CALLBACK, "[cronet] call response header " + ((Object) entry.getKey()) + " failed " + e11);
                    }
                }
            }
            return aVar.e();
        }

        public static L b(@NotNull j receiver, @NotNull G request, long j11, boolean z11) {
            C6358h c6358h;
            F f7;
            InterfaceC9683i interfaceC9683i;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(request, "request");
            La.a c11 = receiver.c();
            if (c11 != null) {
                String d11 = receiver.d();
                if (d11 == null) {
                    d11 = "application/x-www-form-urlencoded;charset=utf-8";
                }
                M k11 = sf.z.k(c11.c());
                long d12 = c11.d();
                if (z11) {
                    C9681g c9681g = new C9681g();
                    try {
                        c9681g.y0(k11);
                        Unit unit = Unit.f71690a;
                        k11.close();
                        interfaceC9683i = c9681g;
                    } finally {
                    }
                } else {
                    interfaceC9683i = sf.z.d(k11);
                }
                c6358h = new C6358h(d11, d12, interfaceC9683i);
            } else {
                c6358h = null;
            }
            try {
                int m11 = receiver.m();
                String o11 = receiver.o();
                int i11 = b.f34880a[receiver.k().ordinal()];
                if (i11 == 1) {
                    f7 = F.HTTP_1_0;
                } else if (i11 == 2) {
                    f7 = F.HTTP_1_1;
                } else if (i11 == 3) {
                    f7 = F.HTTP_2;
                } else if (i11 == 4) {
                    f7 = F.SPDY_3;
                } else {
                    if (i11 != 5) {
                        throw new o();
                    }
                    f7 = F.QUIC;
                }
                L.a aVar = new L.a();
                aVar.f(m11);
                aVar.l(o11);
                aVar.o(f7);
                aVar.j(a(receiver));
                aVar.b(c6358h);
                aVar.r(request);
                aVar.s(j11);
                aVar.p(System.currentTimeMillis());
                return aVar.c();
            } catch (Exception e11) {
                e.b(b.a.CLIENT_CALLBACK, "[cronet] call response mapping failed " + e11);
                return null;
            }
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34880a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.SPDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f34880a = iArr;
        }
    }

    L toOkResponse(@NotNull j jVar, @NotNull G g10, long j11, boolean z11);
}
