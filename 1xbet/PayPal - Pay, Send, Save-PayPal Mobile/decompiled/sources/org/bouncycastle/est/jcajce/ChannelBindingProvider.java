package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public interface ChannelBindingProvider {
    boolean canAccessChannelBinding(java.net.Socket socket);

    byte[] getChannelBinding(java.net.Socket socket, java.lang.String str);
}
