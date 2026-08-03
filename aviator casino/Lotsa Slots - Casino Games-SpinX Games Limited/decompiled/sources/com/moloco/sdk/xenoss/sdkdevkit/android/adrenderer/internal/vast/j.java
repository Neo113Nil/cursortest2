package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class j implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserImpl", f = "VastParser.kt", i = {}, l = {65}, m = "invoke", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7709a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x005d, B:14:0x0061, B:19:0x0067), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x005d, B:14:0x0061, B:19:0x0067), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.a aVar;
        int i;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.lang.Object S;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        java.io.StringReader stringReader = new java.io.StringReader(str);
                        try {
                            org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                            newPullParser.setInput(stringReader);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newPullParser);
                            aVar.f7709a = stringReader;
                            aVar.d = 1;
                            S = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S(newPullParser, aVar);
                            if (S == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = S;
                            closeable = stringReader;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            closeable = stringReader;
                            throw th;
                        }
                    } catch (java.lang.Exception unused) {
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (java.io.Closeable) aVar.f7709a;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlin.io.CloseableKt.closeFinally(closeable, th);
                            throw th4;
                        }
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) obj;
                java.lang.Object bVar = wVar == null ? new com.moloco.sdk.internal.v.b(wVar) : new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.c);
                kotlin.io.CloseableKt.closeFinally(closeable, null);
                return bVar;
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j.a(continuation);
        java.lang.Object obj2 = aVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) obj2;
        if (wVar2 == null) {
        }
        kotlin.io.CloseableKt.closeFinally(closeable, null);
        return bVar;
    }
}
