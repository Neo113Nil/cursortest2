package Yl0;

import Sc.s;
import em0.C6382a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mb.C8122a;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushTokenUseCase$invoke$2", f = "RegisterPushTokenUseCase.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Sc.r<? extends C6382a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public Object f35174d;

    /* renamed from: e, reason: collision with root package name */
    public int f35175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f35176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f35177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, kotlin.coroutines.d<? super k> dVar) {
        super(1, dVar);
        this.f35176f = lVar;
        this.f35177g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new k(this.f35176f, this.f35177g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Sc.r<? extends C6382a>> dVar) {
        return new k(this.f35176f, this.f35177g, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r1 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35175e;
        l lVar = this.f35176f;
        if (i11 == 0) {
            s.b(obj);
            Nl0.n nVar = lVar.f35178a;
            this.f35175e = 1;
            a11 = nVar.a(this.f35177g, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f35174d;
                s.b(obj);
                return Sc.r.a(obj2);
            }
            s.b(obj);
            a11 = ((Sc.r) obj).getF26106a();
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null && (b11 instanceof C8122a)) {
            lVar.f35181d.b("Register for pushes has failed, received HostIsNotMasterException", null);
            this.f35174d = a11;
            this.f35175e = 2;
            Object b12 = lVar.f35180c.f19639a.b(this);
            if (b12 != aVar) {
                b12 = Unit.f71690a;
            }
        }
        obj2 = a11;
        return Sc.r.a(obj2);
    }
}
