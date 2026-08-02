package A00;

import A00.e;
import B0.C2454a;
import C.o0;
import Kk.C3532b;
import P00.k;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.C5353y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import ed.InterfaceC6346b;
import i10.h;
import i10.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* loaded from: classes7.dex */
public abstract class a {

    public static final class A extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final A f163a = new A();
    }

    public static final class B extends AbstractC2361b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final B f164a = new B(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return -282753984;
        }

        @NotNull
        public final String toString() {
            return "RestorePage";
        }
    }

    /* loaded from: classes3.dex */
    public static final class D extends AbstractC2361b {

        /* renamed from: a, reason: collision with root package name */
        private final String f187a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<R00.f> f188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public D(String str, @NotNull List<? extends R00.f> incidents) {
            super(0);
            Intrinsics.checkNotNullParameter(incidents, "incidents");
            this.f187a = str;
            this.f188b = incidents;
        }

        @NotNull
        public final List<R00.f> d() {
            return this.f188b;
        }

        public final String e() {
            return this.f187a;
        }

        @NotNull
        public final String toString() {
            return "SendIncidents";
        }
    }

    public static final class E extends AbstractC2361b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final E f189a = new E(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof E);
        }

        public final int hashCode() {
            return -243415276;
        }

        @NotNull
        public final String toString() {
            return "SendPage";
        }
    }

    public static final class F extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final F f190b = new F(0);

        /* renamed from: a, reason: collision with root package name */
        private final int f191a;

        public F(int i11) {
            this.f191a = i11;
        }

        public final int e() {
            return this.f191a;
        }
    }

    public static final class G extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final z00.f f192a;

        public G(@NotNull z00.f pageIssue) {
            Intrinsics.checkNotNullParameter(pageIssue, "pageIssue");
            this.f192a = pageIssue;
        }

        @NotNull
        public final z00.f d() {
            return this.f192a;
        }
    }

    public static final class H<I extends C7854a> extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<I> f193a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<I> f194b;

        /* JADX WARN: Multi-variable type inference failed */
        public H(@NotNull List<? extends I> list, @NotNull List<? extends I> overlays) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(overlays, "overlays");
            this.f193a = list;
            this.f194b = overlays;
        }

        @NotNull
        public final List<I> d() {
            return this.f193a;
        }

        @NotNull
        public final List<I> e() {
            return this.f194b;
        }

        @NotNull
        public final String toString() {
            return Cm.e.c("ShowInitialWidgets(list=", this.f193a.size(), ", overlays=", ")", this.f194b.size());
        }
    }

    public static final class I extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f195a;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f196b;

        public I(boolean z11, l.a aVar) {
            this.f195a = z11;
            this.f196b = aVar;
        }

        public final l.a d() {
            return this.f196b;
        }

        public final boolean e() {
            return this.f195a;
        }

        @NotNull
        public final String toString() {
            return "ShowLoader(show=" + this.f195a + ", loaderType=" + this.f196b + ")";
        }
    }

    public static final class J extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC0007a f197a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f198b;

        /* renamed from: A00.a$J$a, reason: collision with other inner class name */
        public interface InterfaceC0007a {
        }

        public J(@NotNull InterfaceC0007a key, boolean z11) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f197a = key;
            this.f198b = z11;
        }

        @NotNull
        public final InterfaceC0007a d() {
            return this.f197a;
        }

        public final boolean e() {
            return this.f198b;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Update(key=");
            sb2.append(this.f197a);
            sb2.append(", notify=");
            return Pk0.a.a(")", sb2, this.f198b);
        }
    }

    public static final class K<I extends C7854a> extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<I> f199a;

        /* JADX WARN: Multi-variable type inference failed */
        public K(@NotNull List<? extends I> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f199a = items;
        }

        @NotNull
        public final List<I> d() {
            return this.f199a;
        }
    }

    public static final class L extends AbstractC2361b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final L f200a = new L(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof L);
        }

        public final int hashCode() {
            return 1623843989;
        }

        @NotNull
        public final String toString() {
            return "UpdatePage";
        }
    }

    public static final class M extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final J.InterfaceC0007a f201a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f202b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C7854a f203c;

        public M(@NotNull J.InterfaceC0007a key, @NotNull String placeholderKey, @NotNull C7854a widgetItem) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
            Intrinsics.checkNotNullParameter(widgetItem, "widgetItem");
            this.f201a = key;
            this.f202b = placeholderKey;
            this.f203c = widgetItem;
        }

        @NotNull
        public final J.InterfaceC0007a d() {
            return this.f201a;
        }

        @NotNull
        public final String e() {
            return this.f202b;
        }

        @NotNull
        public final C7854a f() {
            return this.f203c;
        }

        @NotNull
        public final String toString() {
            return "UpdatePlaceholders(key=" + this.f201a + ", placeholderKey=" + this.f202b + ")";
        }
    }

    public interface N {
        @NotNull
        Map<Class<? extends Object>, Object> c();
    }

    /* renamed from: A00.a$a, reason: collision with other inner class name */
    public interface InterfaceC0008a<E extends a> {
        @NotNull
        h a();

        @NotNull
        E b();
    }

    /* renamed from: A00.a$b, reason: case insensitive filesystem */
    public static abstract class AbstractC2361b extends a {
        public /* synthetic */ AbstractC2361b(int i11) {
            this();
        }

        private AbstractC2361b() {
        }
    }

    /* renamed from: A00.a$c, reason: case insensitive filesystem */
    public static final class C2362c extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2362c f204a = new C2362c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2362c);
        }

        public final int hashCode() {
            return -707579420;
        }

        @NotNull
        public final String toString() {
            return "ApplyPostProcessing";
        }
    }

    /* renamed from: A00.a$d, reason: case insensitive filesystem */
    public static final class C2363d extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C5353y0 f205a;

        public C2363d(@NotNull C5353y0 insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            this.f205a = insets;
        }

        @NotNull
        public final C5353y0 d() {
            return this.f205a;
        }
    }

    /* renamed from: A00.a$e, reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2364e extends a implements InterfaceC2366g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2364e f206a = new C2364e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2364e);
        }

        public final int hashCode() {
            return 1811401729;
        }

        @NotNull
        public final String toString() {
            return "CancelPreviousRequest";
        }
    }

    /* renamed from: A00.a$f, reason: case insensitive filesystem */
    public interface InterfaceC2365f {
    }

    /* renamed from: A00.a$g, reason: case insensitive filesystem */
    public interface InterfaceC2366g {
    }

    /* renamed from: A00.a$h, reason: case insensitive filesystem */
    public static final class C2367h extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f207a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f208b;

        public C2367h() {
            this(true, true);
        }

        public final boolean d() {
            return this.f207a;
        }

        public final boolean e() {
            return this.f208b;
        }

        public C2367h(boolean z11, boolean z12) {
            this.f207a = z11;
            this.f208b = z12;
        }
    }

    /* renamed from: A00.a$i, reason: case insensitive filesystem */
    public static final class C2368i extends a {
    }

    /* renamed from: A00.a$j, reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2369j<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final k<I> f209a;

        /* renamed from: b, reason: collision with root package name */
        private final f.c f210b;

        public /* synthetic */ C2369j(k kVar) {
            this(kVar, null);
        }

        public final z00.f a() {
            return this.f210b;
        }

        @NotNull
        public final k<I> b() {
            return this.f209a;
        }

        public C2369j(@NotNull k response, f.c cVar) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f209a = response;
            this.f210b = cVar;
        }
    }

    /* renamed from: A00.a$k, reason: case insensitive filesystem */
    public static final class C2370k extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2370k f211a = new C2370k();

        private C2370k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2370k);
        }

        public final int hashCode() {
            return 404792166;
        }

        @NotNull
        public final String toString() {
            return "DoneRefreshing";
        }
    }

    /* renamed from: A00.a$l, reason: case insensitive filesystem */
    public static final class C2371l extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f212a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f213b;

        /* renamed from: A00.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0009a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private b f214a = b.C0011b.b(Integer.MAX_VALUE);

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final ArrayList f215b = new ArrayList();

            @NotNull
            public final void a(long j11) {
                this.f214a = b.C0010a.b(j11);
            }

            @NotNull
            public final void b() {
                this.f214a = b.C0011b.b(0);
            }

            @NotNull
            public final C2371l c() {
                return new C2371l(this.f214a, C7714v.W0(this.f215b));
            }

            @NotNull
            public final void d(@NotNull ru.ozon.composer.ui.widget.l item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.k() != InterfaceC8047b.a.f74254a) {
                    throw new IllegalArgumentException("item widgetType must be 'WidgetType.Widget'");
                }
                this.f215b.add(item);
            }

            @NotNull
            public final void e(@NotNull Collection items) {
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList = this.f215b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : items) {
                    if (((C7854a) obj).k() == InterfaceC8047b.a.f74254a) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }

        /* renamed from: A00.a$l$b */
        /* loaded from: classes3.dex */
        public interface b {

            @InterfaceC6346b
            /* renamed from: A00.a$l$b$a, reason: collision with other inner class name */
            public static final class C0010a implements b {

                /* renamed from: a, reason: collision with root package name */
                private final long f216a;

                private /* synthetic */ C0010a(long j11) {
                    this.f216a = j11;
                }

                public static final /* synthetic */ C0010a b(long j11) {
                    return new C0010a(j11);
                }

                @Override // A00.a.C2371l.b
                public final <I extends C7854a> int a(@NotNull List<? extends I> items) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    Intrinsics.checkNotNullParameter(items, "items");
                    Iterator<? extends I> it = items.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (it.next().f() == this.f216a) {
                            break;
                        }
                        i11++;
                    }
                    return i11 + 1;
                }

                public final boolean equals(Object obj) {
                    if (obj instanceof C0010a) {
                        return this.f216a == ((C0010a) obj).f216a;
                    }
                    return false;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f216a);
                }

                public final String toString() {
                    return P4.f.a(this.f216a, ")", new StringBuilder("AfterId(itemId="));
                }
            }

            @InterfaceC6346b
            /* renamed from: A00.a$l$b$b, reason: collision with other inner class name */
            public static final class C0011b implements b {

                /* renamed from: a, reason: collision with root package name */
                private final int f217a;

                private /* synthetic */ C0011b(int i11) {
                    this.f217a = i11;
                }

                public static final /* synthetic */ C0011b b(int i11) {
                    return new C0011b(i11);
                }

                @Override // A00.a.C2371l.b
                public final <I extends C7854a> int a(@NotNull List<? extends I> items) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    Intrinsics.checkNotNullParameter(items, "items");
                    int i11 = this.f217a;
                    if (i11 < 0) {
                        return 0;
                    }
                    return i11 > items.size() ? items.size() : i11;
                }

                public final boolean equals(Object obj) {
                    if (obj instanceof C0011b) {
                        return this.f217a == ((C0011b) obj).f217a;
                    }
                    return false;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f217a);
                }

                public final String toString() {
                    return K00.b.e(this.f217a, ")", new StringBuilder("Raw(value="));
                }
            }

            <I extends C7854a> int a(@NotNull List<? extends I> list);
        }

        private C2371l() {
            throw null;
        }

        public C2371l(b bVar, ArrayList arrayList) {
            this.f212a = bVar;
            this.f213b = arrayList;
        }

        @NotNull
        public final b d() {
            return this.f212a;
        }

        @NotNull
        public final List<C7854a> e() {
            return this.f213b;
        }
    }

    /* renamed from: A00.a$m, reason: case insensitive filesystem */
    public static final class C2372m extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f218a;

        public C2372m(boolean z11) {
            this.f218a = z11;
        }

        public final boolean d() {
            return this.f218a;
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("ListSubmitCompleted(stateRestored="), this.f218a);
        }
    }

    /* renamed from: A00.a$n, reason: case insensitive filesystem */
    public static final class C2373n extends a implements InterfaceC0008a<a>, InterfaceC2365f, InterfaceC2366g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f219a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f220b;

        public C2373n(@NotNull h requestState, @NotNull a actual) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            Intrinsics.checkNotNullParameter(requestState, "requestState");
            this.f219a = actual;
            this.f220b = requestState;
        }

        @Override // A00.a.InterfaceC0008a
        @NotNull
        public final h a() {
            return this.f220b;
        }

        @Override // A00.a.InterfaceC0008a
        @NotNull
        public final a b() {
            return this.f219a;
        }

        @NotNull
        public final String toString() {
            return "LoadAction(event=" + this.f219a + ")";
        }
    }

    public static final class o<I extends C7854a> extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f221a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final k<I> f222b;

        /* renamed from: c, reason: collision with root package name */
        private final String f223c;

        /* renamed from: d, reason: collision with root package name */
        private C2369j<I> f224d;

        public o(@NotNull a trigger, String str, @NotNull k responseModel) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(responseModel, "responseModel");
            this.f221a = trigger;
            this.f222b = responseModel;
            this.f223c = str;
        }

        public final C2369j<I> d() {
            return this.f224d;
        }

        public final String e() {
            return this.f223c;
        }

        @NotNull
        public final k<I> f() {
            return this.f222b;
        }

        @NotNull
        public final a g() {
            return this.f221a;
        }

        public final void h(C2369j<I> c2369j) {
            this.f224d = c2369j;
        }

        @NotNull
        public final String toString() {
            return "LoadCompleted(trigger=" + this.f221a + ", list=" + ((ArrayList) this.f222b.d()).size() + ")";
        }
    }

    public static final class p extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f225a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f226b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Throwable f227c;

        /* renamed from: d, reason: collision with root package name */
        private C2369j<? extends C7854a> f228d;

        public p(@NotNull a trigger, @NotNull String requestUrl, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f225a = trigger;
            this.f226b = requestUrl;
            this.f227c = throwable;
        }

        public final C2369j<? extends C7854a> d() {
            return this.f228d;
        }

        @NotNull
        public final String e() {
            return this.f226b;
        }

        @NotNull
        public final Throwable f() {
            return this.f227c;
        }

        @NotNull
        public final a g() {
            return this.f225a;
        }

        public final void h(C2369j<? extends C7854a> c2369j) {
            this.f228d = c2369j;
        }

        @NotNull
        public final String toString() {
            return "LoadFailed(trigger=" + this.f225a + ", throwableMessage=" + this.f227c.getMessage() + ")";
        }
    }

    public static final class q extends a implements InterfaceC0008a<r>, InterfaceC2365f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final r f229a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f230b;

        public q(@NotNull r actual, @NotNull h requestState) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            Intrinsics.checkNotNullParameter(requestState, "requestState");
            this.f229a = actual;
            this.f230b = requestState;
        }

        @Override // A00.a.InterfaceC0008a
        @NotNull
        public final h a() {
            return this.f230b;
        }

        @Override // A00.a.InterfaceC0008a
        public final r b() {
            return this.f229a;
        }

        @NotNull
        public final String toString() {
            return "LoadNextAction(event=" + this.f229a + ")";
        }
    }

    public static abstract class r extends a implements InterfaceC2365f {

        /* renamed from: A00.a$r$a, reason: collision with other inner class name */
        public static final class C0012a extends r {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f231a;

            public C0012a(boolean z11) {
                super(0);
                this.f231a = z11;
            }

            public final boolean d() {
                return this.f231a;
            }

            @NotNull
            public final String toString() {
                return Pk0.a.a(")", new StringBuilder("LoadNext(force="), this.f231a);
            }
        }

        public /* synthetic */ r(int i11) {
            this();
        }

        private r() {
        }

        public static final class b extends r {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f232a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f233b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final e f234c;

            /* renamed from: d, reason: collision with root package name */
            private final int f235d;

            /* renamed from: e, reason: collision with root package name */
            private int f236e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String page, @NotNull String url, @NotNull e scroll) {
                super(0);
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(scroll, "scroll");
                this.f236e = -1;
                this.f232a = page;
                this.f233b = url;
                this.f234c = scroll;
                C.f fVar = C.f.f184a;
                this.f235d = LinearLayoutManager.INVALID_OFFSET;
            }

            public final int d() {
                return this.f236e;
            }

            public final int e() {
                return this.f235d;
            }

            @NotNull
            public final String f() {
                return this.f232a;
            }

            @NotNull
            public final e g() {
                return this.f234c;
            }

            @NotNull
            public final String h() {
                return this.f233b;
            }

            @InterfaceC3999a
            public final boolean i() {
                return this.f235d != Integer.MIN_VALUE;
            }

            public final void j(int i11) {
                this.f236e = i11;
            }

            @NotNull
            public final String toString() {
                return "ReloadFromPage(page=" + this.f232a + ", url=" + this.f233b + ", offset=" + this.f235d + ", scroll=" + this.f234c + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC3999a
            public b(@NotNull String page, @NotNull String url, int i11) {
                super(0);
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.checkNotNullParameter(url, "url");
                this.f236e = -1;
                this.f232a = page;
                this.f233b = url;
                this.f234c = C.f.f184a.d();
                this.f235d = i11;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class s extends a implements InterfaceC0008a<a>, InterfaceC2365f, InterfaceC2366g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final u.b f237a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f238b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final h.c.a f239c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final e f240d;

        public s(@NotNull u.b actual, @NotNull h requestState, @NotNull h.c.a pageRef, @NotNull e scrollEvent) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            Intrinsics.checkNotNullParameter(requestState, "requestState");
            Intrinsics.checkNotNullParameter(pageRef, "pageRef");
            Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
            this.f237a = actual;
            this.f238b = requestState;
            this.f239c = pageRef;
            this.f240d = scrollEvent;
        }

        @Override // A00.a.InterfaceC0008a
        @NotNull
        public final h a() {
            return this.f238b;
        }

        @Override // A00.a.InterfaceC0008a
        public final a b() {
            return this.f237a;
        }

        @NotNull
        public final u.b d() {
            return this.f237a;
        }

        @NotNull
        public final h.c.a e() {
            return this.f239c;
        }

        @NotNull
        public final e f() {
            return this.f240d;
        }

        @NotNull
        public final String toString() {
            return "MultiLoadAction(event=" + this.f237a + ")";
        }
    }

    public static final class t extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final t f241a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -876623211;
        }

        @NotNull
        public final String toString() {
            return "None";
        }
    }

    public static abstract class u extends a implements InterfaceC2366g {

        /* renamed from: A00.a$u$a, reason: collision with other inner class name */
        public static final class C0013a extends u {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0013a f242a = new C0013a();

            private C0013a() {
                super(0);
            }

            @NotNull
            public final String toString() {
                return "FirstLoad";
            }
        }

        public static final class b extends u implements N {

            /* renamed from: i, reason: collision with root package name */
            @NotNull
            private static final Map<String, Object> f243i;

            /* renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ int f244j = 0;

            /* renamed from: a, reason: collision with root package name */
            private final String f245a;

            /* renamed from: b, reason: collision with root package name */
            private final String f246b;

            /* renamed from: c, reason: collision with root package name */
            private final Map<String, Object> f247c;

            /* renamed from: d, reason: collision with root package name */
            private final Map<String, Object> f248d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f249e;

            /* renamed from: f, reason: collision with root package name */
            private final h.b f250f;

            /* renamed from: g, reason: collision with root package name */
            @NotNull
            private final Map<Class<? extends Object>, Object> f251g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f252h;

            /* renamed from: A00.a$u$b$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0014a {
                @NotNull
                public static Map a() {
                    return b.f243i;
                }
            }

            static {
                Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(new HashMap(0));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
                f243i = unmodifiableMap;
            }

            public b() {
                this(null, null, null, null, false, null, 127);
            }

            @Override // A00.a.N
            @NotNull
            public final Map<Class<? extends Object>, Object> c() {
                return this.f251g;
            }

            public final String e() {
                return this.f246b;
            }

            public final Map<String, Object> f() {
                return this.f247c;
            }

            public final Map<String, Object> g() {
                return this.f248d;
            }

            public final h.b h() {
                return this.f250f;
            }

            public final boolean i() {
                return this.f249e;
            }

            public final String j() {
                return this.f245a;
            }

            public final boolean k() {
                return this.f252h;
            }

            public final void l() {
                this.f252h = true;
            }

            @NotNull
            public final String toString() {
                h.b bVar = this.f250f;
                boolean z11 = (bVar != null ? bVar.b() : null) != null;
                boolean z12 = this.f252h;
                StringBuilder sb2 = new StringBuilder("Refresh(url=");
                sb2.append(this.f245a);
                sb2.append(", silent=");
                Pk0.f.c(", withScroll=", ", isMultiRefresh=", sb2, this.f249e, z11);
                return Pk0.a.a(")", sb2, z12);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b(String str, String str2, Map map, Map map2, boolean z11, h.b bVar, int i11) {
                super(r2);
                str = (i11 & 1) != 0 ? null : str;
                str2 = (i11 & 2) != 0 ? null : str2;
                map = (i11 & 4) != 0 ? null : map;
                map2 = (i11 & 8) != 0 ? f243i : map2;
                int i12 = 0;
                z11 = (i11 & 16) != 0 ? false : z11;
                bVar = (i11 & 32) != 0 ? null : bVar;
                Map<Class<? extends Object>, Object> extraData = U.c();
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                this.f245a = str;
                this.f246b = str2;
                this.f247c = map;
                this.f248d = map2;
                this.f249e = z11;
                this.f250f = bVar;
                this.f251g = extraData;
            }
        }

        public static final class c extends u {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f253a = new c();

            private c() {
                super(0);
            }

            @NotNull
            public final String toString() {
                return "SwipeRefresh";
            }
        }

        public /* synthetic */ u(int i11) {
            this();
        }

        private u() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class v extends a implements InterfaceC0008a<r.b>, InterfaceC2365f, InterfaceC2366g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final r.b f254a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f255b;

        public v(@NotNull r.b actual, @NotNull h requestState) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            Intrinsics.checkNotNullParameter(requestState, "requestState");
            this.f254a = actual;
            this.f255b = requestState;
        }

        @Override // A00.a.InterfaceC0008a
        @NotNull
        public final h a() {
            return this.f255b;
        }

        @Override // A00.a.InterfaceC0008a
        public final r.b b() {
            return this.f254a;
        }

        @NotNull
        public final r.b d() {
            return this.f254a;
        }

        @NotNull
        public final String toString() {
            return "ReloadFromPageAction(event=" + this.f254a + ")";
        }
    }

    public static final class w extends a {
    }

    public static final class x extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<Object> f256a;

        /* renamed from: A00.a$x$a, reason: collision with other inner class name */
        public static final class C0015a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final LinkedHashSet<Object> f257a = new LinkedHashSet<>();

            @NotNull
            public final void a(long j11) {
                this.f257a.add(Long.valueOf(j11));
            }

            @NotNull
            public final void b(@NotNull String stateId) {
                Intrinsics.checkNotNullParameter(stateId, "stateId");
                this.f257a.add(stateId);
            }

            @NotNull
            public final x c() {
                return new x(C7714v.Y0(this.f257a));
            }
        }

        private x() {
            throw null;
        }

        public x(Set set) {
            this.f256a = set;
        }

        @NotNull
        public final Set<Object> d() {
            return this.f256a;
        }
    }

    @InterfaceC3999a
    public static final class y extends a {
    }

    @InterfaceC3999a
    public static final class z extends a {
    }

    @InterfaceC3999a
    public static abstract class C extends a implements Parcelable {

        @InterfaceC3999a
        /* loaded from: classes3.dex */
        public static final class b extends e {

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new C0002a();

            /* renamed from: a, reason: collision with root package name */
            private final int f168a;

            /* renamed from: b, reason: collision with root package name */
            private final int f169b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final InterfaceC4008j f170c;

            /* renamed from: A00.a$C$b$a, reason: collision with other inner class name */
            public static final class C0002a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new b(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            /* renamed from: A00.a$C$b$b, reason: collision with other inner class name */
            static final class C0003b extends AbstractC7737t implements Function0<A00.e> {
                C0003b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final A00.e invoke() {
                    e.a aVar = new e.a();
                    b bVar = b.this;
                    aVar.g(bVar.f());
                    aVar.d(bVar.e());
                    return aVar.b();
                }
            }

            public /* synthetic */ b() {
                this(0, 0);
            }

            @Override // A00.a.C
            @NotNull
            public final A00.e d() {
                return (A00.e) this.f170c.getValue();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int e() {
                return this.f169b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f168a == bVar.f168a && this.f169b == bVar.f169b;
            }

            public final int f() {
                return this.f168a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f169b) + (Integer.hashCode(this.f168a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScrollToPositionSnapshot(position=");
                sb2.append(this.f168a);
                sb2.append(", offset=");
                return K00.b.e(this.f169b, ")", sb2);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f168a);
                dest.writeInt(this.f169b);
            }

            public b(int i11, int i12) {
                super(0);
                this.f168a = i11;
                this.f169b = i12;
                this.f170c = Sc.k.b(new C0003b());
            }
        }

        @InterfaceC3999a
        /* loaded from: classes3.dex */
        public static final class c extends C {

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new C0004a();

            /* renamed from: a, reason: collision with root package name */
            private final int f172a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f173b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f174c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final A00.e f175d;

            /* renamed from: A00.a$C$c$a, reason: collision with other inner class name */
            public static final class C0004a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new c(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            static final class b extends AbstractC7737t implements Function1<C7854a, Boolean> {
                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(C7854a c7854a) {
                    C7854a it = c7854a;
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.d(it.c().c().b(), c.this.e()));
                }
            }

            public c(int i11, @NotNull String widgetComponent, boolean z11) {
                Intrinsics.checkNotNullParameter(widgetComponent, "widgetComponent");
                this.f172a = i11;
                this.f173b = z11;
                this.f174c = widgetComponent;
                e.a aVar = new e.a();
                aVar.a(new b());
                aVar.e(true, z11);
                aVar.d(i11);
                this.f175d = aVar.b();
            }

            @Override // A00.a.C
            @NotNull
            public final A00.e d() {
                return this.f175d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String e() {
                return this.f174c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f172a == cVar.f172a && this.f173b == cVar.f173b && Intrinsics.d(this.f174c, cVar.f174c);
            }

            public final int hashCode() {
                return this.f174c.hashCode() + C3532b.a(Integer.hashCode(this.f172a) * 31, 31, this.f173b);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScrollToWidget(offset=");
                sb2.append(this.f172a);
                sb2.append(", includeToolbarHeight=");
                sb2.append(this.f173b);
                sb2.append(", widgetComponent=");
                return o0.c(sb2, this.f174c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f172a);
                dest.writeInt(this.f173b ? 1 : 0);
                dest.writeString(this.f174c);
            }
        }

        @InterfaceC3999a
        /* loaded from: classes3.dex */
        public static final class d extends e {

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new C0005a();

            /* renamed from: a, reason: collision with root package name */
            private final int f177a;

            /* renamed from: b, reason: collision with root package name */
            private final int f178b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f179c;

            /* renamed from: d, reason: collision with root package name */
            private final Integer f180d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f181e;

            /* renamed from: f, reason: collision with root package name */
            @NotNull
            private final A00.e f182f;

            /* renamed from: A00.a$C$d$a, reason: collision with other inner class name */
            public static final class C0005a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                public final d createFromParcel(Parcel parcel) {
                    boolean z11;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    boolean z12 = false;
                    if (parcel.readInt() != 0) {
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                    }
                    return new d(z12, parcel.readInt() == 0 ? z11 : true, readInt, readInt2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final d[] newArray(int i11) {
                    return new d[i11];
                }
            }

            static final class b extends AbstractC7737t implements Function1<C7854a, Boolean> {
                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(C7854a c7854a) {
                    C7854a it = c7854a;
                    Intrinsics.checkNotNullParameter(it, "it");
                    Integer scrollWidgetKey = it.d().getScrollWidgetKey();
                    return Boolean.valueOf(scrollWidgetKey != null && scrollWidgetKey.intValue() == d.this.e());
                }
            }

            public /* synthetic */ d(int i11, int i12, int i13, boolean z11) {
                this((i13 & 4) != 0 ? false : z11, true, i11, i12, (i13 & 8) != 0 ? null : 1);
            }

            @Override // A00.a.C
            @NotNull
            public final A00.e d() {
                return this.f182f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int e() {
                return this.f177a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f177a == dVar.f177a && this.f178b == dVar.f178b && this.f179c == dVar.f179c && Intrinsics.d(this.f180d, dVar.f180d) && this.f181e == dVar.f181e;
            }

            public final int hashCode() {
                int a11 = C3532b.a(C2454a.a(this.f178b, Integer.hashCode(this.f177a) * 31, 31), 31, this.f179c);
                Integer num = this.f180d;
                return Boolean.hashCode(this.f181e) + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScrollToWidgetWithScreenOffset(widgetKey=");
                sb2.append(this.f177a);
                sb2.append(", offset=");
                sb2.append(this.f178b);
                sb2.append(", smooth=");
                sb2.append(this.f179c);
                sb2.append(", pageLoadCount=");
                sb2.append(this.f180d);
                sb2.append(", includeToolbarHeight=");
                return Pk0.a.a(")", sb2, this.f181e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f177a);
                dest.writeInt(this.f178b);
                dest.writeInt(this.f179c ? 1 : 0);
                Integer num = this.f180d;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeInt(this.f181e ? 1 : 0);
            }

            public d(boolean z11, boolean z12, int i11, int i12, Integer num) {
                super(0);
                this.f177a = i11;
                this.f178b = i12;
                this.f179c = z11;
                this.f180d = num;
                this.f181e = z12;
                e.a aVar = new e.a();
                aVar.a(new b());
                aVar.e(z11, z12);
                aVar.d(i12);
                aVar.h();
                aVar.c(num != null ? num.intValue() : 4);
                this.f182f = aVar.b();
            }
        }

        @InterfaceC3999a
        /* loaded from: classes3.dex */
        public static abstract class e extends C {
            public e(int i11) {
            }
        }

        /* loaded from: classes3.dex */
        public static final class f extends e {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f184a = new f(0);

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private static final InterfaceC4008j f185b = Sc.k.b(b.f186b);

            @NotNull
            public static final Parcelable.Creator<f> CREATOR = new C0006a();

            /* renamed from: A00.a$C$f$a, reason: collision with other inner class name */
            public static final class C0006a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                public final f createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return f.f184a;
                }

                @Override // android.os.Parcelable.Creator
                public final f[] newArray(int i11) {
                    return new f[i11];
                }
            }

            static final class b extends AbstractC7737t implements Function0<A00.e> {

                /* renamed from: b, reason: collision with root package name */
                public static final b f186b = new b(0);

                @Override // kotlin.jvm.functions.Function0
                public final A00.e invoke() {
                    e.a aVar = new e.a();
                    aVar.g(-1);
                    return aVar.b();
                }
            }

            @Override // A00.a.C
            @NotNull
            public final A00.e d() {
                return (A00.e) f185b.getValue();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @NotNull
        public abstract A00.e d();

        @InterfaceC3999a
        /* renamed from: A00.a$C$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0000a extends C {

            @NotNull
            public static final Parcelable.Creator<C0000a> CREATOR = new C0001a();

            /* renamed from: a, reason: collision with root package name */
            private final int f165a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f166b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final A00.e f167c;

            /* renamed from: A00.a$C$a$a, reason: collision with other inner class name */
            public static final class C0001a implements Parcelable.Creator<C0000a> {
                @Override // android.os.Parcelable.Creator
                public final C0000a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C0000a(parcel.readInt(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final C0000a[] newArray(int i11) {
                    return new C0000a[i11];
                }
            }

            public C0000a(int i11, boolean z11) {
                this.f165a = i11;
                this.f166b = z11;
                e.a aVar = new e.a();
                aVar.g(i11);
                e.a.f(aVar, z11);
                this.f167c = aVar.b();
            }

            @Override // A00.a.C
            @NotNull
            public final A00.e d() {
                return this.f167c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0000a)) {
                    return false;
                }
                C0000a c0000a = (C0000a) obj;
                return this.f165a == c0000a.f165a && this.f166b == c0000a.f166b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f166b) + (Integer.hashCode(this.f165a) * 31);
            }

            @NotNull
            public final String toString() {
                return "ScrollToPosition(position=" + this.f165a + ", smooth=" + this.f166b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f165a);
                dest.writeInt(this.f166b ? 1 : 0);
            }

            @InterfaceC3999a
            public C0000a() {
                this(0, false);
            }
        }
    }
}
