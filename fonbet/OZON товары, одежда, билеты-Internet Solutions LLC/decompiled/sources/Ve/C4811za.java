package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import xe.C10727i;

/* renamed from: Ve.za, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4811za extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32636d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f32637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4811za(C2406m0 c2406m0, kotlin.coroutines.d dVar, Mq mq) {
        super(2, dVar);
        this.f32638f = c2406m0;
        this.f32639g = mq;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32636d) {
            case 0:
                return new C4811za((RedirectActivity) this.f32638f, (Bundle) this.f32639g, dVar);
            default:
                return new C4811za((C2406m0) this.f32638f, dVar, (Mq) this.f32639g);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f32636d) {
            case 0:
                return new C4811za((RedirectActivity) this.f32638f, (Bundle) this.f32639g, dVar).invokeSuspend(Unit.f71690a);
            default:
                return new C4811za((C2406m0) this.f32638f, dVar, (Mq) this.f32639g).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.f32636d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32637e;
                RedirectActivity redirectActivity = (RedirectActivity) this.f32638f;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f32637e = 1;
                    if (RedirectActivity.a(redirectActivity, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        Sc.s.b(obj);
                        super/*androidx.fragment.app.r*/.onCreate((Bundle) this.f32639g);
                        Intrinsics.checkNotNullParameter(redirectActivity, "<this>");
                        if (redirectActivity.f98833b != null) {
                            redirectActivity.a();
                            C4744x c4744x = redirectActivity.f98833b;
                            if (c4744x == null) {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                            Ae.M0 b11 = C2399j.b(c4744x.f32410O);
                            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                            C10727i.c(androidx.lifecycle.K.a(redirectActivity), null, null, new C4198e0(redirectActivity, bVar, b11, null, redirectActivity), 3);
                            C4744x c4744x2 = redirectActivity.f98833b;
                            if (c4744x2 == null) {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                            C10727i.c(androidx.lifecycle.K.a(redirectActivity), null, null, new C4433m4(redirectActivity, bVar, new C2406m0(c4744x2.f32409N), null, redirectActivity), 3);
                            C4744x c4744x3 = redirectActivity.f98833b;
                            if (c4744x3 == null) {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                            C10727i.c(androidx.lifecycle.K.a(redirectActivity), null, null, new C6(redirectActivity, bVar, C2399j.b(c4744x3.f32401F), null, redirectActivity), 3);
                            C4744x c4744x4 = redirectActivity.f98833b;
                            if (c4744x4 == null) {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                            C10727i.c(androidx.lifecycle.K.a(redirectActivity), null, null, new X1(redirectActivity, bVar, new C2406m0(C2399j.b(c4744x4.f32411P)), null, redirectActivity), 3);
                        }
                        this.f32637e = 3;
                        if (RedirectActivity.b(redirectActivity, this) == aVar) {
                            return aVar;
                        }
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                }
                C4792yj c4792yj = Ul.f30136b;
                if (c4792yj != null) {
                    redirectActivity.f98832a = (Rq) c4792yj.f32595l.get();
                    Yj yj2 = c4792yj.f32584a;
                    redirectActivity.f98834c = new C4463n5((Vm) yj2.f30483k.get(), yj2.c(), (C4776y3) c4792yj.f32592i.get(), (InterfaceC4686uq) yj2.f30495w.get(), (Y9) c4792yj.f32590g.get(), (Vl) c4792yj.f32586c.get(), new Fa());
                    Context context = yj2.f30473a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(context, "context");
                    redirectActivity.f98835d = c4792yj.a();
                    redirectActivity.f98836e = (InterfaceC4436m7) yj2.f30484l.get();
                }
                this.f32637e = 2;
                if (RedirectActivity.c(redirectActivity, this) == aVar) {
                    return aVar;
                }
                super/*androidx.fragment.app.r*/.onCreate((Bundle) this.f32639g);
                Intrinsics.checkNotNullParameter(redirectActivity, "<this>");
                if (redirectActivity.f98833b != null) {
                }
                this.f32637e = 3;
                if (RedirectActivity.b(redirectActivity, this) == aVar) {
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32637e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4778y5 c4778y5 = new C4778y5((Mq) this.f32639g, 1);
                    this.f32637e = 1;
                    if (((C2406m0) this.f32638f).collect(c4778y5, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4811za(RedirectActivity redirectActivity, Bundle bundle, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32638f = redirectActivity;
        this.f32639g = bundle;
    }
}
