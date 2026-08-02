package ag0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.utils.FeatureDTOUtilsKt;

/* renamed from: ag0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5021a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f36778a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36779b = 0;

    static {
        AbstractC8919b.AbstractC1361b.a aVar = AbstractC8919b.AbstractC1361b.a.f80503b;
        String featureFlagDisplayedName$default = FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки AbTool", null, "https://jit.o3.ru/browse/MP-2867", 2, null);
        String concat = "abtool".concat("_ozon_network_enabled_android");
        ValueType valueType = ValueType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(aVar, new FeatureDTO(featureFlagDisplayedName$default, "ozon_network", concat, valueType, bool, null, UpdateStrategy.AS_FETCHED));
        AbstractC8919b.AbstractC1361b.g gVar = AbstractC8919b.AbstractC1361b.g.f80509b;
        String featureFlagDisplayedName$default2 = FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки Pikazon", null, "https://jit.o3.ru/browse/MP-2867", 2, null);
        String concat2 = "pikazon".concat("_ozon_network_enabled_android");
        UpdateStrategy updateStrategy = UpdateStrategy.PER_PROCESS;
        f36778a = U.j(pair, new Pair(gVar, new FeatureDTO(featureFlagDisplayedName$default2, "ozon_network", concat2, valueType, bool, null, updateStrategy)), new Pair(AbstractC8919b.AbstractC1361b.h.f80510b, new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки PushSDK", null, "https://jit.o3.ru/browse/MP-2867", 2, null), "ozon_network", "push_sdk".concat("_ozon_network_enabled_android"), valueType, bool, null, updateStrategy)), new Pair(AbstractC8919b.AbstractC1361b.c.f80505b, new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки InAppPush", null, "https://jit.o3.ru/browse/MP-2867", 2, null), "ozon_network", "in_app_push".concat("_ozon_network_enabled_android"), valueType, bool, null, updateStrategy)), new Pair(AbstractC8919b.AbstractC1361b.f.f80508b, new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки TrackerSDK", null, "https://jit.o3.ru/browse/MP-2867", 2, null), "ozon_network", "tracker".concat("_ozon_network_enabled_android"), valueType, bool, null, updateStrategy)), new Pair(AbstractC8919b.AbstractC1361b.C1362b.f80504b, new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение единого сетевого клиента для библиотеки CDNChooser", null, "https://jit.o3.ru/browse/MP-2867", 2, null), "ozon_network", "cdn_chooser".concat("_ozon_network_enabled_android"), valueType, bool, null, updateStrategy)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static FeatureDTO a(@NotNull AbstractC8919b.AbstractC1361b libName) {
        Intrinsics.checkNotNullParameter(libName, "libName");
        return (FeatureDTO) f36778a.get(libName);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static ArrayList b() {
        ?? r02 = f36778a;
        ArrayList arrayList = new ArrayList(r02.size());
        Iterator it = r02.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((FeatureDTO) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }
}
