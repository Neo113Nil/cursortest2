package io.flutter.plugin.editing;

import A2.n;
import I1.AbstractActivityC0027d;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.z;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C;
import d2.C0279i;
import e.C0280a;
import e.InterfaceC0281b;
import e2.AbstractC0292g;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.InterfaceC1074o;
import k.MenuC1069j;
import k.SubMenuC1079t;
import l.C1090i;
import l.InterfaceC1093l;
import m0.C1130s;
import o.AbstractC1144b;
import o.AbstractC1145c;
import o.AbstractC1146d;
import o.C1147e;
import o2.p;
import org.json.JSONObject;
import p0.AbstractC1164b;
import s0.C1193a;
import t.AbstractC1206a;
import t0.C1207a;
import t0.C1208b;
import u0.ServiceConnectionC1210a;

/* loaded from: classes.dex */
public final class k implements c, InterfaceC1074o, InterfaceC1093l, InterfaceC0281b, z2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f9216a;

    public /* synthetic */ k(Object obj) {
        this.f9216a = obj;
    }

    public static C1207a g(Map map) {
        Integer valueOf;
        A0.j h3;
        A0.j h4;
        A0.j h5;
        String str;
        Integer valueOf2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Set set;
        Map map2;
        Double d3;
        Integer valueOf3;
        Boolean bool3;
        Double d4;
        Double d5;
        Boolean bool4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (map == null) {
            return null;
        }
        Map map3 = (Map) map.get("colorSchemes");
        if (map3 == null) {
            h5 = null;
            valueOf = null;
            h3 = null;
            h4 = null;
        } else {
            Long l3 = (Long) map3.get("colorScheme");
            valueOf = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
            h3 = F2.b.h((Map) map3.get("lightParams"));
            h4 = F2.b.h((Map) map3.get("darkParams"));
            h5 = F2.b.h((Map) map3.get("defaultParams"));
        }
        D0.a aVar = new D0.a(valueOf, h3, h4, h5);
        Boolean bool5 = (Boolean) map.get("urlBarHidingEnabled");
        Long l4 = (Long) map.get("shareState");
        Integer valueOf4 = l4 != null ? Integer.valueOf((int) l4.longValue()) : null;
        Boolean bool6 = (Boolean) map.get("showTitle");
        Boolean bool7 = (Boolean) map.get("instantAppsEnabled");
        Boolean bool8 = (Boolean) map.get("bookmarksButtonEnabled");
        Boolean bool9 = (Boolean) map.get("downloadButtonEnabled");
        Boolean bool10 = (Boolean) map.get("shareIdentityEnabled");
        Map map4 = (Map) map.get("closeButton");
        if (map4 == null) {
            valueOf2 = null;
            str = null;
        } else {
            str = (String) map4.get("icon");
            Long l5 = (Long) map4.get("position");
            valueOf2 = l5 != null ? Integer.valueOf((int) l5.longValue()) : null;
        }
        V1.b bVar = new V1.b(str, 15, valueOf2);
        Map map5 = (Map) map.get("animations");
        if (map5 == null) {
            str5 = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            str2 = (String) map5.get("startEnter");
            str3 = (String) map5.get("startExit");
            str4 = (String) map5.get("endEnter");
            str5 = (String) map5.get("endExit");
        }
        D0.a aVar2 = new D0.a();
        aVar2.f264d = str2;
        aVar2.f261a = str3;
        aVar2.f262b = str4;
        aVar2.f263c = str5;
        Map map6 = (Map) map.get("browser");
        if (map6 == null) {
            bool = null;
            bool2 = null;
            set = null;
            map2 = null;
            str6 = null;
        } else {
            Boolean bool11 = (Boolean) map6.get("prefersExternalBrowser");
            Boolean bool12 = (Boolean) map6.get("prefersDefaultBrowser");
            List list = (List) map6.get("fallbackCustomTabs");
            Set h02 = list != null ? AbstractC0292g.h0(list) : null;
            Map map7 = (Map) map6.get("headers");
            str6 = (String) map6.get("sessionPackageName");
            bool = bool11;
            bool2 = bool12;
            set = h02;
            map2 = map7;
        }
        A.e eVar = new A.e(bool, bool2, set, map2, str6);
        Map map8 = (Map) map.get("partial");
        if (map8 == null) {
            d3 = null;
            num = null;
            d4 = null;
            d5 = null;
            bool4 = null;
            num2 = null;
            num3 = null;
            num4 = null;
            valueOf3 = null;
            bool3 = null;
        } else {
            Double d6 = (Double) map8.get("initialHeight");
            Long l6 = (Long) map8.get("activityHeightResizeBehavior");
            Integer valueOf5 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
            Double d7 = (Double) map8.get("initialWidth");
            Double d8 = (Double) map8.get("activitySideSheetBreakpoint");
            Boolean bool13 = (Boolean) map8.get("activitySideSheetMaximizationEnabled");
            Long l7 = (Long) map8.get("activitySideSheetPosition");
            Integer num5 = valueOf5;
            Integer valueOf6 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
            Long l8 = (Long) map8.get("activitySideSheetDecorationType");
            Integer num6 = valueOf6;
            Integer valueOf7 = l8 != null ? Integer.valueOf((int) l8.longValue()) : null;
            Long l9 = (Long) map8.get("activitySideSheetRoundedCornersPosition");
            Integer num7 = valueOf7;
            Integer valueOf8 = l9 != null ? Integer.valueOf((int) l9.longValue()) : null;
            Boolean bool14 = (Boolean) map8.get("backgroundInteractionEnabled");
            Integer num8 = valueOf8;
            Long l10 = (Long) map8.get("cornerRadius");
            d3 = d6;
            valueOf3 = l10 != null ? Integer.valueOf((int) l10.longValue()) : null;
            bool3 = bool14;
            d4 = d7;
            d5 = d8;
            bool4 = bool13;
            num = num5;
            num2 = num6;
            num3 = num7;
            num4 = num8;
        }
        return new C1207a(aVar, bool5, valueOf4, bool6, bool7, bool8, bool9, bool10, bVar, aVar2, eVar, new C1208b(d3, num, d4, d5, bool4, num2, num3, num4, valueOf3, bool3));
    }

    @Override // k.InterfaceC1074o
    public void a(MenuC1069j menuC1069j, boolean z3) {
        if (menuC1069j instanceof SubMenuC1079t) {
            ((SubMenuC1079t) menuC1069j).f9655w.j().c(false);
        }
        InterfaceC1074o interfaceC1074o = ((C1090i) this.f9216a).f9804e;
        if (interfaceC1074o != null) {
            interfaceC1074o.a(menuC1069j, z3);
        }
    }

    @Override // e.InterfaceC0281b
    public void b(Object obj) {
        C0280a c0280a = (C0280a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f9216a;
        proxyBillingActivityV2.getClass();
        Intent intent = c0280a.f4854b;
        int i3 = AbstractC0213o0.d(intent, "ProxyBillingActivityV2").f10046a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2536u;
        if (resultReceiver != null) {
            resultReceiver.send(i3, intent == null ? null : intent.getExtras());
        }
        int i4 = c0280a.f4853a;
        if (i4 != -1 || i3 != 0) {
            AbstractC0213o0.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // k.InterfaceC1074o
    public boolean c(SubMenuC1079t subMenuC1079t) {
        if (subMenuC1079t == null) {
            return false;
        }
        subMenuC1079t.f9656x.getClass();
        C1090i c1090i = (C1090i) this.f9216a;
        c1090i.getClass();
        InterfaceC1074o interfaceC1074o = c1090i.f9804e;
        if (interfaceC1074o != null) {
            return interfaceC1074o.c(subMenuC1079t);
        }
        return false;
    }

    public JSONObject d(View view) {
        if (view == null) {
            return w1.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f9216a;
        view.getLocationOnScreen(iArr);
        return w1.b.a(iArr[0], iArr[1], width, height);
    }

    public b0.j e() {
        if (((C) this.f9216a) == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        b0.j jVar = new b0.j();
        jVar.f2462a = (C) this.f9216a;
        return jVar;
    }

    public V1.b f(AbstractActivityC0027d context, C1207a c1207a, z sessionProvider) {
        boolean z3;
        C1193a c1193a;
        Bundle bundle;
        Drawable b3;
        Parcelable parcelable;
        ServiceConnectionC1210a serviceConnectionC1210a;
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(sessionProvider, "sessionProvider");
        A.e eVar = c1207a.f10360k;
        String str = (String) eVar.f7b;
        C1147e c1147e = new C1147e((str == null || (serviceConnectionC1210a = (ServiceConnectionC1210a) sessionProvider.f2346a.get(str)) == null) ? null : serviceConnectionC1210a.f10375d);
        Intent intent = c1147e.f10135a;
        D0.a aVar = c1207a.f10351a;
        Integer num = (Integer) aVar.f261a;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < 0 || intValue > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", intValue);
        }
        A0.j jVar = (A0.j) aVar.f262b;
        if (jVar != null) {
            c1147e.a(1, jVar);
        }
        A0.j jVar2 = (A0.j) aVar.f263c;
        if (jVar2 != null) {
            c1147e.a(2, jVar2);
        }
        A0.j jVar3 = (A0.j) aVar.f264d;
        if (jVar3 != null) {
            c1147e.f10139e = jVar3.Q();
        }
        Boolean bool = c1207a.f10352b;
        if (bool != null) {
            intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", bool.booleanValue());
        }
        Integer num2 = c1207a.f10353c;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 < 0 || intValue2 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            c1147e.f = intValue2;
            if (intValue2 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (intValue2 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
        }
        Boolean bool2 = c1207a.f10354d;
        if (bool2 != null) {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = c1207a.f10355e;
        if (bool3 != null) {
            c1147e.f10140g = bool3.booleanValue();
        }
        if (c1207a.f != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !r10.booleanValue());
        }
        if (c1207a.f10356g != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !r10.booleanValue());
        }
        Boolean bool4 = c1207a.f10357h;
        if (bool4 != null) {
            c1147e.f10141h = bool4.booleanValue();
        }
        V1.b bVar = c1207a.f10358i;
        C1193a c1193a2 = (C1193a) this.f9216a;
        String str2 = (String) bVar.f1614b;
        if (str2 != null) {
            c1193a2.getClass();
            int a3 = C1193a.a(context, "drawable", str2);
            if (a3 == 0 || (b3 = AbstractC1206a.b(context, a3)) == null) {
                z3 = true;
                c1193a = c1193a2;
                parcelable = null;
            } else {
                int intrinsicWidth = b3.getIntrinsicWidth();
                int intrinsicHeight = b3.getIntrinsicHeight();
                if (b3 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) b3;
                    if (bitmapDrawable.getBitmap() == null) {
                        throw new IllegalArgumentException("bitmap is null");
                    }
                    parcelable = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                    z3 = true;
                    c1193a = c1193a2;
                } else {
                    Rect bounds = b3.getBounds();
                    z3 = true;
                    int i3 = bounds.left;
                    int i4 = bounds.top;
                    int i5 = bounds.right;
                    int i6 = bounds.bottom;
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    c1193a = c1193a2;
                    b3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    b3.draw(new Canvas(createBitmap));
                    b3.setBounds(i3, i4, i5, i6);
                    parcelable = createBitmap;
                }
            }
            if (parcelable != null) {
                intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", parcelable);
            }
        } else {
            z3 = true;
            c1193a = c1193a2;
        }
        Integer num3 = (Integer) bVar.f1615c;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            if (intValue3 < 0 || intValue3 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", intValue3);
        }
        D0.a aVar2 = c1207a.f10359j;
        c1193a.getClass();
        int a4 = C1193a.a(context, "anim", (String) aVar2.f264d);
        int a5 = C1193a.a(context, "anim", (String) aVar2.f261a);
        if (a4 != 0 && a5 != 0) {
            c1147e.f10137c = ActivityOptions.makeCustomAnimation(context, a4, a5);
        }
        int a6 = C1193a.a(context, "anim", (String) aVar2.f262b);
        int a7 = C1193a.a(context, "anim", (String) aVar2.f263c);
        if (a6 != 0 && a7 != 0) {
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(context, a6, a7).toBundle());
        }
        C1208b c1208b = c1207a.f10361l;
        Double d3 = c1208b.f10362a;
        if (d3 != null) {
            double doubleValue = d3.doubleValue();
            c1193a.getClass();
            int i7 = (int) ((doubleValue * context.getResources().getDisplayMetrics().density) + 0.5d);
            Integer num4 = c1208b.f10363b;
            if (num4 == null) {
                c1147e.b(i7, 0);
            } else {
                c1147e.b(i7, num4.intValue());
            }
        }
        Double d4 = c1208b.f10364c;
        if (d4 != null) {
            double doubleValue2 = d4.doubleValue();
            c1193a.getClass();
            int i8 = (int) ((doubleValue2 * context.getResources().getDisplayMetrics().density) + 0.5d);
            if (i8 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i8);
        }
        Double d5 = c1208b.f10365d;
        if (d5 != null) {
            int doubleValue3 = (int) d5.doubleValue();
            if (doubleValue3 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", doubleValue3);
        }
        Boolean bool5 = c1208b.f10366e;
        if (bool5 != null) {
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", bool5.booleanValue());
        }
        Integer num5 = c1208b.f;
        if (num5 != null) {
            int intValue4 = num5.intValue();
            if (intValue4 < 0 || intValue4 > 2) {
                throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", intValue4);
        }
        Integer num6 = c1208b.f10367g;
        if (num6 != null) {
            int intValue5 = num6.intValue();
            if (intValue5 < 0 || intValue5 > 3) {
                throw new IllegalArgumentException("Invalid value for the decorationType argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", intValue5);
        }
        Integer num7 = c1208b.f10368h;
        if (num7 != null) {
            int intValue6 = num7.intValue();
            if (intValue6 < 0 || intValue6 > 2) {
                throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", intValue6);
        }
        Integer num8 = c1208b.f10369i;
        if (num8 != null) {
            int intValue7 = num8.intValue();
            if (intValue7 < 0 || intValue7 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", intValue7);
        }
        if (c1208b.f10370j != null) {
            intent.putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", !r1.booleanValue());
        }
        if (intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle = null;
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", c1147e.f10140g);
        c1147e.f10136b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle3 = c1147e.f10139e;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        if (c1147e.f10138d != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", c1147e.f10138d);
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", c1147e.f);
        int i9 = Build.VERSION.SDK_INT;
        String a8 = AbstractC1145c.a();
        if (!TextUtils.isEmpty(a8)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a8);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i9 >= 34) {
            if (c1147e.f10137c == null) {
                c1147e.f10137c = AbstractC1144b.a();
            }
            AbstractC1146d.a(c1147e.f10137c, c1147e.f10141h);
        }
        ActivityOptions activityOptions = c1147e.f10137c;
        V1.b bVar2 = new V1.b(intent, 11, activityOptions != null ? activityOptions.toBundle() : bundle);
        Map map = (Map) eVar.f;
        if (map != null) {
            intent.putExtra("com.android.browser.headers", X0.a.i(map));
        }
        if (intent.getPackage() != null) {
            return bVar2;
        }
        if (str != null) {
            intent.setPackage(str);
            return bVar2;
        }
        k a9 = eVar.a(context);
        if (kotlin.jvm.internal.j.a((Boolean) eVar.f9d, Boolean.TRUE)) {
            intent.setPackage(X0.a.s(context, false, a9));
            return bVar2;
        }
        intent.setPackage(X0.a.s(context, z3, a9));
        return bVar2;
    }

    public void h(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1130s c1130s = (C1130s) it.next();
            if (!"play_pass_subs".equals(c1130s.f10076b)) {
                hashSet.add(c1130s.f10076b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f9216a = C.k(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [i2.g, o2.p] */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        z2.a aVar;
        int i3;
        Throwable th;
        n nVar;
        if (interfaceC0319c instanceof z2.a) {
            aVar = (z2.a) interfaceC0319c;
            int i4 = aVar.f10702g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f10702g = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f10701e;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = aVar.f10702g;
                C0279i c0279i = C0279i.f4852a;
                if (i3 != 0) {
                    X0.a.L(obj);
                    g2.h hVar = aVar.f5029b;
                    kotlin.jvm.internal.j.b(hVar);
                    n nVar2 = new n(eVar, hVar);
                    try {
                        aVar.f10700d = nVar2;
                        aVar.f10702g = 1;
                        Object invoke = ((i2.g) this.f9216a).invoke(nVar2, aVar);
                        if (invoke != enumC0326a) {
                            invoke = c0279i;
                        }
                        if (invoke == enumC0326a) {
                            return enumC0326a;
                        }
                        nVar = nVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = nVar2;
                        nVar.h();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = aVar.f10700d;
                    try {
                        X0.a.L(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        nVar.h();
                        throw th;
                    }
                }
                nVar.h();
                return c0279i;
            }
        }
        aVar = new z2.a(this, interfaceC0319c);
        Object obj2 = aVar.f10701e;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = aVar.f10702g;
        C0279i c0279i2 = C0279i.f4852a;
        if (i3 != 0) {
        }
        nVar.h();
        return c0279i2;
    }

    public k(int i3) {
        switch (i3) {
            case 9:
                this.f9216a = new int[2];
                break;
            default:
                this.f9216a = new C1193a();
                break;
        }
    }

    public k(Set packages) {
        kotlin.jvm.internal.j.e(packages, "packages");
        this.f9216a = packages;
        if (packages.isEmpty()) {
            return;
        }
        Iterator it = packages.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set = AbstractC1164b.f10231a;
            if (AbstractC1164b.f10231a.contains(str)) {
                throw new IllegalArgumentException("Packages must not contain any Chrome packages.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(p pVar) {
        this.f9216a = (i2.g) pVar;
    }
}
