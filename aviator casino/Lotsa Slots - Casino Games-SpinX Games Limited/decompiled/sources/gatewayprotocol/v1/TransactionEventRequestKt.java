package gatewayprotocol.v1;

/* compiled from: TransactionEventRequestKt.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransactionEventRequestKt {
    public static final gatewayprotocol.v1.TransactionEventRequestKt INSTANCE = new gatewayprotocol.v1.TransactionEventRequestKt();

    /* compiled from: TransactionEventRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0002Z[B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010?\u001a\u00020@H\u0001J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020BJ\u0006\u0010D\u001a\u00020BJ\u0006\u0010E\u001a\u00020BJ\u0006\u0010F\u001a\u00020BJ\u0006\u0010G\u001a\u00020BJ\u0006\u0010H\u001a\u00020BJ\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020JJ%\u0010L\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\u0006\u0010\u0005\u001a\u00020;H\u0007¢\u0006\u0002\bMJ+\u0010N\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020;0PH\u0007¢\u0006\u0002\bQJ\u001d\u0010R\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:H\u0007¢\u0006\u0002\bSJ&\u0010T\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\u0006\u0010\u0005\u001a\u00020;H\u0087\n¢\u0006\u0002\bUJ,\u0010T\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020;0PH\u0087\n¢\u0006\u0002\bVJ.\u0010W\u001a\u00020B*\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\u0006\u0010X\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020;H\u0087\u0002¢\u0006\u0002\bYR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R\u001d\u00109\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006\\"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;)V", "value", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "appStore", "getAppStore", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "setAppStore", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;)V", "", "appStoreValue", "getAppStoreValue", "()I", "setAppStoreValue", "(I)V", "", "customStore", "getCustomStore", "()Ljava/lang/String;", "setCustomStore", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "googlePlayBillingLibraryVersion", "getGooglePlayBillingLibraryVersion", "setGooglePlayBillingLibraryVersion", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "origin", "getOrigin", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "setOrigin", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "originValue", "getOriginValue", "setOriginValue", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "storeKitVersion", "getStoreKitVersion", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "setStoreKitVersion", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;)V", "storeKitVersionValue", "getStoreKitVersionValue", "setStoreKitVersionValue", "transactionData", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "getTransactionData", "()Lcom/google/protobuf/kotlin/DslList;", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "clearAppStore", "", "clearCustomStore", "clearDynamicDeviceInfo", "clearGooglePlayBillingLibraryVersion", "clearOrigin", "clearStaticDeviceInfo", "clearStoreKitVersion", "hasDynamicDeviceInfo", "", "hasStaticDeviceInfo", "add", "addTransactionData", "addAll", "values", "", "addAllTransactionData", "clear", "clearTransactionData", "plusAssign", "plusAssignTransactionData", "plusAssignAllTransactionData", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "setTransactionData", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "TransactionDataProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.TransactionEventRequestKt.Dsl _create(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.TransactionEventRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest build = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType getAppStore() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final void setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppStore(value);
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final void setAppStoreValue(int i) {
            this._builder.setAppStoreValue(i);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final java.lang.String getCustomStore() {
            java.lang.String customStore = this._builder.getCustomStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final void setCustomStore(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TransactionDataProxy extends com.google.protobuf.kotlin.DslProxy {
            private TransactionDataProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getTransactionData() {
            java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionDataList, "_builder.getTransactionDataList()");
            return new com.google.protobuf.kotlin.DslList(transactionDataList);
        }

        public final /* synthetic */ void addTransactionData(com.google.protobuf.kotlin.DslList dslList, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTransactionData(value);
        }

        public final /* synthetic */ void plusAssignTransactionData(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestKt.Dsl.TransactionDataProxy> dslList, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addTransactionData(dslList, value);
        }

        public final /* synthetic */ void addAllTransactionData(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void plusAssignAllTransactionData(com.google.protobuf.kotlin.DslList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestKt.Dsl.TransactionDataProxy> dslList, java.lang.Iterable<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void setTransactionData(com.google.protobuf.kotlin.DslList dslList, int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionData(i, value);
        }

        public final /* synthetic */ void clearTransactionData(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        public final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin origin = this._builder.getOrigin();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(origin, "_builder.getOrigin()");
            return origin;
        }

        public final void setOrigin(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOrigin(value);
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final void setOriginValue(int i) {
            this._builder.setOriginValue(i);
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion = this._builder.getStoreKitVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storeKitVersion, "_builder.getStoreKitVersion()");
            return storeKitVersion;
        }

        public final void setStoreKitVersion(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStoreKitVersion(value);
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final void setStoreKitVersionValue(int i) {
            this._builder.setStoreKitVersionValue(i);
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        public final java.lang.String getGooglePlayBillingLibraryVersion() {
            java.lang.String googlePlayBillingLibraryVersion = this._builder.getGooglePlayBillingLibraryVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(googlePlayBillingLibraryVersion, "_builder.getGooglePlayBillingLibraryVersion()");
            return googlePlayBillingLibraryVersion;
        }

        public final void setGooglePlayBillingLibraryVersion(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGooglePlayBillingLibraryVersion(value);
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }
    }

    private TransactionEventRequestKt() {
    }
}
