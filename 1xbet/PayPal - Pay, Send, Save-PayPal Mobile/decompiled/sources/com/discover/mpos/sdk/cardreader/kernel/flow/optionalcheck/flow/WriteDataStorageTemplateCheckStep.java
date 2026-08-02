package com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J$\u0010\u0015\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u001a"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/WriteDataStorageTemplateCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckData;", "()V", "areDataStorageUpdatesRequired", "", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "checkDescriptor", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardFeatureDescriptorFromStorageTemplate", "checkIfDataStoreContainsDataObjects", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "isCardFeatureDescriptorAndVersionNumberPresent", "isCardTheSame", "putDataCommand", "dataStoreDataObjects", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "resetDataStorageResults", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class WriteDataStorageTemplateCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> {

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.e$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.b.j().v().a(true);
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.b, 0, null, true, 1);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.e$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3142a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.f3142a, 0, null, true, 1);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f3142a = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> transactionEx) {
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z;
        byte[] content;
        byte[] content2;
        byte[] bArr;
        byte[] content3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        boolean z2 = transactionEx.j().H.d;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z2)};
        if (z2) {
            com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
            j.y = true;
            com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate = j.H;
            java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list = writeDataStorageTemplate.b;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                i = 0;
            } else {
                java.util.Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.WRITE_DATA_STORAGE_TEMPLATE.getTag()) && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            boolean z3 = i == writeDataStorageTemplate.f3217a;
            new java.lang.Object[]{writeDataStorageTemplate};
            new java.lang.Object[]{java.lang.Boolean.valueOf(z3)};
            if (z3) {
                com.discover.mpos.sdk.core.emv.tlv.Tlv t = j.t();
                com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = j.s();
                new java.lang.Object[]{(t == null || (content3 = t.getContent()) == null) ? null : com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content3), s};
                if (s != null && t != null) {
                    com.discover.mpos.sdk.core.emv.tlv.Tlv t2 = j.t();
                    com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s2 = j.s();
                    com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate2 = j.H;
                    java.util.Iterator<T> it2 = writeDataStorageTemplate2.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag())) {
                                break;
                            }
                        }
                    }
                    com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
                    byte[] content4 = tlv != null ? tlv.getContent() : null;
                    com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor = content4 != null ? new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor(content4) : null;
                    java.util.Iterator<T> it3 = writeDataStorageTemplate2.b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it3.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj2).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_VERSION_NUMBER.getTag())) {
                                break;
                            }
                        }
                    }
                    com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj2;
                    if (t2 != null && (content2 = t2.getContent()) != null) {
                        if (tlv2 == null || (bArr = tlv2.getContent()) == null) {
                            bArr = new byte[0];
                        }
                        if (java.util.Arrays.equals(content2, bArr)) {
                            if ((s2 != null ? s2.getE() : null) != null && cardFeatureDescriptor != null && java.util.Arrays.equals(s2.getE(), cardFeatureDescriptor.getE())) {
                                z = true;
                                new java.lang.Object[]{(tlv2 != null || (content = tlv2.getContent()) == null) ? null : com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content)};
                                new java.lang.Object[]{cardFeatureDescriptor};
                                new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
                                if (z) {
                                    com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult v = j.v();
                                    v.a(false);
                                    new java.lang.Object[]{java.lang.Boolean.valueOf(v.f3139a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH))};
                                    java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list2 = transactionEx.j().H.c;
                                    new java.lang.Object[]{java.lang.Integer.valueOf(list2.size())};
                                    if (list2.isEmpty()) {
                                        com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, true, 1);
                                        return;
                                    } else {
                                        transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.WriteDataStorageTemplateCheckStep.a(list2, transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.WriteDataStorageTemplateCheckStep.b(transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.WriteDataStorageTemplateCheckStep.c(transactionEx));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    new java.lang.Object[]{(tlv2 != null || (content = tlv2.getContent()) == null) ? null : com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content)};
                    new java.lang.Object[]{cardFeatureDescriptor};
                    new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
                    if (z) {
                    }
                }
            }
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, true, 1);
            return;
        }
        com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, true, 1);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.e$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            for (com.discover.mpos.sdk.core.emv.tlv.Tlv tlv : this.b) {
                com.discover.mpos.sdk.card.Card i = this.c.i();
                byte[] content = tlv.getContent();
                if (content == null) {
                    content = new byte[0];
                }
                if (i.b(content).isSuccessful()) {
                    com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult v = this.c.j().v();
                    v.f3139a = new com.discover.mpos.sdk.core.data.ByteInfo((byte) ((com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(v.f3139a.toByte()) & v.b) + 1));
                    com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.DataStorageWriteResult v2 = this.c.j().v();
                    new java.lang.Object[]{java.lang.Integer.valueOf(v2.b & com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(v2.f3139a.toByte()))};
                } else {
                    throw new com.discover.mpos.sdk.exceptions.ApduIOException("IO execution failed of the WriteDataStorage Command for:".concat(java.lang.String.valueOf(tlv)));
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.List list, com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.b = list;
            this.c = transactionEx;
        }
    }
}
