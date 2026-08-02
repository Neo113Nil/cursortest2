package b0;

import java.io.FileInputStream;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class P extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9975a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f9976b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f9978d;

    /* renamed from: e, reason: collision with root package name */
    public int f9979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q7, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f9978d = q7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9977c = obj;
        this.f9979e |= Integer.MIN_VALUE;
        return Q.a(this.f9978d, this);
    }
}
