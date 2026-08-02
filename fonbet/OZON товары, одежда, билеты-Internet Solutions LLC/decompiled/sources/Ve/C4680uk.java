package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.uk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4680uk extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32225d;

    /* renamed from: e, reason: collision with root package name */
    public int f32226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4094ab f32227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4680uk(C4094ab c4094ab, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32227f = c4094ab;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32225d = obj;
        this.f32226e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32227f.emit(null, this);
    }
}
