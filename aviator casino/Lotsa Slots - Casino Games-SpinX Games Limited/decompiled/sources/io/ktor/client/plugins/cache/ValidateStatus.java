package io.ktor.client.plugins.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpCacheEntry.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/cache/ValidateStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ShouldValidate", "ShouldNotValidate", "ShouldWarn", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidateStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.client.plugins.cache.ValidateStatus[] $VALUES;
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldValidate = new io.ktor.client.plugins.cache.ValidateStatus("ShouldValidate", 0);
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldNotValidate = new io.ktor.client.plugins.cache.ValidateStatus("ShouldNotValidate", 1);
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldWarn = new io.ktor.client.plugins.cache.ValidateStatus("ShouldWarn", 2);

    private static final /* synthetic */ io.ktor.client.plugins.cache.ValidateStatus[] $values() {
        return new io.ktor.client.plugins.cache.ValidateStatus[]{ShouldValidate, ShouldNotValidate, ShouldWarn};
    }

    public static kotlin.enums.EnumEntries<io.ktor.client.plugins.cache.ValidateStatus> getEntries() {
        return $ENTRIES;
    }

    private ValidateStatus(java.lang.String str, int i) {
    }

    static {
        io.ktor.client.plugins.cache.ValidateStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static io.ktor.client.plugins.cache.ValidateStatus valueOf(java.lang.String str) {
        return (io.ktor.client.plugins.cache.ValidateStatus) java.lang.Enum.valueOf(io.ktor.client.plugins.cache.ValidateStatus.class, str);
    }

    public static io.ktor.client.plugins.cache.ValidateStatus[] values() {
        return (io.ktor.client.plugins.cache.ValidateStatus[]) $VALUES.clone();
    }
}
