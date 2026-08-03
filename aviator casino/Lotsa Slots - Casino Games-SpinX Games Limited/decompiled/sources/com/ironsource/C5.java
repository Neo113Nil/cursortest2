package com.ironsource;

/* loaded from: classes5.dex */
public interface C5<T> {

    public static final class a<T> implements com.ironsource.C5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.ArrayList<T> f5648a;
        private final java.util.ArrayList<T> b;

        public a(java.util.ArrayList<T> a2, java.util.ArrayList<T> b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
            this.f5648a = a2;
            this.b = b;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.f5648a.contains(t) || this.b.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.f5648a.size() + this.b.size();
        }

        @Override // com.ironsource.C5
        public java.util.List<T> value() {
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) this.f5648a, (java.lang.Iterable) this.b);
        }
    }

    public static final class b<T> implements com.ironsource.C5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C5<T> f5649a;
        private final java.util.Comparator<T> b;

        public b(com.ironsource.C5<T> collection, java.util.Comparator<T> comparator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.f5649a = collection;
            this.b = comparator;
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.f5649a.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.f5649a.size();
        }

        @Override // com.ironsource.C5
        public java.util.List<T> value() {
            return kotlin.collections.CollectionsKt.sortedWith(this.f5649a.value(), this.b);
        }
    }

    public static final class c<T> implements com.ironsource.C5<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f5650a;
        private final java.util.List<T> b;

        public c(com.ironsource.C5<T> collection, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
            this.f5650a = i;
            this.b = collection.value();
        }

        public final java.util.List<T> a() {
            int size = this.b.size();
            int i = this.f5650a;
            if (size <= i) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<T> list = this.b;
            return list.subList(i, list.size());
        }

        public final java.util.List<T> b() {
            java.util.List<T> list = this.b;
            return list.subList(0, kotlin.ranges.RangesKt.coerceAtMost(list.size(), this.f5650a));
        }

        @Override // com.ironsource.C5
        public boolean contains(T t) {
            return this.b.contains(t);
        }

        @Override // com.ironsource.C5
        public int size() {
            return this.b.size();
        }

        @Override // com.ironsource.C5
        public java.util.List<T> value() {
            return this.b;
        }
    }

    boolean contains(T t);

    int size();

    java.util.List<T> value();
}
