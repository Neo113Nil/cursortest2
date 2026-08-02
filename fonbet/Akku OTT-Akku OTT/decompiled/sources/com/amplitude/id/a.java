package com.amplitude.id;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements h {
    public static final C0047a Companion = new C0047a();
    public final d a;
    public final com.amplitude.id.utilities.b b;

    /* renamed from: com.amplitude.id.a$a, reason: collision with other inner class name */
    public static final class C0047a {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(d configuration) {
        String str;
        boolean z;
        String str2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration;
        File file = configuration.d;
        com.amplitude.id.utilities.a.a(file);
        com.amplitude.id.utilities.b bVar = new com.amplitude.id.utilities.b(file, configuration.e, configuration.f);
        this.b = bVar;
        File file2 = bVar.c;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    bVar.b.load(fileInputStream);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } catch (Throwable th) {
                file2.delete();
                com.amplitude.common.a aVar = bVar.a;
                if (aVar != null) {
                    aVar.b("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + ExceptionsKt.stackTraceToString(th));
                }
            }
            com.amplitude.id.utilities.b bVar2 = this.b;
            d dVar = this.a;
            str = dVar.b;
            if (str != null) {
                bVar2.getClass();
                Intrinsics.checkNotNullParameter("api_key", Constants.KEY);
                String property = bVar2.b.getProperty("api_key", null);
                if (property != null) {
                    z = Intrinsics.areEqual(property, str);
                    if (!z) {
                        List keys = CollectionsKt.listOf((Object[]) new String[]{"user_id", "device_id", "api_key", "experiment_api_key"});
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(keys, "keys");
                        Iterator it = keys.iterator();
                        while (it.hasNext()) {
                            bVar2.b.remove((String) it.next());
                        }
                        bVar2.b();
                    }
                    str2 = dVar.b;
                    if (str2 != null) {
                        bVar2.a("api_key", str2);
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (!z) {
            }
            str2 = dVar.b;
            if (str2 != null) {
            }
        }
        file2.getParentFile().mkdirs();
        file2.createNewFile();
        com.amplitude.id.utilities.b bVar22 = this.b;
        d dVar2 = this.a;
        str = dVar2.b;
        if (str != null) {
        }
        z = true;
        if (!z) {
        }
        str2 = dVar2.b;
        if (str2 != null) {
        }
    }

    @Override // com.amplitude.id.h
    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.b.a("user_id", str);
    }

    @Override // com.amplitude.id.h
    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        this.b.a("device_id", str);
    }

    @Override // com.amplitude.id.h
    public final c load() {
        com.amplitude.id.utilities.b bVar = this.b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("user_id", Constants.KEY);
        String property = bVar.b.getProperty("user_id", null);
        Intrinsics.checkNotNullParameter("device_id", Constants.KEY);
        return new c(property, bVar.b.getProperty("device_id", null));
    }
}
