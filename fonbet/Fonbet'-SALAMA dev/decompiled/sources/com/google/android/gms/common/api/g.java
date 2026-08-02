package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.InterfaceC0852d;
import com.google.android.gms.common.internal.InterfaceC0853e;
import com.google.android.gms.common.internal.InterfaceC0860l;
import java.util.Set;

/* loaded from: classes.dex */
public interface g extends b {
    void connect(InterfaceC0852d interfaceC0852d);

    void disconnect();

    void disconnect(String str);

    Feature[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC0860l interfaceC0860l, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC0853e interfaceC0853e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
