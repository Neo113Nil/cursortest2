package U20;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.InterfaceC10198a;

/* loaded from: classes3.dex */
public interface b {

    public static final class a implements b, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27292a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27293b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f27294c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27295d;

        public a() {
            throw null;
        }

        public a(String id2, String title, String badge, String str, int i11) {
            str = (i11 & 8) != 0 ? null : str;
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.f27292a = id2;
            this.f27293b = title;
            this.f27294c = badge;
            this.f27295d = str;
        }

        @NotNull
        public final String a() {
            return this.f27294c;
        }

        @NotNull
        public final String b() {
            return this.f27292a;
        }

        public final String c() {
            return this.f27295d;
        }

        @NotNull
        public final String d() {
            return this.f27293b;
        }
    }

    /* renamed from: U20.b$b, reason: collision with other inner class name */
    public static final class C0551b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27296a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27297b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Object f27298c;

        public C0551b(@NotNull String id2, @NotNull String title, @NotNull Function1<? super Context, Unit> onClick) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f27296a = id2;
            this.f27297b = title;
            this.f27298c = onClick;
        }

        @NotNull
        public final String a() {
            return this.f27296a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<android.content.Context, kotlin.Unit>] */
        @NotNull
        public final Function1<Context, Unit> b() {
            return this.f27298c;
        }

        @NotNull
        public final String c() {
            return this.f27297b;
        }
    }

    public static final class c implements b, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27299a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27300b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function1<Context, Unit> f27301c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27302d;

        public c(@NotNull String id2, @NotNull String title, String str, @NotNull Function1 onClick) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f27299a = id2;
            this.f27300b = title;
            this.f27301c = onClick;
            this.f27302d = str;
        }

        @NotNull
        public final String a() {
            return this.f27299a;
        }

        @NotNull
        public final Function1<Context, Unit> b() {
            return this.f27301c;
        }

        public final String c() {
            return this.f27302d;
        }

        @NotNull
        public final String d() {
            return this.f27300b;
        }
    }

    public static final class d implements b {
    }

    public static final class e implements b, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27303a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27304b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f27305c;

        public e() {
            throw null;
        }

        public e(String id2, String title, String value) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f27303a = id2;
            this.f27304b = title;
            this.f27305c = value;
        }

        @NotNull
        public final String a() {
            return this.f27303a;
        }

        @NotNull
        public final String b() {
            return this.f27304b;
        }

        @NotNull
        public final String c() {
            return this.f27305c;
        }
    }

    public static final class f implements b {
    }

    public static final class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27306a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27307b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f27308c;

        /* renamed from: d, reason: collision with root package name */
        private final AbstractC7737t f27309d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27310e;

        public g() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(String id2, String initialValue, String label, Function2 function2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f27306a = id2;
            this.f27307b = initialValue;
            this.f27308c = label;
            this.f27309d = (AbstractC7737t) function2;
            this.f27310e = true;
        }

        public final boolean a() {
            return this.f27310e;
        }

        @NotNull
        public final String b() {
            return this.f27306a;
        }

        @NotNull
        public final String c() {
            return this.f27307b;
        }

        @NotNull
        public final String d() {
            return this.f27308c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<java.lang.String, android.content.Context, kotlin.Unit>, kotlin.jvm.internal.t] */
        public final Function2<String, Context, Unit> e() {
            return this.f27309d;
        }
    }

    public static final class h implements b, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f27311a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27312b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function2<Integer, Context, Unit> f27313c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f27314a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f27315b;

            public a(String id2, String title) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f27314a = id2;
                this.f27315b = title;
            }

            @NotNull
            public final String a() {
                return this.f27314a;
            }

            @NotNull
            public final String b() {
                return this.f27315b;
            }
        }

        public h(@NotNull ArrayList items, int i11, @NotNull Function2 onSelectChange) {
            Intrinsics.checkNotNullParameter("httpLoggingRadio", "id");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
            this.f27311a = items;
            this.f27312b = i11;
            this.f27313c = onSelectChange;
        }

        @NotNull
        public final List<a> a() {
            return this.f27311a;
        }

        @NotNull
        public final Function2<Integer, Context, Unit> b() {
            return this.f27313c;
        }

        public final int c() {
            return this.f27312b;
        }
    }

    public static final class i implements b, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27316a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27317b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27318c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f27319d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27320e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f27321f;

        public i() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(String id2, String title, boolean z11, Function2 onToggleClick, String str, int i11) {
            str = (i11 & 16) != 0 ? null : str;
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onToggleClick, "onToggleClick");
            this.f27316a = id2;
            this.f27317b = title;
            this.f27318c = z11;
            this.f27319d = (AbstractC7737t) onToggleClick;
            this.f27320e = str;
            this.f27321f = true;
        }

        public final boolean a() {
            return this.f27321f;
        }

        @NotNull
        public final String b() {
            return this.f27316a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<java.lang.Boolean, android.content.Context, kotlin.Unit>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function2<Boolean, Context, Unit> c() {
            return this.f27319d;
        }

        public final String d() {
            return this.f27320e;
        }

        @NotNull
        public final String e() {
            return this.f27317b;
        }

        public final boolean f() {
            return this.f27318c;
        }
    }
}
