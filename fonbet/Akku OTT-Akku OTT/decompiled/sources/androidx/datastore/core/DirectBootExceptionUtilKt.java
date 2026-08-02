package androidx.datastore.core;

import android.os.Parcel;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CredentialEntry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000\u001a\b\u0010\n\u001a\u00020\u000bH\u0002\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"wrapExceptionIfDueToDirectBoot", "Ljava/lang/Exception;", "Lkotlin/Exception;", "parentDirPath", "", Constants.EXCEPTION, "isDeviceUnlocked", "", "", "TAG", "primaryUserId", "", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "DirectBootExceptionUtilKt")
/* loaded from: classes.dex */
public final class DirectBootExceptionUtilKt {
    private static final String TAG = "DirectBootExceptionUtil";

    public static final boolean isDeviceUnlocked(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            Object invoke = method.invoke(null, "sys.user." + primaryUserId() + ".ce_available", CredentialEntry.FALSE_STRING);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return Intrinsics.areEqual((String) invoke, CredentialEntry.TRUE_STRING);
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
            return false;
        }
    }

    private static final int primaryUserId() {
        try {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            Process.myUserHandle().writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return obtain.readInt();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Exception wrapExceptionIfDueToDirectBoot(String str, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (isDeviceUnlocked(exception) || str == null) {
            return exception;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exception;
        } catch (IOException unused) {
            return new DirectBootUsageException(exception);
        } finally {
            file.delete();
        }
    }
}
