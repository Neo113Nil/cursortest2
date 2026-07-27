package M;

import java.io.FileInputStream;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class Q extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1625a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f1626b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f1628d;

    /* renamed from: e, reason: collision with root package name */
    public int f1629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s2, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1628d = s2;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1627c = obj;
        this.f1629e |= Integer.MIN_VALUE;
        return S.a(this.f1628d, this);
    }
}
