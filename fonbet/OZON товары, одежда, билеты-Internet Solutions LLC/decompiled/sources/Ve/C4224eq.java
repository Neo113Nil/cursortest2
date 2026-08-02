package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.eq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4224eq extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public RedirectActivity f30953d;

    /* renamed from: e, reason: collision with root package name */
    public C4427lr f30954e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f30956g;

    /* renamed from: h, reason: collision with root package name */
    public int f30957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4224eq(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30956g = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30955f = obj;
        this.f30957h |= LinearLayoutManager.INVALID_OFFSET;
        return RedirectActivity.a(this.f30956g, this);
    }
}
