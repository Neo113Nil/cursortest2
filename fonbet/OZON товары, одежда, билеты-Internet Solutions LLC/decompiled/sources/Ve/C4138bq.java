package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.bq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4138bq extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30750d;

    /* renamed from: e, reason: collision with root package name */
    public int f30751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Aq f30752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4138bq(Aq aq, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30752f = aq;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30750d = obj;
        this.f30751e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30752f.emit(null, this);
    }
}
