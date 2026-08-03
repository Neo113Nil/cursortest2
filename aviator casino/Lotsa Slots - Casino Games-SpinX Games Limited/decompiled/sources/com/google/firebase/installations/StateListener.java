package com.google.firebase.installations;

/* loaded from: classes3.dex */
interface StateListener {
    boolean onException(java.lang.Exception exc);

    boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry);
}
