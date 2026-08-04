package p010b0;

import java.io.FileOutputStream;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class X extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f10005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileOutputStream f10006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f10008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y4, c cVar) {
        super(cVar);
        this.f10008d = y4;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10007c = obj;
        this.f10009e |= Integer.MIN_VALUE;
        return this.f10008d.b(null, this);
    }
}
