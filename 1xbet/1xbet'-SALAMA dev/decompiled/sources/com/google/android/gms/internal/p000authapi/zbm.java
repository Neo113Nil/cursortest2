package com.google.android.gms.internal.p000authapi;

import X2.b;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0783d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* JADX INFO: loaded from: classes.dex */
abstract class zbm extends AbstractC0783d {
    public zbm(o oVar) {
        super(b.f7468a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0783d
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0784e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }

    public abstract void zba(Context context, zbt zbtVar);
}
