package D50;

import Sc.s;
import android.widget.ImageView;
import j3.y;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.H0;
import xe.M;
import xe.N;
import xe.Y;
import z50.C10989c;

@e(c = "ru.ozon.fintech.features.cbottomstories.presentation.picplayer.PicPlayer$startTimer$1", f = "PicPlayer.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6082d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f6083e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f6084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f6084f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f6084f, dVar);
        bVar.f6083e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if ((r5 == null ? r5.getDrawable() : null) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        y.c cVar;
        B0 b02;
        ImageView imageView;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6082d;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.f6083e;
            if (N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f6083e;
            s.b(obj);
            c cVar2 = this.f6084f;
            String f7 = cVar2.f();
            if (f7 != null && f7.length() > 0) {
                imageView = cVar2.f6094j;
            }
            cVar2.r(cVar2.g() + 20);
            C10989c.a("PicPlayer", "timer currentPosition=" + cVar2.g());
            if (cVar2.g() > cVar2.h()) {
                cVar = cVar2.f6091g;
                if (cVar != null) {
                    cVar.onPlaybackStateChanged(4);
                }
                b02 = cVar2.f6092h;
                if (b02 != null) {
                    ((H0) b02).j(null);
                }
            }
            if (N.f(m11)) {
                this.f6083e = m11;
                this.f6082d = 1;
                if (Y.b(20L, this) == aVar) {
                    return aVar;
                }
                c cVar22 = this.f6084f;
                String f72 = cVar22.f();
                if (f72 != null) {
                    imageView = cVar22.f6094j;
                }
                cVar22.r(cVar22.g() + 20);
                C10989c.a("PicPlayer", "timer currentPosition=" + cVar22.g());
                if (cVar22.g() > cVar22.h()) {
                }
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
