package io.ktor.client.plugins.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lio/ktor/client/plugins/cache/ValidateStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ShouldValidate", "ShouldNotValidate", "ShouldWarn"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ValidateStatus {
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldNotValidate;
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldValidate;
    public static final io.ktor.client.plugins.cache.ValidateStatus ShouldWarn;
    private static final /* synthetic */ io.ktor.client.plugins.cache.ValidateStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ValidateStatus(java.lang.String str, int i) {
    }

    static {
        io.ktor.client.plugins.cache.ValidateStatus validateStatus = new io.ktor.client.plugins.cache.ValidateStatus("ShouldValidate", 0);
        ShouldValidate = validateStatus;
        io.ktor.client.plugins.cache.ValidateStatus validateStatus2 = new io.ktor.client.plugins.cache.ValidateStatus("ShouldNotValidate", 1);
        ShouldNotValidate = validateStatus2;
        io.ktor.client.plugins.cache.ValidateStatus validateStatus3 = new io.ktor.client.plugins.cache.ValidateStatus("ShouldWarn", 2);
        ShouldWarn = validateStatus3;
        io.ktor.client.plugins.cache.ValidateStatus[] validateStatusArr = {validateStatus, validateStatus2, validateStatus3};
        getHighResolutionOutputSizeshNQ4ISI = validateStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(validateStatusArr);
    }

    public static io.ktor.client.plugins.cache.ValidateStatus valueOf(java.lang.String str) {
        return (io.ktor.client.plugins.cache.ValidateStatus) java.lang.Enum.valueOf(io.ktor.client.plugins.cache.ValidateStatus.class, str);
    }

    public static io.ktor.client.plugins.cache.ValidateStatus[] values() {
        return (io.ktor.client.plugins.cache.ValidateStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.client.plugins.cache.ValidateStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
