package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public enum t {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN("unknown");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.model.vast.t> sMediaTypeMap = new java.util.HashMap();
    final java.lang.String mimeType;

    static {
        for (com.fyber.inneractive.sdk.model.vast.t tVar : values()) {
            sMediaTypeMap.put(tVar.mimeType, tVar);
        }
    }

    t(java.lang.String str) {
        this.mimeType = str;
    }

    public static com.fyber.inneractive.sdk.model.vast.t a(java.lang.String str) {
        java.util.Map<java.lang.String, com.fyber.inneractive.sdk.model.vast.t> map = sMediaTypeMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
