package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class FileInputStreamInitData {
    final FileInputStream delegate;
    final File file;
    final SentryOptions options;
    final ISpan span;

    public FileInputStreamInitData(File file, ISpan iSpan, FileInputStream fileInputStream, SentryOptions sentryOptions) {
        this.file = file;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.options = sentryOptions;
    }
}
