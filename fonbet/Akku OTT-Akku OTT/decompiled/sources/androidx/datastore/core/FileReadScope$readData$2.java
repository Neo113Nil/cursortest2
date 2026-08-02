package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", i = {}, l = {162, 170}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope$readData$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes.dex */
public final class FileReadScope$readData$2<T> extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FileReadScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$2(FileReadScope<T> fileReadScope, Continuation<? super FileReadScope$readData$2> continuation) {
        super(1, continuation);
        this.this$0 = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FileReadScope$readData$2(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        java.io.Closeable closeable;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
                try {
                } catch (FileNotFoundException unused) {
                    if (!this.this$0.getFile().exists()) {
                        return this.this$0.getSerializer().getDefaultValue();
                    }
                    FileInputStream fileInputStream = new FileInputStream(this.this$0.getFile());
                    try {
                        Serializer<T> serializer = this.this$0.getSerializer();
                        this.L$0 = fileInputStream;
                        this.label = 2;
                        Object readFrom = serializer.readFrom(fileInputStream, this);
                        if (readFrom != coroutine_suspended) {
                            closeable = fileInputStream;
                            obj = readFrom;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        closeable = fileInputStream;
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            kotlin.io.CloseableKt.closeFinally(closeable, th);
                            throw th3;
                        }
                    }
                }
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FileInputStream fileInputStream2 = new FileInputStream(this.this$0.getFile());
                    Serializer<T> serializer2 = this.this$0.getSerializer();
                    this.L$0 = fileInputStream2;
                    this.label = 1;
                    obj = serializer2.readFrom(fileInputStream2, this);
                    r1 = fileInputStream2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (java.io.Closeable) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            kotlin.io.CloseableKt.closeFinally(closeable, null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    java.io.Closeable closeable2 = (java.io.Closeable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = closeable2;
                }
                kotlin.io.CloseableKt.closeFinally(r1, null);
                return obj;
            } finally {
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.this$0.getFile().getParent(), e);
            }
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super T> continuation) {
        return ((FileReadScope$readData$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
