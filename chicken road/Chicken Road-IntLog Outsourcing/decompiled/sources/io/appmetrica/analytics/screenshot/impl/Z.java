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
import t4.InterfaceC1430a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10001d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10002a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1430a f10003b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1179k f10004c;

    public Z(ClientContext clientContext, C1186s c1186s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f10002a = clientContext;
        this.f10003b = c1186s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C1179k c1179k;
        super.onChange(z, uri);
        if (!B4.r.O(String.valueOf(uri), f10001d, false) || (c1179k = this.f10004c) == null) {
            return;
        }
        try {
            List elements = c1179k.f10032b;
            kotlin.jvm.internal.i.e(elements, "elements");
            int i2 = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i2] = it.next();
                i2++;
            }
            kotlin.jvm.internal.i.b(copyOf);
            String[] strArr = (String[]) copyOf;
            Cursor query = this.f10002a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c1179k.f10033c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c1179k.f10032b.iterator();
                        while (it2.hasNext()) {
                            if (B4.k.R(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.f10003b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1477a.e(query, th);
                        throw th2;
                    }
                }
            }
            AbstractC1477a.e(query, null);
        } catch (Exception unused) {
        }
    }
}
