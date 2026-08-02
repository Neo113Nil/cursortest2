package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KVariance {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.KVariance IN;
    public static final kotlin.reflect.KVariance INVARIANT;
    public static final kotlin.reflect.KVariance OUT;
    private static final /* synthetic */ kotlin.reflect.KVariance[] getHighResolutionOutputSizeshNQ4ISI;

    private KVariance(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.KVariance kVariance = new kotlin.reflect.KVariance("INVARIANT", 0);
        INVARIANT = kVariance;
        kotlin.reflect.KVariance kVariance2 = new kotlin.reflect.KVariance("IN", 1);
        IN = kVariance2;
        kotlin.reflect.KVariance kVariance3 = new kotlin.reflect.KVariance("OUT", 2);
        OUT = kVariance3;
        kotlin.reflect.KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        getHighResolutionOutputSizeshNQ4ISI = kVarianceArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(kVarianceArr);
    }

    public static kotlin.reflect.KVariance[] values() {
        return (kotlin.reflect.KVariance[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.KVariance valueOf(java.lang.String str) {
        return (kotlin.reflect.KVariance) java.lang.Enum.valueOf(kotlin.reflect.KVariance.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVariance> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
