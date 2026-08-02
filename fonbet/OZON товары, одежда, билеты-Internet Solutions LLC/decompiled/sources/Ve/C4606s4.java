package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

/* renamed from: Ve.s4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4606s4 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Y4 f32005d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f32006e;

    /* renamed from: f, reason: collision with root package name */
    public int f32007f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y4 f32009h;

    /* renamed from: i, reason: collision with root package name */
    public int f32010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4606s4(Y4 y42, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32009h = y42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32008g = obj;
        this.f32010i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32009h.a(null, null, this);
    }
}
