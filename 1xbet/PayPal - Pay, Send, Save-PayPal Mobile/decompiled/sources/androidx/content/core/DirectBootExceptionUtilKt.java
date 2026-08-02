package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "parentDirPath", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "wrapExceptionIfDueToDirectBoot", "(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;", "", "", "isDeviceUnlocked", "(Ljava/lang/Throwable;)Z", "", "getHighSpeedVideoSizes", "()I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DirectBootExceptionUtilKt {
    public static final java.lang.Exception wrapExceptionIfDueToDirectBoot(java.lang.String str, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if (isDeviceUnlocked(exc) || str == null) {
            return exc;
        }
        java.io.File file = new java.io.File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exc;
        } catch (java.io.IOException unused) {
            return new androidx.content.core.DirectBootUsageException(exc);
        } finally {
            file.delete();
        }
    }

    public static final boolean isDeviceUnlocked(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method, "");
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sys.user.");
            sb.append(highSpeedVideoSizes);
            sb.append(".ce_available");
            java.lang.Object invoke = method.invoke(null, sb.toString(), "false");
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) invoke, "true");
        } catch (java.lang.Throwable th2) {
            kotlin.ExceptionsKt.addSuppressed(th, th2);
            return false;
        }
    }

    private static final int getHighSpeedVideoSizes() {
        try {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "");
            android.os.Process.myUserHandle().writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return obtain.readInt();
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }
}
