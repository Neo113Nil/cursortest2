package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.C0812h;
import p006a3.e;

/* JADX INFO: loaded from: classes.dex */
final class zbbb extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0812h c0812h, Object obj, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        return new zbbh(context, looper, (e) obj, c0812h, interfaceC0786g, interfaceC0795p);
    }
}
