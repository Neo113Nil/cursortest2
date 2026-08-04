package p010b0;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f9936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o7, d dVar) {
        super(2, dVar);
        this.f9936b = o7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new G(this.f9936b, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.f9935a;
        O o7 = this.f9936b;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    p003a.a.p0(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj);
                }
                return (i0) obj;
            }
            p003a.a.p0(obj);
            if (o7.f9971h.p() instanceof Z) {
                return o7.f9971h.p();
            }
            this.f9935a = 1;
            if (o7.h(this) == aVar) {
                return aVar;
            }
            this.f9935a = 2;
            obj = O.e(o7, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (i0) obj;
        } catch (Throwable th) {
            return new b0(th, -1);
        }
    }
}
