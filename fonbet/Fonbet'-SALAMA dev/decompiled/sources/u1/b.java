package u1;

import java.util.Locale;
import w1.AbstractC1706i0;
import w1.C1705i;
import w1.C1709j;
import w1.r;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f16564a = new e("fl.ad.type");

    /* renamed from: b, reason: collision with root package name */
    public static final e f16565b = new e("fl.level.name");

    /* renamed from: c, reason: collision with root package name */
    public static final e f16566c = new e("fl.level.number");

    /* renamed from: d, reason: collision with root package name */
    public static final e f16567d = new e("fl.content.name");

    /* renamed from: e, reason: collision with root package name */
    public static final e f16568e = new e("fl.content.type");

    /* renamed from: f, reason: collision with root package name */
    public static final e f16569f = new e("fl.content.id");

    /* renamed from: g, reason: collision with root package name */
    public static final e f16570g = new e("fl.credit.name");

    /* renamed from: h, reason: collision with root package name */
    public static final e f16571h = new e("fl.credit.type");

    /* renamed from: i, reason: collision with root package name */
    public static final e f16572i = new e("fl.credit.id");
    public static final e j = new e("fl.is.currency.soft");

    /* renamed from: k, reason: collision with root package name */
    public static final e f16573k = new e("fl.currency.type");

    /* renamed from: l, reason: collision with root package name */
    public static final e f16574l = new e("fl.payment.type");

    /* renamed from: m, reason: collision with root package name */
    public static final e f16575m = new e("fl.item.name");

    /* renamed from: n, reason: collision with root package name */
    public static final e f16576n = new e("fl.item.type");

    /* renamed from: o, reason: collision with root package name */
    public static final e f16577o = new e("fl.item.id");

    /* renamed from: p, reason: collision with root package name */
    public static final e f16578p = new e("fl.item.count");

    /* renamed from: q, reason: collision with root package name */
    public static final e f16579q = new e("fl.item.category");

    /* renamed from: r, reason: collision with root package name */
    public static final e f16580r = new e("fl.item.list.type");

    /* renamed from: s, reason: collision with root package name */
    public static final e f16581s = new e("fl.price");

    /* renamed from: t, reason: collision with root package name */
    public static final e f16582t = new e("fl.total.amount");

    /* renamed from: u, reason: collision with root package name */
    public static final e f16583u = new e("fl.achievement.id");

    /* renamed from: v, reason: collision with root package name */
    public static final e f16584v = new e("fl.score");

    /* renamed from: w, reason: collision with root package name */
    public static final e f16585w = new e("fl.rating");

    /* renamed from: x, reason: collision with root package name */
    public static final e f16586x = new e("fl.transaction.id");

    /* renamed from: y, reason: collision with root package name */
    public static final e f16587y = new e("fl.success");

    /* renamed from: z, reason: collision with root package name */
    public static final e f16588z = new e("fl.is.annual.subscription");

    /* renamed from: A, reason: collision with root package name */
    public static final e f16547A = new e("fl.subscription.country");

    /* renamed from: B, reason: collision with root package name */
    public static final e f16548B = new e("fl.trial.days");

    /* renamed from: C, reason: collision with root package name */
    public static final e f16549C = new e("fl.predicted.ltv");

    /* renamed from: D, reason: collision with root package name */
    public static final e f16550D = new e("fl.group.name");

    /* renamed from: E, reason: collision with root package name */
    public static final e f16551E = new e("fl.tutorial.name");

    /* renamed from: F, reason: collision with root package name */
    public static final e f16552F = new e("fl.step.number");

    /* renamed from: G, reason: collision with root package name */
    public static final e f16553G = new e("fl.user.id");

    /* renamed from: H, reason: collision with root package name */
    public static final e f16554H = new e("fl.method");

    /* renamed from: I, reason: collision with root package name */
    public static final e f16555I = new e("fl.query");

    /* renamed from: J, reason: collision with root package name */
    public static final e f16556J = new e("fl.search.type");

    /* renamed from: K, reason: collision with root package name */
    public static final e f16557K = new e("fl.social.content.name");

    /* renamed from: L, reason: collision with root package name */
    public static final e f16558L = new e("fl.social.content.id");

    /* renamed from: M, reason: collision with root package name */
    public static final e f16559M = new e("fl.like.type");

    /* renamed from: N, reason: collision with root package name */
    public static final e f16560N = new e("fl.media.name");

    /* renamed from: O, reason: collision with root package name */
    public static final e f16561O = new e("fl.media.type");

    /* renamed from: P, reason: collision with root package name */
    public static final e f16562P = new e("fl.media.id");

    /* renamed from: Q, reason: collision with root package name */
    public static final e f16563Q = new e("fl.duration");

    public static boolean a() {
        if (AbstractC1706i0.k(16)) {
            return true;
        }
        AbstractC1706i0.q(String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
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
            r i7 = r.i();
            if (r.f17840z.get()) {
                i7.d(new C1709j(2, str, str2));
            } else {
                AbstractC1706i0.o(2, "Invalid call to UserProperties.set. Flurry is not initialized");
            }
        }
    }

    public static void d(byte b7) {
        if (a()) {
            r i7 = r.i();
            if (!r.f17840z.get()) {
                AbstractC1706i0.o(2, "Invalid call to setGender. Flurry is not initialized");
            } else if (b7 == 0 || b7 == 1 || b7 == -1) {
                i7.d(new C1705i(b7));
            }
        }
    }
}
