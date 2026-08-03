package com.moloco.sdk.internal.unity_bridge.internal;

/* loaded from: classes5.dex */
public final class a {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final io.ktor.util.collections.ConcurrentMap<java.lang.String, com.moloco.sdk.publisher.InterstitialAd> f7329a = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

    /* renamed from: com.moloco.sdk.internal.unity_bridge.internal.a$a, reason: collision with other inner class name */
    public static final class C0209a implements com.moloco.sdk.publisher.AdLoad.Listener {
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ com.moloco.sdk.publisher.InterstitialAd c;
        public final /* synthetic */ android.os.Handler d;
        public final /* synthetic */ com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback e;

        public C0209a(java.lang.String str, com.moloco.sdk.publisher.InterstitialAd interstitialAd, android.os.Handler handler, com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback) {
            this.b = str;
            this.c = interstitialAd;
            this.d = handler;
            this.e = molocoUnityLoadCallback;
        }

        public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback, java.lang.String str) {
            molocoUnityLoadCallback.onAdLoadSuccess(str);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(final com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            android.os.Handler handler = this.d;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback = this.e;
            final java.lang.String str = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.C0209a.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback.this, str, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            com.moloco.sdk.internal.unity_bridge.internal.a.this.f7329a.put(this.b, this.c);
            android.os.Handler handler = this.d;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback = this.e;
            final java.lang.String str = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.C0209a.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback.this, str);
                }
            });
        }

        public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback, java.lang.String str, com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
            molocoUnityLoadCallback.onAdLoadFailed(str, molocoAdError.toString());
        }
    }

    public static final class b implements com.moloco.sdk.publisher.InterstitialAdShowListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.os.Handler f7331a;
        public final /* synthetic */ com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback b;

        public b(android.os.Handler handler, com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback) {
            this.f7331a = handler;
            this.b = molocoUnityShowCallback;
        }

        public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback, com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
            molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
        }

        public static final void b(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback, com.moloco.sdk.publisher.MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
        }

        public static final void c(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback, com.moloco.sdk.publisher.MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(final com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            android.os.Handler handler = this.f7331a;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.b.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback.this, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(final com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            android.os.Handler handler = this.f7331a;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.b.b(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback.this, molocoAd);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(final com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            android.os.Handler handler = this.f7331a;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.b.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback.this, molocoAdError);
                }
            });
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(final com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            android.os.Handler handler = this.f7331a;
            final com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback = this.b;
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.b.c(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback.this, molocoAd);
                }
            });
        }

        public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback, com.moloco.sdk.publisher.MolocoAd molocoAd) {
            molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
        }
    }

    public final void a(java.lang.String mediation, final java.lang.String adUnitId, final java.lang.String bidResponse, final com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback unityLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediation, "mediation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unityLoadCallback, "unityLoadCallback");
        final android.os.Handler a2 = a();
        com.moloco.sdk.publisher.Moloco.createInterstitial$default(new com.moloco.sdk.publisher.MediationInfo(mediation), adUnitId, null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.moloco.sdk.internal.unity_bridge.internal.a.a(a2, this, adUnitId, bidResponse, unityLoadCallback, (com.moloco.sdk.publisher.InterstitialAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    public static final kotlin.Unit a(android.os.Handler handler, com.moloco.sdk.internal.unity_bridge.internal.a aVar, final java.lang.String str, java.lang.String str2, final com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback, com.moloco.sdk.publisher.InterstitialAd interstitialAd, final com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (adCreateError != null) {
            handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.internal.unity_bridge.internal.a.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback.this, str, adCreateError);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(interstitialAd, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd");
        aVar.a(interstitialAd, str, str2, handler, molocoUnityLoadCallback);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback, java.lang.String str, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        molocoUnityLoadCallback.onAdLoadFailed(str, adCreateError.toString());
    }

    public final void a(final java.lang.String adUnitId, final com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        android.os.Handler a2 = a();
        com.moloco.sdk.publisher.InterstitialAd interstitialAd = this.f7329a.get(adUnitId);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new com.moloco.sdk.internal.unity_bridge.internal.a.b(a2, callback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        a2.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.moloco.sdk.internal.unity_bridge.internal.a.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback.this, adUnitId);
            }
        });
    }

    public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback molocoUnityShowCallback, java.lang.String str) {
        molocoUnityShowCallback.onAdShowFailed(str, "Ad cannot be shown as it was not loaded");
    }

    public final void a(com.moloco.sdk.publisher.InterstitialAd interstitialAd, final java.lang.String str, java.lang.String str2, android.os.Handler handler, final com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback) {
        com.moloco.sdk.publisher.InterstitialAd interstitialAd2 = this.f7329a.get(str);
        if (interstitialAd2 != null) {
            if (interstitialAd2.isLoaded()) {
                handler.post(new java.lang.Runnable() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.moloco.sdk.internal.unity_bridge.internal.a.a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback.this, str);
                    }
                });
                return;
            }
            interstitialAd2.destroy();
        }
        interstitialAd.load(str2, new com.moloco.sdk.internal.unity_bridge.internal.a.C0209a(str, interstitialAd, handler, molocoUnityLoadCallback));
    }

    public static final void a(com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback molocoUnityLoadCallback, java.lang.String str) {
        molocoUnityLoadCallback.onAdLoadSuccess(str);
    }

    public final android.os.Handler a() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            return new android.os.Handler(myLooper);
        }
        throw new java.lang.IllegalStateException("Can't create handler inside thread " + java.lang.Thread.currentThread() + " that has not called Looper.prepare()");
    }
}
