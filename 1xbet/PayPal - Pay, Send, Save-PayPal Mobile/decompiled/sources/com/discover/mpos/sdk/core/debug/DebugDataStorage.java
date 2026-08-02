package com.discover.mpos.sdk.core.debug;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000eJ!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u000b\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/DebugDataStorage;", "", "", "clear", "()V", "", "key", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "obj", "put", "(Ljava/lang/String;Lcom/discover/mpos/sdk/core/emv/EmvData;)V", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;[B)V", "Companion"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface DebugDataStorage {
    public static final java.lang.String AC = "ac_key";
    public static final java.lang.String CONTACTLESS_APPLICATION_NOT_ALLOWED_FLAG = "contactless_application_notAllowed_flag_key";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.debug.DebugDataStorage.Companion INSTANCE = com.discover.mpos.sdk.core.debug.DebugDataStorage.Companion.$$INSTANCE;
    public static final java.lang.String DATA_RECORD = "data_record_key";
    public static final java.lang.String READER_CONTACTLESS_FLOOR_LIMIT_EXCEEDED = "reader_contactless_floor_limit_exceeded_key";
    public static final java.lang.String READER_CVM_REQUIRED_LIMIT_EXCEEDED = "reader_cvm_required_limit_exceeded_flag_key";
    public static final java.lang.String STATUS_CHECK_REQUESTED_FLAG = "status_check_requested_flag_key";
    public static final java.lang.String TSI = "tsi_key";
    public static final java.lang.String TTQ = "ttq_key";
    public static final java.lang.String TTQ_PPI = "ttq_from_ppi";
    public static final java.lang.String TVR = "tvr_key";
    public static final java.lang.String ZERO_AMOUNT_FLAG = "zero_amount_flag_key";

    void clear();

    java.lang.String get(java.lang.String key);

    void put(java.lang.String key, com.discover.mpos.sdk.core.emv.EmvData obj);

    void put(java.lang.String key, boolean obj);

    void put(java.lang.String key, byte[] obj);

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/DebugDataStorage$Companion;", "", "<init>", "()V", "", "AC", "Ljava/lang/String;", "CONTACTLESS_APPLICATION_NOT_ALLOWED_FLAG", "DATA_RECORD", "READER_CONTACTLESS_FLOOR_LIMIT_EXCEEDED", "READER_CVM_REQUIRED_LIMIT_EXCEEDED", "STATUS_CHECK_REQUESTED_FLAG", com.zettle.sdk.commons.network.JsonKt.KEY_TSI, "TTQ", "TTQ_PPI", com.zettle.sdk.commons.network.JsonKt.KEY_TVR, "ZERO_AMOUNT_FLAG"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        static final /* synthetic */ com.discover.mpos.sdk.core.debug.DebugDataStorage.Companion $$INSTANCE = new com.discover.mpos.sdk.core.debug.DebugDataStorage.Companion();
        public static final java.lang.String AC = "ac_key";
        public static final java.lang.String CONTACTLESS_APPLICATION_NOT_ALLOWED_FLAG = "contactless_application_notAllowed_flag_key";
        public static final java.lang.String DATA_RECORD = "data_record_key";
        public static final java.lang.String READER_CONTACTLESS_FLOOR_LIMIT_EXCEEDED = "reader_contactless_floor_limit_exceeded_key";
        public static final java.lang.String READER_CVM_REQUIRED_LIMIT_EXCEEDED = "reader_cvm_required_limit_exceeded_flag_key";
        public static final java.lang.String STATUS_CHECK_REQUESTED_FLAG = "status_check_requested_flag_key";
        public static final java.lang.String TSI = "tsi_key";
        public static final java.lang.String TTQ = "ttq_key";
        public static final java.lang.String TTQ_PPI = "ttq_from_ppi";
        public static final java.lang.String TVR = "tvr_key";
        public static final java.lang.String ZERO_AMOUNT_FLAG = "zero_amount_flag_key";

        private Companion() {
        }
    }
}
