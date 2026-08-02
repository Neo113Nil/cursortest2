package com.zettle.sdk.commons;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ#\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/commons/SecureStorage;", "", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "has", "(Ljava/lang/String;)Z", "remove", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "save", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface SecureStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.SecureStorage.Companion INSTANCE = com.zettle.sdk.commons.SecureStorage.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object get(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    boolean has(java.lang.String key);

    java.lang.Object remove(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object save(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/commons/SecureStorage$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/Encryptor;", "encryptor", "Lcom/zettle/sdk/commons/SecureStorage;", "create$core_publicRelease", "(Landroid/content/Context;Lcom/zettle/sdk/commons/Encryptor;)Lcom/zettle/sdk/commons/SecureStorage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.commons.SecureStorage.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.commons.SecureStorage.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.commons.SecureStorage create$core_publicRelease(android.content.Context context, com.zettle.sdk.commons.Encryptor encryptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptor, "");
            return new com.zettle.sdk.commons.SecureStorageImpl(context, encryptor);
        }
    }
}
