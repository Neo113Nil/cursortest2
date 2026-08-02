package W10;

import Sc.InterfaceC3999a;
import WZ.s;
import WZ.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes3.dex */
public final class e {
    @InterfaceC3999a
    private static final s a(TokenizedTrackingInfo tokenizedTrackingInfo, Long l11) {
        s.a aVar = new s.a();
        aVar.a(tokenizedTrackingInfo.getActionType());
        aVar.c(tokenizedTrackingInfo.getKey());
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        if (sliceKey != null) {
            aVar.h(sliceKey);
        }
        aVar.k(l11.longValue());
        Map<String, String> custom = tokenizedTrackingInfo.getCustom();
        if (custom != null) {
            aVar.d(custom);
        }
        return aVar.b();
    }

    public static t b(Map map, Long l11) {
        t tVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.entrySet().isEmpty()) {
            tVar = t.f33400b;
            return tVar;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Map.Entry entry : entrySet) {
            String type = (String) entry.getKey();
            Intrinsics.checkNotNullParameter(type, "type");
            YZ.a a11 = YZ.a.a(type);
            Tc.b builder = C7714v.B();
            builder.add(a((TokenizedTrackingInfo) entry.getValue(), l11));
            List<TokenizedTrackingInfo> nested = ((TokenizedTrackingInfo) entry.getValue()).getNested();
            if (nested != null) {
                Iterator<T> it = nested.iterator();
                while (it.hasNext()) {
                    builder.add(a((TokenizedTrackingInfo) it.next(), l11));
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            Pair pair = new Pair(a11, builder.B());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new t(linkedHashMap);
    }
}
