package M1;

import G4.l;
import W3.o;
import android.net.Uri;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.e;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class c extends AbstractC0548i implements e {

    /* renamed from: k, reason: collision with root package name */
    public int f3600k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f3602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, a4.c cVar) {
        super(2, cVar);
        this.f3601l = dVar;
        this.f3602m = uri;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new c(this.f3601l, this.f3602m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3600k;
        if (i == 0) {
            l.N(obj);
            O1.c cVar = this.f3601l.f3603a;
            this.f3600k = 1;
            if (cVar.d(this.f3602m, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        return o.f6046a;
    }
}
