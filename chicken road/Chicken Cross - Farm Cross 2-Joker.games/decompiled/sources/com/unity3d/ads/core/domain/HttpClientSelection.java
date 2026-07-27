package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidHttpClientProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/HttpClientSelection;", "", "<init>", "(Ljava/lang/String;I)V", "CRONET_WITHOUT_QUIC", "CRONET_WITH_QUIC", "LEGACY", "OKHTTP3", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpClientSelection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpClientSelection[] $VALUES;
    public static final HttpClientSelection CRONET_WITHOUT_QUIC = new HttpClientSelection("CRONET_WITHOUT_QUIC", 0);
    public static final HttpClientSelection CRONET_WITH_QUIC = new HttpClientSelection("CRONET_WITH_QUIC", 1);
    public static final HttpClientSelection LEGACY = new HttpClientSelection("LEGACY", 2);
    public static final HttpClientSelection OKHTTP3 = new HttpClientSelection("OKHTTP3", 3);

    private static final /* synthetic */ HttpClientSelection[] $values() {
        return new HttpClientSelection[]{CRONET_WITHOUT_QUIC, CRONET_WITH_QUIC, LEGACY, OKHTTP3};
    }

    public static EnumEntries<HttpClientSelection> getEntries() {
        return $ENTRIES;
    }

    private HttpClientSelection(String str, int i) {
    }

    static {
        HttpClientSelection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HttpClientSelection valueOf(String str) {
        return (HttpClientSelection) Enum.valueOf(HttpClientSelection.class, str);
    }

    public static HttpClientSelection[] values() {
        return (HttpClientSelection[]) $VALUES.clone();
    }
}
