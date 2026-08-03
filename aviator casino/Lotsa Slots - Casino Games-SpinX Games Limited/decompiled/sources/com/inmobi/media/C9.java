package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class C9 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f4637a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.C9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.C9.b();
        }
    });
    public static final java.lang.String b = "C9";

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNull("C9");
    }

    public static java.lang.String a() {
        com.inmobi.media.La la = (com.inmobi.media.La) f4637a.getValue();
        java.lang.String str = null;
        if (la != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cip", com.ironsource.X3.i.W);
            str = la.f4815a.getString("cip", null);
        }
        java.lang.String TAG = b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return str;
    }

    public static final com.inmobi.media.La b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        return com.inmobi.media.Ka.a(context, "inmobi_store");
    }

    public static void a(java.lang.String str) {
        com.inmobi.media.La la = (com.inmobi.media.La) f4637a.getValue();
        if (la != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            la.a("cip", str, false);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(b);
    }
}
