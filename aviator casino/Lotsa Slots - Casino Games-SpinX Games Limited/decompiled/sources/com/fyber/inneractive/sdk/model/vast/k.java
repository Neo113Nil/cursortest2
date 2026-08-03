package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public enum k {
    Jpeg("image/jpeg", "jpeg"),
    Jpg("image/jpg", "jpg"),
    Gif("image/gif", "gif"),
    Png(androidx.media3.common.MimeTypes.IMAGE_PNG, "png");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.model.vast.k> sCreativeTypeMap = new java.util.HashMap();
    public final java.lang.String extension;
    public final java.lang.String mimeType;

    static {
        for (com.fyber.inneractive.sdk.model.vast.k kVar : values()) {
            sCreativeTypeMap.put(kVar.mimeType, kVar);
        }
    }

    k(java.lang.String str, java.lang.String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    public static com.fyber.inneractive.sdk.model.vast.k a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return sCreativeTypeMap.get(str.toLowerCase(java.util.Locale.US));
    }
}
