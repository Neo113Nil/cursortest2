package b0;

import D.C0009j;
import a.AbstractC0086a;
import android.app.UiModeManager;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import e.C0280a;
import e.InterfaceC0281b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k.C1065f;
import k.MenuC1069j;
import k.MenuItemC1070k;
import k.RunnableC1064e;
import k.ViewOnKeyListenerC1066g;
import l.L;
import org.json.JSONException;
import org.json.JSONObject;
import w1.AbstractC1221a;

/* loaded from: classes.dex */
public final class j implements L, InterfaceC0281b, T1.m {

    /* renamed from: a, reason: collision with root package name */
    public Object f2462a;

    public /* synthetic */ j(Object obj) {
        this.f2462a = obj;
    }

    public static boolean e(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    @Override // l.L
    public void a(MenuC1069j menuC1069j, MenuItemC1070k menuItemC1070k) {
        ViewOnKeyListenerC1066g viewOnKeyListenerC1066g = (ViewOnKeyListenerC1066g) this.f2462a;
        viewOnKeyListenerC1066g.f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1066g.f9555h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1069j == ((C1065f) arrayList.get(i3)).f9548b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        viewOnKeyListenerC1066g.f.postAtTime(new RunnableC1064e(this, i4 < arrayList.size() ? (C1065f) arrayList.get(i4) : null, menuItemC1070k, menuC1069j), menuC1069j, SystemClock.uptimeMillis() + 200);
    }

    @Override // e.InterfaceC0281b
    public void b(Object obj) {
        C0280a c0280a = (C0280a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f2462a;
        proxyBillingActivityV2.getClass();
        Intent intent = c0280a.f4854b;
        int i3 = AbstractC0213o0.d(intent, "ProxyBillingActivityV2").f10046a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2537v;
        if (resultReceiver != null) {
            resultReceiver.send(i3, intent == null ? null : intent.getExtras());
        }
        int i4 = c0280a.f4853a;
        if (i4 != -1 || i3 != 0) {
            AbstractC0213o0.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // l.L
    public void c(MenuC1069j menuC1069j, MenuItemC1070k menuItemC1070k) {
        ((ViewOnKeyListenerC1066g) this.f2462a).f.removeCallbacksAndMessages(menuC1069j);
    }

    public JSONObject d(View view) {
        int currentModeType;
        JSONObject a3 = w1.b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC0086a.f1779a;
        try {
            a3.put("noOutputDevice", AbstractC1221a.f10457a[M.j.b((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : F2.b.f385g)] == 1);
        } catch (JSONException unused) {
        }
        return a3;
    }

    public void f(int i3, S1.m mVar) {
        io.flutter.plugin.editing.l lVar = (io.flutter.plugin.editing.l) this.f2462a;
        lVar.d();
        lVar.f = mVar;
        lVar.f9221e = new C0009j(2, i3);
        lVar.f9223h.e(lVar);
        D0.a aVar = mVar.f1446j;
        lVar.f9223h = new io.flutter.plugin.editing.h(aVar != null ? (S1.o) aVar.f262b : null, lVar.f9217a);
        lVar.e(mVar);
        lVar.f9224i = true;
        if (lVar.f9221e.f245b == 3) {
            lVar.f9231p = false;
        }
        lVar.f9228m = null;
        lVar.f9223h.a(lVar);
    }

    public void g(double d3, double d4, double[] dArr) {
        io.flutter.plugin.editing.l lVar = (io.flutter.plugin.editing.l) this.f2462a;
        lVar.getClass();
        double[] dArr2 = new double[4];
        boolean z3 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        V.f fVar = new V.f(z3, dArr, dArr2);
        fVar.a(d3, 0.0d);
        fVar.a(d3, d4);
        fVar.a(0.0d, d4);
        double d9 = lVar.f9217a.getContext().getResources().getDisplayMetrics().density;
        lVar.f9228m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    public void h(S1.o oVar) {
        S1.o oVar2;
        int i3;
        int i4;
        io.flutter.plugin.editing.l lVar = (io.flutter.plugin.editing.l) this.f2462a;
        View view = lVar.f9217a;
        if (!lVar.f9224i && (oVar2 = lVar.f9230o) != null && (i3 = oVar2.f1456d) >= 0 && (i4 = oVar2.f1457e) > i3) {
            int i5 = i4 - i3;
            int i6 = oVar.f1457e;
            int i7 = oVar.f1456d;
            boolean z3 = true;
            if (i5 == i6 - i7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= i5) {
                        z3 = false;
                        break;
                    } else if (oVar2.f1453a.charAt(i8 + i3) != oVar.f1453a.charAt(i8 + i7)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            lVar.f9224i = z3;
        }
        lVar.f9230o = oVar;
        lVar.f9223h.f(oVar);
        if (lVar.f9224i) {
            lVar.f9218b.restartInput(view);
            lVar.f9224i = false;
        }
    }

    @Override // T1.m
    public void onMethodCall(T1.l lVar, T1.n nVar) {
        Vibrator vibrator;
        boolean hasAmplitudeControl;
        boolean hasAmplitudeControl2;
        VibrationEffect createOneShot;
        VibrationEffect createOneShot2;
        VibrationEffect createWaveform;
        boolean hasAmplitudeControl3;
        VibrationEffect createWaveform2;
        VibrationEffect createWaveform3;
        String str = lVar.f1468a;
        str.getClass();
        vibrator = (Vibrator) ((io.flutter.plugin.editing.k) this.f2462a).f9216a;
        switch (str) {
            case "cancel":
                vibrator.cancel();
                ((S1.i) nVar).success(null);
                break;
            case "hasAmplitudeControl":
                if (Build.VERSION.SDK_INT >= 26) {
                    hasAmplitudeControl = vibrator.hasAmplitudeControl();
                    ((S1.i) nVar).success(Boolean.valueOf(hasAmplitudeControl));
                    break;
                } else {
                    ((S1.i) nVar).success(Boolean.FALSE);
                    break;
                }
            case "vibrate":
                int intValue = ((Integer) lVar.a("duration")).intValue();
                List list = (List) lVar.a("pattern");
                int intValue2 = ((Integer) lVar.a("repeat")).intValue();
                List list2 = (List) lVar.a("intensities");
                int intValue3 = ((Integer) lVar.a("amplitude")).intValue();
                if (list.size() > 0 && list2.size() > 0) {
                    int size = list.size();
                    long[] jArr = new long[size];
                    int size2 = list2.size();
                    int[] iArr = new int[size2];
                    for (int i3 = 0; i3 < size; i3++) {
                        jArr[i3] = ((Integer) list.get(i3)).intValue();
                    }
                    for (int i4 = 0; i4 < size2; i4++) {
                        iArr[i4] = ((Integer) list2.get(i4)).intValue();
                    }
                    if (vibrator.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            hasAmplitudeControl3 = vibrator.hasAmplitudeControl();
                            if (hasAmplitudeControl3) {
                                createWaveform3 = VibrationEffect.createWaveform(jArr, iArr, intValue2);
                                vibrator.vibrate(createWaveform3, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                            } else {
                                createWaveform2 = VibrationEffect.createWaveform(jArr, intValue2);
                                vibrator.vibrate(createWaveform2, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                            }
                        } else {
                            vibrator.vibrate(jArr, intValue2);
                        }
                    }
                } else if (list.size() > 0) {
                    int size3 = list.size();
                    long[] jArr2 = new long[size3];
                    for (int i5 = 0; i5 < size3; i5++) {
                        jArr2[i5] = ((Integer) list.get(i5)).intValue();
                    }
                    if (vibrator.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWaveform = VibrationEffect.createWaveform(jArr2, intValue2);
                            vibrator.vibrate(createWaveform, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        } else {
                            vibrator.vibrate(jArr2, intValue2);
                        }
                    }
                } else {
                    long j3 = intValue;
                    if (vibrator.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            hasAmplitudeControl2 = vibrator.hasAmplitudeControl();
                            if (hasAmplitudeControl2) {
                                createOneShot2 = VibrationEffect.createOneShot(j3, intValue3);
                                vibrator.vibrate(createOneShot2, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                            } else {
                                createOneShot = VibrationEffect.createOneShot(j3, -1);
                                vibrator.vibrate(createOneShot, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                            }
                        } else {
                            vibrator.vibrate(j3);
                        }
                    }
                }
                ((S1.i) nVar).success(null);
                break;
            case "hasCustomVibrationsSupport":
                ((S1.i) nVar).success(Boolean.TRUE);
                break;
            default:
                ((S1.i) nVar).a();
                break;
        }
    }

    public j(HashMap hashMap) {
        this.f2462a = Collections.unmodifiableMap(new HashMap(hashMap));
    }
}
