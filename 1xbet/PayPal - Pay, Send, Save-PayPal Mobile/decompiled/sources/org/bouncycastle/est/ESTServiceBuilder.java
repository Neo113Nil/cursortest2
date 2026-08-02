package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTServiceBuilder {
    protected org.bouncycastle.est.ESTClientProvider clientProvider;
    protected java.lang.String label;
    protected final java.lang.String server;

    public org.bouncycastle.est.ESTServiceBuilder withLabel(java.lang.String str) {
        this.label = str;
        return this;
    }

    public org.bouncycastle.est.ESTServiceBuilder withClientProvider(org.bouncycastle.est.ESTClientProvider eSTClientProvider) {
        this.clientProvider = eSTClientProvider;
        return this;
    }

    public org.bouncycastle.est.ESTService build() {
        return new org.bouncycastle.est.ESTService(this.server, this.label, this.clientProvider);
    }

    public ESTServiceBuilder(java.lang.String str) {
        this.server = str;
    }
}
