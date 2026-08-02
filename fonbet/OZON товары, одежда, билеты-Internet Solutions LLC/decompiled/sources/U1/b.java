package U1;

import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import S1.g;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k1.C7464j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.F0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final F0 f27270a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27271b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f27272c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A1<Shader> f27273d;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function0<Shader> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Shader invoke() {
            b bVar = b.this;
            if (bVar.b() == 9205357640488583168L || C7464j.g(bVar.b())) {
                return null;
            }
            return bVar.a().mo70createShaderuvyYCjk(bVar.b());
        }
    }

    public b(@NotNull F0 f02, float f7) {
        C3991w0 f11;
        this.f27270a = f02;
        this.f27271b = f7;
        f11 = n1.f(C7464j.a(9205357640488583168L), D1.f25195a);
        this.f27272c = f11;
        this.f27273d = n1.e(new a());
    }

    @NotNull
    public final F0 a() {
        return this.f27270a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((C7464j) this.f27272c.getValue()).i();
    }

    public final void c(long j11) {
        this.f27272c.setValue(C7464j.a(j11));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        g.a(textPaint, this.f27271b);
        textPaint.setShader(this.f27273d.getValue());
    }
}
