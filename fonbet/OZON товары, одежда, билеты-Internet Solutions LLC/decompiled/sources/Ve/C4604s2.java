package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.s2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4604s2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32000d;

    /* renamed from: e, reason: collision with root package name */
    public int f32001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W2 f32002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4604s2(W2 w22, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32002f = w22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32000d = obj;
        this.f32001e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32002f.emit(null, this);
    }
}
