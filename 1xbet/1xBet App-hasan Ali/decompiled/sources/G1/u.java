package G1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f1939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Bundle bundle) {
        super(1);
        this.f1938l = i;
        this.f1939m = bundle;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1938l) {
            case 0:
                kotlin.jvm.internal.l.f("argName", (String) obj);
                return Boolean.valueOf(!this.f1939m.containsKey(r2));
            default:
                kotlin.jvm.internal.l.f("key", (String) obj);
                return Boolean.valueOf(!this.f1939m.containsKey(r2));
        }
    }
}
