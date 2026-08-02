package b0;

import java.io.FileOutputStream;
import k6.AbstractC1356c;

/* loaded from: classes.dex */
public final class X extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f10005a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f10006b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f10008d;

    /* renamed from: e, reason: collision with root package name */
    public int f10009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y4, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10008d = y4;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10007c = obj;
        this.f10009e |= Integer.MIN_VALUE;
        return this.f10008d.b(null, this);
    }
}
