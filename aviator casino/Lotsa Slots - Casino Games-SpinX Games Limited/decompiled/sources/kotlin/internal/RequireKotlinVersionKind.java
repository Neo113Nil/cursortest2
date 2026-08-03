package kotlin.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequireKotlinVersionKind {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $VALUES;
    public static final kotlin.internal.RequireKotlinVersionKind LANGUAGE_VERSION = new kotlin.internal.RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
    public static final kotlin.internal.RequireKotlinVersionKind COMPILER_VERSION = new kotlin.internal.RequireKotlinVersionKind("COMPILER_VERSION", 1);
    public static final kotlin.internal.RequireKotlinVersionKind API_VERSION = new kotlin.internal.RequireKotlinVersionKind("API_VERSION", 2);

    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $values() {
        return new kotlin.internal.RequireKotlinVersionKind[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    public static kotlin.enums.EnumEntries<kotlin.internal.RequireKotlinVersionKind> getEntries() {
        return $ENTRIES;
    }

    private RequireKotlinVersionKind(java.lang.String str, int i) {
    }

    static {
        kotlin.internal.RequireKotlinVersionKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.internal.RequireKotlinVersionKind valueOf(java.lang.String str) {
        return (kotlin.internal.RequireKotlinVersionKind) java.lang.Enum.valueOf(kotlin.internal.RequireKotlinVersionKind.class, str);
    }

    public static kotlin.internal.RequireKotlinVersionKind[] values() {
        return (kotlin.internal.RequireKotlinVersionKind[]) $VALUES.clone();
    }
}
