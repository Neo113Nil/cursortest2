package XZ;

import B0.A0;
import WZ.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<e> f34217a;

    public c(@NotNull Sg.a analyticsScreenStorage, @NotNull Set<YZ.a> supportedTypes) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        this.f34217a = C7714v.a0(new e(analyticsScreenStorage, supportedTypes));
    }

    public final f a(@NotNull String eventType, @NotNull s tokenizedData) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tokenizedData, "tokenizedData");
        List<e> list = this.f34217a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e) obj).b().contains(YZ.a.a(eventType))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalArgumentException(A0.b("find duplicate event type in different factories: ", C7714v.V(arrayList, null, null, null, null, 63), "}"));
        }
        if (!arrayList.isEmpty()) {
            return ((e) C7714v.K(arrayList)).a(eventType, tokenizedData);
        }
        H00.c.e(new b(eventType));
        return null;
    }
}
