package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class Uk extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public InputStream f30131d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Zm f30133f;

    /* renamed from: g, reason: collision with root package name */
    public int f30134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uk(Zm zm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30133f = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30132e = obj;
        this.f30134g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30133f.a(null, this);
    }
}
