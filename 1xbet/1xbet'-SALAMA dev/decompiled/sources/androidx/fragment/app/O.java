package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f9366b;

    public O(Q q7, int i7) {
        this.f9366b = q7;
        this.f9365a = i7;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Q q7 = this.f9366b;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = q7.f9406y;
        int i7 = this.f9365a;
        if (abstractComponentCallbacksC0701v == null || i7 >= 0 || !abstractComponentCallbacksC0701v.g().Q()) {
            return q7.R(arrayList, arrayList2, i7, 1);
        }
        return false;
    }
}
