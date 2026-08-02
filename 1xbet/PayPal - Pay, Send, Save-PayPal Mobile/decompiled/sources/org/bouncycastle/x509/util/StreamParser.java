package org.bouncycastle.x509.util;

/* loaded from: classes17.dex */
public interface StreamParser {
    java.lang.Object read() throws org.bouncycastle.x509.util.StreamParsingException;

    java.util.Collection readAll() throws org.bouncycastle.x509.util.StreamParsingException;
}
