package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class Xj implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12211k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0765ak f12212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WindowManager f12214n;

    public /* synthetic */ Xj(C0765ak c0765ak, WindowManager windowManager, FrameLayout frameLayout) {
        this.f12212l = c0765ak;
        this.f12214n = windowManager;
        this.f12213m = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.ads.Zj] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f12211k) {
            case 0:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                C0765ak c0765ak = this.f12212l;
                c0765ak.getClass();
                U2.j.d("Hide native ad policy validator overlay.");
                interfaceC0677Re.K().setVisibility(8);
                if (interfaceC0677Re.K().getWindowToken() != null) {
                    this.f12214n.removeView(interfaceC0677Re.K());
                }
                interfaceC0677Re.destroy();
                ViewTreeObserver viewTreeObserver = this.f12213m.getViewTreeObserver();
                if (c0765ak.f12701c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(c0765ak.f12701c);
                    break;
                }
                break;
            default:
                final InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) obj;
                C0765ak c0765ak2 = this.f12212l;
                c0765ak2.getClass();
                interfaceC0677Re2.I().f13619q = new C0709Wb(19, c0765ak2, map);
                if (map != null) {
                    final FrameLayout frameLayout = this.f12213m;
                    Context context = frameLayout.getContext();
                    String str = (String) map.get("validator_width");
                    A7 a7 = F7.H7;
                    Q2.r rVar = Q2.r.f5053d;
                    int b3 = C0765ak.b(((Integer) rVar.f5056c.a(a7)).intValue(), context, str);
                    String str2 = (String) map.get("validator_height");
                    A7 a72 = F7.I7;
                    D7 d7 = rVar.f5056c;
                    int b5 = C0765ak.b(((Integer) d7.a(a72)).intValue(), context, str2);
                    int b6 = C0765ak.b(0, context, (String) map.get("validator_x"));
                    int b7 = C0765ak.b(0, context, (String) map.get("validator_y"));
                    interfaceC0677Re2.K0(new C1586t(1, b3, b5));
                    try {
                        interfaceC0677Re2.m0().getSettings().setUseWideViewPort(((Boolean) d7.a(F7.J7)).booleanValue());
                        interfaceC0677Re2.m0().getSettings().setLoadWithOverviewMode(((Boolean) d7.a(F7.K7)).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams h02 = AbstractC0444a.h0();
                    h02.x = b6;
                    h02.y = b7;
                    View K = interfaceC0677Re2.K();
                    final WindowManager windowManager = this.f12214n;
                    windowManager.updateViewLayout(K, h02);
                    final String str3 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (frameLayout.getGlobalVisibleRect(rect)) {
                        final int i = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - b7;
                        c0765ak2.f12701c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.Zj
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (frameLayout.getGlobalVisibleRect(rect2)) {
                                    InterfaceC0677Re interfaceC0677Re3 = interfaceC0677Re2;
                                    if (interfaceC0677Re3.K().getWindowToken() == null) {
                                        return;
                                    }
                                    String str4 = str3;
                                    boolean equals = "1".equals(str4);
                                    WindowManager.LayoutParams layoutParams = h02;
                                    int i5 = i;
                                    if (equals || "2".equals(str4)) {
                                        layoutParams.y = rect2.bottom - i5;
                                    } else {
                                        layoutParams.y = rect2.top - i5;
                                    }
                                    windowManager.updateViewLayout(interfaceC0677Re3.K(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = frameLayout.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(c0765ak2.f12701c);
                        }
                    }
                    String str4 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str4)) {
                        interfaceC0677Re2.loadUrl(str4);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ Xj(C0765ak c0765ak, FrameLayout frameLayout, WindowManager windowManager) {
        this.f12212l = c0765ak;
        this.f12213m = frameLayout;
        this.f12214n = windowManager;
    }
}
