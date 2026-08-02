package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f"}, d2 = {"Lcom/izettle/android/auth/NullableServiceLocatorDelegate;", "T", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "Ljava/lang/Class;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NullableServiceLocatorDelegate<T> {
    private final java.lang.Class<T> type;

    public NullableServiceLocatorDelegate(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.type = cls;
    }

    public final T getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        try {
            return (T) com.izettle.android.auth.ServiceLocator.INSTANCE.locate(this.type);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
