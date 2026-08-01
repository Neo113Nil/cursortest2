package sg.bigo.ads.k1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.Locale;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.core.mraid.MraidVideoActivity;

/* renamed from: sg.bigo.ads.k1.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5275p implements InterfaceC5267h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f13040a;

    public C5275p(A a2) {
        this.f13040a = a2;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(C5261b c5261b) {
        A a2 = this.f13040a;
        if (a2.l.d != null) {
            return;
        }
        a2.k.a(c5261b);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b(String str) {
        Context context = this.f13040a.b;
        int i = MraidVideoActivity.c;
        Intent intent = new Intent();
        intent.setClass(context, MraidVideoActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("INTENT_VIDEO_URL", str);
        context.startActivity(intent);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void c() {
        InterfaceC5279u interfaceC5279u = this.f13040a.h;
        if (interfaceC5279u != null) {
            interfaceC5279u.d();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void d() {
        A a2 = this.f13040a;
        C5271l c5271l = a2.k;
        O o = a2.r;
        Context context = a2.b;
        o.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        boolean a3 = O.a(context, intent);
        O o2 = a2.r;
        Context context2 = a2.b;
        o2.getClass();
        Intent intent2 = new Intent("android.intent.action.DIAL");
        intent2.setData(Uri.parse("tel:"));
        boolean a4 = O.a(context2, intent2);
        boolean a5 = O.a(a2.b, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
        boolean a6 = O.a(a2.b);
        boolean c = a2.c();
        c5271l.getClass();
        c5271l.a("mraidbridge.setSupports(" + a3 + "," + a4 + "," + a5 + "," + a6 + "," + c + ")");
        C5271l c5271l2 = a2.k;
        int i = a2.x;
        c5271l2.getClass();
        c5271l2.a("mraidbridge.setPlacementType(" + JSONObject.quote(Z.a(i).toLowerCase(Locale.US)) + ")");
        C5271l c5271l3 = a2.k;
        C5270k c5270k = c5271l3.d;
        c5271l3.a("mraidbridge.setIsViewable(" + (c5270k != null && c5270k.j) + ")");
        a2.k.a(a2.g);
        a2.e();
        a2.b(2);
        a2.k.a("mraidbridge.notifyReadyEvent();");
        InterfaceC5279u interfaceC5279u = this.f13040a.h;
        if (interfaceC5279u != null) {
            interfaceC5279u.c();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b() {
        InterfaceC5279u interfaceC5279u;
        A a2 = this.f13040a;
        if (a2.x != 2 || (interfaceC5279u = a2.h) == null) {
            return;
        }
        interfaceC5279u.b();
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a() {
        this.f13040a.b();
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final boolean a(ConsoleMessage consoleMessage) {
        this.f13040a.getClass();
        return true;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b(boolean z) {
        this.f13040a.a(z);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str, boolean z) {
        this.f13040a.a(str, z);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final boolean a(String str, JsResult jsResult) {
        this.f13040a.getClass();
        jsResult.confirm();
        return true;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str, sg.bigo.ads.U.j jVar) {
        this.f13040a.a(str, jVar);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(WebView webView, int i) {
        InterfaceC5279u interfaceC5279u = this.f13040a.h;
        if (interfaceC5279u != null) {
            interfaceC5279u.a(webView, i);
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str) {
        InterfaceC5279u interfaceC5279u = this.f13040a.h;
        if (interfaceC5279u != null) {
            interfaceC5279u.e();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(int i, int i2, int i3, int i4, sg.bigo.ads.l1.a aVar, boolean z) {
        A a2 = this.f13040a;
        if (a2.i == null) {
            throw new C5272m("Unable to resize after the WebView is destroyed");
        }
        int i5 = a2.y;
        if (i5 == 1 || i5 == 5) {
            return;
        }
        if (i5 == 4) {
            throw new C5272m("Not allowed to resize from an already expanded ad");
        }
        if (a2.x == 2) {
            throw new C5272m("Not allowed to resize from an interstitial ad");
        }
        C5280v c5280v = a2.m;
        int measuredWidth = c5280v.c.i.getMeasuredWidth();
        int measuredHeight = c5280v.c.i.getMeasuredHeight();
        c5280v.f13045a = measuredWidth;
        c5280v.b = measuredHeight;
        Context context = a2.b;
        int a3 = AbstractC4963u.a(context, i);
        int a4 = AbstractC4963u.a(context, i2);
        int a5 = AbstractC4963u.a(context, i3);
        int a6 = AbstractC4963u.a(context, i4);
        Rect rect = a2.g.h;
        int i6 = rect.left + a5;
        int i7 = rect.top + a6;
        Rect rect2 = new Rect(i6, i7, a3 + i6, i7 + a4);
        if (!z) {
            Rect rect3 = a2.g.d;
            if (rect2.width() <= rect3.width() && rect2.height() <= rect3.height()) {
                rect2.offsetTo(Math.max(rect3.left, Math.min(rect2.left, rect3.right - rect2.width())), Math.max(rect3.top, Math.min(rect2.top, rect3.bottom - rect2.height())));
            } else {
                throw new C5272m("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the ad to appear within the max allowed size (" + a2.g.e.width() + ", " + a2.g.e.height() + ")");
            }
        }
        Rect rect4 = new Rect();
        int i8 = a2.d.e;
        Gravity.apply(aVar.f13059a, i8, i8, rect2, rect4);
        if (!a2.g.d.contains(rect4)) {
            throw new C5272m("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the close region to appear within the max allowed size (" + a2.g.e.width() + ", " + a2.g.e.height() + ")");
        }
        if (!rect2.contains(rect4)) {
            throw new C5272m("resizeProperties specified a size (" + i + ", " + a4 + ") and offset (" + i3 + ", " + i4 + ") that don't allow the close region to appear within the resized ad.");
        }
        a2.d.setCloseVisible(false);
        a2.d.setClosePosition(aVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
        int i9 = rect2.left;
        Rect rect5 = a2.g.d;
        layoutParams.leftMargin = i9 - rect5.left;
        layoutParams.topMargin = rect2.top - rect5.top;
        int i10 = a2.y;
        if (i10 == 2) {
            a2.c.removeView(a2.i);
            a2.c.setVisibility(4);
            a2.d.addView(a2.i, new FrameLayout.LayoutParams(-1, -1));
            ViewGroup viewGroup = a2.e;
            if (viewGroup == null) {
                if (viewGroup == null) {
                    View a7 = sg.bigo.ads.K0.X.a((Context) a2.f13013a.get(), a2.c);
                    viewGroup = a7 instanceof ViewGroup ? (ViewGroup) a7 : a2.c;
                }
                a2.e = viewGroup;
            }
            a2.e.addView(a2.d, layoutParams);
        } else if (i10 == 3) {
            a2.d.setLayoutParams(layoutParams);
        }
        a2.d.setClosePosition(aVar);
        a2.b(3);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(int i, boolean z) {
        A a2 = this.f13040a;
        if (!a2.c(i)) {
            throw new C5272m("Unable to force orientation to ".concat(P.c(i)));
        }
        a2.q = z;
        a2.z = i;
        if (a2.y == 4 || (a2.x == 2 && !a2.s)) {
            if (i != 3) {
                a2.a(P.a(i));
                return;
            }
            if (z) {
                a2.f();
                return;
            }
            Activity activity = (Activity) a2.f13013a.get();
            if (activity == null) {
                throw new C5272m("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            a2.a(sg.bigo.ads.I0.f.a(activity));
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(boolean z) {
        A a2 = this.f13040a;
        if (a2.l.d != null) {
            return;
        }
        C5271l c5271l = a2.k;
        c5271l.getClass();
        c5271l.a("mraidbridge.setIsViewable(" + z + ")");
    }
}
