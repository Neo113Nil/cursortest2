package A;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f13c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f14d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15e;

    public /* synthetic */ f(String str, Context context, e eVar, int i3, int i4) {
        this.f11a = i4;
        this.f12b = str;
        this.f13c = context;
        this.f14d = eVar;
        this.f15e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11a) {
            case 0:
                return i.a(this.f12b, this.f13c, this.f14d, this.f15e);
            default:
                try {
                    return i.a(this.f12b, this.f13c, this.f14d, this.f15e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
