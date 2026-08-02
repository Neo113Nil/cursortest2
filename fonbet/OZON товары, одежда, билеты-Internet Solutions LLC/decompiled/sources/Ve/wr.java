package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class wr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4197e f32394e;

    /* renamed from: f, reason: collision with root package name */
    public int f32395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(C4197e c4197e, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32394e = c4197e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32393d = obj;
        this.f32395f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32394e.a(this);
    }
}
