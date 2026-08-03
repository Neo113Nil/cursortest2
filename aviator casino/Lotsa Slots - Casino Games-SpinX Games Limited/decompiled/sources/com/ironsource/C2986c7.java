package com.ironsource;

/* renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2986c7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.ironsource.c7$a */
    public static final class a<T> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference<T> f6171a;

        a(T t) {
            this.f6171a = new java.lang.ref.WeakReference<>(t);
        }

        public final java.lang.ref.WeakReference<T> a() {
            return this.f6171a;
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public T getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
            return this.f6171a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
            this.f6171a = new java.lang.ref.WeakReference<>(t);
        }

        public final void a(java.lang.ref.WeakReference<T> weakReference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f6171a = weakReference;
        }
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty a(java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> a(T t) {
        return new com.ironsource.C2986c7.a(t);
    }
}
