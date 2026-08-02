package org.jose4j.lang;

/* loaded from: classes18.dex */
public class ExceptionHelp {
    public static java.lang.String toStringWithCauses(java.lang.Throwable th) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(th);
        while (th.getCause() != null) {
            th = th.getCause();
            sb.append("; caused by: ");
            sb.append(th);
        }
        return sb.toString();
    }

    public static java.lang.String toStringWithCausesAndAbbreviatedStack(java.lang.Throwable th, java.lang.Class cls) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        while (th != null) {
            if (!z) {
                sb.append("; caused by: ");
            }
            sb.append(th);
            sb.append(" at ");
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    java.lang.StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append("...omitted...");
                        break;
                    }
                    sb.append(stackTraceElement);
                    sb.append("; ");
                    i++;
                }
            }
            th = th.getCause();
            z = false;
        }
        return sb.toString();
    }
}
