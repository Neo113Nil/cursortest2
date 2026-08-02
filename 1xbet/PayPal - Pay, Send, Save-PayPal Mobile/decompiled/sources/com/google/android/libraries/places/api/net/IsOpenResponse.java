package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class IsOpenResponse {
    public abstract java.lang.Boolean isOpen();

    public static com.google.android.libraries.places.api.net.IsOpenResponse newInstance(java.lang.Boolean bool) {
        return new com.google.android.libraries.places.api.net.zzr(bool);
    }
}
