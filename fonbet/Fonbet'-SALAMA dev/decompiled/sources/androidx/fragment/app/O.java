package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    public final int f9365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f9366b;

    public O(Q q7, int i7) {
        this.f9366b = q7;
        this.f9365a = i7;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Q q7 = this.f9366b;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = q7.f9406y;
        int i7 = this.f9365a;
        if (abstractComponentCallbacksC0722v == null || i7 >= 0 || !abstractComponentCallbacksC0722v.g().Q()) {
            return q7.R(arrayList, arrayList2, i7, 1);
        }
        return false;
    }
}
