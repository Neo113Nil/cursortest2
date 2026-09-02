package O;

import java.util.Locale;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f338a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f340c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343f;

    /* renamed from: g, reason: collision with root package name */
    public final q f344g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f345h;

    /* renamed from: i, reason: collision with root package name */
    public final String f346i;

    /* renamed from: j, reason: collision with root package name */
    public final C.e f347j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f348k;

    /* renamed from: l, reason: collision with root package name */
    public final p[] f349l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f350m;

    public p(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, q qVar, Integer num, String str, C.e eVar, String[] strArr, p[] pVarArr, Locale[] localeArr) {
        this.f338a = z2;
        this.f339b = z3;
        this.f340c = z4;
        this.f341d = z5;
        this.f342e = z6;
        this.f343f = i2;
        this.f344g = qVar;
        this.f345h = num;
        this.f346i = str;
        this.f347j = eVar;
        this.f348k = strArr;
        this.f349l = pVarArr;
        this.f350m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 O.p, still in use, count: 2, list:
          (r8v1 O.p) from 0x021e: PHI (r8v2 O.p) = (r8v1 O.p), (r8v4 O.p) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 O.p) from 0x01e8: MOVE (r30v5 O.p) = (r8v1 O.p) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static O.p a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.p.a(org.json.JSONObject):O.p");
    }
}
