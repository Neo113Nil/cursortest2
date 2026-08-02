package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.internal.p001authapiphone.zzw;

/* loaded from: classes4.dex */
public final class b extends a.AbstractC0110a {
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0863e c0863e, Object obj, InterfaceC0832f interfaceC0832f, InterfaceC0841o interfaceC0841o) {
        return new zzw(context, looper, c0863e, interfaceC0832f, interfaceC0841o);
    }
}
