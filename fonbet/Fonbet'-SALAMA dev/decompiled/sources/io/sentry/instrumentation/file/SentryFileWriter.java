package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;

/* loaded from: classes2.dex */
public final class SentryFileWriter extends OutputStreamWriter {
    public SentryFileWriter(String str) {
        super(new SentryFileOutputStream(str));
    }

    public SentryFileWriter(String str, boolean z4) {
        super(new SentryFileOutputStream(str, z4));
    }

    public SentryFileWriter(File file) {
        super(new SentryFileOutputStream(file));
    }

    public SentryFileWriter(File file, boolean z4) {
        super(new SentryFileOutputStream(file, z4));
    }

    public SentryFileWriter(FileDescriptor fileDescriptor) {
        super(new SentryFileOutputStream(fileDescriptor));
    }

    public SentryFileWriter(File file, boolean z4, IScopes iScopes) {
        super(new SentryFileOutputStream(file, z4, iScopes));
    }
}
