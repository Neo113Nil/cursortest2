package androidx.browser.trusted;

/* loaded from: classes6.dex */
public interface TokenStore {
    androidx.browser.trusted.Token load();

    void store(androidx.browser.trusted.Token token);
}
