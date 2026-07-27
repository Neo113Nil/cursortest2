package h2;

import A2.e;
import B0.o;
import B0.t;
import B4.i;
import E.C0028c;
import G0.C0051a;
import G0.C0060j;
import G0.C0064n;
import G0.InterfaceC0069t;
import G0.u;
import G4.d;
import G4.w;
import H2.l;
import H2.m;
import H2.n;
import H2.s;
import H4.v;
import M.C0075d;
import M.C0090t;
import M.b0;
import M.d0;
import M.k0;
import M.l0;
import M2.C0097a;
import M2.C0106j;
import M2.E;
import M2.r;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Size;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import c1.f;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.yandex.varioqub.config.model.ConfigValue;
import e.C0400a;
import e.InterfaceC0401b;
import h2.C0482c;
import io.appmetrica.analytics.impl.C0793l9;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k4.InterfaceC1218d;
import l1.j;
import l4.EnumC1260a;
import m4.h;
import n2.AbstractC1341c;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1445p;
import y2.C1557b;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0482c implements InterfaceC0401b, H2.b, m, d, InterfaceC0069t {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0482c f5781c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5782a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5783b;

    public /* synthetic */ C0482c(int i2, Object obj) {
        this.f5782a = i2;
        this.f5783b = obj;
    }

    @Override // e.InterfaceC0401b
    public void b(Object obj) {
        C0400a c0400a = (C0400a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f5783b;
        proxyBillingActivityV2.getClass();
        Intent intent = c0400a.f5495b;
        int i2 = AbstractC0357o0.d(intent, "ProxyBillingActivityV2").f862a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f4939c;
        if (resultReceiver != null) {
            resultReceiver.send(i2, intent == null ? null : intent.getExtras());
        }
        int i3 = c0400a.f5494a;
        if (i3 != -1 || i2 != 0) {
            AbstractC0357o0.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i3 + " and billing's responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // H2.b
    public void c(Object obj, t tVar) {
        HashMap hashMap;
        HashMap hashMap2;
        i iVar = (i) this.f5783b;
        if (((io.flutter.view.a) iVar.f313d) == null) {
            tVar.b(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get(WebViewManager.EVENT_TYPE_KEY);
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) iVar.f313d;
                    if (Build.VERSION.SDK_INT < 28) {
                        g gVar = (g) aVar.f10266a;
                        AccessibilityEvent d6 = gVar.d(0, 32);
                        d6.getText().add(str2);
                        gVar.h(d6);
                        break;
                    } else {
                        aVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) iVar.f313d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((g) aVar2.f10266a).f10357a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) iVar.f313d;
                    ((g) aVar3.f10266a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) iVar.f313d;
                    ((g) aVar4.f10266a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) iVar.f313d;
                    ((g) aVar5.f10266a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        tVar.b(null);
    }

    public B1.g d() {
        if (((C) this.f5783b) != null) {
            return new B1.g(this);
        }
        throw new IllegalArgumentException("Product list must be set to a non empty list.");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [A2.b] */
    public Bitmap e(ByteBuffer byteBuffer, e eVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: A2.b
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace.Named named;
                    ColorSpace colorSpace;
                    Size size;
                    C0482c c0482c = C0482c.this;
                    c0482c.getClass();
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    f fVar = (f) c0482c.f5783b;
                    if (fVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(fVar.f4904a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e3) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e3);
            return null;
        }
    }

    public k0 f() {
        w wVar = (w) this.f5783b;
        wVar.getClass();
        C0051a c0051a = H4.t.f1201a;
        Object obj = w.f1114e.get(wVar);
        if (obj == c0051a) {
            obj = null;
        }
        return (k0) obj;
    }

    public void g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (!"play_pass_subs".equals(uVar.f896b)) {
                hashSet.add(uVar.f896b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f5783b = C.k(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f1717a > r3.f1717a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(k0 newState) {
        w wVar;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.i.e(newState, "newState");
        do {
            wVar = (w) this.f5783b;
            wVar.getClass();
            obj = H4.t.f1201a;
            Object obj3 = w.f1114e.get(wVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            k0 k0Var = (k0) obj2;
            if (!(k0Var instanceof d0 ? true : kotlin.jvm.internal.i.a(k0Var, l0.f1722b))) {
                if (!(k0Var instanceof C0075d)) {
                    if (!(k0Var instanceof b0)) {
                        throw new C1.b();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (k0Var != null) {
                    obj = k0Var;
                }
            }
            k0Var = newState;
            if (obj2 == null) {
            }
            if (k0Var != null) {
            }
        } while (!wVar.c(obj2, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Type inference failed for: r7v4, types: [m4.h, t4.p] */
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        G4.a aVar;
        int i2;
        Throwable th;
        v vVar;
        switch (this.f5782a) {
            case C0793l9.f8681C /* 19 */:
                if (interfaceC1218d instanceof G4.a) {
                    aVar = (G4.a) interfaceC1218d;
                    int i3 = aVar.f1047d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f1047d = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f1045b;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = aVar.f1047d;
                        f4.v vVar2 = f4.v.f5689a;
                        if (i2 != 0) {
                            e5.g.y(obj);
                            v vVar3 = new v(eVar, aVar.getContext());
                            try {
                                aVar.f1044a = vVar3;
                                aVar.f1047d = 1;
                                Object invoke = ((h) this.f5783b).invoke(vVar3, aVar);
                                if (invoke != enumC1260a) {
                                    invoke = vVar2;
                                }
                                if (invoke == enumC1260a) {
                                    return enumC1260a;
                                }
                                vVar = vVar3;
                            } catch (Throwable th2) {
                                th = th2;
                                vVar = vVar3;
                                vVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vVar = aVar.f1044a;
                            try {
                                e5.g.y(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                vVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        vVar.releaseIntercepted();
                        return vVar2;
                    }
                }
                aVar = new G4.a(this, interfaceC1218d);
                Object obj2 = aVar.f1045b;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = aVar.f1047d;
                f4.v vVar22 = f4.v.f5689a;
                if (i2 != 0) {
                }
                vVar.releaseIntercepted();
                return vVar22;
            default:
                Object i6 = ((d) this.f5783b).i(new C0090t(eVar, 1), interfaceC1218d);
                return i6 == EnumC1260a.f11058a ? i6 : f4.v.f5689a;
        }
    }

    public B1.f j() {
        return (B1.f) ((B1.i) this.f5783b).t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        char c2;
        char c6;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c7;
        int i2 = 2;
        boolean z = false;
        switch (this.f5782a) {
            case 8:
                ((W1.e) this.f5783b).getClass();
                return;
            case 9:
            case 11:
            case 13:
            default:
                B1.g gVar = (B1.g) this.f5783b;
                if (((io.flutter.plugin.editing.h) gVar.f215b) == null) {
                    return;
                }
                String str = lVar.f1146a;
                Object obj = lVar.f1147b;
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    ((G2.i) nVar).a();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ((io.flutter.plugin.editing.h) gVar.f215b).a((String) arrayList.get(0), (String) arrayList.get(1), (G2.i) nVar);
                    return;
                } catch (IllegalStateException e3) {
                    ((G2.i) nVar).b("error", e3.getMessage(), null);
                    return;
                }
            case 10:
                B1.g gVar2 = (B1.g) this.f5783b;
                if (((B1.g) gVar2.f215b) == null) {
                    return;
                }
                String str2 = lVar.f1146a;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((B1.g) gVar2.f215b).d((String) ((HashMap) lVar.f1147b).get("kind"));
                            ((G2.i) nVar).success(Boolean.TRUE);
                        } catch (Exception e6) {
                            ((G2.i) nVar).b("error", "Error when setting cursors: " + e6.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e7) {
                    ((G2.i) nVar).b("error", "Unhandled error: " + e7.getMessage(), null);
                    return;
                }
            case 12:
                B1.g gVar3 = (B1.g) this.f5783b;
                if (((B0.e) gVar3.f215b) == null) {
                    return;
                }
                String str3 = lVar.f1146a;
                str3.getClass();
                Object obj2 = lVar.f1147b;
                switch (str3.hashCode()) {
                    case -1352294148:
                        if (str3.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1019779949:
                        if (str3.equals("offset")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -934437708:
                        if (str3.equals(WebViewManager.EVENT_TYPE_RESIZE)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str3.equals("clearFocus")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -308988850:
                        if (str3.equals("synchronizeToNativeViewHierarchy")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str3.equals("touch")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str3.equals("setDirection")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str3.equals("dispose")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        Map map = (Map) obj2;
                        boolean z5 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey(OutcomeEventsTable.COLUMN_NAME_PARAMS) ? ByteBuffer.wrap((byte[]) map.get(OutcomeEventsTable.COLUMN_NAME_PARAMS)) : null;
                        try {
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.l) ((B0.e) gVar3.f215b).f147c).f10224d;
                            if (flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled()) {
                                ((Integer) map.get(OutcomeConstants.OUTCOME_ID)).getClass();
                                String str4 = (String) map.get("viewType");
                                ((Integer) map.get("direction")).getClass();
                                if (((io.flutter.plugin.platform.l) ((io.flutter.plugin.platform.l) ((B0.e) gVar3.f215b).f147c).f10234n.f3212b).f10221a.f12299a.get(str4) != null) {
                                    throw new ClassCastException();
                                }
                                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str4);
                            }
                            if (z5) {
                                ((io.flutter.plugin.platform.m) ((B0.e) gVar3.f215b).f146b).f10255u.n(new G2.f(((Integer) map.get(OutcomeConstants.OUTCOME_ID)).intValue(), (String) map.get("viewType"), ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z = true;
                            }
                            ((io.flutter.plugin.platform.m) ((B0.e) gVar3.f215b).f146b).f10255u.o(new G2.f(((Integer) map.get(OutcomeConstants.OUTCOME_ID)).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e8) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            B0.e eVar = (B0.e) gVar3.f215b;
                            int intValue = ((Integer) map2.get(OutcomeConstants.OUTCOME_ID)).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.l) eVar.f147c).d(intValue);
                            ((io.flutter.plugin.platform.m) eVar.f146b).f10255u.u(intValue, doubleValue, doubleValue2);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e9) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        int intValue2 = ((Integer) map3.get(OutcomeConstants.OUTCOME_ID)).intValue();
                        G2.h hVar = new G2.h(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            B0.e eVar2 = (B0.e) gVar3.f215b;
                            C0028c c0028c = new C0028c((G2.i) nVar);
                            eVar2.getClass();
                            ((io.flutter.plugin.platform.l) eVar2.f147c).d(intValue2);
                            ((io.flutter.plugin.platform.m) eVar2.f146b).f10255u.x(hVar, c0028c);
                            return;
                        } catch (IllegalStateException e10) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 3:
                        int intValue3 = ((Integer) obj2).intValue();
                        try {
                            B0.e eVar3 = (B0.e) gVar3.f215b;
                            ((io.flutter.plugin.platform.l) eVar3.f147c).d(intValue3);
                            ((io.flutter.plugin.platform.m) eVar3.f146b).f10255u.d(intValue3);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.m) ((io.flutter.plugin.platform.m) ((B0.e) gVar3.f215b).f146b).f10255u.f3053a).f10251q = ((Boolean) obj2).booleanValue();
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        G2.g gVar4 = new G2.g(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            B0.e eVar4 = (B0.e) gVar3.f215b;
                            eVar4.getClass();
                            ((io.flutter.plugin.platform.l) eVar4.f147c).d(intValue4);
                            ((io.flutter.plugin.platform.m) eVar4.f146b).f10255u.w(gVar4);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        int intValue5 = ((Integer) map4.get(OutcomeConstants.OUTCOME_ID)).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            B0.e eVar5 = (B0.e) gVar3.f215b;
                            ((io.flutter.plugin.platform.l) eVar5.f147c).d(intValue5);
                            ((io.flutter.plugin.platform.m) eVar5.f146b).f10255u.z(intValue5, intValue6);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e14) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 7:
                        int intValue7 = ((Integer) ((Map) obj2).get(OutcomeConstants.OUTCOME_ID)).intValue();
                        try {
                            B0.e eVar6 = (B0.e) gVar3.f215b;
                            ((io.flutter.plugin.platform.l) eVar6.f147c).d(intValue7);
                            ((io.flutter.plugin.platform.m) eVar6.f146b).f10255u.r(intValue7);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e15) {
                            ((G2.i) nVar).b("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    default:
                        ((G2.i) nVar).a();
                        return;
                }
            case 14:
                B0.l lVar2 = (B0.l) this.f5783b;
                if (((K2.a) lVar2.f164c) == null) {
                    return;
                }
                String str5 = lVar.f1146a;
                Object obj3 = lVar.f1147b;
                str5.getClass();
                if (str5.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList2 = (ArrayList) obj3;
                        ((K2.a) lVar2.f164c).a((String) arrayList2.get(0), (String) arrayList2.get(1), ((Boolean) arrayList2.get(2)).booleanValue(), (G2.i) nVar);
                        return;
                    } catch (IllegalStateException e16) {
                        ((G2.i) nVar).b("error", e16.getMessage(), null);
                        return;
                    }
                }
                if (!str5.equals("ProcessText.queryTextActions")) {
                    ((G2.i) nVar).a();
                    return;
                }
                try {
                    ((G2.i) nVar).success(((K2.a) lVar2.f164c).b());
                    return;
                } catch (IllegalStateException e17) {
                    ((G2.i) nVar).b("error", e17.getMessage(), null);
                    return;
                }
            case 15:
                B1.g gVar5 = (B1.g) this.f5783b;
                if (((B0.c) gVar5.f215b) == null) {
                    return;
                }
                String str6 = lVar.f1146a;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -705821951:
                        if (str6.equals("Scribe.isFeatureAvailable")) {
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1759284829:
                        if (str6.equals("Scribe.startStylusHandwriting")) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 2119738044:
                        if (str6.equals("Scribe.isStylusHandwritingAvailable")) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                switch (c6) {
                    case 0:
                        try {
                            B0.c cVar = (B0.c) gVar5.f215b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) cVar.f140b).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    ((G2.i) nVar).success(Boolean.valueOf(r11));
                                    return;
                                }
                            } else {
                                cVar.getClass();
                            }
                            r11 = false;
                            ((G2.i) nVar).success(Boolean.valueOf(r11));
                            return;
                        } catch (IllegalStateException e18) {
                            ((G2.i) nVar).b("error", e18.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            ((G2.i) nVar).b("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            B0.c cVar2 = (B0.c) gVar5.f215b;
                            ((InputMethodManager) cVar2.f140b).startStylusHandwriting((w2.m) cVar2.f141c);
                            ((G2.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e19) {
                            ((G2.i) nVar).b("error", e19.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            ((G2.i) nVar).b("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((B0.c) gVar5.f215b).f140b).isStylusHandwritingAvailable();
                            ((G2.i) nVar).success(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e20) {
                            ((G2.i) nVar).b("error", e20.getMessage(), null);
                            return;
                        }
                    default:
                        ((G2.i) nVar).a();
                        return;
                }
            case 16:
                B1.g gVar6 = (B1.g) this.f5783b;
                if (((B3.d) gVar6.f215b) == null) {
                    return;
                }
                String str7 = lVar.f1146a;
                str7.getClass();
                switch (str7.hashCode()) {
                    case -1937987631:
                        if (str7.equals("SensitiveContent.getContentSensitivity")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 598223325:
                        if (str7.equals("SensitiveContent.setContentSensitivity")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1615625817:
                        if (str7.equals("SensitiveContent.isSupported")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        try {
                            int c8 = ((B3.d) gVar6.f215b).c();
                            ((G2.i) nVar).success(Integer.valueOf(c8 != 0 ? c8 != 1 ? c8 != 2 ? 3 : 2 : 1 : 0));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e21) {
                            ((G2.i) nVar).b("error", e21.getMessage(), null);
                            return;
                        }
                    case 1:
                        int intValue8 = ((Integer) lVar.f1147b).intValue();
                        try {
                            B3.d dVar = (B3.d) gVar6.f215b;
                            gVar6.getClass();
                            if (intValue8 == 0) {
                                i2 = 0;
                            } else if (intValue8 == 1) {
                                i2 = 1;
                            } else if (intValue8 != 2) {
                                throw new IllegalArgumentException(o.g(intValue8, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            dVar.i(i2);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e22) {
                            ((G2.i) nVar).b("error", e22.getMessage(), null);
                            return;
                        }
                    case 2:
                        ((B3.d) gVar6.f215b).getClass();
                        ((G2.i) nVar).success(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        ((G2.i) nVar).a();
                        return;
                }
        }
    }

    @Override // G0.InterfaceC0069t
    public void onPurchasesUpdated(C0060j c0060j, List list) {
        r j2 = AbstractC1341c.j(c0060j);
        List l2 = AbstractC1341c.l(list);
        E e3 = new E();
        e3.f1820a = j2;
        if (l2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        e3.f1821b = l2;
        W1.e eVar = new W1.e();
        B1.g gVar = (B1.g) this.f5783b;
        gVar.getClass();
        new f2.t((H2.f) gVar.f215b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated", C0106j.f1877a, null).g(new ArrayList(Collections.singletonList(e3)), new C0097a(eVar, 2, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated"));
    }

    public C0482c(JSONArray jSONArray) {
        this.f5782a = 4;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    arrayList.add(new C0064n(optJSONObject));
                }
            }
        }
        this.f5783b = arrayList;
    }

    public C0482c(C1557b c1557b, int i2) {
        this.f5782a = i2;
        switch (i2) {
            case 13:
                new H2.o(c1557b, "flutter/platform_views_2", s.f1151b).b(new B1.g(11, this));
                break;
            case 18:
                this.f5783b = new f2.t(c1557b, "flutter/system", H2.i.f1144a, null);
                break;
            default:
                j jVar = new j(4);
                H2.o oVar = new H2.o(c1557b, "flutter/navigation", H2.j.f1145a);
                this.f5783b = oVar;
                oVar.b(jVar);
                break;
        }
    }

    public C0482c(R.m fragmentManager) {
        this.f5782a = 28;
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        this.f5783b = new CopyOnWriteArrayList();
    }

    public C0482c(int i2) {
        this.f5782a = i2;
        switch (i2) {
            case 5:
                break;
            case 22:
                this.f5783b = new AtomicInteger(0);
                break;
            case 23:
                this.f5783b = new w(l0.f1722b);
                break;
            default:
                this.f5783b = new HashSet();
                break;
        }
    }

    public C0482c(Set packages) {
        this.f5782a = 21;
        kotlin.jvm.internal.i.e(packages, "packages");
        this.f5783b = packages;
        if (packages.isEmpty()) {
            return;
        }
        Iterator it = packages.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set = K0.b.f1374a;
            if (K0.b.f1374a.contains(str)) {
                throw new IllegalArgumentException("Packages must not contain any Chrome packages.");
            }
        }
    }

    public C0482c(boolean z) {
        this.f5782a = 26;
        this.f5783b = new AtomicBoolean(z);
    }

    public C0482c(H2.f fVar) {
        this.f5782a = 9;
        x1.e eVar = new x1.e();
        eVar.f12266b = this;
        eVar.f12265a = new HashMap();
        new H2.o(fVar, "flutter/keyboard", s.f1151b).b(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0482c(InterfaceC1445p interfaceC1445p) {
        this.f5782a = 19;
        this.f5783b = (h) interfaceC1445p;
    }
}
