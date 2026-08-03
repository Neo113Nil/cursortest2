package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class Z extends android.database.ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f7533d = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7534a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.InterfaceC0991a f7535b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.screenshot.impl.C0895k f7536c;

    public Z(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.C0902s c0902s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f7534a = clientContext;
        this.f7535b = c0902s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, android.net.Uri uri) {
        io.appmetrica.analytics.screenshot.impl.C0895k c0895k;
        super.onChange(z2, uri);
        if (!y1.o.K(java.lang.String.valueOf(uri), f7533d, false) || (c0895k = this.f7536c) == null) {
            return;
        }
        try {
            java.util.List elements = c0895k.f7564b;
            kotlin.jvm.internal.i.e(elements, "elements");
            int i2 = 1;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.String[]{"date_added"}, elements.size() + 1);
            java.util.Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i2] = it.next();
                i2++;
            }
            kotlin.jvm.internal.i.b(copyOf);
            java.lang.String[] strArr = (java.lang.String[]) copyOf;
            android.database.Cursor query = this.f7534a.getContext().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new java.lang.String[]{java.lang.String.valueOf(new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider().currentTimeSeconds() - c0895k.f7565c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (java.lang.String str : strArr) {
                        }
                        java.util.Iterator it2 = c0895k.f7564b.iterator();
                        while (it2.hasNext()) {
                            if (y1.g.M(query.getString(query.getColumnIndexOrThrow((java.lang.String) it2.next())).toLowerCase(java.util.Locale.ROOT), "screenshot")) {
                                this.f7535b.invoke();
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        Q1.d.g(query, th);
                        throw th2;
                    }
                }
            }
            Q1.d.g(query, null);
        } catch (java.lang.Exception unused) {
        }
    }
}
