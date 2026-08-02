package Ud;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.EnumC9840f;
import td.p0;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f27602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final u f27603b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final u f27604c;

    public static final class a {

        /* renamed from: Ud.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public /* synthetic */ class C0557a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27605a;

            static {
                int[] iArr = new int[EnumC9840f.values().length];
                try {
                    iArr[EnumC9840f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC9840f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC9840f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC9840f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC9840f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC9840f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f27605a = iArr;
            }
        }

        @NotNull
        public static u a(@NotNull Function1 changeOptions) {
            Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
            A a11 = new A();
            changeOptions.invoke(a11);
            a11.k0();
            return new u(a11);
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f27606a = new a();

            @Override // Ud.n.b
            public final void a(@NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append("(");
            }

            @Override // Ud.n.b
            public final void b(@NotNull p0 parameter, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
            }

            @Override // Ud.n.b
            public final void c(@NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(")");
            }

            @Override // Ud.n.b
            public final void d(@NotNull p0 parameter, int i11, int i12, @NotNull StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i11 != i12 - 1) {
                    builder.append(", ");
                }
            }
        }

        void a(@NotNull StringBuilder sb2);

        void b(@NotNull p0 p0Var, @NotNull StringBuilder sb2);

        void c(@NotNull StringBuilder sb2);

        void d(@NotNull p0 p0Var, int i11, int i12, @NotNull StringBuilder sb2);
    }

    static {
        a.a(C4060c.f27591a);
        a.a(C4062e.f27593a);
        a.a(C4063f.f27594a);
        a.a(C4064g.f27595a);
        a.a(C4065h.f27596a);
        a.a(i.f27597a);
        f27602a = a.a(j.f27598a);
        a.a(k.f27599a);
        f27603b = a.a(l.f27600a);
        f27604c = a.a(m.f27601a);
        a.a(C4061d.f27592a);
    }
}
