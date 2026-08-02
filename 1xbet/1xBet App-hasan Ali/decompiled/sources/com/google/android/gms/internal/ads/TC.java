package com.google.android.gms.internal.ads;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class TC {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d(int i, int i5) {
        return new MediaCodec.CryptoInfo.Pattern(i, i5);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void k() {
    }
}
