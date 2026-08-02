package Ve;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.qe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4559qe extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Te f31858d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31859e;

    /* renamed from: f, reason: collision with root package name */
    public C4515p f31860f;

    /* renamed from: g, reason: collision with root package name */
    public Context f31861g;

    /* renamed from: h, reason: collision with root package name */
    public String f31862h;

    /* renamed from: i, reason: collision with root package name */
    public String f31863i;

    /* renamed from: j, reason: collision with root package name */
    public Vm f31864j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f31865k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Te f31866l;

    /* renamed from: m, reason: collision with root package name */
    public int f31867m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4559qe(Te te2, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31866l = te2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31865k = obj;
        this.f31867m |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31866l.a(null, null, this);
    }
}
