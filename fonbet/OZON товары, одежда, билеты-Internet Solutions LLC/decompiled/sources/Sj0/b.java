package Sj0;

import Qj0.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

/* loaded from: classes3.dex */
public final class b {
    @NotNull
    public static TraceEntity.VideoMetric a(@NotNull z0 videoMetric) {
        Intrinsics.checkNotNullParameter(videoMetric, "videoMetric");
        Integer d11 = videoMetric.d();
        Map<String, Integer> a11 = videoMetric.a();
        z0.a b11 = videoMetric.b();
        return new TraceEntity.VideoMetric(d11, videoMetric.g(), videoMetric.h(), videoMetric.i(), videoMetric.j(), videoMetric.f(), null, null, null, null, null, a11, new TraceEntity.ErrorDetails(b11 != null ? b11.a() : null, b11 != null ? b11.b() : null, b11 != null ? b11.c() : null), b(videoMetric.e()), b(videoMetric.c()));
    }

    private static final ArrayList b(List list) {
        ArrayList arrayList;
        List<z0.b.C0478b.a> a11;
        if (list == null) {
            return null;
        }
        List<z0.b> list2 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        for (z0.b bVar : list2) {
            String c11 = bVar.c();
            z0.b.a a12 = bVar.a();
            Double b11 = a12 != null ? a12.b() : null;
            z0.b.a a13 = bVar.a();
            Double g10 = a13 != null ? a13.g() : null;
            z0.b.a a14 = bVar.a();
            Double j11 = a14 != null ? a14.j() : null;
            z0.b.a a15 = bVar.a();
            Double f7 = a15 != null ? a15.f() : null;
            z0.b.a a16 = bVar.a();
            Double e11 = a16 != null ? a16.e() : null;
            z0.b.a a17 = bVar.a();
            Double d11 = a17 != null ? a17.d() : null;
            z0.b.a a18 = bVar.a();
            Double h11 = a18 != null ? a18.h() : null;
            z0.b.a a19 = bVar.a();
            Double i11 = a19 != null ? a19.i() : null;
            z0.b.a a21 = bVar.a();
            Double c12 = a21 != null ? a21.c() : null;
            z0.b.a a22 = bVar.a();
            Double a23 = a22 != null ? a22.a() : null;
            z0.b.a a24 = bVar.a();
            TraceEntity.VideoMetric.VideoFile.AppMetrics appMetrics = new TraceEntity.VideoMetric.VideoFile.AppMetrics(b11, g10, j11, null, f7, e11, d11, h11, i11, c12, a23, a24 != null ? a24.k() : null);
            z0.b.C0478b b12 = bVar.b();
            if (b12 == null || (a11 = b12.a()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C7714v.z(a11, 10));
                for (z0.b.C0478b.a aVar : a11) {
                    arrayList.add(new TraceEntity.VideoMetric.VideoFile.PlayerMetrics.ServerTimingData(aVar.c(), aVar.b(), aVar.a()));
                }
            }
            arrayList2.add(new TraceEntity.VideoMetric.VideoFile(c11, appMetrics, new TraceEntity.VideoMetric.VideoFile.PlayerMetrics(null, arrayList)));
        }
        return arrayList2;
    }
}
