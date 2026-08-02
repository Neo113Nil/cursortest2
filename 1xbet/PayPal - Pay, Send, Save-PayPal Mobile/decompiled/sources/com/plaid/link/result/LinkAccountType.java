package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \t2\u00020\u0001:\u0007\n\t\u000b\f\r\u000e\u000fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/plaid/link/result/LinkAccountType;", "Landroid/os/Parcelable;", "", "json", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "Companion", "CREDIT", "DEPOSITORY", "INVESTMENT", "LOAN", "OTHER", "UNKNOWN", "Lcom/plaid/link/result/LinkAccountType$CREDIT;", "Lcom/plaid/link/result/LinkAccountType$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountType$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountType$LOAN;", "Lcom/plaid/link/result/LinkAccountType$OTHER;", "Lcom/plaid/link/result/LinkAccountType$UNKNOWN;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkAccountType implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkAccountType.Companion INSTANCE = new com.plaid.link.result.LinkAccountType.Companion(null);
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountType>> jsonToObject$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountType>>() { // from class: com.plaid.link.result.LinkAccountType$Companion$jsonToObject$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountType> invoke() {
            com.plaid.link.result.LinkAccountType.CREDIT credit = com.plaid.link.result.LinkAccountType.CREDIT.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(credit.getJson(), credit);
            com.plaid.link.result.LinkAccountType.DEPOSITORY depository = com.plaid.link.result.LinkAccountType.DEPOSITORY.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(depository.getJson(), depository);
            com.plaid.link.result.LinkAccountType.INVESTMENT investment = com.plaid.link.result.LinkAccountType.INVESTMENT.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(investment.getJson(), investment);
            com.plaid.link.result.LinkAccountType.LOAN loan = com.plaid.link.result.LinkAccountType.LOAN.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(loan.getJson(), loan);
            com.plaid.link.result.LinkAccountType.OTHER other = com.plaid.link.result.LinkAccountType.OTHER.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, kotlin.TuplesKt.to(other.getJson(), other));
        }
    });
    private final java.lang.String json;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$Companion;", "", "<init>", "()V", "", "json", "Lcom/plaid/link/result/LinkAccountType;", "convert", "(Ljava/lang/String;)Lcom/plaid/link/result/LinkAccountType;", "", "jsonToObject$delegate", "Lkotlin/Lazy;", "getJsonToObject", "()Ljava/util/Map;", "jsonToObject"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountType> getJsonToObject() {
            return (java.util.Map) com.plaid.link.result.LinkAccountType.jsonToObject$delegate.getValue();
        }

        public final com.plaid.link.result.LinkAccountType convert(java.lang.String json) {
            com.plaid.link.result.LinkAccountType linkAccountType = getJsonToObject().get(json);
            if (linkAccountType != null) {
                return linkAccountType;
            }
            if (json == null) {
                json = "";
            }
            return new com.plaid.link.result.LinkAccountType.UNKNOWN(json);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LinkAccountType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getJson() {
        return this.json;
    }

    private LinkAccountType(java.lang.String str) {
        this.json = str;
    }

    public /* synthetic */ LinkAccountType(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, null);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$CREDIT;", "Lcom/plaid/link/result/LinkAccountType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CREDIT extends com.plaid.link.result.LinkAccountType {
        public static final com.plaid.link.result.LinkAccountType.CREDIT INSTANCE = new com.plaid.link.result.LinkAccountType.CREDIT();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.CREDIT> CREATOR = new com.plaid.link.result.LinkAccountType.CREDIT.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.CREDIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.CREDIT createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountType.CREDIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.CREDIT[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.CREDIT[i];
            }
        }

        private CREDIT() {
            super("credit", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DEPOSITORY extends com.plaid.link.result.LinkAccountType {
        public static final com.plaid.link.result.LinkAccountType.DEPOSITORY INSTANCE = new com.plaid.link.result.LinkAccountType.DEPOSITORY();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.DEPOSITORY> CREATOR = new com.plaid.link.result.LinkAccountType.DEPOSITORY.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.DEPOSITORY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.DEPOSITORY createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountType.DEPOSITORY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.DEPOSITORY[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.DEPOSITORY[i];
            }
        }

        private DEPOSITORY() {
            super("depository", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INVESTMENT extends com.plaid.link.result.LinkAccountType {
        public static final com.plaid.link.result.LinkAccountType.INVESTMENT INSTANCE = new com.plaid.link.result.LinkAccountType.INVESTMENT();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.INVESTMENT> CREATOR = new com.plaid.link.result.LinkAccountType.INVESTMENT.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.INVESTMENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.INVESTMENT createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountType.INVESTMENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.INVESTMENT[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.INVESTMENT[i];
            }
        }

        private INVESTMENT() {
            super("investment", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$LOAN;", "Lcom/plaid/link/result/LinkAccountType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LOAN extends com.plaid.link.result.LinkAccountType {
        public static final com.plaid.link.result.LinkAccountType.LOAN INSTANCE = new com.plaid.link.result.LinkAccountType.LOAN();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.LOAN> CREATOR = new com.plaid.link.result.LinkAccountType.LOAN.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.LOAN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.LOAN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountType.LOAN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.LOAN[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.LOAN[i];
            }
        }

        private LOAN() {
            super("loan", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$OTHER;", "Lcom/plaid/link/result/LinkAccountType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OTHER extends com.plaid.link.result.LinkAccountType {
        public static final com.plaid.link.result.LinkAccountType.OTHER INSTANCE = new com.plaid.link.result.LinkAccountType.OTHER();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.OTHER> CREATOR = new com.plaid.link.result.LinkAccountType.OTHER.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.OTHER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.OTHER createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkAccountType.OTHER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.OTHER[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.OTHER[i];
            }
        }

        private OTHER() {
            super("other", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/plaid/link/result/LinkAccountType$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountType;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkAccountType {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.UNKNOWN> CREATOR = new com.plaid.link.result.LinkAccountType.UNKNOWN.Creator();
        private final java.lang.String name;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountType.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkAccountType.UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountType.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountType.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.link.result.LinkAccountType.UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.plaid.link.result.LinkAccountType.UNKNOWN) other).name);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
        }
    }
}
