package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/android/entities/CashRegisterTss;", "", "Lcom/zettle/android/entities/TssVersion;", "getVersion", "()Lcom/zettle/android/entities/TssVersion;", "version", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface CashRegisterTss {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.CashRegisterTss.Companion INSTANCE = com.zettle.android.entities.CashRegisterTss.Companion.$$INSTANCE;

    com.zettle.android.entities.TssVersion getVersion();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/android/entities/CashRegisterTss$Companion;", "Lkotlin/Function1;", "Lcom/zettle/android/entities/TssVersion;", "Lcom/zettle/android/entities/CashRegisterTss;", "<init>", "()V", "version", "invoke", "(Lcom/zettle/android/entities/TssVersion;)Lcom/zettle/android/entities/CashRegisterTss;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function1<com.zettle.android.entities.TssVersion, com.zettle.android.entities.CashRegisterTss> {
        static final /* synthetic */ com.zettle.android.entities.CashRegisterTss.Companion $$INSTANCE = new com.zettle.android.entities.CashRegisterTss.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.zettle.android.entities.CashRegisterTss invoke(com.zettle.android.entities.TssVersion version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.zettle.android.entities.CashRegisterTssImpl(version);
        }
    }
}
