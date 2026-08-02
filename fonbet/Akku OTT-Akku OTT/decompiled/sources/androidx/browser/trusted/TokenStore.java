package androidx.browser.trusted;

import androidx.annotation.BinderThread;
import androidx.annotation.WorkerThread;

/* loaded from: classes.dex */
public interface TokenStore {
    @BinderThread
    Token load();

    @WorkerThread
    void store(Token token);
}
