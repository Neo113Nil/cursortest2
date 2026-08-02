package V1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.F0;
import l1.K0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface l {

    public static final class a {
        @NotNull
        public static l a(AbstractC7799Q abstractC7799Q, float f7) {
            if (abstractC7799Q == null) {
                return b.f27920a;
            }
            if (abstractC7799Q instanceof K0) {
                return b(k.c(f7, ((K0) abstractC7799Q).a()));
            }
            if (abstractC7799Q instanceof F0) {
                return new V1.b((F0) abstractC7799Q, f7);
            }
            throw new Sc.o();
        }

        @NotNull
        public static l b(long j11) {
            return j11 != 16 ? new V1.c(j11) : b.f27920a;
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f27920a = new b();

        @Override // V1.l
        public final long a() {
            long j11;
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
            return j11;
        }

        @Override // V1.l
        public final AbstractC7799Q d() {
            return null;
        }

        @Override // V1.l
        public final float getAlpha() {
            return Float.NaN;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(l.this.getAlpha());
        }
    }

    static final class d extends AbstractC7737t implements Function0<l> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final l invoke() {
            return l.this;
        }
    }

    long a();

    @NotNull
    default l b(@NotNull l lVar) {
        boolean z11 = lVar instanceof V1.b;
        return (z11 && (this instanceof V1.b)) ? new V1.b(((V1.b) lVar).e(), k.a(((V1.b) lVar).getAlpha(), new c())) : (!z11 || (this instanceof V1.b)) ? (z11 || !(this instanceof V1.b)) ? lVar.c(new d()) : this : lVar;
    }

    @NotNull
    default l c(@NotNull Function0<? extends l> function0) {
        return !equals(b.f27920a) ? this : function0.invoke();
    }

    AbstractC7799Q d();

    float getAlpha();
}
