package com.google.android.gms.internal.p000authapi;

import X2.b;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0827d;
import com.google.android.gms.common.api.o;

/* loaded from: classes.dex */
abstract class zbm extends AbstractC0827d {
    public zbm(o oVar) {
        super(b.f7468a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0827d
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0828e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zbm) obj);
    }

    public abstract void zba(Context context, zbt zbtVar);
}
