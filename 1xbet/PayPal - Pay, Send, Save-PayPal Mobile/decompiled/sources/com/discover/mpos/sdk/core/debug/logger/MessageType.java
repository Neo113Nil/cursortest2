package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/MessageType;", "", "<init>", "(Ljava/lang/String;I)V", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "()I", "logPriority", "INFO", "DEBUG", "ERROR"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum MessageType {
    INFO { // from class: com.discover.mpos.sdk.core.debug.logger.MessageType.INFO
        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int logPriority() {
            return 4;
        }

        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int color() {
            return com.discover.mpos.sdk.core.R.color.logInfo;
        }
    },
    DEBUG { // from class: com.discover.mpos.sdk.core.debug.logger.MessageType.DEBUG
        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int logPriority() {
            return 3;
        }

        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int color() {
            return com.discover.mpos.sdk.core.R.color.logDebug;
        }
    },
    ERROR { // from class: com.discover.mpos.sdk.core.debug.logger.MessageType.ERROR
        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int logPriority() {
            return 6;
        }

        @Override // com.discover.mpos.sdk.core.debug.logger.MessageType
        public final int color() {
            return com.discover.mpos.sdk.core.R.color.logError;
        }
    };

    public abstract int color();

    public abstract int logPriority();

    /* synthetic */ MessageType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
