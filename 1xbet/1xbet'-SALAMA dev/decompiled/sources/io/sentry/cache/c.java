package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return EnvelopeCache.lambda$allEnvelopeFiles$0(file, str);
    }
}
