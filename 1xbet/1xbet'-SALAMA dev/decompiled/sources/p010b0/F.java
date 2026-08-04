package p010b0;

import j6.a;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import p065i6.d;
import p077k6.i;
import t6.o;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class F extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f9930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f9934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(p pVar, O o7, o oVar, d dVar) {
        super(1, dVar);
        this.f9932c = pVar;
        this.f9933d = o7;
        this.f9934e = oVar;
    }

    @Override // p077k6.a
    public final d create(d dVar) {
        return new F(this.f9932c, this.f9933d, this.f9934e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((d) obj)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        o oVar;
        a aVar = a.f14648a;
        int i7 = this.f9931b;
        o oVar2 = this.f9934e;
        p pVar2 = this.f9932c;
        O o7 = this.f9933d;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    pVar = (p) this.f9930a;
                    p003a.a.p0(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (o) this.f9930a;
                        p003a.a.p0(obj);
                        oVar2.f16477a = ((Number) obj).intValue();
                        return p044f6.i.f13014a;
                    }
                    oVar = (o) this.f9930a;
                    p003a.a.p0(obj);
                }
                oVar.f16477a = ((Number) obj).intValue();
                return p044f6.i.f13014a;
            }
            p003a.a.p0(obj);
            this.f9930a = pVar2;
            this.f9931b = 1;
            obj = o7.i(this);
            if (obj == aVar) {
                return aVar;
            }
            pVar = pVar2;
            pVar.f16478a = obj;
            h0 h0VarG = o7.g();
            this.f9930a = oVar2;
            this.f9931b = 2;
            obj = h0VarG.a();
            if (obj == aVar) {
                return aVar;
            }
            oVar = oVar2;
            oVar.f16477a = ((Number) obj).intValue();
            return p044f6.i.f13014a;
        } catch (C0732c unused) {
            Object obj2 = pVar2.f16478a;
            this.f9930a = oVar2;
            this.f9931b = 3;
            obj = o7.j(obj2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
    }
}
