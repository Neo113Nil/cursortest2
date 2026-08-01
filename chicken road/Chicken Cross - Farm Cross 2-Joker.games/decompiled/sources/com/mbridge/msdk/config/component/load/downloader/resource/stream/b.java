package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDownloadRandomAccessDownloadFile.java */
/* loaded from: classes6.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedOutputStream f9020a;
    private final FileDescriptor b;
    private final RandomAccessFile c;

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.c = randomAccessFile;
        this.b = randomAccessFile.getFD();
        this.f9020a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.f9020a.close();
        this.c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.f9020a.flush();
        this.b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j) throws IOException {
        this.c.seek(j);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f9020a.write(bArr, i, i2);
    }
}
