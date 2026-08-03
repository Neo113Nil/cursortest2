package com.moloco.sdk.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Lcom/moloco/sdk/publisher/AdFormatType;", "", "<init>", "(Ljava/lang/String;I)V", com.ironsource.mediationsdk.j.f6439a, "INTERSTITIAL", "REWARDED", "MREC", "NATIVE", "toLowercase", "", "toTitlecase", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdFormatType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.moloco.sdk.publisher.AdFormatType[] $VALUES;
    public static final com.moloco.sdk.publisher.AdFormatType BANNER = new com.moloco.sdk.publisher.AdFormatType(com.ironsource.mediationsdk.j.f6439a, 0);
    public static final com.moloco.sdk.publisher.AdFormatType INTERSTITIAL = new com.moloco.sdk.publisher.AdFormatType("INTERSTITIAL", 1);
    public static final com.moloco.sdk.publisher.AdFormatType REWARDED = new com.moloco.sdk.publisher.AdFormatType("REWARDED", 2);
    public static final com.moloco.sdk.publisher.AdFormatType MREC = new com.moloco.sdk.publisher.AdFormatType("MREC", 3);
    public static final com.moloco.sdk.publisher.AdFormatType NATIVE = new com.moloco.sdk.publisher.AdFormatType("NATIVE", 4);

    private static final /* synthetic */ com.moloco.sdk.publisher.AdFormatType[] $values() {
        return new com.moloco.sdk.publisher.AdFormatType[]{BANNER, INTERSTITIAL, REWARDED, MREC, NATIVE};
    }

    static {
        com.moloco.sdk.publisher.AdFormatType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private AdFormatType(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.publisher.AdFormatType> getEntries() {
        return $ENTRIES;
    }

    public static com.moloco.sdk.publisher.AdFormatType valueOf(java.lang.String str) {
        return (com.moloco.sdk.publisher.AdFormatType) java.lang.Enum.valueOf(com.moloco.sdk.publisher.AdFormatType.class, str);
    }

    public static com.moloco.sdk.publisher.AdFormatType[] values() {
        return (com.moloco.sdk.publisher.AdFormatType[]) $VALUES.clone();
    }

    public final java.lang.String toLowercase() {
        java.lang.String lowerCase = toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final java.lang.String toTitlecase() {
        java.lang.String lowercase = toLowercase();
        if (lowercase.length() <= 0) {
            return lowercase;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = lowercase.charAt(0);
        sb.append((java.lang.Object) (java.lang.Character.isLowerCase(charAt) ? kotlin.text.CharsKt.titlecase(charAt) : java.lang.String.valueOf(charAt)));
        java.lang.String substring = lowercase.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }
}
