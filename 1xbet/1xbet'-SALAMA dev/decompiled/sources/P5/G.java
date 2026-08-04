package P5;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import p010b0.InterfaceC0738i;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f5610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f5611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(String str, L l7, double d7, p065i6.d dVar) {
        super(2, dVar);
        this.f5609b = str;
        this.f5610c = l7;
        this.f5611d = d7;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new G(this.f5609b, this.f5610c, this.f5611d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5608a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p030e0.e eVar = new p030e0.e(this.f5609b);
            Context context = this.f5610c.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            InterfaceC0738i interfaceC0738iA = M.a(context);
            F f7 = new F(eVar, this.f5611d, null);
            this.f5608a = 1;
            if (interfaceC0738iA.a(new p030e0.i(f7, null), this) == aVar) {
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
