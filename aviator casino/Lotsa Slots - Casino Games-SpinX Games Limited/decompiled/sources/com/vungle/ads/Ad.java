package com.vungle.ads;

/* compiled from: BaseAd.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/Ad;", "", "canPlayAd", "", "()Ljava/lang/Boolean;", "load", "", "csbData", "Lcom/vungle/ads/VungleCSBData;", "adMarkup", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface Ad {
    java.lang.Boolean canPlayAd();

    void load();

    void load(com.vungle.ads.VungleCSBData csbData);

    void load(java.lang.String adMarkup);

    /* compiled from: BaseAd.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(com.vungle.ads.Ad ad, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            ad.load(str);
        }
    }
}
