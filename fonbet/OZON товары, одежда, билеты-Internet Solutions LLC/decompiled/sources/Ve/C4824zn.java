package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.zn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4824zn extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32675d;

    /* renamed from: e, reason: collision with root package name */
    public int f32676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4230f3 f32677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4824zn(C4230f3 c4230f3, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32677f = c4230f3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32675d = obj;
        this.f32676e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32677f.emit(null, this);
    }
}
