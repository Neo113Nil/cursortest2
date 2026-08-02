package com.datadog.trace.api.profiling;

/* loaded from: classes8.dex */
public class RecordingInputStream extends java.io.BufferedInputStream {
    public RecordingInputStream(java.io.InputStream inputStream) {
        super(inputStream);
    }

    public boolean isEmpty() throws java.io.IOException {
        if (this.pos != 0) {
            return false;
        }
        try {
            mark(1);
            return read() == -1;
        } finally {
            reset();
        }
    }
}
