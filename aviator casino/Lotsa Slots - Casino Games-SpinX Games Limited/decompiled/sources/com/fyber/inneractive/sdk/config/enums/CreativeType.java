package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum CreativeType {
    PLAYABLE,
    NOT_SET;

    public static com.fyber.inneractive.sdk.config.enums.CreativeType fromValue(java.lang.String str) {
        return str == null ? NOT_SET : "playable".equals(str.toLowerCase(java.util.Locale.US)) ? PLAYABLE : NOT_SET;
    }
}
