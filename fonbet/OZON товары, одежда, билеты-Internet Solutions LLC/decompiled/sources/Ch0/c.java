package Ch0;

import Ih0.n;
import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.network.models.PushStatusEvent;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV2;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV3;

/* loaded from: classes3.dex */
public final class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5051a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5052b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f5053c;

        static {
            int[] iArr = new int[Ih0.a.values().length];
            try {
                iArr[Ih0.a.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ih0.a.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5051a = iArr;
            int[] iArr2 = new int[Gh0.d.values().length];
            try {
                iArr2[Gh0.d.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Gh0.d.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f5052b = iArr2;
            int[] iArr3 = new int[n.values().length];
            try {
                iArr3[n.NOTIFICATION_EXTENSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[n.APP_LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[n.TASK_MANAGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f5053c = iArr3;
        }
    }

    private static final PushstatusRequestBodyV3.DeviceStats a(Kh0.a aVar) {
        Boolean valueOf;
        if (aVar.i() == null && aVar.h() == null) {
            valueOf = null;
        } else {
            Boolean i11 = aVar.i();
            Boolean bool = Boolean.TRUE;
            valueOf = Boolean.valueOf(Intrinsics.d(i11, bool) || Intrinsics.d(aVar.h(), bool));
        }
        Boolean bool2 = valueOf;
        return new PushstatusRequestBodyV3.DeviceStats(aVar.d(), aVar.c(), aVar.b(), aVar.e(), aVar.a(), aVar.g(), aVar.f(), bool2);
    }

    @NotNull
    public static final Gh0.b b(@NotNull Ih0.c cVar, Long l11) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new Gh0.b(cVar.f(), e(cVar.k()), cVar.b(), cVar.j(), l11, cVar.i(), cVar.c(), cVar.l(), cVar.h(), cVar.g(), cVar.e());
    }

    @NotNull
    public static final Gh0.a d(@NotNull Kh0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Gh0.a(0L, aVar.c(), aVar.b(), aVar.e(), aVar.a(), aVar.g(), aVar.f(), aVar.i(), aVar.h());
    }

    @NotNull
    public static final Gh0.d e(@NotNull Ih0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i11 = a.f5051a[aVar.ordinal()];
        if (i11 == 1) {
            return Gh0.d.DELIVERY;
        }
        if (i11 == 2) {
            return Gh0.d.OPEN;
        }
        throw new o();
    }

    @NotNull
    public static final PushStatusEvent.a f(@NotNull n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int i11 = a.f5053c[nVar.ordinal()];
        if (i11 == 1) {
            return PushStatusEvent.a.NOTIFICATION_EXTENSION;
        }
        if (i11 == 2) {
            return PushStatusEvent.a.APP_LAUNCH;
        }
        if (i11 == 3) {
            return PushStatusEvent.a.TASK_MANAGER;
        }
        throw new o();
    }

    @NotNull
    public static final Ih0.c g(@NotNull Gh0.c cVar) {
        Ih0.a aVar;
        Kh0.a aVar2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String e11 = cVar.a().e();
        Gh0.d j11 = cVar.a().j();
        Intrinsics.checkNotNullParameter(j11, "<this>");
        int i11 = a.f5052b[j11.ordinal()];
        if (i11 == 1) {
            aVar = Ih0.a.DELIVERY;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            aVar = Ih0.a.OPEN;
        }
        Long a11 = cVar.a().a();
        Integer i12 = cVar.a().i();
        Gh0.a b11 = cVar.b();
        if (b11 != null) {
            Intrinsics.checkNotNullParameter(b11, "<this>");
            aVar2 = new Kh0.a("", b11.c(), b11.b(), b11.e(), b11.a(), b11.g(), b11.f(), b11.i(), b11.h());
        } else {
            aVar2 = null;
        }
        return new Ih0.c(e11, aVar, a11, i12, aVar2, cVar.a().h(), cVar.a().b(), cVar.a().k(), cVar.a().g(), cVar.a().f(), cVar.a().d());
    }

    @NotNull
    public static final PushStatusEvent h(@NotNull Ih0.c cVar, @NotNull PushStatusEvent.a senderPlace, boolean z11) {
        PushStatusEvent.b bVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        String f7 = cVar.f();
        Ih0.a k11 = cVar.k();
        Intrinsics.checkNotNullParameter(k11, "<this>");
        int i11 = a.f5051a[k11.ordinal()];
        if (i11 == 1) {
            bVar = PushStatusEvent.b.DELIVERY;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            bVar = PushStatusEvent.b.OPEN;
        }
        PushStatusEvent.b bVar2 = bVar;
        Long b11 = cVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        Integer j11 = cVar.j();
        Kh0.a d11 = cVar.d();
        return new PushStatusEvent(f7, bVar2, b11, currentTimeMillis, senderPlace, z11, j11, cVar.i(), d11 != null ? a(d11) : null, cVar.c(), cVar.l(), cVar.h(), cVar.g(), cVar.e());
    }

    @NotNull
    public static final PushstatusRequestBodyV2 i(@NotNull List<Ih0.c> list, String str, @NotNull n senderPlace) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        PushStatusEvent.a f7 = f(senderPlace);
        List<Ih0.c> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Ih0.c cVar : list2) {
            arrayList.add(h(cVar, f7, Intrinsics.d(cVar.f(), str)));
        }
        return new PushstatusRequestBodyV2(arrayList);
    }

    @NotNull
    public static final PushstatusRequestBodyV3 j(@NotNull List<Ih0.c> list, String str, @NotNull n senderPlace, @NotNull Kh0.a deviceStats) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        Intrinsics.checkNotNullParameter(deviceStats, "deviceStats");
        PushStatusEvent.a f7 = f(senderPlace);
        List<Ih0.c> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Ih0.c cVar : list2) {
            arrayList.add(h(cVar, f7, Intrinsics.d(cVar.f(), str)));
        }
        return new PushstatusRequestBodyV3(arrayList, a(deviceStats));
    }

    @NotNull
    public static final Gh0.e k(@NotNull Ih0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new Gh0.e(cVar.f(), e(cVar.k()), cVar.j());
    }
}
