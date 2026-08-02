package A0;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(N n5, int i) {
        super(1);
        this.f327l = i;
        this.f328m = n5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f327l) {
            case 0:
                N n5 = this.f328m;
                return Boolean.valueOf(n5.f346d.getParent().requestSendAccessibilityEvent(n5.f346d, (AccessibilityEvent) obj));
            default:
                C0038j1 c0038j1 = (C0038j1) obj;
                N n6 = this.f328m;
                n6.getClass();
                if (c0038j1.f519l.contains(c0038j1)) {
                    n6.f346d.getSnapshotObserver().a(c0038j1, n6.f345P, new C0060u(1, c0038j1, n6));
                }
                return W3.o.f6046a;
        }
    }
}
