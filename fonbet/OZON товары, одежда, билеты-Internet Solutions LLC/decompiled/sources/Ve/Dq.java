package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class Dq extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f28884d;

    /* renamed from: e, reason: collision with root package name */
    public C4427lr f28885e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f28887g;

    /* renamed from: h, reason: collision with root package name */
    public int f28888h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dq(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28887g = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28886f = obj;
        this.f28888h |= LinearLayoutManager.INVALID_OFFSET;
        return RedirectActivity.b(this.f28887g, this);
    }
}
