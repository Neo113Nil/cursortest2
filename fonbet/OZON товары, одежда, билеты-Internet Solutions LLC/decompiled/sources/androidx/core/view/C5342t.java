package androidx.core.view;

import S0.InterfaceC3978p0;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.core.view.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C5342t implements androidx.lifecycle.G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42347c;

    public /* synthetic */ C5342t(int i11, Object obj, Object obj2) {
        this.f42345a = i11;
        this.f42346b = obj;
        this.f42347c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.G
    public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Object obj = this.f42347c;
        Object obj2 = this.f42346b;
        switch (this.f42345a) {
            case 0:
                C5344u c5344u = (C5344u) obj2;
                if (event != AbstractC5434v.a.ON_DESTROY) {
                    c5344u.getClass();
                    break;
                } else {
                    c5344u.i((InterfaceC5348w) obj);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == AbstractC5434v.a.ON_PAUSE) {
                    int i11 = ru.ozon.android.messenger.framework.presentation.ai.U.f89357b;
                    ru.ozon.android.messenger.framework.presentation.ai.U.f((v0.I) ((InterfaceC3978p0) obj2).getValue(), (ru.ozon.android.messenger.framework.core.d) ((InterfaceC3978p0) obj).getValue());
                    break;
                }
                break;
        }
    }
}
