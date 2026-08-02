package com.google.common.io;

/* loaded from: classes9.dex */
public final class FileBackedOutputStream extends java.io.OutputStream {
    private java.io.File file;
    private final int fileThreshold;
    private com.google.common.io.FileBackedOutputStream.MemoryOutput memory;
    private java.io.OutputStream out;
    private final boolean resetOnFinalize;
    private final com.google.common.io.ByteSource source;

    static final class MemoryOutput extends java.io.ByteArrayOutputStream {
        private MemoryOutput() {
        }

        final byte[] getBuffer() {
            return this.buf;
        }

        final int getCount() {
            return this.count;
        }
    }

    final java.io.File getFile() {
        java.io.File file;
        synchronized (this) {
            file = this.file;
        }
        return file;
    }

    public FileBackedOutputStream(int i) {
        this(i, false);
    }

    public FileBackedOutputStream(int i, boolean z) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "fileThreshold must be non-negative, but was %s", i);
        this.fileThreshold = i;
        this.resetOnFinalize = z;
        com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
        this.memory = memoryOutput;
        this.out = memoryOutput;
        if (z) {
            this.source = new com.google.common.io.ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.1
                @Override // com.google.common.io.ByteSource
                public java.io.InputStream openStream() throws java.io.IOException {
                    return com.google.common.io.FileBackedOutputStream.this.openInputStream();
                }

                protected void finalize() {
                    try {
                        com.google.common.io.FileBackedOutputStream.this.reset();
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace(java.lang.System.err);
                    }
                }
            };
        } else {
            this.source = new com.google.common.io.ByteSource() { // from class: com.google.common.io.FileBackedOutputStream.2
                @Override // com.google.common.io.ByteSource
                public java.io.InputStream openStream() throws java.io.IOException {
                    return com.google.common.io.FileBackedOutputStream.this.openInputStream();
                }
            };
        }
    }

    public final com.google.common.io.ByteSource asByteSource() {
        return this.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.InputStream openInputStream() throws java.io.IOException {
        synchronized (this) {
            if (this.file != null) {
                return new java.io.FileInputStream(this.file);
            }
            java.util.Objects.requireNonNull(this.memory);
            return new java.io.ByteArrayInputStream(this.memory.getBuffer(), 0, this.memory.getCount());
        }
    }

    public final void reset() throws java.io.IOException {
        synchronized (this) {
            try {
                close();
                com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = this.memory;
                if (memoryOutput == null) {
                    this.memory = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
                } else {
                    memoryOutput.reset();
                }
                this.out = this.memory;
                java.io.File file = this.file;
                if (file != null) {
                    this.file = null;
                    if (!file.delete()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not delete: ");
                        sb.append(file);
                        throw new java.io.IOException(sb.toString());
                    }
                }
            } catch (java.lang.Throwable th) {
                if (this.memory == null) {
                    this.memory = new com.google.common.io.FileBackedOutputStream.MemoryOutput();
                } else {
                    this.memory.reset();
                }
                this.out = this.memory;
                java.io.File file2 = this.file;
                if (file2 != null) {
                    this.file = null;
                    if (!file2.delete()) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not delete: ");
                        sb2.append(file2);
                        throw new java.io.IOException(sb2.toString());
                    }
                }
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        synchronized (this) {
            update(1);
            this.out.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        synchronized (this) {
            write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            update(i2);
            this.out.write(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.out.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        synchronized (this) {
            this.out.flush();
        }
    }

    private void update(int i) throws java.io.IOException {
        com.google.common.io.FileBackedOutputStream.MemoryOutput memoryOutput = this.memory;
        if (memoryOutput == null || memoryOutput.getCount() + i <= this.fileThreshold) {
            return;
        }
        java.io.File createTempFile = com.google.common.io.TempFileCreator.INSTANCE.createTempFile("FileBackedOutputStream");
        if (this.resetOnFinalize) {
            createTempFile.deleteOnExit();
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createTempFile);
            fileOutputStream.write(this.memory.getBuffer(), 0, this.memory.getCount());
            fileOutputStream.flush();
            this.out = fileOutputStream;
            this.file = createTempFile;
            this.memory = null;
        } catch (java.io.IOException e) {
            createTempFile.delete();
            throw e;
        }
    }
}
