package Ja;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f14294a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Ja.b f14295b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Oa.c f14296c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final i f14297d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ArrayList f14298e;

        public a(@NotNull b helper, @NotNull Ja.b context, @NotNull Oa.c engine, @NotNull i original, @NotNull ArrayList interceptors) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(engine, "engine");
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            this.f14294a = helper;
            this.f14295b = context;
            this.f14296c = engine;
            this.f14297d = original;
            this.f14298e = interceptors;
        }

        @NotNull
        public final b a() {
            return this.f14294a;
        }

        @NotNull
        public final List<c> b() {
            return this.f14298e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f14294a, aVar.f14294a) && this.f14295b.equals(aVar.f14295b) && this.f14296c.equals(aVar.f14296c) && Intrinsics.d(this.f14297d, aVar.f14297d) && Intrinsics.d(this.f14298e, aVar.f14298e);
        }

        public final int hashCode() {
            return this.f14298e.hashCode() + ((this.f14297d.hashCode() + ((this.f14296c.hashCode() + ((this.f14295b.hashCode() + (this.f14294a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Env(helper=");
            sb2.append(this.f14294a);
            sb2.append(", context=");
            sb2.append(this.f14295b);
            sb2.append(", engine=");
            sb2.append(this.f14296c);
            sb2.append(", original=");
            sb2.append(this.f14297d);
            sb2.append(", interceptors=");
            return Om.a(")", sb2, this.f14298e);
        }
    }

    public static final class b {
    }

    @NotNull
    a a();

    @NotNull
    j b(@NotNull i iVar);

    @NotNull
    i getRequest();
}
