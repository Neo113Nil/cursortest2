package v;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0999b {

    /* renamed from: a, reason: collision with root package name */
    public static final v.C0998a f8361a = new v.C0998a();

    public static M1.n a(android.content.Context context, I1.u uVar) {
        android.database.Cursor cursor;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = uVar.f829b;
        android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
        }
        java.lang.String str2 = resolveContentProvider.packageName;
        java.lang.String str3 = (java.lang.String) uVar.f830c;
        if (!str2.equals(str3)) {
            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        v.C0998a c0998a = f8361a;
        java.util.Collections.sort(arrayList, c0998a);
        java.util.List list = (java.util.List) uVar.f832e;
        if (list == null) {
            list = u0.AbstractC0995a.y(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursor = null;
            if (i2 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) list.get(i2));
            java.util.Collections.sort(arrayList2, c0998a);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!java.util.Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        if (resolveContentProvider == null) {
            return new M1.n(1, (java.lang.Object[]) null);
        }
        java.lang.String str4 = resolveContentProvider.authority;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str4).build();
        android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
        try {
            java.lang.String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            java.lang.String[] strArr2 = {(java.lang.String) uVar.f831d};
            if (acquireUnstableContentProviderClient != null) {
                try {
                    cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                } catch (android.os.RemoteException e2) {
                    android.util.Log.w("FontsProvider", "Unable to query the content provider", e2);
                }
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new java.util.ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList3.add(new v.g(columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            return new M1.n(0, (v.g[]) arrayList3.toArray(new v.g[0]));
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }
}
