package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class Z6 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ReadWriteProperty<Object, T> {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<T> f8043a;

        a(T t) {
            this.f8043a = new WeakReference<>(t);
        }

        public final WeakReference<T> a() {
            return this.f8043a;
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public T getValue(Object thisRef, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f8043a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object thisRef, KProperty<?> property, T t) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f8043a = new WeakReference<>(t);
        }

        public final void a(WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f8043a = weakReference;
        }
    }

    public static /* synthetic */ ReadWriteProperty a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> ReadWriteProperty<Object, T> a(T t) {
        return new a(t);
    }
}
