package okhttp3.internal.publicsuffix;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixList$Companion;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "getDefault", "(Lokhttp3/internal/publicsuffix/PublicSuffixList$Companion;)Lokhttp3/internal/publicsuffix/PublicSuffixList;", "Default"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PublicSuffixList_androidKt {
    public static final okhttp3.internal.publicsuffix.PublicSuffixList getDefault(okhttp3.internal.publicsuffix.PublicSuffixList.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return new okhttp3.internal.publicsuffix.AssetPublicSuffixList(null, 1, null);
    }
}
