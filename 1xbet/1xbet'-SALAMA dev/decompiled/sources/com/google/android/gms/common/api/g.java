package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.InterfaceC0808d;
import com.google.android.gms.common.internal.InterfaceC0809e;
import com.google.android.gms.common.internal.InterfaceC0816l;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface g extends b {
    void connect(InterfaceC0808d interfaceC0808d);

    void disconnect();

    void disconnect(String str);

    Feature[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC0816l interfaceC0816l, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC0809e interfaceC0809e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
