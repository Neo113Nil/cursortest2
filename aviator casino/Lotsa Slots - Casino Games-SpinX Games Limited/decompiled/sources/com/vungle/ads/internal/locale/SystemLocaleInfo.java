package com.vungle.ads.internal.locale;

/* compiled from: SystemLocaleInfo.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/locale/SystemLocaleInfo;", "Lcom/vungle/ads/internal/locale/LocaleInfo;", "()V", "language", "", "getLanguage", "()Ljava/lang/String;", "timeZoneId", "getTimeZoneId", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemLocaleInfo implements com.vungle.ads.internal.locale.LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public java.lang.String getTimeZoneId() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
        return id;
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public java.lang.String getLanguage() {
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }
}
