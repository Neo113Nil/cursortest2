package com.google.android.gms.ads.internal.client;

import Q2.I0;
import Q2.Y;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;

/* loaded from: classes.dex */
public class LiteSdkInfo extends Y {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // Q2.Z
    public InterfaceC0624Ka getAdapterCreator() {
        return new BinderC0610Ia();
    }

    @Override // Q2.Z
    public I0 getLiteSdkVersion() {
        return new I0(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
