package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Bg extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4187dh f28703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Jh f28704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f28705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bg(C4187dh c4187dh, Jh jh2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28703e = c4187dh;
        this.f28704f = jh2;
        this.f28705g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Bg(this.f28703e, this.f28704f, this.f28705g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bg) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4288h3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28702d;
        C4187dh c4187dh = this.f28703e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4187dh.f30882b).b(new C4209eb(new W6()));
            InterfaceC4524p8 interfaceC4524p8 = c4187dh.f30881a;
            this.f28702d = 1;
            obj = ((C4710vl) interfaceC4524p8).e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        boolean z11 = contentResponse instanceof ContentResponse.Failure;
        Jh jh2 = this.f28704f;
        if (z11) {
            c4288h3 = Intrinsics.d(((ContentResponse.Failure) contentResponse).getError(), ErrorEntity.NoInternet.INSTANCE) ? new O0(new Jr(new C4099ag(c4187dh, jh2, this.f28705g, null))) : new C4288h3(new C4787ye(jh2.f29293b));
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            c4288h3 = new C4288h3(new C4156cf(jh2.f29293b));
        }
        ((C4238fb) c4187dh.f30882b).b(c4288h3);
        return Unit.f71690a;
    }
}
