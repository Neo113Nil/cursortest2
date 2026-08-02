package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Xa extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30344d;

    /* renamed from: e, reason: collision with root package name */
    public int f30345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bb f30346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xa(Bb bb2, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30346f = bb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30344d = obj;
        this.f30345e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30346f.emit(null, this);
    }
}
