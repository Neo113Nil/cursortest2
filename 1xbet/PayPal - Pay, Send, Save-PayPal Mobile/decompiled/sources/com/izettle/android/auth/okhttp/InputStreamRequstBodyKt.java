package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokio/Source;", "", "closeQuietly", "(Lokio/Source;)V"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputStreamRequstBodyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeQuietly(okio.Source source) {
        try {
            source.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }
}
