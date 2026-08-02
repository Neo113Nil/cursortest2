package org.chromium.net.impl;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* loaded from: classes4.dex */
class AndroidHttpExceptionWrapper extends CronetException {
    AndroidHttpExceptionWrapper(HttpException e) {
        super(e.getMessage(), e);
    }
}
