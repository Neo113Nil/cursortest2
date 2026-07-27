package io.appmetrica.analytics.impl;

import android.content.Context;
import g4.AbstractC0466k;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688h7 {

    /* renamed from: a, reason: collision with root package name */
    public final P6 f8312a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8313b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8314c;

    public C0688h7(P6 p6, ArrayList arrayList, boolean z) {
        this.f8312a = p6;
        this.f8313b = arrayList;
        this.f8314c = z;
    }

    public final String a(Context context, InterfaceC0610e7 interfaceC0610e7) {
        File parentFile;
        try {
            File a6 = this.f8312a.a(context, interfaceC0610e7.b());
            if (!a6.exists() && (parentFile = a6.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC0610e7.a(), a6);
            }
            return a6.getPath();
        } catch (Throwable unused) {
            return interfaceC0610e7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f8313b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File a6 = ((P6) it.next()).a(context, str);
                if (a6.exists()) {
                    try {
                        if (this.f8314c) {
                            FileUtils.copyToNullable(a6, file);
                        } else {
                            FileUtils.move(a6, file);
                        }
                        String path = a6.getPath();
                        String path2 = file.getPath();
                        for (String str2 : AbstractC0466k.A0("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f8314c) {
                                FileUtils.copyToNullable(file2, file3);
                            } else {
                                FileUtils.move(file2, file3);
                            }
                        }
                        return;
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
    }
}
