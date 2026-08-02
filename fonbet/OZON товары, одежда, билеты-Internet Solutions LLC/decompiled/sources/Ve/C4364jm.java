package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.jm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4364jm extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Hn f31381d;

    /* renamed from: e, reason: collision with root package name */
    public C4395ko f31382e;

    /* renamed from: f, reason: collision with root package name */
    public xe.I f31383f;

    /* renamed from: g, reason: collision with root package name */
    public Hn f31384g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f31385h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Hn f31386i;

    /* renamed from: j, reason: collision with root package name */
    public int f31387j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4364jm(Hn hn, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f31386i = hn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31385h = obj;
        this.f31387j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31386i.f(null, null, this);
    }
}
