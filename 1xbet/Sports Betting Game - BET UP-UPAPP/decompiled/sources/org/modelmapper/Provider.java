package org.modelmapper;

/* loaded from: classes4.dex */
public interface Provider<T> {

    public interface ProvisionRequest<T> {
        Class<T> getRequestedType();

        Object getSource();
    }

    T get(ProvisionRequest<T> provisionRequest);
}
