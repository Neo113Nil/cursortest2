package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.vh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4706vh extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Vh f32282e;

    /* renamed from: f, reason: collision with root package name */
    public int f32283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4706vh(Vh vh2, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32282e = vh2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32281d = obj;
        this.f32283f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32282e.e0(this);
    }
}
