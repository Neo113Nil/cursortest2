package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ho, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4309ho extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31209d;

    /* renamed from: e, reason: collision with root package name */
    public int f31210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Jo f31211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4309ho(Jo jo, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f31211f = jo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31209d = obj;
        this.f31210e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31211f.emit(null, this);
    }
}
