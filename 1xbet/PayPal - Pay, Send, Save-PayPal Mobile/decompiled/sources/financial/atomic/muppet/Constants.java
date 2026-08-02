package financial.atomic.muppet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000b"}, d2 = {"Lfinancial/atomic/muppet/Constants;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "BRIDGE_NAME"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Constants {
    public static final financial.atomic.muppet.Constants BRIDGE_NAME;
    private static final /* synthetic */ financial.atomic.muppet.Constants[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String value;

    static {
        financial.atomic.muppet.Constants constants = new financial.atomic.muppet.Constants("BRIDGE_NAME", "MuppetBridge");
        BRIDGE_NAME = constants;
        financial.atomic.muppet.Constants[] constantsArr = {constants};
        getHighResolutionOutputSizeshNQ4ISI = constantsArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(constantsArr);
    }

    private Constants(java.lang.String str, java.lang.String str2) {
        this.value = str2;
    }

    public static financial.atomic.muppet.Constants valueOf(java.lang.String str) {
        return (financial.atomic.muppet.Constants) java.lang.Enum.valueOf(financial.atomic.muppet.Constants.class, str);
    }

    public static financial.atomic.muppet.Constants[] values() {
        return (financial.atomic.muppet.Constants[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public static kotlin.enums.EnumEntries<financial.atomic.muppet.Constants> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
