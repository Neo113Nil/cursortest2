package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.x2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4747x2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32448d;

    /* renamed from: e, reason: collision with root package name */
    public int f32449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4115b3 f32450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4747x2(C4115b3 c4115b3, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32450f = c4115b3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32448d = obj;
        this.f32449e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32450f.emit(null, this);
    }
}
