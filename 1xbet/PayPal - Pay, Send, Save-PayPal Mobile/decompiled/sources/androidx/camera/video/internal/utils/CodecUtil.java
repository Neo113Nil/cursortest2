package androidx.camera.video.internal.utils;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/camera/video/internal/utils/CodecUtil;", "", "<init>", "()V", "Landroidx/camera/video/internal/encoder/EncoderConfig;", "encoderConfig", "Landroid/media/MediaCodec;", "createCodec", "(Landroidx/camera/video/internal/encoder/EncoderConfig;)Landroid/media/MediaCodec;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Landroid/media/MediaCodecInfo;", "findCodecAndGetCodecInfo", "(Ljava/lang/String;)Landroid/media/MediaCodecInfo;", "", "getVideoEncoderMimeTypes", "()Ljava/util/List;", "getAudioEncoderMimeTypes", "", "reset", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Landroid/media/MediaCodec;", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CodecUtil {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static java.util.List<java.lang.String> getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static java.util.List<android.media.MediaCodecInfo> getHighSpeedVideoFpsRanges;
    public static final androidx.camera.video.internal.utils.CodecUtil INSTANCE = new androidx.camera.video.internal.utils.CodecUtil();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final android.util.LruCache<java.lang.String, android.media.MediaCodecInfo> getHighResolutionOutputSizeshNQ4ISI = new android.util.LruCache<>(10);

    private CodecUtil() {
    }

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap() {
        java.util.List emptyList;
        java.util.List<java.lang.String> list = getHighSpeedVideoFpsRangesFor;
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = getHighSpeedVideoFpsRanges;
        if (arrayList == null) {
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(0).getCodecInfos();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(codecInfos, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder()) {
                    arrayList2.add(mediaCodecInfo);
                }
            }
            arrayList = arrayList2;
            getHighSpeedVideoFpsRanges = arrayList;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String[] supportedTypes = ((android.media.MediaCodecInfo) it.next()).getSupportedTypes();
            if (supportedTypes == null || (emptyList = kotlin.collections.ArraysKt.toList(supportedTypes)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.CollectionsKt.addAll(arrayList3, emptyList);
        }
        java.util.List<java.lang.String> distinct = kotlin.collections.CollectionsKt.distinct(arrayList3);
        getHighSpeedVideoFpsRangesFor = distinct;
        return distinct;
    }

    @kotlin.jvm.JvmStatic
    public static final android.media.MediaCodec createCodec(androidx.camera.video.internal.encoder.EncoderConfig encoderConfig) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderConfig, "");
        java.lang.String mimeType = encoderConfig.getMimeType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mimeType, "");
        return getHighSpeedVideoSizes(mimeType);
    }

    @kotlin.jvm.JvmStatic
    public static final android.media.MediaCodecInfo findCodecAndGetCodecInfo(java.lang.String mimeType) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodec mediaCodec;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
        android.util.LruCache<java.lang.String, android.media.MediaCodecInfo> lruCache = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(mimeType);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodec = getHighSpeedVideoSizes(mimeType);
            try {
                android.media.MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(mimeType, codecInfo);
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                return codecInfo;
            } catch (java.lang.Throwable th) {
                th = th;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mediaCodec = null;
        }
    }

    public final void reset() {
        getHighSpeedVideoFpsRanges = null;
        getHighSpeedVideoFpsRangesFor = null;
        Camera2StreamConfigurationMap = null;
        getHighSpeedVideoSizesFor = null;
        android.util.LruCache<java.lang.String, android.media.MediaCodecInfo> lruCache = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (lruCache) {
            lruCache.evictAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private static android.media.MediaCodec getHighSpeedVideoSizes(java.lang.String p0) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        try {
            android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(createEncoderByType);
            return createEncoderByType;
        } catch (java.io.IOException e) {
            throw new androidx.camera.video.internal.encoder.InvalidConfigException(e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new androidx.camera.video.internal.encoder.InvalidConfigException(e2);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getAudioEncoderMimeTypes() {
        java.util.List<java.lang.String> list = getHighSpeedVideoSizesFor;
        if (list != null) {
            return list;
        }
        java.util.List<java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : Camera2StreamConfigurationMap2) {
            if (kotlin.text.StringsKt.startsWith$default((java.lang.String) obj, "audio/", false, 2, (java.lang.Object) null)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        getHighSpeedVideoSizesFor = arrayList2;
        return arrayList2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getVideoEncoderMimeTypes() {
        java.util.List<java.lang.String> list = Camera2StreamConfigurationMap;
        if (list != null) {
            return list;
        }
        java.util.List<java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : Camera2StreamConfigurationMap2) {
            if (kotlin.text.StringsKt.startsWith$default((java.lang.String) obj, "video/", false, 2, (java.lang.Object) null)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        Camera2StreamConfigurationMap = arrayList2;
        return arrayList2;
    }
}
