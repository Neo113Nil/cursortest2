package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881zk implements io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7191a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0752ul f7192b;

    /* renamed from: c, reason: collision with root package name */
    public final android.database.sqlite.SQLiteOpenHelper f7193c;

    public C0881zk(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul, android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper) {
        this.f7191a = context;
        this.f7192b = interfaceC0752ul;
        this.f7193c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends io.appmetrica.analytics.protobuf.nano.MessageNano> io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(java.lang.String str, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer<P> protobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter<T, P> protobufConverter) {
        io.appmetrica.analytics.impl.Om.f4797a.getClass();
        return new io.appmetrica.analytics.impl.Nm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final java.io.File getAppDataStorage() {
        return io.appmetrica.analytics.coreutils.internal.io.FileUtils.getAppDataDir(this.f7191a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final java.io.File getAppFileStorage() {
        return io.appmetrica.analytics.coreutils.internal.io.FileUtils.getAppStorageDirectory(this.f7191a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final android.database.sqlite.SQLiteOpenHelper getDbStorage() {
        return this.f7193c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final java.io.File getSdkDataStorage() {
        return io.appmetrica.analytics.coreutils.internal.io.FileUtils.sdkStorage(this.f7191a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage getTempCacheStorage() {
        io.appmetrica.analytics.impl.C0728tn c0728tn;
        io.appmetrica.analytics.impl.C0855yk B2 = io.appmetrica.analytics.impl.C0560na.f6484I.B();
        android.content.Context context = this.f7191a;
        synchronized (B2) {
            try {
                c0728tn = B2.f7157h;
                if (c0728tn == null) {
                    io.appmetrica.analytics.impl.Sm sm = io.appmetrica.analytics.impl.Sm.SERVICE;
                    io.appmetrica.analytics.impl.C0702sn c0702sn = B2.f7156g;
                    if (c0702sn == null) {
                        c0702sn = new io.appmetrica.analytics.impl.C0702sn(new io.appmetrica.analytics.impl.C0649ql(B2.f(context)), "temp_cache");
                        B2.f7156g = c0702sn;
                    }
                    c0728tn = new io.appmetrica.analytics.impl.C0728tn(context, sm, c0702sn);
                    B2.f7157h = c0728tn;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0728tn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences legacyModulePreferences() {
        return new io.appmetrica.analytics.impl.C0872zb(this.f7192b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Xc(str, this.f7192b);
    }
}
