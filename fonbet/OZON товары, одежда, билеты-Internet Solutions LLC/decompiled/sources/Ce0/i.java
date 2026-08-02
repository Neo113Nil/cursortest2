package Ce0;

import J4.k;
import J4.l;
import J4.s;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import ru.ozon.mapsdk.common.storage.cache.CacheDatabase_Impl;

/* loaded from: classes7.dex */
public final class i implements Ce0.e {

    /* renamed from: a, reason: collision with root package name */
    private final CacheDatabase_Impl f4819a;

    /* renamed from: b, reason: collision with root package name */
    private final l<De0.b> f4820b;

    /* renamed from: c, reason: collision with root package name */
    private final k<De0.b> f4821c;

    /* renamed from: d, reason: collision with root package name */
    private final k<De0.b> f4822d;

    final class a implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ De0.b f4823a;

        a(De0.b bVar) {
            this.f4823a = bVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f4819a.beginTransaction();
            try {
                iVar.f4820b.insert((l) this.f4823a);
                iVar.f4819a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f4819a.endTransaction();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ De0.b f4825a;

        b(De0.b bVar) {
            this.f4825a = bVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f4819a.beginTransaction();
            try {
                iVar.f4821c.handle(this.f4825a);
                iVar.f4819a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f4819a.endTransaction();
            }
        }
    }

    final class c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ De0.b f4827a;

        c(De0.b bVar) {
            this.f4827a = bVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f4819a.beginTransaction();
            try {
                iVar.f4822d.handle(this.f4827a);
                iVar.f4819a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f4819a.endTransaction();
            }
        }
    }

    final class d implements Callable<List<De0.b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f4829a;

        d(w wVar) {
            this.f4829a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<De0.b> call() throws Exception {
            s sVar = i.this.f4819a;
            w wVar = this.f4829a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, ImagesContract.URL);
                int b13 = L4.a.b(b11, "file");
                int b14 = L4.a.b(b11, "last_use_unix_time");
                int b15 = L4.a.b(b11, "is_fallback");
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    arrayList.add(new De0.b(b11.getString(b12), b11.getBlob(b13), b11.getLong(b14), b11.getInt(b15) != 0));
                }
                return arrayList;
            } finally {
                b11.close();
                wVar.release();
            }
        }
    }

    final class e implements Callable<De0.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f4831a;

        e(w wVar) {
            this.f4831a = wVar;
        }

        @Override // java.util.concurrent.Callable
        public final De0.b call() throws Exception {
            De0.b bVar;
            s sVar = i.this.f4819a;
            w wVar = this.f4831a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, ImagesContract.URL);
                int b13 = L4.a.b(b11, "file");
                int b14 = L4.a.b(b11, "last_use_unix_time");
                int b15 = L4.a.b(b11, "is_fallback");
                if (b11.moveToFirst()) {
                    bVar = new De0.b(b11.getString(b12), b11.getBlob(b13), b11.getLong(b14), b11.getInt(b15) != 0);
                } else {
                    bVar = null;
                }
                return bVar;
            } finally {
                b11.close();
                wVar.release();
            }
        }
    }

    public i(@NonNull CacheDatabase_Impl cacheDatabase_Impl) {
        this.f4819a = cacheDatabase_Impl;
        this.f4820b = new f(cacheDatabase_Impl);
        this.f4821c = new g(cacheDatabase_Impl);
        this.f4822d = new h(cacheDatabase_Impl);
    }

    @Override // Ce0.e
    public final Object a(De0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f4819a, new c(bVar), dVar);
    }

    @Override // Ce0.e
    public final Object b(De0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f4819a, new a(bVar), dVar);
    }

    @Override // Ce0.e
    public final Object c(String str, kotlin.coroutines.d<? super De0.b> dVar) {
        w j11 = w.j(1, "SELECT * FROM cached_style_file WHERE url = ? AND is_fallback = 0 LIMIT 1");
        j11.e0(1, str);
        return J4.f.b(this.f4819a, new CancellationSignal(), new e(j11), dVar);
    }

    @Override // Ce0.e
    public final Object d(kotlin.coroutines.d<? super List<De0.b>> dVar) {
        w j11 = w.j(0, "SELECT * FROM cached_style_file");
        return J4.f.b(this.f4819a, new CancellationSignal(), new d(j11), dVar);
    }

    @Override // Ce0.e
    public final Object e(De0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f4819a, new b(bVar), dVar);
    }
}
