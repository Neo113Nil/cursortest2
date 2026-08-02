package Bi;

import Bi.k;
import Hi.l;
import Sc.r;
import Sc.s;
import We.C;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.contract.GalleryLauncher$Companion$getMediaByUri$2", f = "GalleryLauncher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Hi.l>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f3831d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f3832e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Uri f3833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Context context, Uri uri, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f3832e = context;
        this.f3833f = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        l lVar = new l(this.f3832e, this.f3833f, dVar);
        lVar.f3831d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Hi.l> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        long j11;
        Long y02;
        Object bVar;
        Context context = this.f3832e;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Uri uri = this.f3833f;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = context.getContentResolver().getType(uri);
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        Object obj2 = null;
        if (a11 instanceof r.b) {
            a11 = null;
        }
        String mimeType = (String) a11;
        Cursor query = context.getContentResolver().query(this.f3833f, new String[]{"_id", "mime_type", "duration", "_display_name", "_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                int b11 = k.a.b(query, "_id");
                int b12 = k.a.b(query, "mime_type");
                int b13 = k.a.b(query, "duration");
                Long valueOf = (b11 < 0 || query.isNull(b11)) ? null : Long.valueOf(query.getLong(b11));
                Uri uri2 = this.f3833f;
                if (valueOf != null) {
                    j11 = valueOf.longValue();
                } else {
                    String lastPathSegment = uri2.getLastPathSegment();
                    j11 = (lastPathSegment == null || (y02 = kotlin.text.h.y0(lastPathSegment)) == null) ? uri2.toString().hashCode() : y02.longValue();
                }
                long j12 = j11;
                if (mimeType == null && (mimeType = k.a.c(query, b12)) == null) {
                    mimeType = "";
                }
                Long valueOf2 = (b13 < 0 || query.isNull(b13)) ? null : Long.valueOf(query.getLong(b13));
                long longValue = valueOf2 != null ? valueOf2.longValue() : 0L;
                C.f33536g.getClass();
                C b14 = C.a.b(mimeType);
                int b15 = k.a.b(query, "_display_name");
                int b16 = k.a.b(query, "_display_name");
                String c11 = k.a.c(query, b15);
                if (c11 == null && (c11 = k.a.c(query, b16)) == null) {
                    c11 = uri2.getLastPathSegment();
                }
                String str = c11;
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                if (kotlin.text.h.e0(mimeType, "image", false)) {
                    bVar = new l.a(j12, uri2, str, b14);
                } else {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    if (kotlin.text.h.e0(mimeType, "video", false)) {
                        bVar = new l.b(j12, uri2, str, b14, longValue);
                    }
                    query.close();
                }
                obj2 = bVar;
                query.close();
            } finally {
            }
        }
        return obj2;
    }
}
