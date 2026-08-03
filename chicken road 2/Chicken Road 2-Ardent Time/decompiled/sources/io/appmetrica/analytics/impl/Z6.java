package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I6 f5383a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f5384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5385c;

    public Z6(io.appmetrica.analytics.impl.I6 i6, java.util.ArrayList arrayList, boolean z2) {
        this.f5383a = i6;
        this.f5384b = arrayList;
        this.f5385c = z2;
    }

    public final java.lang.String a(android.content.Context context, io.appmetrica.analytics.impl.X6 x6) {
        java.io.File parentFile;
        try {
            java.io.File a2 = this.f5383a.a(context, x6.b());
            if (!a2.exists() && (parentFile = a2.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, x6.a(), a2);
            }
            return a2.getPath();
        } catch (java.lang.Throwable unused) {
            return x6.b();
        }
    }

    public final void a(android.content.Context context, java.lang.String str, java.io.File file) {
        java.util.List list = this.f5384b;
        if (list == null || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.io.File a2 = ((io.appmetrica.analytics.impl.I6) it.next()).a(context, str);
                if (a2.exists()) {
                    try {
                        if (this.f5385c) {
                            io.appmetrica.analytics.coreutils.internal.io.FileUtils.copyToNullable(a2, file);
                        } else {
                            io.appmetrica.analytics.coreutils.internal.io.FileUtils.move(a2, file);
                        }
                        java.lang.String path = a2.getPath();
                        java.lang.String path2 = file.getPath();
                        for (java.lang.String str2 : i1.AbstractC0191j.H("-journal", "-shm", "-wal")) {
                            java.io.File file2 = new java.io.File(path + str2);
                            java.io.File file3 = new java.io.File(path2 + str2);
                            if (this.f5385c) {
                                io.appmetrica.analytics.coreutils.internal.io.FileUtils.copyToNullable(file2, file3);
                            } else {
                                io.appmetrica.analytics.coreutils.internal.io.FileUtils.move(file2, file3);
                            }
                        }
                        return;
                    } catch (java.lang.Throwable unused) {
                        continue;
                    }
                }
            }
        }
    }
}
