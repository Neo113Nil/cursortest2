package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.pb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4527pb extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31770d;

    /* renamed from: e, reason: collision with root package name */
    public int f31771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Tb f31772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4527pb(Tb tb2, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f31772f = tb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31770d = obj;
        this.f31771e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31772f.emit(null, this);
    }
}
