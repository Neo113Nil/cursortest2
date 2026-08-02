package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class Yo extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Function1 f30513d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f30515f;

    /* renamed from: g, reason: collision with root package name */
    public int f30516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yo(spay.sdk.d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30515f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30514e = obj;
        this.f30516g |= LinearLayoutManager.INVALID_OFFSET;
        return spay.sdk.d.a(this.f30515f, null, this);
    }
}
