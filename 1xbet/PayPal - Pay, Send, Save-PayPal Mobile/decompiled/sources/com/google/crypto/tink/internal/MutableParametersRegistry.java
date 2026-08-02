package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutableParametersRegistry {
    private static final com.google.crypto.tink.internal.MutableParametersRegistry globalInstance = new com.google.crypto.tink.internal.MutableParametersRegistry();
    private final java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> parametersMap = new java.util.HashMap();

    MutableParametersRegistry() {
    }

    public static com.google.crypto.tink.internal.MutableParametersRegistry globalInstance() {
        return globalInstance;
    }

    public final void put(java.lang.String str, com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (this.parametersMap.containsKey(str)) {
                if (this.parametersMap.get(str).equals(parameters)) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters object with name ");
                sb.append(str);
                sb.append(" already exists (");
                sb.append(this.parametersMap.get(str));
                sb.append("), cannot insert ");
                sb.append(parameters);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            this.parametersMap.put(str, parameters);
        }
    }

    public final com.google.crypto.tink.Parameters get(java.lang.String str) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Parameters parameters;
        synchronized (this) {
            if (this.parametersMap.containsKey(str)) {
                parameters = this.parametersMap.get(str);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Name ");
                sb.append(str);
                sb.append(" does not exist");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return parameters;
    }

    public final void putAll(java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> map) throws java.security.GeneralSecurityException {
        synchronized (this) {
            for (java.util.Map.Entry<java.lang.String, com.google.crypto.tink.Parameters> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final java.util.List<java.lang.String> getNames() {
        java.util.List<java.lang.String> unmodifiableList;
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.parametersMap.keySet());
            unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }
}
