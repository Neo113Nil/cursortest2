package B0;

import G0.P;
import G4.w;
import M.C0086o;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import g.AbstractC0444a;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.C0471p;
import h.AbstractC0477a;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.v;
import l.AbstractC1250w;
import l.C1242n;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONObject;
import u4.InterfaceC1481a;
import u4.InterfaceC1484d;
import y2.C1557b;
import y2.C1562g;

/* loaded from: classes.dex */
public final class c implements G4.d, H2.d, X0.b, H2.m, w2.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f140b;

    /* renamed from: c, reason: collision with root package name */
    public Object f141c;

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f139a = i2;
        this.f140b = obj;
        this.f141c = obj2;
    }

    @Override // w2.s
    public void b(KeyEvent keyEvent, P p5) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            p5.d(false);
            return;
        }
        Character a6 = ((K4.i) this.f141c).a(keyEvent.getUnicodeChar());
        boolean z = action != 0;
        D3.g gVar = new D3.g(29, p5);
        B1.g gVar2 = (B1.g) this.f140b;
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a6.toString());
        hashMap.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((f2.t) gVar2.f215b).g(hashMap, new D3.g(1, gVar));
    }

    public void c() {
        T4.h hVar;
        ImageView imageView = (ImageView) this.f140b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC1250w.f10979a;
        }
        if (drawable == null || (hVar = (T4.h) this.f141c) == null) {
            return;
        }
        C1242n.c(drawable, hVar, imageView.getDrawableState());
    }

    public void d(l5.a aVar) {
        AudioAttributes a6 = aVar.a();
        HashMap hashMap = (HashMap) this.f141c;
        if (hashMap.containsKey(a6)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(a6).setMaxStreams(32).build();
        ((l5.c) this.f140b).b("Create SoundPool with " + a6);
        kotlin.jvm.internal.i.b(build);
        final m5.m mVar = new m5.m(build);
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: m5.i
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i2, int i3) {
                B0.c cVar = B0.c.this;
                m mVar2 = mVar;
                ((l5.c) cVar.f140b).b("Loaded " + i2);
                l lVar = (l) mVar2.f11244b.get(Integer.valueOf(i2));
                n5.d dVar = lVar != null ? lVar.f11242h : null;
                if (dVar != null) {
                    Map map = mVar2.f11244b;
                    Integer num = lVar.f11238d;
                    if ((map instanceof InterfaceC1481a) && !(map instanceof InterfaceC1484d)) {
                        v.d(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    try {
                        map.remove(num);
                        synchronized (mVar2.f11245c) {
                            List<l> list = (List) mVar2.f11245c.get(dVar);
                            if (list == null) {
                                list = C0471p.f5750a;
                            }
                            for (l lVar2 : list) {
                                lVar2.f11235a.c("Marking " + lVar2 + " as loaded");
                                lVar2.f11235a.h(true);
                                n nVar = lVar2.f11235a;
                                if (nVar.f11259n) {
                                    nVar.c("Delayed start of " + lVar2);
                                    lVar2.start();
                                }
                            }
                        }
                    } catch (ClassCastException e3) {
                        kotlin.jvm.internal.i.j(e3, v.class.getName());
                        throw e3;
                    }
                }
            }
        });
        hashMap.put(a6, mVar);
    }

    public ArrayList e(String str) {
        X.k c2 = X.k.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f140b;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                arrayList.add(m6.isNull(0) ? null : m6.getString(0));
            }
            return arrayList;
        } finally {
            m6.close();
            c2.g();
        }
    }

    public List f() {
        ArrayList arrayList;
        if (((ArrayList) this.f140b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f140b)) {
            arrayList = new ArrayList((ArrayList) this.f140b);
        }
        return arrayList;
    }

    public void g(int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f140b;
        B4.i M5 = B4.i.M(imageView.getContext(), null, AbstractC0444a.f5697e, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) M5.f312c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0477a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC1250w.f10979a;
            }
            if (typedArray.hasValue(2)) {
                I.e.c(imageView, M5.E(2));
            }
            if (typedArray.hasValue(3)) {
                I.e.d(imageView, AbstractC1250w.c(typedArray.getInt(3, -1), null));
            }
            M5.P();
        } catch (Throwable th) {
            M5.P();
            throw th;
        }
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new W0.f((Context) ((V0.j) this.f140b).f3212b, (W0.d) ((W0.e) this.f141c).get());
    }

    public void h(B.g gVar) {
        int i2 = gVar.f119b;
        Handler handler = (Handler) this.f141c;
        V0.j jVar = (V0.j) this.f140b;
        if (i2 == 0) {
            handler.post(new A0.a(jVar, gVar.f118a, 1, false));
        } else {
            handler.post(new B.a(jVar, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        G4.j jVar;
        int i2;
        Throwable th;
        H4.v vVar;
        c cVar;
        G4.e eVar2;
        switch (this.f139a) {
            case 4:
                if (interfaceC1218d instanceof G4.j) {
                    jVar = (G4.j) interfaceC1218d;
                    int i3 = jVar.f1071b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jVar.f1071b = i3 - Integer.MIN_VALUE;
                        Object obj = jVar.f1070a;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = jVar.f1071b;
                        if (i2 != 0) {
                            e5.g.y(obj);
                            H4.v vVar2 = new H4.v(eVar, jVar.getContext());
                            try {
                                C0086o c0086o = (C0086o) this.f140b;
                                jVar.f1073d = this;
                                jVar.f1074e = eVar;
                                jVar.f1075f = vVar2;
                                jVar.f1071b = 1;
                                if (c0086o.invoke(vVar2, jVar) == enumC1260a) {
                                    return enumC1260a;
                                }
                                cVar = this;
                                eVar2 = eVar;
                                vVar = vVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                vVar = vVar2;
                                vVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                e5.g.y(obj);
                                return f4.v.f5689a;
                            }
                            vVar = jVar.f1075f;
                            eVar2 = jVar.f1074e;
                            cVar = jVar.f1073d;
                            try {
                                e5.g.y(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                vVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        vVar.releaseIntercepted();
                        w wVar = (w) cVar.f141c;
                        jVar.f1073d = null;
                        jVar.f1074e = null;
                        jVar.f1075f = null;
                        jVar.f1071b = 2;
                        wVar.i(eVar2, jVar);
                        return enumC1260a;
                    }
                }
                jVar = new G4.j(this, interfaceC1218d);
                Object obj2 = jVar.f1070a;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = jVar.f1071b;
                if (i2 != 0) {
                }
                vVar.releaseIntercepted();
                w wVar2 = (w) cVar.f141c;
                jVar.f1073d = null;
                jVar.f1074e = null;
                jVar.f1075f = null;
                jVar.f1071b = 2;
                wVar2.i(eVar2, jVar);
                return enumC1260a2;
            default:
                Object i6 = ((G4.d) this.f140b).i(new N2.m(eVar, (P.d) this.f141c, 0), interfaceC1218d);
                return i6 == EnumC1260a.f11058a ? i6 : f4.v.f5689a;
        }
    }

    @Override // H2.d
    public void l(ByteBuffer byteBuffer, C1562g c1562g) {
        H2.o oVar = (H2.o) this.f141c;
        try {
            ((H2.m) this.f140b).onMethodCall(oVar.f1150c.d(byteBuffer), new G2.i(this, 1, c1562g));
        } catch (RuntimeException e3) {
            Log.e("MethodChannel#" + oVar.f1149b, "Failed to handle method call", e3);
            c1562g.a(oVar.f1150c.b(e3.getMessage(), Log.getStackTraceString(e3)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00c0, code lost:
    
        if (B4.r.O(r1, "generic", false) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017c A[LOOP:1: B:18:0x0176->B:20:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // H2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(H2.l call, H2.n nVar) {
        boolean z;
        Iterator it;
        int i2;
        kotlin.jvm.internal.i.e(call, "call");
        if (!call.f1146a.equals("getDeviceInfo")) {
            ((G2.i) nVar).a();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String BRAND = Build.BRAND;
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        hashMap.put("device", DEVICE);
        hashMap.put("display", Build.DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        hashMap.put("hardware", HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put(OutcomeConstants.OUTCOME_ID, Build.ID);
        String MANUFACTURER = Build.MANUFACTURER;
        hashMap.put(CommonUrlParts.MANUFACTURER, MANUFACTURER);
        String MODEL = Build.MODEL;
        hashMap.put(CommonUrlParts.MODEL, MODEL);
        String PRODUCT = Build.PRODUCT;
        hashMap.put("product", PRODUCT);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", AbstractC0466k.A0(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", AbstractC0466k.A0(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", AbstractC0466k.A0(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, Build.TYPE);
        kotlin.jvm.internal.i.d(BRAND, "BRAND");
        boolean O5 = B4.r.O(BRAND, "generic", false);
        String str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        if (O5) {
            kotlin.jvm.internal.i.d(DEVICE, "DEVICE");
        }
        kotlin.jvm.internal.i.d(FINGERPRINT, "FINGERPRINT");
        if (!B4.r.O(FINGERPRINT, "generic", false) && !B4.r.O(FINGERPRINT, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, false)) {
            kotlin.jvm.internal.i.d(HARDWARE, "HARDWARE");
            if (!B4.k.R(HARDWARE, "goldfish", false) && !B4.k.R(HARDWARE, "ranchu", false)) {
                kotlin.jvm.internal.i.d(MODEL, "MODEL");
                if (!B4.k.R(MODEL, "google_sdk", false) && !B4.k.R(MODEL, "Emulator", false) && !B4.k.R(MODEL, "Android SDK built for x86", false)) {
                    kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
                    if (!B4.k.R(MANUFACTURER, "Genymotion", false)) {
                        kotlin.jvm.internal.i.d(PRODUCT, "PRODUCT");
                        if (!B4.k.R(PRODUCT, OtelConfigRemoteOneSignal.OTEL_PATH, false) && !B4.k.R(PRODUCT, "vbox86p", false) && !B4.k.R(PRODUCT, "emulator", false) && !B4.k.R(PRODUCT, "simulator", false)) {
                            z = false;
                            hashMap.put("isPhysicalDevice", Boolean.valueOf(!z));
                            FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f140b).getSystemAvailableFeatures();
                            kotlin.jvm.internal.i.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                            ArrayList arrayList = new ArrayList();
                            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                if (featureInfo.name != null) {
                                    arrayList.add(featureInfo);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC0467l.D0(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((FeatureInfo) it.next()).name);
                            }
                            hashMap.put("systemFeatures", arrayList2);
                            HashMap hashMap2 = new HashMap();
                            i2 = Build.VERSION.SDK_INT;
                            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                            hashMap2.put("codename", Build.VERSION.CODENAME);
                            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                            hashMap2.put("release", Build.VERSION.RELEASE);
                            hashMap2.put("sdkInt", Integer.valueOf(i2));
                            hashMap.put("version", hashMap2);
                            hashMap.put("isLowRamDevice", Boolean.valueOf(((ActivityManager) this.f141c).isLowRamDevice()));
                            if (i2 < 26) {
                                try {
                                    str = Build.getSerial();
                                } catch (SecurityException unused) {
                                }
                                hashMap.put("serialNumber", str);
                            } else {
                                hashMap.put("serialNumber", Build.SERIAL);
                            }
                            ((G2.i) nVar).success(hashMap);
                        }
                    }
                }
            }
        }
        z = true;
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z));
        FeatureInfo[] systemAvailableFeatures2 = ((PackageManager) this.f140b).getSystemAvailableFeatures();
        kotlin.jvm.internal.i.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        ArrayList arrayList3 = new ArrayList();
        while (r8 < r2) {
        }
        ArrayList arrayList22 = new ArrayList(AbstractC0467l.D0(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        HashMap hashMap22 = new HashMap();
        i2 = Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", Build.VERSION.CODENAME);
        hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap22.put("release", Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", Integer.valueOf(i2));
        hashMap.put("version", hashMap22);
        hashMap.put("isLowRamDevice", Boolean.valueOf(((ActivityManager) this.f141c).isLowRamDevice()));
        if (i2 < 26) {
        }
        ((G2.i) nVar).success(hashMap);
    }

    public c(String str) {
        this.f139a = 2;
        JSONObject jSONObject = new JSONObject(str);
        this.f140b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    arrayList.add(new G0.v(optJSONObject));
                }
            }
        }
        this.f141c = arrayList;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f139a = 0;
        this.f140b = workDatabase_Impl;
        this.f141c = new b(workDatabase_Impl, 0);
    }

    public c(B1.g gVar) {
        this.f139a = 13;
        this.f141c = new K4.i(1, false);
        this.f140b = gVar;
    }

    public c(w2.m mVar, InputMethodManager inputMethodManager, B1.g gVar) {
        this.f139a = 9;
        if (Build.VERSION.SDK_INT >= 33) {
            mVar.setAutoHandwritingEnabled(false);
        }
        this.f141c = mVar;
        this.f140b = inputMethodManager;
        gVar.f215b = this;
    }

    public c() {
        this.f139a = 7;
        this.f140b = new ArrayList();
        this.f141c = new HashMap();
        new HashMap();
    }

    public c(ImageView imageView) {
        this.f139a = 10;
        this.f140b = imageView;
    }

    public c(C1557b c1557b) {
        this.f139a = 3;
        B1.g gVar = new B1.g(8, this);
        H2.o oVar = new H2.o(c1557b, "flutter/localization", H2.j.f1145a);
        this.f140b = oVar;
        oVar.b(gVar);
    }

    public c(l5.c ref) {
        this.f139a = 11;
        kotlin.jvm.internal.i.e(ref, "ref");
        this.f140b = ref;
        this.f141c = new HashMap();
    }

    public c(H2.o oVar, H2.m mVar) {
        this.f139a = 5;
        this.f141c = oVar;
        this.f140b = mVar;
    }
}
