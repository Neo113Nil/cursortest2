package com.zettle.sdk.core.user.userconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/user/userconfig/TerminalSettings;", "", "", "", "getFeatures", "()Ljava/util/Set;", "features", "getSupportedReaders", "supportedReaders", "getTerminalLocaleString", "()Ljava/lang/String;", "terminalLocaleString"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TerminalSettings {
    java.util.Set<java.lang.String> getFeatures();

    java.util.Set<java.lang.String> getSupportedReaders();

    java.lang.String getTerminalLocaleString();
}
