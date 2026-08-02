package com.discover.mpos.sdk.core.emv.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/tlv/TlvContentStringifier;", "", "<init>", "(Ljava/lang/String;I)V", "", "source", "", "stringify", "([B)Ljava/lang/String;", "Companion", "HEX_STRING", "ASCII_STRING"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum TlvContentStringifier {
    HEX_STRING { // from class: com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.HEX_STRING
        @Override // com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier
        public final java.lang.String stringify(byte[] source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(source);
        }
    },
    ASCII_STRING { // from class: com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.ASCII_STRING
        @Override // com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier
        public final java.lang.String stringify(byte[] source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new java.lang.String(source, kotlin.text.Charsets.UTF_8);
        }
    };


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.Companion INSTANCE;
    private static final java.util.Map<java.lang.String, com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier> stringifiersMap;

    public abstract java.lang.String stringify(byte[] source);

    /* synthetic */ TlvContentStringifier(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/tlv/TlvContentStringifier$Companion;", "", "<init>", "()V", "", "tag", "Lcom/discover/mpos/sdk/core/emv/tlv/TlvContentStringifier;", "stringifierForTag", "(Ljava/lang/String;)Lcom/discover/mpos/sdk/core/emv/tlv/TlvContentStringifier;", "", "stringifiersMap", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier stringifierForTag(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier tlvContentStringifier = (com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier) com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.stringifiersMap.get(tag);
            return tlvContentStringifier == null ? com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.HEX_STRING : tlvContentStringifier;
        }
    }

    static {
        com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier tlvContentStringifier = HEX_STRING;
        com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier tlvContentStringifier2 = ASCII_STRING;
        INSTANCE = new com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.Companion(null);
        stringifiersMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag(), tlvContentStringifier), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag(), tlvContentStringifier), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.PROCESSING_OPTIONS_DATA_OBJECT_LIST_PDOL.getTag(), tlvContentStringifier), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_LABEL.getTag(), tlvContentStringifier2), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.LANGUAGE_PREFERENCE.getTag(), tlvContentStringifier2), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_DEDICATED_FILE_ADF_NAME.getTag(), tlvContentStringifier), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.KERNEL_ID.getTag(), tlvContentStringifier), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PREFERRED_NAME.getTag(), tlvContentStringifier2));
    }
}
