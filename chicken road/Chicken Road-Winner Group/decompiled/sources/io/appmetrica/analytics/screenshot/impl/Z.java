package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f9020d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9021a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.a f9022b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1030k f9023c;

    public Z(ClientContext clientContext, C1037s c1037s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f9021a = clientContext;
        this.f9022b = c1037s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        C1030k c1030k;
        super.onChange(z3, uri);
        if (!v2.m.q0(String.valueOf(uri), f9020d) || (c1030k = this.f9023c) == null) {
            return;
        }
        try {
            List elements = c1030k.f9050b;
            kotlin.jvm.internal.j.e(elements, "elements");
            int i3 = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i3] = it.next();
                i3++;
            }
            kotlin.jvm.internal.j.b(copyOf);
            String[] strArr = (String[]) copyOf;
            Cursor query = this.f9021a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c1030k.f9051c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c1030k.f9050b.iterator();
                        while (it2.hasNext()) {
                            if (v2.m.k0(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot")) {
                                this.f9022b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        F2.b.k(query, th);
                        throw th2;
                    }
                }
            }
            F2.b.k(query, null);
        } catch (Exception unused) {
        }
    }
}
