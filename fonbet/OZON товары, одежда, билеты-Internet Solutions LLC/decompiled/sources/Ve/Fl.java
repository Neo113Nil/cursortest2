package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class Fl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public RedirectActivity f29014d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f29015e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC4228f1 f29016f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ql0.i f29018h;

    /* renamed from: i, reason: collision with root package name */
    public int f29019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fl(Ql0.i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29018h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29017g = obj;
        this.f29019i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29018h.a(null, null, this);
    }
}
