package Oi;

import Sc.s;
import android.content.ContentResolver;
import android.database.Cursor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.files.OzMediaFileManagerImpl$getMediaCount$2", f = "OzMediaFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Integer>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f20404d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Hi.d f20405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, Hi.d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f20404d = cVar;
        this.f20405e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f20404d, this.f20405e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Integer> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ContentResolver contentResolver;
        Integer num;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        contentResolver = this.f20404d.f20397b;
        Hi.d dVar = this.f20405e;
        Cursor query = contentResolver.query(c.f20393c, new String[]{"_id"}, dVar.m(), dVar.n(), null, null);
        if (query != null) {
            try {
                num = new Integer(query.getCount());
                query.close();
            } finally {
            }
        } else {
            num = null;
        }
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
