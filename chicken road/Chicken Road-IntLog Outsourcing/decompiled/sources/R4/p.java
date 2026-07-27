package R4;

import f4.C0425b;
import java.util.LinkedHashMap;
import m4.AbstractC1293a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class p extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public C0425b f2694a;

    /* renamed from: b, reason: collision with root package name */
    public q f2695b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f2696c;

    /* renamed from: d, reason: collision with root package name */
    public String f2697d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f2699f;

    /* renamed from: g, reason: collision with root package name */
    public int f2700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, AbstractC1293a abstractC1293a) {
        super(abstractC1293a);
        this.f2699f = qVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2698e = obj;
        this.f2700g |= Integer.MIN_VALUE;
        return q.a(this.f2699f, null, this);
    }
}
