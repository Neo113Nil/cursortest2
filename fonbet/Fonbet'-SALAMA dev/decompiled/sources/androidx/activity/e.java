package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements G0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8095b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f8094a = i7;
        this.f8095b = obj;
    }

    @Override // G0.e
    public final Bundle a() {
        switch (this.f8094a) {
            case 0:
                return o.b((androidx.fragment.app.A) this.f8095b);
            default:
                return J.a((J) this.f8095b);
        }
    }
}
