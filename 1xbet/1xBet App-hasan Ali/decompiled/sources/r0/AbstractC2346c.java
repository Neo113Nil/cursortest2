package r0;

import B.A;
import G1.E;
import G1.P;
import K0.N;
import M.p0;
import O3.g;
import O3.o;
import O3.s;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P0.w;
import R3.j;
import S3.C0398a;
import S3.C0402e;
import S3.C0414q;
import S3.V;
import S3.a0;
import W0.n;
import a.AbstractC0444a;
import a4.h;
import a4.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.Y;
import b0.m;
import b0.p;
import b4.C0511b;
import b4.C0512c;
import b4.C0513d;
import c4.AbstractC0540a;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.AbstractC0923e8;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import e2.AbstractC1922c;
import e2.AbstractC1933n;
import e2.C1921b;
import e2.InterfaceC1926g;
import f1.AbstractC1941c;
import game.betting133.sports1xbet.R;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import h0.C1989c;
import i0.C1997b;
import i0.C2001f;
import i0.M;
import i4.InterfaceC2015a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k0.C2022b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.z;
import m4.InterfaceC2104g;
import n.C0;
import n.E0;
import n.m0;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o4.AbstractC2223a;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import p1.AbstractC2242a;
import r3.AbstractC2349a;
import t1.C2412a;
import t3.AbstractC2425d;
import v.AbstractC2527w;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2346c {

    /* renamed from: a, reason: collision with root package name */
    public static C2001f f19084a;

    /* renamed from: b, reason: collision with root package name */
    public static C1997b f19085b;

    /* renamed from: c, reason: collision with root package name */
    public static C2022b f19086c;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f19087d;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f19088e;
    public static C2201e f;

    /* renamed from: g, reason: collision with root package name */
    public static C2201e f19089g;

    /* renamed from: h, reason: collision with root package name */
    public static C2201e f19090h;

    public static List A(Object obj) {
        List singletonList = Collections.singletonList(obj);
        l.e("singletonList(...)", singletonList);
        return singletonList;
    }

    public static void B(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            D0.d.h(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            D0.d.h(editorInfo, charSequence);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = charSequence.length();
        if (i7 < 0 || i5 > length) {
            D(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            D(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            D(editorInfo, charSequence, i7, i5);
            return;
        }
        int i9 = i5 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int min = Math.min(charSequence.length() - i5, i11 - Math.min(i7, (int) (i11 * 0.8d)));
        int min2 = Math.min(i7, i11 - min);
        int i12 = i7 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i12))) {
            i12++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i5 + min) - 1))) {
            min--;
        }
        int i13 = min2 + i10;
        D(editorInfo, i10 != i9 ? TextUtils.concat(charSequence.subSequence(i12, i12 + min2), charSequence.subSequence(i5, min + i5)) : charSequence.subSequence(i12, i13 + min + i12), min2, i13);
    }

    public static void C(EditorInfo editorInfo, boolean z3) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC2242a.b(editorInfo, z3);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z3);
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence, int i, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static void E(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0.a(view, charSequence);
            return;
        }
        E0 e02 = E0.f18142u;
        if (e02 != null && e02.f18144k == view) {
            E0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new E0(view, charSequence);
            return;
        }
        E0 e03 = E0.f18143v;
        if (e03 != null && e03.f18144k == view) {
            e03.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final ExtractedText F(w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f4679a.f2829l;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = wVar.f4680b;
        extractedText.selectionStart = N.e(j5);
        extractedText.selectionEnd = N.d(j5);
        extractedText.flags = !AbstractC2227e.A0(wVar.f4679a.f2829l, '\n') ? 1 : 0;
        return extractedText;
    }

    public static String G(long j5) {
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i5)) {
            return "CornerRadius.circular(" + AbstractC2425d.M(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC2425d.M(Float.intBitsToFloat(i)) + ", " + AbstractC2425d.M(Float.intBitsToFloat(i5)) + ')';
    }

    public static final void H(i4.e eVar, Object obj, AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel, C0315s c0315s, int i) {
        l.f("onPick", eVar);
        c0315s.Z(1220539449);
        if ((((c0315s.h(eVar) ? 4 : 2) | i | (c0315s.h(obj) ? 32 : 16) | 128) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                Y a5 = E1.a.a(c0315s);
                if (a5 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aquaTournamentCatalogViewModel = (AquaTournamentCatalogViewModel) G4.d.N(x.a(AquaTournamentCatalogViewModel.class), a5, null, a5 instanceof InterfaceC0482k ? ((InterfaceC0482k) a5).e() : D1.a.f923b, c0315s);
            } else {
                c0315s.S();
            }
            c0315s.r();
            j.d(null, X.e.d(156792481, new V(aquaTournamentCatalogViewModel, obj, AbstractC0329z.l(aquaTournamentCatalogViewModel.getFr_par_ame(), c0315s), eVar), c0315s), c0315s, 48);
        }
        AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel2 = aquaTournamentCatalogViewModel;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new g(eVar, obj, aquaTournamentCatalogViewModel2, i, 6);
        }
    }

    public static final void I(AquaCompetitionBundle aquaCompetitionBundle, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i) {
        c0315s.Z(502720644);
        if ((((c0315s.h(aquaCompetitionBundle) ? 4 : 2) | i | (c0315s.h(interfaceC2015a) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
            int selectNewesmeanstSeasonYear = AquaDisplayFormattersKt.selectNewesmeanstSeasonYear(aquaCompetitionBundle.getCamp_par_aigns());
            p b3 = androidx.compose.foundation.layout.c.b(m.f7161k, 1.0f);
            D.d dVar = j.f5218a;
            p0.a(androidx.compose.foundation.a.d(AbstractC0444a.n(b3, dVar), false, null, interfaceC2015a, 7), dVar, V3.a.f5962A, 4, 10, AbstractC2527w.a(1, i0.p.b(0.35f, V3.a.f5995z)), X.e.d(-12711457, new C0402e(selectNewesmeanstSeasonYear, 2, compe_par_tition, aquaCompetitionBundle), c0315s), c0315s, 14377392, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new o(i, 6, aquaCompetitionBundle, interfaceC2015a);
        }
    }

    public static Object J(i4.e eVar, Object obj, a4.c cVar) {
        l.f("<this>", eVar);
        h context = cVar.getContext();
        Object c0513d = context == i.f6649k ? new C0513d(cVar) : new b4.e(cVar, context);
        z.b(2, eVar);
        return eVar.invoke(obj, c0513d);
    }

    public static void K(Context context) {
        boolean z3;
        Object obj = U2.g.f5868b;
        if (((Boolean) AbstractC0923e8.f13237a.s()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (U2.g.f5868b) {
                        z3 = U2.g.f5869c;
                    }
                    if (z3) {
                        return;
                    }
                    E3.a l5 = new S2.i(context).l();
                    U2.j.h("Updating ad debug logging enablement.");
                    AbstractC1803xs.k(l5, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e3) {
                U2.j.j("Fail to determine debug setting.", e3);
            }
        }
    }

    public static final W0.e a(Context context) {
        float f5 = context.getResources().getConfiguration().fontScale;
        float f6 = context.getResources().getDisplayMetrics().density;
        X0.a a5 = X0.b.a(f5);
        if (a5 == null) {
            a5 = new n(f5);
        }
        return new W0.e(f6, f5, a5);
    }

    public static final void b(InterfaceC2104g interfaceC2104g, p pVar, A a5, i4.e eVar, C0315s c0315s, int i) {
        c0315s.Z(2002163445);
        if ((((c0315s.h(interfaceC2104g) ? 4 : 2) | i | (c0315s.f(pVar) ? 32 : 16) | (c0315s.f(a5) ? 256 : 128) | (c0315s.h(eVar) ? 2048 : 1024)) & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC2425d.c(X.e.d(-1488997347, new androidx.compose.foundation.lazy.layout.b(a5, pVar, eVar, AbstractC0329z.w(interfaceC2104g, c0315s)), c0315s), c0315s, 6);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new M4.h(interfaceC2104g, pVar, a5, eVar, i);
        }
    }

    public static final long c(float f5, float f6) {
        return (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final E d(Context context) {
        l.f("context", context);
        E e3 = new E(context);
        P p5 = e3.f1846v;
        p5.a(new H1.g(p5));
        e3.f1846v.a(new H1.i());
        e3.f1846v.a(new H1.o());
        return e3;
    }

    public static Y3.c e(Y3.c cVar) {
        cVar.h();
        cVar.f6150m = true;
        return cVar.f6149l > 0 ? cVar : Y3.c.f6147n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Object obj, C0315s c0315s, int i) {
        Object obj2;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(-1966715412);
        int i5 = (c0315s.h(obj) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (!l.a(str, "adMarkerQureka")) {
                if (l.a(str, "adMarkerAdx")) {
                    c0315s.X(1273580963);
                    c0315s.X(1273581892);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new B1.h(13);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    obj2 = obj;
                    c0315s2 = c0315s;
                    N4.b.M((InterfaceC2015a) M5, obj2, null, c0315s2, ((i5 << 3) & 112) | 6, 4);
                    c0315s2.q(false);
                } else {
                    obj2 = obj;
                    c0315s2 = c0315s;
                    c0315s2.X(826372608);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new C0398a(i, 5, obj2);
                    return;
                }
                return;
            }
            c0315s.X(1273579570);
            s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        obj2 = obj;
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void g(int i, int i5, int i6, InterfaceC2015a interfaceC2015a, InterfaceC2015a interfaceC2015a2, C0315s c0315s, int i7) {
        c0315s.Z(1654373612);
        if (((i7 | (c0315s.d(i) ? 4 : 2) | (c0315s.d(i5) ? 32 : 16) | (c0315s.d(i6) ? 256 : 128) | (c0315s.h(interfaceC2015a) ? 2048 : 1024) | (c0315s.h(interfaceC2015a2) ? 16384 : 8192)) & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.b(m.f7161k, 1.0f), 0.0f, 8, 1), j.f5219b, V3.a.f5962A, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.4f, V3.a.f5995z)), X.e.d(1060499121, new a0(interfaceC2015a, i > 1, interfaceC2015a2, i < i5, i6, i, i5), c0315s), c0315s, 14156214, 56);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0414q(i, i5, i6, interfaceC2015a, interfaceC2015a2, i7);
        }
    }

    public static y4.m h(y4.m mVar, y4.m mVar2) {
        C2202f c2202f = new C2202f(1);
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            String e3 = mVar.e(i);
            String g5 = mVar.g(i);
            if ((!"Warning".equalsIgnoreCase(e3) || !AbstractC2234l.x0(g5, "1", false)) && ("Content-Length".equalsIgnoreCase(e3) || "Content-Encoding".equalsIgnoreCase(e3) || "Content-Type".equalsIgnoreCase(e3) || !w(e3) || mVar2.c(e3) == null)) {
                c2202f.c(e3, g5);
            }
        }
        int size2 = mVar2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            String e5 = mVar2.e(i5);
            if (!"Content-Length".equalsIgnoreCase(e5) && !"Content-Encoding".equalsIgnoreCase(e5) && !"Content-Type".equalsIgnoreCase(e5) && w(e5)) {
                c2202f.c(e5, mVar2.g(i5));
            }
        }
        return c2202f.d();
    }

    public static final boolean i(C1989c c1989c, float f5, float f6) {
        return f5 <= c1989c.f17195c && c1989c.f17193a <= f5 && f6 <= c1989c.f17196d && c1989c.f17194b <= f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a4.c j(a4.c cVar, a4.c cVar2, i4.e eVar) {
        l.f("<this>", eVar);
        if (eVar instanceof AbstractC0540a) {
            return ((AbstractC0540a) eVar).create(cVar, cVar2);
        }
        h context = cVar2.getContext();
        return context == i.f6649k ? new C0511b(cVar2, cVar, eVar) : new C0512c(cVar2, context, eVar, cVar);
    }

    public static String k(String str) {
        byte[] decode = Base64.decode(str, 2);
        l.c(decode);
        if (decode.length == 0) {
            throw new IllegalArgumentException("Empty cipher body");
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        Charset charset = AbstractC2223a.f18653a;
        byte[] bytes = "tIPezdBep1MS7Rv0".getBytes(charset);
        l.e("getBytes(...)", bytes);
        byte[] bArr = new byte[16];
        X3.l.w0(0, Math.min(bytes.length, 16), 6, bytes, bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        byte[] bytes2 = "EWmtnFqsuyEtWnIl".getBytes(charset);
        l.e("getBytes(...)", bytes2);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] doFinal = cipher.doFinal(decode);
        l.c(doFinal);
        return new String(doFinal, charset);
    }

    public static String l(String str) {
        String str2;
        l.f("maskedText", str);
        if (!AbstractC2227e.H0(str)) {
            try {
                str2 = k(str);
            } catch (Exception e3) {
                Log.e("AquaPayloadCodec", "decodeMaskedText failed: " + e3.getMessage(), e3);
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean m(long j5, long j6) {
        return j5 == j6;
    }

    public static final C2201e n() {
        C2201e c2201e = f19087d;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.CalendarMonth", false);
        int i = o0.z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(19.0f, 4.0f);
        c2202f.j(-1.0f);
        c2202f.q(2.0f);
        c2202f.j(-2.0f);
        c2202f.r(2.0f);
        c2202f.i(8.0f);
        c2202f.q(2.0f);
        c2202f.i(6.0f);
        c2202f.r(2.0f);
        c2202f.i(5.0f);
        c2202f.f(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        c2202f.k(3.0f, 20.0f);
        c2202f.g(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        c2202f.j(14.0f);
        c2202f.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c2202f.q(6.0f);
        c2202f.f(21.0f, 4.9f, 20.1f, 4.0f, 19.0f, 4.0f);
        c2202f.e();
        c2202f.m(19.0f, 20.0f);
        c2202f.i(5.0f);
        c2202f.q(10.0f);
        c2202f.j(14.0f);
        c2202f.q(20.0f);
        c2202f.e();
        c2202f.m(9.0f, 14.0f);
        c2202f.i(7.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(14.0f);
        c2202f.e();
        c2202f.m(13.0f, 14.0f);
        c2202f.j(-2.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(14.0f);
        c2202f.e();
        c2202f.m(17.0f, 14.0f);
        c2202f.j(-2.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(14.0f);
        c2202f.e();
        c2202f.m(9.0f, 18.0f);
        c2202f.i(7.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(18.0f);
        c2202f.e();
        c2202f.m(13.0f, 18.0f);
        c2202f.j(-2.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(18.0f);
        c2202f.e();
        c2202f.m(17.0f, 18.0f);
        c2202f.j(-2.0f);
        c2202f.r(-2.0f);
        c2202f.j(2.0f);
        c2202f.q(18.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f19087d = b3;
        return b3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.f16958c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList o(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f1.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f1.i iVar = new f1.i(resources, theme);
        synchronized (f1.j.f16963c) {
            try {
                SparseArray sparseArray = (SparseArray) f1.j.f16962b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (f1.h) sparseArray.get(i)) != null) {
                    if (hVar.f16957b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.f16958c != 0) {
                            }
                            colorStateList2 = hVar.f16956a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = f1.j.f16961a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateList = AbstractC1941c.a(resources, resources.getXml(i), theme);
            } catch (Exception e3) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e3);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        f1.j.a(iVar, i, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable p(Context context, int i) {
        return m0.d().f(context, i);
    }

    public static final long q(KeyEvent keyEvent) {
        return AbstractC2425d.b(keyEvent.getKeyCode());
    }

    public static final C2201e r() {
        C2201e c2201e = f;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.LocationOn", false);
        int i = o0.z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 2.0f);
        c2202f.f(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        c2202f.g(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        c2202f.o(7.0f, -7.75f, 7.0f, -13.0f);
        c2202f.g(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        c2202f.e();
        c2202f.m(12.0f, 11.5f);
        c2202f.g(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        c2202f.o(1.12f, -2.5f, 2.5f, -2.5f);
        c2202f.o(2.5f, 1.12f, 2.5f, 2.5f);
        c2202f.o(-1.12f, 2.5f, -2.5f, 2.5f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f = b3;
        return b3;
    }

    public static final C2412a s(View view) {
        C2412a c2412a = (C2412a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c2412a != null) {
            return c2412a;
        }
        C2412a c2412a2 = new C2412a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c2412a2);
        return c2412a2;
    }

    public static final int t(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final C2201e u() {
        C2201e c2201e = f19090h;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Whatshot", false);
        int i = o0.z.f18603a;
        M m5 = new M(i0.p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(13.5f, 0.67f);
        c2202f.o(0.74f, 2.65f, 0.74f, 4.8f);
        c2202f.g(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        c2202f.g(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        c2202f.l(0.03f, -0.36f);
        c2202f.f(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        c2202f.g(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        c2202f.o(8.0f, -3.58f, 8.0f, -8.0f);
        c2202f.f(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        c2202f.e();
        c2202f.m(11.71f, 19.0f);
        c2202f.g(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        c2202f.g(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        c2202f.g(1.77f, -0.36f, 3.6f, -1.21f, 4.62f, -2.58f);
        c2202f.g(0.39f, 1.29f, 0.59f, 2.65f, 0.59f, 4.04f);
        c2202f.g(0.0f, 2.65f, -2.15f, 4.8f, -4.8f, 4.8f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f19090h = b3;
        return b3;
    }

    public static a4.c v(a4.c cVar) {
        a4.c<Object> intercepted;
        l.f("<this>", cVar);
        AbstractC0542c abstractC0542c = cVar instanceof AbstractC0542c ? (AbstractC0542c) cVar : null;
        return (abstractC0542c == null || (intercepted = abstractC0542c.intercepted()) == null) ? cVar : intercepted;
    }

    public static boolean w(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean x(String str) {
        C1921b c1921b = AbstractC1933n.f16912a;
        Set<InterfaceC1926g> unmodifiableSet = Collections.unmodifiableSet(AbstractC1922c.f16903c);
        HashSet hashSet = new HashSet();
        for (InterfaceC1926g interfaceC1926g : unmodifiableSet) {
            if (((AbstractC1922c) interfaceC1926g).f16904a.equals(str)) {
                hashSet.add(interfaceC1926g);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC1922c abstractC1922c = (AbstractC1922c) ((InterfaceC1926g) it.next());
            if (abstractC1922c.a() || abstractC1922c.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static n4.h z(i4.e eVar) {
        n4.h hVar = new n4.h();
        hVar.f18487m = j(hVar, hVar, eVar);
        return hVar;
    }
}
