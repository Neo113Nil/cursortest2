package io.ktor.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lio/ktor/http/RangeUnits;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "unitToken", "Ljava/lang/String;", "getUnitToken", "()Ljava/lang/String;", "Bytes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RangeUnits {
    public static final io.ktor.http.RangeUnits Bytes;
    public static final io.ktor.http.RangeUnits None;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ io.ktor.http.RangeUnits[] getHighSpeedVideoSizes;
    private final java.lang.String unitToken;

    private RangeUnits(java.lang.String str, int i, java.lang.String str2) {
        this.unitToken = str2;
    }

    public final java.lang.String getUnitToken() {
        return this.unitToken;
    }

    static {
        io.ktor.http.RangeUnits rangeUnits = new io.ktor.http.RangeUnits("Bytes", 0, com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES);
        Bytes = rangeUnits;
        io.ktor.http.RangeUnits rangeUnits2 = new io.ktor.http.RangeUnits(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 1, "none");
        None = rangeUnits2;
        io.ktor.http.RangeUnits[] rangeUnitsArr = {rangeUnits, rangeUnits2};
        getHighSpeedVideoSizes = rangeUnitsArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(rangeUnitsArr);
    }

    public static io.ktor.http.RangeUnits valueOf(java.lang.String str) {
        return (io.ktor.http.RangeUnits) java.lang.Enum.valueOf(io.ktor.http.RangeUnits.class, str);
    }

    public static io.ktor.http.RangeUnits[] values() {
        return (io.ktor.http.RangeUnits[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.RangeUnits> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
