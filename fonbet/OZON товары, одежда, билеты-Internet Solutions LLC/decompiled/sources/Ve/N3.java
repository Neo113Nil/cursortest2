package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class N3 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Y4 f29518d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.M f29519e;

    /* renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.M f29520f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.M f29521g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f29522h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y4 f29523i;

    /* renamed from: j, reason: collision with root package name */
    public int f29524j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(Y4 y42, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29523i = y42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29522h = obj;
        this.f29524j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29523i.b(false, this);
    }
}
