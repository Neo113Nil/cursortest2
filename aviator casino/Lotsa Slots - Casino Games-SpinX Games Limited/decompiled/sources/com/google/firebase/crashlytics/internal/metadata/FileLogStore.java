package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    java.lang.String getLogAsString();

    void writeToLog(long j, java.lang.String str);
}
