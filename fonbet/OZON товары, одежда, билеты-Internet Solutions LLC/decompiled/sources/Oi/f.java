package Oi;

import B0.A0;
import Hi.k;
import Sc.s;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.files.OzMediaFileManagerImpl$getMediaFiles$2", f = "OzMediaFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super List<? extends k>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f20406d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Uri f20407e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String[] f20408f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f20409g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f20410h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f20411i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String[] f20412j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(c cVar, Uri uri, String[] strArr, int i11, int i12, String str, String[] strArr2, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f20406d = cVar;
        this.f20407e = uri;
        this.f20408f = strArr;
        this.f20409g = i11;
        this.f20410h = i12;
        this.f20411i = str;
        this.f20412j = strArr2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f20406d, this.f20407e, this.f20408f, this.f20409g, this.f20410h, this.f20411i, this.f20412j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends k>> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ContentResolver contentResolver;
        String str;
        ContentResolver contentResolver2;
        String[] stringArray;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        Uri uri = this.f20407e;
        Tc.b bVar = null;
        r3 = null;
        Set set = null;
        Tc.b g10 = null;
        c cVar = this.f20406d;
        int i13 = this.f20409g;
        int i14 = this.f20410h;
        if (i11 < 29) {
            String a11 = (i13 <= 0 || i14 < 0) ? i14 >= 0 ? Ej.b.a(i14, "limit=") : "" : A0.a(i13, i14, "limit=", ",");
            contentResolver = cVar.f20397b;
            if (a11.length() > 0) {
                uri = uri.buildUpon().encodedQuery(a11).build();
            }
            str = c.f20395e;
            Cursor query = contentResolver.query(uri, this.f20408f, this.f20411i, this.f20412j, str);
            if (query != null) {
                try {
                    bVar = c.g(cVar, query, i13, 0, i14);
                    query.close();
                } finally {
                }
            }
            if (bVar != null) {
                return bVar;
            }
            throw new a();
        }
        Bundle bundle = new Bundle();
        bundle.putString("android:query-arg-sql-selection", this.f20411i);
        bundle.putStringArray("android:query-arg-sql-selection-args", this.f20412j);
        if (i14 >= 0) {
            bundle.putInt("android:query-arg-limit", i14);
        }
        bundle.putInt("android:query-arg-offset", i13);
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        contentResolver2 = cVar.f20397b;
        Cursor query2 = contentResolver2.query(uri, this.f20408f, bundle, null);
        if (query2 != null) {
            try {
                Bundle extras = query2.getExtras();
                if (extras != null && (stringArray = extras.getStringArray("android.content.extra.HONORED_ARGS")) != null) {
                    set = C7705l.j0(stringArray);
                }
                if (set == null) {
                    set = kotlin.collections.M.f71699a;
                }
                if (!set.contains("android:query-arg-offset")) {
                    i12 = i13;
                }
                g10 = c.g(cVar, query2, i13, i12, i14);
                query2.close();
            } finally {
            }
        }
        if (g10 != null) {
            return g10;
        }
        throw new a();
    }
}
