package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes4.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f5037a;
    public final Function1 b;
    public final Function1 c;
    public final long d;

    public static final class a extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String g;

        /* renamed from: com.chartboost.sdk.impl.v2$a$a, reason: collision with other inner class name */
        public static final class C0220a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ Ref.ObjectRef c;
            public final /* synthetic */ URL d;
            public final /* synthetic */ Ref.ObjectRef e;
            public final /* synthetic */ Ref.ObjectRef f;
            public final /* synthetic */ v2 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220a(Ref.ObjectRef objectRef, URL url, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, v2 v2Var, Continuation continuation) {
                super(2, continuation);
                this.c = objectRef;
                this.d = url;
                this.e = objectRef2;
                this.f = objectRef3;
                this.g = v2Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0220a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0220a(this.c, this.d, this.e, this.f, this.g, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, android.graphics.Bitmap] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.io.InputStream] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ?? r0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = this.c;
                URLConnection openConnection = this.d.openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                ?? r02 = (HttpsURLConnection) openConnection;
                Ref.ObjectRef objectRef2 = this.f;
                r02.setDoInput(true);
                objectRef2.element = r02.getInputStream();
                objectRef.element = r02;
                Ref.ObjectRef objectRef3 = this.e;
                InputStream inputStream = (InputStream) this.f.element;
                if (inputStream == null || (r0 = (Bitmap) this.g.c.invoke(inputStream)) == 0) {
                    throw new IOException("Bitmap decoded to null");
                }
                objectRef3.element = r0;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return v2.this.new a(this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
        
            if (r15 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        
            return r2.element;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        
            r15.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        
            if (r15 != null) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            Exception e;
            Ref.ObjectRef objectRef4;
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            HttpsURLConnection httpsURLConnection2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                try {
                    URL url = (URL) v2.this.b.invoke(this.g);
                    long j = v2.this.d;
                    C0220a c0220a = new C0220a(objectRef, url, objectRef5, objectRef2, v2.this, null);
                    this.b = objectRef5;
                    this.c = objectRef;
                    this.d = objectRef2;
                    this.e = 1;
                    if (TimeoutKt.withTimeout(j, c0220a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef3 = objectRef5;
                    objectRef4 = objectRef2;
                } catch (Exception e2) {
                    objectRef3 = objectRef5;
                    e = e2;
                    objectRef4 = objectRef2;
                    mb.e("Unable to download the info icon image", e);
                    inputStream2 = (InputStream) objectRef4.element;
                    if (inputStream2 != null) {
                    }
                    httpsURLConnection2 = (HttpsURLConnection) objectRef.element;
                } catch (Throwable th) {
                    th = th;
                    inputStream = (InputStream) objectRef2.element;
                    if (inputStream != null) {
                    }
                    httpsURLConnection = (HttpsURLConnection) objectRef.element;
                    if (httpsURLConnection != null) {
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef4 = (Ref.ObjectRef) this.d;
                objectRef = (Ref.ObjectRef) this.c;
                objectRef3 = (Ref.ObjectRef) this.b;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        mb.e("Unable to download the info icon image", e);
                        inputStream2 = (InputStream) objectRef4.element;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection2 = (HttpsURLConnection) objectRef.element;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectRef2 = objectRef4;
                    inputStream = (InputStream) objectRef2.element;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpsURLConnection = (HttpsURLConnection) objectRef.element;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            }
            InputStream inputStream3 = (InputStream) objectRef4.element;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            httpsURLConnection2 = (HttpsURLConnection) objectRef.element;
        }
    }

    public v2(CoroutineDispatcher ioDispatcher, Function1 urlFactory, Function1 bitmapFactory) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        this.f5037a = ioDispatcher;
        this.b = urlFactory;
        this.c = bitmapFactory;
        this.d = 1000L;
    }

    public static final URL a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new URL(it);
    }

    public static final Bitmap a(InputStream it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BitmapFactory.decodeStream(it);
    }

    public final Object a(String str, Continuation continuation) {
        return BuildersKt.withContext(this.f5037a, new a(str, null), continuation);
    }

    public /* synthetic */ v2(CoroutineDispatcher coroutineDispatcher, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 2) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.v2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v2.a((String) obj);
            }
        } : function1, (i & 4) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.v2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v2.a((InputStream) obj);
            }
        } : function12);
    }
}
