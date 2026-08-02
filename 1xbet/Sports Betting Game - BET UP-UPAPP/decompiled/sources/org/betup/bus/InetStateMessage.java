package org.betup.bus;

/* loaded from: classes2.dex */
public class InetStateMessage {
    private boolean connected;

    public InetStateMessage(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
}
