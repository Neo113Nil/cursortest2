package Jj0;

import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.utils.FeatureDTOUtilsKt;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final FeatureDTO f14820a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final FeatureDTO f14821b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final FeatureDTO f14822c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final FeatureDTO f14823d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final FeatureDTO f14824e;

    static {
        String featureFlagDisplayedName$default = FeatureDTOUtilsKt.featureFlagDisplayedName$default("Время ожидания для отложенной отправки быстрых эвентов", null, "https://jit.o3.ru/browse/MP-5001", 2, null);
        ValueType valueType = ValueType.INT;
        UpdateStrategy updateStrategy = UpdateStrategy.AS_FETCHED;
        f14820a = new FeatureDTO(featureFlagDisplayedName$default, "OzonTrackerLib", "fast_event_timeout_ms", valueType, 0, null, updateStrategy);
        String featureFlagDisplayedName$default2 = FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение логирования ошибок в TrackerSDK", null, "https://jit.o3.ru/browse/MP-5340", 2, null);
        ValueType valueType2 = ValueType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        f14821b = new FeatureDTO(featureFlagDisplayedName$default2, "OzonTrackerLib", "tracker_logging_enabled", valueType2, bool, null, updateStrategy);
        f14822c = new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение логирования сетевых ошибок в TrackerSDK", null, "https://jit.o3.ru/browse/MP-5340", 2, null), "OzonTrackerLib", "tracker_network_error_logging_enabled", valueType2, bool, null, updateStrategy);
        f14823d = new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение логирования ошибок БД в TrackerSDK", null, "https://jit.o3.ru/browse/MP-5340", 2, null), "OzonTrackerLib", "tracker_database_error_logging_enabled", valueType2, bool, null, updateStrategy);
        f14824e = new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName$default("Включение логирования ошибок парсинга эвентов из БД", null, "https://jit.o3.ru/browse/MP-5340", 2, null), "OzonTrackerLib", "tracker_parsing_error_logging_enabled", valueType2, bool, null, updateStrategy);
    }

    @NotNull
    public static FeatureDTO a() {
        return f14820a;
    }

    @NotNull
    public static FeatureDTO b() {
        return f14823d;
    }

    @NotNull
    public static FeatureDTO c() {
        return f14821b;
    }

    @NotNull
    public static FeatureDTO d() {
        return f14822c;
    }

    @NotNull
    public static FeatureDTO e() {
        return f14824e;
    }
}
