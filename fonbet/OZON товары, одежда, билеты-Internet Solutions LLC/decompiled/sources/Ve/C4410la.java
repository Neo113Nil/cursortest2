package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.la, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4410la extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Na f31518e;

    /* renamed from: f, reason: collision with root package name */
    public int f31519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4410la(Na na2, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31518e = na2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31517d = obj;
        this.f31519f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31518e.e0(this);
    }
}
