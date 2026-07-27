package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final x f5584a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f5613a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f5608a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i3 = 0; i3 < size; i3++) {
            mVarArr[i3] = this.f5584a.fromModel(idSyncConfig.getRequests().get(i3));
        }
        nVar.f5609b = mVarArr;
        oVar.f5614b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(o oVar) {
        n nVar = oVar.f5614b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z3 = oVar.f5613a;
        long j3 = nVar.f5608a;
        m[] mVarArr = nVar.f5609b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f5584a.toModel(mVar));
        }
        return new IdSyncConfig(z3, j3, arrayList);
    }
}
