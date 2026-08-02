package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/network/http/PayPalDomains;", "Lcom/paypal/oslo/core/network/http/PayPalDomainValidator;", "<init>", "()V", "", "url", "", "isPayPalDomain", "(Ljava/lang/String;)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/http/PayPalDomains$cache$1;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/http/PayPalDomains$cache$1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayPalDomains implements com.paypal.oslo.core.network.http.PayPalDomainValidator {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"paypal.com", "paypalcorp.com", "paypalobjects.com", "braintreegateway.com", "paypalinc.com"});

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.PayPalDomains$cache$1 getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap<java.lang.String, java.lang.Boolean>() { // from class: com.paypal.oslo.core.network.http.PayPalDomains$cache$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return containsKey((java.lang.String) obj);
            }
            return false;
        }

        public final /* bridge */ boolean containsKey(java.lang.String str) {
            return super.containsKey((java.lang.Object) str);
        }

        public final /* bridge */ boolean containsValue(java.lang.Boolean bool) {
            return super.containsValue((java.lang.Object) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof java.lang.Boolean) {
                return containsValue((java.lang.Boolean) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> entrySet() {
            return getEntries();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.lang.Boolean get(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return get((java.lang.String) obj);
            }
            return null;
        }

        public final /* bridge */ java.lang.Boolean get(java.lang.String str) {
            return (java.lang.Boolean) super.get((java.lang.Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return get((java.lang.String) obj);
            }
            return null;
        }

        public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> getEntries() {
            return super.entrySet();
        }

        public final java.util.Set<java.lang.String> getKeys() {
            return super.keySet();
        }

        public final /* bridge */ java.lang.Boolean getOrDefault(java.lang.Object obj, java.lang.Boolean bool) {
            return !(obj instanceof java.lang.String) ? bool : getOrDefault((java.lang.String) obj, bool);
        }

        public final /* bridge */ java.lang.Boolean getOrDefault(java.lang.String str, java.lang.Boolean bool) {
            return (java.lang.Boolean) super.getOrDefault((java.lang.Object) str, (java.lang.String) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
            return !(obj instanceof java.lang.String) ? obj2 : getOrDefault((java.lang.String) obj, (java.lang.Boolean) obj2);
        }

        public final int getSize() {
            return super.size();
        }

        public final java.util.Collection<java.lang.Boolean> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final java.util.Set<java.lang.String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.lang.Boolean remove(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return remove((java.lang.String) obj);
            }
            return null;
        }

        public final /* bridge */ java.lang.Boolean remove(java.lang.String str) {
            return (java.lang.Boolean) super.remove((java.lang.Object) str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return remove((java.lang.String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.Boolean)) {
                return remove((java.lang.String) obj, (java.lang.Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(java.lang.String str, java.lang.Boolean bool) {
            return super.remove((java.lang.Object) str, (java.lang.Object) bool);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final java.util.Collection<java.lang.Boolean> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap
        protected final boolean removeEldestEntry(java.util.Map.Entry<java.lang.String, java.lang.Boolean> eldest) {
            return size() > 100;
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [com.paypal.oslo.core.network.http.PayPalDomains$cache$1] */
    @javax.inject.Inject
    public PayPalDomains() {
    }

    @Override // com.paypal.oslo.core.network.http.PayPalDomainValidator
    public final boolean isPayPalDomain(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.lang.Boolean bool = get((java.lang.Object) url);
            if (bool != null) {
                return bool.booleanValue();
            }
            okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(url);
            java.lang.String host = parse != null ? parse.host() : null;
            boolean z = false;
            if (host != null) {
                java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRanges;
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    for (java.lang.String str : set) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(host, str)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(".");
                            sb.append(str);
                            if (kotlin.text.StringsKt.endsWith$default(host, sb.toString(), false, 2, (java.lang.Object) null)) {
                            }
                        }
                        z = true;
                    }
                }
            }
            put(url, java.lang.Boolean.valueOf(z));
            return z;
        }
    }
}
