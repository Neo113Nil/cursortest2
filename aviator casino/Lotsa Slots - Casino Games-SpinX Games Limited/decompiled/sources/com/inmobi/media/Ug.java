package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ug extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4998a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ug(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4998a = context;
    }

    public static final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return kotlin.text.StringsKt.startsWith$default(str, "auto_", false, 2, (java.lang.Object) null);
    }

    public static final boolean b(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Ug(this.f4998a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Ug(this.f4998a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.Xg xg = com.inmobi.media.Xg.f5049a;
            android.content.Context context = this.f4998a;
            xg.getClass();
            if (com.inmobi.media.Xg.d == null) {
                com.inmobi.media.Xg.d = new com.inmobi.media.Ig(context, "pub_signals_store");
            }
            com.inmobi.media.Ig ig = null;
            try {
                com.inmobi.media.Ig ig2 = com.inmobi.media.Xg.d;
                if (ig2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    ig2 = null;
                }
                java.lang.String a2 = ig2.a("saved_signals");
                if (a2 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(a2);
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    java.util.Iterator it = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filterNot(kotlin.sequences.SequencesKt.asSequence(keys), new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Ug$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(com.inmobi.media.Ug.a((java.lang.String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((java.lang.String) it.next());
                    }
                    com.inmobi.media.Ig ig3 = com.inmobi.media.Xg.d;
                    if (ig3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        ig3 = null;
                    }
                    java.lang.String value = jSONObject.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    ig3.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    ig3.f4765a.a("saved_signals", value, true);
                }
            } catch (java.lang.Exception e) {
                com.inmobi.media.Ig ig4 = com.inmobi.media.Xg.d;
                if (ig4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    ig4 = null;
                }
                ig4.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
                ig4.f4765a.a("saved_signals");
                com.inmobi.media.Xg.f5049a.getClass();
                com.inmobi.media.Xg.e.a();
                com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            }
            try {
                com.inmobi.media.Ig ig5 = com.inmobi.media.Xg.d;
                if (ig5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    ig5 = null;
                }
                java.lang.String a3 = ig5.a("imp_depth");
                if (a3 != null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(a3);
                    java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
                    java.util.Iterator it2 = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filterNot(kotlin.sequences.SequencesKt.asSequence(keys2), new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Ug$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(com.inmobi.media.Ug.b((java.lang.String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((java.lang.String) it2.next());
                    }
                    com.inmobi.media.Ig ig6 = com.inmobi.media.Xg.d;
                    if (ig6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        ig6 = null;
                    }
                    java.lang.String value2 = jSONObject2.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
                    ig6.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value2, "value");
                    com.inmobi.media.La la = ig6.f4765a;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                    la.a("imp_depth", value2, false);
                }
            } catch (java.lang.Exception unused) {
                com.inmobi.media.Ig ig7 = com.inmobi.media.Xg.d;
                if (ig7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                } else {
                    ig = ig7;
                }
                ig.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
                ig.f4765a.a("imp_depth");
            }
            com.inmobi.media.Xg.f5049a.getClass();
            com.inmobi.media.I1 i1 = com.inmobi.media.Xg.e;
            i1.c = i1.f4754a.invoke();
            com.inmobi.media.I1 i12 = com.inmobi.media.Xg.f;
            i12.c = i12.f4754a.invoke();
        } catch (java.lang.Exception e2) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
        com.inmobi.media.Xg.f5049a.getClass();
        com.inmobi.media.I1 i13 = com.inmobi.media.Xg.e;
        i13.c = i13.f4754a.invoke();
        com.inmobi.media.I1 i14 = com.inmobi.media.Xg.f;
        i14.c = i14.f4754a.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
