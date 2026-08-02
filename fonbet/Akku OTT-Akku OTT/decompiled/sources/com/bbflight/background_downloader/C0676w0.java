package com.bbflight.background_downloader;

import android.content.Context;
import com.bbflight.background_downloader.M0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FileSystemException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$stitchChunks$2", f = "ParallelDownloadTaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
@SourceDebugExtension({"SMAP\nParallelDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$stitchChunks$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,502:1\n1068#2:503\n1#3:504\n*S KotlinDebug\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$stitchChunks$2\n*L\n363#1:503\n*E\n"})
/* renamed from: com.bbflight.background_downloader.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0676w0 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super W0>, Object> {
    public final /* synthetic */ ParallelDownloadTaskWorker a;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$stitchChunks$2\n*L\n1#1,328:1\n363#2:329\n*E\n"})
    /* renamed from: com.bbflight.background_downloader.w0$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((O) t).e), Long.valueOf(((O) t2).e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676w0(ParallelDownloadTaskWorker parallelDownloadTaskWorker, Continuation<? super C0676w0> continuation) {
        super(2, continuation);
        this.a = parallelDownloadTaskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0676w0(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super W0> continuation) {
        return ((C0676w0) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ParallelDownloadTaskWorker parallelDownloadTaskWorker = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            try {
                byte[] bArr = new byte[8192];
                M0 k = parallelDownloadTaskWorker.k();
                Context applicationContext = parallelDownloadTaskWorker.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                M0.b bVar = M0.Companion;
                File file = new File(k.b(applicationContext, null));
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    Iterator it = CollectionsKt.sortedWith(parallelDownloadTaskWorker.C, new a()).iterator();
                    while (it.hasNext()) {
                        M0 m0 = ((O) it.next()).d;
                        Context applicationContext2 = parallelDownloadTaskWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                        File file2 = new File(m0.b(applicationContext2, null));
                        if (!file2.exists()) {
                            throw new FileSystemException(file2, null, "Missing chunk file", 2, null);
                        }
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        while (true) {
                            try {
                                int read = fileInputStream.read(bArr, 0, 8192);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            } finally {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                    }
                    fileOutputStream.flush();
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    Iterator<O> it2 = parallelDownloadTaskWorker.C.iterator();
                    while (it2.hasNext()) {
                        try {
                            M0 m02 = it2.next().d;
                            Context applicationContext3 = parallelDownloadTaskWorker.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                            new File(m02.b(applicationContext3, null)).delete();
                        } catch (FileSystemException unused) {
                        }
                    }
                    return W0.d;
                } finally {
                }
            } catch (Exception e) {
                ExceptionsKt.stackTraceToString(e);
                e.toString();
                parallelDownloadTaskWorker.q = new P0(W.c, "Error stitching chunks: " + e, 2);
                W0 w0 = W0.f;
                Iterator<O> it3 = parallelDownloadTaskWorker.C.iterator();
                while (it3.hasNext()) {
                    try {
                        M0 m03 = it3.next().d;
                        Context applicationContext4 = parallelDownloadTaskWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                        M0.b bVar2 = M0.Companion;
                        new File(m03.b(applicationContext4, null)).delete();
                    } catch (FileSystemException unused2) {
                    }
                }
                return w0;
            }
        } finally {
            Iterator<O> it4 = parallelDownloadTaskWorker.C.iterator();
            while (it4.hasNext()) {
                try {
                    M0 m04 = it4.next().d;
                    Context applicationContext5 = parallelDownloadTaskWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
                    M0.b bVar3 = M0.Companion;
                    new File(m04.b(applicationContext5, null)).delete();
                } catch (FileSystemException unused3) {
                }
            }
        }
    }
}
