package Nf;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class c extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19503a = b.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f19503a)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
