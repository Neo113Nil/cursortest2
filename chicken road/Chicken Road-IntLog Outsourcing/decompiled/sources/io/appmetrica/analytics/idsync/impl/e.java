package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final x f6407a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f6438a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f6433a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i2 = 0; i2 < size; i2++) {
            mVarArr[i2] = this.f6407a.fromModel(idSyncConfig.getRequests().get(i2));
        }
        nVar.f6434b = mVarArr;
        oVar.f6439b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(o oVar) {
        n nVar = oVar.f6439b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z = oVar.f6438a;
        long j2 = nVar.f6433a;
        m[] mVarArr = nVar.f6434b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f6407a.toModel(mVar));
        }
        return new IdSyncConfig(z, j2, arrayList);
    }
}
