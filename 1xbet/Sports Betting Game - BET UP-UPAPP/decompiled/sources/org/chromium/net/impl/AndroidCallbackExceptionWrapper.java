package org.chromium.net.impl;

import org.chromium.net.CallbackException;

/* loaded from: classes4.dex */
class AndroidCallbackExceptionWrapper extends CallbackException {
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException e) {
        super(e.getMessage(), e.getCause());
    }
}
