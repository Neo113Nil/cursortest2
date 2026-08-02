package b0;

import D6.C0136t;
import k6.AbstractC1356c;

/* renamed from: b0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774w extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public Object f10107a;

    /* renamed from: b, reason: collision with root package name */
    public O f10108b;

    /* renamed from: c, reason: collision with root package name */
    public C0136t f10109c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f10111e;

    /* renamed from: f, reason: collision with root package name */
    public int f10112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774w(O o7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10111e = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10110d = obj;
        this.f10112f |= Integer.MIN_VALUE;
        return O.c(this.f10111e, null, this);
    }
}
