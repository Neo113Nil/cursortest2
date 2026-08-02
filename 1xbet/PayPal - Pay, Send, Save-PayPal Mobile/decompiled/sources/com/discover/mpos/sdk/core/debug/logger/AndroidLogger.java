package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/AndroidLogger;", "Lcom/discover/mpos/sdk/core/debug/logger/Logger;", "", "Lcom/discover/mpos/sdk/core/debug/logger/MessageType;", "", "map", "<init>", "(Ljava/util/Map;)V", "", "logPriority", "", "tag", "message", "", "logExtraLong", "(ILjava/lang/String;Ljava/lang/String;)V", "isEnabled", "setDebugEnabled", "(Z)V", "setErrorEnabled", "setInfoEnabled", "Lcom/discover/mpos/sdk/core/debug/logger/Message;", "show", "(Lcom/discover/mpos/sdk/core/debug/logger/Message;)V", "Ljava/util/Map;", "Companion"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class AndroidLogger implements com.discover.mpos.sdk.core.debug.logger.Logger {
    private static final int MAX_LOG_LENGTH = 4000;
    private final java.util.Map<com.discover.mpos.sdk.core.debug.logger.MessageType, java.lang.Boolean> map;

    public AndroidLogger(java.util.Map<com.discover.mpos.sdk.core.debug.logger.MessageType, java.lang.Boolean> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.map = map;
    }

    public /* synthetic */ AndroidLogger(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.discover.mpos.sdk.core.debug.logger.MessageType.DEBUG, java.lang.Boolean.TRUE), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.debug.logger.MessageType.INFO, java.lang.Boolean.TRUE), kotlin.TuplesKt.to(com.discover.mpos.sdk.core.debug.logger.MessageType.ERROR, java.lang.Boolean.TRUE)) : map);
    }

    @Override // com.discover.mpos.sdk.core.debug.logger.Logger
    public final void show(com.discover.mpos.sdk.core.debug.logger.Message message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.Boolean bool = this.map.get(message.getPriority());
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            java.lang.String tag = message.getTag();
            java.lang.String messageText = message.getMessageText();
            int logPriority = message.getPriority().logPriority();
            if (messageText.length() < 4000) {
                return;
            }
            logExtraLong(logPriority, tag, messageText);
        }
    }

    private final void logExtraLong(int logPriority, java.lang.String tag, java.lang.String message) {
        int length = message.length();
        int i = 0;
        while (i < length) {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) message, '\n', i, false, 4, (java.lang.Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            do {
                i = java.lang.Math.min(indexOf$default, i + 4000);
                if (message == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } while (i < indexOf$default);
            i++;
        }
    }

    public final void setDebugEnabled(boolean isEnabled) {
        this.map.put(com.discover.mpos.sdk.core.debug.logger.MessageType.DEBUG, java.lang.Boolean.valueOf(isEnabled));
    }

    public final void setInfoEnabled(boolean isEnabled) {
        this.map.put(com.discover.mpos.sdk.core.debug.logger.MessageType.INFO, java.lang.Boolean.valueOf(isEnabled));
    }

    public final void setErrorEnabled(boolean isEnabled) {
        this.map.put(com.discover.mpos.sdk.core.debug.logger.MessageType.ERROR, java.lang.Boolean.valueOf(isEnabled));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
