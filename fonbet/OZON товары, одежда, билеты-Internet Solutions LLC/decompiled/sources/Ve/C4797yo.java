package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.yo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4797yo extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f32609d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f32611f;

    /* renamed from: g, reason: collision with root package name */
    public int f32612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4797yo(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32611f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32610e = obj;
        this.f32612g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32611f.a((String) null, this);
    }
}
