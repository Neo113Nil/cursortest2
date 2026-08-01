package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y4 f8021a = new Y4();

    private Y4() {
    }

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
