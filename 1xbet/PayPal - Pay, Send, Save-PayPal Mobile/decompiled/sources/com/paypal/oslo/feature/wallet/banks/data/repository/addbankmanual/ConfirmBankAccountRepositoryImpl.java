package com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/addbankmanual/ConfirmBankAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/addbankmanual/ConfirmBankAccountRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "confirmBankAccount", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmBankAccountRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ConfirmBankAccountRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x042d: INVOKE (r1 I:java.lang.Object) = (r12 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:143:0x0422 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0435: INVOKE (r0 I:java.lang.Object) = (r13 I:kotlin.jvm.functions.Function2), (r1 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:334), block:B:145:0x0435 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0157 A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01fc A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0263 A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028f A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a8 A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b3 A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TRY_ENTER, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038a A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03df A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e7 A[Catch: all -> 0x0418, RaiseCancellationException -> 0x0421, TryCatch #2 {RaiseCancellationException -> 0x0421, all -> 0x0418, blocks: (B:11:0x005d, B:13:0x01f6, B:16:0x01fc, B:17:0x023a, B:20:0x024e, B:22:0x0263, B:25:0x026e, B:27:0x028f, B:29:0x0297, B:31:0x029d, B:33:0x02a8, B:37:0x02b3, B:39:0x02ba, B:40:0x02c0, B:43:0x02da, B:44:0x0304, B:49:0x0307, B:51:0x031d, B:53:0x0323, B:55:0x032b, B:59:0x0356, B:67:0x036e, B:68:0x0379, B:70:0x038a, B:72:0x0398, B:73:0x039e, B:75:0x03a4, B:76:0x03aa, B:77:0x03b4, B:79:0x03df, B:81:0x03e7, B:86:0x0371, B:87:0x0374, B:88:0x0377, B:91:0x03ef, B:92:0x0411, B:103:0x0218, B:104:0x0234, B:105:0x0239, B:109:0x0082, B:111:0x008e, B:112:0x0181, B:116:0x00cf, B:118:0x00d3, B:129:0x0123, B:130:0x0128, B:131:0x0129, B:132:0x0131, B:134:0x0157, B:135:0x015d, B:137:0x012c, B:138:0x012f, B:139:0x010f, B:140:0x0412, B:141:0x0417), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.ConfirmBankAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmBankAccount(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams confirmBankAccountParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl$confirmBankAccount$1 confirmBankAccountRepositoryImpl$confirmBankAccount$1;
        ?? r5;
        ?? r12;
        ?? invoke;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.Object obj;
        com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType;
        com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput confirmBankAccountInput;
        java.lang.Object obj2;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.Ior.Both both;
        boolean booleanValue;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType;
        com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmationDetails bankAccountConfirmationDetails;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus status;
        java.lang.Boolean success;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams confirmBankAccountParams2 = confirmBankAccountParams;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl$confirmBankAccount$1) {
                confirmBankAccountRepositoryImpl$confirmBankAccount$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl$confirmBankAccount$1) continuation;
                if ((confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj3 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.isOutputSupportedFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizes;
                    if (r5 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                                return com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl.$r8$lambda$B5ixAtvKbmfCXmt_RWs8oYpUSHs((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError) obj4, (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError) obj5);
                            }
                        };
                        atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                        if (confirmBankAccountParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit) {
                            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit confirmBankAccountUsingRandomDeposit = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit) confirmBankAccountParams2;
                            confirmBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput(confirmBankAccountUsingRandomDeposit.getBankAccountId(), com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION, com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.BankDepositsConfirmationInput(confirmBankAccountUsingRandomDeposit.getDepositAmount1(), confirmBankAccountUsingRandomDeposit.getDepositAmount2(), confirmBankAccountUsingRandomDeposit.getCurrencyCode())), com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE);
                            obj = coroutine_suspended;
                        } else {
                            if (!(confirmBankAccountParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation instantBankAccountConfirmation = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation) confirmBankAccountParams2;
                            java.lang.String instrumentId = instantBankAccountConfirmation.getInstrumentId();
                            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationAction bankAccountConfirmationAction = com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationAction.COMPLETE_INSTANT_CONFIRMATION;
                            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank = instantBankAccountConfirmation.getBank();
                            java.lang.String instrumentId2 = instantBankAccountConfirmation.getInstrumentId();
                            java.lang.String credentialToken = instantBankAccountConfirmation.getCredentialToken();
                            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator = instantBankAccountConfirmation.getAggregator();
                            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow = instantBankAccountConfirmation.getProductFlow();
                            java.lang.String credentialType = instantBankAccountConfirmation.getCredentialType();
                            java.lang.String countryCode = instantBankAccountConfirmation.getCountryCode();
                            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName graphQL = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(aggregator);
                            java.lang.String externalBankId = bank.getExternalBankId();
                            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = bank.getIntegrationType();
                            obj = coroutine_suspended;
                            int i = integrationType == null ? -1 : com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[integrationType.ordinal()];
                            if (i != -1) {
                                if (i == 1) {
                                    bankIntegrationType = com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.HOSTED_URL;
                                } else if (i == 2) {
                                    bankIntegrationType = com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.OAUTH2;
                                } else if (i != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                confirmBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput(instrumentId, bankAccountConfirmationAction, companion.present(new com.paypal.oslo.api.graphql.schema.type.InstantConfirmationInput(instrumentId2, credentialToken, graphQL, externalBankId, companion2.presentIfNotNull(bankIntegrationType), com.apollographql.apollo.api.Optional.INSTANCE.present(credentialType), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(bank.getInternalInstitutionId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(bank.getBankName()), countryCode, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(productFlow == null ? com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(productFlow) : null))), null, null, null, 56, null);
                            }
                            bankIntegrationType = com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.UNKNOWN;
                            confirmBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmBankAccountInput(instrumentId, bankAccountConfirmationAction, companion.present(new com.paypal.oslo.api.graphql.schema.type.InstantConfirmationInput(instrumentId2, credentialToken, graphQL, externalBankId, companion2.presentIfNotNull(bankIntegrationType), com.apollographql.apollo.api.Optional.INSTANCE.present(credentialType), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(bank.getInternalInstitutionId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(bank.getBankName()), countryCode, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(productFlow == null ? com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(productFlow) : null))), null, null, null, 56, null);
                        }
                        com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation confirmBankAccountMutation = new com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation(confirmBankAccountInput);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "GraphQL Input being sent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("params", confirmBankAccountParams2)), null, 4, null);
                        obj2 = "params";
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("confirm_bank_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getInputFormats = confirmBankAccountParams2;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getInputSizeshNQ4ISI = function2;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoSizesFor = atomicReference;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputFormats = defaultRaise;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizeshNQ4ISI = iorRaise;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmBankAccountInput);
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmBankAccountMutation);
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputStallDurationlomOqCM = iorRaise;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.Camera2StreamConfigurationMap = 0;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoFpsRanges = 0;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoSizes = 0;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoFpsRangesFor = 0;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizes = 1;
                        obj3 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, confirmBankAccountMutation, callConfig, confirmBankAccountRepositoryImpl$confirmBankAccount$1);
                        java.lang.Object obj4 = obj;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                        iorRaise2 = iorRaise;
                    } else {
                        if (r5 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoSizes;
                        int i5 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoFpsRanges;
                        int i6 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.Camera2StreamConfigurationMap;
                        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputStallDurationlomOqCM;
                        iorRaise2 = (arrow.core.raise.IorRaise) confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputFormats;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) confirmBankAccountRepositoryImpl$confirmBankAccount$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams confirmBankAccountParams3 = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams) confirmBankAccountRepositoryImpl$confirmBankAccount$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        iorRaise = iorRaise3;
                        confirmBankAccountParams2 = confirmBankAccountParams3;
                        obj2 = "params";
                    }
                    both = (arrow.core.Ior) obj3;
                    if (!(both instanceof arrow.core.Ior.Left)) {
                        both = new arrow.core.Ior.Left(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                    } else if (!(both instanceof arrow.core.Ior.Right)) {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        both = new arrow.core.Ior.Both(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                    }
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                    com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) graphQLData.getData();
                    pairArr[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data == null ? data.getConfirmBankAccount() : null) == null));
                    com.paypal.android.logger.Logger.d$default(logger, "Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.ConfirmBankAccount confirmBankAccount = data2 == null ? data2.getConfirmBankAccount() : null;
                    booleanValue = (confirmBankAccount != null || (success = confirmBankAccount.getSuccess()) == null) ? false : success.booleanValue();
                    com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.BankAccount bankAccount = confirmBankAccount == null ? confirmBankAccount.getBankAccount() : null;
                    if (booleanValue) {
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                        pairArr2[0] = kotlin.TuplesKt.to("bankAccountId", bankAccount != null ? bankAccount.getId() : null);
                        pairArr2[1] = kotlin.TuplesKt.to("success", java.lang.String.valueOf(booleanValue));
                        pairArr2[2] = kotlin.TuplesKt.to("hasBankAccount", java.lang.String.valueOf(bankAccount != null));
                        com.paypal.android.logger.Logger.i$default(logger2, "Confirmation failed - amounts don't match", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        iorRaise2.raise(new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed(null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (bankAccount == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "No bank account returned from API", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj2, confirmBankAccountParams2)), null, 4, null);
                        iorRaise2.raise(new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount(null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                    pairArr3[0] = kotlin.TuplesKt.to("bankAccountId", bankAccount.getId());
                    com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Confirmation confirmation2 = bankAccount.getConfirmation();
                    if (confirmation2 == null || (status = confirmation2.getStatus()) == null || (str = status.getRawValue()) == null) {
                        str = "null";
                    }
                    pairArr3[1] = kotlin.TuplesKt.to("confirmationStatus", str);
                    com.paypal.android.logger.Logger.i$default(logger3, "Bank account confirmed successfully", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                    java.lang.String id = bankAccount.getId();
                    java.lang.String nickname = bankAccount.getNickname();
                    java.lang.String str2 = nickname == null ? "" : nickname;
                    int i7 = com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[bankAccount.getType().ordinal()];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
                        } else if (i7 == 3) {
                            bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
                        } else if (i7 == 4) {
                            bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
                        }
                        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = bankAccountType;
                        java.lang.String lastNChars = bankAccount.getLastNChars();
                        com.paypal.oslo.feature.wallet.banks.domain.model.BankImage bankImage = new com.paypal.oslo.feature.wallet.banks.domain.model.BankImage("", "", "");
                        confirmation = bankAccount.getConfirmation();
                        if (confirmation == null) {
                            java.lang.String rawValue = confirmation.getStatus().getRawValue();
                            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method = confirmation.getMethod();
                            java.lang.String rawValue2 = method != null ? method.getRawValue() : null;
                            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state = confirmation.getState();
                            bankAccountConfirmationDetails = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmationDetails(rawValue, rawValue2, state != null ? state.getRawValue() : null);
                        } else {
                            bankAccountConfirmationDetails = null;
                        }
                        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult(booleanValue, new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount(id, str2, bankAccountType2, lastNChars, bankImage, (java.lang.String) null, bankAccountConfirmationDetails, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null);
                        defaultRaise.complete();
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        java.lang.Object obj5 = atomicReference.get();
                        return obj5 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(confirmBankAccountResult) : new arrow.core.Ior.Both(obj5, confirmBankAccountResult);
                    }
                    bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
                    com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType22 = bankAccountType;
                    java.lang.String lastNChars2 = bankAccount.getLastNChars();
                    com.paypal.oslo.feature.wallet.banks.domain.model.BankImage bankImage2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankImage("", "", "");
                    confirmation = bankAccount.getConfirmation();
                    if (confirmation == null) {
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult2 = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult(booleanValue, new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount(id, str2, bankAccountType22, lastNChars2, bankImage2, (java.lang.String) null, bankAccountConfirmationDetails, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null);
                    defaultRaise.complete();
                    arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj52 = atomicReference.get();
                    if (obj52 != arrow.core.EmptyValue.INSTANCE) {
                    }
                }
            }
            if (r5 != 0) {
            }
            both = (arrow.core.Ior) obj3;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
            com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr4 = new kotlin.Pair[2];
            pairArr4[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data data3 = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) graphQLData2.getData();
            pairArr4[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data3 == null ? data3.getConfirmBankAccount() : null) == null));
            com.paypal.android.logger.Logger.d$default(logger4, "Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
            com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.ConfirmBankAccountMutation.Data) graphQLData2.getData();
            if (data22 == null) {
            }
            if (confirmBankAccount != null) {
            }
            if (confirmBankAccount == null) {
            }
            if (booleanValue) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r5.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, r5);
            arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj6 = r12.get();
            if (obj6 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj6, raisedOrRethrow);
            }
            return new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            r5.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        confirmBankAccountRepositoryImpl$confirmBankAccount$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl$confirmBankAccount$1(this, continuation);
        java.lang.Object obj32 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = confirmBankAccountRepositoryImpl$confirmBankAccount$1.getOutputSizes;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().toString());
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), null, 2, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError $r8$lambda$B5ixAtvKbmfCXmt_RWs8oYpUSHs(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError confirmBankAccountError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError confirmBankAccountError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountError2, "");
        return confirmBankAccountError;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
