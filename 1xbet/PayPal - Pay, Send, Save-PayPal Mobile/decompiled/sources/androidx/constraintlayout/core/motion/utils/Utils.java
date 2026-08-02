package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class Utils {
    static androidx.constraintlayout.core.motion.utils.Utils.DebugHandle getHighSpeedVideoFpsRangesFor;

    public interface DebugHandle {
        void message(java.lang.String str);
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int i = (int) (f * 255.0f);
        int i2 = (i & (~(i >> 31))) - 255;
        int i3 = (int) (f2 * 255.0f);
        int i4 = (i3 & (~(i3 >> 31))) - 255;
        int i5 = (int) (f3 * 255.0f);
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        int i7 = (int) (f4 * 255.0f);
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (((i2 & (i2 >> 31)) + 255) << 16) | (((i8 & (i8 >> 31)) + 255) << 24) | (((i4 & (i4 >> 31)) + 255) << 8) | ((i6 & (i6 >> 31)) + 255);
    }

    public static void log(java.lang.String str, java.lang.String str2) {
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        printStream.println(sb.toString());
    }

    public static void loge(java.lang.String str, java.lang.String str2) {
        java.io.PrintStream printStream = java.lang.System.err;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        printStream.println(sb.toString());
    }

    public static void socketSend(java.lang.String str) {
        try {
            java.io.OutputStream outputStream = new java.net.Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (java.io.IOException e) {
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(java.util.Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream.println(sb.toString());
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        int pow = (int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
        int i = (pow & (~(pow >> 31))) - 255;
        int pow2 = (int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
        int i2 = (pow2 & (~(pow2 >> 31))) - 255;
        int pow3 = (int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
        int i3 = (pow3 & (~(pow3 >> 31))) - 255;
        int i4 = (int) (fArr[3] * 255.0f);
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (((i5 & (i5 >> 31)) + 255) << 24) | (((i & (i >> 31)) + 255) << 16) | (((i2 & (i2 >> 31)) + 255) << 8) | ((i3 & (i3 >> 31)) + 255);
    }

    public static void setDebugHandle(androidx.constraintlayout.core.motion.utils.Utils.DebugHandle debugHandle) {
        getHighSpeedVideoFpsRangesFor = debugHandle;
    }

    public static void logStack(java.lang.String str, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int min = java.lang.Math.min(i, stackTrace.length - 1);
        java.lang.String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            java.lang.StringBuilder sb = new java.lang.StringBuilder(".(");
            sb.append(stackTraceElement.getFileName());
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(" ");
            str2 = sb2.toString();
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(str2);
            sb3.append(obj);
            sb3.append(str2);
            printStream.println(sb3.toString());
        }
    }

    public static void log(java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String methodName = stackTraceElement.getMethodName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(methodName);
        sb.append("                  ");
        java.lang.String substring = sb.toString().substring(0, 17);
        java.lang.String substring2 = "    ".substring(java.lang.Integer.toString(stackTraceElement.getLineNumber()).length());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(".(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")");
        sb2.append(substring2);
        sb2.append(substring);
        java.lang.String obj = sb2.toString();
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(" ");
        sb3.append(str);
        printStream.println(sb3.toString());
        androidx.constraintlayout.core.motion.utils.Utils.DebugHandle debugHandle = getHighSpeedVideoFpsRangesFor;
        if (debugHandle != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj);
            sb4.append(" ");
            sb4.append(str);
            debugHandle.message(sb4.toString());
        }
    }
}
