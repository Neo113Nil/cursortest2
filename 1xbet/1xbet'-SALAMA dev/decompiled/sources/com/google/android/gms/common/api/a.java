package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.C0812h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C0812h c0812h, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c0812h, obj, (InterfaceC0786g) mVar, (InterfaceC0795p) nVar);
    }

    public g buildClient(Context context, Looper looper, C0812h c0812h, Object obj, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
