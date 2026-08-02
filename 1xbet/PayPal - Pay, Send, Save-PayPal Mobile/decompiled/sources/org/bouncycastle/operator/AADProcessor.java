package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface AADProcessor {
    java.io.OutputStream getAADStream();

    byte[] getMAC();
}
