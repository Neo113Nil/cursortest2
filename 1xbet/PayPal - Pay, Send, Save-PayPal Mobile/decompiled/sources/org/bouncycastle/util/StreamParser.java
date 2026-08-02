package org.bouncycastle.util;

/* loaded from: classes17.dex */
public interface StreamParser {
    java.lang.Object read() throws org.bouncycastle.util.StreamParsingException;

    java.util.Collection readAll() throws org.bouncycastle.util.StreamParsingException;
}
