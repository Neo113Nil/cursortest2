package org.betup.bus;

import java.util.Map;

/* loaded from: classes2.dex */
public class DisplayCallbackMessage {
    private Map<String, String> data;

    public DisplayCallbackMessage(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getDataModel() {
        return this.data;
    }

    public void setBundle(Map<String, String> data) {
        this.data = data;
    }
}
