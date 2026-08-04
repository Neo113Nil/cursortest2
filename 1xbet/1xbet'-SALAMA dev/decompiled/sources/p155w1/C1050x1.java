package p155w1;

import A1.C0044t;
import A1.W;
import A1.x0;
import A5.s;
import C0.AbstractC0082a;
import C0.C0090i;
import C1.E;
import D6.y0;
import E3.F;
import E4.L;
import E4.M;
import G4.C;
import G4.C0269b;
import G4.C0270c;
import G4.C0287u;
import G4.C0288v;
import G4.C0289w;
import G4.D;
import G4.InterfaceC0273f;
import G4.S;
import I2.C0306n;
import J3.b;
import J3.h;
import J3.p;
import K3.j;
import K3.m;
import K3.n;
import L4.r;
import L5.AbstractC0331j;
import L5.C0328g;
import L5.C0330i;
import Q3.i;
import Q3.o;
import Q5.c;
import U.g;
import U3.a;
import V3.N;
import V3.X;
import V3.Y;
import V3.Z;
import V3.f0;
import V3.g0;
import V3.r0;
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
import android.support.v4.media.session.t;
import android.util.Log;
import androidx.lifecycle.AbstractServiceC0727w;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.protobuf.z0;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.sentry.TransactionOptions;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import p031e1.k;
import p068j2.f;
import p096n1.e;
import p109p.l;
import p155w1.C1050x1;
import p155w1.V0;
import p158w4.d;
import p167y2.v;

/* JADX INFO: renamed from: w1.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1050x1 implements C, D, g, a, Continuation, p111p1.a, f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1050x1 f17929e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17933d;

    public /* synthetic */ C1050x1(int i7, boolean z4) {
        this.f17930a = i7;
    }

    public static Bundle H(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static final C1050x1 J(g0 g0Var) throws GeneralSecurityException {
        if (g0Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(g0Var.B());
        for (f0 f0Var : g0Var.C()) {
            f0Var.getClass();
            try {
                try {
                    b bVarA = i.f5812b.a(o.c(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), f0Var.E() == r0.RAW ? null : Integer.valueOf(f0Var.D())));
                    int iOrdinal = f0Var.F().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new h(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e7) {
                throw new W("Creating a protokey serialization failed", e7);
            }
        }
        return new C1050x1(g0Var, Collections.unmodifiableList(arrayList));
    }

    public static final C1050x1 a0(J3.f fVar, P3.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f3842b;
        try {
            N nC = N.C(byteArrayInputStream, C0835o.a());
            byteArrayInputStream.close();
            if (nC.A().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                g0 g0VarG = g0.G(bVar.b(nC.A().z(), bArr), C0835o.a());
                if (g0VarG.B() > 0) {
                    return J(g0VarG);
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

    public static void e0(Activity activity, C1050x1 c1050x1) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, c1050x1);
        activity.setMediaController(c1050x1 != null ? new MediaController(activity, (MediaSession.Token) ((MediaSessionCompat$Token) c1050x1.f17932c).f8016b) : null);
    }

    public static void f0(A5.f fVar, final C1050x1 c1050x1) {
        c cVar = c.f5845d;
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, obj, 1);
        if (c1050x1 != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            C1050x1 c1050x2 = c1050x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1050x2.F((String) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v6.f(arrayList);
                            return;
                        case 1:
                            C1050x1 c1050x3 = c1050x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((p121q5.c) c1050x3.f17933d) == null) {
                                    throw new b();
                                }
                                try {
                                    ((p121q5.c) c1050x3.f17933d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1050x1.H(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            v6.f(arrayList2);
                            return;
                        case 2:
                            C1050x1 c1050x4 = c1050x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1050x4.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v6.f(arrayList4);
                            return;
                        case 3:
                            C1050x1 c1050x5 = c1050x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1050x5.getClass();
                                arrayList6.add(0, Boolean.valueOf(p109p.g.b((Context) c1050x5.f17931b, Collections.emptyList(), false) != null));
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v6.f(arrayList6);
                            return;
                        default:
                            C1050x1 c1050x6 = c1050x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1050x6.getClass();
                                ((Context) c1050x6.f17931b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v6.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, obj, 1);
        if (c1050x1 != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            C1050x1 c1050x2 = c1050x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1050x2.F((String) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v6.f(arrayList);
                            return;
                        case 1:
                            C1050x1 c1050x3 = c1050x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((p121q5.c) c1050x3.f17933d) == null) {
                                    throw new b();
                                }
                                try {
                                    ((p121q5.c) c1050x3.f17933d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1050x1.H(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            v6.f(arrayList2);
                            return;
                        case 2:
                            C1050x1 c1050x4 = c1050x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1050x4.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v6.f(arrayList4);
                            return;
                        case 3:
                            C1050x1 c1050x5 = c1050x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1050x5.getClass();
                                arrayList6.add(0, Boolean.valueOf(p109p.g.b((Context) c1050x5.f17931b, Collections.emptyList(), false) != null));
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v6.f(arrayList6);
                            return;
                        default:
                            C1050x1 c1050x6 = c1050x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1050x6.getClass();
                                ((Context) c1050x6.f17931b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v6.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, obj, 1);
        if (c1050x1 != null) {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            C1050x1 c1050x2 = c1050x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1050x2.F((String) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v6.f(arrayList);
                            return;
                        case 1:
                            C1050x1 c1050x3 = c1050x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((p121q5.c) c1050x3.f17933d) == null) {
                                    throw new b();
                                }
                                try {
                                    ((p121q5.c) c1050x3.f17933d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1050x1.H(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            v6.f(arrayList2);
                            return;
                        case 2:
                            C1050x1 c1050x4 = c1050x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1050x4.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v6.f(arrayList4);
                            return;
                        case 3:
                            C1050x1 c1050x5 = c1050x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1050x5.getClass();
                                arrayList6.add(0, Boolean.valueOf(p109p.g.b((Context) c1050x5.f17931b, Collections.emptyList(), false) != null));
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v6.f(arrayList6);
                            return;
                        default:
                            C1050x1 c1050x6 = c1050x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1050x6.getClass();
                                ((Context) c1050x6.f17931b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v6.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, obj, 1);
        if (c1050x1 != null) {
            final int i10 = 3;
            f10.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            C1050x1 c1050x2 = c1050x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1050x2.F((String) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v6.f(arrayList);
                            return;
                        case 1:
                            C1050x1 c1050x3 = c1050x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((p121q5.c) c1050x3.f17933d) == null) {
                                    throw new b();
                                }
                                try {
                                    ((p121q5.c) c1050x3.f17933d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1050x1.H(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            v6.f(arrayList2);
                            return;
                        case 2:
                            C1050x1 c1050x4 = c1050x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1050x4.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v6.f(arrayList4);
                            return;
                        case 3:
                            C1050x1 c1050x5 = c1050x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1050x5.getClass();
                                arrayList6.add(0, Boolean.valueOf(p109p.g.b((Context) c1050x5.f17931b, Collections.emptyList(), false) != null));
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v6.f(arrayList6);
                            return;
                        default:
                            C1050x1 c1050x6 = c1050x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1050x6.getClass();
                                ((Context) c1050x6.f17931b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v6.f(arrayList7);
                            return;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, obj, 1);
        if (c1050x1 == null) {
            f11.M(null);
        } else {
            final int i11 = 4;
            f11.M(new A5.b() { // from class: Q5.d
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            C1050x1 c1050x2 = c1050x1;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1050x2.F((String) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = P6.b.R(th);
                            }
                            v6.f(arrayList);
                            return;
                        case 1:
                            C1050x1 c1050x3 = c1050x1;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((p121q5.c) c1050x3.f17933d) == null) {
                                    throw new b();
                                }
                                try {
                                    ((p121q5.c) c1050x3.f17933d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", C1050x1.H(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = P6.b.R(th2);
                            }
                            v6.f(arrayList2);
                            return;
                        case 2:
                            C1050x1 c1050x4 = c1050x1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, c1050x4.X((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = P6.b.R(th3);
                            }
                            v6.f(arrayList4);
                            return;
                        case 3:
                            C1050x1 c1050x5 = c1050x1;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1050x5.getClass();
                                arrayList6.add(0, Boolean.valueOf(p109p.g.b((Context) c1050x5.f17931b, Collections.emptyList(), false) != null));
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = P6.b.R(th4);
                            }
                            v6.f(arrayList6);
                            return;
                        default:
                            C1050x1 c1050x6 = c1050x1;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                c1050x6.getClass();
                                ((Context) c1050x6.f17931b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = P6.b.R(th5);
                            }
                            v6.f(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    public static void i0(HashMap map) {
        if (!"websocket".equals(map.get("upgrade"))) {
            throw new d("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(map.get("connection"))) {
            throw new d("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void j0(String str) {
        int i7 = Integer.parseInt(str.substring(9, 12));
        if (i7 == 407) {
            throw new d("connection failed: proxy authentication not supported");
        }
        if (i7 == 404) {
            throw new d("connection failed: 404 not found");
        }
        if (i7 != 101) {
            throw new d(k.d(i7, "connection failed: unknown status code "));
        }
    }

    public static synchronized C1050x1 z() {
        try {
            if (f17929e == null) {
                f17929e = new C1050x1(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17929e;
    }

    public void A(C2 c3) {
        A1 a2 = (A1) ((e) ((x0) this.f17931b).f613b).f15314b;
        if (a2 != null) {
            a2.k(c3);
        }
    }

    public void B(double d7, float f7) {
        int length = ((float[]) this.f17931b).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f17932c, d7);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f17932c = Arrays.copyOf((double[]) this.f17932c, length);
        this.f17931b = Arrays.copyOf((float[]) this.f17931b, length);
        this.f17933d = new double[length];
        double[] dArr = (double[]) this.f17932c;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f17932c)[iBinarySearch] = d7;
        ((float[]) this.f17931b)[iBinarySearch] = f7;
    }

    public m C() throws GeneralSecurityException {
        C1010l1 c1010l1;
        n nVar = (n) this.f17931b;
        if (nVar == null || (c1010l1 = (C1010l1) this.f17932c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f3935b != ((X3.a) c1010l1.f17777a).f7473a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        j jVar = j.f3916h;
        j jVar2 = nVar.f3938e;
        if (jVar2 != jVar && ((Integer) this.f17933d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f17933d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            X3.a.a(new byte[0]);
        } else if (jVar2 == j.f3915g) {
            X3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17933d).intValue()).array());
        } else {
            if (jVar2 != j.f3914f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((n) this.f17931b).f3938e);
            }
            X3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17933d).intValue()).array());
        }
        return new m();
    }

    public R3.e D() throws GeneralSecurityException {
        Integer num = (Integer) this.f17931b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f17932c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((R3.d) this.f17933d) != null) {
            return new R3.e(num.intValue(), ((Integer) this.f17932c).intValue(), (R3.d) this.f17933d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public p023d1.o E() {
        UUID uuid = (UUID) this.f17931b;
        p088m1.i iVar = (p088m1.i) this.f17932c;
        HashSet hashSet = (HashSet) this.f17933d;
        p023d1.o oVar = new p023d1.o();
        oVar.f12372a = uuid;
        oVar.f12373b = iVar;
        oVar.f12374c = hashSet;
        p023d1.c cVar = iVar.j;
        boolean z4 = cVar.f12356h.f12359a.size() > 0 || cVar.f12352d || cVar.f12350b || cVar.f12351c;
        if (((p088m1.i) this.f17932c).f15237q && z4) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f17931b = UUID.randomUUID();
        p088m1.i iVar2 = (p088m1.i) this.f17932c;
        p088m1.i iVar3 = new p088m1.i();
        iVar3.f15223b = 1;
        p023d1.g gVar = p023d1.g.f12362c;
        iVar3.f15226e = gVar;
        iVar3.f15227f = gVar;
        iVar3.j = p023d1.c.f12348i;
        iVar3.f15232l = 1;
        iVar3.f15233m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        iVar3.f15236p = -1L;
        iVar3.f15238r = 1;
        iVar3.f15222a = iVar2.f15222a;
        iVar3.f15224c = iVar2.f15224c;
        iVar3.f15223b = iVar2.f15223b;
        iVar3.f15225d = iVar2.f15225d;
        iVar3.f15226e = new p023d1.g(iVar2.f15226e);
        iVar3.f15227f = new p023d1.g(iVar2.f15227f);
        iVar3.f15228g = iVar2.f15228g;
        iVar3.f15229h = iVar2.f15229h;
        iVar3.f15230i = iVar2.f15230i;
        p023d1.c cVar2 = iVar2.j;
        p023d1.c cVar3 = new p023d1.c();
        cVar3.f12349a = 1;
        cVar3.f12354f = -1L;
        cVar3.f12355g = -1L;
        cVar3.f12356h = new p023d1.e();
        cVar3.f12350b = cVar2.f12350b;
        cVar3.f12351c = cVar2.f12351c;
        cVar3.f12349a = cVar2.f12349a;
        cVar3.f12352d = cVar2.f12352d;
        cVar3.f12353e = cVar2.f12353e;
        cVar3.f12356h = cVar2.f12356h;
        iVar3.j = cVar3;
        iVar3.f15231k = iVar2.f15231k;
        iVar3.f15232l = iVar2.f15232l;
        iVar3.f15233m = iVar2.f15233m;
        iVar3.f15234n = iVar2.f15234n;
        iVar3.f15235o = iVar2.f15235o;
        iVar3.f15236p = iVar2.f15236p;
        iVar3.f15237q = iVar2.f15237q;
        iVar3.f15238r = iVar2.f15238r;
        this.f17932c = iVar3;
        iVar3.f15222a = ((UUID) this.f17931b).toString();
        return oVar;
    }

    public Boolean F(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(((C0044t) this.f17932c).f563b.getPackageManager());
        String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
        return shortString == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString));
    }

    public void G(Runnable runnable) {
        ((p096n1.h) this.f17931b).execute(runnable);
    }

    public int I(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.f17933d;
        int size = arrayList.size();
        while (i8 < size) {
            ((AbstractC0082a) arrayList.get(i8)).getClass();
            i8++;
        }
        return i7;
    }

    public HashMap K(List list, H4.b bVar, int i7, B1.c cVar, p023d1.n nVar) {
        Timestamp timestamp = bVar.f3305a.f3333a;
        StringBuilder sbH = r.h(" UNION ", "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size());
        sbH.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        boolean z4 = true;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            H4.m mVar = (H4.m) it.next();
            String strC = p113p3.f.C(mVar);
            int i9 = i8 + 1;
            objArr[i8] = strC;
            int i10 = i8 + 2;
            StringBuilder sb = new StringBuilder(strC);
            int length = sb.length() - (z4 ? 1 : 0);
            char cCharAt = sb.charAt(length);
            Iterator it2 = it;
            if (cCharAt != z4) {
                z4 = false;
            }
            p113p3.f.O("successor may only operate on paths generated by encode", z4, new Object[0]);
            sb.setCharAt(length, (char) (cCharAt + 1));
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
            objArr[i12] = p113p3.f.C(bVar.f3306b.f3318a);
            it = it2;
            z4 = true;
        }
        objArr[i8] = Integer.valueOf(i7);
        L4.g gVar = new L4.g();
        HashMap map = new HashMap();
        C1017n0 c1017n0C0 = ((S) this.f17931b).c0(sbH.toString());
        c1017n0C0.c(objArr);
        Cursor cursorJ = c1017n0C0.J();
        while (cursorJ.moveToNext()) {
            try {
                Z(gVar, map, cursorJ, cVar);
                if (nVar != null) {
                    nVar.f12371a++;
                }
            } catch (Throwable th) {
                if (cursorJ == null) {
                    throw th;
                }
                try {
                    cursorJ.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorJ.close();
        gVar.a();
        return map;
    }

    public byte[] L() {
        URI uri = (URI) this.f17931b;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder sbC = p136t.e.c(path);
        sbC.append(query == null ? "" : "?".concat(query));
        String string = sbC.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            StringBuilder sbD = p136t.e.d(host, ":");
            sbD.append(uri.getPort());
            host = sbD.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f17932c);
        HashMap map = (HashMap) this.f17933d;
        for (String str : map.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        StringBuilder sbC2 = p136t.e.c(AbstractC0486a1.h("GET ", string, " HTTP/1.1\r\n"));
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(": ");
            str2 = k.i(sb, (String) linkedHashMap.get(str3), "\r\n");
        }
        sbC2.append(str2);
        byte[] bytes = k.e(sbC2.toString(), "\r\n").getBytes(Charset.defaultCharset());
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
        int iBinarySearch = Arrays.binarySearch((double[]) this.f17932c, d7);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i7 = -iBinarySearch;
        int i8 = i7 - 1;
        float[] fArr = (float[]) this.f17931b;
        float f7 = fArr[i8];
        int i9 = i7 - 2;
        float f8 = fArr[i9];
        double[] dArr = (double[]) this.f17932c;
        double d8 = dArr[i8];
        double d9 = dArr[i9];
        double d10 = ((double) (f7 - f8)) / (d8 - d9);
        return ((((d7 * d7) - (d9 * d9)) * d10) / 2.0d) + ((d7 - d9) * (((double) f8) - (d10 * d9))) + ((double[]) this.f17933d)[i9];
    }

    public Object N(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference atomicReference = J3.n.f3855a;
        try {
            clsA = Q3.h.f5810b.a(cls);
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i7 = p.f3860a;
        g0 g0Var = (g0) this.f17931b;
        int iD = g0Var.D();
        Iterator it = g0Var.C().iterator();
        boolean z4 = true;
        int i8 = 0;
        boolean z7 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            Z z8 = Z.ENABLED;
            if (!zHasNext) {
                if (i8 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z7 && !z4) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                p072k1.g gVar = new p072k1.g();
                gVar.f14681b = new ConcurrentHashMap();
                gVar.f14680a = clsA;
                gVar.f14683d = T3.a.f6342b;
                if (((ConcurrentHashMap) gVar.f14681b) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                gVar.f14683d = (T3.a) this.f17933d;
                for (int i9 = 0; i9 < g0Var.B(); i9++) {
                    f0 f0VarA = g0Var.A(i9);
                    if (f0VarA.F().equals(z8)) {
                        try {
                            Y yC = f0VarA.C();
                            AtomicReference atomicReference2 = J3.n.f3855a;
                            objC = J3.n.c(yC.D(), yC.E(), clsA);
                        } catch (GeneralSecurityException e7) {
                            if (!e7.getMessage().contains("No key manager found for key type ") && !e7.getMessage().contains(" not supported by key manager of type ")) {
                                throw e7;
                            }
                            objC = null;
                        }
                        List list = (List) this.f17932c;
                        if (list.get(i9) != null) {
                            try {
                                objB = J3.n.b(((h) list.get(i9)).f3844a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (f0VarA.D() == g0Var.D()) {
                            gVar.d(objB, objC, f0VarA, true);
                        } else {
                            gVar.d(objB, objC, f0VarA, false);
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gVar.f14681b;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                J3.k kVar = (J3.k) gVar.f14682c;
                T3.a aVar = (T3.a) gVar.f14683d;
                Class cls2 = (Class) gVar.f14680a;
                t tVar = new t(concurrentHashMap, kVar, aVar, cls2);
                gVar.f14681b = null;
                AtomicReference atomicReference3 = J3.n.f3855a;
                HashMap map = ((Q3.n) Q3.h.f5810b.f5811a.get()).f5821b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                J3.m mVar = (J3.m) map.get(cls);
                if (cls2.equals(mVar.a()) && mVar.a().equals(cls2)) {
                    return mVar.c(tVar);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            f0 f0Var = (f0) it.next();
            if (f0Var.F() == z8) {
                if (!f0Var.G()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.E() == r0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.F() == Z.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(f0Var.D())));
                }
                if (f0Var.D() == iD) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                if (f0Var.C().C() != X.ASYMMETRIC_PUBLIC) {
                    z4 = false;
                }
                i8++;
            }
        }
    }

    public double O(double d7, double d8) {
        return Math.sin((M(d7) + d8) * 6.283185307179586d);
    }

    public boolean P() throws IOException {
        String strTrim;
        if (((String) this.f17933d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f17932c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f17933d = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.f17931b).readLine();
            this.f17933d = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f17933d = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public void Q(HashMap map) {
        new Handler(Looper.getMainLooper()).post(new y0(10, this, map, false));
    }

    public boolean R(H4.h hVar) {
        C0288v c0288v = (C0288v) this.f17932c;
        if (c0288v.f3034f.f3039b.l(hVar)) {
            return true;
        }
        for (C0287u c0287u : c0288v.f3031c.values()) {
            c0287u.getClass();
            boolean zEquals = false;
            F fM = c0287u.f3026b.m(new C0270c(hVar, 0));
            if (((Iterator) fM.f1994b).hasNext()) {
                zEquals = ((C0270c) fM.next()).f2964a.equals(hVar);
            }
            if (zEquals) {
                return true;
            }
        }
        V0 v6 = (V0) this.f17931b;
        return v6 != null && v6.l(hVar);
    }

    public String S() {
        if (!P()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f17933d;
        this.f17933d = null;
        return str;
    }

    public void T(int i7, C0328g c0328g) {
        HashMap map = new HashMap();
        AbstractC0486a1.m(i7, map, "adId", "eventName", "onAdFailedToLoad");
        map.put("loadAdError", c0328g);
        Q(map);
    }

    public void U(int i7, v vVar) {
        HashMap map = new HashMap();
        AbstractC0486a1.m(i7, map, "adId", "eventName", "onAdLoaded");
        map.put("responseInfo", vVar == null ? null : new C0330i(vVar));
        Q(map);
    }

    public void V(int i7, String str, String str2) {
        HashMap map = new HashMap();
        AbstractC0486a1.m(i7, map, "adId", "eventName", "onAppEvent");
        map.put("name", str);
        map.put("data", str2);
        Q(map);
    }

    public void W(int i7, L5.N n2) {
        HashMap map = new HashMap();
        AbstractC0486a1.m(i7, map, "adId", "eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", n2);
        Q(map);
    }

    public Boolean X(String str, Boolean bool, Q5.e eVar, Q5.a aVar) {
        if (((p121q5.c) this.f17933d) == null) {
            throw new Q5.b();
        }
        Bundle bundleH = H(eVar.f5850c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f5850c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "accept":
                        case "content-language":
                        case "content-type":
                        case "accept-language":
                            break;
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    p121q5.c cVar = (p121q5.c) this.f17933d;
                    p109p.k kVar = new p109p.k();
                    kVar.f15649a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f5843a.booleanValue() ? 1 : 0);
                    l lVarA = kVar.a();
                    lVarA.f15656a.putExtra("com.android.browser.headers", bundleH);
                    try {
                        lVarA.a(cVar, uri);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        p121q5.c cVar2 = (p121q5.c) this.f17933d;
        boolean zBooleanValue = eVar.f5848a.booleanValue();
        boolean zBooleanValue2 = eVar.f5849b.booleanValue();
        int i7 = WebViewActivity.f14225e;
        try {
            ((p121q5.c) this.f17933d).startActivity(new Intent(cVar2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", zBooleanValue).putExtra("enableDomStorage", zBooleanValue2).putExtra("com.android.browser.headers", bundleH));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void Y(EnumC0718m enumC0718m) {
        RunnableC0521m0 runnableC0521m0 = (RunnableC0521m0) this.f17933d;
        if (runnableC0521m0 != null) {
            runnableC0521m0.run();
        }
        RunnableC0521m0 runnableC0521m1 = new RunnableC0521m0((C0726v) this.f17931b, enumC0718m);
        this.f17933d = runnableC0521m1;
        ((Handler) this.f17932c).postAtFrontOfQueue(runnableC0521m1);
    }

    public void Z(L4.g gVar, final HashMap map, Cursor cursor, final B1.c cVar) {
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
                C1050x1 c1050x1 = this.f2937a;
                byte[] bArr = blob;
                int i9 = i7;
                int i10 = i8;
                B1.c cVar2 = cVar;
                HashMap map2 = map;
                c1050x1.getClass();
                try {
                    H4.k kVarB = ((R4.c) c1050x1.f17932c).B(J4.b.F(bArr));
                    kVarB.f3326d = new H4.n(new Timestamp(i9, i10));
                    if (cVar2 == null || ((Boolean) cVar2.apply(kVarB)).booleanValue()) {
                        synchronized (map2) {
                            map2.put(kVarB.f3323a, kVarB);
                        }
                    }
                } catch (com.google.protobuf.M e7) {
                    p113p3.f.F("MaybeDocument failed to parse: %s", e7);
                    throw null;
                }
            }
        });
    }

    @Override // G4.C
    public void a(G4.Z z4) {
        C0288v c0288v = (C0288v) this.f17932c;
        int i7 = z4.f2954b;
        C0289w c0289w = c0288v.f3034f;
        Iterator it = c0289w.f3039b.T(i7).iterator();
        while (true) {
            F f7 = (F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                c0289w.f3038a.remove(z4.f2953a);
                c0289w.f3039b.W(z4.f2954b);
                return;
            } else {
                ((HashSet) this.f17933d).add((H4.h) f7.next());
            }
        }
    }

    @Override // U.g
    public Uri b() {
        return (Uri) this.f17931b;
    }

    public void b0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0082a abstractC0082a = (AbstractC0082a) arrayList.get(i7);
            abstractC0082a.getClass();
            ((O.c) this.f17931b).c(abstractC0082a);
        }
        arrayList.clear();
    }

    public void c0(p049g5.e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f17933d).add(eVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        eVar.b(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f17931b;
        hVar.f8047a.registerCallback(eVar.f13252a, handler);
        synchronized (hVar.f8048b) {
            if (hVar.f8051e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(eVar);
                hVar.f8050d.put(eVar, gVar);
                eVar.f13254c = gVar;
                try {
                    hVar.f8051e.a().e(gVar);
                    eVar.a(13, null, null);
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                }
            } else {
                eVar.f13254c = null;
                hVar.f8049c.add(eVar);
            }
        }
    }

    @Override // p068j2.f
    public int d(long j) {
        long[] jArr = (long[]) this.f17933d;
        int iB = p151v2.t.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void d0(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.f17931b = Integer.valueOf(i7);
    }

    @Override // G4.D
    public void e(InterfaceC0273f interfaceC0273f) {
        this.f17933d = interfaceC0273f;
    }

    @Override // G4.C
    public void f() {
        C0288v c0288v = (C0288v) this.f17932c;
        ArrayList arrayList = new ArrayList();
        for (H4.h hVar : (HashSet) this.f17933d) {
            if (!R(hVar)) {
                arrayList.add(hVar);
            }
        }
        c0288v.f3036h.o(arrayList);
        this.f17933d = null;
    }

    @Override // G4.C
    public void g() {
        this.f17933d = new HashSet();
    }

    public I4.h g0(H4.h hVar, I4.n nVar) {
        I4.f fVar = (I4.f) this.f17932c;
        return fVar != null ? new I4.m(hVar, (H4.l) this.f17931b, fVar, nVar, (List) this.f17933d) : new I4.p(hVar, (H4.l) this.f17931b, nVar, (List) this.f17933d);
    }

    @Override // U.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f17932c;
    }

    @Override // p068j2.f
    public long h(int i7) {
        p151v2.a.f(i7 >= 0);
        long[] jArr = (long[]) this.f17933d;
        p151v2.a.f(i7 < jArr.length);
        return jArr[i7];
    }

    public void h0(AbstractC0331j abstractC0331j, int i7) {
        HashMap map = (HashMap) this.f17932c;
        if (map.get(Integer.valueOf(i7)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i7)));
        }
        map.put(Integer.valueOf(i7), abstractC0331j);
    }

    @Override // G4.D
    public void i(H4.k kVar, H4.n nVar) {
        p113p3.f.O("Cannot add document to the RemoteDocumentCache with a read time of zero", !nVar.equals(H4.n.f3332b), new Object[0]);
        R4.c cVar = (R4.c) this.f17932c;
        J4.a aVarE = J4.b.E();
        boolean zE = kVar.e();
        P2 p5 = (P2) cVar.f6064b;
        H4.h hVar = kVar.f3323a;
        if (zE) {
            J4.c cVarA = J4.d.A();
            String strU = p5.u(hVar);
            cVarA.d();
            J4.d.v((J4.d) cVarA.f12096b, strU);
            z0 z0VarY = P2.y(kVar.f3325c.f3333a);
            cVarA.d();
            J4.d.w((J4.d) cVarA.f12096b, z0VarY);
            J4.d dVar = (J4.d) cVarA.b();
            aVarE.d();
            J4.b.w((J4.b) aVarE.f12096b, dVar);
        } else if (kVar.d()) {
            C0593q c0593qC = C0595s.C();
            String strU2 = p5.u(hVar);
            c0593qC.d();
            C0595s.v((C0595s) c0593qC.f12096b, strU2);
            Map mapY = kVar.f3327e.b().N().y();
            c0593qC.d();
            C0595s.w((C0595s) c0593qC.f12096b).putAll(mapY);
            z0 z0VarY2 = P2.y(kVar.f3325c.f3333a);
            c0593qC.d();
            C0595s.x((C0595s) c0593qC.f12096b, z0VarY2);
            C0595s c0595s = (C0595s) c0593qC.b();
            aVarE.d();
            J4.b.x((J4.b) aVarE.f12096b, c0595s);
        } else {
            if (!p136t.e.b(kVar.f3324b, 4)) {
                p113p3.f.F("Cannot encode invalid document %s", kVar);
                throw null;
            }
            J4.h hVarA = J4.i.A();
            String strU3 = p5.u(hVar);
            hVarA.d();
            J4.i.v((J4.i) hVarA.f12096b, strU3);
            z0 z0VarY3 = P2.y(kVar.f3325c.f3333a);
            hVarA.d();
            J4.i.w((J4.i) hVarA.f12096b, z0VarY3);
            J4.i iVar = (J4.i) hVarA.b();
            aVarE.d();
            J4.b.y((J4.b) aVarE.f12096b, iVar);
        }
        boolean zB = p136t.e.b(kVar.f3328f, 2);
        aVarE.d();
        J4.b.v((J4.b) aVarE.f12096b, zB);
        J4.b bVar = (J4.b) aVarE.b();
        String strC = p113p3.f.C(hVar.f3318a);
        Integer numValueOf = Integer.valueOf(hVar.f3318a.f3312a.size());
        Timestamp timestamp = nVar.f3333a;
        ((S) this.f17931b).b0("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", strC, numValueOf, Long.valueOf(timestamp.f11828a), Integer.valueOf(timestamp.f11829b), bVar.d());
        ((InterfaceC0273f) this.f17933d).s(hVar.d());
    }

    @Override // U.g
    public Uri j() {
        return (Uri) this.f17933d;
    }

    @Override // U3.a
    public byte[] k(int i7, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrV;
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!p150v0.a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) W3.i.f6718b.f6720a.R("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f17931b);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrV = P6.b.U(bArr, (iMax - 1) * 16, (byte[]) this.f17932c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrV = P6.b.V(bArrCopyOf, (byte[]) this.f17933d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i8 = 0; i8 < iMax - 1; i8++) {
            bArrDoFinal = cipher.doFinal(P6.b.U(bArrDoFinal, 0, bArr, i8 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(P6.b.V(bArrV, bArrDoFinal)), i7);
    }

    @Override // G4.C
    public long l() {
        return -1L;
    }

    @Override // p068j2.f
    public List m(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f17931b;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f17932c;
            if (jArr[i8] <= j && j < jArr[i8 + 1]) {
                p132s2.c cVar = (p132s2.c) list.get(i7);
                p068j2.b bVar = cVar.f16122a;
                if (bVar.f14587e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new C0269b(15));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            p068j2.b bVar2 = ((p132s2.c) arrayList2.get(i9)).f16122a;
            arrayList.add(new p068j2.b(bVar2.f14583a, bVar2.f14584b, bVar2.f14585c, bVar2.f14586d, (-1) - i9, 1, bVar2.f14589x, bVar2.f14590y, bVar2.f14591z, bVar2.f14579E, bVar2.f14580F, bVar2.f14575A, bVar2.f14576B, bVar2.f14577C, bVar2.f14578D, bVar2.f14581G, bVar2.f14582H));
        }
        return arrayList;
    }

    @Override // G4.D
    public HashMap n(Iterable iterable) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            arrayList.add(p113p3.f.C(hVar.f3318a));
            map.put(hVar, H4.k.g(hVar));
        }
        S s7 = (S) this.f17931b;
        L l7 = new L();
        l7.f2141a = 0;
        l7.f2142b = s7;
        l7.f2143c = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
        l7.f2145e = Collections.emptyList();
        l7.f2144d = ") ORDER BY path";
        l7.f2146f = arrayList.iterator();
        L4.g gVar = new L4.g();
        while (((Iterator) l7.f2146f).hasNext()) {
            Cursor cursorJ = l7.t().J();
            while (cursorJ.moveToNext()) {
                try {
                    Z(gVar, map, cursorJ, null);
                } catch (Throwable th) {
                    if (cursorJ != null) {
                        try {
                            cursorJ.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorJ.close();
        }
        gVar.a();
        return map;
    }

    @Override // G4.D
    public void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        p075k4.c cVarD = H4.g.f3315a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            arrayList2.add(p113p3.f.C(hVar.f3318a));
            cVarD = cVarD.D(hVar, H4.k.h(hVar, H4.n.f3332b));
        }
        List listEmptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(listEmptyList);
            for (int i7 = 0; it2.hasNext() && i7 < 900 - listEmptyList.size(); i7++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            ((S) this.f17931b).b0("DELETE FROM remote_documents WHERE path IN (" + ((Object) r.h(", ", "?", array.length)) + ")", array);
        }
        ((InterfaceC0273f) this.f17933d).e(cVarD);
    }

    @Override // p068j2.f
    public int p() {
        return ((long[]) this.f17933d).length;
    }

    @Override // G4.C
    public void q(H4.h hVar) {
        ((HashSet) this.f17933d).add(hVar);
    }

    @Override // G4.C
    public void r(H4.h hVar) {
        ((HashSet) this.f17933d).add(hVar);
    }

    @Override // G4.C
    public void s(H4.h hVar) {
        ((HashSet) this.f17933d).remove(hVar);
    }

    @Override // G4.C
    public void t(V0 v6) {
        this.f17931b = v6;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        p034e4.j jVar = (p034e4.j) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) ((FirebaseUser) this.f17933d)).f11910c));
        String str = jVar.f12687a;
        com.google.android.gms.common.internal.D.i(str);
        firebaseAuth.getClass();
        com.google.android.gms.common.internal.D.e(str);
        String str2 = (String) this.f17931b;
        com.google.android.gms.common.internal.D.e(str2);
        ActionCodeSettings actionCodeSettings = (ActionCodeSettings) this.f17932c;
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
        switch (this.f17930a) {
            case 6:
                return p.a((g0) this.f17931b).toString();
            case 23:
                return "pos =" + Arrays.toString((double[]) this.f17932c) + " period=" + Arrays.toString((float[]) this.f17931b);
            default:
                return super.toString();
        }
    }

    @Override // G4.D
    public HashMap u(E4.C c3, H4.b bVar, Set set, p023d1.n nVar) {
        return K(Collections.singletonList(c3.f2095f), bVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, new B1.c(8, c3, set), nVar);
    }

    @Override // G4.D
    public Map v(String str, H4.b bVar, int i7) {
        List listB = ((InterfaceC0273f) this.f17933d).B(str);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add((H4.m) ((H4.m) it.next()).b(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return K(arrayList, bVar, i7, null, null);
        }
        HashMap map = new HashMap();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int i9 = i8 + 100;
            map.putAll(K(arrayList.subList(i8, Math.min(arrayList.size(), i9)), bVar, i7, null, null));
            i8 = i9;
        }
        C0269b c0269b = H4.b.f3304e;
        H5.k kVar = r.f4389a;
        if (map.size() > i7) {
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new M(c0269b, 2));
            map = new HashMap();
            for (int i10 = 0; i10 < i7; i10++) {
                map.put(((Map.Entry) arrayList2.get(i10)).getKey(), ((Map.Entry) arrayList2.get(i10)).getValue());
            }
        }
        return map;
    }

    @Override // U.g
    public Object w() {
        return null;
    }

    @Override // G4.C
    public void x(H4.h hVar) {
        if (R(hVar)) {
            ((HashSet) this.f17933d).remove(hVar);
        } else {
            ((HashSet) this.f17933d).add(hVar);
        }
    }

    @Override // G4.D
    public H4.k y(H4.h hVar) {
        return (H4.k) n(Collections.singletonList(hVar)).get(hVar);
    }

    public /* synthetic */ C1050x1(Object obj, Object obj2, Object obj3, int i7) {
        this.f17930a = i7;
        this.f17931b = obj;
        this.f17932c = obj2;
        this.f17933d = obj3;
    }

    public C1050x1(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f17930a = 18;
        this.f17931b = str;
        this.f17932c = actionCodeSettings;
        this.f17933d = firebaseUser;
    }

    public C1050x1(int i7) {
        this.f17930a = i7;
        switch (i7) {
            case 25:
                this.f17931b = new ConcurrentLinkedQueue();
                break;
            default:
                x0 x0Var = new x0(21, false);
                e eVar = new e(23);
                B1 b7 = new B1(null);
                b7.f17294D = null;
                b7.f17295E = null;
                b7.f17296F = true;
                b7.f17297G = null;
                b7.f17297G = new C1047w1();
                E1 e7 = new E1(b7);
                e7.f17369E = new EnumMap(D2.class);
                e7.f17370F = new EnumMap(D2.class);
                D2[] d2Arr = E1.f17366G;
                for (int i8 = 0; i8 < 18; i8++) {
                    ((EnumMap) e7.f17369E).put(d2Arr[i8], (Object) null);
                }
                ((EnumMap) e7.f17370F).put(E1.f17367H[0], (Object) null);
                D1 d7 = new D1(new E1(e7));
                p145u1.c cVar = new p145u1.c(d7, 28);
                ArrayList arrayList = new ArrayList();
                d7.f17326D = arrayList;
                P1 p5 = new P1();
                p5.f17505d = false;
                p5.f17506e = null;
                p5.f17507f = null;
                p5.f17508g = Long.MIN_VALUE;
                p5.f17509h = Long.MIN_VALUE;
                p5.f17510i = Long.MIN_VALUE;
                p5.j = 1;
                p5.f17511k = 1;
                p5.f17504c = cVar;
                if (p5.f17502a == null) {
                    p5.f17502a = new HashMap();
                }
                p5.f17502a.clear();
                p5.f17502a.put(D2.SESSION_INFO, null);
                p5.f17502a.put(D2.APP_STATE, null);
                p5.f17502a.put(D2.APP_INFO, null);
                p5.f17502a.put(D2.REPORTED_ID, null);
                p5.f17502a.put(D2.DEVICE_PROPERTIES, null);
                p5.f17502a.put(D2.SESSION_ID, null);
                p5.f17502a = p5.f17502a;
                p5.f17503b = new AtomicBoolean(false);
                arrayList.add(p5);
                eVar.f15314b = new A1(d7);
                x0Var.f613b = eVar;
                this.f17931b = x0Var;
                C1047w1 c1047w1 = new C1047w1(AbstractC1044v1.a(EnumC1038t1.f17869a), false);
                c1047w1.f17919z = null;
                c1047w1.f17919z = new PriorityQueue(4, new C0090i(8));
                c1047w1.f17918A = new C1034s0();
                this.f17933d = c1047w1;
                C1047w1 c1047w2 = new C1047w1(AbstractC1044v1.a(EnumC1038t1.f17870b), false);
                c1047w2.f17919z = null;
                c1047w2.f17918A = c1047w1;
                this.f17932c = c1047w2;
                break;
        }
    }

    @Override // U.g
    public void c() {
    }

    public C1050x1(AbstractServiceC0727w abstractServiceC0727w) {
        this.f17930a = 16;
        this.f17931b = new C0726v(abstractServiceC0727w);
        this.f17932c = new Handler();
    }

    public C1050x1(C0288v c0288v) {
        this.f17930a = 4;
        this.f17932c = c0288v;
    }

    public C1050x1(ArrayList arrayList) {
        this.f17930a = 22;
        this.f17931b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f17932c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            p132s2.c cVar = (p132s2.c) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f17932c;
            jArr[i8] = cVar.f16123b;
            jArr[i8 + 1] = cVar.f16124c;
        }
        long[] jArr2 = (long[]) this.f17932c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f17933d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C1050x1(ExecutorService executorService) {
        this.f17930a = 21;
        this.f17932c = new Handler(Looper.getMainLooper());
        this.f17933d = new L.f(this, 2);
        this.f17931b = new p096n1.h(executorService);
    }

    public C1050x1(s sVar) {
        this.f17930a = 8;
        this.f17933d = sVar;
        this.f17932c = new HashMap();
    }

    public C1050x1(Context context) {
        this.f17930a = 10;
        C0044t c0044t = new C0044t(context, 4);
        this.f17931b = context;
        this.f17932c = c0044t;
    }

    public C1050x1(byte[] bArr) throws GeneralSecurityException {
        this.f17930a = 13;
        W3.o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17931b = secretKeySpec;
        if (p150v0.a.a(1)) {
            Cipher cipher = (Cipher) W3.i.f6718b.f6720a.R("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrZ = p113p3.f.z(cipher.doFinal(new byte[16]));
            this.f17932c = bArrZ;
            this.f17933d = p113p3.f.z(bArrZ);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public C1050x1(S s7, R4.c cVar) {
        this.f17930a = 5;
        this.f17931b = s7;
        this.f17932c = cVar;
    }

    public C1050x1(C1013m0 c1013m0) {
        this.f17930a = 1;
        this.f17931b = new O.c(30);
        this.f17932c = new ArrayList();
        this.f17933d = new ArrayList();
        new C1009l0(this);
    }

    public C1050x1(Class cls) {
        this.f17930a = 17;
        this.f17933d = new HashSet();
        this.f17931b = UUID.randomUUID();
        this.f17932c = new p088m1.i(((UUID) this.f17931b).toString(), cls.getName());
        ((HashSet) this.f17933d).add(cls.getName());
        ((p088m1.i) this.f17932c).f15225d = OverwritingInputMerger.class.getName();
    }

    public C1050x1(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f17930a = 15;
        if (mediaSessionCompat$Token != null) {
            this.f17933d = Collections.synchronizedSet(new HashSet());
            this.f17932c = mediaSessionCompat$Token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f17931b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f17931b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public C1050x1(g0 g0Var, List list) {
        this.f17930a = 6;
        this.f17931b = g0Var;
        this.f17932c = list;
        this.f17933d = T3.a.f6342b;
    }

    public C1050x1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f17930a = 19;
        this.f17932c = arrayDeque;
        this.f17931b = bufferedReader;
    }

    public C1050x1(E e7) {
        this.f17930a = 2;
        this.f17933d = e7;
        this.f17931b = new Handler();
        this.f17932c = new C1.D(this);
    }
}
