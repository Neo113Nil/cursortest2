package com.google.ads.mediation.facebook;

/* compiled from: FacebookAdapterUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/ads/mediation/facebook/FacebookAdapterUtils;", "", "<init>", "()V", com.ironsource.Mf.b, "", "getAdapterVersion$annotations", "getAdapterVersion", "()Ljava/lang/String;", "meta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacebookAdapterUtils {
    public static final com.google.ads.mediation.facebook.FacebookAdapterUtils INSTANCE = new com.google.ads.mediation.facebook.FacebookAdapterUtils();

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getAdapterVersion$annotations() {
    }

    private FacebookAdapterUtils() {
    }

    public static final java.lang.String getAdapterVersion() {
        return com.google.ads.mediation.facebook.BuildConfig.ADAPTER_VERSION;
    }
}
