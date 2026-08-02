package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e40 {

    /* JADX INFO: renamed from: a */
    public static final rk0 f1947a = new rk0(2);

    /* JADX INFO: renamed from: b */
    public static final c40 f1948b = new c40(0);

    /* JADX INFO: renamed from: a */
    public static C0678s3 m1360a(Context context, List list) {
        String str;
        Typeface typefaceM5794e;
        wo1.m5378a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                f40 f40Var = (f40) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM5794e = ye1.m5794e((str = f40Var.f2306e))) == null || ye1.m5795f(typefaceM5794e) == null) {
                    ProviderInfo providerInfoM1361b = m1361b(context.getPackageManager(), f40Var, context.getResources());
                    if (providerInfoM1361b == null) {
                        return new C0678s3(3);
                    }
                    arrayList.add(m1362c(context, f40Var, providerInfoM1361b.authority));
                } else {
                    arrayList.add(new q40[]{new q40(str, f40Var.f2307f)});
                }
            }
            C0678s3 c0678s3 = new C0678s3();
            c0678s3.f7021j = 0;
            c0678s3.f7022k = arrayList;
            return c0678s3;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m1361b(PackageManager packageManager, f40 f40Var, Resources resources) {
        c40 c40Var = f1948b;
        rk0 rk0Var = f1947a;
        wo1.m5378a("FontProvider.getProvider");
        try {
            List listM5987p = f40Var.f2305d;
            String str = f40Var.f2302a;
            String str2 = f40Var.f2303b;
            if (listM5987p == null) {
                listM5987p = AbstractC0959zp.m5987p(resources, 0);
            }
            d40 d40Var = new d40();
            d40Var.f1547a = str;
            d40Var.f1548b = str2;
            d40Var.f1549c = listM5987p;
            ProviderInfo providerInfo = (ProviderInfo) rk0Var.m4362b(d40Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c40Var);
            for (int i = 0; i < listM5987p.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM5987p.get(i));
                Collections.sort(arrayList2, c40Var);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            rk0Var.m4363c(d40Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static q40[] m1362c(Context context, f40 f40Var, String str) {
        wo1.m5378a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                wo1.m5378a("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {f40Var.f2304c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new q40(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, f40Var.f2307f, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    q40[] q40VarArr = (q40[]) arrayList.toArray(new q40[0]);
                    Trace.endSection();
                    return q40VarArr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
