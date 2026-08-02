package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.z2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4803z2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32618d;

    /* renamed from: e, reason: collision with root package name */
    public int f32619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4173d3 f32620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4803z2(C4173d3 c4173d3, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32620f = c4173d3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32618d = obj;
        this.f32619e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32620f.emit(null, this);
    }
}
