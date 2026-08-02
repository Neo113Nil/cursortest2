package com.payair.db;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/payair/db/Converters;", "", "<init>", "()V", "Lcom/payair/model/Asset;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "assetToJson", "(Lcom/payair/model/Asset;)Ljava/lang/String;", "", "Ljava/util/Date;", "dateFromTimestamp", "(Ljava/lang/Long;)Ljava/util/Date;", "date", "dateToTimestamp", "(Ljava/util/Date;)Ljava/lang/Long;", "Ljava/math/BigDecimal;", "decimalFromLong", "(J)Ljava/math/BigDecimal;", com.paypal.oslo.core.commonui.components.NumericKeyboardConstants.KEYBOARD_BUTTON_DECIMAL_TEST_TAG, "decimalToLong", "(Ljava/math/BigDecimal;)J", "Lcom/payair/model/CardScheme;", "fromCardScheme", "(Lcom/payair/model/CardScheme;)Ljava/lang/String;", "json", "jsonToAsset", "(Ljava/lang/String;)Lcom/payair/model/Asset;", "Lcom/payair/model/ProductConfig;", "jsonToProductConfig", "(Ljava/lang/String;)Lcom/payair/model/ProductConfig;", "Lcom/payair/model/TokenInfoModel;", "jsonToTokenInfo", "(Ljava/lang/String;)Lcom/payair/model/TokenInfoModel;", "productConfigToJson", "(Lcom/payair/model/ProductConfig;)Ljava/lang/String;", "toCardScheme", "(Ljava/lang/String;)Lcom/payair/model/CardScheme;", "tokenInfoToJson", "(Lcom/payair/model/TokenInfoModel;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Converters {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.Converters.Companion INSTANCE = new com.payair.db.Converters.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public static final java.math.BigDecimal f4347a = new java.math.BigDecimal(10000);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/payair/db/Converters$Companion;", "", "Ljava/math/BigDecimal;", "bigDecimalDivisor", "Ljava/math/BigDecimal;", "getBigDecimalDivisor", "()Ljava/math/BigDecimal;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final java.math.BigDecimal getBigDecimalDivisor() {
            return com.payair.db.Converters.f4347a;
        }
    }

    public final java.lang.String assetToJson(com.payair.model.Asset value) {
        java.lang.String json = new com.google.gson.Gson().toJson(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final java.util.Date dateFromTimestamp(java.lang.Long value) {
        if (value != null) {
            return new java.util.Date(value.longValue());
        }
        return null;
    }

    public final java.lang.Long dateToTimestamp(java.util.Date date) {
        if (date != null) {
            return java.lang.Long.valueOf(date.getTime());
        }
        return null;
    }

    public final java.math.BigDecimal decimalFromLong(long value) {
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        java.math.BigDecimal divide = valueOf.divide(f4347a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "");
        return divide;
    }

    public final long decimalToLong(java.math.BigDecimal decimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decimal, "");
        java.math.BigDecimal multiply = decimal.multiply(f4347a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "");
        return multiply.longValue();
    }

    public final java.lang.String fromCardScheme(com.payair.model.CardScheme value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return value.getValue();
    }

    public final com.payair.model.Asset jsonToAsset(java.lang.String json) {
        return (com.payair.model.Asset) new com.google.gson.Gson().fromJson(json, com.payair.model.Asset.class);
    }

    public final com.payair.model.ProductConfig jsonToProductConfig(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        java.lang.Object fromJson = new com.google.gson.Gson().fromJson(json, (java.lang.Class<java.lang.Object>) com.payair.model.ProductConfig.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "");
        return (com.payair.model.ProductConfig) fromJson;
    }

    public final com.payair.model.TokenInfoModel jsonToTokenInfo(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        java.lang.Object fromJson = new com.google.gson.Gson().fromJson(json, (java.lang.Class<java.lang.Object>) com.payair.model.TokenInfoModel.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "");
        return (com.payair.model.TokenInfoModel) fromJson;
    }

    public final java.lang.String productConfigToJson(com.payair.model.ProductConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String json = new com.google.gson.Gson().toJson(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final com.payair.model.CardScheme toCardScheme(java.lang.String value) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.Iterator<E> it = com.payair.model.CardScheme.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.model.CardScheme) obj).getValue(), value)) {
                break;
            }
        }
        return (com.payair.model.CardScheme) obj;
    }

    public final java.lang.String tokenInfoToJson(com.payair.model.TokenInfoModel value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String json = new com.google.gson.Gson().toJson(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }
}
