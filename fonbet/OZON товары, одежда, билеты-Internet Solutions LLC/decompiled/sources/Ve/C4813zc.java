package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Ve.zc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4813zc extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4154cd f32642d;

    /* renamed from: e, reason: collision with root package name */
    public Map f32643e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f32644f;

    /* renamed from: g, reason: collision with root package name */
    public String f32645g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f32646h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4154cd f32647i;

    /* renamed from: j, reason: collision with root package name */
    public int f32648j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4813zc(C4154cd c4154cd, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32647i = c4154cd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32646h = obj;
        this.f32648j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32647i.t(null, this);
    }
}
