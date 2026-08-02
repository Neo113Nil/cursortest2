package androidx.camera.video.internal.utils;

/* loaded from: classes6.dex */
public class DynamicRangeUtil {
    private static final java.util.Map<java.lang.String, java.util.Map<androidx.camera.core.DynamicRange, java.lang.Integer>> Camera2StreamConfigurationMap;
    public static final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> DR_TO_VP_BIT_DEPTH_MAP;
    public static final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> DR_TO_VP_FORMAT_MAP;
    public static final java.util.Map<java.lang.Integer, java.lang.Integer> VP_TO_DR_BIT_DEPTH;
    public static final java.util.Map<java.lang.Integer, java.lang.Integer> VP_TO_DR_FORMAT_MAP;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        DR_TO_VP_BIT_DEPTH_MAP = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        DR_TO_VP_FORMAT_MAP = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        VP_TO_DR_BIT_DEPTH = hashMap3;
        java.util.HashMap hashMap4 = new java.util.HashMap();
        VP_TO_DR_FORMAT_MAP = hashMap4;
        java.util.HashMap hashMap5 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap5;
        hashMap.put(8, new java.util.HashSet(java.util.Collections.singletonList(8)));
        hashMap.put(10, new java.util.HashSet(java.util.Collections.singletonList(10)));
        hashMap.put(0, new java.util.HashSet(java.util.Arrays.asList(8, 10)));
        hashMap2.put(0, new java.util.HashSet(java.util.Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new java.util.HashSet(java.util.Collections.singletonList(0)));
        hashMap2.put(2, new java.util.HashSet(java.util.Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new java.util.HashSet(java.util.Collections.singletonList(1)));
        hashMap2.put(4, new java.util.HashSet(java.util.Collections.singletonList(2)));
        hashMap2.put(5, new java.util.HashSet(java.util.Collections.singletonList(3)));
        hashMap2.put(6, new java.util.HashSet(java.util.Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        java.util.HashMap hashMap6 = new java.util.HashMap();
        hashMap6.put(androidx.camera.core.DynamicRange.SDR, 1);
        hashMap6.put(androidx.camera.core.DynamicRange.HLG_10_BIT, 2);
        hashMap6.put(androidx.camera.core.DynamicRange.HDR10_10_BIT, 4096);
        hashMap6.put(androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT, 8192);
        java.util.HashMap hashMap7 = new java.util.HashMap();
        hashMap7.put(androidx.camera.core.DynamicRange.SDR, 1);
        hashMap7.put(androidx.camera.core.DynamicRange.HLG_10_BIT, 2);
        hashMap7.put(androidx.camera.core.DynamicRange.HDR10_10_BIT, 4096);
        hashMap7.put(androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT, 8192);
        java.util.HashMap hashMap8 = new java.util.HashMap();
        hashMap8.put(androidx.camera.core.DynamicRange.SDR, 1);
        hashMap8.put(androidx.camera.core.DynamicRange.HLG_10_BIT, 4);
        hashMap8.put(androidx.camera.core.DynamicRange.HDR10_10_BIT, 4096);
        hashMap8.put(androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT, 16384);
        java.util.HashMap hashMap9 = new java.util.HashMap();
        hashMap9.put(androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT, 256);
        hashMap9.put(androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT, 512);
        hashMap5.put(androidx.media3.common.MimeTypes.VIDEO_H265, hashMap6);
        hashMap5.put(androidx.media3.common.MimeTypes.VIDEO_AV1, hashMap7);
        hashMap5.put(androidx.media3.common.MimeTypes.VIDEO_VP9, hashMap8);
        hashMap5.put(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION, hashMap9);
    }

    private DynamicRangeUtil() {
    }

    public static java.util.Set<java.lang.Integer> dynamicRangeToVideoProfileHdrFormats(androidx.camera.core.DynamicRange dynamicRange) {
        java.util.Set<java.lang.Integer> set = DR_TO_VP_FORMAT_MAP.get(java.lang.Integer.valueOf(dynamicRange.getEncoding()));
        return set == null ? java.util.Collections.emptySet() : set;
    }

    public static java.util.Set<java.lang.Integer> dynamicRangeToVideoProfileBitDepth(androidx.camera.core.DynamicRange dynamicRange) {
        java.util.Set<java.lang.Integer> set = DR_TO_VP_BIT_DEPTH_MAP.get(java.lang.Integer.valueOf(dynamicRange.getBitDepth()));
        return set == null ? java.util.Collections.emptySet() : set;
    }

    public static int dynamicRangeToCodecProfileLevelForMime(java.lang.String str, androidx.camera.core.DynamicRange dynamicRange) {
        java.lang.Integer num;
        java.util.Map<androidx.camera.core.DynamicRange, java.lang.Integer> map = Camera2StreamConfigurationMap.get(str);
        if (map == null || (num = map.get(dynamicRange)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static int videoProfileHdrFormatsToDynamicRangeEncoding(int i) {
        java.util.Map<java.lang.Integer, java.lang.Integer> map = VP_TO_DR_FORMAT_MAP;
        androidx.core.util.Preconditions.checkArgument(map.containsKey(java.lang.Integer.valueOf(i)));
        return ((java.lang.Integer) java.util.Objects.requireNonNull(map.get(java.lang.Integer.valueOf(i)))).intValue();
    }

    public static int videoProfileBitDepthToDynamicRangeBitDepth(int i) {
        java.util.Map<java.lang.Integer, java.lang.Integer> map = VP_TO_DR_BIT_DEPTH;
        androidx.core.util.Preconditions.checkArgument(map.containsKey(java.lang.Integer.valueOf(i)));
        return ((java.lang.Integer) java.util.Objects.requireNonNull(map.get(java.lang.Integer.valueOf(i)))).intValue();
    }

    public static boolean isHdrSettingsMatched(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, androidx.camera.core.DynamicRange dynamicRange) {
        int bitDepth = videoProfileProxy.getBitDepth();
        java.util.Set<java.lang.Integer> set = DR_TO_VP_BIT_DEPTH_MAP.get(java.lang.Integer.valueOf(dynamicRange.getBitDepth()));
        if (set == null || !set.contains(java.lang.Integer.valueOf(bitDepth))) {
            return false;
        }
        int hdrFormat = videoProfileProxy.getHdrFormat();
        java.util.Set<java.lang.Integer> set2 = DR_TO_VP_FORMAT_MAP.get(java.lang.Integer.valueOf(dynamicRange.getEncoding()));
        return set2 != null && set2.contains(java.lang.Integer.valueOf(hdrFormat));
    }
}
