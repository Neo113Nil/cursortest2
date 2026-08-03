package com.vungle.ads.internal.omsdk;

/* compiled from: NativeOMTracker.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "omSdkData", "", "omSdkJS", "isNativeVideo", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "adEvents", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "()Z", "json", "Lkotlinx/serialization/json/Json;", "mediaEvents", "Lcom/iab/omid/library/vungle/adsession/media/MediaEvents;", "getNativeAdSession", "Lcom/iab/omid/library/vungle/adsession/AdSessionConfiguration;", "creativeType", "Lcom/iab/omid/library/vungle/adsession/CreativeType;", "impressionOccurred", "", "onMuteChanged", "muted", "onQuartileChanged", "quartile", "", "onQuartileStart", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "", "volume", "onStateCompleted", "onStatePaused", "onStatePlay", "onUserInteraction", "start", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "stop", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeOMTracker {
    private static final java.lang.String TAG = "NativeAd-OMTracker";
    private com.iab.omid.library.vungle.adsession.AdEvents adEvents;
    private com.iab.omid.library.vungle.adsession.AdSession adSession;
    private final boolean isNativeVideo;
    private final kotlinx.serialization.json.Json json;
    private com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents;

    public NativeOMTracker(java.lang.String omSdkData, java.lang.String omSdkJS, boolean z) {
        java.lang.Object m10798constructorimpl;
        com.iab.omid.library.vungle.adsession.AdSessionConfiguration nativeAdSession;
        com.vungle.ads.internal.model.OmSdkData omSdkData2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omSdkJS, "omSdkJS");
        this.isNativeVideo = z;
        this.json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            if (this.isNativeVideo) {
                nativeAdSession = getNativeAdSession(com.iab.omid.library.vungle.adsession.CreativeType.VIDEO);
            } else {
                nativeAdSession = getNativeAdSession(com.iab.omid.library.vungle.adsession.CreativeType.NATIVE_DISPLAY);
            }
            com.iab.omid.library.vungle.adsession.Partner createPartner = com.iab.omid.library.vungle.adsession.Partner.createPartner(com.vungle.ads.BuildConfig.OMSDK_PARTNER_NAME, com.vungle.ads.BuildConfig.VERSION_NAME);
            byte[] decoded = android.util.Base64.decode(omSdkData, 0);
            if (decoded != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decoded, "decoded");
                java.lang.String str = new java.lang.String(decoded, kotlin.text.Charsets.UTF_8);
                kotlinx.serialization.json.Json json = this.json;
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.OmSdkData.class));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (com.vungle.ads.internal.model.OmSdkData) json.decodeFromString(serializer, str);
            } else {
                omSdkData2 = null;
            }
            if ((omSdkData2 != null ? omSdkData2.getVendorURL() : null) == null) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Invalid OMSDK data: missing vendorURL");
            } else {
                com.iab.omid.library.vungle.adsession.VerificationScriptResource verificationScriptResource = com.iab.omid.library.vungle.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData2.getVendorKey(), new java.net.URL(omSdkData2.getVendorURL()), omSdkData2.getParams());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
                this.adSession = com.iab.omid.library.vungle.adsession.AdSession.createAdSession(nativeAdSession, com.iab.omid.library.vungle.adsession.AdSessionContext.createNativeAdSessionContext(createPartner, omSdkJS, kotlin.collections.CollectionsKt.listOf(verificationScriptResource), null, null));
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "error occured when create omsdk adSession:", m10801exceptionOrNullimpl);
        }
    }

    /* renamed from: isNativeVideo, reason: from getter */
    public final boolean getIsNativeVideo() {
        return this.isNativeVideo;
    }

    public final void start(android.view.View view) {
        java.lang.Object m10798constructorimpl;
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "start OM tracker");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.AdSession adSession = this.adSession;
            if (adSession != null) {
                this.adEvents = com.iab.omid.library.vungle.adsession.AdEvents.createAdEvents(adSession);
                if (this.isNativeVideo) {
                    this.mediaEvents = com.iab.omid.library.vungle.adsession.media.MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.isNativeVideo) {
                    com.iab.omid.library.vungle.adsession.media.VastProperties createVastPropertiesForNonSkippableMedia = com.iab.omid.library.vungle.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(false, com.iab.omid.library.vungle.adsession.media.Position.STANDALONE);
                    com.iab.omid.library.vungle.adsession.AdEvents adEvents = this.adEvents;
                    if (adEvents != null) {
                        adEvents.loaded(createVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    com.iab.omid.library.vungle.adsession.AdEvents adEvents2 = this.adEvents;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                num = java.lang.Integer.valueOf(com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: loaded"));
            } else {
                num = null;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(num);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "error occured when start omsdk adSession:", m10801exceptionOrNullimpl);
        }
    }

    public final void stop() {
        com.iab.omid.library.vungle.adsession.AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
        this.adEvents = null;
        this.mediaEvents = null;
    }

    public final void onStatePlay() {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onStatePlay");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.resume();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public final void onStatePaused() {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onStatePaused");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.pause();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public final void onStateCompleted() {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onStateCompleted");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.complete();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public final void onQuartileStart(float duration, float volume) {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onQuartileStart duration=" + duration + " volume=" + volume);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.start(duration, volume);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public final void onQuartileChanged(int quartile) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onQuartileChanged quartile=" + quartile);
        kotlin.Unit unit = null;
        if (quartile == 5) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
                com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    unit = kotlin.Unit.INSTANCE;
                }
                kotlin.Result.m10798constructorimpl(unit);
                return;
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                return;
            }
        }
        if (quartile == 6) {
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker2 = this;
                com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents2 = this.mediaEvents;
                if (mediaEvents2 != null) {
                    mediaEvents2.midpoint();
                    unit = kotlin.Unit.INSTANCE;
                }
                kotlin.Result.m10798constructorimpl(unit);
                return;
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                return;
            }
        }
        if (quartile != 7) {
            return;
        }
        try {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker3 = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents3 = this.mediaEvents;
            if (mediaEvents3 != null) {
                mediaEvents3.thirdQuartile();
                unit = kotlin.Unit.INSTANCE;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
    }

    public final void onMuteChanged(boolean muted) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onMuteChanged muted=" + muted);
        kotlin.Unit unit = null;
        if (muted) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
                com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                    unit = kotlin.Unit.INSTANCE;
                }
                kotlin.Result.m10798constructorimpl(unit);
                return;
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                return;
            }
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker2 = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents2 = this.mediaEvents;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
                unit = kotlin.Unit.INSTANCE;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }

    public final void onUserInteraction() {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: onUserInteraction");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(com.iab.omid.library.vungle.adsession.media.InteractionType.CLICK);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public final void impressionOccurred() {
        kotlin.Unit unit;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "track event: impressionOccurred");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.NativeOMTracker nativeOMTracker = this;
            com.iab.omid.library.vungle.adsession.AdEvents adEvents = this.adEvents;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    private final com.iab.omid.library.vungle.adsession.AdSessionConfiguration getNativeAdSession(com.iab.omid.library.vungle.adsession.CreativeType creativeType) {
        com.iab.omid.library.vungle.adsession.AdSessionConfiguration createAdSessionConfiguration = com.iab.omid.library.vungle.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, com.iab.omid.library.vungle.adsession.ImpressionType.BEGIN_TO_RENDER, com.iab.omid.library.vungle.adsession.Owner.NATIVE, creativeType == com.iab.omid.library.vungle.adsession.CreativeType.NATIVE_DISPLAY ? com.iab.omid.library.vungle.adsession.Owner.NONE : com.iab.omid.library.vungle.adsession.Owner.NATIVE, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createAdSessionConfiguration, "createAdSessionConfigura…          false\n        )");
        return createAdSessionConfiguration;
    }
}
