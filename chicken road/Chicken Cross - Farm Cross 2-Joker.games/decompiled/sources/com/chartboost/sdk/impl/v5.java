package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.caching.ExpirationReason;
import java.io.File;
import java.net.URL;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class v5 implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public final t3 f5039a;
    public final r3 b;
    public final CoroutineDispatcher c;

    public static final class a extends SuspendLambda implements Function2 {
        public long b;
        public long c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public final /* synthetic */ long h;
        public final /* synthetic */ v5 i;

        /* renamed from: com.chartboost.sdk.impl.v5$a$a, reason: collision with other inner class name */
        public static final class C0221a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, v5 v5Var, Continuation continuation) {
            super(2, continuation);
            this.h = j;
            this.i = v5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.h, this.i, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:37|38|39|40|41|(2:43|44)) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0186, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x018a, code lost:
        
            r15 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00ce A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:13:0x00c8, B:15:0x00ce, B:17:0x00db, B:22:0x0103, B:24:0x0107, B:25:0x010d, B:72:0x0053, B:75:0x006d, B:78:0x0076, B:80:0x00b8), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0107 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:13:0x00c8, B:15:0x00ce, B:17:0x00db, B:22:0x0103, B:24:0x0107, B:25:0x010d, B:72:0x0053, B:75:0x006d, B:78:0x0076, B:80:0x00b8), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01ed A[Catch: Exception -> 0x0228, TRY_LEAVE, TryCatch #3 {Exception -> 0x0228, blocks: (B:29:0x012d, B:33:0x0138, B:48:0x018b, B:35:0x01c8, B:53:0x01ed), top: B:28:0x012d }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0260  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            Object b;
            Iterator it;
            File file;
            long j2;
            String str;
            Exception e;
            long j3;
            long j4;
            Iterator it2;
            Object obj2;
            Object obj3;
            File file2;
            File file3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.g;
            int i2 = 3;
            int i3 = 2;
            try {
            } catch (Exception e2) {
                e = e2;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j5 = this.h;
                if (j5 <= 0) {
                    return Boxing.boxLong(0L);
                }
                mb.a("Attempting to free " + j5 + " bytes via LRU eviction...", (Throwable) null, 2, (Object) null);
                try {
                    t3 t3Var = this.i.f5039a;
                    this.b = 0L;
                    this.g = 1;
                    b = t3Var.b(this);
                    if (b != coroutine_suspended) {
                        j = 0;
                    }
                    return coroutine_suspended;
                } catch (Exception e3) {
                    e = e3;
                    j = 0;
                    mb.b("LRU eviction error: bytesFreedSoFar=" + j + ", bytesToFree=" + this.h + ", errorType=" + e.getClass().getSimpleName(), e);
                    if (j > 0) {
                    }
                    return Boxing.boxLong(j);
                }
            }
            if (i != 1) {
                if (i == 2) {
                    j3 = this.c;
                    j = this.b;
                    file3 = (File) this.f;
                    file2 = (File) this.e;
                    it = (Iterator) this.d;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    q3 q3Var = (q3) obj3;
                    if (q3Var == null) {
                    }
                    t3 t3Var2 = this.i.f5039a;
                    this.d = it;
                    this.e = file2;
                    this.f = r8;
                    this.b = j;
                    this.c = j3;
                    this.g = i2;
                    obj2 = t3Var2.a(file2, file3, this);
                    if (obj2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    j3 = this.c;
                    long j6 = this.b;
                    String str2 = (String) this.f;
                    File file4 = (File) this.e;
                    it2 = (Iterator) this.d;
                    ResultKt.throwOnFailure(obj);
                    j4 = j6;
                    file = file4;
                    str = str2;
                    obj2 = obj;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    i2 = 3;
                    i3 = 2;
                    if (it.hasNext()) {
                    }
                    if (j > 0) {
                    }
                    return Boxing.boxLong(j);
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j7 = this.b;
                str = (String) this.f;
                file = (File) this.e;
                Iterator it3 = (Iterator) this.d;
                try {
                    ResultKt.throwOnFailure(obj);
                    it = it3;
                    j = j7;
                } catch (Exception e4) {
                    e = e4;
                    j2 = j7;
                    mb.e("LRU eviction URL parse failed: url=" + str + ", file=" + file.getName() + ", errorType=" + e.getClass().getSimpleName(), null, 2, null);
                    it = it3;
                    j = j2;
                    i2 = 3;
                    i3 = 2;
                    if (it.hasNext()) {
                    }
                    if (j > 0) {
                    }
                    return Boxing.boxLong(j);
                }
                i2 = 3;
                i3 = 2;
                if (it.hasNext()) {
                    file2 = (File) it.next();
                    if (j < this.h) {
                        j3 = file2.length();
                        file3 = this.i.f5039a.a(file2);
                        t3 t3Var3 = this.i.f5039a;
                        this.d = it;
                        this.e = file2;
                        this.f = file3;
                        this.b = j;
                        this.c = j3;
                        this.g = i3;
                        obj3 = t3Var3.b(file3, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        q3 q3Var2 = (q3) obj3;
                        String b2 = q3Var2 == null ? q3Var2.b() : null;
                        t3 t3Var22 = this.i.f5039a;
                        this.d = it;
                        this.e = file2;
                        this.f = b2;
                        this.b = j;
                        this.c = j3;
                        this.g = i2;
                        obj2 = t3Var22.a(file2, file3, this);
                        if (obj2 != coroutine_suspended) {
                            long j8 = j;
                            file = file2;
                            it2 = it;
                            str = b2;
                            j4 = j8;
                            try {
                                if (((Boolean) obj2).booleanValue()) {
                                    mb.e("LRU eviction delete failed: file=" + file.getAbsolutePath() + ", fileSize=" + j3 + ", bytesFreedSoFar=" + j4 + ", bytesToFree=" + this.h, null, 2, null);
                                    j = j4;
                                    it = it2;
                                } else {
                                    j2 = j4 + j3;
                                    mb.a("Evicted (LRU): " + file.getName() + " (" + j3 + " bytes)", (Throwable) null, 2, (Object) null);
                                    if (str != null) {
                                        try {
                                        } catch (Exception e5) {
                                            e = e5;
                                        }
                                        URL url = new URL(str);
                                        r3 r3Var = this.i.b;
                                        ExpirationReason expirationReason = ExpirationReason.SIZE_LIMIT_EVICTION;
                                        this.d = it2;
                                        this.e = file;
                                        this.f = str;
                                        this.b = j2;
                                        this.g = 4;
                                        if (r3Var.a(url, expirationReason, this) != coroutine_suspended) {
                                            it = it2;
                                            j = j2;
                                        }
                                    } else {
                                        mb.e("LRU eviction metadata missing URL: file=" + file.getName() + ", fileSize=" + j3, null, 2, null);
                                        j = j2;
                                        it = it2;
                                    }
                                }
                                i2 = 3;
                                i3 = 2;
                                if (it.hasNext()) {
                                }
                            } catch (Exception e6) {
                                e = e6;
                                j = j4;
                                mb.b("LRU eviction error: bytesFreedSoFar=" + j + ", bytesToFree=" + this.h + ", errorType=" + e.getClass().getSimpleName(), e);
                                if (j > 0) {
                                }
                                return Boxing.boxLong(j);
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (j > 0) {
                    mb.a("Freed " + j + " bytes during LRU eviction.", (Throwable) null, 2, (Object) null);
                }
                return Boxing.boxLong(j);
            }
            j = this.b;
            ResultKt.throwOnFailure(obj);
            b = obj;
            it = CollectionsKt.sortedWith((Iterable) b, new C0221a()).iterator();
            if (it.hasNext()) {
            }
            if (j > 0) {
            }
            return Boxing.boxLong(j);
        }
    }

    public v5(t3 storage, r3 notifier, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f5039a = storage;
        this.b = notifier;
        this.c = ioDispatcher;
    }

    @Override // com.chartboost.sdk.impl.s3
    public boolean a(q3 q3Var) {
        if (q3Var != null) {
            return System.currentTimeMillis() > q3Var.a();
        }
        mb.e("Cannot check expiry: Metadata is null.", null, 2, null);
        return false;
    }

    @Override // com.chartboost.sdk.impl.s3
    public Object a(Function0 function0, long j, Continuation continuation) {
        return BuildersKt.withContext(this.c, new a(j, this, null), continuation);
    }
}
