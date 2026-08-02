package A0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0486o;
import c.ViewTreeObserverOnDrawListenerC0529h;
import d0.ViewOnAttachStateChangeListenerC1909d;
import g1.AbstractC1970d;
import game.betting133.sports1xbet.aqua_bootstrap.AquaLaunchBridgeActivity;
import java.nio.MappedByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k0.C2023c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.s;
import l3.C2054a;
import n.C2138i;
import o4.AbstractC2227e;
import org.json.JSONObject;
import r.C2343v;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import v.AbstractC2527w;

/* renamed from: A0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0049o implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f545k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f546l;

    public /* synthetic */ RunnableC0049o(int i, Object obj) {
        this.f545k = i;
        this.f546l = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [W3.e, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View findFocus;
        boolean z3;
        boolean z5;
        long[] jArr;
        boolean z6;
        long[] jArr2;
        Boolean bool = null;
        boolean z7 = true;
        switch (this.f545k) {
            case 0:
                F f = (F) this.f546l;
                f.f208K0 = false;
                MotionEvent motionEvent = f.f195C0;
                kotlin.jvm.internal.l.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                f.K(motionEvent);
                return;
            case 1:
                x0.J j5 = (x0.J) this.f546l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    j5.invoke();
                    return;
                } finally {
                }
            case 2:
                N n5 = (N) this.f546l;
                Trace.beginSection("measureAndLayout");
                try {
                    n5.f346d.x(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        n5.i();
                        Trace.endSection();
                        n5.f341L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                L.t.setRippleState$lambda$2((L.t) this.f546l);
                return;
            case 4:
                P0.z zVar = (P0.z) this.f546l;
                zVar.f4700n = null;
                View view = zVar.f4689a;
                boolean isFocused = view.isFocused();
                R.e eVar = zVar.f4699m;
                if (!isFocused && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eVar.h();
                    return;
                }
                Object[] objArr = eVar.f5106k;
                int i = eVar.f5108m;
                Boolean bool2 = null;
                for (int i5 = 0; i5 < i; i5++) {
                    P0.y yVar = (P0.y) objArr[i5];
                    int ordinal = yVar.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else {
                        if (ordinal != 2 && ordinal != 3) {
                            throw new D2.e();
                        }
                        if (!kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                            bool2 = Boolean.valueOf(yVar == P0.y.f4686m);
                        }
                    }
                    bool2 = bool;
                }
                eVar.h();
                boolean a5 = kotlin.jvm.internal.l.a(bool, Boolean.TRUE);
                v3.e eVar2 = zVar.f4690b;
                if (a5) {
                    ((InputMethodManager) eVar2.f20433m.getValue()).restartInput((View) eVar2.f20432l);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((C2023c) ((C2138i) eVar2.f20434n).f18249l).A();
                    } else {
                        ((C2023c) ((C2138i) eVar2.f20434n).f18249l).u();
                    }
                }
                if (kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) eVar2.f20433m.getValue()).restartInput((View) eVar2.f20432l);
                    return;
                }
                return;
            case 5:
                int i6 = AquaLaunchBridgeActivity.J;
                final AquaLaunchBridgeActivity aquaLaunchBridgeActivity = (AquaLaunchBridgeActivity) this.f546l;
                final O0.e eVar3 = new O0.e(5, aquaLaunchBridgeActivity);
                final Handler handler = new Handler(Looper.getMainLooper());
                final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                newSingleThreadExecutor.execute(new Runnable() { // from class: Q3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        String l5;
                        Context context = aquaLaunchBridgeActivity;
                        s sVar = new s();
                        try {
                            l5 = AbstractC2346c.l("xXvqaeVId4DneuWDX8KQTsV5rwWyjAzZXYD6STPQjF0ZUrjJIBUlNF/uSPUqe8CIY7h8lpeG2NBHBLF8D2PxveCNASSHfDJDMiSIJJxmvAt7khoSzAYtS8mkP/MSYtDP");
                        } catch (Exception e3) {
                            e3.getMessage();
                        }
                        if (l5 == null || AbstractC2227e.H0(l5)) {
                            throw new IllegalStateException("Config URL decrypt failed");
                        }
                        Object systemService = context.getSystemService("phone");
                        String str = "";
                        if (systemService instanceof TelephonyManager) {
                            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
                            l.e("getSimCountryIso(...)", simCountryIso);
                            String obj = AbstractC2227e.Q0(simCountryIso).toString();
                            if (obj.length() != 0) {
                                str = obj;
                            }
                        }
                        if (!AbstractC2227e.H0(l5) && !AbstractC2227e.H0(str)) {
                            l5 = l5 + (AbstractC2227e.B0(l5, "?") ? "&" : "?") + "language=" + str;
                        }
                        String L5 = AbstractC2349a.L(l5);
                        if (AbstractC2227e.H0(L5)) {
                            throw new IllegalStateException("Empty config body");
                        }
                        AbstractC2349a.v(new JSONObject(L5));
                        sVar.f17620k = true;
                        handler.post(new g(0, eVar3, sVar));
                        newSingleThreadExecutor.shutdown();
                    }
                });
                return;
            case 6:
                ((Z0.i) this.f546l).invoke();
                return;
            case 7:
                ((Z0.i) this.f546l).invoke();
                return;
            case 8:
                androidx.lifecycle.F f5 = (androidx.lifecycle.F) this.f546l;
                int i7 = f5.f7005l;
                C0493w c0493w = f5.f7009p;
                if (i7 == 0) {
                    z3 = true;
                    f5.f7006m = true;
                    c0493w.p(EnumC0486o.ON_PAUSE);
                } else {
                    z3 = true;
                }
                if (f5.f7004k == 0 && f5.f7006m) {
                    c0493w.p(EnumC0486o.ON_STOP);
                    f5.f7007n = z3;
                    return;
                }
                return;
            case 9:
                ((C0040k0) this.f546l).invoke();
                return;
            case 10:
                ViewTreeObserverOnDrawListenerC0529h viewTreeObserverOnDrawListenerC0529h = (ViewTreeObserverOnDrawListenerC0529h) this.f546l;
                Runnable runnable = viewTreeObserverOnDrawListenerC0529h.f7328l;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0529h.f7328l = null;
                    return;
                }
                return;
            case 11:
                a1.u.d((a1.u) this.f546l);
                return;
            case 12:
                ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d = (ViewOnAttachStateChangeListenerC1909d) this.f546l;
                boolean g5 = viewOnAttachStateChangeListenerC1909d.g();
                F f6 = viewOnAttachStateChangeListenerC1909d.f16832k;
                if (g5) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        f6.x(true);
                        C2343v c2343v = viewOnAttachStateChangeListenerC1909d.f16843v;
                        int[] iArr = c2343v.f19012b;
                        long[] jArr3 = c2343v.f19011a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j6 = jArr3[i8];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((255 & j6) < 128) {
                                            int i11 = iArr[(i8 << 3) + i10];
                                            if (!viewOnAttachStateChangeListenerC1909d.e().a(i11)) {
                                                z6 = z7;
                                                jArr2 = jArr3;
                                                viewOnAttachStateChangeListenerC1909d.f16835n.add(new d0.e(i11, viewOnAttachStateChangeListenerC1909d.f16842u, d0.f.f16852l, null));
                                                viewOnAttachStateChangeListenerC1909d.f16839r.q(W3.o.f6046a);
                                                j6 >>= 8;
                                                i10++;
                                                z7 = z6;
                                                jArr3 = jArr2;
                                            }
                                        }
                                        z6 = z7;
                                        jArr2 = jArr3;
                                        j6 >>= 8;
                                        i10++;
                                        z7 = z6;
                                        jArr3 = jArr2;
                                    }
                                    z5 = z7;
                                    jArr = jArr3;
                                    if (i9 == 8) {
                                    }
                                } else {
                                    z5 = z7;
                                    jArr = jArr3;
                                }
                                if (i8 != length) {
                                    i8++;
                                    z7 = z5;
                                    jArr3 = jArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC1909d.m(f6.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC1909d.f16844w);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC1909d.c(viewOnAttachStateChangeListenerC1909d.e());
                        viewOnAttachStateChangeListenerC1909d.q();
                        viewOnAttachStateChangeListenerC1909d.f16845x = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 13:
                ((M0.e) this.f546l).getClass();
                return;
            case 14:
                View view2 = (View) this.f546l;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            default:
                v1.q qVar = (v1.q) this.f546l;
                synchronized (qVar.f20365n) {
                    try {
                        if (qVar.f20369r == null) {
                            return;
                        }
                        try {
                            k1.i c5 = qVar.c();
                            int i12 = c5.f;
                            if (i12 == 2) {
                                synchronized (qVar.f20365n) {
                                }
                            }
                            if (i12 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                            }
                            try {
                                int i13 = j1.g.f17490a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C2054a c2054a = qVar.f20364m;
                                Context context = qVar.f20362k;
                                c2054a.getClass();
                                k1.i[] iVarArr = {c5};
                                G4.l lVar = AbstractC1970d.f17079a;
                                AbstractC2425d.k("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface r5 = AbstractC1970d.f17079a.r(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer L5 = N4.b.L(qVar.f20362k, c5.f17572a);
                                    if (L5 == null || r5 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        m2.g gVar = new m2.g(r5, AbstractC2527w.f(L5));
                                        Trace.endSection();
                                        synchronized (qVar.f20365n) {
                                            try {
                                                v1.j jVar = qVar.f20369r;
                                                if (jVar != null) {
                                                    jVar.d(gVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        qVar.a();
                                        return;
                                    } finally {
                                        int i14 = j1.g.f17490a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (qVar.f20365n) {
                                try {
                                    v1.j jVar2 = qVar.f20369r;
                                    if (jVar2 != null) {
                                        jVar2.c(th);
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC0049o(M0.e eVar, int i) {
        this.f545k = 13;
        this.f546l = eVar;
    }
}
