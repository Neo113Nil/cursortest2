package Ve;

import Lm0.a;
import android.os.Build;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.data.dto.StartDeviceInfoModel;

/* renamed from: Ve.ia, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4324ia extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ La f31278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4324ia(La la2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31278d = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4324ia(this.f31278d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4324ia(this.f31278d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00dd, code lost:
    
        if (kotlin.text.h.e0(r13, "sdk_gphone_", false) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (kotlin.text.h.A(r12, ":user/release-keys", r6) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        if (kotlin.text.h.e0(r4, "sdk_gphone64_", r6) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ac, code lost:
    
        if (kotlin.text.h.e0(r1, "generic", false) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0252, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, "1") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f7, code lost:
    
        if (r0 == null) goto L76;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mm0.e eVar;
        Ur ur;
        Pe pe2;
        String str;
        Lf.a ui2;
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        La la2 = this.f31278d;
        Te te2 = la2.f29398d;
        Ld ld2 = Ld.SC_BIZONE;
        Ur ur2 = Ur.MERCHANT_VIEW;
        Pe pe3 = Pe.SC;
        te2.b(new Bi(ld2, ur2, pe3, null, null, null, null, 120));
        Bo bo = (Bo) la2.f29396b;
        Mm0.e eVar2 = Mm0.e.Compromised;
        Mm0.e eVar3 = Mm0.e.Emulator;
        Mm0.e eVar4 = Mm0.e.RdpConnection;
        Mm0.e eVar5 = Mm0.e.RdpConnectionDuration;
        Mm0.e eVar6 = Mm0.e.Debugger;
        Sp sp = new Sp(C7714v.m0(eVar2, eVar3, eVar4, eVar5, eVar6));
        Yn.f30512a.getClass();
        new Sp(C4768xn.f32501b);
        k5.m3 a11 = bo.f28726b.a(sp);
        Intrinsics.checkNotNullExpressionValue(a11, "bizoneFingerprintFactory…eate(fingerprintSettings)");
        a11.b();
        String report = a11.a();
        a11.c();
        Intrinsics.checkNotNullExpressionValue(report, "report");
        StartDeviceInfoModel startDeviceInfoModel = (StartDeviceInfoModel) new Gson().d(report, StartDeviceInfoModel.class);
        LinkedHashMap notSuccessParams = new LinkedHashMap();
        if (startDeviceInfoModel.getCompromised() >= 16) {
            notSuccessParams.put(eVar2.name(), String.valueOf(startDeviceInfoModel.getCompromised()));
        }
        String MANUFACTURER = Build.MANUFACTURER;
        if (Intrinsics.d(MANUFACTURER, "Google") && Intrinsics.d(Build.BRAND, "google")) {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            eVar = eVar3;
            if (kotlin.text.h.e0(FINGERPRINT, "google/sdk_gphone_", false)) {
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                if (kotlin.text.h.A(FINGERPRINT, ":user/release-keys", false)) {
                    String PRODUCT = Build.PRODUCT;
                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                    ur = ur2;
                    pe2 = pe3;
                    z11 = false;
                    if (kotlin.text.h.e0(PRODUCT, "sdk_gphone_", false)) {
                        String MODEL = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    }
                } else {
                    ur = ur2;
                    pe2 = pe3;
                    z11 = false;
                }
            } else {
                ur = ur2;
                pe2 = pe3;
                z11 = false;
            }
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (kotlin.text.h.e0(FINGERPRINT, "google/sdk_gphone64_", z11)) {
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                if (!kotlin.text.h.A(FINGERPRINT, ":userdebug/dev-keys", z11)) {
                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                }
                String PRODUCT2 = Build.PRODUCT;
                Intrinsics.checkNotNullExpressionValue(PRODUCT2, "PRODUCT");
                if (kotlin.text.h.e0(PRODUCT2, "sdk_gphone64_", z11)) {
                    String MODEL2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                }
            }
        } else {
            eVar = eVar3;
            ur = ur2;
            pe2 = pe3;
        }
        String FINGERPRINT2 = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
        if (!kotlin.text.h.e0(FINGERPRINT2, "generic", false)) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
            if (!kotlin.text.h.e0(FINGERPRINT2, "unknown", false)) {
                String MODEL3 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                if (!kotlin.text.h.t(MODEL3, "google_sdk", false)) {
                    Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                    if (!kotlin.text.h.t(MODEL3, "Emulator", false)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                        if (!kotlin.text.h.t(MODEL3, "Android SDK built for x86", false) && (!"QC_Reference_Phone".equals(Build.BOARD) || "Xiaomi".equalsIgnoreCase(MANUFACTURER))) {
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!kotlin.text.h.t(MANUFACTURER, "Genymotion", false)) {
                                String HOST = Build.HOST;
                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                if (!kotlin.text.h.e0(HOST, "Build", false)) {
                                    String BRAND = Build.BRAND;
                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                    if (kotlin.text.h.e0(BRAND, "generic", false)) {
                                        String DEVICE = Build.DEVICE;
                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                    }
                                    if (!Intrinsics.d(Build.PRODUCT, "google_sdk")) {
                                        Mb mb2 = bo.f28727c;
                                        Intrinsics.checkNotNullParameter("ro.kernel.qemu", "propName");
                                        String str2 = "";
                                        Intrinsics.checkNotNullParameter("", "defaultResult");
                                        Process process = null;
                                        if (!mb2.f29468a) {
                                            try {
                                                if (mb2.f29469b == null) {
                                                    mb2.f29469b = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                                                }
                                                Method method = mb2.f29469b;
                                                Intrinsics.f(method);
                                                str = (String) method.invoke(null, "ro.kernel.qemu", "");
                                            } catch (Exception e11) {
                                                a.b bVar = Lm0.a.f17149a;
                                                bVar.b("GET PROPERTIES EXCEPTION");
                                                bVar.e(e11.toString(), new Object[0]);
                                                mb2.f29469b = null;
                                                mb2.f29468a = true;
                                            }
                                        }
                                        try {
                                            try {
                                                process = Runtime.getRuntime().exec("getprop \"ro.kernel.qemu\" \"\"");
                                                str = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
                                                Intrinsics.checkNotNullExpressionValue(str, "reader.readLine()");
                                                process.destroy();
                                                str2 = str;
                                            } catch (IOException e12) {
                                                a.b bVar2 = Lm0.a.f17149a;
                                                bVar2.b("GET PROPERTIES EXCEPTION");
                                                bVar2.e(e12.toString(), new Object[0]);
                                                if (process != null) {
                                                    process.destroy();
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            if (process != null) {
                                                process.destroy();
                                            }
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        notSuccessParams.put(eVar.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
        if (startDeviceInfoModel.getRdpConnection() != 0) {
            notSuccessParams.put(eVar4.name(), String.valueOf(startDeviceInfoModel.getRdpConnection()));
        }
        if (startDeviceInfoModel.getRdpConnectionDuration() != 0) {
            notSuccessParams.put(eVar5.name(), String.valueOf(startDeviceInfoModel.getRdpConnectionDuration()));
        }
        int i11 = Wk.f30290b;
        if (i11 != 6 && i11 != 7 && startDeviceInfoModel.getDebugger() > 1) {
            notSuccessParams.put(eVar6.name(), String.valueOf(startDeviceInfoModel.getDebugger()));
        }
        boolean isEmpty = notSuccessParams.isEmpty();
        Intrinsics.checkNotNullParameter(notSuccessParams, "notSuccessParams");
        Te te3 = la2.f29398d;
        if (isEmpty) {
            te3.b(new Bi(Ld.SC_GOOD_BIZONE, ur, pe2, null, null, null, null, 120));
            ui2 = C4649ti.f32116b;
        } else {
            te3.b(new Bi(Ld.SC_FAIL_BIZONE, ur, pe2, notSuccessParams, null, null, null, 112));
            ui2 = new Ui(notSuccessParams);
        }
        ((C4238fb) la2.f29397c).b(new C4285h0(ui2));
        return Unit.f71690a;
    }
}
