package io.ktor.client.engine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lio/ktor/client/engine/ProxyType;", "", "<init>", "(Ljava/lang/String;I)V", "SOCKS", "HTTP", "UNKNOWN"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProxyType {
    public static final io.ktor.client.engine.ProxyType HTTP;
    public static final io.ktor.client.engine.ProxyType SOCKS;
    public static final io.ktor.client.engine.ProxyType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ io.ktor.client.engine.ProxyType[] getHighSpeedVideoFpsRangesFor;

    private ProxyType(java.lang.String str, int i) {
    }

    static {
        io.ktor.client.engine.ProxyType proxyType = new io.ktor.client.engine.ProxyType("SOCKS", 0);
        SOCKS = proxyType;
        io.ktor.client.engine.ProxyType proxyType2 = new io.ktor.client.engine.ProxyType("HTTP", 1);
        HTTP = proxyType2;
        io.ktor.client.engine.ProxyType proxyType3 = new io.ktor.client.engine.ProxyType("UNKNOWN", 2);
        UNKNOWN = proxyType3;
        io.ktor.client.engine.ProxyType[] proxyTypeArr = {proxyType, proxyType2, proxyType3};
        getHighSpeedVideoFpsRangesFor = proxyTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(proxyTypeArr);
    }

    public static io.ktor.client.engine.ProxyType valueOf(java.lang.String str) {
        return (io.ktor.client.engine.ProxyType) java.lang.Enum.valueOf(io.ktor.client.engine.ProxyType.class, str);
    }

    public static io.ktor.client.engine.ProxyType[] values() {
        return (io.ktor.client.engine.ProxyType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.client.engine.ProxyType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
