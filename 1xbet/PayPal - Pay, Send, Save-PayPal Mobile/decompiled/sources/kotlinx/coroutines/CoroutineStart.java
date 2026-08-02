package kotlinx.coroutines;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108G¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "receiver", "completion", "", "invoke", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineStart {
    public static final kotlinx.coroutines.CoroutineStart ATOMIC;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlinx.coroutines.CoroutineStart DEFAULT;
    public static final kotlinx.coroutines.CoroutineStart LAZY;
    public static final kotlinx.coroutines.CoroutineStart UNDISPATCHED;
    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void isLazy$annotations() {
    }

    private CoroutineStart(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.CoroutineStart coroutineStart = new kotlinx.coroutines.CoroutineStart("DEFAULT", 0);
        DEFAULT = coroutineStart;
        kotlinx.coroutines.CoroutineStart coroutineStart2 = new kotlinx.coroutines.CoroutineStart("LAZY", 1);
        LAZY = coroutineStart2;
        kotlinx.coroutines.CoroutineStart coroutineStart3 = new kotlinx.coroutines.CoroutineStart("ATOMIC", 2);
        ATOMIC = coroutineStart3;
        kotlinx.coroutines.CoroutineStart coroutineStart4 = new kotlinx.coroutines.CoroutineStart("UNDISPATCHED", 3);
        UNDISPATCHED = coroutineStart4;
        kotlinx.coroutines.CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        getHighResolutionOutputSizeshNQ4ISI = coroutineStartArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(coroutineStartArr);
    }

    public final <R, T> void invoke(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, R receiver, kotlin.coroutines.Continuation<? super T> completion) {
        int i = kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(block, receiver, completion);
            return;
        }
        if (i == 2) {
            kotlin.coroutines.ContinuationKt.startCoroutine(block, receiver, completion);
        } else if (i == 3) {
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUndispatched(block, receiver, completion);
        } else if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static kotlinx.coroutines.CoroutineStart valueOf(java.lang.String str) {
        return (kotlinx.coroutines.CoroutineStart) java.lang.Enum.valueOf(kotlinx.coroutines.CoroutineStart.class, str);
    }

    public static kotlinx.coroutines.CoroutineStart[] values() {
        return (kotlinx.coroutines.CoroutineStart[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.CoroutineStart.values().length];
            try {
                iArr[kotlinx.coroutines.CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlinx.coroutines.CoroutineStart.LAZY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.CoroutineStart> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
