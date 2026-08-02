package com.iovation.mobile.android.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.a.j f3923a;
    public final java.util.List b;
    public final java.util.List c;

    public f(android.content.Context context, android.os.Handler handler, com.iovation.mobile.android.b.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "");
        this.f3923a = new com.iovation.mobile.android.a.j();
        java.lang.Object systemService = context.getSystemService("location");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        com.iovation.mobile.android.b.t tVar = new com.iovation.mobile.android.b.t(handler, (android.location.LocationManager) systemService);
        this.b = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.iovation.mobile.android.a.h[]{new com.iovation.mobile.android.a.c(), new com.iovation.mobile.android.a.d(), new com.iovation.mobile.android.a.l(), new com.iovation.mobile.android.a.u(), new com.iovation.mobile.android.a.r(), new com.iovation.mobile.android.a.a(), new com.iovation.mobile.android.a.b(), new com.iovation.mobile.android.a.o(), new com.iovation.mobile.android.a.q(), new com.iovation.mobile.android.a.p(), new com.iovation.mobile.android.a.m(), new com.iovation.mobile.android.details.RP(), new com.iovation.mobile.android.a.s(), new com.iovation.mobile.android.a.t(), new com.iovation.mobile.android.a.e(), new com.iovation.mobile.android.a.k(), new com.iovation.mobile.android.a.n()});
        this.c = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.iovation.mobile.android.a.g[]{new com.iovation.mobile.android.b.j(kVar), new com.iovation.mobile.android.b.e(kVar, tVar, new android.location.Geocoder(context, java.util.Locale.US)), new com.iovation.mobile.android.b.f(tVar), new com.iovation.mobile.android.b.a(context)});
    }

    public final java.lang.String a(android.content.Context context, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.iovation.mobile.android.a.i iVar = (com.iovation.mobile.android.a.i) it.next();
            try {
                java.util.Map a2 = iVar.a(context);
                com.iovation.mobile.android.a.j jVar = this.f3923a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                for (java.util.Map.Entry entry : a2.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                        jVar.f3924a.put(str, str2);
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(iVar.getName());
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb2.append(th.getClass().getSimpleName());
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                java.lang.StackTraceElement stackTraceElement = th.getStackTrace()[0];
                sb2.append(stackTraceElement != null ? stackTraceElement.getMethodName() : null);
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                java.lang.StackTraceElement stackTraceElement2 = th.getStackTrace()[0];
                sb2.append(stackTraceElement2 != null ? java.lang.Integer.valueOf(stackTraceElement2.getLineNumber()) : null);
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                sb.append(sb2.toString());
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
