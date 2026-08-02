package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u0011*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/internal/utils/DDCoreSubscription;", "", "T", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "notifyListeners", "(Lkotlin/jvm/functions/Function1;)V", "removeListener", "", "getListenersCount", "()I", "listenersCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DDCoreSubscription<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.internal.utils.DDCoreSubscription.Companion INSTANCE = com.datadog.android.internal.utils.DDCoreSubscription.Companion.getHighSpeedVideoSizes;

    void addListener(T listener);

    int getListenersCount();

    void notifyListeners(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block);

    void removeListener(T listener);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/internal/utils/DDCoreSubscription$Companion;", "", "<init>", "()V", "T", "Lcom/datadog/android/internal/utils/DDCoreSubscription;", "create", "()Lcom/datadog/android/internal/utils/DDCoreSubscription;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.internal.utils.DDCoreSubscription.Companion getHighSpeedVideoSizes = new com.datadog.android.internal.utils.DDCoreSubscription.Companion();

        private Companion() {
        }

        public final <T> com.datadog.android.internal.utils.DDCoreSubscription<T> create() {
            return new com.datadog.android.internal.utils.DDCoreSubscriptionImpl();
        }
    }
}
