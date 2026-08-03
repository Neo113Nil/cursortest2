package androidx.startup;

/* loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            throw new E1.A("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        R.a c2 = R.a.c(context);
        android.content.Context context2 = c2.f1650c;
        try {
            try {
                android.os.Trace.beginSection(Q1.l.A("Startup"));
                c2.a(context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2.getPackageName(), androidx.startup.InitializationProvider.class.getName()), 128).metaData);
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                throw new E1.A(e2);
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
