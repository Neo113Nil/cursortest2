package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fa {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f4702a;
    public final java.lang.String b;
    public final java.util.Map c;

    public Fa(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f4702a = coroutineScope;
        this.b = "Fa";
        this.c = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
    }

    public final void a(final java.lang.String id, kotlin.jvm.functions.Function2 block) {
        final kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f4702a, null, null, new com.inmobi.media.Ea(block, null), 3, null);
        java.util.Map jobMap = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jobMap, "jobMap");
        java.lang.Object obj = jobMap.get(id);
        if (obj == null) {
            obj = new java.util.concurrent.CopyOnWriteArrayList();
            jobMap.put(id, obj);
        }
        ((java.util.List) obj).add(launch$default);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Fa$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.inmobi.media.Fa.a(com.inmobi.media.Fa.this, id, launch$default, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final kotlin.Unit a(com.inmobi.media.Fa fa, java.lang.String str, kotlinx.coroutines.Job job, java.lang.Throwable th) {
        java.lang.String tag = fa.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
        java.util.List list = (java.util.List) fa.c.get(str);
        if (list != null) {
            list.remove(job);
        }
        return kotlin.Unit.INSTANCE;
    }
}
