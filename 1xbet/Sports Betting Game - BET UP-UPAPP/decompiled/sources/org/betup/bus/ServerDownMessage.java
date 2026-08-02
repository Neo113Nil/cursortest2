package org.betup.bus;

import org.betup.model.remote.api.FetchStat;

/* loaded from: classes2.dex */
public class ServerDownMessage {
    private String from;
    private String responseBody;
    private String sourceInteractor;
    private FetchStat stat;
    private int statusCode = 0;
    private Throwable t;

    public ServerDownMessage(Throwable t, FetchStat stat) {
        this.t = t;
        this.stat = stat;
    }

    public ServerDownMessage(String responseBody, FetchStat stat) {
        this.responseBody = responseBody;
        this.stat = stat;
    }

    public String getSourceInteractor() {
        return this.sourceInteractor;
    }

    public void setSourceInteractor(String sourceInteractor) {
        this.sourceInteractor = sourceInteractor;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public FetchStat getStat() {
        return this.stat;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public Throwable getT() {
        return this.t;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
