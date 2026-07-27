package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f4828a;
    public final FileDescriptor b;

    public jf(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f4828a = randomAccessFile;
        FileDescriptor fd = randomAccessFile.getFD();
        Intrinsics.checkNotNullExpressionValue(fd, "getFD(...)");
        this.b = fd;
    }

    public final void a() {
        this.f4828a.close();
    }

    public final FileDescriptor b() {
        return this.b;
    }

    public final long c() {
        return this.f4828a.length();
    }
}
