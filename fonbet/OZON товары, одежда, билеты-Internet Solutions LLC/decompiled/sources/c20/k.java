package c20;

import B90.C2618u;
import ed.InterfaceC6346b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC0848a f56395a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ru.ozon.composer.ui.widget.l f56396b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56397c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: c20.k$a$a, reason: collision with other inner class name */
        public static final class EnumC0848a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC0848a[] $VALUES;
            public static final EnumC0848a CHANGE;
            public static final EnumC0848a DELETE;
            public static final EnumC0848a EQUAL;
            public static final EnumC0848a INSERT;
            private final int index;

            static {
                EnumC0848a enumC0848a = new EnumC0848a("INSERT", 0, 0);
                INSERT = enumC0848a;
                EnumC0848a enumC0848a2 = new EnumC0848a("CHANGE", 1, 1);
                CHANGE = enumC0848a2;
                EnumC0848a enumC0848a3 = new EnumC0848a("DELETE", 2, 2);
                DELETE = enumC0848a3;
                EnumC0848a enumC0848a4 = new EnumC0848a("EQUAL", 3, 3);
                EQUAL = enumC0848a4;
                EnumC0848a[] enumC0848aArr = {enumC0848a, enumC0848a2, enumC0848a3, enumC0848a4};
                $VALUES = enumC0848aArr;
                $ENTRIES = Xc.b.a(enumC0848aArr);
            }

            private EnumC0848a(String str, int i11, int i12) {
                this.index = i12;
            }

            public static EnumC0848a valueOf(String str) {
                return (EnumC0848a) Enum.valueOf(EnumC0848a.class, str);
            }

            public static EnumC0848a[] values() {
                return (EnumC0848a[]) $VALUES.clone();
            }

            public final int a() {
                return this.index;
            }
        }

        public a(@NotNull EnumC0848a type, @NotNull ru.ozon.composer.ui.widget.l item, int i11) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(item, "item");
            this.f56395a = type;
            this.f56396b = item;
            this.f56397c = i11;
        }

        public final int a(@NotNull a o22) {
            Intrinsics.checkNotNullParameter(o22, "o2");
            return Intrinsics.i(this.f56397c, o22.f56397c);
        }

        @NotNull
        public final ru.ozon.composer.ui.widget.l b() {
            return this.f56396b;
        }

        @NotNull
        public final EnumC0848a c() {
            return this.f56395a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f56395a != aVar.f56395a) {
                return false;
            }
            return Intrinsics.d(this.f56396b, aVar.f56396b);
        }

        public final int hashCode() {
            return this.f56396b.hashCode() + (this.f56395a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Chunk(type=" + this.f56395a + ", item=[" + C5735c.a(this.f56396b) + "])";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f56398a;

        /* renamed from: b, reason: collision with root package name */
        private final int f56399b;

        public b(long j11, int i11) {
            this.f56398a = j11;
            this.f56399b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56398a == bVar.f56398a && this.f56399b == bVar.f56399b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56399b) + (Long.hashCode(this.f56398a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(itemId=");
            sb2.append(this.f56398a);
            sb2.append(", viewMapperKey=");
            return K00.b.e(this.f56399b, ")", sb2);
        }
    }

    @InterfaceC6346b
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<a> f56400a;

        private /* synthetic */ c(List list) {
            this.f56400a = list;
        }

        public static final /* synthetic */ c a(List list) {
            return new c(list);
        }

        public final /* synthetic */ List b() {
            return this.f56400a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return Intrinsics.d(this.f56400a, ((c) obj).f56400a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f56400a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Patch(chunks="), this.f56400a, ")");
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f56401a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ru.ozon.composer.ui.widget.l f56402b;

        public d(int i11, @NotNull ru.ozon.composer.ui.widget.l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f56401a = i11;
            this.f56402b = item;
        }

        @NotNull
        public final ru.ozon.composer.ui.widget.l a() {
            return this.f56402b;
        }

        public final int b() {
            return this.f56401a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f56401a == dVar.f56401a && Intrinsics.d(this.f56402b, dVar.f56402b);
        }

        public final int hashCode() {
            return this.f56402b.hashCode() + (Integer.hashCode(this.f56401a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Value(position=" + this.f56401a + ", item=" + this.f56402b + ")";
        }
    }

    @NotNull
    public static ArrayList a(@NotNull List oldItems, @NotNull List newItems) {
        Intrinsics.checkNotNullParameter(oldItems, "oldItems");
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        int i11 = 0;
        if (oldItems.isEmpty()) {
            List list = newItems;
            ArrayList chunks = new ArrayList(C7714v.z(list, 10));
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                chunks.add(new a(a.EnumC0848a.INSERT, (ru.ozon.composer.ui.widget.l) obj, i11));
                i11 = i12;
            }
            Intrinsics.checkNotNullParameter(chunks, "chunks");
            return chunks;
        }
        LinkedHashMap b11 = b(oldItems);
        LinkedHashMap b12 = b(newItems);
        ArrayList chunks2 = new ArrayList();
        for (Map.Entry entry : b11.entrySet()) {
            b bVar = (b) entry.getKey();
            d dVar = (d) entry.getValue();
            int b13 = dVar.b();
            ru.ozon.composer.ui.widget.l a11 = dVar.a();
            d dVar2 = (d) b12.get(bVar);
            if (dVar2 == null) {
                chunks2.add(i11, new a(a.EnumC0848a.DELETE, a11, b13));
                i11++;
            } else if (!Intrinsics.d(a11, dVar2.a())) {
                chunks2.add(new a(a.EnumC0848a.CHANGE, dVar2.a(), dVar2.b()));
                b12.remove(bVar);
            }
        }
        for (Map.Entry entry2 : b12.entrySet()) {
            b bVar2 = (b) entry2.getKey();
            d dVar3 = (d) entry2.getValue();
            d dVar4 = (d) b11.get(bVar2);
            if (dVar4 == null || !Intrinsics.d(dVar4.a(), dVar3.a())) {
                chunks2.add(new a(a.EnumC0848a.INSERT, dVar3.a(), dVar3.b()));
            } else {
                chunks2.add(new a(a.EnumC0848a.EQUAL, dVar3.a(), dVar3.b()));
            }
        }
        final l lVar = l.f56403b;
        C7714v.G0(new Comparator() { // from class: c20.j
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((Number) Function2.this.invoke(obj2, obj3)).intValue();
            }
        }, chunks2);
        Intrinsics.checkNotNullParameter(chunks2, "chunks");
        return chunks2;
    }

    private static LinkedHashMap b(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ru.ozon.composer.ui.widget.l lVar = (ru.ozon.composer.ui.widget.l) obj;
            b bVar = new b(lVar.f(), lVar.j());
            if (((d) linkedHashMap.get(bVar)) == null) {
                linkedHashMap.put(bVar, new d(i11, lVar));
            }
            i11 = i12;
        }
        return linkedHashMap;
    }
}
