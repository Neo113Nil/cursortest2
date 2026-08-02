package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "asString", "Ljava/lang/String;", "getAsString", "()Ljava/lang/String;", "Companion", "NONE", "FOREGROUND", "BACKGROUND", "APPLICATION_LAUNCH"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum RumViewType {
    NONE("NONE"),
    FOREGROUND("FOREGROUND"),
    BACKGROUND("BACKGROUND"),
    APPLICATION_LAUNCH("APPLICATION_LAUNCH");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumViewType.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumViewType.Companion(null);
    private final java.lang.String asString;

    RumViewType(java.lang.String str) {
        this.asString = str;
    }

    public final java.lang.String getAsString() {
        return this.asString;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewType$Companion;", "", "<init>", "()V", "", "string", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "fromString", "(Ljava/lang/String;)Lcom/datadog/android/rum/internal/domain/scope/RumViewType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.internal.domain.scope.RumViewType fromString(java.lang.String string) {
            for (com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType : com.datadog.android.rum.internal.domain.scope.RumViewType.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(rumViewType.getAsString(), string)) {
                    return rumViewType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
