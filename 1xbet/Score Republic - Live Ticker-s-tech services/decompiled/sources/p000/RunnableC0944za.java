package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0030a;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0944za implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9711j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9712k;

    public /* synthetic */ RunnableC0944za(int i, Object obj) {
        this.f9711j = i;
        this.f9712k = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m5870a() {
        n71 n71Var = (n71) this.f9712k;
        synchronized (((ArrayDeque) n71Var.f5321d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) n71Var.f5319b).edit();
            String str = (String) n71Var.f5318a;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) n71Var.f5321d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) n71Var.f5320c);
            }
            editorEdit.putString(str, sb.toString()).apply();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f9711j) {
            case 0:
                C0012ab c0012ab = (C0012ab) this.f9712k;
                a81 a81Var = c0012ab.f125d;
                if (a81Var != null) {
                    fc1 fc1Var = (fc1) a81Var.f63k;
                    if (!fc1Var.f2377l && !fc1Var.f2376k) {
                        a81Var.m80d();
                    }
                }
                c0012ab.f124c = null;
                return;
            case 1:
                ViewTreeObserverOnDrawListenerC0141dk viewTreeObserverOnDrawListenerC0141dk = (ViewTreeObserverOnDrawListenerC0141dk) this.f9712k;
                Runnable runnable = viewTreeObserverOnDrawListenerC0141dk.f1672k;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0141dk.f1672k = null;
                    return;
                }
                return;
            case 2:
                DialogC0362jk.m2917b((DialogC0362jk) this.f9712k);
                return;
            case 3:
                g40 g40Var = (g40) this.f9712k;
                synchronized (g40Var.f2604m) {
                    try {
                        if (g40Var.f2608q == null) {
                            return;
                        }
                        try {
                            q40 q40VarM1976b = g40Var.m1976b();
                            int i = q40VarM1976b.f6372f;
                            if (i == 2) {
                                synchronized (g40Var.f2604m) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                nc1 nc1Var = g40Var.f2603l;
                                Context context = g40Var.f2601j;
                                nc1Var.getClass();
                                Typeface typefaceM5790a = ye1.m5790a(context, new q40[]{q40VarM1976b}, 0);
                                MappedByteBuffer mappedByteBufferM5194f = vt1.m5194f(g40Var.f2601j, q40VarM1976b.f6367a);
                                if (mappedByteBufferM5194f == null || typefaceM5790a == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    f71 f71Var = new f71(typefaceM5790a, xe1.m5642k(mappedByteBufferM5194f));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (g40Var.f2604m) {
                                        try {
                                            d71 d71Var = g40Var.f2608q;
                                            if (d71Var != null) {
                                                d71Var.mo1123l(f71Var);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    g40Var.m1975a();
                                    return;
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (g40Var.f2604m) {
                                try {
                                    d71 d71Var2 = g40Var.f2608q;
                                    if (d71Var2 != null) {
                                        d71Var2.mo1121j(th4);
                                    }
                                    g40Var.m1975a();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 4:
                r40 r40Var = (r40) this.f9712k;
                boolean z2 = r40Var.f6706k;
                if ((!z2 || !r40Var.f6707l) && z2) {
                    z = true;
                }
                r40Var.f6706k = z;
                return;
            case 5:
                c50 c50Var = (c50) this.f9712k;
                c50Var.f1121Y.f1154n.m3358g(c50Var.f1130m);
                c50Var.f1130m = null;
                return;
            case 6:
                Iterator it = ((t50) this.f9712k).f7310n.iterator();
                if (it.hasNext()) {
                    throw AbstractC0024an.m280c(it);
                }
                return;
            case 7:
                ((tv0) this.f9712k).mo3397e();
                return;
            case 8:
                jx0 jx0Var = (jx0) this.f9712k;
                C0030a c0030a = jx0Var.f4110o;
                if (jx0Var.f4106k == 0) {
                    jx0Var.f4107l = true;
                    c0030a.m440d(ph0.ON_PAUSE);
                }
                if (jx0Var.f4105j == 0 && jx0Var.f4107l) {
                    c0030a.m440d(ph0.ON_STOP);
                    jx0Var.f4108m = true;
                    return;
                }
                return;
            case 9:
                n31 n31Var = ((m31) this.f9712k).f4967e;
                n31Var.f5280i.m169a(new RunnableC0897y0(24, n31Var));
                return;
            case 10:
                m5870a();
                return;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                ok1 ok1Var = (ok1) this.f9712k;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ok1Var.f5779a.getAction() + " finishing.");
                ok1Var.f5780b.m4063d(null);
                return;
            default:
                f71 f71Var2 = (f71) this.f9712k;
                ((g41) f71Var2.f2337n).m1984m(new C0468mf(15, f71Var2));
                return;
        }
    }
}
