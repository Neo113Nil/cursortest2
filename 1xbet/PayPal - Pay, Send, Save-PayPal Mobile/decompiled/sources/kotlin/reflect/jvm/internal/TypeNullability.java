package kotlin.reflect.jvm.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/TypeNullability;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_NULL", "NULLABLE", "FLEXIBLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeNullability {
    public static final kotlin.reflect.jvm.internal.TypeNullability FLEXIBLE;
    public static final kotlin.reflect.jvm.internal.TypeNullability NOT_NULL;
    public static final kotlin.reflect.jvm.internal.TypeNullability NULLABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.TypeNullability[] getHighSpeedVideoSizes;

    private TypeNullability(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.TypeNullability typeNullability = new kotlin.reflect.jvm.internal.TypeNullability("NOT_NULL", 0);
        NOT_NULL = typeNullability;
        kotlin.reflect.jvm.internal.TypeNullability typeNullability2 = new kotlin.reflect.jvm.internal.TypeNullability("NULLABLE", 1);
        NULLABLE = typeNullability2;
        kotlin.reflect.jvm.internal.TypeNullability typeNullability3 = new kotlin.reflect.jvm.internal.TypeNullability("FLEXIBLE", 2);
        FLEXIBLE = typeNullability3;
        kotlin.reflect.jvm.internal.TypeNullability[] typeNullabilityArr = {typeNullability, typeNullability2, typeNullability3};
        getHighSpeedVideoSizes = typeNullabilityArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(typeNullabilityArr);
    }

    public static kotlin.reflect.jvm.internal.TypeNullability[] values() {
        return (kotlin.reflect.jvm.internal.TypeNullability[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.TypeNullability valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.TypeNullability) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.TypeNullability.class, str);
    }
}
