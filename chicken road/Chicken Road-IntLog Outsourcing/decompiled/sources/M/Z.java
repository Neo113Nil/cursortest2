package M;

import java.io.FileOutputStream;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class Z extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f1657a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f1658b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f1660d;

    /* renamed from: e, reason: collision with root package name */
    public int f1661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1660d = a0Var;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1659c = obj;
        this.f1661e |= Integer.MIN_VALUE;
        return this.f1660d.b(null, this);
    }
}
