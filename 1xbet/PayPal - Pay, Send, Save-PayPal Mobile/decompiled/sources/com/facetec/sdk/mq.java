package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface mq {
    public static final com.facetec.sdk.mq b = new com.facetec.sdk.mq() { // from class: com.facetec.sdk.mq.4
        @Override // com.facetec.sdk.mq
        public final java.util.List<java.net.InetAddress> c(java.lang.String str) throws java.net.UnknownHostException {
            if (str == null) {
                throw new java.net.UnknownHostException("hostname == null");
            }
            try {
                return java.util.Arrays.asList(java.net.InetAddress.getAllByName(str));
            } catch (java.lang.NullPointerException e) {
                java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of ".concat(java.lang.String.valueOf(str)));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    };

    java.util.List<java.net.InetAddress> c(java.lang.String str) throws java.net.UnknownHostException;
}
