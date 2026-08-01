package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAd;

/* loaded from: classes7.dex */
public interface A {

    public static final class a {
        public static void a(A a2) {
        }

        public static /* synthetic */ void a(A a2, MolocoAd molocoAd, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAdShowSuccess");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            a2.a(molocoAd, str);
        }
    }

    void a();

    void a(com.moloco.sdk.internal.t tVar);

    void a(MolocoAd molocoAd, String str);

    void onAdClicked(MolocoAd molocoAd);

    void onAdHidden(MolocoAd molocoAd);
}
