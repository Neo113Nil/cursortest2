package com.discover.mpos.sdk.cardreader.kernel.flow.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolTags;", "", "()V", "mandatoryTags", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckTag;", "getMandatoryTags", "()Ljava/util/List;", "optionalTags", "getOptionalTags", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.g.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PdolTags {
    public static final com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags c = new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags();

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag> f3151a = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag[]{new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("TTQ Requested", new kotlin.ranges.IntRange(4, 4), com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_TRANSACTION_QUALIFIERS.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Amount Authorized", new kotlin.ranges.IntRange(6, 6), com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_NUMERIC.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Amount other", new kotlin.ranges.IntRange(6, 6), com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_NUMERIC.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Terminal country code", new kotlin.ranges.IntRange(2, 2), com.discover.mpos.sdk.core.emv.tlv.Tag.TERMINAL_COUNTRY_CODE.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Transaction currency code", new kotlin.ranges.IntRange(2, 2), com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_CURRENCY_CODE.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Transaction Date", new kotlin.ranges.IntRange(3, 3), com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_DATE.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Transaction Type", new kotlin.ranges.IntRange(1, 1), com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_TYPE.getTag())});
    public static final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag> b = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag[]{new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Language Preference", new kotlin.ranges.IntRange(2, 8), com.discover.mpos.sdk.core.emv.tlv.Tag.LANGUAGE_PREFERENCE.getTag(), com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags.a.f3152a), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Application Preferred Name", new kotlin.ranges.IntRange(1, 16), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PREFERRED_NAME.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Code Table Index", new kotlin.ranges.IntRange(1, 1), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_CODE_TABLE_INDEX.getTag()), new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag("Log Entry", new kotlin.ranges.IntRange(2, 2), com.discover.mpos.sdk.core.emv.tlv.Tag.LOG_ENTRY.getTag())});

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.g.d$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags.a f3152a = new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags.a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
            return java.lang.Boolean.valueOf(num.intValue() % 2 == 0);
        }

        a() {
            super(1);
        }
    }

    private PdolTags() {
    }
}
