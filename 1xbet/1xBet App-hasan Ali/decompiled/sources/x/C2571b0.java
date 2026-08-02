package x;

import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.Sm;

/* renamed from: x.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571b0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public long f20739k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20740l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Sm f20741m;

    /* renamed from: n, reason: collision with root package name */
    public int f20742n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2571b0(Sm sm, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20741m = sm;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20740l = obj;
        this.f20742n |= Integer.MIN_VALUE;
        return this.f20741m.G(0L, 0L, this);
    }
}
