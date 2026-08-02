package F4;

import B0.A0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: F4.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3028h<Key, Value> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f8903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3033m<c> f8904c;

    /* renamed from: F4.h$a */
    public static final class a<Value> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<Value> f8905a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f8906b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f8907c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8908d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8909e;

        public a(@NotNull List data, Integer num, Integer num2, int i11, int i12) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8905a = data;
            this.f8906b = num;
            this.f8907c = num2;
            this.f8908d = i11;
            this.f8909e = i12;
            if (i11 < 0 && i11 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i11 > 0 || i12 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i12 < 0 && i12 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final int a() {
            return this.f8909e;
        }

        public final int b() {
            return this.f8908d;
        }

        public final Object c() {
            return this.f8907c;
        }

        public final Object d() {
            return this.f8906b;
        }

        public final void e(int i11) {
            int i12;
            int i13 = this.f8908d;
            if (i13 == Integer.MIN_VALUE || (i12 = this.f8909e) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i12 > 0) {
                List<Value> list = this.f8905a;
                if (list.size() % i11 != 0) {
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i13 + ", totalCount " + (list.size() + i13 + i12) + ", pageSize " + i11);
                }
            }
            if (i13 % i11 != 0) {
                throw new IllegalArgumentException(A0.a(i13, i11, "Initial load must be pageSize aligned.Position = ", ", pageSize = "));
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f8905a, aVar.f8905a) && Intrinsics.d(this.f8906b, aVar.f8906b) && Intrinsics.d(this.f8907c, aVar.f8907c) && this.f8908d == aVar.f8908d && this.f8909e == aVar.f8909e;
        }
    }

    /* renamed from: F4.h$b */
    public static abstract class b<Key, Value> {
    }

    /* renamed from: F4.h$c */
    public interface c {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: F4.h$d */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d ITEM_KEYED;
        public static final d PAGE_KEYED;
        public static final d POSITIONAL;

        static {
            d dVar = new d("POSITIONAL", 0);
            POSITIONAL = dVar;
            d dVar2 = new d("PAGE_KEYED", 1);
            PAGE_KEYED = dVar2;
            d dVar3 = new d("ITEM_KEYED", 2);
            ITEM_KEYED = dVar3;
            $VALUES = new d[]{dVar, dVar2, dVar3};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* renamed from: F4.h$e */
    public static final class e<K> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final y f8910a;

        /* renamed from: b, reason: collision with root package name */
        private final K f8911b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8912c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8913d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8914e;

        public e(@NotNull y type, K k11, int i11, boolean z11, int i12) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f8910a = type;
            this.f8911b = k11;
            this.f8912c = i11;
            this.f8913d = z11;
            this.f8914e = i12;
            if (type != y.REFRESH && k11 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int a() {
            return this.f8912c;
        }

        public final K b() {
            return this.f8911b;
        }

        public final int c() {
            return this.f8914e;
        }

        public final boolean d() {
            return this.f8913d;
        }

        @NotNull
        public final y e() {
            return this.f8910a;
        }
    }

    /* renamed from: F4.h$f */
    static final class f extends AbstractC7737t implements Function1<c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f8915b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(c cVar) {
            c it = cVar;
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
            return Unit.f71690a;
        }
    }

    /* renamed from: F4.h$g */
    static final class g extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3028h<Key, Value> f8916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AbstractC3028h<Key, Value> abstractC3028h) {
            super(0);
            this.f8916b = abstractC3028h;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f8916b.e());
        }
    }

    public AbstractC3028h(@NotNull d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8903b = type;
        this.f8904c = new C3033m<>(f.f8915b, new g(this));
    }

    public final void a(@NotNull c onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f8904c.c(onInvalidatedCallback);
    }

    @NotNull
    public abstract Key b(@NotNull Value value);

    @NotNull
    public final d c() {
        return this.f8903b;
    }

    public final void d() {
        this.f8904c.b();
    }

    public final boolean e() {
        return this.f8904c.a();
    }

    public abstract Object f(@NotNull e<Key> eVar, @NotNull kotlin.coroutines.d<? super a<Value>> dVar);

    public final void g(@NotNull c onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f8904c.d(onInvalidatedCallback);
    }
}
