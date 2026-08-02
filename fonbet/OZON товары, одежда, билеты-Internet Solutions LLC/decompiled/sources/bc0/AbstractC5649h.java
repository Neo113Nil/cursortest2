package bc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

/* renamed from: bc0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5649h {

    /* renamed from: bc0.h$a */
    public static final class a extends AbstractC5649h {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC0835a f55923a;

        /* renamed from: bc0.h$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0835a {

            /* renamed from: bc0.h$a$a$a, reason: collision with other inner class name */
            public static final class C0836a extends AbstractC0835a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0836a f55924a = new C0836a(0);
            }

            /* renamed from: bc0.h$a$a$b */
            public static final class b extends AbstractC0835a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final AuthTokenDTO f55925a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(@NotNull AuthTokenDTO token) {
                    super(0);
                    Intrinsics.checkNotNullParameter(token, "token");
                    this.f55925a = token;
                }

                @NotNull
                public final AuthTokenDTO a() {
                    return this.f55925a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.d(this.f55925a, ((b) obj).f55925a);
                }

                public final int hashCode() {
                    return this.f55925a.hashCode();
                }

                @NotNull
                public final String toString() {
                    return "Success(token=" + this.f55925a + ")";
                }
            }

            public AbstractC0835a(int i11) {
            }
        }

        public a() {
            this(null);
        }

        public final AbstractC0835a a() {
            return this.f55923a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f55923a, ((a) obj).f55923a);
        }

        public final int hashCode() {
            AbstractC0835a abstractC0835a = this.f55923a;
            if (abstractC0835a == null) {
                return 0;
            }
            return abstractC0835a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Close(reason=" + this.f55923a + ")";
        }

        public a(AbstractC0835a abstractC0835a) {
            super(0);
            this.f55923a = abstractC0835a;
        }
    }

    public /* synthetic */ AbstractC5649h(int i11) {
        this();
    }

    private AbstractC5649h() {
    }
}
