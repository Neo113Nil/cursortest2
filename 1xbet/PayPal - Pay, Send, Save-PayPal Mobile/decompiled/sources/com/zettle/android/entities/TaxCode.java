package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Lcom/zettle/android/entities/TaxCode;", "", "", "getCode", "()Ljava/lang/String;", "code", "getLabel", "label", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TaxCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.TaxCode.Companion INSTANCE = com.zettle.android.entities.TaxCode.Companion.$$INSTANCE;

    java.lang.String getCode();

    java.lang.String getLabel();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/android/entities/TaxCode$Companion;", "Lkotlin/Function2;", "", "Lcom/zettle/android/entities/TaxCode;", "<init>", "()V", "code", "label", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/android/entities/TaxCode;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, com.zettle.android.entities.TaxCode> {
        static final /* synthetic */ com.zettle.android.entities.TaxCode.Companion $$INSTANCE = new com.zettle.android.entities.TaxCode.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final com.zettle.android.entities.TaxCode invoke(java.lang.String code, java.lang.String label) {
            return new com.zettle.android.entities.TaxCodeImpl(code, label);
        }
    }
}
