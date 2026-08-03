package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public interface z {

    public static final class a {
        public static void a(com.moloco.sdk.internal.publisher.z zVar) {
        }

        public static /* synthetic */ void a(com.moloco.sdk.internal.publisher.z zVar, com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAdShowSuccess");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            zVar.a(molocoAd, str);
        }
    }

    void a();

    void a(com.moloco.sdk.internal.s sVar);

    void a(com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str);

    void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd);

    void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd);
}
