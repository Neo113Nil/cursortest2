package com.google.android.gms.ads.internal.client;

import F2.AbstractBinderC0230g0;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC0230g0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // F2.InterfaceC0232h0
    public zzboo getAdapterCreator() {
        return new zzbok();
    }

    @Override // F2.InterfaceC0232h0
    public zzey getLiteSdkVersion() {
        return new zzey(ModuleDescriptor.MODULE_VERSION, 250930000, "24.1.0");
    }
}
