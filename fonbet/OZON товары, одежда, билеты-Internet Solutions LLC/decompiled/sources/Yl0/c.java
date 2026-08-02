package Yl0;

import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm0.InterfaceC5683a;
import fm0.InterfaceC6586g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5683a f35151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f35152b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f35153c;

    public static final class a extends AbstractC7737t implements Function0<Za.d> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Za.d f35154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f35155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Za.d dVar, c cVar) {
            super(0);
            this.f35154b = dVar;
            this.f35155c = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Za.d invoke() {
            return this.f35154b.a(this.f35155c);
        }
    }

    public c(@NotNull InterfaceC5683a pushTokenRepository, @NotNull InterfaceC6586g storage, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(pushTokenRepository, "pushTokenRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f35151a = pushTokenRepository;
        this.f35152b = storage;
        this.f35153c = Sc.k.b(new a(logger, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r7.e(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r2.f35151a.a(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        c cVar2;
        String str;
        c cVar3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f35150h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f35150h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f35148f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f35150h;
                if (i11 != 0) {
                    s.b(obj);
                    bVar.f35146d = this;
                    bVar.f35147e = z11;
                    bVar.f35150h = 1;
                    obj = this.f35152b.a(bVar);
                    if (obj != aVar) {
                        cVar2 = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    z11 = bVar.f35147e;
                    cVar2 = bVar.f35146d;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    cVar3 = bVar.f35146d;
                    s.b(obj);
                    ((Sc.r) obj).getClass();
                    InterfaceC6586g interfaceC6586g = cVar3.f35152b;
                    bVar.f35146d = null;
                    bVar.f35150h = 3;
                }
                str = (String) obj;
                if (str == null && z11) {
                    ((Za.d) cVar2.f35153c.getValue()).info("Push token exists, need to remote delete token");
                    bVar.f35146d = cVar2;
                    bVar.f35150h = 2;
                } else {
                    ((Za.d) cVar2.f35153c.getValue()).info("Push token is null, no need to remote delete token");
                }
                cVar3 = cVar2;
                InterfaceC6586g interfaceC6586g2 = cVar3.f35152b;
                bVar.f35146d = null;
                bVar.f35150h = 3;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f35148f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f35150h;
        if (i11 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        ((Za.d) cVar2.f35153c.getValue()).info("Push token is null, no need to remote delete token");
        cVar3 = cVar2;
        InterfaceC6586g interfaceC6586g22 = cVar3.f35152b;
        bVar.f35146d = null;
        bVar.f35150h = 3;
    }
}
