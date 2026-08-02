package androidx.work;

/* loaded from: classes.dex */
public class SystemClock implements androidx.work.Clock {
    @Override // androidx.work.Clock
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
