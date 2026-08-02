package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.b4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4116b4 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4463n5 f30706d;

    /* renamed from: e, reason: collision with root package name */
    public RedirectActivity f30707e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4463n5 f30709g;

    /* renamed from: h, reason: collision with root package name */
    public int f30710h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4116b4(C4463n5 c4463n5, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30709g = c4463n5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30708f = obj;
        this.f30710h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30709g.a(null, this);
    }
}
