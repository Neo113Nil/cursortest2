package com.flurry.android.agent;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import java.util.Locale;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC0998i1;
import p155w1.H2;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public class FlurryContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UriMatcher f10452b = new UriMatcher(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10453c = System.nanoTime();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MatrixCursor f10454a;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            if (!AbstractC0997i0.k(16)) {
                AbstractC0997i0.o(5, String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
                return true;
            }
            AbstractC0998i1.f17749c = getContext().getApplicationContext();
            Runtime runtime = Runtime.getRuntime();
            ActivityManager.MemoryInfo memoryInfoA = AbstractC0997i0.a(getContext());
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"START_TIME", "RUNTIME_USED_MEMORY", "SYSTEM_USED_MEMORY"});
            this.f10454a = matrixCursor;
            matrixCursor.newRow().add(Long.valueOf(f10453c)).add(Long.valueOf(runtime.totalMemory() - runtime.freeMemory())).add(Long.valueOf(memoryInfoA.totalMem - memoryInfoA.availMem));
            V0.d().h(getContext(), this.f10454a);
            f10452b.addURI(getContext().getApplicationContext().getPackageName() + ".FlurryContentProvider", "performance", 1);
            H2.a();
            return true;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f10452b.match(uri) != 1) {
            return null;
        }
        return this.f10454a;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
