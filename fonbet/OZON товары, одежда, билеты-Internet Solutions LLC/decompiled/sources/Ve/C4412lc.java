package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.lc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4412lc extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f31520d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f31522f;

    /* renamed from: g, reason: collision with root package name */
    public int f31523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4412lc(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31522f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31521e = obj;
        this.f31523g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31522f.f(null, this);
    }
}
