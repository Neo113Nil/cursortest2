package S1;

import S0.A1;
import S0.n1;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import k1.C7459e;
import k1.C7464j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7784B;
import l1.C7811b0;
import l1.F0;
import l1.H0;
import l1.K0;
import l1.r0;
import n1.AbstractC8413f;
import n1.C8415h;
import n1.C8416i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    private C7784B f25648a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private V1.i f25649b;

    /* renamed from: c, reason: collision with root package name */
    private int f25650c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private H0 f25651d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7799Q f25652e;

    /* renamed from: f, reason: collision with root package name */
    private A1<? extends Shader> f25653f;

    /* renamed from: g, reason: collision with root package name */
    private C7464j f25654g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC8413f f25655h;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function0<Shader> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7799Q f25656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f25657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC7799Q abstractC7799Q, long j11) {
            super(0);
            this.f25656b = abstractC7799Q;
            this.f25657c = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Shader invoke() {
            return ((F0) this.f25656b).mo70createShaderuvyYCjk(this.f25657c);
        }
    }

    public f(float f7) {
        super(1);
        V1.i iVar;
        H0 h02;
        ((TextPaint) this).density = f7;
        iVar = V1.i.f27915b;
        this.f25649b = iVar;
        this.f25650c = 3;
        h02 = H0.f72222d;
        this.f25651d = h02;
    }

    private final r0 b() {
        C7784B c7784b = this.f25648a;
        if (c7784b != null) {
            return c7784b;
        }
        C7784B c7784b2 = new C7784B(this);
        this.f25648a = c7784b2;
        return c7784b2;
    }

    public final int a() {
        return this.f25650c;
    }

    public final void c(int i11) {
        if (i11 == this.f25650c) {
            return;
        }
        ((C7784B) b()).o(i11);
        this.f25650c = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if ((r1 == null ? false : k1.C7464j.c(r1.i(), r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AbstractC7799Q abstractC7799Q, long j11, float f7) {
        if (abstractC7799Q == null) {
            this.f25653f = null;
            this.f25652e = null;
            this.f25654g = null;
            setShader(null);
            return;
        }
        if (abstractC7799Q instanceof K0) {
            e(V1.k.c(f7, ((K0) abstractC7799Q).a()));
            return;
        }
        if (abstractC7799Q instanceof F0) {
            if (Intrinsics.d(this.f25652e, abstractC7799Q)) {
                C7464j c7464j = this.f25654g;
            }
            if (j11 != 9205357640488583168L) {
                this.f25652e = abstractC7799Q;
                this.f25654g = C7464j.a(j11);
                this.f25653f = n1.e(new a(abstractC7799Q, j11));
            }
            r0 b11 = b();
            A1<? extends Shader> a12 = this.f25653f;
            ((C7784B) b11).f(a12 != null ? a12.getValue() : null);
            g.a(this, f7);
        }
    }

    public final void e(long j11) {
        if (j11 != 16) {
            setColor(C7811b0.i(j11));
            this.f25653f = null;
            this.f25652e = null;
            this.f25654g = null;
            setShader(null);
        }
    }

    public final void f(AbstractC8413f abstractC8413f) {
        if (abstractC8413f == null || Intrinsics.d(this.f25655h, abstractC8413f)) {
            return;
        }
        this.f25655h = abstractC8413f;
        if (abstractC8413f.equals(C8415h.f76287a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC8413f instanceof C8416i) {
            ((C7784B) b()).v(1);
            C8416i c8416i = (C8416i) abstractC8413f;
            ((C7784B) b()).u(c8416i.e());
            ((C7784B) b()).t(c8416i.c());
            ((C7784B) b()).s(c8416i.b());
            ((C7784B) b()).r(c8416i.a());
            ((C7784B) b()).q(c8416i.d());
        }
    }

    public final void g(H0 h02) {
        H0 h03;
        if (h02 == null || Intrinsics.d(this.f25651d, h02)) {
            return;
        }
        this.f25651d = h02;
        h03 = H0.f72222d;
        if (h02.equals(h03)) {
            clearShadowLayer();
            return;
        }
        float b11 = this.f25651d.b();
        if (b11 == 0.0f) {
            b11 = Float.MIN_VALUE;
        }
        setShadowLayer(b11, C7459e.g(this.f25651d.d()), C7459e.h(this.f25651d.d()), C7811b0.i(this.f25651d.c()));
    }

    public final void h(V1.i iVar) {
        V1.i iVar2;
        V1.i iVar3;
        if (iVar == null || Intrinsics.d(this.f25649b, iVar)) {
            return;
        }
        this.f25649b = iVar;
        iVar2 = V1.i.f27916c;
        setUnderlineText(iVar.d(iVar2));
        V1.i iVar4 = this.f25649b;
        iVar3 = V1.i.f27917d;
        setStrikeThruText(iVar4.d(iVar3));
    }
}
