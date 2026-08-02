package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C0856h c0856h, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c0856h, obj, (InterfaceC0830g) mVar, (InterfaceC0839p) nVar);
    }

    public g buildClient(Context context, Looper looper, C0856h c0856h, Object obj, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
