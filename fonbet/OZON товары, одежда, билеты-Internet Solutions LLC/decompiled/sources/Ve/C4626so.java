package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.so, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4626so extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32065d;

    /* renamed from: e, reason: collision with root package name */
    public int f32066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ So f32067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4626so(So so, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32067f = so;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32065d = obj;
        this.f32066e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32067f.emit(null, this);
    }
}
