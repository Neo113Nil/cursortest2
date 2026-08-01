package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.StatFs;
import com.chartboost.sdk.impl.p6;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class p6 implements t3 {
    public static final a e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4955a;
    public final CoroutineDispatcher b;
    public final String c;
    public final Lazy d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ URL d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URL url, Continuation continuation) {
            super(2, continuation);
            this.d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p6.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            p6 p6Var = p6.this;
            File a2 = p6Var.a(this.d);
            File c = p6.this.c(this.d);
            this.b = 1;
            Object a3 = p6Var.a(a2, c, this);
            return a3 == coroutine_suspended ? coroutine_suspended : a3;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;
        public final /* synthetic */ File d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.c = file;
            this.d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            try {
                if (this.c.exists()) {
                    this.c.delete();
                }
                if (this.d.exists()) {
                    long length = this.d.length();
                    if (!this.d.delete()) {
                        mb.e("Data file delete failed: path=" + this.d.getAbsolutePath() + ", fileSize=" + length, null, 2, null);
                        return Boxing.boxBoolean(false);
                    }
                    z = true;
                }
            } catch (Exception e) {
                mb.b("Cache file delete error: dataFile=" + this.d.getAbsolutePath() + ", metaFile=" + this.c.getAbsolutePath() + ", errorType=" + e.getClass().getSimpleName(), e);
            }
            return Boxing.boxBoolean(z);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;
        public final /* synthetic */ File d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.c = file;
            this.d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                z = this.c.renameTo(this.d);
            } catch (Exception e) {
                long length = this.c.exists() ? this.c.length() : 0L;
                mb.b("File finalize failed: tempFile=" + this.c.getAbsolutePath() + ", targetFile=" + this.d.getAbsolutePath() + ", tempExists=" + this.c.exists() + ", tempSize=" + length + ", targetExists=" + this.d.exists() + ", errorType=" + e.getClass().getSimpleName(), e);
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p6.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File b = p6.this.b();
            if (b == null) {
                return Boxing.boxLong(0L);
            }
            Ref.LongRef longRef = new Ref.LongRef();
            File[] listFiles = b.listFiles(new FileFilter() { // from class: com.chartboost.sdk.impl.p6$e$$ExternalSyntheticLambda0
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return p6.e.a(file);
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    mb.e("Cleaning up stray temp file during init: " + file.getName(), null, 2, null);
                    try {
                        file.delete();
                    } catch (Exception e) {
                        mb.b("Init temp file delete failed: file=" + file.getAbsolutePath() + ", errorType=" + e.getClass().getSimpleName(), e);
                    }
                }
            }
            File[] listFiles2 = b.listFiles();
            if (listFiles2 != null) {
                p6 p6Var = p6.this;
                for (File file2 : listFiles2) {
                    try {
                        Intrinsics.checkNotNull(file2);
                        if (p6Var.c(file2)) {
                            if (p6Var.a(file2).exists()) {
                                longRef.element += file2.length();
                            } else {
                                mb.e("Metadata missing for " + file2.getName() + ", deleting data file.", null, 2, null);
                                Boxing.boxBoolean(file2.delete());
                            }
                        } else if (p6Var.d(file2) && !p6Var.b(file2).exists()) {
                            mb.e("Data file missing for " + file2.getName() + ", deleting metadata file.", null, 2, null);
                            file2.delete();
                        }
                    } catch (Exception e2) {
                        mb.b("Cache init file processing error: file=" + file2.getAbsolutePath() + ", fileSize=" + file2.length() + ", errorType=" + e2.getClass().getSimpleName(), e2);
                    }
                }
            }
            return Boxing.boxLong(longRef.element);
        }

        public static final boolean a(File file) {
            if (file.isFile()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.endsWith$default(name, ".tmp", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p6.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File b = p6.this.b();
            if (b != null) {
                final p6 p6Var = p6.this;
                File[] listFiles = b.listFiles(new FileFilter() { // from class: com.chartboost.sdk.impl.p6$f$$ExternalSyntheticLambda0
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return p6.f.a(p6.this, file);
                    }
                });
                if (listFiles != null && (list = ArraysKt.toList(listFiles)) != null) {
                    return list;
                }
            }
            return CollectionsKt.emptyList();
        }

        public static final boolean a(p6 p6Var, File file) {
            Intrinsics.checkNotNull(file);
            return p6Var.c(file);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ URL d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(URL url, Continuation continuation) {
            super(2, continuation);
            this.d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p6.this.new g(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            p6 p6Var = p6.this;
            File c = p6Var.c(this.d);
            this.b = 1;
            Object b = p6Var.b(c, this);
            return b == coroutine_suspended ? coroutine_suspended : b;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(File file, Continuation continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.c.exists()) {
                return null;
            }
            try {
                return q3.c.a(FilesKt.readText(this.c, Charsets.UTF_8));
            } catch (IOException e) {
                mb.b("Metadata read IO error: file=" + this.c.getAbsolutePath() + ", fileSize=" + this.c.length() + ", errorType=IOException", e);
                return null;
            } catch (Exception e2) {
                mb.b("Metadata read failed: file=" + this.c.getAbsolutePath() + ", fileSize=" + this.c.length() + ", errorType=" + e2.getClass().getSimpleName(), e2);
                return null;
            }
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            try {
                if (this.c.exists()) {
                    this.c.setLastModified(System.currentTimeMillis());
                    z = true;
                }
            } catch (Exception e) {
                mb.b("Access time update failed: file=" + this.c.getAbsolutePath() + ", errorType=" + e.getClass().getSimpleName(), e);
            }
            return Boxing.boxBoolean(z);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ URL d;
        public final /* synthetic */ q3 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(URL url, q3 q3Var, Continuation continuation) {
            super(2, continuation);
            this.d = url;
            this.e = q3Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return p6.this.new j(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File c = p6.this.c(this.d);
            File file = new File(c.getParentFile(), c.getName() + ".tmp");
            boolean z = false;
            try {
                FilesKt.writeText(file, this.e.c(), Charsets.UTF_8);
                if (file.renameTo(c)) {
                    z = true;
                } else {
                    mb.b("Metadata rename failed: tempFile=" + file.getAbsolutePath() + ", targetFile=" + c.getAbsolutePath() + ", tempExists=" + file.exists() + ", targetExists=" + c.exists(), (Throwable) null, 2, (Object) null);
                    file.delete();
                }
            } catch (IOException e) {
                mb.b("Metadata write IO error: tempFile=" + file.getAbsolutePath() + ", url=" + this.e.b() + ", errorType=IOException", e);
                file.delete();
            } catch (Exception e2) {
                mb.b("Metadata write failed: tempFile=" + file.getAbsolutePath() + ", url=" + this.e.b() + ", errorType=" + e2.getClass().getSimpleName(), e2);
                file.delete();
            }
            return Boxing.boxBoolean(z);
        }
    }

    public p6(Context context, CoroutineDispatcher ioDispatcher, String cacheSubdir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSubdir, "cacheSubdir");
        this.f4955a = context;
        this.b = ioDispatcher;
        this.c = cacheSubdir;
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.p6$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p6.b(p6.this);
            }
        });
    }

    public final boolean d(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "cache_", false, 2, (Object) null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".meta", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final File b() {
        return (File) this.d.getValue();
    }

    public File c(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        File b2 = b();
        if (b2 == null) {
            throw new IllegalArgumentException("Cache directory not available");
        }
        return new File(b2, b(url) + ".meta");
    }

    public static final File b(p6 p6Var) {
        try {
            File cacheDir = p6Var.f4955a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            File file = new File(cacheDir, p6Var.c);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
            }
            return null;
        } catch (SecurityException e2) {
            mb.b("Cache directory security error: cacheSubdir=" + p6Var.c + ", errorType=SecurityException, message=" + e2.getMessage(), e2);
            return null;
        } catch (Exception e3) {
            mb.b("Cache directory creation failed: cacheSubdir=" + p6Var.c + ", errorType=" + e3.getClass().getSimpleName() + ", message=" + e3.getMessage(), e3);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.t3
    public File a() {
        return b();
    }

    @Override // com.chartboost.sdk.impl.t3
    public boolean a(long j2) {
        File b2 = b();
        if (b2 == null) {
            return false;
        }
        try {
            long availableBytes = new StatFs(b2.getAbsolutePath()).getAvailableBytes();
            if (availableBytes >= j2) {
                return true;
            }
            mb.e("Disk space insufficient: path=" + b2.getAbsolutePath() + ", availableBytes=" + availableBytes + ", requiredBytes=" + j2 + ", shortfallBytes=" + (j2 - availableBytes), null, 2, null);
            return false;
        } catch (Exception e2) {
            mb.b("Disk space check failed: path=" + b2.getAbsolutePath() + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
            return false;
        }
    }

    public final boolean c(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "cache_", false, 2, (Object) null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".dat", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object b(File file, File file2, Continuation continuation) {
        return BuildersKt.withContext(this.b, new d(file, file2, null), continuation);
    }

    public final File b(File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.removeSuffix(name, (CharSequence) ".meta") + ".dat");
    }

    @Override // com.chartboost.sdk.impl.t3
    public File a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        File b2 = b();
        if (b2 != null) {
            return new File(b2, b(url) + ".dat");
        }
        throw new IllegalArgumentException("Cache directory not available");
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object b(URL url, Continuation continuation) {
        return BuildersKt.withContext(this.b, new g(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object b(File file, Continuation continuation) {
        return BuildersKt.withContext(this.b, new h(file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object b(Continuation continuation) {
        return BuildersKt.withContext(this.b, new f(null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public File a(File dataFile) {
        Intrinsics.checkNotNullParameter(dataFile, "dataFile");
        File parentFile = dataFile.getParentFile();
        String name = dataFile.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.removeSuffix(name, (CharSequence) ".dat") + ".meta");
    }

    public final String b(URL url) {
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        return "cache_" + a(url2);
    }

    public /* synthetic */ p6(Context context, CoroutineDispatcher coroutineDispatcher, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 4) != 0 ? "managed_file_cache_v2" : str);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object a(URL url, q3 q3Var, Continuation continuation) {
        return BuildersKt.withContext(this.b, new j(url, q3Var, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object a(File file, Continuation continuation) {
        return BuildersKt.withContext(this.b, new i(file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object a(URL url, Continuation continuation) {
        return BuildersKt.withContext(this.b, new b(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object a(File file, File file2, Continuation continuation) {
        return BuildersKt.withContext(this.b, new c(file2, file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.t3
    public Object a(Continuation continuation) {
        return BuildersKt.withContext(this.b, new e(null), continuation);
    }

    public final String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNull(digest);
            return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.chartboost.sdk.impl.p6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p6.a(((Byte) obj).byteValue());
                }
            }, 30, (Object) null);
        } catch (Exception e2) {
            mb.b("Failed to compute SHA-256 for '" + str + "', falling back to hashCode", e2);
            String num = Integer.toString(Math.abs(str.hashCode()), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            return num;
        }
    }

    public static final CharSequence a(byte b2) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
