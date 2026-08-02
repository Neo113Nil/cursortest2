package k1;

import A0.S0;
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
import android.os.Trace;
import e2.C1930k;
import f1.AbstractC1940b;
import g1.AbstractC1970d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k0.C2023c;
import r.r;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final r f17556a = new r(2);

    /* renamed from: b, reason: collision with root package name */
    public static final S0 f17557b = new S0(4);

    public static C2.h a(Context context, List list) {
        String str;
        Typeface c5;
        AbstractC2425d.k("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                e eVar = (e) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c5 = AbstractC1970d.c((str = eVar.f17562e))) == null || AbstractC1970d.d(c5) == null) {
                    ProviderInfo b3 = b(context.getPackageManager(), eVar, context.getResources());
                    if (b3 == null) {
                        return new C2.h(11, (byte) 0);
                    }
                    arrayList.add(c(context, eVar, b3.authority));
                } else {
                    arrayList.add(new i[]{new i(str, eVar.f)});
                }
            }
            return new C2.h(11, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        AbstractC2425d.k("FontProvider.getProvider");
        try {
            List list = eVar.f17561d;
            String str = eVar.f17558a;
            String str2 = eVar.f17559b;
            if (list == null) {
                list = AbstractC1940b.h(resources, 0);
            }
            c cVar = new c();
            cVar.f17553a = str;
            cVar.f17554b = str2;
            cVar.f17555c = list;
            r rVar = f17556a;
            ProviderInfo providerInfo = (ProviderInfo) rVar.b(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            S0 s02 = f17557b;
            Collections.sort(arrayList, s02);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, s02);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        }
                    }
                    rVar.c(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, e eVar, String str) {
        AbstractC2425d.k("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            b c1930k = Build.VERSION.SDK_INT < 24 ? new C1930k(context, build) : new C2023c(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC2425d.k("ContentQueryWrapper.query");
                try {
                    cursor = c1930k.c(build, strArr, new String[]{eVar.f17560c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, eVar.f, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c1930k.close();
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                c1930k.close();
                throw th;
            }
        } finally {
        }
    }
}
