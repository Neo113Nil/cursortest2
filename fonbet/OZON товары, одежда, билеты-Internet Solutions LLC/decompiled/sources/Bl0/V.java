package Bl0;

import Bl0.Z;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3950c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final H f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final T f3952b;

    public V(H persistentMetricsEventRepository, T sendMetricsEventBatchUseCase) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(sendMetricsEventBatchUseCase, "sendMetricsEventBatchUseCase");
        this.f3951a = persistentMetricsEventRepository;
        this.f3952b = sendMetricsEventBatchUseCase;
    }

    public final void a() {
        synchronized (f3950c) {
            while (true) {
                try {
                    Z a11 = this.f3952b.a();
                    if (a11.equals(Z.a.f3955a)) {
                        Unit unit = Unit.f71690a;
                    } else if (a11 instanceof Z.b) {
                        H h11 = this.f3951a;
                        ArrayList persistentMetricsEvents = ((Z.b) a11).f3956a;
                        Intrinsics.checkNotNullParameter(persistentMetricsEvents, "persistentMetricsEvents");
                        C2662x c2662x = h11.f3920a;
                        ArrayList arrayList = new ArrayList(C7714v.z(persistentMetricsEvents, 10));
                        int size = persistentMetricsEvents.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = persistentMetricsEvents.get(i11);
                            i11++;
                            C2650k model = (C2650k) obj;
                            Intrinsics.checkNotNullParameter(model, "model");
                            String str = model.f3983a;
                            byte[] bytes = W.a(model.f3984b).getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                            arrayList.add(new C2664z(str, bytes));
                        }
                        c2662x.a(arrayList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
