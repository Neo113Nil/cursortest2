package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryMapper;", "", "<init>", "()V", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryShadow;", "from", "Lcom/zettle/android/entities/TransactionConfigEntry;", "map", "(Lcom/zettle/sdk/core/user/shadow/TransactionConfigEntryShadow;)Lcom/zettle/android/entities/TransactionConfigEntry;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionConfigEntryMapper {
    public final com.zettle.android.entities.TransactionConfigEntry map(com.zettle.sdk.core.user.shadow.TransactionConfigEntryShadow from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return com.zettle.android.entities.TransactionConfigEntry.INSTANCE.invoke(from.getMinTransactionAmount(), from.getMaxTransactionAmount(), from.getCardHolderEntryPanRegex());
    }
}
