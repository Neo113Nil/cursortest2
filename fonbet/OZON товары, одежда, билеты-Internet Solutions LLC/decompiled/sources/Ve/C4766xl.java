package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.OutputStream;

/* renamed from: Ve.xl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4766xl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f32491d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Zm f32493f;

    /* renamed from: g, reason: collision with root package name */
    public int f32494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4766xl(Zm zm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32493f = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32492e = obj;
        this.f32494g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32493f.b(null, this);
    }
}
