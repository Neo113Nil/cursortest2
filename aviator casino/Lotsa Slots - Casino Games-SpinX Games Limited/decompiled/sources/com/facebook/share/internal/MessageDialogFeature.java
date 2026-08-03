package com.facebook.share.internal;

/* loaded from: classes2.dex */
public enum MessageDialogFeature implements com.facebook.internal.DialogFeature {
    MESSAGE_DIALOG(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20140204),
    PHOTOS(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20140324),
    VIDEO(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20141218),
    MESSENGER_GENERIC_TEMPLATE(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20171115),
    MESSENGER_MEDIA_TEMPLATE(com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20171115);

    private int minVersion;

    MessageDialogFeature(int minVersion) {
        this.minVersion = minVersion;
    }

    @Override // com.facebook.internal.DialogFeature
    public java.lang.String getAction() {
        return com.facebook.internal.NativeProtocol.ACTION_MESSAGE_DIALOG;
    }

    @Override // com.facebook.internal.DialogFeature
    public int getMinVersion() {
        return this.minVersion;
    }
}
