package androidx.work.impl;

import androidx.work.impl.utils.PreferenceUtils;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.E0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(((PreferenceUtils) this.b).getLastCancelAllTimeMillis());
            default:
                D0 d0 = (D0) this.b;
                return Integer.valueOf(E0.a(d0, (kotlinx.serialization.descriptors.f[]) d0.j.getValue()));
        }
    }
}
