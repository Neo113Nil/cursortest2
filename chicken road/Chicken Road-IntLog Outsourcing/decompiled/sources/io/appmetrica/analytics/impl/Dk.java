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
    public final Context f6692a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1141yl f6693b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f6694c;

    public Dk(Context context, InterfaceC1141yl interfaceC1141yl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f6692a = context;
        this.f6693b = interfaceC1141yl;
        this.f6694c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Sm.f7490a.getClass();
        return new Rm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f6692a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f6692a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f6694c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f6692a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C1066vn c1066vn;
        C0662g7 a6 = C0662g7.a(this.f6692a);
        synchronized (a6) {
            try {
                if (a6.f8246l == null) {
                    Context context = a6.f8239e;
                    Wm wm = Wm.SERVICE;
                    if (a6.f8245k == null) {
                        a6.f8245k = new C1040un(new C1038ul(a6.h()), "temp_cache");
                    }
                    a6.f8246l = new C1066vn(context, wm, a6.f8245k);
                }
                c1066vn = a6.f8246l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1066vn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Gb(this.f6693b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C0616ed(str, this.f6693b);
    }
}
