package com.moloco.sdk.internal.android_context;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.android_context.a f6931a = new com.moloco.sdk.internal.android_context.a();
    public static volatile android.content.Context b;

    public final android.content.Context a() {
        android.content.Context context = b;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("value");
        return null;
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        b = context.getApplicationContext();
    }
}
