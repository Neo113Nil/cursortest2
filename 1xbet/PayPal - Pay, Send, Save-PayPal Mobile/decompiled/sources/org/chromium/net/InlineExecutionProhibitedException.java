package org.chromium.net;

/* loaded from: classes18.dex */
public final class InlineExecutionProhibitedException extends java.util.concurrent.RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
