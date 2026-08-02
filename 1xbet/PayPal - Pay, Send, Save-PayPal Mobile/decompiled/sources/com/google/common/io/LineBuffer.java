package com.google.common.io;

/* loaded from: classes9.dex */
abstract class LineBuffer {
    private java.lang.StringBuilder line = new java.lang.StringBuilder();
    private boolean sawReturn;

    protected abstract void handleLine(java.lang.String str, java.lang.String str2) throws java.io.IOException;

    LineBuffer() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void add(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4;
        if (this.sawReturn && i2 > 0) {
            if (finishLine(cArr[i] == '\n')) {
                i3 = i + 1;
                i4 = i + i2;
                int i5 = i3;
                while (i3 < i4) {
                    char c = cArr[i3];
                    if (c == '\n') {
                        this.line.append(cArr, i5, i3 - i5);
                        finishLine(true);
                    } else if (c != '\r') {
                        i3++;
                    } else {
                        this.line.append(cArr, i5, i3 - i5);
                        this.sawReturn = true;
                        int i6 = i3 + 1;
                        if (i6 < i4) {
                            if (finishLine(cArr[i6] == '\n')) {
                                i3 = i6;
                            }
                        }
                    }
                    i5 = i3 + 1;
                    i3++;
                }
                this.line.append(cArr, i5, i4 - i5);
            }
        }
        i3 = i;
        i4 = i + i2;
        int i52 = i3;
        while (i3 < i4) {
        }
        this.line.append(cArr, i52, i4 - i52);
    }

    private boolean finishLine(boolean z) throws java.io.IOException {
        handleLine(this.line.toString(), this.sawReturn ? z ? io.ktor.sse.ServerSentEventKt.END_OF_LINE : "\r" : z ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE : "");
        this.line = new java.lang.StringBuilder();
        this.sawReturn = false;
        return z;
    }

    protected void finish() throws java.io.IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }
}
