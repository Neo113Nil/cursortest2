package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;

/* loaded from: classes4.dex */
public final class zzab extends a.AbstractC0110a {
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0863e c0863e, Object obj, h.a aVar, h.b bVar) {
        return new zzac(context, looper, c0863e, aVar, bVar);
    }
}
