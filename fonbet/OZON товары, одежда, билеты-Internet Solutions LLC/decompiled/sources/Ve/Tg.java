package Ve;

import We.G;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Tg extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public G.a f30048d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4819zi f30050f;

    /* renamed from: g, reason: collision with root package name */
    public int f30051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tg(C4819zi c4819zi, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30050f = c4819zi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30049e = obj;
        this.f30051g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30050f.a(null, false, this);
    }
}
