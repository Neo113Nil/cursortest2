package p010b0;

import java.io.FileInputStream;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class P extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f9976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f9978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q7, c cVar) {
        super(cVar);
        this.f9978d = q7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f9977c = obj;
        this.f9979e |= Integer.MIN_VALUE;
        return Q.a(this.f9978d, this);
    }
}
