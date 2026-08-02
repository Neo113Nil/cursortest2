package w1;

import A1.C0044t;
import C0.AbstractC0082a;
import C0.C0090i;
import G4.C0269b;
import G4.C0270c;
import G4.C0287u;
import G4.C0288v;
import G4.C0289w;
import G4.InterfaceC0273f;
import I2.C0306n;
import L5.AbstractC0331j;
import L5.C0328g;
import L5.C0330i;
import W5.AbstractC0486a1;
import W5.RunnableC0521m0;
import Y4.C0593q;
import Y4.C0595s;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.lifecycle.AbstractServiceC0748w;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0739m;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import d1.C0950c;
import d1.C0952e;
import d1.C0954g;
import e4.C1036j;
import g5.C1150e;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.sentry.TransactionOptions;
import j2.C1305b;
import j2.InterfaceC1309f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k4.AbstractC1341c;
import n1.C1450e;
import n1.ExecutorC1453h;
import p.AbstractC1520g;
import p.C1524k;
import p.C1525l;
import p1.InterfaceC1533a;
import q5.AbstractActivityC1559c;
import s2.C1589c;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import w1.C1759x1;
import w1.V0;
import w4.C1778d;

/* renamed from: w1.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1759x1 implements G4.C, G4.D, U.g, U3.a, Continuation, InterfaceC1533a, InterfaceC1309f {

    /* renamed from: e, reason: collision with root package name */
    public static C1759x1 f17923e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17924a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17925b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17926c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17927d;

    public /* synthetic */ C1759x1(int i7, boolean z4) {
        this.f17924a = i7;
    }

    public static Bundle H(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static final C1759x1 J(V3.g0 g0Var) {
        if (g0Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(g0Var.B());
        for (V3.f0 f0Var : g0Var.C()) {
            f0Var.getClass();
            try {
                try {
                    J3.b a2 = Q3.i.f5812b.a(Q3.o.c(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), f0Var.E() == V3.r0.RAW ? null : Integer.valueOf(f0Var.D())));
                    int ordinal = f0Var.F().ordinal();
                    if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new J3.h(a2));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e7) {
                throw new A1.W("Creating a protokey serialization failed", e7);
            }
        }
        return new C1759x1(g0Var, Collections.unmodifiableList(arrayList));
    }

    public static final C1759x1 a0(J3.f fVar, P3.b bVar) {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f3842b;
        try {
            V3.N C3 = V3.N.C(byteArrayInputStream, C0879o.a());
            byteArrayInputStream.close();
            if (C3.A().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                V3.g0 G2 = V3.g0.G(bVar.b(C3.A().z(), bArr), C0879o.a());
                if (G2.B() > 0) {
                    return J(G2);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static void e0(Activity activity, C1759x1 c1759x1) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, c1759x1);
        activity.setMediaController(c1759x1 != null ? new MediaController(activity, (MediaSession.Token) ((MediaSessionCompat$Token) c1759x1.f17926c).f8016b) : null);
    }

    public static void f0(A5.f fVar, final C1759x1 c1759x1) {
        Q5.c cVar = Q5.c.f5845d;
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, obj, 1);
        if (c1759x1 != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            C1759x1 c1759x12 = c1759x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1759x12.F((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v02.f(arrayList);
                            return;
                        case 1:
                            C1759x1 c1759x13 = c1759x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            if (((AbstractActivityC1559c) c1759x13.f17927d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC1559c) c1759x13.f17927d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1759x1.H(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            v02.f(arrayList2);
                            return;
                        case 2:
                            C1759x1 c1759x14 = c1759x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1759x14.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v02.f(arrayList4);
                            return;
                        case 3:
                            C1759x1 c1759x15 = c1759x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1759x15.getClass();
                                arrayList6.add(0, Boolean.valueOf(AbstractC1520g.b((Context) c1759x15.f17925b, Collections.emptyList(), false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v02.f(arrayList6);
                            return;
                        default:
                            C1759x1 c1759x16 = c1759x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1759x16.getClass();
                                ((Context) c1759x16.f17925b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v02.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, obj, 1);
        if (c1759x1 != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            C1759x1 c1759x12 = c1759x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1759x12.F((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v02.f(arrayList);
                            return;
                        case 1:
                            C1759x1 c1759x13 = c1759x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            if (((AbstractActivityC1559c) c1759x13.f17927d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC1559c) c1759x13.f17927d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1759x1.H(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            v02.f(arrayList2);
                            return;
                        case 2:
                            C1759x1 c1759x14 = c1759x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1759x14.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v02.f(arrayList4);
                            return;
                        case 3:
                            C1759x1 c1759x15 = c1759x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1759x15.getClass();
                                arrayList6.add(0, Boolean.valueOf(AbstractC1520g.b((Context) c1759x15.f17925b, Collections.emptyList(), false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v02.f(arrayList6);
                            return;
                        default:
                            C1759x1 c1759x16 = c1759x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1759x16.getClass();
                                ((Context) c1759x16.f17925b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v02.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, obj, 1);
        if (c1759x1 != null) {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            C1759x1 c1759x12 = c1759x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1759x12.F((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v02.f(arrayList);
                            return;
                        case 1:
                            C1759x1 c1759x13 = c1759x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            if (((AbstractActivityC1559c) c1759x13.f17927d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC1559c) c1759x13.f17927d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1759x1.H(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            v02.f(arrayList2);
                            return;
                        case 2:
                            C1759x1 c1759x14 = c1759x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1759x14.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v02.f(arrayList4);
                            return;
                        case 3:
                            C1759x1 c1759x15 = c1759x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1759x15.getClass();
                                arrayList6.add(0, Boolean.valueOf(AbstractC1520g.b((Context) c1759x15.f17925b, Collections.emptyList(), false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v02.f(arrayList6);
                            return;
                        default:
                            C1759x1 c1759x16 = c1759x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1759x16.getClass();
                                ((Context) c1759x16.f17925b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v02.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, obj, 1);
        if (c1759x1 != null) {
            final int i10 = 3;
            f05.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            C1759x1 c1759x12 = c1759x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1759x12.F((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v02.f(arrayList);
                            return;
                        case 1:
                            C1759x1 c1759x13 = c1759x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            if (((AbstractActivityC1559c) c1759x13.f17927d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC1559c) c1759x13.f17927d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1759x1.H(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            v02.f(arrayList2);
                            return;
                        case 2:
                            C1759x1 c1759x14 = c1759x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1759x14.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v02.f(arrayList4);
                            return;
                        case 3:
                            C1759x1 c1759x15 = c1759x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1759x15.getClass();
                                arrayList6.add(0, Boolean.valueOf(AbstractC1520g.b((Context) c1759x15.f17925b, Collections.emptyList(), false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v02.f(arrayList6);
                            return;
                        default:
                            C1759x1 c1759x16 = c1759x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1759x16.getClass();
                                ((Context) c1759x16.f17925b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v02.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, obj, 1);
        if (c1759x1 == null) {
            f06.M(null);
        } else {
            final int i11 = 4;
            f06.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            C1759x1 c1759x12 = c1759x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1759x12.F((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v02.f(arrayList);
                            return;
                        case 1:
                            C1759x1 c1759x13 = c1759x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            if (((AbstractActivityC1559c) c1759x13.f17927d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC1559c) c1759x13.f17927d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1759x1.H(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            v02.f(arrayList2);
                            return;
                        case 2:
                            C1759x1 c1759x14 = c1759x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1759x14.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v02.f(arrayList4);
                            return;
                        case 3:
                            C1759x1 c1759x15 = c1759x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1759x15.getClass();
                                arrayList6.add(0, Boolean.valueOf(AbstractC1520g.b((Context) c1759x15.f17925b, Collections.emptyList(), false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v02.f(arrayList6);
                            return;
                        default:
                            C1759x1 c1759x16 = c1759x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1759x16.getClass();
                                ((Context) c1759x16.f17925b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v02.f(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    public static void i0(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new C1778d("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new C1778d("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void j0(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new C1778d("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new C1778d("connection failed: 404 not found");
        }
        if (parseInt != 101) {
            throw new C1778d(e1.k.d(parseInt, "connection failed: unknown status code "));
        }
    }

    public static synchronized C1759x1 z() {
        C1759x1 c1759x1;
        synchronized (C1759x1.class) {
            try {
                if (f17923e == null) {
                    f17923e = new C1759x1(0);
                }
                c1759x1 = f17923e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1759x1;
    }

    public void A(C2 c22) {
        A1 a12 = (A1) ((C1450e) ((A1.x0) this.f17925b).f613b).f15308b;
        if (a12 != null) {
            a12.k(c22);
        }
    }

    public void B(double d7, float f7) {
        int length = ((float[]) this.f17925b).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.f17926c, d7);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f17926c = Arrays.copyOf((double[]) this.f17926c, length);
        this.f17925b = Arrays.copyOf((float[]) this.f17925b, length);
        this.f17927d = new double[length];
        double[] dArr = (double[]) this.f17926c;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.f17926c)[binarySearch] = d7;
        ((float[]) this.f17925b)[binarySearch] = f7;
    }

    public K3.m C() {
        C1719l1 c1719l1;
        K3.n nVar = (K3.n) this.f17925b;
        if (nVar == null || (c1719l1 = (C1719l1) this.f17926c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f3935b != ((X3.a) c1719l1.f17771a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        K3.j jVar = K3.j.f3916h;
        K3.j jVar2 = nVar.f3938e;
        if (jVar2 != jVar && ((Integer) this.f17927d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f17927d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            X3.a.a(new byte[0]);
        } else if (jVar2 == K3.j.f3915g) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17927d).intValue()).array());
        } else {
            if (jVar2 != K3.j.f3914f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((K3.n) this.f17925b).f3938e);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17927d).intValue()).array());
        }
        return new K3.m();
    }

    public R3.e D() {
        Integer num = (Integer) this.f17925b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f17926c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((R3.d) this.f17927d) != null) {
            return new R3.e(num.intValue(), ((Integer) this.f17926c).intValue(), (R3.d) this.f17927d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public d1.o E() {
        UUID uuid = (UUID) this.f17925b;
        m1.i iVar = (m1.i) this.f17926c;
        HashSet hashSet = (HashSet) this.f17927d;
        d1.o oVar = new d1.o();
        oVar.f12366a = uuid;
        oVar.f12367b = iVar;
        oVar.f12368c = hashSet;
        C0950c c0950c = iVar.j;
        boolean z4 = c0950c.f12350h.f12353a.size() > 0 || c0950c.f12346d || c0950c.f12344b || c0950c.f12345c;
        if (((m1.i) this.f17926c).f15231q && z4) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f17925b = UUID.randomUUID();
        m1.i iVar2 = (m1.i) this.f17926c;
        m1.i iVar3 = new m1.i();
        iVar3.f15217b = 1;
        C0954g c0954g = C0954g.f12356c;
        iVar3.f15220e = c0954g;
        iVar3.f15221f = c0954g;
        iVar3.j = C0950c.f12342i;
        iVar3.f15226l = 1;
        iVar3.f15227m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        iVar3.f15230p = -1L;
        iVar3.f15232r = 1;
        iVar3.f15216a = iVar2.f15216a;
        iVar3.f15218c = iVar2.f15218c;
        iVar3.f15217b = iVar2.f15217b;
        iVar3.f15219d = iVar2.f15219d;
        iVar3.f15220e = new C0954g(iVar2.f15220e);
        iVar3.f15221f = new C0954g(iVar2.f15221f);
        iVar3.f15222g = iVar2.f15222g;
        iVar3.f15223h = iVar2.f15223h;
        iVar3.f15224i = iVar2.f15224i;
        C0950c c0950c2 = iVar2.j;
        C0950c c0950c3 = new C0950c();
        c0950c3.f12343a = 1;
        c0950c3.f12348f = -1L;
        c0950c3.f12349g = -1L;
        c0950c3.f12350h = new C0952e();
        c0950c3.f12344b = c0950c2.f12344b;
        c0950c3.f12345c = c0950c2.f12345c;
        c0950c3.f12343a = c0950c2.f12343a;
        c0950c3.f12346d = c0950c2.f12346d;
        c0950c3.f12347e = c0950c2.f12347e;
        c0950c3.f12350h = c0950c2.f12350h;
        iVar3.j = c0950c3;
        iVar3.f15225k = iVar2.f15225k;
        iVar3.f15226l = iVar2.f15226l;
        iVar3.f15227m = iVar2.f15227m;
        iVar3.f15228n = iVar2.f15228n;
        iVar3.f15229o = iVar2.f15229o;
        iVar3.f15230p = iVar2.f15230p;
        iVar3.f15231q = iVar2.f15231q;
        iVar3.f15232r = iVar2.f15232r;
        this.f17926c = iVar3;
        iVar3.f15216a = ((UUID) this.f17925b).toString();
        return oVar;
    }

    public Boolean F(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((C0044t) this.f17926c).f563b.getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public void G(Runnable runnable) {
        ((ExecutorC1453h) this.f17925b).execute(runnable);
    }

    public int I(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.f17927d;
        int size = arrayList.size();
        while (i8 < size) {
            ((AbstractC0082a) arrayList.get(i8)).getClass();
            i8++;
        }
        return i7;
    }

    public HashMap K(List list, H4.b bVar, int i7, B1.c cVar, d1.n nVar) {
        Timestamp timestamp = bVar.f3305a.f3333a;
        StringBuilder h6 = L4.r.h(" UNION ", "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size());
        h6.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        boolean z4 = true;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            H4.m mVar = (H4.m) it.next();
            String C3 = p3.f.C(mVar);
            int i9 = i8 + 1;
            objArr[i8] = C3;
            int i10 = i8 + 2;
            StringBuilder sb = new StringBuilder(C3);
            int length = sb.length() - (z4 ? 1 : 0);
            char charAt = sb.charAt(length);
            Iterator it2 = it;
            if (charAt != z4) {
                z4 = false;
            }
            p3.f.O("successor may only operate on paths generated by encode", z4, new Object[0]);
            sb.setCharAt(length, (char) (charAt + 1));
            objArr[i9] = sb.toString();
            objArr[i10] = Integer.valueOf(mVar.f3312a.size() + 1);
            long j = timestamp.f11828a;
            objArr[i8 + 3] = Long.valueOf(j);
            objArr[i8 + 4] = Long.valueOf(j);
            int i11 = timestamp.f11829b;
            objArr[i8 + 5] = Integer.valueOf(i11);
            objArr[i8 + 6] = Long.valueOf(j);
            int i12 = i8 + 8;
            objArr[i8 + 7] = Integer.valueOf(i11);
            i8 += 9;
            objArr[i12] = p3.f.C(bVar.f3306b.f3318a);
            it = it2;
            z4 = true;
        }
        objArr[i8] = Integer.valueOf(i7);
        L4.g gVar = new L4.g();
        HashMap hashMap = new HashMap();
        C1726n0 c0 = ((G4.S) this.f17925b).c0(h6.toString());
        c0.c(objArr);
        Cursor J5 = c0.J();
        while (J5.moveToNext()) {
            try {
                Z(gVar, hashMap, J5, cVar);
                if (nVar != null) {
                    nVar.f12365a++;
                }
            } finally {
            }
        }
        J5.close();
        gVar.a();
        return hashMap;
    }

    public byte[] L() {
        URI uri = (URI) this.f17925b;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder c3 = t.e.c(path);
        c3.append(query == null ? "" : "?".concat(query));
        String sb = c3.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            StringBuilder d7 = t.e.d(host, ":");
            d7.append(uri.getPort());
            host = d7.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f17926c);
        HashMap hashMap = (HashMap) this.f17927d;
        for (String str : hashMap.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        StringBuilder c4 = t.e.c(AbstractC0486a1.h("GET ", sb, " HTTP/1.1\r\n"));
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(": ");
            str2 = e1.k.i(sb2, (String) linkedHashMap.get(str3), "\r\n");
        }
        c4.append(str2);
        byte[] bytes = e1.k.e(c4.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public double M(double d7) {
        if (d7 < 0.0d) {
            d7 = 0.0d;
        } else if (d7 > 1.0d) {
            d7 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch((double[]) this.f17926c, d7);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i7 = -binarySearch;
        int i8 = i7 - 1;
        float[] fArr = (float[]) this.f17925b;
        float f7 = fArr[i8];
        int i9 = i7 - 2;
        float f8 = fArr[i9];
        double[] dArr = (double[]) this.f17926c;
        double d8 = dArr[i8];
        double d9 = dArr[i9];
        double d10 = (f7 - f8) / (d8 - d9);
        return ((((d7 * d7) - (d9 * d9)) * d10) / 2.0d) + ((d7 - d9) * (f8 - (d10 * d9))) + ((double[]) this.f17927d)[i9];
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(Class cls) {
        Class cls2;
        Object obj;
        Object obj2;
        AtomicReference atomicReference = J3.n.f3855a;
        try {
            cls2 = Q3.h.f5810b.a(cls);
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
        if (cls2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i7 = J3.p.f3860a;
        V3.g0 g0Var = (V3.g0) this.f17925b;
        int D7 = g0Var.D();
        Iterator it = g0Var.C().iterator();
        boolean z4 = true;
        int i8 = 0;
        boolean z7 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            V3.Z z8 = V3.Z.ENABLED;
            if (!hasNext) {
                if (i8 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z7 && !z4) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                k1.g gVar = new k1.g();
                gVar.f14675b = new ConcurrentHashMap();
                gVar.f14674a = cls2;
                gVar.f14677d = T3.a.f6342b;
                if (((ConcurrentHashMap) gVar.f14675b) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                gVar.f14677d = (T3.a) this.f17927d;
                for (int i9 = 0; i9 < g0Var.B(); i9++) {
                    V3.f0 A7 = g0Var.A(i9);
                    if (A7.F().equals(z8)) {
                        try {
                            V3.Y C3 = A7.C();
                            AtomicReference atomicReference2 = J3.n.f3855a;
                            obj = J3.n.c(C3.D(), C3.E(), cls2);
                        } catch (GeneralSecurityException e7) {
                            if (!e7.getMessage().contains("No key manager found for key type ") && !e7.getMessage().contains(" not supported by key manager of type ")) {
                                throw e7;
                            }
                            obj = null;
                        }
                        List list = (List) this.f17926c;
                        if (list.get(i9) != null) {
                            try {
                                obj2 = J3.n.b(((J3.h) list.get(i9)).f3844a, cls2);
                            } catch (GeneralSecurityException unused2) {
                            }
                            if (A7.D() != g0Var.D()) {
                                gVar.d(obj2, obj, A7, true);
                            } else {
                                gVar.d(obj2, obj, A7, false);
                            }
                        }
                        obj2 = null;
                        if (A7.D() != g0Var.D()) {
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gVar.f14675b;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                J3.k kVar = (J3.k) gVar.f14676c;
                T3.a aVar = (T3.a) gVar.f14677d;
                Class cls3 = (Class) gVar.f14674a;
                android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(concurrentHashMap, kVar, aVar, cls3);
                gVar.f14675b = null;
                AtomicReference atomicReference3 = J3.n.f3855a;
                HashMap hashMap = ((Q3.n) Q3.h.f5810b.f5811a.get()).f5821b;
                if (!hashMap.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                J3.m mVar = (J3.m) hashMap.get(cls);
                if (cls3.equals(mVar.a()) && mVar.a().equals(cls3)) {
                    return mVar.c(tVar);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            V3.f0 f0Var = (V3.f0) it.next();
            if (f0Var.F() == z8) {
                if (!f0Var.G()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.E() == V3.r0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.F() == V3.Z.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.D() == D7) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                if (f0Var.C().C() != V3.X.ASYMMETRIC_PUBLIC) {
                    z4 = false;
                }
                i8++;
            }
        }
    }

    public double O(double d7, double d8) {
        return Math.sin((M(d7) + d8) * 6.283185307179586d);
    }

    public boolean P() {
        String trim;
        if (((String) this.f17927d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f17926c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f17927d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f17925b).readLine();
            this.f17927d = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f17927d = trim;
        } while (trim.isEmpty());
        return true;
    }

    public void Q(HashMap hashMap) {
        new Handler(Looper.getMainLooper()).post(new D6.y0(10, this, hashMap, false));
    }

    public boolean R(H4.h hVar) {
        C0288v c0288v = (C0288v) this.f17926c;
        if (c0288v.f3034f.f3039b.l(hVar)) {
            return true;
        }
        for (C0287u c0287u : c0288v.f3031c.values()) {
            c0287u.getClass();
            boolean z4 = false;
            E3.F m7 = c0287u.f3026b.m(new C0270c(hVar, 0));
            if (((Iterator) m7.f1994b).hasNext()) {
                z4 = ((C0270c) m7.next()).f2964a.equals(hVar);
            }
            if (z4) {
                return true;
            }
        }
        V0 v02 = (V0) this.f17925b;
        return v02 != null && v02.l(hVar);
    }

    public String S() {
        if (!P()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f17927d;
        this.f17927d = null;
        return str;
    }

    public void T(int i7, C0328g c0328g) {
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(i7, hashMap, "adId", "eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", c0328g);
        Q(hashMap);
    }

    public void U(int i7, y2.v vVar) {
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(i7, hashMap, "adId", "eventName", "onAdLoaded");
        hashMap.put("responseInfo", vVar == null ? null : new C0330i(vVar));
        Q(hashMap);
    }

    public void V(int i7, String str, String str2) {
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(i7, hashMap, "adId", "eventName", "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        Q(hashMap);
    }

    public void W(int i7, L5.N n2) {
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(i7, hashMap, "adId", "eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", n2);
        Q(hashMap);
    }

    public Boolean X(String str, Boolean bool, Q5.e eVar, Q5.a aVar) {
        if (((AbstractActivityC1559c) this.f17927d) == null) {
            throw new Q5.b();
        }
        Bundle H7 = H(eVar.f5850c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f5850c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) this.f17927d;
                    C1524k c1524k = new C1524k();
                    c1524k.f15643a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f5843a.booleanValue() ? 1 : 0);
                    C1525l a2 = c1524k.a();
                    a2.f15650a.putExtra("com.android.browser.headers", H7);
                    try {
                        a2.a(abstractActivityC1559c, parse);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) this.f17927d;
        boolean booleanValue = eVar.f5848a.booleanValue();
        boolean booleanValue2 = eVar.f5849b.booleanValue();
        int i7 = WebViewActivity.f14219e;
        try {
            ((AbstractActivityC1559c) this.f17927d).startActivity(new Intent(abstractActivityC1559c2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", H7));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void Y(EnumC0739m enumC0739m) {
        RunnableC0521m0 runnableC0521m0 = (RunnableC0521m0) this.f17927d;
        if (runnableC0521m0 != null) {
            runnableC0521m0.run();
        }
        RunnableC0521m0 runnableC0521m02 = new RunnableC0521m0((C0747v) this.f17925b, enumC0739m);
        this.f17927d = runnableC0521m02;
        ((Handler) this.f17926c).postAtFrontOfQueue(runnableC0521m02);
    }

    public void Z(L4.g gVar, final HashMap hashMap, Cursor cursor, final B1.c cVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        final int i8 = cursor.getInt(2);
        Executor executor = gVar;
        if (cursor.isLast()) {
            executor = L4.l.f4377b;
        }
        executor.execute(new Runnable() { // from class: G4.T
            @Override // java.lang.Runnable
            public final void run() {
                C1759x1 c1759x1 = C1759x1.this;
                byte[] bArr = blob;
                int i9 = i7;
                int i10 = i8;
                B1.c cVar2 = cVar;
                HashMap hashMap2 = hashMap;
                c1759x1.getClass();
                try {
                    H4.k B7 = ((R4.c) c1759x1.f17926c).B(J4.b.F(bArr));
                    B7.f3326d = new H4.n(new Timestamp(i9, i10));
                    if (cVar2 == null || ((Boolean) cVar2.apply(B7)).booleanValue()) {
                        synchronized (hashMap2) {
                            hashMap2.put(B7.f3323a, B7);
                        }
                    }
                } catch (com.google.protobuf.M e7) {
                    p3.f.F("MaybeDocument failed to parse: %s", e7);
                    throw null;
                }
            }
        });
    }

    @Override // G4.C
    public void a(G4.Z z4) {
        C0288v c0288v = (C0288v) this.f17926c;
        int i7 = z4.f2954b;
        C0289w c0289w = c0288v.f3034f;
        Iterator it = c0289w.f3039b.T(i7).iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                c0289w.f3038a.remove(z4.f2953a);
                c0289w.f3039b.W(z4.f2954b);
                return;
            } else {
                ((HashSet) this.f17927d).add((H4.h) f7.next());
            }
        }
    }

    @Override // U.g
    public Uri b() {
        return (Uri) this.f17925b;
    }

    public void b0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0082a abstractC0082a = (AbstractC0082a) arrayList.get(i7);
            abstractC0082a.getClass();
            ((O.c) this.f17925b).c(abstractC0082a);
        }
        arrayList.clear();
    }

    public void c0(C1150e c1150e) {
        if (c1150e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f17927d).add(c1150e)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        c1150e.b(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f17925b;
        hVar.f8047a.registerCallback(c1150e.f13246a, handler);
        synchronized (hVar.f8048b) {
            if (hVar.f8051e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(c1150e);
                hVar.f8050d.put(c1150e, gVar);
                c1150e.f13248c = gVar;
                try {
                    hVar.f8051e.a().e(gVar);
                    c1150e.a(13, null, null);
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                }
            } else {
                c1150e.f13248c = null;
                hVar.f8049c.add(c1150e);
            }
        }
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        long[] jArr = (long[]) this.f17927d;
        int b7 = v2.t.b(jArr, j, false);
        if (b7 < jArr.length) {
            return b7;
        }
        return -1;
    }

    public void d0(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.f17925b = Integer.valueOf(i7);
    }

    @Override // G4.D
    public void e(InterfaceC0273f interfaceC0273f) {
        this.f17927d = interfaceC0273f;
    }

    @Override // G4.C
    public void f() {
        C0288v c0288v = (C0288v) this.f17926c;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.f17927d).iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            if (!R(hVar)) {
                arrayList.add(hVar);
            }
        }
        c0288v.f3036h.o(arrayList);
        this.f17927d = null;
    }

    @Override // G4.C
    public void g() {
        this.f17927d = new HashSet();
    }

    public I4.h g0(H4.h hVar, I4.n nVar) {
        I4.f fVar = (I4.f) this.f17926c;
        return fVar != null ? new I4.m(hVar, (H4.l) this.f17925b, fVar, nVar, (List) this.f17927d) : new I4.p(hVar, (H4.l) this.f17925b, nVar, (List) this.f17927d);
    }

    @Override // U.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f17926c;
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 >= 0);
        long[] jArr = (long[]) this.f17927d;
        AbstractC1664a.f(i7 < jArr.length);
        return jArr[i7];
    }

    public void h0(AbstractC0331j abstractC0331j, int i7) {
        HashMap hashMap = (HashMap) this.f17926c;
        if (hashMap.get(Integer.valueOf(i7)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i7)));
        }
        hashMap.put(Integer.valueOf(i7), abstractC0331j);
    }

    @Override // G4.D
    public void i(H4.k kVar, H4.n nVar) {
        p3.f.O("Cannot add document to the RemoteDocumentCache with a read time of zero", !nVar.equals(H4.n.f3332b), new Object[0]);
        R4.c cVar = (R4.c) this.f17926c;
        J4.a E7 = J4.b.E();
        boolean e7 = kVar.e();
        P2 p22 = (P2) cVar.f6064b;
        H4.h hVar = kVar.f3323a;
        if (e7) {
            J4.c A7 = J4.d.A();
            String u4 = p22.u(hVar);
            A7.d();
            J4.d.v((J4.d) A7.f12096b, u4);
            com.google.protobuf.z0 y4 = P2.y(kVar.f3325c.f3333a);
            A7.d();
            J4.d.w((J4.d) A7.f12096b, y4);
            J4.d dVar = (J4.d) A7.b();
            E7.d();
            J4.b.w((J4.b) E7.f12096b, dVar);
        } else if (kVar.d()) {
            C0593q C3 = C0595s.C();
            String u7 = p22.u(hVar);
            C3.d();
            C0595s.v((C0595s) C3.f12096b, u7);
            Map y5 = kVar.f3327e.b().N().y();
            C3.d();
            C0595s.w((C0595s) C3.f12096b).putAll(y5);
            com.google.protobuf.z0 y7 = P2.y(kVar.f3325c.f3333a);
            C3.d();
            C0595s.x((C0595s) C3.f12096b, y7);
            C0595s c0595s = (C0595s) C3.b();
            E7.d();
            J4.b.x((J4.b) E7.f12096b, c0595s);
        } else {
            if (!t.e.b(kVar.f3324b, 4)) {
                p3.f.F("Cannot encode invalid document %s", kVar);
                throw null;
            }
            J4.h A8 = J4.i.A();
            String u8 = p22.u(hVar);
            A8.d();
            J4.i.v((J4.i) A8.f12096b, u8);
            com.google.protobuf.z0 y8 = P2.y(kVar.f3325c.f3333a);
            A8.d();
            J4.i.w((J4.i) A8.f12096b, y8);
            J4.i iVar = (J4.i) A8.b();
            E7.d();
            J4.b.y((J4.b) E7.f12096b, iVar);
        }
        boolean b7 = t.e.b(kVar.f3328f, 2);
        E7.d();
        J4.b.v((J4.b) E7.f12096b, b7);
        J4.b bVar = (J4.b) E7.b();
        String C7 = p3.f.C(hVar.f3318a);
        Integer valueOf = Integer.valueOf(hVar.f3318a.f3312a.size());
        Timestamp timestamp = nVar.f3333a;
        ((G4.S) this.f17925b).b0("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", C7, valueOf, Long.valueOf(timestamp.f11828a), Integer.valueOf(timestamp.f11829b), bVar.d());
        ((InterfaceC0273f) this.f17927d).s(hVar.d());
    }

    @Override // U.g
    public Uri j() {
        return (Uri) this.f17927d;
    }

    @Override // U3.a
    public byte[] k(int i7, byte[] bArr) {
        byte[] V4;
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC1663a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) W3.i.f6718b.f6720a.R("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f17925b);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            V4 = P6.b.U(bArr, (max - 1) * 16, (byte[]) this.f17926c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            V4 = P6.b.V(copyOf, (byte[]) this.f17927d);
        }
        byte[] bArr2 = new byte[16];
        for (int i8 = 0; i8 < max - 1; i8++) {
            bArr2 = cipher.doFinal(P6.b.U(bArr2, 0, bArr, i8 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(P6.b.V(V4, bArr2)), i7);
    }

    @Override // G4.C
    public long l() {
        return -1L;
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f17925b;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f17926c;
            if (jArr[i8] <= j && j < jArr[i8 + 1]) {
                C1589c c1589c = (C1589c) list.get(i7);
                C1305b c1305b = c1589c.f16116a;
                if (c1305b.f14581e == -3.4028235E38f) {
                    arrayList2.add(c1589c);
                } else {
                    arrayList.add(c1305b);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new C0269b(15));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            C1305b c1305b2 = ((C1589c) arrayList2.get(i9)).f16116a;
            arrayList.add(new C1305b(c1305b2.f14577a, c1305b2.f14578b, c1305b2.f14579c, c1305b2.f14580d, (-1) - i9, 1, c1305b2.f14583x, c1305b2.f14584y, c1305b2.f14585z, c1305b2.f14573E, c1305b2.f14574F, c1305b2.f14569A, c1305b2.f14570B, c1305b2.f14571C, c1305b2.f14572D, c1305b2.f14575G, c1305b2.f14576H));
        }
        return arrayList;
    }

    @Override // G4.D
    public HashMap n(Iterable iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            arrayList.add(p3.f.C(hVar.f3318a));
            hashMap.put(hVar, H4.k.g(hVar));
        }
        G4.S s7 = (G4.S) this.f17925b;
        E4.L l7 = new E4.L();
        l7.f2141a = 0;
        l7.f2142b = s7;
        l7.f2143c = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
        l7.f2145e = Collections.emptyList();
        l7.f2144d = ") ORDER BY path";
        l7.f2146f = arrayList.iterator();
        L4.g gVar = new L4.g();
        while (((Iterator) l7.f2146f).hasNext()) {
            Cursor J5 = l7.t().J();
            while (J5.moveToNext()) {
                try {
                    Z(gVar, hashMap, J5, null);
                } catch (Throwable th) {
                    if (J5 != null) {
                        try {
                            J5.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            J5.close();
        }
        gVar.a();
        return hashMap;
    }

    @Override // G4.D
    public void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            arrayList2.add(p3.f.C(hVar.f3318a));
            abstractC1341c = abstractC1341c.D(hVar, H4.k.h(hVar, H4.n.f3332b));
        }
        List emptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(emptyList);
            for (int i7 = 0; it2.hasNext() && i7 < 900 - emptyList.size(); i7++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            ((G4.S) this.f17925b).b0("DELETE FROM remote_documents WHERE path IN (" + ((Object) L4.r.h(", ", "?", array.length)) + ")", array);
        }
        ((InterfaceC0273f) this.f17927d).e(abstractC1341c);
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return ((long[]) this.f17927d).length;
    }

    @Override // G4.C
    public void q(H4.h hVar) {
        ((HashSet) this.f17927d).add(hVar);
    }

    @Override // G4.C
    public void r(H4.h hVar) {
        ((HashSet) this.f17927d).add(hVar);
    }

    @Override // G4.C
    public void s(H4.h hVar) {
        ((HashSet) this.f17927d).remove(hVar);
    }

    @Override // G4.C
    public void t(V0 v02) {
        this.f17925b = v02;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C1036j c1036j = (C1036j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) ((FirebaseUser) this.f17927d)).f11910c));
        String str = c1036j.f12681a;
        com.google.android.gms.common.internal.D.i(str);
        firebaseAuth.getClass();
        com.google.android.gms.common.internal.D.e(str);
        String str2 = (String) this.f17925b;
        com.google.android.gms.common.internal.D.e(str2);
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) this.f17926c;
        if (actionCodeSettings == null) {
            actionCodeSettings = new ActionCodeSettings(new C0306n(1));
        }
        String str3 = firebaseAuth.f11857i;
        if (str3 != null) {
            actionCodeSettings.f11839y = str3;
        }
        return firebaseAuth.f11853e.zza(str, str2, actionCodeSettings);
    }

    public String toString() {
        switch (this.f17924a) {
            case 6:
                return J3.p.a((V3.g0) this.f17925b).toString();
            case 23:
                return "pos =" + Arrays.toString((double[]) this.f17926c) + " period=" + Arrays.toString((float[]) this.f17925b);
            default:
                return super.toString();
        }
    }

    @Override // G4.D
    public HashMap u(E4.C c3, H4.b bVar, Set set, d1.n nVar) {
        return K(Collections.singletonList(c3.f2095f), bVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, new B1.c(8, c3, set), nVar);
    }

    @Override // G4.D
    public Map v(String str, H4.b bVar, int i7) {
        List B7 = ((InterfaceC0273f) this.f17927d).B(str);
        ArrayList arrayList = new ArrayList(B7.size());
        Iterator it = B7.iterator();
        while (it.hasNext()) {
            arrayList.add((H4.m) ((H4.m) it.next()).b(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return K(arrayList, bVar, i7, null, null);
        }
        HashMap hashMap = new HashMap();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int i9 = i8 + 100;
            hashMap.putAll(K(arrayList.subList(i8, Math.min(arrayList.size(), i9)), bVar, i7, null, null));
            i8 = i9;
        }
        C0269b c0269b = H4.b.f3304e;
        H5.k kVar = L4.r.f4389a;
        if (hashMap.size() > i7) {
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new E4.M(c0269b, 2));
            hashMap = new HashMap();
            for (int i10 = 0; i10 < i7; i10++) {
                hashMap.put(((Map.Entry) arrayList2.get(i10)).getKey(), ((Map.Entry) arrayList2.get(i10)).getValue());
            }
        }
        return hashMap;
    }

    @Override // U.g
    public Object w() {
        return null;
    }

    @Override // G4.C
    public void x(H4.h hVar) {
        if (R(hVar)) {
            ((HashSet) this.f17927d).remove(hVar);
        } else {
            ((HashSet) this.f17927d).add(hVar);
        }
    }

    @Override // G4.D
    public H4.k y(H4.h hVar) {
        return (H4.k) n(Collections.singletonList(hVar)).get(hVar);
    }

    public /* synthetic */ C1759x1(Object obj, Object obj2, Object obj3, int i7) {
        this.f17924a = i7;
        this.f17925b = obj;
        this.f17926c = obj2;
        this.f17927d = obj3;
    }

    public C1759x1(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f17924a = 18;
        this.f17925b = str;
        this.f17926c = actionCodeSettings;
        this.f17927d = firebaseUser;
    }

    public C1759x1(int i7) {
        this.f17924a = i7;
        switch (i7) {
            case 25:
                this.f17925b = new ConcurrentLinkedQueue();
                break;
            default:
                A1.x0 x0Var = new A1.x0(21, false);
                C1450e c1450e = new C1450e(23);
                B1 b12 = new B1(null);
                b12.f17288D = null;
                b12.f17289E = null;
                b12.f17290F = true;
                b12.f17291G = null;
                b12.f17291G = new C1756w1();
                E1 e12 = new E1(b12);
                e12.f17363E = new EnumMap(D2.class);
                e12.f17364F = new EnumMap(D2.class);
                D2[] d2Arr = E1.f17360G;
                for (int i8 = 0; i8 < 18; i8++) {
                    ((EnumMap) e12.f17363E).put((EnumMap) d2Arr[i8], (D2) null);
                }
                ((EnumMap) e12.f17364F).put((EnumMap) E1.f17361H[0], (D2) null);
                D1 d12 = new D1(new E1(e12));
                u1.c cVar = new u1.c(d12, 28);
                ArrayList arrayList = new ArrayList();
                d12.f17320D = arrayList;
                P1 p12 = new P1();
                p12.f17499d = false;
                p12.f17500e = null;
                p12.f17501f = null;
                p12.f17502g = Long.MIN_VALUE;
                p12.f17503h = Long.MIN_VALUE;
                p12.f17504i = Long.MIN_VALUE;
                p12.j = 1;
                p12.f17505k = 1;
                p12.f17498c = cVar;
                if (p12.f17496a == null) {
                    p12.f17496a = new HashMap();
                }
                p12.f17496a.clear();
                p12.f17496a.put(D2.SESSION_INFO, null);
                p12.f17496a.put(D2.APP_STATE, null);
                p12.f17496a.put(D2.APP_INFO, null);
                p12.f17496a.put(D2.REPORTED_ID, null);
                p12.f17496a.put(D2.DEVICE_PROPERTIES, null);
                p12.f17496a.put(D2.SESSION_ID, null);
                p12.f17496a = p12.f17496a;
                p12.f17497b = new AtomicBoolean(false);
                arrayList.add(p12);
                c1450e.f15308b = new A1(d12);
                x0Var.f613b = c1450e;
                this.f17925b = x0Var;
                C1756w1 c1756w1 = new C1756w1(AbstractC1753v1.a(EnumC1747t1.f17863a), false);
                c1756w1.f17913z = null;
                c1756w1.f17913z = new PriorityQueue(4, new C0090i(8));
                c1756w1.f17912A = new C1743s0();
                this.f17927d = c1756w1;
                C1756w1 c1756w12 = new C1756w1(AbstractC1753v1.a(EnumC1747t1.f17864b), false);
                c1756w12.f17913z = null;
                c1756w12.f17912A = c1756w1;
                this.f17926c = c1756w12;
                break;
        }
    }

    @Override // U.g
    public void c() {
    }

    public C1759x1(AbstractServiceC0748w abstractServiceC0748w) {
        this.f17924a = 16;
        this.f17925b = new C0747v(abstractServiceC0748w);
        this.f17926c = new Handler();
    }

    public C1759x1(C0288v c0288v) {
        this.f17924a = 4;
        this.f17926c = c0288v;
    }

    public C1759x1(ArrayList arrayList) {
        this.f17924a = 22;
        this.f17925b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f17926c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C1589c c1589c = (C1589c) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f17926c;
            jArr[i8] = c1589c.f16117b;
            jArr[i8 + 1] = c1589c.f16118c;
        }
        long[] jArr2 = (long[]) this.f17926c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f17927d = copyOf;
        Arrays.sort(copyOf);
    }

    public C1759x1(ExecutorService executorService) {
        this.f17924a = 21;
        this.f17926c = new Handler(Looper.getMainLooper());
        this.f17927d = new L.f(this, 2);
        this.f17925b = new ExecutorC1453h(executorService);
    }

    public C1759x1(A5.s sVar) {
        this.f17924a = 8;
        this.f17927d = sVar;
        this.f17926c = new HashMap();
    }

    public C1759x1(Context context) {
        this.f17924a = 10;
        C0044t c0044t = new C0044t(context, 4);
        this.f17925b = context;
        this.f17926c = c0044t;
    }

    public C1759x1(byte[] bArr) {
        this.f17924a = 13;
        W3.o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17925b = secretKeySpec;
        if (AbstractC1663a.a(1)) {
            Cipher cipher = (Cipher) W3.i.f6718b.f6720a.R("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] z4 = p3.f.z(cipher.doFinal(new byte[16]));
            this.f17926c = z4;
            this.f17927d = p3.f.z(z4);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public C1759x1(G4.S s7, R4.c cVar) {
        this.f17924a = 5;
        this.f17925b = s7;
        this.f17926c = cVar;
    }

    public C1759x1(C1722m0 c1722m0) {
        this.f17924a = 1;
        this.f17925b = new O.c(30);
        this.f17926c = new ArrayList();
        this.f17927d = new ArrayList();
        new C1718l0(this);
    }

    public C1759x1(Class cls) {
        this.f17924a = 17;
        this.f17927d = new HashSet();
        this.f17925b = UUID.randomUUID();
        this.f17926c = new m1.i(((UUID) this.f17925b).toString(), cls.getName());
        ((HashSet) this.f17927d).add(cls.getName());
        ((m1.i) this.f17926c).f15219d = OverwritingInputMerger.class.getName();
    }

    public C1759x1(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f17924a = 15;
        if (mediaSessionCompat$Token != null) {
            this.f17927d = Collections.synchronizedSet(new HashSet());
            this.f17926c = mediaSessionCompat$Token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f17925b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f17925b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public C1759x1(V3.g0 g0Var, List list) {
        this.f17924a = 6;
        this.f17925b = g0Var;
        this.f17926c = list;
        this.f17927d = T3.a.f6342b;
    }

    public C1759x1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f17924a = 19;
        this.f17926c = arrayDeque;
        this.f17925b = bufferedReader;
    }

    public C1759x1(C1.E e7) {
        this.f17924a = 2;
        this.f17927d = e7;
        this.f17925b = new Handler();
        this.f17926c = new C1.D(this);
    }
}
