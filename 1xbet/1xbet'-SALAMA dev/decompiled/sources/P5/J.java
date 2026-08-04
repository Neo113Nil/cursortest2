package P5;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import p010b0.InterfaceC0738i;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f5621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, L l7, long j, p065i6.d dVar) {
        super(2, dVar);
        this.f5620b = str;
        this.f5621c = l7;
        this.f5622d = j;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new J(this.f5620b, this.f5621c, this.f5622d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5619a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p030e0.e eVar = new p030e0.e(this.f5620b);
            Context context = this.f5621c.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            InterfaceC0738i interfaceC0738iA = M.a(context);
            I i8 = new I(eVar, this.f5622d, null);
            this.f5619a = 1;
            if (interfaceC0738iA.a(new p030e0.i(i8, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
