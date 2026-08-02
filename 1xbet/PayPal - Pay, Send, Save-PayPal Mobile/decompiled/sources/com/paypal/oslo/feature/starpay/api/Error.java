package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error;", "", "<init>", "()V", "", "getCode", "()Ljava/lang/Integer;", "code", "", "getMessage", "()Ljava/lang/String;", "message", "NoActiveWallet", "Canceled", "UnsupportedApi", "SystemError", "Lcom/paypal/oslo/feature/starpay/api/Error$Canceled;", "Lcom/paypal/oslo/feature/starpay/api/Error$NoActiveWallet;", "Lcom/paypal/oslo/feature/starpay/api/Error$SystemError;", "Lcom/paypal/oslo/feature/starpay/api/Error$UnsupportedApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class Error {
    public static final int $stable = 0;

    public abstract java.lang.Integer getCode();

    public abstract java.lang.String getMessage();

    private Error() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error$NoActiveWallet;", "Lcom/paypal/oslo/feature/starpay/api/Error;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/Error$NoActiveWallet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoActiveWallet extends com.paypal.oslo.feature.starpay.api.Error {
        public static final int $stable = 0;
        private final int code;
        private final java.lang.String message;

        public NoActiveWallet(int i, java.lang.String str) {
            super(null);
            this.code = i;
            this.message = str;
        }

        public /* synthetic */ NoActiveWallet(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.Integer getCode() {
            return java.lang.Integer.valueOf(this.code);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoActiveWallet(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet)) {
                return false;
            }
            com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet noActiveWallet = (com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet) other;
            return this.code == noActiveWallet.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, noActiveWallet.message);
        }

        public final com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet copy(int code, java.lang.String message) {
            return new com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet copy$default(com.paypal.oslo.feature.starpay.api.Error.NoActiveWallet noActiveWallet, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = noActiveWallet.code;
            }
            if ((i2 & 2) != 0) {
                str = noActiveWallet.message;
            }
            return noActiveWallet.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error$Canceled;", "Lcom/paypal/oslo/feature/starpay/api/Error;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/Error$Canceled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Canceled extends com.paypal.oslo.feature.starpay.api.Error {
        public static final int $stable = 0;
        private final int code;
        private final java.lang.String message;

        public Canceled(int i, java.lang.String str) {
            super(null);
            this.code = i;
            this.message = str;
        }

        public /* synthetic */ Canceled(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.Integer getCode() {
            return java.lang.Integer.valueOf(this.code);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Canceled(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.starpay.api.Error.Canceled)) {
                return false;
            }
            com.paypal.oslo.feature.starpay.api.Error.Canceled canceled = (com.paypal.oslo.feature.starpay.api.Error.Canceled) other;
            return this.code == canceled.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, canceled.message);
        }

        public final com.paypal.oslo.feature.starpay.api.Error.Canceled copy(int code, java.lang.String message) {
            return new com.paypal.oslo.feature.starpay.api.Error.Canceled(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Error.Canceled copy$default(com.paypal.oslo.feature.starpay.api.Error.Canceled canceled, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = canceled.code;
            }
            if ((i2 & 2) != 0) {
                str = canceled.message;
            }
            return canceled.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error$UnsupportedApi;", "Lcom/paypal/oslo/feature/starpay/api/Error;", "", "code", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/Error$UnsupportedApi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedApi extends com.paypal.oslo.feature.starpay.api.Error {
        public static final int $stable = 0;
        private final java.lang.Integer code;
        private final java.lang.String message;

        public UnsupportedApi(java.lang.Integer num, java.lang.String str) {
            super(null);
            this.code = num;
            this.message = str;
        }

        public /* synthetic */ UnsupportedApi(java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.Integer getCode() {
            return this.code;
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedApi(code=");
            sb.append(num);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.code;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.String str = this.message;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi)) {
                return false;
            }
            com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi unsupportedApi = (com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.code, unsupportedApi.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, unsupportedApi.message);
        }

        public final com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi copy(java.lang.Integer code, java.lang.String message) {
            return new com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi copy$default(com.paypal.oslo.feature.starpay.api.Error.UnsupportedApi unsupportedApi, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = unsupportedApi.code;
            }
            if ((i & 2) != 0) {
                str = unsupportedApi.message;
            }
            return unsupportedApi.copy(num, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedApi() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Error$SystemError;", "Lcom/paypal/oslo/feature/starpay/api/Error;", "", "code", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/Error$SystemError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SystemError extends com.paypal.oslo.feature.starpay.api.Error {
        public static final int $stable = 0;
        private final java.lang.Integer code;
        private final java.lang.String message;

        public SystemError(java.lang.Integer num, java.lang.String str) {
            super(null);
            this.code = num;
            this.message = str;
        }

        public /* synthetic */ SystemError(java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.Integer getCode() {
            return this.code;
        }

        @Override // com.paypal.oslo.feature.starpay.api.Error
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemError(code=");
            sb.append(num);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.code;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.String str = this.message;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.starpay.api.Error.SystemError)) {
                return false;
            }
            com.paypal.oslo.feature.starpay.api.Error.SystemError systemError = (com.paypal.oslo.feature.starpay.api.Error.SystemError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.code, systemError.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, systemError.message);
        }

        public final com.paypal.oslo.feature.starpay.api.Error.SystemError copy(java.lang.Integer code, java.lang.String message) {
            return new com.paypal.oslo.feature.starpay.api.Error.SystemError(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Error.SystemError copy$default(com.paypal.oslo.feature.starpay.api.Error.SystemError systemError, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = systemError.code;
            }
            if ((i & 2) != 0) {
                str = systemError.message;
            }
            return systemError.copy(num, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SystemError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
