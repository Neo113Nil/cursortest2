package kotlin.concurrent;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "name", "", "daemon", "Ljava/util/Timer;", "timer", "(Ljava/lang/String;Z)Ljava/util/Timer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TimersKt {
    public static final java.util.Timer timer(java.lang.String str, boolean z) {
        return str == null ? new java.util.Timer(z) : new java.util.Timer(str, z);
    }
}
