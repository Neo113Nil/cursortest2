package com.unity3d.services.core.configuration;

/* loaded from: classes6.dex */
public enum InitRequestType {
    PRIVACY(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY),
    TOKEN("token_srr");

    private java.lang.String _callType;

    InitRequestType(java.lang.String str) {
        this._callType = str;
    }

    public java.lang.String getCallType() {
        return this._callType;
    }
}
