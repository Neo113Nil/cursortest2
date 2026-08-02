package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    int getExtensionType();

    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    android.os.Bundle toBundle();
}
