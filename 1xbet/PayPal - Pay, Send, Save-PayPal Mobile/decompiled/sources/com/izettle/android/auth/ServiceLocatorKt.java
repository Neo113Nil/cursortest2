package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lcom/izettle/android/auth/NullableServiceLocatorDelegate;", "nullableServiceLocator", "()Lcom/izettle/android/auth/NullableServiceLocatorDelegate;", "Lcom/izettle/android/auth/ServiceLocatorDelegate;", "serviceLocator", "()Lcom/izettle/android/auth/ServiceLocatorDelegate;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServiceLocatorKt {
    public static final /* synthetic */ <T> com.izettle.android.auth.ServiceLocatorDelegate<T> serviceLocator() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new com.izettle.android.auth.ServiceLocatorDelegate<>(java.lang.Object.class);
    }

    public static final /* synthetic */ <T> com.izettle.android.auth.NullableServiceLocatorDelegate<T> nullableServiceLocator() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new com.izettle.android.auth.NullableServiceLocatorDelegate<>(java.lang.Object.class);
    }
}
