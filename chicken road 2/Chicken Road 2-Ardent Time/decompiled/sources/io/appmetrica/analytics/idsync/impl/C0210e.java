package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210e implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.C f3920a = new io.appmetrica.analytics.idsync.impl.C();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.m fromModel(io.appmetrica.analytics.idsync.internal.model.IdSyncConfig idSyncConfig) {
        io.appmetrica.analytics.idsync.impl.m mVar = new io.appmetrica.analytics.idsync.impl.m();
        mVar.f3951a = idSyncConfig.getEnabled();
        io.appmetrica.analytics.idsync.impl.l lVar = new io.appmetrica.analytics.idsync.impl.l();
        lVar.f3946a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        io.appmetrica.analytics.idsync.impl.k[] kVarArr = new io.appmetrica.analytics.idsync.impl.k[size];
        for (int i2 = 0; i2 < size; i2++) {
            kVarArr[i2] = this.f3920a.fromModel(idSyncConfig.getRequests().get(i2));
        }
        lVar.f3947b = kVarArr;
        mVar.f3952b = lVar;
        return mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.internal.model.IdSyncConfig toModel(io.appmetrica.analytics.idsync.impl.m mVar) {
        io.appmetrica.analytics.idsync.impl.l lVar = mVar.f3952b;
        if (lVar == null) {
            lVar = new io.appmetrica.analytics.idsync.impl.l();
        }
        boolean z2 = mVar.f3951a;
        long j2 = lVar.f3946a;
        io.appmetrica.analytics.idsync.impl.k[] kVarArr = lVar.f3947b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kVarArr.length);
        for (io.appmetrica.analytics.idsync.impl.k kVar : kVarArr) {
            arrayList.add(this.f3920a.toModel(kVar));
        }
        return new io.appmetrica.analytics.idsync.internal.model.IdSyncConfig(z2, j2, arrayList);
    }
}
