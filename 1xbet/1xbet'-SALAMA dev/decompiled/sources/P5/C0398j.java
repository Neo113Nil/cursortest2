package P5;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p010b0.InterfaceC0738i;

/* JADX INFO: renamed from: P5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0398j extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398j(L l7, List list, p065i6.d dVar) {
        super(2, dVar);
        this.f5657b = l7;
        this.f5658c = list;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new C0398j(this.f5657b, this.f5658c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0398j) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5656a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            Context context = this.f5657b.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            InterfaceC0738i interfaceC0738iA = M.a(context);
            C0397i c0397i = new C0397i(this.f5658c, null);
            this.f5656a = 1;
            obj = interfaceC0738iA.a(new p030e0.i(c0397i, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return obj;
    }
}
