package M1;

import G4.l;
import W3.o;
import android.net.Uri;
import android.view.InputEvent;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.e;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class b extends AbstractC0548i implements e {

    /* renamed from: k, reason: collision with root package name */
    public int f3596k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3597l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f3598m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InputEvent f3599n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, a4.c cVar) {
        super(2, cVar);
        this.f3597l = dVar;
        this.f3598m = uri;
        this.f3599n = inputEvent;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new b(this.f3597l, this.f3598m, this.f3599n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3596k;
        if (i == 0) {
            l.N(obj);
            O1.c cVar = this.f3597l.f3603a;
            this.f3596k = 1;
            if (cVar.c(this.f3598m, this.f3599n, this) == enumC0510a) {
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
