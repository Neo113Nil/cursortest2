package com.inmobi.media;

import com.ironsource.C4761z5;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4098t7 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f7387a;

    public C4098t7(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(C4761z5.M, "contentType");
        this.f7387a = fileName;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String filePath = this.f7387a;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Buffer buffer = new Buffer();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        try {
            buffer.readFrom(fileInputStream);
            CloseableKt.closeFinally(fileInputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
        try {
            try {
                try {
                    bufferedSink.writeAll(buffer);
                    Intrinsics.checkNotNullParameter(buffer, "<this>");
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(buffer, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Exception unused) {
                Unit unit = Unit.INSTANCE;
            }
            try {
                buffer.close();
            } catch (IOException unused2) {
            }
            CloseableKt.closeFinally(buffer, null);
        } finally {
            Intrinsics.checkNotNullParameter(buffer, "<this>");
            try {
                buffer.close();
            } catch (IOException unused3) {
            }
        }
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return C4761z5.M;
    }
}
