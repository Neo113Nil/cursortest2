package com.ironsource;

/* loaded from: classes5.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.R1.a f5944a = new com.ironsource.R1.a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final void a() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                android.util.Log.e("AssertThread", "ALERT UI THREAD: " + java.lang.Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void a() {
        f5944a.a();
    }
}
