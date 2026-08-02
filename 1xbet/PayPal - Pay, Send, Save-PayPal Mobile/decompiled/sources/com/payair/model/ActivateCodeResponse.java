package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/payair/model/ActivateCodeResponse;", "", "", "result", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "UNKNOWN", "SUCCESS", "INCORRECT_CODE", "INCORRECT_CODE_RETRIES_EXCEEDED", "EXPIRED_CODE", "INCORRECT_TAV", "EXPIRED_SESSION"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivateCodeResponse {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.ActivateCodeResponse[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.model.ActivateCodeResponse.Companion INSTANCE;
    private final java.lang.String result;
    public static final com.payair.model.ActivateCodeResponse UNKNOWN = new com.payair.model.ActivateCodeResponse("UNKNOWN", 0, "UNKNOWN");
    public static final com.payair.model.ActivateCodeResponse SUCCESS = new com.payair.model.ActivateCodeResponse("SUCCESS", 1, "SUCCESS");
    public static final com.payair.model.ActivateCodeResponse INCORRECT_CODE = new com.payair.model.ActivateCodeResponse("INCORRECT_CODE", 2, "INCORRECT_CODE");
    public static final com.payair.model.ActivateCodeResponse INCORRECT_CODE_RETRIES_EXCEEDED = new com.payair.model.ActivateCodeResponse("INCORRECT_CODE_RETRIES_EXCEEDED", 3, "INCORRECT_CODE_RETRIES_EXCEEDED");
    public static final com.payair.model.ActivateCodeResponse EXPIRED_CODE = new com.payair.model.ActivateCodeResponse("EXPIRED_CODE", 4, "EXPIRED_CODE");
    public static final com.payair.model.ActivateCodeResponse INCORRECT_TAV = new com.payair.model.ActivateCodeResponse("INCORRECT_TAV", 5, "INCORRECT_TAV");
    public static final com.payair.model.ActivateCodeResponse EXPIRED_SESSION = new com.payair.model.ActivateCodeResponse("EXPIRED_SESSION", 6, "EXPIRED_SESSION");

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/model/ActivateCodeResponse$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/payair/model/ActivateCodeResponse;", "enumByValue$core_release", "(Ljava/lang/String;)Lcom/payair/model/ActivateCodeResponse;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.payair.model.ActivateCodeResponse enumByValue$core_release(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.payair.model.ActivateCodeResponse.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.model.ActivateCodeResponse) obj).result, value)) {
                    break;
                }
            }
            com.payair.model.ActivateCodeResponse activateCodeResponse = (com.payair.model.ActivateCodeResponse) obj;
            return activateCodeResponse == null ? com.payair.model.ActivateCodeResponse.UNKNOWN : activateCodeResponse;
        }

        private Companion() {
        }
    }

    static {
        com.payair.model.ActivateCodeResponse[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new com.payair.model.ActivateCodeResponse.Companion(null);
    }

    private ActivateCodeResponse(java.lang.String str, int i, java.lang.String str2) {
        this.result = str2;
    }

    public static com.payair.model.ActivateCodeResponse[] values() {
        return (com.payair.model.ActivateCodeResponse[]) $VALUES.clone();
    }

    public static com.payair.model.ActivateCodeResponse valueOf(java.lang.String str) {
        return (com.payair.model.ActivateCodeResponse) java.lang.Enum.valueOf(com.payair.model.ActivateCodeResponse.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.ActivateCodeResponse> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.ActivateCodeResponse[] $values() {
        return new com.payair.model.ActivateCodeResponse[]{UNKNOWN, SUCCESS, INCORRECT_CODE, INCORRECT_CODE_RETRIES_EXCEEDED, EXPIRED_CODE, INCORRECT_TAV, EXPIRED_SESSION};
    }
}
