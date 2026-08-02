package S20;

import B0.C2454a;
import B90.C2618u;
import C.o0;
import Kk.C3532b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.InterfaceC10198a;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: S20.a$a, reason: collision with other inner class name */
    public static final class C0509a implements a, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25680a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25681b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25682c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f25683d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25684e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25685f;

        /* renamed from: g, reason: collision with root package name */
        private final Function1<Context, Unit> f25686g;

        /* JADX WARN: Multi-variable type inference failed */
        public C0509a(@NotNull String id2, @NotNull String groupId, @NotNull String title, @NotNull String badge, String str, boolean z11, Function1<? super Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.f25680a = id2;
            this.f25681b = groupId;
            this.f25682c = title;
            this.f25683d = badge;
            this.f25684e = str;
            this.f25685f = z11;
            this.f25686g = function1;
        }

        @NotNull
        public final String a() {
            return this.f25683d;
        }

        public final Function1<Context, Unit> b() {
            return this.f25686g;
        }

        public final String c() {
            return this.f25684e;
        }

        @NotNull
        public final String d() {
            return this.f25682c;
        }

        public final boolean e() {
            return this.f25685f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0509a)) {
                return false;
            }
            C0509a c0509a = (C0509a) obj;
            return Intrinsics.d(this.f25680a, c0509a.f25680a) && Intrinsics.d(this.f25681b, c0509a.f25681b) && Intrinsics.d(this.f25682c, c0509a.f25682c) && Intrinsics.d(this.f25683d, c0509a.f25683d) && Intrinsics.d(this.f25684e, c0509a.f25684e) && this.f25685f == c0509a.f25685f && Intrinsics.d(this.f25686g, c0509a.f25686g);
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25681b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25680a;
        }

        public final int hashCode() {
            int a11 = G.g.a(G.g.a(G.g.a(this.f25680a.hashCode() * 31, 31, this.f25681b), 31, this.f25682c), 31, this.f25683d);
            String str = this.f25684e;
            int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f25685f);
            Function1<Context, Unit> function1 = this.f25686g;
            return a12 + (function1 != null ? function1.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Badge(id=" + this.f25680a + ", groupId=" + this.f25681b + ", title=" + this.f25682c + ", badge=" + this.f25683d + ", subtitle=" + this.f25684e + ", isLast=" + this.f25685f + ", onBadgeClick=" + this.f25686g + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25687a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25688b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25689c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Context, Unit> f25690d;

        /* renamed from: e, reason: collision with root package name */
        private final int f25691e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25692f;

        public b(int i11, @NotNull String id2, @NotNull String groupId, @NotNull String title, @NotNull Function1 onClick, boolean z11) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f25687a = id2;
            this.f25688b = groupId;
            this.f25689c = title;
            this.f25690d = onClick;
            this.f25691e = i11;
            this.f25692f = z11;
        }

        @NotNull
        public final Function1<Context, Unit> a() {
            return this.f25690d;
        }

        @NotNull
        public final String b() {
            return this.f25689c;
        }

        public final int c() {
            return this.f25691e;
        }

        public final boolean d() {
            return this.f25692f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f25687a, bVar.f25687a) && Intrinsics.d(this.f25688b, bVar.f25688b) && Intrinsics.d(this.f25689c, bVar.f25689c) && Intrinsics.d(this.f25690d, bVar.f25690d) && this.f25691e == bVar.f25691e && this.f25692f == bVar.f25692f;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25688b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25687a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f25692f) + C2454a.a(this.f25691e, (this.f25690d.hashCode() + G.g.a(G.g.a(this.f25687a.hashCode() * 31, 31, this.f25688b), 31, this.f25689c)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(id=");
            sb2.append(this.f25687a);
            sb2.append(", groupId=");
            sb2.append(this.f25688b);
            sb2.append(", title=");
            sb2.append(this.f25689c);
            sb2.append(", onClick=");
            sb2.append(this.f25690d);
            sb2.append(", topPaddingInDp=");
            sb2.append(this.f25691e);
            sb2.append(", isLast=");
            return Pk0.a.a(")", sb2, this.f25692f);
        }
    }

    public static final class c implements a, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25693a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25694b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25695c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Context, Unit> f25696d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25697e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25698f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull String id2, @NotNull String groupId, @NotNull String title, @NotNull Function1<? super Context, Unit> onClick, String str, boolean z11) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f25693a = id2;
            this.f25694b = groupId;
            this.f25695c = title;
            this.f25696d = onClick;
            this.f25697e = str;
            this.f25698f = z11;
        }

        @NotNull
        public final Function1<Context, Unit> a() {
            return this.f25696d;
        }

        public final String b() {
            return this.f25697e;
        }

        @NotNull
        public final String c() {
            return this.f25695c;
        }

        public final boolean d() {
            return this.f25698f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f25693a, cVar.f25693a) && Intrinsics.d(this.f25694b, cVar.f25694b) && Intrinsics.d(this.f25695c, cVar.f25695c) && Intrinsics.d(this.f25696d, cVar.f25696d) && Intrinsics.d(this.f25697e, cVar.f25697e) && this.f25698f == cVar.f25698f;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25694b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25693a;
        }

        public final int hashCode() {
            int hashCode = (this.f25696d.hashCode() + G.g.a(G.g.a(this.f25693a.hashCode() * 31, 31, this.f25694b), 31, this.f25695c)) * 31;
            String str = this.f25697e;
            return Boolean.hashCode(this.f25698f) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chevron(id=");
            sb2.append(this.f25693a);
            sb2.append(", groupId=");
            sb2.append(this.f25694b);
            sb2.append(", title=");
            sb2.append(this.f25695c);
            sb2.append(", onClick=");
            sb2.append(this.f25696d);
            sb2.append(", subtitle=");
            sb2.append(this.f25697e);
            sb2.append(", isLast=");
            return Pk0.a.a(")", sb2, this.f25698f);
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25699a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25700b;

        public d(@NotNull String groupId, boolean z11) {
            Intrinsics.checkNotNullParameter(null, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(null, "content");
            this.f25699a = groupId;
            this.f25700b = z11;
        }

        public final boolean a() {
            return this.f25700b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            return Intrinsics.d(this.f25699a, dVar.f25699a) && this.f25700b == dVar.f25700b;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25699a;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ComposableFunction(id=null, groupId=");
            sb2.append(this.f25699a);
            sb2.append(", content=null, isLast=");
            return Pk0.a.a(")", sb2, this.f25700b);
        }
    }

    public static final class e implements a, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25701a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25702b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25703c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f25704d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25705e;

        /* renamed from: f, reason: collision with root package name */
        private final Function2<String, Context, Unit> f25706f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull String id2, @NotNull String groupId, @NotNull String title, @NotNull String value, boolean z11, Function2<? super String, ? super Context, Unit> function2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f25701a = id2;
            this.f25702b = groupId;
            this.f25703c = title;
            this.f25704d = value;
            this.f25705e = z11;
            this.f25706f = function2;
        }

        public final Function2<String, Context, Unit> a() {
            return this.f25706f;
        }

        @NotNull
        public final String b() {
            return this.f25703c;
        }

        @NotNull
        public final String c() {
            return this.f25704d;
        }

        public final boolean d() {
            return this.f25705e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.d(this.f25701a, eVar.f25701a) && Intrinsics.d(this.f25702b, eVar.f25702b) && Intrinsics.d(this.f25703c, eVar.f25703c) && Intrinsics.d(this.f25704d, eVar.f25704d) && this.f25705e == eVar.f25705e && Intrinsics.d(this.f25706f, eVar.f25706f);
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25702b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25701a;
        }

        public final int hashCode() {
            int a11 = C3532b.a(G.g.a(G.g.a(G.g.a(this.f25701a.hashCode() * 31, 31, this.f25702b), 31, this.f25703c), 31, this.f25704d), 31, this.f25705e);
            Function2<String, Context, Unit> function2 = this.f25706f;
            return a11 + (function2 == null ? 0 : function2.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Copy(id=" + this.f25701a + ", groupId=" + this.f25702b + ", title=" + this.f25703c + ", value=" + this.f25704d + ", isLast=" + this.f25705e + ", onCopyClick=" + this.f25706f + ")";
        }
    }

    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25707a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25708b;

        public f(@NotNull String groupId, boolean z11) {
            Intrinsics.checkNotNullParameter(null, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(null, "view");
            this.f25707a = groupId;
            this.f25708b = z11;
        }

        public final boolean a() {
            return this.f25708b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            fVar.getClass();
            return Intrinsics.d(this.f25707a, fVar.f25707a) && this.f25708b == fVar.f25708b;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25707a;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CustomView(id=null, groupId=");
            sb2.append(this.f25707a);
            sb2.append(", view=null, isLast=");
            return Pk0.a.a(")", sb2, this.f25708b);
        }
    }

    public static final class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25709a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25710b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25711c;

        public g(String groupId, String title) {
            Intrinsics.checkNotNullParameter(groupId, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            this.f25709a = groupId;
            this.f25710b = title;
            this.f25711c = groupId;
        }

        @NotNull
        public final String a() {
            return this.f25710b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.d(this.f25709a, gVar.f25709a) && Intrinsics.d(this.f25710b, gVar.f25710b) && Intrinsics.d(this.f25711c, gVar.f25711c);
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25711c;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25709a;
        }

        public final int hashCode() {
            return this.f25711c.hashCode() + G.g.a(this.f25709a.hashCode() * 31, 31, this.f25710b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(id=");
            sb2.append(this.f25709a);
            sb2.append(", title=");
            sb2.append(this.f25710b);
            sb2.append(", groupId=");
            return o0.c(sb2, this.f25711c, ")");
        }
    }

    public static final class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25712a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25713b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25714c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f25715d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25716e;

        /* renamed from: f, reason: collision with root package name */
        private final Function1<String, Unit> f25717f;

        /* renamed from: g, reason: collision with root package name */
        private final Function2<String, Context, Unit> f25718g;

        /* renamed from: h, reason: collision with root package name */
        private final Function2<String, Context, Unit> f25719h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f25720i;

        /* JADX WARN: Multi-variable type inference failed */
        public h(@NotNull String id2, @NotNull String groupId, @NotNull String value, @NotNull String label, boolean z11, Function1<? super String, Unit> function1, Function2<? super String, ? super Context, Unit> function2, Function2<? super String, ? super Context, Unit> function22, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f25712a = id2;
            this.f25713b = groupId;
            this.f25714c = value;
            this.f25715d = label;
            this.f25716e = z11;
            this.f25717f = function1;
            this.f25718g = function2;
            this.f25719h = function22;
            this.f25720i = z12;
        }

        public static h a(h hVar, String value) {
            String id2 = hVar.f25712a;
            Intrinsics.checkNotNullParameter(id2, "id");
            String groupId = hVar.f25713b;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(value, "value");
            String label = hVar.f25715d;
            Intrinsics.checkNotNullParameter(label, "label");
            return new h(id2, groupId, value, label, hVar.f25716e, hVar.f25717f, hVar.f25718g, hVar.f25719h, hVar.f25720i);
        }

        public final boolean b() {
            return this.f25716e;
        }

        @NotNull
        public final String c() {
            return this.f25715d;
        }

        public final Function2<String, Context, Unit> d() {
            return this.f25718g;
        }

        public final Function2<String, Context, Unit> e() {
            return this.f25719h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.d(this.f25712a, hVar.f25712a) && Intrinsics.d(this.f25713b, hVar.f25713b) && Intrinsics.d(this.f25714c, hVar.f25714c) && Intrinsics.d(this.f25715d, hVar.f25715d) && this.f25716e == hVar.f25716e && Intrinsics.d(this.f25717f, hVar.f25717f) && Intrinsics.d(this.f25718g, hVar.f25718g) && Intrinsics.d(this.f25719h, hVar.f25719h) && this.f25720i == hVar.f25720i;
        }

        public final Function1<String, Unit> f() {
            return this.f25717f;
        }

        @NotNull
        public final String g() {
            return this.f25714c;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25713b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25712a;
        }

        public final boolean h() {
            return this.f25720i;
        }

        public final int hashCode() {
            int a11 = C3532b.a(G.g.a(G.g.a(G.g.a(this.f25712a.hashCode() * 31, 31, this.f25713b), 31, this.f25714c), 31, this.f25715d), 31, this.f25716e);
            Function1<String, Unit> function1 = this.f25717f;
            int hashCode = (a11 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function2<String, Context, Unit> function2 = this.f25718g;
            int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<String, Context, Unit> function22 = this.f25719h;
            return Boolean.hashCode(this.f25720i) + ((hashCode2 + (function22 != null ? function22.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Input(id=");
            sb2.append(this.f25712a);
            sb2.append(", groupId=");
            sb2.append(this.f25713b);
            sb2.append(", value=");
            sb2.append(this.f25714c);
            sb2.append(", label=");
            sb2.append(this.f25715d);
            sb2.append(", enabled=");
            sb2.append(this.f25716e);
            sb2.append(", onValueChange=");
            sb2.append(this.f25717f);
            sb2.append(", onActionClick=");
            sb2.append(this.f25718g);
            sb2.append(", onCopyClick=");
            sb2.append(this.f25719h);
            sb2.append(", isLast=");
            return Pk0.a.a(")", sb2, this.f25720i);
        }
    }

    public static final class i implements a, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25721a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25722b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f25723c;

        /* renamed from: d, reason: collision with root package name */
        private final int f25724d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function2<Integer, Context, Unit> f25725e;

        /* renamed from: S20.a$i$a, reason: collision with other inner class name */
        public static final class C0510a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f25726a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f25727b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25728c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f25729d;

            public C0510a(@NotNull String id2, @NotNull String title, String str, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f25726a = id2;
                this.f25727b = title;
                this.f25728c = str;
                this.f25729d = z11;
            }

            @NotNull
            public final String a() {
                return this.f25726a;
            }

            public final String b() {
                return this.f25728c;
            }

            @NotNull
            public final String c() {
                return this.f25727b;
            }

            public final boolean d() {
                return this.f25729d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0510a)) {
                    return false;
                }
                C0510a c0510a = (C0510a) obj;
                return Intrinsics.d(this.f25726a, c0510a.f25726a) && Intrinsics.d(this.f25727b, c0510a.f25727b) && Intrinsics.d(this.f25728c, c0510a.f25728c) && this.f25729d == c0510a.f25729d;
            }

            public final int hashCode() {
                int a11 = G.g.a(this.f25726a.hashCode() * 31, 31, this.f25727b);
                String str = this.f25728c;
                return Boolean.hashCode(this.f25729d) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RadioItem(id=");
                sb2.append(this.f25726a);
                sb2.append(", title=");
                sb2.append(this.f25727b);
                sb2.append(", subtitle=");
                sb2.append(this.f25728c);
                sb2.append(", isLast=");
                return Pk0.a.a(")", sb2, this.f25729d);
            }
        }

        public i(@NotNull String id2, @NotNull String groupId, @NotNull ArrayList items, int i11, @NotNull Function2 onSelectChange) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
            this.f25721a = id2;
            this.f25722b = groupId;
            this.f25723c = items;
            this.f25724d = i11;
            this.f25725e = onSelectChange;
        }

        public static i a(i iVar, int i11) {
            ArrayList items = iVar.f25723c;
            String id2 = iVar.f25721a;
            Intrinsics.checkNotNullParameter(id2, "id");
            String groupId = iVar.f25722b;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(items, "items");
            Function2<Integer, Context, Unit> onSelectChange = iVar.f25725e;
            Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
            return new i(id2, groupId, items, i11, onSelectChange);
        }

        @NotNull
        public final List<C0510a> b() {
            return this.f25723c;
        }

        @NotNull
        public final Function2<Integer, Context, Unit> c() {
            return this.f25725e;
        }

        public final int d() {
            return this.f25724d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.d(this.f25721a, iVar.f25721a) && Intrinsics.d(this.f25722b, iVar.f25722b) && this.f25723c.equals(iVar.f25723c) && this.f25724d == iVar.f25724d && Intrinsics.d(this.f25725e, iVar.f25725e);
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25722b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25721a;
        }

        public final int hashCode() {
            return this.f25725e.hashCode() + C2454a.a(this.f25724d, C2618u.b(this.f25723c, G.g.a(this.f25721a.hashCode() * 31, 31, this.f25722b), 31), 31);
        }

        @NotNull
        public final String toString() {
            return "RadioGroup(id=" + this.f25721a + ", groupId=" + this.f25722b + ", items=" + this.f25723c + ", selectedIndex=" + this.f25724d + ", onSelectChange=" + this.f25725e + ")";
        }
    }

    public static final class j implements a, InterfaceC10198a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25730a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25731b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f25732c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25733d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25734e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Function2<Boolean, Context, Unit> f25735f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25736g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f25737h;

        /* JADX WARN: Multi-variable type inference failed */
        public j(@NotNull String id2, @NotNull String groupId, @NotNull String title, boolean z11, boolean z12, @NotNull Function2<? super Boolean, ? super Context, Unit> onToggleClick, String str, boolean z13) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onToggleClick, "onToggleClick");
            this.f25730a = id2;
            this.f25731b = groupId;
            this.f25732c = title;
            this.f25733d = z11;
            this.f25734e = z12;
            this.f25735f = onToggleClick;
            this.f25736g = str;
            this.f25737h = z13;
        }

        public static j a(j jVar, boolean z11) {
            String id2 = jVar.f25730a;
            Intrinsics.checkNotNullParameter(id2, "id");
            String groupId = jVar.f25731b;
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            String title = jVar.f25732c;
            Intrinsics.checkNotNullParameter(title, "title");
            Function2<Boolean, Context, Unit> onToggleClick = jVar.f25735f;
            Intrinsics.checkNotNullParameter(onToggleClick, "onToggleClick");
            return new j(id2, groupId, title, z11, jVar.f25734e, onToggleClick, jVar.f25736g, jVar.f25737h);
        }

        public final boolean b() {
            return this.f25734e;
        }

        @NotNull
        public final Function2<Boolean, Context, Unit> c() {
            return this.f25735f;
        }

        public final String d() {
            return this.f25736g;
        }

        @NotNull
        public final String e() {
            return this.f25732c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.d(this.f25730a, jVar.f25730a) && Intrinsics.d(this.f25731b, jVar.f25731b) && Intrinsics.d(this.f25732c, jVar.f25732c) && this.f25733d == jVar.f25733d && this.f25734e == jVar.f25734e && Intrinsics.d(this.f25735f, jVar.f25735f) && Intrinsics.d(this.f25736g, jVar.f25736g) && this.f25737h == jVar.f25737h;
        }

        public final boolean f() {
            return this.f25737h;
        }

        public final boolean g() {
            return this.f25733d;
        }

        @Override // S20.a
        @NotNull
        public final String getGroupId() {
            return this.f25731b;
        }

        @Override // S20.a
        @NotNull
        public final String getId() {
            return this.f25730a;
        }

        public final int hashCode() {
            int hashCode = (this.f25735f.hashCode() + C3532b.a(C3532b.a(G.g.a(G.g.a(this.f25730a.hashCode() * 31, 31, this.f25731b), 31, this.f25732c), 31, this.f25733d), 31, this.f25734e)) * 31;
            String str = this.f25736g;
            return Boolean.hashCode(this.f25737h) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toggle(id=");
            sb2.append(this.f25730a);
            sb2.append(", groupId=");
            sb2.append(this.f25731b);
            sb2.append(", title=");
            sb2.append(this.f25732c);
            sb2.append(", isToggled=");
            sb2.append(this.f25733d);
            sb2.append(", enabled=");
            sb2.append(this.f25734e);
            sb2.append(", onToggleClick=");
            sb2.append(this.f25735f);
            sb2.append(", subtitle=");
            sb2.append(this.f25736g);
            sb2.append(", isLast=");
            return Pk0.a.a(")", sb2, this.f25737h);
        }
    }

    @NotNull
    String getGroupId();

    @NotNull
    String getId();
}
