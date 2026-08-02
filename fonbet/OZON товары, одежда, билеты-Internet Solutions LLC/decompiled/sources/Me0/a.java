package Me0;

import Le0.z;
import We.A;
import We.B;
import We.G;
import We.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17939a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17940b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17941c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f17942d;

    /* renamed from: e, reason: collision with root package name */
    private final b f17943e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer] */
    public a(String tileUrl, String str, b bVar) {
        b bVar2;
        String str2;
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(tileUrl, "tileUrl");
        this.f17939a = tileUrl;
        this.f17940b = str;
        this.f17941c = bVar;
        List b02 = C7714v.b0("{z}", "{x}", "{y}");
        ArrayList arrayList = new ArrayList();
        Iterator it = b02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int J11 = h.J(this.f17939a, (String) it.next(), 0, false, 6);
            bVar2 = J11 >= 0 ? Integer.valueOf(J11) : null;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
        }
        Integer num = (Integer) C7714v.h0(arrayList);
        if (num != null) {
            str2 = this.f17939a.substring(0, num.intValue());
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        } else {
            str2 = this.f17939a;
        }
        this.f17942d = str2;
        b bVar3 = this.f17941c;
        if (bVar3 != null) {
            z.Companion.getClass();
            j11 = z.minTileLifeTime;
            b e11 = b.e(j11);
            j12 = z.maxTileLifeTime;
            bVar2 = (b) kotlin.ranges.h.h(bVar3, e11, b.e(j12));
        }
        this.f17943e = bVar2;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        b bVar;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        boolean e02 = h.e0(request.j().toString(), this.f17942d, false);
        if (e02 && (str = this.f17940b) != null) {
            A.a j11 = request.j().j();
            j11.g(str);
            A e11 = j11.e();
            G.a aVar = new G.a(request);
            aVar.j(e11);
            request = aVar.b();
        }
        L proceed = chain.proceed(request);
        if (!e02 || (bVar = this.f17943e) == null) {
            return proceed;
        }
        proceed.getClass();
        L.a aVar2 = new L.a(proceed);
        aVar2.q("expires");
        aVar2.q("cache-control");
        aVar2.a("cache-control", "max-age=" + b.o(bVar.getF71985a(), EnumC10311b.SECONDS));
        return aVar2.c();
    }
}
