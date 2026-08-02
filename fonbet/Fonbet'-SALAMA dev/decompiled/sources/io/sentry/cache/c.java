package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$allEnvelopeFiles$0;
        lambda$allEnvelopeFiles$0 = EnvelopeCache.lambda$allEnvelopeFiles$0(file, str);
        return lambda$allEnvelopeFiles$0;
    }
}
