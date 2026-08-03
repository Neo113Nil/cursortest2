package com.ironsource.environment;

/* loaded from: classes5.dex */
public class CrashProvider extends android.content.ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    android.content.Context f6221a;
    com.ironsource.E4 b;
    java.lang.String c;
    android.net.Uri e;
    java.lang.String h;
    java.lang.String i;
    android.content.UriMatcher d = new android.content.UriMatcher(-1);
    final int f = 1;
    final int g = 2;
    final java.lang.String j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        int match = this.d.match(uri);
        if (match == 1) {
            return this.h;
        }
        if (match == 2) {
            return this.i;
        }
        throw new java.lang.IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f6221a = getContext();
        this.b = new com.ironsource.E4(this.f6221a);
        this.c = this.f6221a.getPackageName();
        this.e = android.net.Uri.parse("content://" + this.c + "/REPORTS");
        this.h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int match = this.d.match(uri);
        if (match == 1) {
            return com.ironsource.E4.c();
        }
        if (match == 2) {
            return com.ironsource.E4.a(java.lang.Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new java.lang.IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
