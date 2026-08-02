package t2;

import android.graphics.Bitmap;
import c4.AbstractC0542c;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2418f extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2421i f19549k;

    /* renamed from: l, reason: collision with root package name */
    public E2.a f19550l;

    /* renamed from: m, reason: collision with root package name */
    public E2.i f19551m;

    /* renamed from: n, reason: collision with root package name */
    public C2415c f19552n;

    /* renamed from: o, reason: collision with root package name */
    public Bitmap f19553o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f19554p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2421i f19555q;

    /* renamed from: r, reason: collision with root package name */
    public int f19556r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2418f(C2421i c2421i, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19555q = c2421i;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19554p = obj;
        this.f19556r |= Integer.MIN_VALUE;
        return C2421i.a(this.f19555q, null, 0, this);
    }
}
