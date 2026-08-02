package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.mj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4448mj extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f31594d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f31596f;

    /* renamed from: g, reason: collision with root package name */
    public int f31597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4448mj(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31596f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31595e = obj;
        this.f31597g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31596f.m(null, this);
    }
}
