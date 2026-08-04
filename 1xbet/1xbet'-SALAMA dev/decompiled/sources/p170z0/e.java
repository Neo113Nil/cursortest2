package p170z0;

import p065i6.d;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f18439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f18441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(dVar);
        this.f18441c = fVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f18440b = obj;
        this.f18442d |= Integer.MIN_VALUE;
        return f.c(this.f18441c, null, this);
    }
}
