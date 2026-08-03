package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements com.ironsource.adapters.ironsource.IronSourceLoadParameters {
        private final org.json.JSONObject loadConfig;
        private final java.lang.String serverData;

        public Base(org.json.JSONObject loadConfig, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public org.json.JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public java.util.HashMap<java.lang.String, java.lang.String> value() {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put("isOneFlow", java.lang.String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                java.lang.String a2 = com.ironsource.mediationsdk.d.b().a(this.serverData);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getInstance().getAdmFromServerData(serverData)");
                hashMap.put("adm", a2);
                hashMap.putAll(com.ironsource.mediationsdk.d.b().b(this.serverData));
            }
            return hashMap;
        }

        public /* synthetic */ Base(org.json.JSONObject jSONObject, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Constants {
        public static final java.lang.String ADM_KEY = "adm";
        public static final java.lang.String DEMAND_ONLY = "demandOnly";
        public static final com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants INSTANCE = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants();
        public static final java.lang.String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    public static final class WithLog implements com.ironsource.adapters.ironsource.IronSourceLoadParameters {
        private final com.ironsource.adapters.ironsource.IronSourceLoadParameters loadParameters;

        public WithLog(com.ironsource.adapters.ironsource.IronSourceLoadParameters loadParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public org.json.JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public java.util.HashMap<java.lang.String, java.lang.String> value() {
            java.util.HashMap<java.lang.String, java.lang.String> value = this.loadParameters.value();
            if (!value.isEmpty()) {
                com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("instance extra params:");
                for (java.lang.String str : value.keySet()) {
                    com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose(str + com.ironsource.X3.j.b + ((java.lang.Object) value.get(str)));
                }
            }
            return value;
        }
    }

    org.json.JSONObject config();

    boolean demandOnly();

    java.util.HashMap<java.lang.String, java.lang.String> value();
}
