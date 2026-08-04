package p145u1;

import java.util.Locale;
import p155w1.AbstractC0997i0;
import p155w1.C0996i;
import p155w1.C1000j;
import p155w1.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16570a = new e("fl.ad.type");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f16571b = new e("fl.level.name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f16572c = new e("fl.level.number");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f16573d = new e("fl.content.name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16574e = new e("fl.content.type");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f16575f = new e("fl.content.id");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f16576g = new e("fl.credit.name");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f16577h = new e("fl.credit.type");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f16578i = new e("fl.credit.id");
    public static final e j = new e("fl.is.currency.soft");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f16579k = new e("fl.currency.type");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f16580l = new e("fl.payment.type");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f16581m = new e("fl.item.name");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f16582n = new e("fl.item.type");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f16583o = new e("fl.item.id");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f16584p = new e("fl.item.count");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f16585q = new e("fl.item.category");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f16586r = new e("fl.item.list.type");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f16587s = new e("fl.price");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f16588t = new e("fl.total.amount");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f16589u = new e("fl.achievement.id");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f16590v = new e("fl.score");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f16591w = new e("fl.rating");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f16592x = new e("fl.transaction.id");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f16593y = new e("fl.success");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f16594z = new e("fl.is.annual.subscription");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final e f16553A = new e("fl.subscription.country");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final e f16554B = new e("fl.trial.days");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final e f16555C = new e("fl.predicted.ltv");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final e f16556D = new e("fl.group.name");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final e f16557E = new e("fl.tutorial.name");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final e f16558F = new e("fl.step.number");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final e f16559G = new e("fl.user.id");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final e f16560H = new e("fl.method");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final e f16561I = new e("fl.query");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final e f16562J = new e("fl.search.type");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final e f16563K = new e("fl.social.content.name");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final e f16564L = new e("fl.social.content.id");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final e f16565M = new e("fl.like.type");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final e f16566N = new e("fl.media.name");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final e f16567O = new e("fl.media.type");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final e f16568P = new e("fl.media.id");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final e f16569Q = new e("fl.duration");

    public static boolean a() {
        if (AbstractC0997i0.k(16)) {
            return true;
        }
        AbstractC0997i0.q(String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
        return false;
    }

    public static void b(String str, String str2, String str3) {
        StackTraceElement[] stackTraceElementArr;
        if (a()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length <= 4) {
                stackTraceElementArr = stackTrace;
            } else {
                int length = stackTrace.length - 4;
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length];
                System.arraycopy(stackTrace, 4, stackTraceElementArr2, 0, length);
                stackTraceElementArr = stackTraceElementArr2;
            }
            r.i().k(str, str2, str3, null, stackTraceElementArr);
        }
    }

    public static void c(String str, String str2) {
        if (a()) {
            r rVarI = r.i();
            if (r.f17846z.get()) {
                rVarI.d(new C1000j(2, str, str2));
            } else {
                AbstractC0997i0.o(2, "Invalid call to UserProperties.set. Flurry is not initialized");
            }
        }
    }

    public static void d(byte b7) {
        if (a()) {
            r rVarI = r.i();
            if (!r.f17846z.get()) {
                AbstractC0997i0.o(2, "Invalid call to setGender. Flurry is not initialized");
            } else if (b7 == 0 || b7 == 1 || b7 == -1) {
                rVarI.d(new C0996i(b7));
            }
        }
    }
}
