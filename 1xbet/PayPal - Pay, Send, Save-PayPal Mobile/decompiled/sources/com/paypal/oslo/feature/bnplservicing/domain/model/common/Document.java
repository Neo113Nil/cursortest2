package com.paypal.oslo.feature.bnplservicing.domain.model.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document;", "", "", "name", "fileName", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;", "link", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getFileName", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;", "getLink", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;", "getType", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, com.google.common.net.HttpHeaders.LINK}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Document {
    public static final int $stable = 0;
    private final java.lang.String fileName;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type;

    public Document(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.name = str;
        this.fileName = str2;
        this.link = link;
        this.type = type;
    }

    public /* synthetic */ Document(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : link, type);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link getLink() {
        return this.link;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CONTRACT", "CREDIT_SCORE_DISCLOSURE", "ESIGN_CONSENT", "FACILITY_AGREEMENT", "PAYMENT_AUTHORIZATION", "PRIVACY_NOTICE", "SNOOZE_TERMS", "SNOOZE_WITHDRAWAL_RIGHT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type CONTRACT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type CREDIT_SCORE_DISCLOSURE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.Companion INSTANCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type ESIGN_CONSENT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type FACILITY_AGREEMENT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type PAYMENT_AUTHORIZATION;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type PRIVACY_NOTICE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type SNOOZE_TERMS;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type SNOOZE_WITHDRAWAL_RIGHT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type UNKNOWN;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private Type(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("CONTRACT", 0);
            CONTRACT = type;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("CREDIT_SCORE_DISCLOSURE", 1);
            CREDIT_SCORE_DISCLOSURE = type2;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("ESIGN_CONSENT", 2);
            ESIGN_CONSENT = type3;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("FACILITY_AGREEMENT", 3);
            FACILITY_AGREEMENT = type4;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("PAYMENT_AUTHORIZATION", 4);
            PAYMENT_AUTHORIZATION = type5;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type6 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("PRIVACY_NOTICE", 5);
            PRIVACY_NOTICE = type6;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type7 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("SNOOZE_TERMS", 6);
            SNOOZE_TERMS = type7;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type8 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("SNOOZE_WITHDRAWAL_RIGHT", 7);
            SNOOZE_WITHDRAWAL_RIGHT = type8;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type9 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type("UNKNOWN", 8);
            UNKNOWN = type9;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
            getHighSpeedVideoFpsRangesFor = typeArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
            INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.Companion(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type from(java.lang.String value) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type) obj;
                return type == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.UNKNOWN : type;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type[] values() {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;", "", "", "relativePath", "staticUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRelativePath", "getStaticUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "getType", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Link {
        public static final int $stable = 0;
        private final java.lang.String relativePath;
        private final java.lang.String staticUrl;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type;

        public Link(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type) {
            this.relativePath = str;
            this.staticUrl = str2;
            this.type = type;
        }

        public /* synthetic */ Link(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : type);
        }

        public final java.lang.String getRelativePath() {
            return this.relativePath;
        }

        public final java.lang.String getStaticUrl() {
            return this.staticUrl;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type getType() {
            return this.type;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "RELATIVE_PATH", "STATIC_HTML", "STATIC_PDF", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.Companion INSTANCE;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type RELATIVE_PATH;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type STATIC_HTML;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type STATIC_PDF;
            public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type UNKNOWN;
            private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type[] getHighSpeedVideoFpsRanges;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

            private Type(java.lang.String str, int i) {
            }

            static {
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type("RELATIVE_PATH", 0);
                RELATIVE_PATH = type;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type("STATIC_HTML", 1);
                STATIC_HTML = type2;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type("STATIC_PDF", 2);
                STATIC_PDF = type3;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type("UNKNOWN", 3);
                UNKNOWN = type4;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type[] typeArr = {type, type2, type3, type4};
                getHighSpeedVideoFpsRanges = typeArr;
                getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
                INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.Companion(null);
            }

            @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type from(java.lang.String value) {
                    java.lang.Object obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                    java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type) obj).name(), value)) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type) obj;
                    return type == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.UNKNOWN : type;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type[] values() {
                return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type[]) getHighSpeedVideoFpsRanges.clone();
            }

            public static com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type valueOf(java.lang.String str) {
                return (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.class, str);
            }

            public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type> getEntries() {
                return getHighSpeedVideoFpsRangesFor;
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.relativePath;
            java.lang.String str2 = this.staticUrl;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(relativePath=");
            sb.append(str);
            sb.append(", staticUrl=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(type);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.relativePath;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.staticUrl;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = this.type;
            return (((hashCode * 31) + hashCode2) * 31) + (type != null ? type.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.relativePath, link.relativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.staticUrl, link.staticUrl) && this.type == link.type;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link copy(java.lang.String relativePath, java.lang.String staticUrl, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link(relativePath, staticUrl, type);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStaticUrl() {
            return this.staticUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRelativePath() {
            return this.relativePath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = link.relativePath;
            }
            if ((i & 2) != 0) {
                str2 = link.staticUrl;
            }
            if ((i & 4) != 0) {
                type = link.type;
            }
            return link.copy(str, str2, type);
        }

        public Link() {
            this(null, null, null, 7, null);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.fileName;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link = this.link;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Document(name=");
        sb.append(str);
        sb.append(", fileName=");
        sb.append(str2);
        sb.append(", link=");
        sb.append(link);
        sb.append(", type=");
        sb.append(type);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.fileName.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link = this.link;
        return (((((hashCode * 31) + hashCode2) * 31) + (link == null ? 0 : link.hashCode())) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.common.Document)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document document = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Document) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, document.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, document.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, document.link) && this.type == document.type;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document copy(java.lang.String name2, java.lang.String fileName, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document(name2, fileName, link, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.Document copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.common.Document document, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link link, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = document.name;
        }
        if ((i & 2) != 0) {
            str2 = document.fileName;
        }
        if ((i & 4) != 0) {
            link = document.link;
        }
        if ((i & 8) != 0) {
            type = document.type;
        }
        return document.copy(str, str2, link, type);
    }
}
