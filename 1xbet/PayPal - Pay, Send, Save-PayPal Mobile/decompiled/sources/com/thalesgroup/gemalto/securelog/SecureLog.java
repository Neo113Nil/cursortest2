package com.thalesgroup.gemalto.securelog;

/* loaded from: classes5.dex */
public interface SecureLog {
    void deleteFiles();

    java.util.List<java.io.File> getFiles();

    void setLevel(com.thalesgroup.gemalto.securelog.SecureLogLevel secureLogLevel);
}
