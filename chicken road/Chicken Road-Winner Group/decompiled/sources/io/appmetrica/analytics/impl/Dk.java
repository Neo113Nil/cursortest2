package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;

/* loaded from: classes.dex */
public final class Dk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5854a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0992yl f5855b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f5856c;

    public Dk(Context context, InterfaceC0992yl interfaceC0992yl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f5854a = context;
        this.f5855b = interfaceC0992yl;
        this.f5856c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Sm.f6620a.getClass();
        return new Rm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f5854a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f5854a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f5856c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f5854a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C0917vn c0917vn;
        C0513g7 a3 = C0513g7.a(this.f5854a);
        synchronized (a3) {
            try {
                if (a3.f7347l == null) {
                    Context context = a3.f7341e;
                    Wm wm = Wm.SERVICE;
                    if (a3.f7346k == null) {
                        a3.f7346k = new C0891un(new C0889ul(a3.h()), "temp_cache");
                    }
                    a3.f7347l = new C0917vn(context, wm, a3.f7346k);
                }
                c0917vn = a3.f7347l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0917vn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Gb(this.f5855b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C0467ed(str, this.f5855b);
    }
}
