package T90;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.FeatureFlag;

/* loaded from: classes3.dex */
public final class e {
    @NotNull
    public static final ArrayList a(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((FeatureFlag) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final FeatureFlag b(@NotNull FeatureFlag featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "<this>");
        return new FeatureFlag(featureFlag.getFeatureName(), h.X(h.X(featureFlag.getFeatureFlagValue(), "\\\\", "", false), "\n", "", false));
    }

    @NotNull
    public static final LinkedHashMap c(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int h11 = U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlag = (FeatureFlag) it.next();
            int min = Math.min(30, featureFlag.getFeatureFlagValue().length());
            String featureFlagValue = featureFlag.getFeatureFlagValue();
            IntRange range = kotlin.ranges.h.o(0, min);
            Intrinsics.checkNotNullParameter(featureFlagValue, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            String substring = featureFlagValue.substring(range.getStart().intValue(), range.getF71843b() + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Pair pair = new Pair(featureFlag.getFeatureName(), h.X(h.X(h.X(h.X(h.X(substring, " ", "", false), "\n", "", false), "\"", "", false), "{", "", false), "}", "", false));
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }
}
