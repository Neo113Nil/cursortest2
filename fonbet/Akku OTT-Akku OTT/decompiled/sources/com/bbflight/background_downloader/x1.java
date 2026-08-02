package com.bbflight.background_downloader;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.UploadTaskWorker$processBinaryUpload$2", f = "UploadTaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
public final class x1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Pair<? extends Long, ? extends InputStream>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ UploadTaskWorker c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z, UploadTaskWorker uploadTaskWorker, String str, Continuation<? super x1> continuation) {
        super(2, continuation);
        this.b = z;
        this.c = uploadTaskWorker;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        x1 x1Var = new x1(this.b, this.c, this.d, continuation);
        x1Var.a = obj;
        return x1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Pair<? extends Long, ? extends InputStream>> continuation) {
        return ((x1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.b;
        UploadTaskWorker uploadTaskWorker = this.c;
        if (!z) {
            String str = this.d;
            File file = new File(str);
            if (!file.exists() || !file.isFile()) {
                uploadTaskWorker.q = new P0(W.c, defpackage.g.a("File to upload does not exist: ", str), 2);
                return new Pair(null, null);
            }
            long length = file.length();
            if (length > 0) {
                return new Pair(Boxing.boxLong(length), new FileInputStream(file));
            }
            uploadTaskWorker.q = new P0(W.c, android.support.v4.media.b.b("File ", str, " has 0 length"), 2);
            return new Pair(null, null);
        }
        try {
            Uri parse = Uri.parse(uploadTaskWorker.k().l);
            ContentResolver contentResolver = uploadTaskWorker.getApplicationContext().getContentResolver();
            Cursor query = contentResolver.query(parse, null, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_size");
                    query.moveToFirst();
                    Long boxLong = columnIndex != -1 ? Boxing.boxLong(query.getLong(columnIndex)) : null;
                    CloseableKt.closeFinally(query, null);
                    if (boxLong != null) {
                        long longValue = boxLong.longValue();
                        InputStream openInputStream = contentResolver.openInputStream(parse);
                        if (openInputStream != null) {
                            Objects.toString(parse);
                            return new Pair(Boxing.boxLong(longValue), openInputStream);
                        }
                        uploadTaskWorker.q = new P0(W.c, "Could not open input stream for URI: " + parse, 2);
                        return new Pair(null, null);
                    }
                } finally {
                }
            }
            uploadTaskWorker.q = new P0(W.c, "Could not open file or determine file size for URI: " + parse, 2);
            return new Pair(null, null);
        } catch (Exception unused) {
            uploadTaskWorker.q = new P0(W.c, defpackage.g.a("Error processing URI: ", uploadTaskWorker.k().l), 2);
            return new Pair(null, null);
        }
    }
}
