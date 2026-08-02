package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import spay.sdk.SPaySdkApp;

/* loaded from: classes10.dex */
public final class Pj extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public SPaySdkApp f29721d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f29722e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f29724g;

    /* renamed from: h, reason: collision with root package name */
    public int f29725h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pj(SPaySdkApp sPaySdkApp, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f29724g = sPaySdkApp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        this.f29723f = obj;
        this.f29725h |= LinearLayoutManager.INVALID_OFFSET;
        a11 = this.f29724g.a(null, this);
        return a11;
    }
}
