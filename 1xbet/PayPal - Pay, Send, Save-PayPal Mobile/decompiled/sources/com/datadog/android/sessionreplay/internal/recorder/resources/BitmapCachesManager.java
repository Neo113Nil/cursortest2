package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010/"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;", "", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache;", "", "", "resourcesLRUCache", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapPool;", "bitmapPool", "Lcom/datadog/android/api/InternalLogger;", "logger", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache;Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapPool;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "generateResourceKeyFromDrawable$dd_sdk_android_session_replay_release", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/String;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "getBitmapByProperties$dd_sdk_android_session_replay_release", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "key", "getFromResourceCache$dd_sdk_android_session_replay_release", "(Ljava/lang/String;)Ljava/lang/String;", "bitmap", "", "putInBitmapPool$dd_sdk_android_session_replay_release", "(Landroid/graphics/Bitmap;)V", "resourceId", "putInResourceCache$dd_sdk_android_session_replay_release", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "applicationContext", "registerCallbacks$dd_sdk_android_session_replay_release", "(Landroid/content/Context;)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapPool;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BitmapCachesManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.BitmapPool getHighSpeedVideoFpsRangesFor;

    public BitmapCachesManager(com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]> cache, com.datadog.android.sessionreplay.internal.recorder.resources.BitmapPool bitmapPool, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = cache;
        this.getHighSpeedVideoFpsRangesFor = bitmapPool;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    public final void putInResourceCache$dd_sdk_android_session_replay_release(java.lang.String key, java.lang.String resourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]> cache = this.Camera2StreamConfigurationMap;
        byte[] bytes = resourceId.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        cache.put(key, bytes);
    }

    public final java.lang.String getFromResourceCache$dd_sdk_android_session_replay_release(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        byte[] bArr = this.Camera2StreamConfigurationMap.get(key);
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public final java.lang.String generateResourceKeyFromDrawable$dd_sdk_android_session_replay_release(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]> cache = this.Camera2StreamConfigurationMap;
        com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache resourcesLRUCache = cache instanceof com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache ? (com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache) cache : null;
        if (resourcesLRUCache != null) {
            return resourcesLRUCache.generateKeyFromDrawable$dd_sdk_android_session_replay_release(drawable);
        }
        return null;
    }

    public final void putInBitmapPool$dd_sdk_android_session_replay_release(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        this.getHighSpeedVideoFpsRangesFor.put(bitmap);
    }

    public final android.graphics.Bitmap getBitmapByProperties$dd_sdk_android_session_replay_release(int width, int height, android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return this.getHighSpeedVideoFpsRangesFor.getBitmapByProperties$dd_sdk_android_session_replay_release(width, height, config);
    }

    public final void registerCallbacks$dd_sdk_android_session_replay_release(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        if (!this.getHighSpeedVideoFpsRanges) {
            com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]> cache = this.Camera2StreamConfigurationMap;
            if (cache instanceof android.content.ComponentCallbacks2) {
                applicationContext.registerComponentCallbacks((android.content.ComponentCallbacks) cache);
                this.getHighSpeedVideoFpsRanges = true;
            } else {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager$registerResourceLruCacheForCallbacks$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Cache instance does not implement ComponentCallbacks2";
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        applicationContext.registerComponentCallbacks(this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }
}
