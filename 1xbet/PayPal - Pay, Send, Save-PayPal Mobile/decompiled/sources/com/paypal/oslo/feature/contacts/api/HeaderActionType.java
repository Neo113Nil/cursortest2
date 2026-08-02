package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", "", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface HeaderActionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.contacts.api.HeaderActionType.Companion INSTANCE = com.paypal.oslo.feature.contacts.api.HeaderActionType.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/HeaderActionType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", "ClearAll", "Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;", "getClearAll", "()Lcom/paypal/oslo/feature/contacts/api/HeaderActionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.contacts.api.HeaderActionType.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.contacts.api.HeaderActionType.Companion();
        private static final com.paypal.oslo.feature.contacts.api.HeaderActionType ClearAll = new com.paypal.oslo.feature.contacts.api.HeaderActionType() { // from class: com.paypal.oslo.feature.contacts.api.HeaderActionType$Companion$ClearAll$1
            public final java.lang.String toString() {
                return "HeaderActionType.ClearAll";
            }
        };

        private Companion() {
        }

        public final com.paypal.oslo.feature.contacts.api.HeaderActionType getClearAll() {
            return ClearAll;
        }
    }
}
