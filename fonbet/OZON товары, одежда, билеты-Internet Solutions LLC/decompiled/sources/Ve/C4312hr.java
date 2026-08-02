package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.hr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4312hr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public RedirectActivity f31217d;

    /* renamed from: e, reason: collision with root package name */
    public C4427lr f31218e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f31219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f31220g;

    /* renamed from: h, reason: collision with root package name */
    public int f31221h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4312hr(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31220g = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31219f = obj;
        this.f31221h |= LinearLayoutManager.INVALID_OFFSET;
        return RedirectActivity.c(this.f31220g, this);
    }
}
