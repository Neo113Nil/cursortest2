package org.modelmapper.internal;

import org.modelmapper.Provider;

/* loaded from: classes4.dex */
class ProvisionRequestImpl<T> implements Provider.ProvisionRequest<T> {
    private final Class<T> requestedType;
    private final Object source;

    ProvisionRequestImpl(Object obj, Class<T> cls) {
        this.source = obj;
        this.requestedType = cls;
    }

    @Override // org.modelmapper.Provider.ProvisionRequest
    public Class<T> getRequestedType() {
        return this.requestedType;
    }

    @Override // org.modelmapper.Provider.ProvisionRequest
    public Object getSource() {
        return this.source;
    }
}
