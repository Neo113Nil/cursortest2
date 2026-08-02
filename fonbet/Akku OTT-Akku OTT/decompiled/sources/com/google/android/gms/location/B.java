package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.internal.location.zzaz;

/* loaded from: classes4.dex */
public final class B extends a.AbstractC0110a<zzaz, a.d.c> {
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final /* bridge */ /* synthetic */ zzaz buildClient(Context context, Looper looper, C0863e c0863e, a.d.c cVar, h.a aVar, h.b bVar) {
        return new zzaz(context, looper, aVar, bVar, "locationServices", c0863e);
    }
}
