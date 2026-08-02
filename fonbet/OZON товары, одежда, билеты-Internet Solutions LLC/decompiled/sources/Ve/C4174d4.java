package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.d4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4174d4 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30848d;

    /* renamed from: e, reason: collision with root package name */
    public int f30849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I4 f30850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4174d4(I4 i42, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30850f = i42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30848d = obj;
        this.f30849e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30850f.emit(null, this);
    }
}
