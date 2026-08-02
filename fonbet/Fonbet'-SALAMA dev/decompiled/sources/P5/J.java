package P5;

import a.AbstractC0603a;
import android.content.Context;
import b0.InterfaceC0761i;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class J extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f5621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, L l7, long j, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5620b = str;
        this.f5621c = l7;
        this.f5622d = j;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new J(this.f5620b, this.f5621c, this.f5622d, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5619a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            e0.e eVar = new e0.e(this.f5620b);
            Context context = this.f5621c.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            InterfaceC0761i a2 = M.a(context);
            I i8 = new I(eVar, this.f5622d, null);
            this.f5619a = 1;
            if (a2.a(new e0.i(i8, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return C1116i.f13008a;
    }
}
