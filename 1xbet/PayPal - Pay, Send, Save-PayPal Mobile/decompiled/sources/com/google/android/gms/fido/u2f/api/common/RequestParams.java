package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public abstract class RequestParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public abstract java.util.Set<android.net.Uri> getAllAppIds();

    public abstract android.net.Uri getAppId();

    public abstract com.google.android.gms.fido.u2f.api.common.ChannelIdValue getChannelIdValue();

    public abstract java.lang.String getDisplayHint();

    public abstract java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> getRegisteredKeys();

    public abstract java.lang.Integer getRequestId();

    public abstract java.lang.Double getTimeoutSeconds();
}
