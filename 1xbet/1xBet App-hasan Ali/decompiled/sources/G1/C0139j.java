package G1;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.W;
import i4.InterfaceC2015a;

/* renamed from: G1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139j extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0140k f1897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139j(C0140k c0140k, int i) {
        super(0);
        this.f1896l = i;
        this.f1897m = c0140k;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f1896l) {
            case 0:
                C0140k c0140k = this.f1897m;
                Context context = c0140k.f1898k;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new androidx.lifecycle.O(applicationContext instanceof Application ? (Application) applicationContext : null, c0140k, c0140k.c());
            default:
                C0140k c0140k2 = this.f1897m;
                if (!c0140k2.f1907t) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0493w c0493w = c0140k2.f1905r;
                if (c0493w.f7068g == EnumC0487p.f7058k) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0137h c0137h = new C0137h();
                c0137h.f1893a = (v3.g) c0140k2.f1906s.f1750m;
                c0137h.f1894b = c0493w;
                return ((C0138i) new W(c0140k2.f(), c0137h, c0140k2.e()).a(kotlin.jvm.internal.x.a(C0138i.class))).f1895a;
        }
    }
}
