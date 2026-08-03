package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    int getExtensionType();

    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    android.os.Bundle toBundle();
}
