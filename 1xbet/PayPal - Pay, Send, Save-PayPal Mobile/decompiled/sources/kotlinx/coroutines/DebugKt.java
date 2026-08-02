package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\" \u0010\u0011\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0012\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"", "resetCoroutineId", "()V", "", "DEBUG_PROPERTY_NAME", "Ljava/lang/String;", "STACKTRACE_RECOVERY_PROPERTY_NAME", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_ON", "DEBUG_PROPERTY_VALUE_OFF", "", "ASSERTIONS_ENABLED", "Z", "getASSERTIONS_ENABLED", "()Z", "DEBUG", "getDEBUG", "RECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES$annotations", "Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugKt {
    private static final boolean ASSERTIONS_ENABLED = false;
    private static final java.util.concurrent.atomic.AtomicLong COROUTINE_ID;
    private static final boolean DEBUG;
    public static final java.lang.String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_ON = "on";
    private static final boolean RECOVER_STACK_TRACES;
    public static final java.lang.String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    public static /* synthetic */ void getRECOVER_STACK_TRACES$annotations() {
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return ASSERTIONS_ENABLED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    static {
        java.lang.String systemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(DEBUG_PROPERTY_NAME);
        if (systemProp != null) {
            int hashCode = systemProp.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("System property 'kotlinx.coroutines.debug' has unrecognized value '");
                sb.append(systemProp);
                sb.append('\'');
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            DEBUG = r0;
            RECOVER_STACK_TRACES = !r0 && kotlinx.coroutines.internal.SystemPropsKt.systemProp(STACKTRACE_RECOVERY_PROPERTY_NAME, true);
            COROUTINE_ID = new java.util.concurrent.atomic.AtomicLong(0L);
        }
        boolean z = false;
        DEBUG = z;
        RECOVER_STACK_TRACES = !z && kotlinx.coroutines.internal.SystemPropsKt.systemProp(STACKTRACE_RECOVERY_PROPERTY_NAME, true);
        COROUTINE_ID = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static final boolean getDEBUG() {
        return DEBUG;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return RECOVER_STACK_TRACES;
    }

    public static final java.util.concurrent.atomic.AtomicLong getCOROUTINE_ID() {
        return COROUTINE_ID;
    }

    public static final void resetCoroutineId() {
        COROUTINE_ID.set(0L);
    }
}
