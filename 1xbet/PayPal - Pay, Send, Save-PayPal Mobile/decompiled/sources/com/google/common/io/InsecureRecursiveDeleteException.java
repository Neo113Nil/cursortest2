package com.google.common.io;

/* loaded from: classes9.dex */
public final class InsecureRecursiveDeleteException extends java.nio.file.FileSystemException {
    public InsecureRecursiveDeleteException(java.lang.String str) {
        super(str, null, "unable to guarantee security of recursive delete");
    }
}
