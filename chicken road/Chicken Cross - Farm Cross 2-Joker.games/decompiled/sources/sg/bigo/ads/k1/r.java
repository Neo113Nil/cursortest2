package sg.bigo.ads.k1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f13042a;

    public r(A a2) {
        this.f13042a = a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a2 = this.f13042a;
        C5271l c5271l = a2.l;
        O o = a2.r;
        Context context = a2.b;
        o.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        boolean a3 = O.a(context, intent);
        A a4 = this.f13042a;
        O o2 = a4.r;
        Context context2 = a4.b;
        o2.getClass();
        Intent intent2 = new Intent("android.intent.action.DIAL");
        intent2.setData(Uri.parse("tel:"));
        boolean a5 = O.a(context2, intent2);
        A a6 = this.f13042a;
        O o3 = a6.r;
        boolean a7 = O.a(a6.b, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
        A a8 = this.f13042a;
        O o4 = a8.r;
        boolean a9 = O.a(a8.b);
        boolean c = this.f13042a.c();
        c5271l.getClass();
        c5271l.a("mraidbridge.setSupports(" + a3 + "," + a5 + "," + a7 + "," + a9 + "," + c + ")");
        A a10 = this.f13042a;
        C5271l c5271l2 = a10.l;
        int i = a10.y;
        c5271l2.getClass();
        StringBuilder sb = new StringBuilder("mraidbridge.setState(");
        String a11 = a0.a(i);
        Locale locale = Locale.US;
        c5271l2.a(sb.append(JSONObject.quote(a11.toLowerCase(locale))).append(")").toString());
        A a12 = this.f13042a;
        C5271l c5271l3 = a12.l;
        int i2 = a12.x;
        c5271l3.getClass();
        c5271l3.a("mraidbridge.setPlacementType(" + JSONObject.quote(Z.a(i2).toLowerCase(locale)) + ")");
        C5271l c5271l4 = this.f13042a.l;
        C5270k c5270k = c5271l4.d;
        c5271l4.a("mraidbridge.setIsViewable(" + (c5270k != null && c5270k.j) + ")");
        this.f13042a.l.a("mraidbridge.notifyReadyEvent();");
    }
}
