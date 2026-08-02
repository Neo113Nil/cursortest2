package kotlin.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequireKotlinVersionKind {
    public static final kotlin.internal.RequireKotlinVersionKind API_VERSION;
    public static final kotlin.internal.RequireKotlinVersionKind COMPILER_VERSION;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.internal.RequireKotlinVersionKind LANGUAGE_VERSION;
    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] getHighResolutionOutputSizeshNQ4ISI;

    private RequireKotlinVersionKind(java.lang.String str, int i) {
    }

    static {
        kotlin.internal.RequireKotlinVersionKind requireKotlinVersionKind = new kotlin.internal.RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        LANGUAGE_VERSION = requireKotlinVersionKind;
        kotlin.internal.RequireKotlinVersionKind requireKotlinVersionKind2 = new kotlin.internal.RequireKotlinVersionKind("COMPILER_VERSION", 1);
        COMPILER_VERSION = requireKotlinVersionKind2;
        kotlin.internal.RequireKotlinVersionKind requireKotlinVersionKind3 = new kotlin.internal.RequireKotlinVersionKind("API_VERSION", 2);
        API_VERSION = requireKotlinVersionKind3;
        kotlin.internal.RequireKotlinVersionKind[] requireKotlinVersionKindArr = {requireKotlinVersionKind, requireKotlinVersionKind2, requireKotlinVersionKind3};
        getHighResolutionOutputSizeshNQ4ISI = requireKotlinVersionKindArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(requireKotlinVersionKindArr);
    }

    public static kotlin.internal.RequireKotlinVersionKind[] values() {
        return (kotlin.internal.RequireKotlinVersionKind[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.internal.RequireKotlinVersionKind valueOf(java.lang.String str) {
        return (kotlin.internal.RequireKotlinVersionKind) java.lang.Enum.valueOf(kotlin.internal.RequireKotlinVersionKind.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.internal.RequireKotlinVersionKind> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
