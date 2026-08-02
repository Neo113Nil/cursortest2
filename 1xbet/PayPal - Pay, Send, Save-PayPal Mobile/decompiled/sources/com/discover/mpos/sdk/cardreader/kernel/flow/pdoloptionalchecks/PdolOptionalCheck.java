package com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdoloptionalchecks/PdolOptionalCheck;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "filler", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdoloptionalchecks/PdolOptionalFiller;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdoloptionalchecks/PdolOptionalFiller;)V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "getTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "pdolTag", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolTag;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.i.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PdolOptionalCheck implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalFiller f3156a;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/processing/pdol/Pdol;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.i.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.processing.pdol.Pdol, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol) {
            com.discover.mpos.sdk.core.emv.tlv.Tag tag;
            com.discover.mpos.sdk.core.emv.tlv.ValueFormat valueFormat;
            com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol2 = pdol;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdol2, "");
            if (!pdol2.f3272a.f3275a) {
                com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalCheck pdolOptionalCheck = com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalCheck.this;
                com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = this.b;
                com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag = pdol2.f3272a;
                com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = transactionEx.j().a(pdolTag.b);
                if (a2 != null) {
                    com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalFiller pdolOptionalFiller = pdolOptionalCheck.f3156a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolTag, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                    int length = a2.getLength();
                    int i = pdolTag.c;
                    com.discover.mpos.sdk.core.emv.tlv.Tag[] values = com.discover.mpos.sdk.core.emv.tlv.Tag.values();
                    int length2 = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            tag = null;
                            break;
                        }
                        tag = values[i2];
                        if (kotlin.jvm.internal.Intrinsics.areEqual(tag.getTag(), a2.getTag())) {
                            break;
                        }
                        i2++;
                    }
                    if (tag == null || (valueFormat = tag.getFormat()) == null) {
                        valueFormat = com.discover.mpos.sdk.core.emv.tlv.ValueFormat.UNKNOWN;
                    }
                    com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat tlvValueFormat = new com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat(a2, valueFormat);
                    byte[] content = a2.getContent();
                    if ((content != null ? content.length : pdolOptionalFiller.f3158a) == pdolOptionalFiller.f3158a) {
                        tlvValueFormat.getTlv().setContent(new byte[i]);
                        a2 = tlvValueFormat.getTlv();
                    } else if (length < i) {
                        int i3 = com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.c.f3159a[tlvValueFormat.getFormat().ordinal()];
                        if (i3 == 1) {
                            a2 = tlvValueFormat.getTlv();
                            byte[] bArr = new byte[i];
                            byte[] content2 = a2.getContent();
                            if (content2 != null) {
                                kotlin.collections.ArraysKt.copyInto$default(content2, bArr, i - a2.getLength(), 0, 0, 12, (java.lang.Object) null);
                            }
                            a2.setContent(bArr);
                        } else if (i3 == 2) {
                            a2 = tlvValueFormat.getTlv();
                            byte[] bArr2 = new byte[i];
                            kotlin.collections.ArraysKt.fill$default(bArr2, (byte) pdolOptionalFiller.b, 0, i - a2.getLength(), 2, (java.lang.Object) null);
                            byte[] content3 = a2.getContent();
                            if (content3 != null) {
                                kotlin.collections.ArraysKt.copyInto$default(content3, bArr2, i - a2.getLength(), 0, 0, 12, (java.lang.Object) null);
                            }
                            a2.setContent(bArr2);
                        } else {
                            a2 = tlvValueFormat.getTlv();
                            byte[] bArr3 = new byte[i];
                            byte[] content4 = a2.getContent();
                            if (content4 != null) {
                                kotlin.collections.ArraysKt.copyInto$default(content4, bArr3, 0, 0, 0, 14, (java.lang.Object) null);
                            }
                            a2.setContent(bArr3);
                        }
                    } else if (length > i) {
                        if (com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.c.b[tlvValueFormat.getFormat().ordinal()] == 1) {
                            a2 = tlvValueFormat.getTlv();
                            byte[] content5 = a2.getContent();
                            a2.setContent(content5 != null ? kotlin.collections.ArraysKt.copyOfRange(content5, content5.length - i, content5.length) : null);
                        } else {
                            a2 = tlvValueFormat.getTlv();
                            byte[] content6 = a2.getContent();
                            a2.setContent(content6 != null ? kotlin.collections.ArraysKt.copyOfRange(content6, pdolOptionalFiller.f3158a, i) : null);
                        }
                    }
                } else {
                    new java.lang.Object[]{pdolTag.b, java.lang.Integer.valueOf(pdolTag.c)};
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolTag, "");
                    a2 = new com.discover.mpos.sdk.core.emv.tlv.Tlv(pdolTag.b, new byte[pdolTag.c], 0, 0, 12, null);
                }
                pdol2.b = a2.getContent();
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
    }

    private PdolOptionalCheck(com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalFiller pdolOptionalFiller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolOptionalFiller, "");
        this.f3156a = pdolOptionalFiller;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    public /* synthetic */ PdolOptionalCheck() {
        this(new com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalFiller());
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.j().e().a(new com.discover.mpos.sdk.cardreader.kernel.flow.pdoloptionalchecks.PdolOptionalCheck.a(transactionEx));
        transactionEx.t();
    }
}
