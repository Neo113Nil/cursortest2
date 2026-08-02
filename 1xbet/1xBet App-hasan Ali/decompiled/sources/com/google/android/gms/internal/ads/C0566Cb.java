package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import k4.AbstractC2036a;
import org.json.JSONException;
import org.json.JSONObject;
import r3.C2350b;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566Cb extends C0709Wb implements InterfaceC1821y9 {

    /* renamed from: A, reason: collision with root package name */
    public int f7996A;

    /* renamed from: o, reason: collision with root package name */
    public final C0733Ze f7997o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f7998p;

    /* renamed from: q, reason: collision with root package name */
    public final WindowManager f7999q;

    /* renamed from: r, reason: collision with root package name */
    public final C1864z7 f8000r;

    /* renamed from: s, reason: collision with root package name */
    public DisplayMetrics f8001s;

    /* renamed from: t, reason: collision with root package name */
    public float f8002t;

    /* renamed from: u, reason: collision with root package name */
    public int f8003u;

    /* renamed from: v, reason: collision with root package name */
    public int f8004v;

    /* renamed from: w, reason: collision with root package name */
    public int f8005w;

    /* renamed from: x, reason: collision with root package name */
    public int f8006x;

    /* renamed from: y, reason: collision with root package name */
    public int f8007y;

    /* renamed from: z, reason: collision with root package name */
    public int f8008z;

    public C0566Cb(C0733Ze c0733Ze, Context context, C1864z7 c1864z7) {
        super(9, c0733Ze, "");
        this.f8003u = -1;
        this.f8004v = -1;
        this.f8006x = -1;
        this.f8007y = -1;
        this.f8008z = -1;
        this.f7996A = -1;
        this.f7997o = c0733Ze;
        this.f7998p = context;
        this.f8000r = c1864z7;
        this.f7999q = (WindowManager) context.getSystemService("window");
    }

    public final void A(int i, int i5) {
        int i6;
        Context context = this.f7998p;
        int i7 = 0;
        if (context instanceof Activity) {
            T2.L l5 = P2.o.f4767B.f4771c;
            i6 = T2.L.n((Activity) context)[0];
        } else {
            i6 = 0;
        }
        C0733Ze c0733Ze = this.f7997o;
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.M() == null || !viewTreeObserverOnGlobalLayoutListenerC0805bf.M().b()) {
            int width = c0733Ze.getWidth();
            int height = c0733Ze.getHeight();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8766U)).booleanValue()) {
                if (width == 0) {
                    width = viewTreeObserverOnGlobalLayoutListenerC0805bf.M() != null ? viewTreeObserverOnGlobalLayoutListenerC0805bf.M().f15623c : 0;
                }
                if (height == 0) {
                    if (viewTreeObserverOnGlobalLayoutListenerC0805bf.M() != null) {
                        i7 = viewTreeObserverOnGlobalLayoutListenerC0805bf.M().f15622b;
                    }
                    C0379q c0379q = C0379q.f;
                    this.f8008z = c0379q.f5048a.d(context, width);
                    this.f7996A = c0379q.f5048a.d(context, i7);
                }
            }
            i7 = height;
            C0379q c0379q2 = C0379q.f;
            this.f8008z = c0379q2.f5048a.d(context, width);
            this.f7996A = c0379q2.f5048a.d(context, i7);
        }
        try {
            ((InterfaceC0677Re) this.f12040l).k("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i5 - i6).put("width", this.f8008z).put("height", this.f7996A));
        } catch (JSONException e3) {
            U2.j.g("Error occurred while dispatching default position.", e3);
        }
        C1876zb c1876zb = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12894x.f13605H;
        if (c1876zb != null) {
            c1876zb.f16598q = i;
            c1876zb.f16599r = i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        JSONObject jSONObject;
        this.f8001s = new DisplayMetrics();
        Display defaultDisplay = this.f7999q.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f8001s);
        this.f8002t = this.f8001s.density;
        this.f8005w = defaultDisplay.getRotation();
        U2.e eVar = C0379q.f.f5048a;
        this.f8003u = Math.round(r11.widthPixels / this.f8001s.density);
        this.f8004v = Math.round(r11.heightPixels / this.f8001s.density);
        C0733Ze c0733Ze = this.f7997o;
        Activity e3 = c0733Ze.e();
        if (e3 == null || e3.getWindow() == null) {
            this.f8006x = this.f8003u;
            this.f8007y = this.f8004v;
        } else {
            T2.L l5 = P2.o.f4767B.f4771c;
            int[] m5 = T2.L.m(e3);
            this.f8006x = Math.round(m5[0] / this.f8001s.density);
            this.f8007y = Math.round(m5[1] / this.f8001s.density);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.M().b()) {
            this.f8008z = this.f8003u;
            this.f7996A = this.f8004v;
        } else {
            c0733Ze.measure(0, 0);
        }
        v(this.f8003u, this.f8004v, this.f8006x, this.f8007y, this.f8002t, this.f8005w);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C1864z7 c1864z7 = this.f8000r;
        boolean b3 = c1864z7.b(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean b5 = c1864z7.b(intent2);
        boolean b6 = c1864z7.b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        CallableC1819y7 callableC1819y7 = new CallableC1819y7(0);
        Context context = c1864z7.f16547k;
        try {
            jSONObject = new JSONObject().put("sms", b5).put("tel", b3).put("calendar", b6).put("storePicture", ((Boolean) AbstractC2036a.l0(context, callableC1819y7)).booleanValue() && C2350b.a(context).f17113k.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e5) {
            U2.j.g("Error occurred while obtaining the MRAID capabilities.", e5);
            jSONObject = null;
        }
        c0733Ze.k("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        c0733Ze.getLocationOnScreen(iArr);
        C0379q c0379q = C0379q.f;
        U2.e eVar2 = c0379q.f5048a;
        int i = iArr[0];
        Context context2 = this.f7998p;
        A(eVar2.d(context2, i), c0379q.f5048a.d(context2, iArr[1]));
        if (U2.j.l(2)) {
            U2.j.h("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC0677Re) this.f12040l).k("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC0805bf.f12885o.f5852k));
        } catch (JSONException e6) {
            U2.j.g("Error occurred while dispatching ready Event.", e6);
        }
    }
}
