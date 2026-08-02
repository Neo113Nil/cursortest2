package N4;

import A0.AbstractC0011a1;
import A0.C0009a;
import A0.C0022e0;
import A0.C0060u;
import B.C0079h;
import E.B;
import G1.C0140k;
import G1.y;
import G4.d;
import H1.n;
import K0.C0196a;
import K0.C0204i;
import L4.C;
import L4.C0220c;
import L4.C0221d;
import L4.G;
import L4.H;
import L4.I;
import L4.x;
import M.p0;
import O3.f;
import O3.g;
import O3.k;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.r;
import Q.K;
import R3.j;
import S3.C0398a;
import S3.C0414q;
import S3.C0415s;
import S3.C0420x;
import W3.o;
import X.e;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.TextView;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0490t;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import b0.m;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.Pq;
import com.google.android.gms.internal.ads.WE;
import d0.ViewOnAttachStateChangeListenerC1909d;
import d1.h;
import d1.i;
import f2.C1946d;
import f2.C1947e;
import game.betting133.sports1xbet.R;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import h0.C1989c;
import h0.C1990d;
import i0.M;
import i0.p;
import i4.InterfaceC2015a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import n.AbstractC2107A;
import n.C2111E;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.C2205i;
import o0.C2209m;
import o0.C2212p;
import o0.s;
import o0.z;
import o4.AbstractC2227e;
import o4.AbstractC2233k;
import o4.AbstractC2234l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C2268h;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import u.AbstractC2462i;
import v.AbstractC2527w;
import x0.O;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.C2681E;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static C2201e f3793a;

    /* renamed from: b, reason: collision with root package name */
    public static C2201e f3794b;

    /* renamed from: c, reason: collision with root package name */
    public static C2201e f3795c;

    /* renamed from: d, reason: collision with root package name */
    public static C2201e f3796d;

    /* renamed from: e, reason: collision with root package name */
    public static C2201e f3797e;

    public static l1.b A(C2111E c2111e) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new l1.b(i.l(c2111e));
        }
        TextPaint textPaint = new TextPaint(c2111e.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c2111e.getBreakStrategy();
        int hyphenationFrequency = c2111e.getHyphenationFrequency();
        if (c2111e.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c2111e.getInputType() & 15) != 3) {
                boolean z3 = c2111e.getLayoutDirection() == 1;
                switch (c2111e.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(i.d(h.c(c2111e.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new l1.b(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final void B(AquaMatchMoment aquaMatchMoment, C0315s c0315s, int i) {
        c0315s.Z(1822964028);
        if ((((c0315s.f(aquaMatchMoment) ? 4 : 2) | i) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(c.b(m.f7161k, 1.0f), j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, p.b(0.25f, V3.a.f5995z)), e.d(-1476872255, new r(7, aquaMatchMoment), c0315s), c0315s, 14377398, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0196a(i, 5, aquaMatchMoment);
        }
    }

    public static final void C(final List list, final b0.p pVar, C0315s c0315s, final int i) {
        final int i5 = 1;
        final int i6 = 0;
        c0315s.Z(-871693510);
        if ((((c0315s.h(list) ? 4 : 2) | i | (c0315s.f(pVar) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.X(1632445650);
            if (list.isEmpty()) {
                b0.p c5 = pVar.c(c.f6868c);
                O e3 = AbstractC2710l.e(b0.c.f7141o, false);
                int p5 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l5 = c0315s.l();
                b0.p c6 = b0.a.c(c0315s, c5);
                InterfaceC2753j.f21834j.getClass();
                C2768z c2768z = C2752i.f21830b;
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(c2768z);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
                AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                C2751h c2751h = C2752i.f;
                if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                    AbstractC2107A.y(p5, c0315s, p5, c2751h);
                }
                AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
                j.g("No events", null, V3.a.f, V3.a.f5978h, null, c0315s, 3462, 18);
                c0315s.q(true);
                c0315s.q(false);
                C0326x0 s2 = c0315s.s();
                if (s2 != null) {
                    s2.f4578d = new i4.e(list, pVar, i, i6) { // from class: S3.r

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f5542k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ List f5543l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ b0.p f5544m;

                        {
                            this.f5542k = i6;
                        }

                        @Override // i4.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.f5542k;
                            C0315s c0315s2 = (C0315s) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    N4.b.C(this.f5543l, this.f5544m, c0315s2, AbstractC0329z.B(1));
                                    break;
                                default:
                                    N4.b.C(this.f5543l, this.f5544m, c0315s2, AbstractC0329z.B(1));
                                    break;
                            }
                            return W3.o.f6046a;
                        }
                    };
                    return;
                }
                return;
            }
            c0315s.q(false);
            b0.p c7 = pVar.c(c.f6868c);
            float f = 8;
            C2681E a5 = androidx.compose.foundation.layout.b.a(0.0f, f, 1);
            C2700b c2700b = AbstractC2706h.f21534a;
            C2703e c2703e = new C2703e(f);
            c0315s.X(1632459482);
            boolean h3 = c0315s.h(list);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new O0.e(6, list);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            d.c(c7, null, a5, c2703e, null, null, false, (i4.c) M5, c0315s, 24960);
        }
        C0326x0 s5 = c0315s.s();
        if (s5 != null) {
            s5.f4578d = new i4.e(list, pVar, i, i5) { // from class: S3.r

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f5542k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ List f5543l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ b0.p f5544m;

                {
                    this.f5542k = i5;
                }

                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = this.f5542k;
                    C0315s c0315s2 = (C0315s) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            N4.b.C(this.f5543l, this.f5544m, c0315s2, AbstractC0329z.B(1));
                            break;
                        default:
                            N4.b.C(this.f5543l, this.f5544m, c0315s2, AbstractC0329z.B(1));
                            break;
                    }
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static int D(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(L1.a.l(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static int E(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(L1.a.l(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int F(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(L1.a.l(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int G(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(L1.a.l(i, "Could not convert ", " to State"));
    }

    public static final boolean H(AssertionError assertionError) {
        Logger logger = x.f3123a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC2227e.B0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean I(C1990d c1990d) {
        long j5 = c1990d.f17201e;
        return (j5 >>> 32) == (4294967295L & j5) && j5 == c1990d.f && j5 == c1990d.f17202g && j5 == c1990d.f17203h;
    }

    public static final void J(String str, String str2, LinkedHashMap linkedHashMap, b0.p pVar, C0315s c0315s, int i) {
        String str3;
        String str4;
        Object obj;
        b0.p pVar2;
        int i5 = 2;
        c0315s.Z(-1113670964);
        int i6 = i | (c0315s.f(str) ? 4 : 2) | (c0315s.f(str2) ? 32 : 16) | (c0315s.h(linkedHashMap) ? 256 : 128) | (c0315s.f(pVar) ? 2048 : 1024);
        if ((i6 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
            str3 = str;
            str4 = str2;
            obj = linkedHashMap;
            pVar2 = pVar;
        } else {
            c0315s.X(-1065276029);
            if (linkedHashMap.isEmpty()) {
                b0.p c5 = pVar.c(c.f6868c);
                O e3 = AbstractC2710l.e(b0.c.f7141o, false);
                int p5 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l5 = c0315s.l();
                b0.p c6 = b0.a.c(c0315s, c5);
                InterfaceC2753j.f21834j.getClass();
                C2768z c2768z = C2752i.f21830b;
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(c2768z);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
                AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                C2751h c2751h = C2752i.f;
                if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                    AbstractC2107A.y(p5, c0315s, p5, c2751h);
                }
                AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
                j.g("No data", null, V3.a.f, V3.a.f5975d, null, c0315s, 3462, 18);
                c0315s.q(true);
                c0315s.q(false);
                C0326x0 s2 = c0315s.s();
                if (s2 != null) {
                    s2.f4578d = new C0415s(str, str2, linkedHashMap, pVar, i, 0);
                    return;
                }
                return;
            }
            str3 = str;
            str4 = str2;
            obj = linkedHashMap;
            pVar2 = pVar;
            boolean z3 = true;
            c0315s.q(false);
            b0.p c7 = pVar2.c(c.f6868c);
            float f = 8;
            C2681E a5 = androidx.compose.foundation.layout.b.a(0.0f, f, 1);
            C2700b c2700b = AbstractC2706h.f21534a;
            C2703e c2703e = new C2703e(f);
            c0315s.X(-1065260936);
            boolean z5 = (i6 & 14) == 4;
            if ((i6 & 112) != 32) {
                z3 = false;
            }
            boolean h3 = z3 | z5 | c0315s.h(obj);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new B1.b(obj, str3, str4, i5);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            d.c(c7, null, a5, c2703e, null, null, false, (i4.c) M5, c0315s, 24960);
        }
        C0326x0 s5 = c0315s.s();
        if (s5 != null) {
            s5.f4578d = new C0415s(str3, str4, obj, pVar2, i, 1);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:21|(2:22|23)|(11:25|26|(1:28)(1:42)|29|30|31|(1:33)|(1:36)|37|(1:39)|40)|44|26|(0)(0)|29|30|31|(0)|(0)|37|(0)|40) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070 A[Catch: NumberFormatException -> 0x0078, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0078, blocks: (B:31:0x006a, B:33:0x0070), top: B:30:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K(String str, String str2, String str3, C0315s c0315s, int i) {
        Float f;
        String v02;
        float f5;
        c0315s.Z(937801746);
        if (((i | (c0315s.f(str) ? 4 : 2) | (c0315s.f(str2) ? 32 : 16) | (c0315s.f(str3) ? 256 : 128)) & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            String v03 = AbstractC2234l.v0(str2, "%", "");
            Float f6 = null;
            if (AbstractC2233k.q0(v03)) {
                f = Float.valueOf(Float.parseFloat(v03));
                float floatValue = f == null ? f.floatValue() : 0.0f;
                v02 = AbstractC2234l.v0(str3, "%", "");
                if (AbstractC2233k.q0(v02)) {
                    f6 = Float.valueOf(Float.parseFloat(v02));
                }
                float floatValue2 = f6 != null ? f6.floatValue() : 0.0f;
                f5 = floatValue + floatValue2;
                if (f5 < 1.0f) {
                    f5 = 1.0f;
                }
                p0.a(c.b(m.f7161k, 1.0f), j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, p.b(0.25f, V3.a.f5995z)), e.d(-519001769, new C0420x(str2, str, str3, floatValue, f5, floatValue2), c0315s), c0315s, 14377398, 8);
            }
            f = null;
            if (f == null) {
            }
            v02 = AbstractC2234l.v0(str3, "%", "");
            if (AbstractC2233k.q0(v02)) {
            }
            if (f6 != null) {
            }
            f5 = floatValue + floatValue2;
            if (f5 < 1.0f) {
            }
            p0.a(c.b(m.f7161k, 1.0f), j.f5218a, V3.a.f5962A, 2, 10, AbstractC2527w.a(1, p.b(0.25f, V3.a.f5995z)), e.d(-519001769, new C0420x(str2, str, str3, floatValue, f5, floatValue2), c0315s), c0315s, 14377398, 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new g(str, str2, str3, i, 2);
        }
    }

    public static MappedByteBuffer L(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final void M(InterfaceC2015a interfaceC2015a, Object obj, m mVar, C0315s c0315s, int i, int i5) {
        int i6;
        Object obj2;
        m mVar2;
        l.f("onUserTap", interfaceC2015a);
        c0315s.Z(1944212269);
        if ((i & 6) == 0) {
            i6 = i | (c0315s.h(interfaceC2015a) ? 4 : 2);
        } else {
            i6 = i;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= c0315s.h(obj) ? 32 : 16;
        }
        int i8 = i6 | 384;
        if ((i8 & 147) == 146 && c0315s.B()) {
            c0315s.S();
            obj2 = obj;
            mVar2 = mVar;
        } else {
            Object obj3 = i7 != 0 ? o.f6046a : obj;
            m mVar3 = m.f7161k;
            Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
            c0315s.X(635805391);
            boolean f = c0315s.f(context);
            Object M5 = c0315s.M();
            Object obj4 = C0302l.f4480a;
            if (f || M5 == obj4) {
                M5 = new O3.j(context);
                c0315s.i0(M5);
            }
            Object obj5 = (O3.j) M5;
            c0315s.q(false);
            c0315s.X(635808288);
            Object M6 = c0315s.M();
            if (M6 == obj4) {
                M6 = AbstractC0329z.t(null);
                c0315s.i0(M6);
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M6;
            c0315s.q(false);
            c0315s.X(635811637);
            boolean h3 = ((i8 & 14) == 4) | c0315s.h(obj5);
            Object M7 = c0315s.M();
            if (h3 || M7 == obj4) {
                M7 = new B1.b(obj5, interfaceC2015a, interfaceC0289e0, 1);
                c0315s.i0(M7);
            }
            c0315s.q(false);
            AbstractC0329z.d(obj5, obj3, (i4.c) M7, c0315s);
            b0.p g5 = androidx.compose.foundation.layout.b.g(c.b(mVar3, 1.0f), 8, 4);
            c0315s.X(635827447);
            Object M8 = c0315s.M();
            if (M8 == obj4) {
                M8 = new C0204i(27);
                c0315s.i0(M8);
            }
            i4.c cVar = (i4.c) M8;
            c0315s.q(false);
            c0315s.X(635829875);
            boolean h4 = c0315s.h(context);
            Object M9 = c0315s.M();
            if (h4 || M9 == obj4) {
                M9 = new f(1, context, interfaceC0289e0);
                c0315s.i0(M9);
            }
            c0315s.q(false);
            androidx.compose.ui.viewinterop.a.b(cVar, g5, (i4.c) M9, c0315s, 6, 0);
            obj2 = obj3;
            mVar2 = mVar3;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new k(interfaceC2015a, obj2, mVar2, i, i5);
        }
    }

    public static final W0.k N(C1989c c1989c) {
        return new W0.k(Math.round(c1989c.f17193a), Math.round(c1989c.f17194b), Math.round(c1989c.f17195c), Math.round(c1989c.f17196d));
    }

    public static void Q(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            i.o(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void R(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i5);
        }
    }

    public static void S(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final void T(K k5, int i, Object obj) {
        k5.f4812j[(k5.f4813k - k5.f[k5.f4810g - 1].f4809b) + i] = obj;
    }

    public static final void U(K k5, int i, Object obj, int i5, Object obj2) {
        int i6 = k5.f4813k - k5.f[k5.f4810g - 1].f4809b;
        Object[] objArr = k5.f4812j;
        objArr[i + i6] = obj;
        objArr[i6 + i5] = obj2;
    }

    public static final C0220c V(Socket socket) {
        Logger logger = x.f3123a;
        H h3 = new H(socket);
        OutputStream outputStream = socket.getOutputStream();
        l.e("getOutputStream(...)", outputStream);
        return new C0220c(0, h3, new C0220c(1, outputStream, h3));
    }

    public static final C0221d W(InputStream inputStream) {
        Logger logger = x.f3123a;
        l.f("<this>", inputStream);
        return new C0221d(inputStream, new L4.K());
    }

    public static final C0221d X(Socket socket) {
        Logger logger = x.f3123a;
        H h3 = new H(socket);
        InputStream inputStream = socket.getInputStream();
        l.e("getInputStream(...)", inputStream);
        return new C0221d(h3, new C0221d(inputStream, h3));
    }

    public static int Y(int i) {
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return 0;
        }
        int i5 = 1;
        if (b3 != 1) {
            i5 = 2;
            if (b3 != 2) {
                i5 = 3;
                if (b3 != 3) {
                    i5 = 4;
                    if (b3 != 4) {
                        if (b3 == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + AbstractC0467k.F(i) + " to int");
                    }
                }
            }
        }
        return i5;
    }

    public static final double Z(long j5) {
        return ((j5 >>> 11) * 2048) + (j5 & 2047);
    }

    public static final void a(H1.o oVar, C0315s c0315s, int i) {
        H1.o oVar2;
        c0315s.Z(294589392);
        int i5 = (c0315s.f(oVar) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
            oVar2 = oVar;
        } else {
            Y.d c5 = Y.k.c(c0315s);
            InterfaceC0289e0 l5 = AbstractC0329z.l(oVar.b().f1920e, c0315s);
            List list = (List) l5.getValue();
            boolean booleanValue = ((Boolean) c0315s.j(AbstractC0011a1.f462a)).booleanValue();
            boolean f = c0315s.f(list);
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            Object obj2 = M5;
            if (f || M5 == obj) {
                Z.p pVar = new Z.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C0140k c0140k = (C0140k) obj3;
                    if (booleanValue || c0140k.f1905r.f7068g.compareTo(EnumC0487p.f7061n) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                pVar.addAll(arrayList);
                c0315s.i0(pVar);
                obj2 = pVar;
            }
            Z.p pVar2 = (Z.p) obj2;
            b(pVar2, (List) l5.getValue(), c0315s, 0);
            InterfaceC0289e0 l6 = AbstractC0329z.l(oVar.b().f, c0315s);
            Object M6 = c0315s.M();
            if (M6 == obj) {
                M6 = new Z.p();
                c0315s.i0(M6);
            }
            Z.p pVar3 = (Z.p) M6;
            c0315s.X(1361037007);
            ListIterator listIterator = pVar2.listIterator();
            while (true) {
                Y3.a aVar = (Y3.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                C0140k c0140k2 = (C0140k) aVar.next();
                y yVar = c0140k2.f1899l;
                l.d("null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination", yVar);
                n nVar = (n) yVar;
                boolean h3 = c0315s.h(c0140k2) | ((i5 & 14) == 4);
                Object M7 = c0315s.M();
                if (h3 || M7 == obj) {
                    M7 = new C0060u(6, oVar, c0140k2);
                    c0315s.i0(M7);
                }
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M7;
                Z.p pVar4 = pVar3;
                H1.o oVar3 = oVar;
                pVar3 = pVar4;
                AbstractC2349a.c(interfaceC2015a, nVar.f2229t, e.d(1129586364, new H1.k(c0140k2, oVar3, c5, pVar4, nVar), c0315s), c0315s, 384);
                oVar = oVar3;
            }
            oVar2 = oVar;
            c0315s.q(false);
            Set set = (Set) l6.getValue();
            boolean f5 = c0315s.f(l6) | ((i5 & 14) == 4);
            Object M8 = c0315s.M();
            if (f5 || M8 == obj) {
                M8 = new H1.l(l6, oVar2, pVar3, null);
                c0315s.i0(M8);
            }
            AbstractC0329z.f(set, pVar3, (i4.e) M8, c0315s);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 5, oVar2);
        }
    }

    public static Bundle a0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        for (int i5 = 0; obj == null && i5 < length; i5++) {
                            obj = !jSONArray.isNull(i5) ? jSONArray.opt(i5) : null;
                        }
                        if (obj == null) {
                            U2.j.i("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? a0(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            U2.j.i("JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, a0((JSONObject) opt));
                } else {
                    U2.j.i("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static final void b(Z.p pVar, List list, C0315s c0315s, int i) {
        c0315s.Z(1537894851);
        if ((((c0315s.h(pVar) ? 4 : 2) | i | (c0315s.h(list) ? 32 : 16)) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            boolean booleanValue = ((Boolean) c0315s.j(AbstractC0011a1.f462a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0140k c0140k = (C0140k) it.next();
                C0493w c0493w = c0140k.f1905r;
                boolean g5 = c0315s.g(booleanValue) | c0315s.h(pVar) | c0315s.h(c0140k);
                Object M5 = c0315s.M();
                if (g5 || M5 == C0302l.f4480a) {
                    M5 = new B(c0140k, pVar, booleanValue);
                    c0315s.i0(M5);
                }
                AbstractC0329z.c(c0493w, (i4.c) M5, c0315s);
            }
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 5, pVar, list);
        }
    }

    public static List b0(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static final C1990d c(float f, float f5, float f6, float f7, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new C1990d(f, f5, f6, f7, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static ArrayList c0(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static final void d(b0.p pVar, X.d dVar, C0315s c0315s, int i) {
        c0315s.Z(-2105228848);
        if ((((c0315s.f(pVar) ? 4 : 2) | i) & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            I.K k5 = I.K.f2411a;
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, pVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, k5);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            dVar.invoke(c0315s, 6);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 8, pVar, dVar);
        }
    }

    public static JSONArray d0(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(d0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(f0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static JSONObject e0(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static final int f(int i, R.e eVar) {
        int i5 = eVar.f5108m - 1;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = ((i5 - i6) / 2) + i6;
            Object[] objArr = eVar.f5106k;
            int i8 = ((C0079h) objArr[i7]).f675a;
            if (i8 != i) {
                if (i8 < i) {
                    i6 = i7 + 1;
                    if (i < ((C0079h) objArr[i6]).f675a) {
                    }
                } else {
                    i5 = i7 - 1;
                }
            }
            return i7;
        }
        return i6;
    }

    public static JSONObject f0(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, d0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, f0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static final void g(B4.a aVar, B4.c cVar, String str) {
        B4.d.f765h.getClass();
        B4.d.f766j.fine(cVar.f761b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f755a);
    }

    public static void g0(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h0(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    g0(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e3) {
            throw new IOException(e3);
        }
    }

    public static final b0.p h(b0.p pVar, float f) {
        return f == 1.0f ? pVar : androidx.compose.ui.graphics.a.c(pVar, f, 0.0f, null, 520187);
    }

    public static void h0(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h0(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    g0(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e3) {
            throw new IOException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(L l5, AbstractC0542c abstractC0542c) {
        H2.b bVar;
        int i;
        L l6;
        w wVar;
        Throwable th;
        InterfaceC0490t interfaceC0490t;
        InterfaceC0490t interfaceC0490t2;
        if (abstractC0542c instanceof H2.b) {
            bVar = (H2.b) abstractC0542c;
            int i5 = bVar.f2281n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f2281n = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f2280m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = bVar.f2281n;
                o oVar = o.f6046a;
                if (i != 0) {
                    G4.l.N(obj);
                    if (l5.h().compareTo(EnumC0487p.f7061n) >= 0) {
                        return oVar;
                    }
                    w wVar2 = new w();
                    try {
                        bVar.f2278k = l5;
                        bVar.f2279l = wVar2;
                        bVar.f2281n = 1;
                        C2268h c2268h = new C2268h(1, AbstractC2346c.v(bVar));
                        c2268h.r();
                        H2.c cVar = new H2.c(c2268h);
                        wVar2.f17624k = cVar;
                        l5.a(cVar);
                        if (c2268h.q() == enumC0510a) {
                            return enumC0510a;
                        }
                        l6 = l5;
                        wVar = wVar2;
                    } catch (Throwable th2) {
                        l6 = l5;
                        wVar = wVar2;
                        th = th2;
                        interfaceC0490t = (InterfaceC0490t) wVar.f17624k;
                        if (interfaceC0490t != null) {
                            l6.k(interfaceC0490t);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = bVar.f2279l;
                    l6 = bVar.f2278k;
                    try {
                        G4.l.N(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC0490t = (InterfaceC0490t) wVar.f17624k;
                        if (interfaceC0490t != null) {
                        }
                        throw th;
                    }
                }
                interfaceC0490t2 = (InterfaceC0490t) wVar.f17624k;
                if (interfaceC0490t2 != null) {
                    l6.k(interfaceC0490t2);
                }
                return oVar;
            }
        }
        bVar = new H2.b(abstractC0542c);
        Object obj2 = bVar.f2280m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = bVar.f2281n;
        o oVar2 = o.f6046a;
        if (i != 0) {
        }
        interfaceC0490t2 = (InterfaceC0490t) wVar.f17624k;
        if (interfaceC0490t2 != null) {
        }
        return oVar2;
    }

    public static String i0(Pq pq) {
        if (pq == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            k0(jsonWriter, pq);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e3) {
            U2.j.g("Error when writing JSON.", e3);
            return null;
        }
    }

    public static final L4.B j(G g5) {
        l.f("<this>", g5);
        return new L4.B(g5);
    }

    public static JSONObject j0(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static final C k(I i) {
        l.f("<this>", i);
        return new C(i);
    }

    public static void k0(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Pq) {
            h0(jsonWriter, ((Pq) obj).f11129d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k0(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                k0(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0043 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1947e l(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e3;
        C1947e c1947e = new C1947e();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                                c1947e.f16991a.add(new C1946d(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                            }
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                            byteArrayInputStream.close();
                        } catch (IOException e6) {
                            e3 = e6;
                            e3.printStackTrace();
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            byteArrayInputStream.close();
                            return c1947e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e10) {
                    objectInputStream = null;
                    e3 = e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        return c1947e;
    }

    public static Object m(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static int n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean o(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean p5 = p(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return p5;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean p(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static S q(Class cls) {
        l.f("modelClass", cls);
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                l.c(newInstance);
                return (S) newInstance;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        H0.o oVar;
        H0.n nVar;
        i4.c cVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse r5 = WE.r(longSparseArray.get(keyAt));
            if (r5 != null && value != null && text != null && (oVar = (H0.o) viewOnAttachStateChangeListenerC1909d.e().b((int) keyAt)) != null && (nVar = oVar.f2117a) != null) {
                Object g5 = nVar.f2114d.f2103k.g(H0.i.f2087k);
                if (g5 == null) {
                    g5 = null;
                }
                H0.a aVar = (H0.a) g5;
                if (aVar != null && (cVar = (i4.c) aVar.f2063b) != null) {
                }
            }
        }
    }

    public static final void s(InterfaceC2015a interfaceC2015a, InterfaceC2015a interfaceC2015a2, C0315s c0315s, int i) {
        InterfaceC2015a interfaceC2015a3;
        InterfaceC2015a interfaceC2015a4;
        C0315s c0315s2 = c0315s;
        l.f("onMetrics", interfaceC2015a);
        l.f("onTimeline", interfaceC2015a2);
        c0315s2.Z(-1367724633);
        int i5 = (c0315s2.h(interfaceC2015a) ? 4 : 2) | i | (c0315s2.h(interfaceC2015a2) ? 32 : 16);
        if ((i5 & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
            interfaceC2015a3 = interfaceC2015a;
            interfaceC2015a4 = interfaceC2015a2;
        } else {
            m mVar = m.f7161k;
            b0.p b3 = c.b(mVar, 1.0f);
            C2700b c2700b = AbstractC2706h.f21534a;
            C2686J a5 = AbstractC2685I.a(new C2703e(10), b0.c.f7146t, c0315s2, 6);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, b3);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, C2752i.f21833e, a5);
            AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s2.f4530S || !l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h);
            }
            AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
            C2201e c2201e = AbstractC0444a.f6357a;
            if (c2201e == null) {
                C2200d c2200d = new C2200d("Filled.BarChart", false);
                int i6 = z.f18603a;
                long j5 = p.f17289b;
                M m5 = new M(j5);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new C2209m(4.0f, 9.0f));
                arrayList.add(new C2212p(4.0f));
                arrayList.add(new s(11.0f));
                arrayList.add(new C2212p(-4.0f));
                C2205i c2205i = C2205i.f18558b;
                arrayList.add(c2205i);
                C2200d.a(c2200d, arrayList, m5);
                M m6 = new M(j5);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new C2209m(16.0f, 13.0f));
                arrayList2.add(new C2212p(4.0f));
                arrayList2.add(new s(7.0f));
                arrayList2.add(new C2212p(-4.0f));
                arrayList2.add(c2205i);
                C2200d.a(c2200d, arrayList2, m6);
                M m7 = new M(j5);
                ArrayList arrayList3 = new ArrayList(32);
                arrayList3.add(new C2209m(10.0f, 4.0f));
                arrayList3.add(new C2212p(4.0f));
                arrayList3.add(new s(16.0f));
                arrayList3.add(new C2212p(-4.0f));
                arrayList3.add(c2205i);
                C2200d.a(c2200d, arrayList3, m7);
                c2201e = c2200d.b();
                AbstractC0444a.f6357a = c2201e;
            }
            u("STATS", c2201e, V3.a.f5975d, interfaceC2015a, AbstractC2107A.C(mVar, 1.0f), c0315s2, ((i5 << 9) & 7168) | 390);
            interfaceC2015a3 = interfaceC2015a;
            c0315s2 = c0315s;
            interfaceC2015a4 = interfaceC2015a2;
            u("TIMELINE", AbstractC0444a.O(), V3.a.f5978h, interfaceC2015a4, AbstractC2107A.C(mVar, 1.0f), c0315s2, ((i5 << 6) & 7168) | 390);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new O3.o(i, 3, interfaceC2015a3, interfaceC2015a4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Object obj, C0315s c0315s, int i) {
        Object obj2;
        C0315s c0315s2;
        C0326x0 s2;
        c0315s.Z(2023068131);
        int i5 = (c0315s.h(obj) ? 4 : 2) | i;
        if ((i5 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            String str = AbstractC2349a.f19098g;
            if (str.length() == 0) {
                C0326x0 s5 = c0315s.s();
                if (s5 != null) {
                    s5.f4578d = new C0398a(i, 1, obj);
                    return;
                }
                return;
            }
            if (!str.equals("adMarkerQureka")) {
                if (str.equals("adMarkerAdx")) {
                    c0315s.X(-1180039699);
                    c0315s.X(-1180038770);
                    Object M5 = c0315s.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = new B1.h(13);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    obj2 = obj;
                    c0315s2 = c0315s;
                    M((InterfaceC2015a) M5, obj2, null, c0315s2, ((i5 << 3) & 112) | 6, 4);
                    c0315s2.q(false);
                } else {
                    obj2 = obj;
                    c0315s2 = c0315s;
                    c0315s2.X(2073543414);
                    c0315s2.q(false);
                }
                s2 = c0315s2.s();
                if (s2 == null) {
                    s2.f4578d = new C0398a(i, 2, obj2);
                    return;
                }
                return;
            }
            c0315s.X(-1180041092);
            O3.s.f4101a.e(6, c0315s);
            c0315s.q(false);
        }
        obj2 = obj;
        c0315s2 = c0315s;
        s2 = c0315s2.s();
        if (s2 == null) {
        }
    }

    public static final void u(final String str, final C2201e c2201e, final long j5, final InterfaceC2015a interfaceC2015a, final b0.p pVar, C0315s c0315s, final int i) {
        int i5;
        c0315s.Z(-18862317);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(c2201e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.e(j5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= c0315s.f(pVar) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(androidx.compose.foundation.a.d(AbstractC0444a.n(pVar, j.f5218a), false, null, interfaceC2015a, 7), j.f5219b, V3.a.f5962A, 4, 0.0f, AbstractC2527w.a(1, p.b(0.45f, V3.a.f5995z)), e.d(-1121014120, new R3.f(c2201e, j5, str), c0315s), c0315s, 14180784, 40);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e() { // from class: S3.p
                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(i | 1);
                    String str2 = str;
                    C2201e c2201e2 = c2201e;
                    InterfaceC2015a interfaceC2015a2 = interfaceC2015a;
                    b0.p pVar2 = pVar;
                    N4.b.u(str2, c2201e2, j5, interfaceC2015a2, pVar2, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void v(String str, InterfaceC2015a interfaceC2015a, int i, C0315s c0315s, int i5, int i6) {
        C0315s c0315s2;
        String str2;
        InterfaceC2015a interfaceC2015a2;
        int i7;
        l.f("onBack", interfaceC2015a);
        c0315s.Z(-252521712);
        int i8 = (c0315s.h(interfaceC2015a) ? 32 : 16) | i5;
        int i9 = i6 & 4;
        if (i9 != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            i8 |= c0315s.d(i) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0315s.B()) {
            c0315s.S();
            c0315s2 = c0315s;
            i7 = i;
            interfaceC2015a2 = interfaceC2015a;
            str2 = str;
        } else {
            if (i9 != 0) {
                i = 4;
            }
            int i10 = i;
            c0315s2 = c0315s;
            G4.l.L(str, interfaceC2015a, null, i10, c0315s2, (i8 & 126) | ((i8 << 3) & 7168), 4);
            str2 = str;
            interfaceC2015a2 = interfaceC2015a;
            i7 = i10;
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0414q(str2, interfaceC2015a2, i7, i5, i6);
        }
    }

    public static final String w(long j5) {
        String str;
        if (j5 <= -999500000) {
            str = ((j5 - 500000000) / 1000000000) + " s ";
        } else if (j5 <= -999500) {
            str = ((j5 - 500000) / 1000000) + " ms";
        } else if (j5 <= 0) {
            str = ((j5 - 500) / 1000) + " µs";
        } else if (j5 < 999500) {
            str = ((j5 + 500) / 1000) + " µs";
        } else if (j5 < 999500000) {
            str = ((j5 + 500000) / 1000000) + " ms";
        } else {
            str = ((j5 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final U1.e x(View view) {
        l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            U1.e eVar = tag instanceof U1.e ? (U1.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object v4 = d.v(view);
            view = v4 instanceof View ? (View) v4 : null;
        }
        return null;
    }

    public static final C2201e y() {
        C2201e c2201e = f3797e;
        if (c2201e != null) {
            return c2201e;
        }
        C2200d c2200d = new C2200d("Filled.Star", false);
        int i = z.f18603a;
        M m5 = new M(p.f17289b);
        C2202f c2202f = new C2202f(0);
        c2202f.m(12.0f, 17.27f);
        c2202f.k(18.18f, 21.0f);
        c2202f.l(-1.64f, -7.03f);
        c2202f.k(22.0f, 9.24f);
        c2202f.l(-7.19f, -0.61f);
        c2202f.k(12.0f, 2.0f);
        c2202f.k(9.19f, 8.63f);
        c2202f.k(2.0f, 9.24f);
        c2202f.l(5.46f, 4.73f);
        c2202f.k(5.82f, 21.0f);
        c2202f.e();
        C2200d.a(c2200d, c2202f.f18548a, m5);
        C2201e b3 = c2200d.b();
        f3797e = b3;
        return b3;
    }

    public static File z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public abstract void P(boolean z3);

    public void O(boolean z3) {
    }
}
