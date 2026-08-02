package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum fc implements com.facetec.sdk.fa {
    DOUBLE { // from class: com.facetec.sdk.fc.5
        @Override // com.facetec.sdk.fa
        public final /* synthetic */ java.lang.Number c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return java.lang.Double.valueOf(gtVar.m());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.facetec.sdk.fc.4
        @Override // com.facetec.sdk.fa
        public final java.lang.Number c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return new com.facetec.sdk.fo(gtVar.g());
        }
    },
    LONG_OR_DOUBLE { // from class: com.facetec.sdk.fc.1
        @Override // com.facetec.sdk.fa
        public final java.lang.Number c(com.facetec.sdk.gt gtVar) throws java.io.IOException, com.facetec.sdk.ew {
            java.lang.String g = gtVar.g();
            try {
                try {
                    return java.lang.Long.valueOf(java.lang.Long.parseLong(g));
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse ");
                    sb.append(g);
                    sb.append("; at path ");
                    sb.append(gtVar.s());
                    throw new com.facetec.sdk.ew(sb.toString(), e);
                }
            } catch (java.lang.NumberFormatException unused) {
                java.lang.Double valueOf = java.lang.Double.valueOf(g);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || gtVar.q()) {
                    return valueOf;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(valueOf);
                sb2.append("; at path ");
                sb2.append(gtVar.s());
                throw new com.facetec.sdk.gv(sb2.toString());
            }
        }
    },
    BIG_DECIMAL { // from class: com.facetec.sdk.fc.3
        @Override // com.facetec.sdk.fa
        public final /* synthetic */ java.lang.Number c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return e(gtVar);
        }

        private static java.math.BigDecimal e(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            java.lang.String g = gtVar.g();
            try {
                return new java.math.BigDecimal(g);
            } catch (java.lang.NumberFormatException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse ");
                sb.append(g);
                sb.append("; at path ");
                sb.append(gtVar.s());
                throw new com.facetec.sdk.ew(sb.toString(), e);
            }
        }
    };

    /* synthetic */ fc(byte b) {
        this();
    }
}
