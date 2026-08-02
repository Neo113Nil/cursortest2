package R5;

import f6.C1112e;
import f6.C1113f;

/* loaded from: classes2.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6097a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6098b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f6099c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6100d;

    public S(Object obj) {
        this.f6097a = obj;
        boolean z4 = obj instanceof C1112e;
        this.f6098b = z4 ? null : obj;
        this.f6099c = C1113f.a(obj);
        this.f6100d = z4;
    }
}
