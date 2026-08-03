package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W6 extends com.inmobi.media.Hi {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5024a;

    public W6(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.ironsource.B5.M, com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE);
        this.f5024a = fileName;
    }

    @Override // com.inmobi.media.Hi
    public final void a(okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        java.lang.String filePath = this.f5024a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        okio.Buffer buffer = new okio.Buffer();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(filePath);
        try {
            buffer.readFrom(fileInputStream);
            kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
        try {
            try {
                try {
                    bufferedSink.writeAll(buffer);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        kotlin.io.CloseableKt.closeFinally(buffer, th3);
                        throw th4;
                    }
                }
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception unused) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            try {
                buffer.close();
            } catch (java.io.IOException unused2) {
            }
            kotlin.io.CloseableKt.closeFinally(buffer, null);
        } finally {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
            try {
                buffer.close();
            } catch (java.io.IOException unused3) {
            }
        }
    }

    @Override // com.inmobi.media.Hi
    public final java.lang.String a() {
        return com.ironsource.B5.M;
    }
}
