package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface CMSProcessable {
    java.lang.Object getContent();

    void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException;
}
